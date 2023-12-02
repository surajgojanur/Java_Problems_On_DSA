class Decode_Ways {
    public int numDecodings(String s) {
        if(s.length() == 0 || s.charAt(0) == '0') return 0;
        if(s.length() == 1) return 1;
        
        int count1 = 1, count2 = 1;
        for(int i = 1; i < s.length(); ++i){
            int d = s.charAt(i) - '0';
            int dd = (s.charAt(i-1) - '0')*10 + d;
            int count = 0;
            if(d > 0) count += count2;
            if(dd >= 10 && dd <= 26) count += count1;
            count1 = count2;  // prev to prev
            count2 = count;  // count2 prev sol
        }
        return count2;
        //return
    }
}