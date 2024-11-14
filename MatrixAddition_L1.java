import java.util.Scanner;

public class MatrixAddition_L1 {
    public static void main(String[] args) {
        // Check if N is provided in command line arguments
        if (args.length != 1) {
            System.out.println("Please provide the value of N as a command line argument.");
            return;
        }

        // Read N from command line argument
        int N = Integer.parseInt(args[0]);

        // Create two matrices of order N x N
        int[][] matrix1 = new int[N][N];
        int[][] matrix2 = new int[N][N];
        int[][] resultMatrix = new int[N][N];

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Input for first matrix
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input for second matrix
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Add the two matrices
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Display the result
        System.out.println("Resultant Matrix after Addition:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}