package com.dest.basics.javaprogram;

import java.util.Scanner;

class MatrixOps{
	int m1[][];
	int m2[][];
	int res [][];
	int size;
	Scanner sc = new Scanner(System.in);
	void CreateMatrix() {
		System.out.println("Enter the size of Matrix:");
		size = sc.nextInt();
		m1 = new int[size][size];
		m2 = new int[size][size];
		System.out.println("Matrices is created");
		System.out.println("==========================");		
	}
	void CollectFirstMatrixData() {
		System.out.println("collecting matrix-1 data..");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				m1[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("matrix-1 is collected");
	}
	void CollectSecondMatrixData() {
		System.out.println("collecting matrix-2 data..");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				m1[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("matrix-2 is collected");
		System.out.println("===========================");
	}
	void Multiply() {
		System.out.println("multiplication operation is started.");
		res = new int[size][size];
		System.out.println("Ready to collect the matrices");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				res[i][j]=0;
				for(int k=0;k<size;k++) {
					res[i][j]=res[i][j]+(m1[i][k]*m2[k][j]);
					
					
				}
			}
		}
		System.out.println("result was stored");
		System.out.println("========================");
	}
	void ShowResult() {
		System.out.println("the resultant matrix is:");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}


	
}

public class MatrixOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixOps mo = new MatrixOps();
		mo.CreateMatrix();
		mo.CollectFirstMatrixData();
		mo.CollectSecondMatrixData();
		mo.Multiply();
		mo.ShowResult();

	}

}
