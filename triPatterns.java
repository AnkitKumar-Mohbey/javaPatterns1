package theLoverChoice;

import java.util.Scanner;

public class triPatterns {
	
	public static void invertedTriPattern(int totalRow) {
		for(int rowNo = 1; rowNo <= totalRow; rowNo++) {
			for(int colNo = 1; colNo <= totalRow - rowNo + 1; colNo++) {
				System.out.print(totalRow - rowNo + 1);
			}
			System.out.println();
		}
	}

	public static void RightAngleTri(int totalRow) {
		for(int rowNo = 1; rowNo <= totalRow; rowNo++) {
			
			for(int space = 1; space <= totalRow - rowNo;space++) {
				System.out.print("_");
			}
			
			for(int colNo = 1; colNo <= rowNo ; colNo++) {
				System.out.print(colNo);
			}
			
			System.out.println();
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to print pattern");
		
		int totalRow = scan.nextInt();
		
		System.out.println("\n Number Triangle Pattern ");
		
		invertedTriPattern(totalRow);
		
		System.out.println("\n Another pattern");
		
		RightAngleTri(totalRow);

	}

}
