package org.ott;

public class recharge implements primevideo,hotstar {
	
  public void offers(){
	System.out.println("extra month + HELLO");
}
 




@Override
public void MonthlyPlan() {
	System.out.println("399 +HIII");
	
}


@Override
public void yearlyplan() {
	System.out.println("1399");
	
	
}

@Override
public void dayplan() {
	System.out.println("99");
	
	
	
}   
public static void main(String[] args) {
	recharge r=new recharge();
	r.offers();
	r.MonthlyPlan();
	r.yearlyplan();
	hotstar r1=new recharge();
	r1.dayplan();
	
	
}
}
