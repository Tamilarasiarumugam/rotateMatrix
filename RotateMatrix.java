package assignments;

public class RotateMatrix {
	
	public static void rotateMatrix(int[][] arr)
	{
		int n=arr.length;
		System.out.println("original matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			   System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("after rotating matrix");
		for(int i=0;i<n;i++)
		{
			for(int j=n-1;j>=0;j--)
			{
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		rotateMatrix(arr);
	}

}

