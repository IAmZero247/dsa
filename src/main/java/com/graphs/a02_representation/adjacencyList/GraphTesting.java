package com.graphs.a02_representation.adjacencyList;




import java.util.ArrayList;


public class GraphTesting {
    public static void main(String[] args) {
        GraphAdjacencyList.GNode a = new GraphAdjacencyList.GNode("A", 0);
        GraphAdjacencyList.GNode b = new GraphAdjacencyList.GNode("B", 1);
        GraphAdjacencyList.GNode c = new GraphAdjacencyList.GNode("C", 2);
        GraphAdjacencyList.GNode d = new GraphAdjacencyList.GNode("D", 3);
        GraphAdjacencyList.GNode e = new GraphAdjacencyList.GNode("E", 4);
        ArrayList<GraphAdjacencyList.GNode> li = new ArrayList<>();
        li.add(a);
        li.add(b);
        li.add(c);
        li.add(d);
        li.add(e);
        GraphAdjacencyList gp = new GraphAdjacencyList(li, GraphAdjacencyList.GraphType.DIRECTED);
        gp.addEdges(0,1);
        gp.addEdges(0,2);
        gp.addEdges(1,3);
        gp.addEdges(1,4);
        gp.addEdges(2,3);
        gp.addEdges(3,0);
        gp.addEdges(3,3);
        gp.addEdges(3,4);
        System.out.println(gp.printGraphAdjacencyMatrix());

    }
}
