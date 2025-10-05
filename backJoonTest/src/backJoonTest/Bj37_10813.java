package backJoonTest;
/*	공 바꾸기
 *  문제 : 공을 M번 바꾸려는데 바꿀 바구니 2개를 선택하고, 두 바구니에 들어있는 공을 서로 교환한다.
 *  입력 : 첫째 줄에 N이 주어지고, 둘째 줄 부터 M개의 줄에 걸쳐서 공을 교환할 방법이 주어진다. 각 방법은 두 정수 i j 로 이루어져 있으며, i번 바구니와 j번 바구니에 들어있는 공을 교환한다는 뜻
 *  출력 : 1번 바구니부터 N번 바구니에 들어있는 공의 번호를 공백으로 구분해 출력한다.
 *  
 *  
 */
import java.util.Scanner;
public class Bj37_10813 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 바구니 수
		int M = sc.nextInt(); // 교환 횟수
		
		int[] basket = new int[N + 1]; // 바구니 배열 (1번부터 시작하기 위해 N + 1)
		
		// 바구니에 번호와 같은 공을 넣음
		for(int i = 1; i <= N; i++) {
			basket[i] = i;
		}
		
		// N번 공을 교환
		for(int m = 0; m < M; m++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			// 공 교환 (swap)
			int temp = basket[i];
			basket[i] = basket[j];
			basket[j] = temp;
			
		}
		
		// 결과 출력
		for(int i = 1; i <= N; i++) {
			System.out.print(basket[i] + " ");
		}
		
		// 자원닫기
		sc.close();
	}
}
