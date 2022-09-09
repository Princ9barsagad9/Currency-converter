package com.converter.Runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) throws Exception {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		// Creating currency Object
		Currency c = new Currency();
//     c.setId(121);
//     c.setCname("us");
//     c.setCtype("doller");
//     c.setCvalue(75);

		// create currencyindia object

		// create session to save values and table
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		// ask question
	  Scanner scanner=new Scanner(System.in);
//    int num;
//    System.out.println("enter currency code from the list:");
//     num=scanner.nextInt();
		String str;
		CurrencyIndia ci = (CurrencyIndia) session.get(CurrencyIndia.class, 2);
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/currency", "root", "79284");
		Statement st = (Statement) con.createStatement();
		ResultSet rs = st.executeQuery("select * from currencyindia");
		System.out.println("Choose from below given list");
		while (rs.next()) {
			str = rs.getString(2);
			System.out.println(str);
		}
		// save object
		session.save(c);
		session.save(ci);

		tx.commit();
		session.close();
		factory.close();
	}
}
