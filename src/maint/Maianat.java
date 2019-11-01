package maint;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Maianat {

	public static void main(String[] args) throws Exception {
		SelectChoice sc = new SelectChoice();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String key = "C";
		do
		{   
			System.out.print("Select Touch Point" + "\n" +"1- Desktop" +"\n" + "2- Mobile" + "\n" + "3- App" + "\n"+ "4- Exit This Application" + "\n");
			String choice = reader.readLine();
			System.out.print("Select Instance" + "\n" +"1- AM" +"\n" + "2- AP"+ "\n3- EU3" +"\n" + "4- EU2"+ "\n" + "5- EU1" + "\n" + "6- Exit This Application" + "\n");
			String instance = reader.readLine();
			
			if(choice.equals("1"))
			{
				sc.OptionsForInstancesDesktop(instance);
			
			}
			
			if(choice.equals("2"))
			{
				sc.OptionsForInstancesMobile(instance);
			
			}
			if(choice.equals("3"))
			{
				sc.OptionsForInstancesApp(instance);
			
			}
			if(choice.equals("4"))
			{
				System.out.print("Exiting Application........");
				System.exit(0);
			
			}
			System.out.print("Press s to STOP this application, Press any key to Continue"+"\n");
			key= reader.readLine();
			if(key.equals("S") || key.equals("s"))
			{
				break;
			}
			
		}while(true);
		
	}

}
