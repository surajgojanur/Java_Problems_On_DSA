class Solution {
    
//suraj    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> st=new HashSet<>();
        
        int max=0;
        int i=0; int j=0;


        while(j<s.length()){
            if(!st.contains(s.charAt(j))){
                st.add(s.charAt(j));
                max=Math.max(max,j-i+1);
                j++;
            }
        else{
            st.remove(s.charAt(i));
            i++;
        }
        }
        return max;
        }
        
    }
