

public class JaggedArray {
	public static void main(String[] args) {
		int y = 6;
		int [][] z= new int[y][y]; 
		int a = z.length;
		int b = z[1].length;
		int count = 0;
		for(int i = 0; i<a; i++) {
			for(int j = 0; j<b; j++) {
				if(j<=i) {
				z[i][j] = count++;
				System.out.print(count+"\t");
				}
			}
			System.out.println();
		}
		
	}
}
