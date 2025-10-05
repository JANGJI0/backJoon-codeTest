package backJoonTest;
import java.util.Scanner;
public class Bj40_10811 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // N개의 바구니
		int M = sc.nextInt(); // 몇번의 행동
		
		// 몇개의 바구니 배열(기본값은 0)
		int[] basket = new int[N];
		for(int i = 0; i < N; i++) {
			basket[i] = i + 1;
		}
		
		// m번 작업 반복
		for(int m = 0; m < M; m++) {
			int i = sc.nextInt(); // 시작 바구니
			int j = sc.nextInt(); // 끝 바구니
	
        // 인덱스는 0부터 시작하니까 -1
        i -= 1;
        j -= 1;

        // for문을 써서 절반까지만 뒤집기
        for (int x = 0; x < (j - i + 1) / 2; x++) {
        	// 1 ~5 번 까지의 바꿔주는 횟수
        	// / 2 를 하는 이유는 절반만 바꾸면 전체가 뒤집힘
            int temp = basket[i + x];
            basket[i + x] = basket[j - x];
            basket[j - x] = temp;
            // [i] 가 아닌 [i + x]인 이유는 그 자리만 바꾸면 안되고 역순으로 되어야 하니까
	        }
	    }
		// 결과 출력
		for(int b : basket) {
			System.out.print(b + " ");
		}
		
		// 자원 닫기
		sc.close();
    }
}
