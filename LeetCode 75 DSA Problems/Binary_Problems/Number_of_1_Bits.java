public class Number_of_1_Bits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
    
    while (n != 0) {
        count += n & 1;
        n >>>= 1; // Use unsigned right shift to consider unsigned integers
    }
    
    return count;
    }
}