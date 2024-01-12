package com.examQuestions;

import java.util.Scanner;
import java.util.function.Consumer;

//7. Write a Java program to print the following pattern?
public class DiamondPattern {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number to define row and column:");
		int number = scanner.nextInt();
		
		Consumer<Integer> val=(num)->{
			System.out.println("-------------");
			for(int index1=1;index1<=num;index1++)
			{
				for(int index3=0;index3<=num-index1;index3++)
				{
					System.out.print(" ");
				}
				for(int index2=1;index2<=index1;index2++)
				{
                        System.out.print("* ");
					
				}
				System.out.println();
				
			}
			for(int index1=1;index1<num;index1++)
			{
				for(int index3=0;index3<=index1;index3++)
				{
					System.out.print(" ");
				}
				for(int index2=num-1;index2>=index1;index2--)
				{
						System.out.print("* ");
					
				}
				System.out.println();
			}
		};
		val.accept(5);
	}
}