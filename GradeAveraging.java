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



