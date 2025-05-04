package backJoonTest;
// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
// 입력 : 첫째 줄에 n(1 <= n <= 10,000)이 주어진다.
// 출력 : 1부터 n까지 합을 출력한다.
import java.util.Scanner;
public class Bj22_8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 사용자로부터 정수 n 입력받기
		int n = sc.nextInt();
		
		// 자원 닫기
		sc.close();
		
		// 1부터 n까지의 합을 저장할 변수
		int sum = 0;
		
		// 반복문을 이용해 1부터 n까지 반복하여 합 구하기
		for(int i = 1; i <= n; i++) {
			sum += i; 
		}
		
		System.out.println(sum);
	}
}
