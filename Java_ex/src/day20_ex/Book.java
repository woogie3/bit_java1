package day20_ex;
//book만든후
//bookMgr을 collection으로 바꾸어서 CURD가 되도록 만든다.
public class Book extends Object implements Comparable<Book> {//object를 상속받고 Comparable인터페이스를 사용
		private int isbn;
		private String title;
		private int price;
		
		public Book() {
			
		}
		
		public Book(String title, int price) {
			
			this.title = title;
			this.price = price;

		}
		
		public Book(int isbn, String title, int price) {
			this.isbn = isbn;
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
		public int getIsbn() {
			return isbn;
		}

		public void setIsbn(int isbn) {
			this.isbn = isbn;
		}
		public void print() {
			System.out.printf("책제목[%-20s : %7d] %n",title,price);
		}


		@Override
		public String toString() {
			return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + isbn;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Book other = (Book) obj;
			if (isbn != other.isbn)
				return false;
			return true;
		}
		@Override
		public int compareTo(Book o) {//isbn을비교함
		return title.compareTo(o.title);
		}

		
}
