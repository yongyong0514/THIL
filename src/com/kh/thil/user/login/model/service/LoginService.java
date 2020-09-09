package com.kh.thil.user.login.model.service;


import static com.kh.thil.common.JDBCTemplate.close;
import static com.kh.thil.common.JDBCTemplate.commit;
import static com.kh.thil.common.JDBCTemplate.getConnection;
import static com.kh.thil.common.JDBCTemplate.rollback;

import java.sql.Connection;

import com.kh.thil.user.login.model.dao.LoginDao;
import com.kh.thil.user.login.model.vo.Login;


public class LoginService {

	public Login loginCheck(Login requestMember) {
		
		Connection con = getConnection();
		
		Login loginUser = new LoginDao().loginCheck(con, requestMember);
		
		close(con);
		
		return loginUser;
		
		

	}

	public int joinMember(Login newLogin) {
		Connection con = getConnection();
		
		
		
		
		LoginDao ld = new LoginDao();
		
		
		int result = ld.joinMember(con, newLogin);
		
		if(result > 0) {
			commit(con);	
		}else {
			rollback(con);
		}
		
		return result;
		
	}




	/*//회원 추가
	public int insertMember(Member newMember) {
		Connection con = getConnection();
		
		MemberDao md = new MemberDao();
		
		int result = md.insertMember(con, newMember);
		
		
		if(result > 0) {
			commit(con);
		}else {
			rollback(con);
		}
		
		close(con);
		
		return result;
	}*/

}
