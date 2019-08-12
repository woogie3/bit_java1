package day14;

public interface Command {
	public void exec();
	default public void check() {//default를 넣어 인터페이스에 abstract메소드 이외의 기능을 추가함. Stactic영역으로 관리되는 메소드
		System.out.println("Command check()함수");
}
}	

class DeleteCommand implements Command{
	@Override
	public void exec() {
		System.out.println("Delete(삭제) 수행");
	}
	public void check() {
		System.out.println("DeleteCommand check() 함수");
	}
}
class InsertCommand implements Command{
	@Override
	public void exec() {
		System.out.println("Insert(등록) 수행");
	}
}
class UpdateCommand implements Command{
	@Override
	public void exec() {
		System.out.println("Update(수정) 수행");
	}
}

class ListCommand implements Command{
	@Override
	public void exec() {
		System.out.println("List(목록) 수행");
	}
}