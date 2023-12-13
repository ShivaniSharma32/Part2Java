package Encapsulation;

public class ATm {

	private double money=100;
	double balance=500;
	
	public double getMoney()
	{
		//validation
		if(money<=balance)
		{
			return money;	
		}
		else
		{
			return 0.0;
		}
	}
	 public void setMoney(double money)
	 {
		 this.money= money;
	 }

	}


