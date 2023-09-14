package com.graphs.a03_traversing.breadthfirst;

import com.graphs.a02_representation.adjacencyList.GraphAdjacencyListWithCost;

import java.util.LinkedList;

public class BfsUtils {

    public static void main(String[] args) {
        GraphAdjacencyListWithCost gp = new GraphAdjacencyListWithCost(5);
        gp.addUnWeightedEgde(0,1, 1);
        gp.addUnWeightedEgde(0,2 ,1);
        gp.addUnWeightedEgde(1,3, 1);
        gp.addUnWeightedEgde(1,4, 1);
        gp.addUnWeightedEgde(2,3, 1);
        gp.addUnWeightedEgde(3,0, 1);
        gp.addUnWeightedEgde(3,3, 1);
        gp.addUnWeightedEgde(3,4, 1);
        //gp.printGraphAdjacencyMatrix();
        bfs(gp, 0);
        dfs(gp,0, new boolean[gp.v]);
    }

    static void bfs(GraphAdjacencyListWithCost graph ,int start){
        int v= graph.v;
        boolean[] visited = new boolean[v];
        LinkedList<Integer> q = new LinkedList<>(); //Queue
        q.add(start);
        visited[start]=true;
        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr + " ");
            LinkedList<GraphAdjacencyListWithCost.Edge> edges = graph.adj.get(curr);
            for(GraphAdjacencyListWithCost.Edge edge :edges){
                if(visited[edge.dest]==false){
                    visited[edge.dest]=true;
                    q.add(edge.dest);
                }
            }
        }
        System.out.println();
    }


    static void dfs( GraphAdjacencyListWithCost graph ,int curr ,  boolean[] visited ){
        System.out.print(curr + " ");
        visited[curr] =true;
        LinkedList<GraphAdjacencyListWithCost.Edge> edges = graph.adj.get(curr);
        for(GraphAdjacencyListWithCost.Edge edge :edges){
            if(visited[edge.dest]==false ){
                dfs(graph, edge.dest, visited);
            }
        }
    }
}
