class Solution {
    public String getSmallestString(String s) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<s.length()-1){
            if(Character.getNumericValue(s.charAt(i))%2== Character.getNumericValue(s.charAt(i+1))%2 && s.charAt(i)>s.charAt(i+1)){
                sb.append(s.charAt(i+1));
                sb.append(s.charAt(i));
                i += 2;
                break;
            }
            else{
                sb.append(s.charAt(i));
                i++;
            }
        }
        sb.append(s.substring(i));
        return sb.toString();
    }
}