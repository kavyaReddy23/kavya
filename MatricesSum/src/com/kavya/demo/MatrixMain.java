package com.kavya.demo;
import java.util.*;
public class MatrixMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("enter number of rows");
		int rows=sc.nextInt();
		System.out.println("enter number of columns");
		int cols=sc.nextInt();
		int arr[][]=new int[rows][cols];
		int arr1[][]=new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				arr1[i][j]=sc.nextInt();
			}
		}
		
		MatrixSum matrixSum=new MatrixSum();
		
		int c[][]=matrixSum.addMatrix(arr,arr1,rows,cols);
		matrixSum.print(c,rows,cols);
		
		}
		catch(NegativeArraySizeException negativeArrayIndexSize)
		{
			System.out.println("negative Array Size exception caught");
		}
		catch(InputMismatchException inputMismatchException)
		{
			System.out.println("caught input mismatch exception");
		}
		

	}

}
