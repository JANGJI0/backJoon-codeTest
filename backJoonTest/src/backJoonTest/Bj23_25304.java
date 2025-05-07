package backJoonTest;
// 영수증
// 입력 : 첫째줄에는 X , 둘째 줄에는 N , 이후 N개의 줄에는 각 물건의 가격 a와 개수 b가 공백을 사이에 두고 주어진다
// 출력 : 구매한 물건으 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면 Yes 를 출력한다. 일치하지 않으면 No 를 출력한다.
import java.util.Scanner;
public class Bj23_25304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt(); // 영수증에 적힌 총 금액
		int N = sc.nextInt(); // 종류의 수
		int total = 0; // 실제 계산한 총합을 저장할 변수
		
		// N개의 줄 동안 반복하면서 물건 가격과 개수 입력받기
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt(); // 물건 가격
			int b = sc.nextInt(); // 물건 개수
			
			total += a * b; // 물건 가격 x 개수를 더해서 total에 누적
		}
		
		// 계산한 총합이 처음 입력한 총 금액과 같은지 비교
		if(total == X) {
			System.out.println("Yes"); // 같으면 Yes 출력
		} else {
			System.out.println("No"); // 다르면 No 출력
		}
		
		// 자원 닫기
		sc.close();
		
	}

}
