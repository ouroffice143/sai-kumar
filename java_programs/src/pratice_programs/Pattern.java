package pratice_programs;

public class Pattern {

	public static void main(String[] args) {
		for(int i = 1; i < 5; i++) {
			for(int j =4; j > 0; j--)
			{ 
				if(i>=j)
				System.out.print(i+" ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
