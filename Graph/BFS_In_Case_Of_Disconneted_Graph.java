import java.util.*;

public class BFS_In_Case_Of_Disconnected_Graph {
    static class Edge {
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));

        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 0, 1));

        graph[2].add(new Edge(2, 1, 1));

        graph[3].add(new Edge(3, 4, 1));

        graph[4].add(new Edge(4, 3, 1));
    }

    public static void bfs(ArrayList<Edge> graph[], int v, boolean visited[], int start) {

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");

            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                if (!visited[e.dest]) {
                    q.add(e.dest);
                    visited[e.dest] = true;
                }
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        boolean visited[] = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                bfs(graph, v, visited, i);
            }
        }
        System.out.println();
    }
}
