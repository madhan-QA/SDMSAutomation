package com.systech.tradewinds.sdms.common;

import java.util.ArrayList;
import java.util.List;

import org.testng.reporters.jq.Main;

public class XpathGeneration {

	private static String brnchTable = "\"//*(@id['chgtype:tabviewid:table";
	private static String location = "locationId']\"";

	public static void xpath() {
    	List<String> elemts = new ArrayList<String>();

     for (int i =0;i<7;i++) {
    	String xpath = brnchTable+i+location;
    	  break ; 
}   

    System.out.println(elemts.get(5));

     
	}  public static void main(String[] args) {
		XpathGeneration.xpath();
	}
}