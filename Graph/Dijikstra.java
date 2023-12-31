import java.security.permissions;
import java.util.*;

public class Dijikstra{
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d.int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,3,7));
        graph[1].add(new Edge(1,2,1));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));
    }
    static class Pair implements Comparable<Pair>{
        int n;
        int path;

        public Pair(int n,int path){
            this.n=n;
            this.path=path;
        }
        @override
        public int compareTo(Pair p2){
            return this.path-p2.path;
        }
    }
    public static int[] dijikstra()
}