class OrangesRotting_LeetCode {
    public int orangesRotting(int[][] grid) {
        // Get the dimensions of the grid
        int m = grid.length; // Number of rows
        int n = grid[0].length; // Number of columns
        
        // Initialize variables
        int freshOranges = 0; // Count of fresh oranges
        Queue<int[]> queue = new LinkedList<>(); // Queue to store rotten oranges' coordinates
        int minutes = 0; // Timer to count minutes
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}}; // Directions to explore adjacent cells
        
        // Iterate through the grid to count fresh oranges and initialize the queue with rotten oranges
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    freshOranges++; // Count fresh oranges
                } else if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j}); // Add rotten oranges' coordinates to the queue
                }
            }
        }
        
        // Process the rotten oranges to infect adjacent fresh oranges
        while (!queue.isEmpty() && freshOranges > 0) {
            int size = queue.size(); // Get the current size of the queue
            
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll(); // Get coordinates of a rotten orange
                
                // Explore adjacent cells (up, down, left, right)
                for (int[] dir : directions) {
                    int x = current[0] + dir[0]; // Calculate adjacent cell's row
                    int y = current[1] + dir[1]; // Calculate adjacent cell's column
                    
                    // Check if the adjacent cell is within the grid and is a fresh orange
                    if (x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == 1) {
                        grid[x][y] = 2; // Mark the adjacent fresh orange as rotten
                        freshOranges--; // Decrement the count of fresh oranges
                        queue.offer(new int[]{x, y}); // Add the newly rotten orange's coordinates to the queue
                    }
                }
            }
            minutes++; // Increment the timer after processing each level of oranges' rotting
        }
        
        // Return the number of minutes if all fresh oranges have been rotten, otherwise return -1
        return freshOranges == 0 ? minutes : -1;
    }
}
