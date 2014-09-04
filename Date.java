/**
 * @(#)Date.java
 *
 *
 * @author Kartik Patel
 * @version 1.00 2013/9/18
 */
class Date {
	private int day;
	private int month;
	private int year;
	private int[] dayArray = {31,28,31,30,31,30,31,31,30,31,30,31};
	void setDate (int day, int month, int year) {
		this.month = ( month < 1 ) ? 1 : (( month > 12 ) ? 12 : month);
		this.year = ( year < 1 ) ? 1 : year;
		if ( this.month == 1 || this.month == 3 ||  this.month == 5 ||  this.month == 7 ||  this.month == 8 || this.month == 10 || this.month == 12) {
			this.day = ( day < 1 ) ? 1 : ( (day>31) ? 31 : day );
		}
		else if ( this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
			this.day = ( day < 1 ) ? 1 : ( (day>30) ? 30 : day );
		}
		else this.day = ( day < 1 ) ? 1 : ( ( day > 28 ) ? 28 : day );
	}
	public Date() {
		setDate(1,1,1);
	}
	public Date(int year) {
		setDate(1,1,year);
	}
	public Date(int month,int year) {
		setDate(1,month,year);
	}
	public Date(int day, int month, int year) {
		setDate(day,month,year);
	}
	public void display() {
		System.out.printf("%s\n", this);
	}
	public int year(){ return year; }
	public int month(){ return month; }
	public int day(){ return day; }
	boolean isEarlier(Date d) {
		if ( d.year > year ) return false;
		else if ( d.year < year ) return true;
		else {
			if ( d.month > month ) return false;
			else if (d.month < month ) return true;
			else {
				if(d.day > day) return false;
				else return true;
			}
		}
	}
	public String toString() {
		return String.format("%02d/%02d/%04d", day,month, year);
	}
	int days(Date x) {
		int d=day;
		int m=month;
		int y=year;
		int count=0;
		if (year!=x.year) {
			for(;m<=12;m++) {
				if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) {
					for(; d<=31; d++) count++;
					d=1;
				}
				else if (m==4 || m==6 || m==9 || m==11){
					for(; d<=30; d++) count++;
					d=1;
				}
				else {
					for(; d<=28; d++) count++;
					d=1;
				}
			}
			for (;y+1<x.year;y++) {
				count = count + 365;
			}
			m=1;
			for(;m<x.month;m++){
				if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) {
					for(; d<=31; d++) count++;
					d=1;
				}
				else if (m==4 || m==6 || m==9 || m==11){
					for(; d<=30; d++) count++;
					d=1;
				}
				else {
					for(; d<=28; d++) count++;
					d=1;
				}
			}
			count = count + x.day;
		}
		else {
			for(;m<x.month;m++) {
				if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) {
					for(; d<=31; d++) count++;
					d=1;
				}
				else if (m==4 || m==6 || m==9 || m==11){
					for(; d<=30; d++) count++;
					d=1;
				}
				else {
					for(; d<=28; d++) count++;
					d=1;
				}
			}
			count = count + x.day;
		}
		if (month==x.month && year==x.year) count = x.day - day;
		return count-1;
	}
}
