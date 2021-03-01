package searchinsortedmatric;

public class BinaryforMatrixsearch {
	
	public static void find_element(int[][] array, int n, int m, int k) {
		int left=0,right=n-1,mid;// we iterate and find the optimal row to operate in 
		while(left<=right) {
			mid=(left+right)/2;
			//we check below if the elemnt we need is the leftmost or rightmost first
			if(k==array[mid][0]) {
				System.out.println("Element found at("+mid+",0)");
				return;
			}
			if(k==array[mid][m-1]) {
				int pos=m-1;
				System.out.println("Element found at("+mid+","+pos+")");
				return;
			}
			if(k>array[mid][0] && k<array[mid][m-1]) {
				// condition checking if the element exists in the same row we are iterating in 
				binary_search(array, n, m, k, mid);
				return;
			}
			// if we are iterating out of bounds proceed to the rows lesser or greater
			if(k<array[mid][0])
				right=mid-1;
			if(k>array[mid][m-1])
				left=mid+1;
		}
	}
	//x is the row we consider at that moment
	public static void binary_search(int[][] array, int n, int m ,int k,int x) {
		int left=0,right=m-1,mid;
		while(left<=right) {
			mid=(left+right)/2;
			if(array[x][mid]==k)
			{
				System.out.println("Element found at("+x+","+mid+")");
				return;
			}
			if(k<array[x][mid])
				right=mid-1;
			if(k>array[x][mid])
				left=mid+1;
		}
		System.out.println("Not found");
	}
	
	public static void main(String[] args) {
		int n=4,m=5;
		int array[][]= {{0,6,8,9,11},
						{20,22,28,29,31},
						{36,38,50,61,63},
						{64,66,100,122,128}};
		int k=31;
		find_element(array, n, m, k);
	}

}
