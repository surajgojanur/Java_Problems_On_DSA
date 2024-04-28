class ContinsDublicate{
    public boolean Contins_dublicate(int[] nums){
        Set set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[])
    ContinsDublicate st=new ContinsDublicate();
    int[] array1=[1,2,3,4];
    st.Contins_dublicate(array1);
}