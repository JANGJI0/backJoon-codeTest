//(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
//(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

package backJoonTest;
import java.util.Scanner;
public class Bj09_2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		// 우선순위에 주의하여 몫과 나머지 구하는 연산자 활용
		System.out.println(a * (b % 10)); // 472 * (385 % 10) -> 472 * 5 -> 2360
		System.out.println(a * (b % 100 / 10)); // 472 * (385 % 100 / 10) -> 472 * (85 /10) -> 472 * 8 -> 3776
		System.out.println(a * (b / 100)); // 472 * (385 / 100) -> 472 * 3 -> 1416
		System.out.println(a * b); // 472 * 385 -> 181720
	}
}
