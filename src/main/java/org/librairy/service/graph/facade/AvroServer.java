package org.librairy.service.graph.facade;

import org.apache.avro.ipc.NettyServer;
import org.apache.avro.ipc.Server;
import org.apache.avro.ipc.specific.SpecificResponder;
import org.librairy.service.graph.facade.model.GraphService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class AvroServer {

    private static final Logger LOG = LoggerFactory.getLogger(AvroServer.class);

    private Server server;
    private final GraphService service;

    public AvroServer(GraphService service){
        this.service = service;
    }



    public void open(String host, Integer port) throws IOException {
        LOG.debug("Trying to start the Graph service at "+host+":"+port);
        server = new NettyServer(new SpecificResponder(GraphService.class, service), new InetSocketAddress(InetAddress.getByName(host),port));
        LOG.info("Graph AVRO server listening at: "+host+":"+port);
    }

    public void close(){
        if (server != null) server.close();
        LOG.info("Graph AVRO server stopped");
    }

}
