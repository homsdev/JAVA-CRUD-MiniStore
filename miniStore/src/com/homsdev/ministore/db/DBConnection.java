package com.homsdev.ministore.db;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DBConnection")
public class DBConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DBConnection() {
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String url = "jdbc:mysql://localhost:3306/ministore?useSSL=false&serverTimezone=UTC";
		String user = "root";
		String password = "";
		String driver = "com.mysql.cj.jdbc.Driver";
		try {
			PrintWriter out=response.getWriter();
			out.print("Conectando con base datos: "+url );
			Class.forName(driver);
			Connection connection= DriverManager.getConnection(url,user,password);
			out.print("conectado");
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
