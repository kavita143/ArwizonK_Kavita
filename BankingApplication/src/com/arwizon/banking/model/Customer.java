package com.arwizon.banking.model;

public class Customer  {
	
	private static int count;
	private String name;
	private int customerId;
	private String address;
	private String mobileNo;
	private String accounType;
	
	public int age;
	
	
	
	static {
		count=101;
		System.out.println("inside static block");
	}
	
	public Customer() {
		count++;
	}
	
	public static int getCount() {
		return count;
	}

	

	public Customer(String name) {
		this();
		this.name=name;		
	}
	
	public String getName() {		
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAccounType() {
		return accounType;
	}
	public void setAccounType(String accounType) {
		this.accounType = accounType;
	}
	

	@Override
	public String toString() {
		return "Customer [name=" + name + ", customerId=" + customerId + ", address=" + address + ", mobileNo="
				+ mobileNo + ", accounType=" + accounType + "]";
	}	

}

