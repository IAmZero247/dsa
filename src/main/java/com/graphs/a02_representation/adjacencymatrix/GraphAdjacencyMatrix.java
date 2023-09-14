package com.graphs.a02_representation.adjacencymatrix;

import java.util.ArrayList;
import java.util.List;

public class GraphAdjacencyMatrix {

    List<GNode> nodes;
    int [] [] adjacencyMatrix;

    final GraphType type;

    public static enum GraphType{
        DIRECTED,
        UNDIRECTED;
    }

    public GraphAdjacencyMatrix(ArrayList<GNode> nodesList, GraphType type) {
        this.nodes = nodesList;
        adjacencyMatrix = new int [nodesList.size()] [nodesList.size()];
        this.type=type;
    }

    public void addEdges(GNode a , GNode b, int cost){
        //cost cant be zero
        adjacencyMatrix[a.index][b.index]=cost;
        if(type.equals(GraphType.UNDIRECTED)){
            adjacencyMatrix[b.index][a.index]=cost;
        }
        return;
    }

    public void delEdges(GNode a , GNode b){
        adjacencyMatrix[a.index][b.index]=0;
        if(type.equals(GraphType.UNDIRECTED)){
            adjacencyMatrix[b.index][a.index]=0;
        }
        return;
    }


    public void addEdges(int i1 , int i2, int cost){
        //cost cant be zero
        adjacencyMatrix[i1][i2]=cost;
        if(type.equals(GraphType.UNDIRECTED)){
            adjacencyMatrix[i2][i1]=cost;
        }
        return;
    }

    public void delEdges(int i1 , int i2){
        adjacencyMatrix[i1][i2]=0;
        if(type.equals(GraphType.UNDIRECTED)) {
            adjacencyMatrix[i2][i1] = 0;
        }
        return;
    }

    public String printGraphAdjacencyMatrix(){
        StringBuilder sb = new StringBuilder();
        if(nodes ==null || nodes.size()==0){
            return "Graph Is Empty";
        }
        sb.append("\t").append("|\t");
        for(GNode n : nodes){
            sb.append(n.val).append("\t");
        }
        int l = sb.toString().length();
        String seperator="";
        int l1=0;
        while(l1<=l){
            seperator+="--";
            l1++;
        }
        sb.append("\n").append(seperator).append("\n");
        for(int i =0; i<adjacencyMatrix.length ; i++){
            sb.append(nodes.get(i).val).append("\t|").append("\t");
            for(int j =0; j<adjacencyMatrix.length ; j++) {
                sb.append(adjacencyMatrix[i][j]).append("\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    };

    public static class GNode{
        int index;
        String val;

        public GNode(String val, int index) {
            this.index = index;
            this.val = val;
        }
    }
}
