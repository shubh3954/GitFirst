package javaSecond;

public class whileLoops {

	public static void main(String[] args) {
		int counter = 0;
		for(int i=3;i>=0;i--) {
			for(int j=i;j>=0;j--) {
				counter++;
				System.out.print(counter);
				System.out.print("\t");
			}
			System.out.println();
		}
		int counter2 = 0;
		
		for(int i =0;i<=3;i++) {
			for(int j=0;j<=i;j++) {
				counter2++;
				System.out.print(counter2);
				System.out.print("\t");
			}
			System.out.println();
		}
	}

	
	
}
