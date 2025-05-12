package backJoonTest;
/*
 	별찍기 - 1
 	문제 : 첫째 줄에는 별 1개, 둘째 줄에는 별2개, N번째 줄에는 별 N개를 찍는 문제
 	입력 : 첫째 줄에 N(1 <= N <= 100)이 주어진다.
 	출력 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 */
import java.util.Scanner;
public class Bj28_2438 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// n번째 줄 입력
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			// i개의 별 출력
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// 줄 바꿈
			System.out.println();
		}
		// 자원닫기
		sc.close();
		
	}

}
