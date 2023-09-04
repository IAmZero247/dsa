package com.graphs.a02_representation.adjacencyList;

import java.util.ArrayList;
import java.util.List;

public class GraphAdjacencyList {

    List<GNode> nodes;


    final GraphType type;

    public static enum GraphType{
        DIRECTED,
        UNDIRECTED;
    }

    public GraphAdjacencyList(ArrayList<GNode> nodesList, GraphType type) {
        this.nodes = nodesList;
        this.type=type;
    }



    public void addEdges(int i1 , int i2){
        GNode node1 = nodes.get(i1);
        GNode node2 = nodes.get(i2);
        node1.neightbours.add(node2);
        if(type.equals(GraphType.UNDIRECTED)) {
            node2.neightbours.add(node1);
        }
        return;
    }

    public void delEdges(int i1 , int i2){
        GNode node1 = nodes.get(i1);
        GNode node2 = nodes.get(i2);
        node1.neightbours.remove(node2);
        if(type.equals(GraphType.UNDIRECTED)) {
            node2.neightbours.remove(node1);
        }
        return;
    }

    public String printGraphAdjacencyMatrix(){
        StringBuilder sb = new StringBuilder();
        if(nodes ==null || nodes.size()==0){
            return "Graph Is Empty";
        }


        for(int i =0; i<nodes.size() ; i++){
            sb.append(nodes.get(i).val).append(":").append("=>");
            List<GNode> neightbours = nodes.get(i).neightbours;
            for(int j =0; j<neightbours.size() ; j++) {
                sb.append(neightbours.get(j).val).append("=>");
            }
            sb.append("\n");
        }
        return sb.toString();
    };

    public static class GNode{
        int index;
        String val;

        List<GNode> neightbours = new ArrayList<>();

        public GNode(String val, int index) {
            this.index = index;
            this.val = val;
        }
    }
}
