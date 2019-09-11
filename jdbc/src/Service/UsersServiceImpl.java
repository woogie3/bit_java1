package Service;

import java.util.List;

import dao.UsersDAO;
import vo.UsersVO;

public class UsersServiceImpl implements UsersService {
	UsersDAO dao;

	public UsersServiceImpl() {}

	public UsersServiceImpl(UsersDAO dao) {
		this.dao = dao;
	}

	public UsersDAO getDao() {
		return dao;
	}

	public void setDao(UsersDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<UsersVO> userList() {
		return dao.getUsersRec();
	}

	@Override
	public int addUsers(UsersVO vo) {
		return dao.insertUsers(vo);
	}

	@Override
	public int deleteUsers(String id, String password) {
		return dao.deleteUsers(id, password);
	}

	@Override
	public int updateUsers(UsersVO vo) {
		return dao.updateUsers(vo);
	}
	
	
	
	
	
	
}
