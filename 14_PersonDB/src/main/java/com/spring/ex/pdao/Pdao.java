package com.spring.ex.pdao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.spring.ex.pdto.Pdto;

public class Pdao {
	Connection conn= null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	private static Pdao instance = new Pdao();
	public static Pdao getInstance() {
		return instance;
	}
	private Pdao() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","kim","1234");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void write(String id, String name, String age) {
		String sql = "insert into person values(person_seq.nextval,?,?,?) ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, name);
			ps.setString(3, age);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public ArrayList<Pdto> select() {
		String sql = "select * from person ";
		ArrayList<Pdto> lists = new ArrayList<Pdto>();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				Pdto dto = new Pdto();
				dto.setNum(rs.getString("num"));
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getString("age"));
				lists.add(dto);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}	finally {
			try {
				ps.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return lists;
	}
	public void delete(String num) {
		String sql = "delete from person where num =? ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, num);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public void update(String id, String name, String age,String num) {
		String sql = "update person set id = ? , name = ? , age=? where num = ? ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, name);
			ps.setString(3, age);
			ps.setString(4, num);
			ps.executeUpdate();
		
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		
	}
	public Pdto updateForm(String num) {
		String sql = "select * from person where num = ? ";
		Pdto dto = new Pdto();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, num);
			rs = ps.executeQuery();
			if(rs.next()) {
				dto.setNum(rs.getString("num"));
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getString("age"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				ps.close();
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		return dto;
		
	}
	
}
