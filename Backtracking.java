package SortingSearaching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Backtracking {

	public static void main(String[] args) {
		   // Main method
	  
	        int n = 4; // You can change this to any N (e.g., 8 for 8-Queens)

	        // Initialize empty board
	        char[][] board = new char[n][n];
	        for (char[] row : board) {
	            Arrays.fill(row, '.');
	        }

	        // Store all solutions
	        List<List<String>> solutions = new ArrayList<>();

	        // Solve the problem
	        solveNQueens(0, board, solutions);

	        // Print all solutions
	        System.out.println("Total solutions: " + solutions.size());
	        for (List<String> sol : solutions) {
	            for (String row : sol) {
	                System.out.println(row);
	            }
	            System.out.println();
	        }
	    }

	    // Backtracking function
	    static void solveNQueens(int row, char[][] board, List<List<String>> solutions) {
	        int n = board.length;

	        // If all queens are placed
	        if (row == n) {
	            solutions.add(construct(board));
	            return;
	        }

	        // Try placing queen in each column
	        for (int col = 0; col < n; col++) {
	            if (isSafe(board, row, col)) {
	                board[row][col] = 'Q'; // place queen
	                solveNQueens(row + 1, board, solutions); // recursive call
	                board[row][col] = '.'; // backtrack
	            }
	        }
	    }

	    // Safety check: column, upper left diagonal, upper right diagonal
	    static boolean isSafe(char[][] board, int row, int col) {
	        int n = board.length;

	        // Check column
	        for (int i = 0; i < row; i++) {
	            if (board[i][col] == 'Q') return false;
	        }

	        // Check upper left diagonal
	        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
	            if (board[i][j] == 'Q') return false;
	        }

	        // Check upper right diagonal
	        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
	            if (board[i][j] == 'Q') return false;
	        }

	        return true;
	    }

	    // Convert board to List<String>
	    static List<String> construct(char[][] board) {
	        List<String> result = new ArrayList<>();
	        for (char[] row : board) {
	            result.add(new String(row));
	        }
	        return result;
	    }
			
		}
		// TODO Auto-generated method stub


