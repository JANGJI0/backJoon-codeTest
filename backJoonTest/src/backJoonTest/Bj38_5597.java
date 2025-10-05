package backJoonTest;

import java.util.Scanner;

public class Bj38_5597 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] n = new int[30]; // 배열 30
		
		for(int i=1; i<=5; i++) { // 1~28번 반복
			int x = sc.nextInt();
			n[x-1] = 1;				// 1이면 제출
		}
		for(int i=0; i<n.length; i++) { // 전체배열까지 반복
			if(n[i]!=1)					// 1이아니면 미제출
				System.out.println(i+1);
		}
		sc.close();
		
	}
}
