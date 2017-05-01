package alKwiliy;

import java.util.Scanner;
/**
 * this program checks the alive and dead cells in a grid and changes them according to the amount of alive cells surrounding it
 * @author Fayez Al-kwiliy
 *01/05/2017
 */
public class Life {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount of alive cells");
		int numAliveCells = sc.nextInt();
		int[][] arr = new int[20][20];
		int [][]newGrid=new int[20][20];
		System.out.println("Please enter the coordinates for the alive cells");
		int x = 0;
		int y = 0;
		String nextDay;
		for (int z = 1; z <= numAliveCells; z++){
			System.out.println("Enter x coordinate between 0-20");
			x = sc.nextInt();
			System.out.println("Enter y coordinate between 0-20");
			y = sc.nextInt();
			arr[x][y] = 1;

		}

		System.out.println("Original:\n\n");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		sc.nextLine();

		do {
			for (int j = 0; j < arr.length; j++) {
				for (int a = 0; a < arr[j].length; a++) {

					if (arr[j][a] == 1){
						if(numberOfAliveNeighbours(arr, j, a) == 2 || numberOfAliveNeighbours(arr, j, a) == 3){
							newGrid[j][a] = 1;
						}
						else{
							newGrid[j][a] = 0;
						}	
					}
					else if (arr[j][a] == 0){
						if(numberOfDeadNeighbours(arr, j, a) == 3){
							newGrid[j][a] = 1;
						}
						else{
							newGrid[j][a] = 0;
						}

					}



				}
			}

			arr = newGrid;



			System.out.println("Next Day:\n\n");
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
			System.out.println("Want to continue to to the next day? (Type 'yes' or 'no')");
			nextDay = sc.nextLine();
		} while (nextDay.equalsIgnoreCase("yes"));
	}



/**
 * This method checks the number alive neighbours surrounding an alive cell
 * @param arr the grid
 * @param a the row
 * @param j the column
 * @return how many alive neighbours there are surrounding the alive cell
 */
	public static int numberOfAliveNeighbours(int[][] arr, int a, int j) {
		int aliveNeighbours = 0;
		//checks the number of cells surrounding it if its not at the edge or the corner
		if (j != 0 && j != 19 && a != 0 && a != 19){
			if (arr[j][a] == 1) {
				if (arr[j - 1][a - 1] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
				if (arr[j][a - 1] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
				if (arr[j + 1][a - 1] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
				if (arr[j - 1][a] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
				if (arr[j + 1][a] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
				if (arr[j - 1][a + 1] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
				if (arr[j][a + 1] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
				if (arr[j + 1][a + 1] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
			}
		}
		//cells at top left corner
		else if (j == 0 && a == 0){
			if (arr[j][a] == 1) {	
				if (arr[j + 1][a] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
				if (arr[j][a + 1] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
				if (arr[j + 1][a + 1] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
			}



		}
		//cells at top right corner
		else if (j == 19 && a == 0){
			if (arr[j][a] == 1) {	
				if (arr[j - 1][a] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
				if (arr[j][a + 1] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
				if (arr[j - 1][a + 1] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
			}


		}
		//cells at bottom left corner
		else if (j == 0 && a == 19){
			if (arr[j][a] == 1) {	
				if (arr[j + 1][a] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
				if (arr[j][a - 1] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
				if (arr[j + 1][a - 1] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
			}
		}


		//cells at bottom right corner
		else if (j == 19 && a == 19){
			if (arr[j][a] == 1) {	
				if (arr[j - 1][a] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
				if (arr[j][a - 1] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
				if (arr[j - 1][a - 1] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
			}

		}
		// cells at top row, not including corners 
		else if (a == 0){
			if (arr[j][a] == 1) {
				if (arr[j - 1][a] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
				if (arr[j + 1][a] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
				if (arr[j - 1][a + 1] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
				if (arr[j][a + 1] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
				if (arr[j + 1][a + 1] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
			}

		}

		// cells at the left edge, not including corners
		else if (j == 0 ){
			if (arr[j][a] == 1) {
				if (arr[j][a - 1] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
				if (arr[j + 1][a - 1] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
				if (arr[j + 1][a] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
				if (arr[j][a + 1] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
				if (arr[j + 1][a + 1] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}


			}


		}
		// cells at the right edge, not including corners
		else if (j == 19){
			if (arr[j][a] == 1) {
				if (arr[j][a - 1] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
				if (arr[j - 1][a - 1] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
				if (arr[j - 1][a] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
				if (arr[j][a + 1] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
				if (arr[j - 1][a + 1] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}


			}


		}

		// cells at bottom row, not including corners 
		else if (a == 19){
			if (arr[j][a] == 1) {
				if (arr[j - 1][a] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
				if (arr[j + 1][a] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
				if (arr[j - 1][a - 1] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
				if (arr[j][a - 1] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
				if (arr[j + 1][a - 1] == 1) {
					aliveNeighbours = aliveNeighbours + 1;
				}
			}


		}



		return aliveNeighbours;
	}


	/**
	 * This method checks the number alive neighbours surrounding a dead cell
	 * @param arr the grid
	 * @param a the row
	 * @param j the column
	 * @return how many alive neighbours there are surrounding the dead cell
	 */
	public static int numberOfDeadNeighbours(int[][] arr, int a, int j) {

		int deadNeighbours = 0;


		//checks the number of cells surrounding it if its not at the edge or the corner
		if (j != 0 && j != 19 && a != 0 && a != 19){
			if (arr[j - 1][a - 1] == 1) {
				deadNeighbours = deadNeighbours + 1;
			}
			if (arr[j][a - 1] == 1) {
				deadNeighbours = deadNeighbours + 1;
			}
			if (arr[j + 1][a - 1] == 1) {
				deadNeighbours = deadNeighbours + 1;
			}
			if (arr[j - 1][a] == 1) {
				deadNeighbours = deadNeighbours + 1;
			}
			if (arr[j + 1][a] == 1) {
				deadNeighbours = deadNeighbours + 1;
			}
			if (arr[j - 1][a + 1] == 1) {
				deadNeighbours = deadNeighbours + 1;
			}
			if (arr[j][a + 1] == 1) {
				deadNeighbours = deadNeighbours + 1;
			}
			if (arr[j + 1][a + 1] == 1) {
				deadNeighbours = deadNeighbours + 1;
			}

		}
		//cells at top left corner
		else if (j == 0 && a == 0){
			if (arr[j][a] == 1) {	
				if (arr[j + 1][a] == 1) {
					deadNeighbours = deadNeighbours + 1;
				}
				if (arr[j][a + 1] == 1) {
					deadNeighbours = deadNeighbours + 1;
				}
				if (arr[j + 1][a + 1] == 1) {
					deadNeighbours = deadNeighbours + 1;
				}
			}



		}
		//cells at top right corner
		else if (j == 19 && a == 0){
			if (arr[j][a] == 1) {	
				if (arr[j - 1][a] == 1) {
					deadNeighbours = deadNeighbours + 1;
				}
				if (arr[j][a + 1] == 1) {
					deadNeighbours = deadNeighbours + 1;
				}
				if (arr[j - 1][a + 1] == 1) {
					deadNeighbours = deadNeighbours + 1;
				}
			}


		}
		//cells at bottom left corner
		else if (j == 0 && a == 19){
			if (arr[j][a] == 1) {	
				if (arr[j + 1][a] == 1) {
					deadNeighbours = deadNeighbours + 1;
				}
				if (arr[j][a - 1] == 1) {
					deadNeighbours = deadNeighbours + 1;
				}
				if (arr[j + 1][a - 1] == 1) {
					deadNeighbours = deadNeighbours + 1;
				}
			}
		}


		//cells at bottom right corner
		else if (j == 19 && a == 19){
			if (arr[j][a] == 1) {	
				if (arr[j - 1][a] == 1) {
					deadNeighbours = deadNeighbours + 1;
				}
				if (arr[j][a - 1] == 1) {
					deadNeighbours = deadNeighbours + 1;
				}
				if (arr[j - 1][a - 1] == 1) {
					deadNeighbours = deadNeighbours + 1;
				}
			}

		}
		// cells at top row, not including corners 
		else if (a == 0){
			if (arr[j][a] == 1) {
				if (arr[j - 1][a] == 1) {
					deadNeighbours = deadNeighbours + 1;
				}
				if (arr[j + 1][a] == 1) {
					deadNeighbours = deadNeighbours + 1;
				}
				if (arr[j - 1][a + 1] == 1) {
					deadNeighbours = deadNeighbours + 1;
				}
				if (arr[j][a + 1] == 1) {
					deadNeighbours = deadNeighbours + 1;
				}
				if (arr[j + 1][a + 1] == 1) {
					deadNeighbours = deadNeighbours + 1;
				}
			}
		}


		// cells at the left edge, not including corners
		else if (j == 0 ){

			if (arr[j][a] == 1) {
				if (arr[j][a - 1] == 1) {
					deadNeighbours = deadNeighbours + 1;
				}
				if (arr[j + 1][a - 1] == 1) {
					deadNeighbours = deadNeighbours + 1;
				}
				if (arr[j + 1][a] == 1) {
					deadNeighbours = deadNeighbours + 1;
				}
				if (arr[j][a + 1] == 1) {
					deadNeighbours = deadNeighbours + 1;
				}
				if (arr[j + 1][a + 1] == 1) {
					deadNeighbours = deadNeighbours + 1;
				}


			}


		}
		// cells at the right edge, not including corners
		else if (j == 19 ){
			if (arr[j][a] == 1) {
				if (arr[j][a - 1] == 1) {
					deadNeighbours = deadNeighbours + 1;
				}
				if (arr[j - 1][a - 1] == 1) {
					deadNeighbours = deadNeighbours + 1;
				}
				if (arr[j - 1][a] == 1) {
					deadNeighbours = deadNeighbours + 1;
				}
				if (arr[j][a + 1] == 1) {
					deadNeighbours = deadNeighbours + 1;
				}
				if (arr[j - 1][a + 1] == 1) {
					deadNeighbours = deadNeighbours + 1;
				}
			}

		}



		// cells at bottom row, not including corners 
		else if (a ==19 ){
			if (arr[j][a] == 1) {
				if (arr[j - 1][a] == 1) {
					deadNeighbours = deadNeighbours + 1;
				}
				if (arr[j + 1][a] == 1) {
					deadNeighbours = deadNeighbours + 1;
				}
				if (arr[j - 1][a - 1] == 1) {
					deadNeighbours = deadNeighbours + 1;
				}
				if (arr[j][a - 1] == 1) {
					deadNeighbours = deadNeighbours + 1;
				}
				if (arr[j + 1][a - 1] == 1) {
					deadNeighbours = deadNeighbours + 1;
				}
			}


		}


		return deadNeighbours;

	}
}
