package Service;

import java.util.List;

import vo.UsersVO;

public interface UsersService {
	List<UsersVO> userList();
	int addUsers(UsersVO vo);
	int deleteUsers(String id, String password);
	int updateUsers(UsersVO vo);

}
