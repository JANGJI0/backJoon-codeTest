package backJoonTest;
// 코딩은 체육과목입니다.
// 입력 : 첫번째 줄에는 문제의 정수 N이 주어진다(4 < N <= 1000; N은 4의 배수)
// 출력 : 혜아가 N바이트 정수까지 저장할 수 있다고 생각하는 정수 자료형의 이름을 출력하여라
import java.util.Scanner;
public class Bj24_25314 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// N 입력받기
		int N = sc.nextInt();
		int count = N / 4; // N을 4로 나눈 값만큼 long을 출력
		
		for(int i = 0; i < count; i++) {
			System.out.print("long "); // 띄어쓰기로 포함해서 출력
		}
		
			System.out.println("int"); // 마지막에 int 출력 (줄바꿈 포함)
			
			// 자원닫기
			sc.close();
		
	}

}
