package com.graphs.a02_representation.adjacencyList;

import java.util.*;

public class GraphAdjacencyListWithCost {

    public static class Edge{
        public int dest;
        public int cost;

        public Edge(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "("+ dest+","+cost +")";
        }
    }

    public int v;
    public List<LinkedList<Edge>> adj;

    public GraphAdjacencyListWithCost(int v) {
        this.v = v;
        adj = new LinkedList<LinkedList<Edge>>() ;
        for(int i=0; i<v; i++){
            adj.add(new LinkedList<Edge>());
        }
    }

    public void addWeightedEgde(int src, int dest, int cost){
        adj.get(src).add( new Edge(dest, cost));
    };
    public void addUnWeightedEgde(int src ,int dest ,int cost){
        Edge edge1 = new Edge(dest, cost);
        Edge edge2 = new Edge(src, cost);
        adj.get(src).add(edge1);
        adj.get(dest).add(edge2);
    };


    public void printGraphAdjacencyMatrix(){
        for(LinkedList<Edge>  item: adj){
           System.out.println(item);
        }
    }



}
