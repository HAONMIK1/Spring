package com.spring.ex.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.spring.ex.dto.FDto;

public class FDao {
	Connection conn= null;
	PreparedStatement ps =null;
	ResultSet rs = null;
	private static FDao instance = new FDao();
	public static FDao getInstance() {
		return instance;
	}
	private FDao() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","kim","1234");
		} catch (Exception e) {
			// TODO: handle exception
		}
	
}//FDao()
	public ArrayList<FDto> list() {
		String sql = "select * from football";
		ArrayList<FDto> lists = new ArrayList<FDto>();
		try {
			ps =conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
			FDto dto = new FDto();
			dto.setNum(rs.getString("num"));
			dto.setId(rs.getString("id"));
			dto.setPw(rs.getString("pw"));
			dto.setWin(rs.getString("win"));
			dto.setRound16(rs.getString("round16"));
			lists.add(dto);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				ps.close();
				rs.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return lists;
	}//list
	public void write(FDto dto) {
		String sql = "insert into football values(fb_seq.nextval,?,?,?,?)";
		try {
			ps =conn.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPw());
			ps.setString(3, dto.getWin());
			ps.setString(4, dto.getRound16());
			ps.executeUpdate();
		
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				ps.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}//write
	public void delete(String num) {
		String sql = "delete from football where num = ?";
		try {
			ps =conn.prepareStatement(sql);
			ps.setString(1, num);
			ps.executeUpdate();
		
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				ps.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
	public FDto updateForm(String num) {
		String sql = "select * from football";
		FDto dto = new FDto();
		try {
			ps =conn.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next()) {
			dto.setNum(rs.getString("num"));
			dto.setId(rs.getString("id"));
			dto.setPw(rs.getString("pw"));
			dto.setWin(rs.getString("win"));
			dto.setRound16(rs.getString("round16"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				ps.close();
				rs.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return dto;
	}
	public void update(FDto dto) {
		String sql = "update football set pw = ?, win = ?, round16 = ? where num = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, dto.getPw());
			ps.setString(2, dto.getWin());
			ps.setString(3, dto.getRound16());
			ps.setString(4, dto.getNum());
			ps.executeUpdate();
		} catch (Exception e) {
		}finally {
			try {
				ps.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}