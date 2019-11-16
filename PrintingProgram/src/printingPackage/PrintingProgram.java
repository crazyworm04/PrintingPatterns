package printingPackage;

/**
 * Class for printing a few different patterns and arrangements using 
 * @author Jamie Knott
 */

public class PrintingProgram {

	/**
     * Print a rectangle of stars, with dimensions length and width
     */
	public void printStarsRectangle(int length, int width) {
		if(length < 0 || width < 0) {
			System.out.println("Not possible, please enter a valid number.");
		}
		
		for(int i = 0; i < length; i++) {			
				for(int j = 0; j < width; j++) {
					System.out.print("*");
				}
				System.out.println();
		}
	}
	
	/**
     * Print a staircase of stars, of specified size 
     */
	public void printStarsStaircase(int size) {
		if(size < 0) {
			System.out.println("Not possible, please enter a valid number.");
		}
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
				System.out.println();
		}		
	}
	
	/**
     * Print a staircase of numbers, of specified size,
     * with the row number corresponding to the value printed for that row
     */
	public void printNumberStaircase(int size) {
		if(size < 0) {
			System.out.println("Not possible, please enter a valid number.");
		}
		
		for(int i = 1; i <= size; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(i);
			}
				System.out.println();
		}		
	}
	
	/**
     * Print a staircase of numbers, of specified size,
     * with the numbers printed steadily incremented from 1 
     */
	public void printNumberIncrementStaircase(int size) {
		if(size < 0) {
			System.out.println("Not possible, please enter a valid number.");
		}
		int count = 0;
		for(int i = 1; i <= size; i++) {
			for(int j = 1; j <= i; j++) {
				count++;
				System.out.print(count + " ");
			}
				System.out.println();
		}
	}
	
	/**
     * Print a staircase of numbers, of specified size,
     * with the row number corresponding to the final value printed for that row
     */
	public void printNumberIncrementRowStaircase(int size) {
		if(size < 0) {
			System.out.println("Not possible, please enter a valid number.");
		}
		int count = 0;
		for(int i = 1; i <= size; i++) {
				count = 0;
			for(int j = 1; j <= i; j++) {
				count++;
				System.out.print(count + " ");
			}
				System.out.println();
		}
	}
	
	/**
     * Print a backwards staircase of stars, of specified size
     */
	public void printBackwardsStairsStaircase(int size) {
		if(size < 0) {
			System.out.println("Not possible, please enter a valid number.");
		}
		
		for(int i = 0; i < size; i++) {
			for(int j = size - i; j > 0; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
	}
	
	/**
     * Print an upside down backwards staircase of stars, of specified size
     */
	public void printUpsideDownStarStaircase(int size) {
		if(size < 0) {
			System.out.println("Not possible, enter a valid number.");
		}
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j <= (size - 1) - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}		
	}
	
	/**
     * Print a pyramid of stars, of specified size
     */
	public void printStarPyramid(int size) {
		if(size < 0) {
			System.out.println("Not possible, enter a valid number.");
		}
		
		for(int i = 0; i < size; i++) {
			for(int j = size - i; j > 0; j--) {
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	/**
     * Print an upside down pyramid of stars, of specified size
     */
	public void printUpsideDownStarPyramid(int size) {
		if(size < 0) {
			System.out.println("Not possible, enter a valid number.");
		}
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j <= (size - 1) - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}		
	}
	
	/**
     * Print an upside down pyramid of numbers, of specified size,
     * with the row number matching the row value 
     */
	public void printUpsideDownNumberPyramid(int size) {
		if(size < 0) {
			System.out.println("Not possible, enter a valid number.");
		}
		int count = 0;
		for(int i = 0; i < size; i++) {
			count = 1;
			for(int j = 0; j < i; j++) {
				count++;
				System.out.print(" ");
			}
			for(int j = 0; j <= (size - 1) - i; j++) {
				System.out.print(count + " ");
			}
			System.out.println();
		}		
	}
	
	public static void main(String[] args) {
		
		//PrintingProgram printProg = new PrintingProgram();
		//printProg.;
		
	}
}
