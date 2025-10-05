package backJoonTest;
import java.util.Scanner;
public class Bj39_10810 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	// 몇개의 바구니
		int M = sc.nextInt();	// 몇번의 행동
		
		// 몇개의 바구니 배열 (기본값은 0)
		int[] basket = new int[N];
		
		//m번 작업 반복
		for(int m = 0;  m < M; m++) {
			int i = sc.nextInt(); // 시작 바구니
			int j = sc.nextInt(); // 끝 바구니
			int k = sc.nextInt(); // 공 넣을 번호
		
		// i부터 j까지 바구니에 k번 공을 넣음
		for(int x = i - 1; x <= j - 1; x++) {
			basket[x] = k;
		}
	}

		// 결과 출력
		for(int b : basket) { // for each문으로 basket 배열에 있는 값을 하나씩 꺼내서, b에 넣고 반복
			System.out.print(b + " ");
		}
		
		// 자원 닫기
		sc.close();
	}
}
