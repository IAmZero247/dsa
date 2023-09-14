package com.graphs.a02_representation.adjacencyList;

import java.util.ArrayList;

public class GraphTestingWithCost {
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
        gp.printGraphAdjacencyMatrix();
    }
}
