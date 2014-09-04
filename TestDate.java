/**
 * @(#)TestDate.java
 *
 *
 * @author Kartik Patel
 * @version 1.00 2013/9/18
 */

import java.util.*;

class TestDate {
	
	private Date bDay = new Date();
	private Date today = new Date();
	public static void main(String[] args) {
		
		int x,y,z;
		TestDate testObj = new TestDate();    // Creating object to get nonstatic content
		Scanner in = new Scanner(System.in);
		System.out.print("Add ur Birthday with space (dd mm yyyy) ");
		x=in.nextInt();
		y=in.nextInt();
		z=in.nextInt();
		testObj.bDay.setDate(x,y,z);
		System.out.print("Add today's date (dd mm yyyy) ");
		x=in.nextInt();
		y=in.nextInt();
		z=in.nextInt();
		testObj.today.setDate(x,y,z);
		System.out.printf("%s",bDay);
		System.out.println("Days :"+testObj.bDay.days(testObj.today));
		System.out.printf("Age is %d years\n",testObj.ageDiff());		
		System.out.println("___________________________________________");
		x=in.nextInt();
	}
	int ageDiff() {
		return (bDay.days(today)/365);
	}
}
