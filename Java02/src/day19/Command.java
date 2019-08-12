package day19;
@FunctionalInterface //람다로 표현가능
public interface Command {
	
	void exec();
	
	default public void print() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~");
	}
}
class DeleteCommand implements Command{
	@Override
	public void exec() {
		System.out.println("DeleteCommand 수행");
	}
	
}
class UpdatdCommand implements Command{
	@Override
	public void exec() {
		System.out.println("UpdateCommand 수행");
		
	}
	
}
class SelectCommand implements Command{
	@Override
	public void exec() {
		System.out.println("SelectCommand 수행");
	}
	
	
}
class InsertCommand implements Command{
	@Override
	public void exec() {
		System.out.println("InsertCommand 수행");
		
	}
	
}