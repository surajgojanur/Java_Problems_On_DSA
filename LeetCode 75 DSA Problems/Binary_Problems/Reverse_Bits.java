public class Solution {
    // you need to treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        
        // Iterate over all 32 bits of the integer
        for (int i = 0; i < 32; i++) {
            // Shift result to the left to make space for the next bit
            result <<= 1;

            // Take the last bit of n and add it to result
            result |= (n & 1);

            // Unsigned right shift n to discard the bit we just used
            n >>>= 1;
        }
        
        return result;
    }
}
