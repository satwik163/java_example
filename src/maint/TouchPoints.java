package maint;

import java.io.IOException;

public class TouchPoints extends Checkmaiant {

	public void Desktop(String loc[]) throws IOException
	{
		String locale = "";
		for(int i=0;i<loc.length;i++)
		{   locale = loc[i];
				int code = super.getResponseCode("https://www2.hm.com/"+ locale + "/index.html");
				if(code==503)
				{
				System.out.print(locale + "is DOWN" + "\n");
				}
				else
				{
					System.out.print(code + "  " + locale + "    is UP" + "\n");
				}
		}
	}

	public void Mobile(String loc[])throws IOException
	{
		String locale = "";
		for(int i=0;i<loc.length;i++)
		{   locale = loc[i];
		int code = super.getResponseCode("https://m2.hm.com/m/"+ locale + "/index.html");
		if(code==503)
		{
		System.out.print(locale + "is DOWN" + "\n");
		}
		else
		{
			System.out.print(code + "  " + locale + "    is UP" + "\n");
		}
		}	
	}

	public void App(String loc[] ) throws Exception {
		String locale = "";
		String current_version_andr="36";
		String current_version_ios="44";
		String current_version_andr_US="39";
		String current_version_ios_US="48";
		for(int i=0;i<loc.length;i++)
		{   locale = loc[i];
				String codeAndroid = super.readUrlAndroid("https://app2.hm.com/content/hmmobilenativeapp/" + locale +"/_jcr_content/componentproperties/prop.1.json");
				String codeIos = super.readUrlIos("https://app2.hm.com/content/hmmobilenativeapp/" + locale +"/_jcr_content/componentproperties/prop.1.json");
				if(codeAndroid.equals(current_version_andr))
				{
					System.out.print("  " + locale + " for Android is UP" + "\n");
				}
				else if (locale.equals("en_us")&& codeAndroid.equals(current_version_andr_US))
				{
					System.out.print("  " + locale + " for Android is UP" + "\n");
				}
				else 
				{
					System.out.print("  " + locale + " for Android is DOWN" + "\n");
				}
				if(codeIos.equals(current_version_ios))
				{
					System.out.print("  " + locale + " for Ios is UP" + "\n");
				}
				else if (locale.equals("en_us")&& codeIos.equals(current_version_ios_US))
				{
					System.out.print("  " + locale + " for Ios is UP" + "\n");
				}
				else
				{
					System.out.print("  " + locale + " for Ios is DOWN" + "\n");
				}
		}
		
	}

}
