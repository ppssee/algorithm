import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a = num;
		for(int i = 1; i<= num; i++) {

			for(int k=1; k<a; k++) {
				System.out.print(" ");
			}
			for(int s=0; s<i; s++) {
				System.out.print("*");
			}
			a--;
			System.out.println();
		}
		
	}

}
