package backJoonTest;
/* 최댓값
	문제 : 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
		  예를 들어, 서로 다른 9개의 자연수
		  3, 29, 38, 12, 57, 74, 40, 85, 61
		  이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
	입력 : 첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
	출력 : 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
*/
import java.util.Scanner;
public class Bj35_2562 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 
		int max = 0;	// 최댓값 저장 변수
		int index = 0;	// 최댓값의 위치 저장 변수
		
		// 총 9개의 숫자 입력받음
		for (int i = 1; i <= 9; i++) {
			int num = sc.nextInt(); // 숫자 하나 입력 받기
			
			if  (num > max) {		// 현재 입력된 수가 max보다 크면
					max = num;		// max를 갱신
					index = i;		// 몇 번째 수인지 저장
			}
		}
		
			// 최댓값 출력
			System.out.println(max);
			// 최댓값의 위치 출력
			System.out.println(index);
	}
}
