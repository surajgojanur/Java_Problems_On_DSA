class Solution {
    public int countSubstrings(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(isPal(s,i,j)){
                    count++;
                }
            }
        }
        return count;
    }
   private boolean isPal(String str,int left,int right){
   while(left<right){
    if(str.charAt(left++) != str.charAt(right--)){ 
        return false;
        }
   }
   return true;
   }
}