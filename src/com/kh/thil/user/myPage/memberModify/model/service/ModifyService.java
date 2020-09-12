package com.kh.thil.user.myPage.memberModify.model.service;

import static com.kh.thil.common.JDBCTemplate.close;
import static com.kh.thil.common.JDBCTemplate.commit;
import static com.kh.thil.common.JDBCTemplate.getConnection;
import static com.kh.thil.common.JDBCTemplate.rollback;

import java.sql.Connection;

import com.kh.thil.user.myPage.memberModify.model.dao.ModifyDao;
import com.kh.thil.user.myPage.memberModify.model.vo.Modify;

public class ModifyService {

	public Modify modifyMemberInformation(Modify modifyMember) {
		Connection con = getConnection();

		Modify changedMemberInformation = null;
		
		ModifyDao md = new ModifyDao();
		
		int updateResult = md.modifyMemberInformation(con, modifyMember);
		
		if(updateResult > 0) {

			changedMemberInformation = md.selectChangedMemberInformation(con, modifyMember);
			
			if(changedMemberInformation != null) {

				commit(con);
			} else {

				rollback(con);
			}
		} else {
	
			rollback(con);
		}
		

		close(con);
		
		return changedMemberInformation;
	}

}
