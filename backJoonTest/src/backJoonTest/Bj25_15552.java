package backJoonTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 빠른 A+B
// 입력 : 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
// 출력 : 각 테스트케이스마가 A+B를 한 줄에 하나씩 순서대로 출력한다.
public class Bj25_15552 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// 빠른 입력을 위한 BufferedReader 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 빠른 출력을 위한 StringBuilder 사용
		StringBuilder sb = new StringBuilder();
		
		// 첫 번째 줄: 테스트 케이스 수 T 입력 받기
		int T = Integer.parseInt(br.readLine());
		
		// T번 반복
		for (int i = 0; i < T; i++) {
			// 한 줄에 A와 B가 공백으로 들어오므로 StringTokenizer 사용
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken()); // 첫 번째 숫자
			int B = Integer.parseInt(st.nextToken()); // 첫 번째 숫자
			sb.append(A + B).append('\n'); // 결과를 StringBuilder에 저장
			
		}
		
		// 한 번에 출력
		System.out.print(sb);
	}

}
