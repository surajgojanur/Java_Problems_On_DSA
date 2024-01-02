public class Course_Schedule{
    public class Solution{
        public boolean canFinish(int numCourse,int[][] prerequisities){
            List<List<Integer>> adjList=new ArrayList<>();
            for(int[] prerequisitie:prerequisities){
                adjList.get(prerequisitie[1]).add(prerequisitie[0]);
            }
            //To Track Visted nodes
            int[] Visted=new int[numCourse];

            for(int i=0;i<numCourse;i++){
                if(hasCycle(adjList,Visted,i)){
                    return false;
                }
            }
            return true;
        }
        private
    }
}