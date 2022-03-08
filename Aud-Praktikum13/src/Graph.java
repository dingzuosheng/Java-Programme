public class Graph
{
	private static double[][] matrix1 =
	{
		{0.0, 3.0, 0.0, 0.0, 0.0, 0.0},
		{3.0, 0.0, 5.0, 5.0, 0.0, 0.0},
		{0.0, 5.0, 0.0, 5.0, 0.0, 0.0},
		{0.0, 5.0, 5.0, 0.0, 0.0, 0.0},
		{0.0, 0.0, 0.0, 0.0, 5.0, 0.0},
		{0.0, 0.0, 0.0, 0.0, 0.0, 5.0},
	};

	private static double[][] matrix2 =
	{
		{0.0, 5.0, 0.0, 0.0, 0.0, 0.0},
		{0.0, 0.0, 5.0, 5.0, 0.0, 0.0},
		{0.0, 5.0, 0.0, 5.0, 0.0, 0.0},
		{0.0, 5.0, 5.0, 0.0, 0.0, 0.0},
		{0.0, 0.0, 0.0, 0.0, 5.0, 0.0},
		{0.0, 0.0, 0.0, 0.0, 0.0, 5.0},
	};

	private static boolean isSymmetric(final double[][] matrix)
	{
		
		assert(matrix!=null);
		assert(matrix[0]!=null);
		assert(matrix.length==matrix[0].length);
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				if(matrix[i][j]!=matrix[j][i]) {
					return false;
				}
			}
		}
		
		return true;
	}

	private static boolean isTriviallyWeighted(final double[][] matrix)
	{
		assert(matrix!=null);
		assert(matrix[0]!=null);
		assert(matrix.length==matrix[0].length);
		double c=0;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j]!=0) {
					c=matrix[i][j];
				}
			}
		}
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j]!=0&&matrix[i][j]!=c) {
					 return false;
				}
			}
		}
		
		return true;
	}

	public static void main(String[] args)
	{
		System.out.println("isSymmetric: " + isSymmetric(matrix1) + ", " + isSymmetric(matrix2));
		System.out.println("isTriviallyWeighted: " + isTriviallyWeighted(matrix1) + ", " + isTriviallyWeighted(matrix2));
	}
}