package day05;

public class test06 {

	public static void main(String[] args) {

		int[][] t1 = new int[4][];
		t1[0] = new int[4];
		
		System.out.println(t1[0]);
		System.out.println(t1[0][0]);
		
		int[][] t2 = {{1,2,3,4,5},{11,22,33,44,55,66},{12,23}};
		for(int i=0; i< t2.length; i++){
			//System.out.println(t2[i]);
		for(int j= 0; j<t2[i].length;j++) {
			System.out.print(t2[i][j]+" ");
			
			
		}
		System.out.println();
		
		
	}
		
		char[][] s = {
				{'x','y','z','a','b','c','d'},
				{'x','y','z','o','b','c','d'},
				{'x','y','z','o','b','c','d'},
				{'x','y','z','a','b','c','d'},
				{'x','y','z','a','b','o','d'},
				{'x','y','z','a','b','c','d'}
		};
		for(int i=0; i < s.length; i++) {
			for(int j=0; j<s[i].length; j++) {
				if(s[i][j] == 'o') {
					System.out.printf("[%2d행 %2d열]%n",i,j);
				}
				
				
			}
			
			
		}
		for(int i=0; i< s.length; i++){
			//System.out.println(t2[i]);
		for(int j= 0; j<s[i].length;j++) {
			System.out.print(s[i][j]+" ");
			
			
		}

	}
}
}
