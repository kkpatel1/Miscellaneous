import java.util.*;
public class magicSquare {
	static int n;
	static int magic[][];

///////////////////////////////
////Magic Square Constructor///
////That'll generate Magic Square based on 3 cases
////Following function that is asked to show
	public magicSquare(int n) {
		magic = new int[n][n];
		if(n%4==1 || n%4==3)	magic = magicSquareOdd(n);
		else if(n%4==0) magic = magicSquareEvenEven(n);
		else magic = magicSquareOddEven(n);
	}
////Function ends
	int[][] magicSquareOdd(int n, int start) {
		int [][] magicTemp = new int[n][n];
		int col=n/2;
		int row=0;
		for(int i=start; i<(n*n)+start; i++) {
			magicTemp[row--][col++] = i;
			if(row<0) row=n-1;
			if(col>n-1) col=0;
			if(magicTemp[row][col]!=0) {
				if(row==n-1) row=1;
				else row+=2;
				if(col==0) col=n-1;
				else col-=1;
			}
		}
		return magicTemp;
	}
	int[][] magicSquareOdd(int n) {
		return magicSquareOdd(n,1);
	}
	int[][] magicSquareEvenEven(int n) {
		int magicTemp[][] = new int[n][n];
		for(int i=0; i<n/4; i++) {
			for(int j=0; j<n/4; j++) {
				magicTemp[i][j] = -1;
				magicTemp[n-i-1][j] = -1;
				magicTemp[i][n-j-1] = -1;
				magicTemp[n-i-1][n-j-1] = -1;
			}
		}
		for(int i=n/4; i<3*n/4; i++) {
			for(int j=n/4; j<3*n/4; j++) {
				magicTemp[i][j] = -1;
			}
		}
		int front =1;
		int rear = n*n;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(magicTemp[i][j]==-1) magicTemp[i][j] = front;
				else magicTemp[i][j] = rear;
				front++;
				rear--;
			}
		}
		return magicTemp;
	}
	int[][] magicSquareOddEven(int n) {
		int magicTemp[][] = new int[n][n];
		int magic1[][] = magicSquareOdd(n/2,1);
		int magic4[][] = magicSquareOdd(n/2,n*n/4+1);
		int magic2[][] = magicSquareOdd(n/2, n*n/2+1);
		int magic3[][] = magicSquareOdd(n/2, 3*n*n/4+1);
		for(int i=0; i<n/2; i++) {
			for(int j=0; j<n/2; j++) {
				magicTemp[i][j] = magic1[i][j];
				magicTemp[n/2+i][j] = magic3[i][j];
				magicTemp[i][n/2+j] = magic2[i][j];
				magicTemp[n/2+i][n/2+j] = magic4[i][j];
			}
		}
		for(int i=0; i<n/2; i++) {
			for(int j=0; j<n/4; j++) {
				boolean flag=false;
				if(i==n/4) {
					j++;
					flag=true;
				}
				magicTemp[i][j] += magicTemp[n/2+i][j];
				magicTemp[n/2+i][j] = magicTemp[i][j] - magicTemp[n/2+i][j];
				magicTemp[i][j] = magicTemp[i][j] - magicTemp[n/2+i][j];
				if (flag) j--;
			}
		}
		for(int i=0; i<n/2; i++) {
			for(int j=0; j<n/4-1; j++) {
				magicTemp[i][n-j-1] += magicTemp[n/2+i][n-j-1];
				magicTemp[n/2+i][n-j-1] = magicTemp[i][n-j-1] - magicTemp[n/2+i][n-j-1];
				magicTemp[i][n-j-1] = magicTemp[i][n-j-1] - magicTemp[n/2+i][n-j-1];
			}
		}
		return magicTemp;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the order of the magicSquare");
		int n=in.nextInt();
		magicSquare obj = new magicSquare(n);
		int magic1[][] = obj.magic;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(magic1[i][j]+"\t");
			}
			System.out.println();
		}
	}
}