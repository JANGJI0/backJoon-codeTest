package backJoonTest;
/*
 * 문제 : 바구니가 N개 있음. 번호는 1번부터 N번까지.
 * 		 M번의 작업을 통해 바구니에 공을 넣음.
 * 		 각 작업은 세 정수 i, j, k로 구성됨
 * 			i번 바구니부터 j번 바구니까지에 k번 번호가 적힌 공을 넣음.
 * 			이미 공이 들어 있어도 새로 덮어씀.
 * 입력 : 첫째 줄 : N M
 * 		 둘째 줄부터 M개 줄: i j k
 * 출력 : 1번 바구니부터 N번까지 바구니에 들어있는 공의 번호를 출력 (공이 안 들어간 바구니는 0)
 */
import java.util.Scanner;
public class Bj36_10810 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();	// 바구니 개수
		int M = sc.nextInt();	// 공을 넣을 횟수
		
		int[] basket = new int[N];	// 바구니 배열(기본값은 0)
		
		// M번 작업 반복
		for(int m = 0; m < M; m++) {
			int i = sc.nextInt();	// 시작 바구니
			int j = sc.nextInt();	// 끝 바구니
			int k = sc.nextInt();	// 넣을 공 번호
			
			// i부터 j까지 바구니에 k번 공을 넣음
			for(int x = i -1; x <= j - 1; x++) {
				basket[x] = k;
			}
		}
		
		// 결과 출력
		for(int b : basket) { // for each 문 -- basket 배열에 있는 값을 하나씩 꺼내서, b에 넣고 반복
			System.out.print(b + " ");
		}
		
		// 자원 닫기
		sc.close();
		
		}

}
