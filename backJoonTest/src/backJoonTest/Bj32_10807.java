package backJoonTest;
/*
 * 개수 세기
 * 문제 : 총 N개의 정수가 주어졌을 때, 정수 v가 몇개 인지 구하는 프로그램을 작성하시오.
 * 입력 : 첫째 줄에 정수의 개수 N(1<=N<=100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어졌다. 셋째 줄에는 찾아려고 하는 정수 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.
 * 출력 : 첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇개 인지 출력한다.
 */

import java.util.Scanner;
public class Bj32_10807 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// n번째 줄 입력
		int N = sc.nextInt();
		
		// N개의 정수를 저장할 배열 선언
		int[] arr = new int[N];
		
		// 배열에 숫자 입력
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 찾고 싶은 숫자 v 입력
		int V = sc.nextInt();
		
		// V의 개수를 세기 위한 변수
		int count = 0;
		
		// 배열을 돌면서 V가 몇 개 있는지 센다
		for(int i = 0; i < N; i++) {
			if(arr[i] == V) {
				count++;
			}
		}
		
		// 결과 출력
		System.out.println(count);
		
		// 자원 닫기
		sc.close();
	}

}
