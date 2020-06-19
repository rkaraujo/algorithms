package software.renato.algo;

import java.util.*;

/*
There are n cities connected by m flights. Each flight starts from city u and arrives at v with a price w.

Now given all the cities and flights, together with starting city src and the destination dst, your task is to find the cheapest price from src to dst with up to k stops. If there is no such route, output -1.

Example 1:
Input:
n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
src = 0, dst = 2, k = 1
Output: 200
Explanation:
The graph looks like this:


The cheapest price from city 0 to city 2 with at most 1 stop costs 200, as marked red in the picture.

Example 2:
Input:
n = 3, edges = [[0,1,100],[1,2,100],[0,2,500]]
src = 0, dst = 2, k = 0
Output: 500
Explanation:
The graph looks like this:


The cheapest price from city 0 to city 2 with at most 0 stop costs 500, as marked blue in the picture.


Constraints:

The number of nodes n will be in range [1, 100], with nodes labeled from 0 to n - 1.
The size of flights will be in range [0, n * (n - 1) / 2].
The format of each flight will be (src, dst, price).
The price of each flight will be in the range [1, 10000].
k is in the range of [0, n - 1].
There will not be any duplicated flights or self cycles.
 */
public class CheapestFlightsWithinKStops {

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        if (flights.length == 0) {
            return -1;
        }

        Map<Integer, List<Vertex>> mapIdEdges = buildMapIdVertex(flights);

        Queue<VertexCost> minHeapTotalCost = new PriorityQueue<>(Comparator.comparingInt(v -> v.totalCost));
        minHeapTotalCost.add(new VertexCost(src, 0, 0));

        while (!minHeapTotalCost.isEmpty()) {
            VertexCost vCost = minHeapTotalCost.poll();

            if (vCost.vertex == dst) {
                return vCost.totalCost;
            }

            if (vCost.totalVertices - 1 < K) {
                List<Vertex> edges = mapIdEdges.get(vCost.vertex);
                if (edges != null) {
                    for (Vertex e : edges) {
                        int nextTotalVertices = vCost.totalVertices + 1;
                        int nextTotalCost = vCost.totalCost + e.cost;

                        VertexCost nextVertexCost = new VertexCost(e.dst, nextTotalCost, nextTotalVertices);

                        minHeapTotalCost.add(nextVertexCost);
                    }
                }
            }
        }

        return -1;
    }

    private Map<Integer, List<Vertex>> buildMapIdVertex(int[][] flights) {
        Map<Integer, List<Vertex>> mapIdVertex = new HashMap<>();
        for (int i = 0; i < flights.length; i++) {
            int src = flights[i][0];
            int dst = flights[i][1];
            int cost = flights[i][2];

            List<Vertex> edges = mapIdVertex.getOrDefault(src, new ArrayList<>());
            edges.add(new Vertex(src, dst, cost));
            mapIdVertex.put(src, edges);
        }
        return mapIdVertex;
    }

    private static class Vertex {
        int src;
        int dst;
        int cost;

        public Vertex(int src, int dst, int cost) {
            this.src = src;
            this.dst = dst;
            this.cost = cost;
        }
    }

    private static class VertexCost {
        int vertex;
        int totalCost;
        int totalVertices;

        public VertexCost(int vertex, int totalCost, int totalVertices) {
            this.vertex = vertex;
            this.totalCost = totalCost;
            this.totalVertices = totalVertices;
        }
    }

}
