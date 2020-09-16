package com.kh.thil.user.woori.model.townService;



import java.sql.Connection;
import java.util.ArrayList;

import com.kh.thil.user.woori.model.dao.TownDao;
import com.kh.thil.user.woori.model.vo.Town;
import static com.kh.thil.common.JDBCTemplate.*;
public class TownService {

	public ArrayList<Town> townSelectList() {
		Connection con = getConnection();
			
			ArrayList<Town> list = new TownDao().townSelectList(con);
			
			return list;
		
	}

}
