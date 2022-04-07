 package com.kavya.demo;

public class MatrixSum {
	
public int[][] addMatrix(int A[][], int B[][], int rows,int cols)
{
int i, j;
int C[][] = new int[rows][cols];
for (i = 0; i <rows; i++)
{
 for (j = 0; j <cols; j++)
 {
	 
     C[i][j] = A[i][j] + B[i][j];
 }
}
return C;
}
public void print(int M[][],int rows,int cols)
{
for (int i = 0; i < rows; i++) {
for (int j = 0; j < cols; j++)
{
System.out.print(M[i][j] + " ");
}
System.out.println();
}
}
}


