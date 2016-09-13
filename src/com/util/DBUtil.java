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
	
	//与数据库建立连接的方法
	public Connection getConn(){
		try {
			//1、加载驱动
			Class.forName(DRIVER);
			//2、得到连接
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
	
    //增、删、改方法
	public int execUpdate(String sql,Object...param){
		int num=0;
		try {
			//1、建立连接
			Connection conn=getConn();
			//2、发送sql语句
			pstmt=conn.prepareStatement(sql);
			for(int i=0;i<param.length;i++){
				pstmt.setObject(i+1, param[i]);
			}
			//3、执行增删改操作
			num=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
			closeAll();
		}
		return num;
	}
	
	
	//查询方法	
	public ResultSet execQuery(String sql,Object...param){
		try {
			//1、建立连接
			Connection conn=getConn();
			//2、发送sql语句
			pstmt=conn.prepareStatement(sql);
			for(int i=0;i<param.length;i++){
				pstmt.setObject(i+1, param[i]);
			}
			//3、执行查询操作
			rst=pstmt.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rst;
	}
	
	//关闭接口
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
