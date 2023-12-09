class DFS{
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Graph(0,1,1));
        graph[0].add(new Graph(0,2,1));

        graph[1].add(new Graph(1,0,1));
        graph[1].add(new Graph(1,3,1));

        graph[2].add(new Graph(2,0,1));
        graph[2].add(new Graph(2,4,1));

        graph[3].add(new Graph(3,1,1));
        graph[3].add(new Graph(3,4,1));
        graph[3].add(new Graph(3,5,1));

        graph[4].add(new Graph(4,2,1));
        graph[4].add(new Graph(4,3,1));
        graph[4].add(new Graph(4,5,1));

        graph[5].add(new Graph(5,3,1));
        graph[5].add(new Graph(5,4,1));
        graph[5].add(new Graph(5,6,1));

        graph[6].add(new Graph(6,5,1));
    }
    public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]){
        System.out.print(curr+" ");
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(vis[e.dest]==false){
                dfs(graph,e.dest,vis);
            }
        }

    }
    public static void main(String args[]){
        int v=7;
        ArrayList<Edge> graph[]=new ArrayList[v];

        createGraph(graph);
        dfs(graph,0,vis);
    }
}