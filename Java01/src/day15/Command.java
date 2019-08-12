package day15;
@FunctionalInterface //추상 메소드가 하나인 인터페이스를 functional interface라고함
public interface Command {
	void exec();
	default public void check() {
		System.out.println("check ~~~~");
		
	}
}

class DeleteCommand implements Command{
	@Override
	public void exec() {
		System.out.println("DeleteCommand 수행");
	}
}
class UpdateCommand implements Command{
	@Override
	public void exec() {
		System.out.println("UpdateCommand 수행");
	}
}
class InsertCommand implements Command{
	@Override
	public void exec() {
		System.out.println("InsertCommand 수행");
	}
}
