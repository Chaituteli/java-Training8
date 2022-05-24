package com.vstl.inheritance;

public class bankOfBaroda extends HDFCBank {
	
	
	public String strcustomeraccountNo="FC3546100000715";
	public String strBankFacility="Education loan facility Avaliable";
	
	
	public void getcoustomeraccountNo() {
		System.out.println("costmare Account no:"+strcustomeraccountNo);
	}


     public  void getBankFacility() {
	System.out.println("Bank Facility :"+strBankFacility);
       }
     
     public  void getcoustomerDetails() {
    	 this.getcoustomeraccountNo();
    	 this.getBankFacility();
    	 this.getCreditamount();
    	
     }


}