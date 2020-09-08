package com.semi.house.member.model.service;

import static com.semi.house.common.JDBCTemplate.close;
import static com.semi.house.common.JDBCTemplate.getConnection;

import java.sql.Connection;

import com.semi.house.member.model.dao.MemberDao;
import com.semi.house.member.model.vo.Member;

public class MemberService {

	public Member loginCheck(Member requestMember) {
		
		Connection con = getConnection();
		
		Member loginUser = new MemberDao().loginCheck(con, requestMember);
		
		close(con);
		
		return loginUser;
		
		

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
