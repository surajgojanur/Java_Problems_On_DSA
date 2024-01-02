classCourse_Schedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
            List<List<Integer>> adjList=new ArrayList<>();
            for(int[] prerequisitie:prerequisites){
                adjList.get(prerequisitie[1]).add(prerequisitie[0]);
            }
            //To Track Visted nodes
            int[] Visted=new int[numCourses];

            for(int i=0;i<numCourses;i++){
                if(hasCycle(adjList,Visted,i)){
                    return false;
                }
            }
            return true;
        }
        private boolean hasCycle(List<List<Integer>> adjList,int[] Visted,int course){
            if(Visted[course]==1){
                return true;
            }
            if(Visted[course]==2){
                return false;
            }
            Visted[course]=1;

            for(int nextCourse:adjList.get(course)){
                if(hasCycle(adjList,Visted,nextCourse)){
                    return true;
                }
            }
            Visted[course]=2;
            return false;
        }
    }
