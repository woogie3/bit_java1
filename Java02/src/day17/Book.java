package day17;

public class Book<T,P> {//제너릭
	
	T title;
	P Price;
	
	
	
	public Book() {
		super();
	}
	public Book(T title, P price) {
		super();
		this.title = title;
		Price = price;
	}
	
	
	public T getTitle() {
		return title;
	}
	public void setTitle(T title) {
		this.title = title;
	}
	public P getPrice() {
		return Price;
	}
	public void setPrice(P price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", Price=" + Price + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Price == null) ? 0 : Price.hashCode());
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
		if (Price == null) {
			if (other.Price != null)
				return false;
		} else if (!Price.equals(other.Price))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
	

}
