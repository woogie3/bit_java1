package day19_ex;
//book만든후
//bookMgr을 collection으로 바꾸어서 CURD가 되도록 만든다.
public class Book {
		private int ISBN;
		private String title;
		private int price;
		
		public Book() {
			
		}
		
		public Book(int ISBN, String title, int price) {
			this.ISBN = ISBN;
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
		public int getISBN() {
			return ISBN;
		}

		public void setISBN(int iSBN) {
			ISBN = iSBN;
		}
		public void print() {
			System.out.printf("책제목[%-20s : %7d] %n",title,price);
		}

		@Override
		public String toString() {
			return "Book [title=" + title + ", price=" + price + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + price;
			result = prime * result + ((title == null) ? 0 : title.hashCode());
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
			if (ISBN != other.ISBN)
				return false;
			if (title == null) {
				if (other.title != null)
					return false;
			} else if (!title.equals(other.title))
				return false;
			return true;
		}
}
