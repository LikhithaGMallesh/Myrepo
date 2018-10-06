package com.capgemini.test;

import com.capgemini.pojo.MyDate;

public class MyDateTestRecords {

	public MyDate startDate;
	public MyDate endDate;
	public long expectedResult;
	
	public MyDateTestRecords(MyDate startDate,MyDate endDate,int expectedResult) {
	this.startDate=startDate;
     this.endDate=endDate;
	this.expectedResult=expectedResult;
}
}