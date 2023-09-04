package com.graphs.a02_representation.adjacencymatrix;


import java.util.ArrayList;


public class GraphTesting {
    public static void main(String[] args) {
        GraphAdjacencyMatrix.GNode a = new GraphAdjacencyMatrix.GNode("A", 0);
        GraphAdjacencyMatrix.GNode b = new GraphAdjacencyMatrix.GNode("B", 1);
        GraphAdjacencyMatrix.GNode c = new GraphAdjacencyMatrix.GNode("C", 2);
        GraphAdjacencyMatrix.GNode d = new GraphAdjacencyMatrix.GNode("D", 3);
        GraphAdjacencyMatrix.GNode e = new GraphAdjacencyMatrix.GNode("E", 4);
        ArrayList<GraphAdjacencyMatrix.GNode> li = new ArrayList<>();
        li.add(a);
        li.add(b);
        li.add(c);
        li.add(d);
        li.add(e);
       GraphAdjacencyMatrix gp = new GraphAdjacencyMatrix(li, GraphAdjacencyMatrix.GraphType.UNDIRECTED);
        gp.addEdges(0,1);
        gp.addEdges(0,2);
        gp.addEdges(0,3);
        gp.addEdges(1,3);
        gp.addEdges(1,4);
        gp.addEdges(2,3);
        gp.addEdges(3,3);
        gp.addEdges(3,4);
        System.out.println(gp.printGraphAdjacencyMatrix());

    }
}
