

public class Matris {
	//faktoriyer matrix de yapın
	
	public static void main(String[] args) {
		int[][] matrix = {{6,3},{2,12}};
		int[][] matrix2 = {{12,7},{1,4}};
//		showMatrix(matrix);
		
		factMatrix(matrix);
		
	}
	
	public static void sumMatrix(int[][] matrix1,int[][] matrix2) {
		int[][] matrix= new int[matrix1.length][matrix1[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = matrix1[i][j]+matrix2[i][j];
			}
		}
		
		showMatrix(matrix);
	}
	
	public static void perfectNum(int[][] matrix) {
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if(isPerfect(matrix[i][j])) {
					System.out.println(matrix[i][j]+"P");
				}else {
					System.out.println(matrix[i][j]);
				}
			}
		}
	}
	
	public static boolean isPerfect(int num) {
		int total=0;
		for (int i = 1; i < num; i++) {
			if(num%i==0) {
				total+=i;
			}
		}
		if (total==num) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public static void showMatrix(int[][] myMatrix) {
		for (int i = 0; i < myMatrix.length; i++) {
			for (int j = 0; j < myMatrix[i].length; j++) {
				System.out.print(myMatrix[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void factMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				fact(matrix[i][j]);
			}
		}
		
	}
	
	public static void fact(int num) {
		int res =1;
		System.out.print(num+"! = ");
		for (int i = num; i > 0; i--) {
			if (i==1) {
				System.out.print(i+"= ");
			}
			else {
				System.out.print(i+"*");
			}
			
			res*=i;
		}
		System.out.print( res+"\n");
		
		
	}
}
