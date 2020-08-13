package com.revature;

import java.util.List;

import com.revature.daos.HomeDAO;
import com.revature.models.Home;

public class Driver {

	private static HomeDAO dao = new HomeDAO();
	
	public static void main(String[] args) {
		List<Home> homes = dao.findAll();
		
		for (Home h: homes) {
			System.out.println(h);
		}
		
		Home h = new Home("Malibu home", "Stark Mansion", "Malibu", "CA", null);
		
		System.out.println(dao.addHome(h));
		
	}

}
