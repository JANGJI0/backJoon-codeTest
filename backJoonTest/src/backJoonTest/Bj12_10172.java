// 개를 출력한다.
//  |\_/|
//	|q p|   /}
//	( 0 )"""\
//	|"^"`    |
//	||_/=\\__|

package backJoonTest;

public class Bj12_10172 {
	public static void main(String[] args) {
		
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
	}

}
			//고양이를 해서그런지 약간 감이 잡히긴한데 고양이를 안보고는 못했다...
			
			/*
				이스케이프 시퀀스(escape sequences) 란?
			 	Java에서 일련의 문자에 대한 해석을 위해 백슬래시가 앞에 오는 문자를 말한다.
				Java 컴파일러는 특별한 의미가 있는 하나의 단일 문자로 이스케이프 시퀀스를 사용한다
				
					입력	출력
					\t	탭(띄어쓰기) 을 삽입합니다
					\n	새 줄(줄바꿈) 을 삽입합니다
					\r	커서를 맨 앞으로 되돌립니다
					\'	' 를 출력합니다
					\"	" 를 출력합니다
					\	\ 를 출력합니다
			*/