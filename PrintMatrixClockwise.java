public class PrintMatrixClockwise {

    public static void main(String[] args) {
        PrintMatrixClockwise obj = new PrintMatrixClockwise();
        
        int d = args[0];
        int[][] ma = new int[d][d];
        obj.printMatrix(ma);
    }

    public void printCircle(int[][] matrix, int startX, int startY, int endX, int endY) {
    
        // only one column left  
        if (startY == endY) {
            for (int i = startX; i <= endX; i++) {
                System.out.println(matrix[i][endY]);
            }
            return;
        }
        
        // only one row left  
        if (startX == endX) {
            for (int i = startY; i <= endY; i++) {
                System.out.println(matrix[startX][i]);
            }
            return;
        }
        
        //print a circle
        for (int i = startY; i < endY; i++) {
            System.out.println(matrix[startX][i]);
        }
        for (int i = startX; i < endX; i++) {
            System.out.println(matrix[i][endY]);
        }
        for (int i = endY; i > startY; i--) {
            System.out.println(matrix[endX][i]);
        }
        for (int i = endX; i > startX; i--) {
            System.out.println(matrix[i][startY]);
        }

    }

    public void printMatrix(int[][] matrix) {

        if (matrix == null) {
            return;
        }
        int startX = 0;
        int startY = 0;
        int endY = matrix[0].length - 1;
        int endX = matrix.length - 1;

        while ((startX <= endX) && (startY <= endY)) {
            printCircle(matrix, startX, startY, endX, endY);
            startX++;
            startY++;
            endX--;
            endY--;
        }
    }
}
