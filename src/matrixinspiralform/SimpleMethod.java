package matrixinspiralform;
/*
 * TIme complexity O(m*n)
 * Space complexity O(1)
 */
public class SimpleMethod {
	//we will have an index r and c for the initial row and column respectively
	// every row r go from 0 to n-1
	//every column c go from 0 to m-1
	public static void spiralOrder(int m, int n, int[][] a) {
		int r=0,c=0;
		while(r<m && c<n) {
			for(int i=c;i<n;i++) {
				//left to right
				System.out.print(a[r][i]+" ");
			}r++;//present top row eliminated
			for(int j=r;j<m;j++) {
				//top to bottom
				System.out.print(a[j][n-1]+" ");
			}n--;//present right column eliminated
			for(int i=n-1;i>=c;i--) {
				//right to left
				System.out.print(a[m-1][i]+" ");
			}m--;//present bottom row eliminated
			for(int j=m-1;j>=r;j--) {
				//bottom to top
				System.out.print(a[j][c]+" ");
			}c++;//present left column eliminated
		}
	}
	public static void main(String[] args) {
		int row=4;
		int col=4;
		 int a[][] = { { 1, 2, 3, 4 },
                 { 5, 6, 7, 8 },
                 { 9, 10, 11, 12 },
                 { 13, 14, 15, 16 } };

   spiralOrder(row,col,a);

	}

}
