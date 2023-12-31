class Clone_Graph{
    private Map<Node,Node> oldToNew=new HashMap<>();
    public Node CloneGraph(Node node){
        if(node==null) return null;
        return dfs(node);
    }
    private Node dfs(Node node){
        if(oldToNew.containKey(node)) return oldToNew.get(node);

        Node copy=new Node(node.val);
        oldToNew.put(node,copy);

        for(Node nei:node.neighbors){
            copy.neighbors.add(dfs(nei));


        }
        return copy;
    }
}