package backJoonTest;
import java.util.Scanner;
public class Bj08_10430 {
// (A + B%는 ((A%c) + (B%))%C 와 같을까?
// (A + B%는 ((A%c) x (B%))%C 와 같을까?
// 세 수 A, B, C가 주어졌을 때 위의 네 가지 값을 구하는  프로그램을 작성하시오.
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		
		System.out.println((A + B) % C);
		System.out.println(((A % C) + (B % C)) % C);
		System.out.println((A * B) % C);
		System.out.println(((A % C) * (B % C)) % C);
		
	}

}
