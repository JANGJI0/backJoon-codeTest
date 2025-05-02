package backJoonTest;
import java.util.Scanner; // java packge의 util 디렉토리 안에 있는 Scanner 클래스를 임포트해서 사용
public class Bj01_1000 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Scanner 객체명 = new Scanner(System.in);
    // System.in이란 사용자로부터 키 입력을 받기 위해 사용함(표준입력)
    // 입력받은 값은 Byte 단위로 읽음
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(a + b);    
    }
}