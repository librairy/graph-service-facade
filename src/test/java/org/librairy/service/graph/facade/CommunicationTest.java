package org.librairy.service.graph.facade;

import org.apache.avro.AvroRemoteException;
import org.junit.Test;
import org.librairy.service.graph.facade.model.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @author Badenes Olmedo, Carlos <cbadenes@fi.upm.es>
 */
public class CommunicationTest {

    @Test
    public void exchange() throws InterruptedException, IOException {


        GraphService customService = new GraphService() {


            @Override
            public String newGraph(GraphRequest graph) throws AvroRemoteException {
                return "http://graph.uri";
            }

            @Override
            public GraphInfo getGraph(String id) throws AvroRemoteException {
                return GraphInfo.newBuilder().setId("id").setDate("201803902").setUrl("http://.").setNodes(Selection.newBuilder().setQuery(Query.newBuilder().build()).build()).setEdges(Selection.newBuilder().setQuery(Query.newBuilder().build()).build()).build();
            }

            @Override
            public List<GraphSummary> listGraphs() throws AvroRemoteException {
                return Arrays.asList(GraphSummary.newBuilder().setId("id").build());
            }

            @Override
            public String removeGraph(String id) throws AvroRemoteException {
                return "http://graph.uri";
            }

            @Override
            public String removeGraphs() throws AvroRemoteException {
                return "http://graph.uri";
            }
        };
        AvroServer server = new AvroServer(customService);

        AvroClient client = new AvroClient();


        String host     = "localhost";
        Integer port    = 65111;

        server.open(host,port);
        client.open(host,port);

        Query nodesQuery = Query.newBuilder().setType("doctopics").setFilter("topic=topic0").build();
        Query edgesQuery = Query.newBuilder().setType("lda+jsd").setFilter("score>0.8").build();
        client.newGraph(GraphRequest.newBuilder().setId("test").setNodes(nodesQuery).setEdges(edgesQuery).setFormat(Format.JSONL).build());

        client.getGraph("test");

        client.listGraphs();

        client.removeGraph("test");

        client.removeGraphs();

        client.close();
        server.close();
    }

}
