package com.converter.Runner.Try;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.converter.Runner.CurrencyIndia;

public class Runner {

	public static void main(String[] args) throws IOException,Exception{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		// create object of class
		String str;
		
		CCindia ccindia = new CCindia();

		// initialize session for the process
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Scanner scanner = new Scanner(System.in);

		// connection to mysql database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cc", "root", "79284");
		Statement st = (Statement) con.createStatement();
		Statement st2= (Statement) con.createStatement();
		ResultSet rs = st.executeQuery("select * from ccindia");
		System.out.println("Choose from below given list");
		while (rs.next()) {
			str = rs.getString(1) + ":" + rs.getString(2) + ":" + rs.getString(3)+":"+rs.getDouble(4);
			System.out.println(str);
		
		}
		System.out.println("Enter the currency code in which you want to convert Rs:");
		int choice = scanner.nextInt();
		System.out.println("Enter the amount you want to convert:");
		Long amount = scanner.nextLong();
		ResultSet rs2 = st2.executeQuery("select * from ccindia");
		int i=0;
		double fetch = 1.0;
		while (rs2.next()) {
			i++;
			if(i==choice) {
				fetch = rs2.getDouble(4);
			}
		}
		double camount=(double)amount*fetch;
		System.out.println("The converted amount is:" + camount+" INR");

		// perfrom action of converter

		// save action
		tx.commit();
		session.close();
		factory.close();
	}

}
