class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        char[] ch=s.toCharArray();
        int end=s.length();
        for(int i=ch.length-1;i>=0;i--){
            if(ch[i]==' '){
            for(int j=i+1;j<end;j++){
                sb.append(ch[j]);
                if(j==end-1 && ch[end-1] != ' '){
                    sb.append(" ");
                }
            }
            end=i;
            }
            
            }
            for(int j=0;j<end;j++){
                sb.append(ch[j]);
            }
            return sb.toString().trim();
        }
    }
