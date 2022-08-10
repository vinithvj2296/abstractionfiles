package org.ott;

public class primevid implements primevideo{

	@Override
	public void MonthlyPlan() {
		System.out.println("399");
		
	} 


@Override
public void yearlyplan() {
	System.out.println("1399");
}
	
	public static void main(String[] args) {
		primevid v=new primevid();
		v.MonthlyPlan();
		v.yearlyplan();
		
		
	}
	

}
