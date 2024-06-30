class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        int y = Math.max(red, blue);
        int z = Math.min(red, blue);
        int u = 1;
        int cnt = 0;
        int fg = 0;
        int ans = 0;

        while (true) {
            if (fg == 0) {
                if (z >= u) {
                    z -= u;
                } else {
                    break;
                }
            } else {
                if (y >= u) {
                    y -= u;
                } else {
                    break;
                }
            }
            u++;
            fg = 1 - fg;
            cnt++;
        }
        ans = Math.max(ans, cnt);

        fg = 1;
        y = Math.max(blue, red);
        z = Math.min(blue, red);
        cnt = 0;
        u = 1;

        while (true) {
            if (fg == 0) {
                if (z >= u) {
                    z -= u;
                } else {
                    break;
                }
            } else {
                if (y >= u) {
                    y -= u;
                } else {
                    break;
                }
            }
            u++;
            fg = 1 - fg;
            cnt++;
        }
        ans = Math.max(ans, cnt);
        return ans;
    }
}