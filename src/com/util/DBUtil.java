package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {	
	private static final String DRIVER="com.mysql.jdbc.Driver";
	private static final String URL="jdbc:mysql://localhost:3306/text1?useUnicode=true&characterEncoding=UTF-8&";
	private static final String USER="root";
	private static final String PASSWORD="123";
	
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rst=null;
	
	//�����ݿ⽨�����ӵķ���
	public Connection getConn(){
		try {
			//1����������
			Class.forName(DRIVER);
			//2���õ�����
		    conn=DriverManager.getConnection(URL, USER, PASSWORD);			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return conn;
	}
	
    //����ɾ���ķ���
	public int execUpdate(String sql,Object...param){
		int num=0;
		try {
			//1����������
			Connection conn=getConn();
			//2������sql���
			pstmt=conn.prepareStatement(sql);
			for(int i=0;i<param.length;i++){
				pstmt.setObject(i+1, param[i]);
			}
			//3��ִ����ɾ�Ĳ���
			num=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			closeAll();
		}
		return num;
	}
	
	
	//��ѯ����	
	public ResultSet execQuery(String sql,Object...param){
		try {
			//1����������
			Connection conn=getConn();
			//2������sql���
			pstmt=conn.prepareStatement(sql);
			for(int i=0;i<param.length;i++){
				pstmt.setObject(i+1, param[i]);
			}
			//3��ִ�в�ѯ����
			rst=pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rst;
	}
	
	//�رսӿ�
	public void closeAll(){
		try {
			if(rst!=null){
				rst.close();
			}
			if(pstmt!=null){
				pstmt.close();
			}
			if(conn!=null){
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
