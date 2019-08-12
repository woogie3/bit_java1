package day17;

class Dice {
	int size;

	Dice(int size) {
		this.size = size;
	}
	int play() {
		int number = (int)(Math.random()*size) +1;
		return number;
	}
	@Override
	public String toString() {
		return "Dice [size=" + size + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + size;
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
		Dice other = (Dice) obj;
		if (size != other.size)
			return false;
		return true;
	}
	
	
}
