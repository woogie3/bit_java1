package day09;

public class Book {//데이터 클래스
		private String title;
		private int price;
		
		public Book() {
			
		}
		
		public Book(String title, int price){
			this.title = title;
			this.price = price;
		}
		


		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
		public void print() {
			System.out.printf("책제목[%-20s : %7d] %n",title,price);
		}

}
