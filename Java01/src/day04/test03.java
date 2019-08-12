package day04;

public class test03 {

	public static void main(String[] args) {
		OUT: for(int i=1; i<10; i++) {//원하는 위치로 루프를 탈출할수있음
			for(int j = 2; j<10; j++) {
				//if(j==5) continue;
				//if(j==5) break;
				System.out.printf("%d*%d=%2d |",j,i,i*j);
				
			}
			System.out.println();
		}

	}

}
//이문제는 j와 i의 위치확인이 필요하다!
