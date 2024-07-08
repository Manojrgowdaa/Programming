 class pattern5 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 1, 1, 1},
            {1, 1, 0, 0, 1},
            {1, 0, 1, 1, 0},
            {1, 0, 0, 1, 1},
            {1, 1, 1, 0, 1}
        };
        
        // Print the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
