package com.its.DockeMavenStandAloneApp;

import java.util.Scanner;

import com.its.DockeMavenStandAloneApp.add.AddNumber;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AddNumber ad = new AddNumber();
    	Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = sc.nextInt();
		System.out.println("Enter Second Number ");
		int b = sc.nextInt();
		
		System.out.println("Sum to numbe is "+ad.add(a,b));
        System.out.println( "Hello World! HHI " );
    }
}
