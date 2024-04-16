Question 1
package com.assignment1.array;

public class MatrixAddition {
	
	public static void main(String[] args) {
		// Matrix Addition
		
int [][] A = {{4,6,8}, {6,2,7}};
int [][] B = {{5,9,3}, {9,4,1}};

//materixaddition(A, B);

for (int i = 0; i < A.length; i++) {
	for (int j = 0; j < A[0].length; j++) {
	System.out.print(A[i][j] + B[i][j] + "  ");
	
}
System.out.println();
 
 
 }
}}
	

	
  
  
  
Question 2
package com.assignment1.array;
import java.util.Scanner;
public class GradeAveraging {
	public static void main(String[] args)  {
		Scanner x = new Scanner(System.in); 
System.out.print(" How many subjects do you have? ");
int numberSubjects = x.nextInt();

int [] scores = new int [numberSubjects];
double sum = 0;
for (int i = 0; i<scores.length; i++) {
	System.out.print("Enter the score for Subject " + (i+1) + ": ");
	scores[i]=x.nextInt();
	sum = sum +scores[i];
}
	
	double averageGrade = sum/numberSubjects; 
	System.out.print("Average grade: " + averageGrade);
}
	}


