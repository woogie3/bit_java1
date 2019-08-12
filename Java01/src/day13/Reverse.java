package day13;

public class Reverse {
	String[] str;
    public static void main(String[] args) {
        String str = a("Java Programming");
        
       
       System.out.println(str);
 
    }
    
    public static String a (String str) { //메소드
    	String result ="";
    	 for (int i = str.length()-1; i>=0; i--){
    		 result += str.charAt(i);
         } 
         return result;
    }
 
}

/* 1.문장을 받는다
 * 2.char형으로 문자로 쪼갠다
 * 3.문자열화한 데이터를 배열화한다.
 * 4.for문을 돌려 배열주소를 뒤집어서 리턴한다.
 * 5.리턴한 배열을 받는다.
 * 6.test한다.
 * 
 * 
 */
