class StringRev{
    public String reverse(String st){
        if(st==null){
            String er="Error";
            return er;
        }
        char[] st2=st.toCharArray();
        StringBuilder st1=new StringBuilder();
        for(int i=st.length()-1;i>=0;i--){
            st1.append(st2[i]);
        }
        return st1.toString();
    }
    public static void main(String args[]){
        StringRev rev=new StringRev();

        String str="Suraj is best";
        String rev1String=rev.reverse(str);
        System.out.println(rev1String);
    }
    
    
}