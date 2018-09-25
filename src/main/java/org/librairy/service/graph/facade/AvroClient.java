package org.librairy.service.graph.facade;

import org.apache.avro.AvroRemoteException;
import org.apache.avro.ipc.NettyTransceiver;
import org.apache.avro.ipc.specific.SpecificRequestor;
import org.librairy.service.graph.facade.model.GraphInfo;
import org.librairy.service.graph.facade.model.GraphRequest;
import org.librairy.service.graph.facade.model.GraphService;
import org.librairy.service.graph.facade.model.GraphSummary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class AvroClient {

    private static final Logger LOG = LoggerFactory.getLogger(AvroClient.class);

    NettyTransceiver client;
    GraphService proxy;

    public void open(String host, Integer port) throws IOException {
        this.client = new NettyTransceiver(new InetSocketAddress(InetAddress.getByName(host),port));
        // client code - attach to the server and send a message
        this.proxy = (GraphService) SpecificRequestor.getClient(GraphService.class, client);
        LOG.info("Client built to " + host+":"+port+", got proxy");
    }

    public void close(){
        if (client != null) client.close();
    }

    public String newGraph(GraphRequest request) throws AvroRemoteException {

        // fill in the Message record and send it
        LOG.debug("Calling proxy.newGraph with message:  \"" + request+ "\"") ;
        CharSequence result = proxy.newGraph(request);
        LOG.debug("Result: " + result);
        return result.toString();
    }

    public GraphInfo getGraph(String id) throws AvroRemoteException {

        // fill in the Message record and send it
        LOG.debug("Calling proxy.getGraph with message:  \"" + id + "\"");
        GraphInfo info = proxy.getGraph(id);
        LOG.debug("Result: " + info);
        return info;
    }

    public List<GraphSummary> listGraphs() throws AvroRemoteException {

        // fill in the Message record and send it
        LOG.debug("Calling proxy.listGraphs");
        List<GraphSummary> result = proxy.listGraphs();
        LOG.debug("Result: " + result);
        return result;
    }

    public String removeGraph(String id) throws AvroRemoteException {

        // fill in the Message record and send it
        LOG.debug("Calling proxy.removeGraph with message: \"" + id + "\"");
        String result = proxy.removeGraph(id);
        LOG.debug("Result: " + result);
        return result;
    }

    public String removeGraphs() throws AvroRemoteException {

        // fill in the Message record and send it
        LOG.debug("Calling proxy.removeGraphs");
        String result = proxy.removeGraphs();
        LOG.debug("Result: " + result);
        return result;
    }
}
