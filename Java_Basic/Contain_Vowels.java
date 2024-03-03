class Contain_Vowels{

    public void check(String a){
        char[] ch=a.toLowerCase.toCharArray();
        for(int i=0;i<a.length();i++){
            if(ch[i]=='a' || ch[i]=='e' ||ch[i]=='i' || ch[i]=='o' || ch[i]=='u' ){
                System.out.println("Yes it contains Vowels = "+a);
                break;
            }
        }
        System.out.println("False it does not contain Vowels");
    }
    public static void main(String args[]) {
        String a = "Suraj";
        Contain_Vowels obja = new Contain_Vowels();
        obja.check(a);
    }
}