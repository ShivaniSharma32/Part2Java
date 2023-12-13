package Encapsulation;

public class ATMDriver {

	public static void main(String[] args) {
		ATm a= new ATm();
		System.out.println(a.getMoney());
		a.setMoney(3000);
		System.out.println(a.getMoney());
	}

}
/* cm.clickOnCampignName(caName);*/
//driver.findElement(By.xpath("//input[@accesskey='S']")).click();
//String Campaignname = driver.findElement(By.cssSelector("[id='dtlview_Campaign Name']")).getText();