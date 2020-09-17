package com.kh.thil.user.woori.model.townService;



import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;

import com.kh.thil.user.woori.model.dao.TownDao;
import com.kh.thil.user.woori.model.vo.Town;
import static com.kh.thil.common.JDBCTemplate.*;
public class TownService {

	public ArrayList<HashMap<String, Object>> townSelectList() {
		Connection con = getConnection();
			
			ArrayList<HashMap<String, Object>> list = new TownDao().townSelectList(con);
			
			return list;
		
	}

	public HashMap<String, Object> selectTownOne(String str) {
		
		Connection con = getConnection();
		
		HashMap<String, Object> hmap = null;
		TownDao td = new TownDao();
		
		
			
			hmap = td.selectTownOne(con, str);
			if(hmap != null) {
				commit(con);
			} else {
				rollback(con);
			}
			
		
		close(con);
		
		return hmap;
	}

	
	

}
