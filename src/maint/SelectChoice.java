package maint;

import java.io.IOException;

public class SelectChoice extends TouchPoints{
	String AM[]={"en_ca","en_us","fr_ca"};
	String AP[]={"en_cn","ja_jp","ko_kr","zh_cn","en_in"};
	String EU3[]={"de_at"};
	String EU2[]={"it_it","es_es","pt_pt","pl_pl","cs_cz","sk_sk","en_eur","ru_ru","ro_ro","bg_bg","hu_hu","de_ch","it_ch","fr_ch"};
	String EU1[]={"fr_fr","nl_nl","en_gb","sv_se","no_no","fi_fi","sv_fi","da_dk","en_ie","nl_be","fr_be","en_asia1","en_asia2","en_asia3","en_asia4","en_asia5"};
	
	public void OptionsForInstancesDesktop(String instance) throws IOException
	{
			if(instance.equals("1"))
			{
				super.Desktop(AM);
			}
			if(instance.equals("2"))
			{
				super.Desktop(AP);
			}
			if(instance.equals("3"))
			{
				super.Desktop(EU3);
			}
			if(instance.equals("4"))
			{
				super.Desktop(EU2);
			}
			if(instance.equals("5"))
			{
				super.Desktop(EU1);
			}
			if(instance.equals("6"))
			{
				System.out.println("Application Closed......");
				System.exit(0);
			}
			
	}
	public void OptionsForInstancesMobile(String instance) throws IOException
	{
		if(instance.equals("1"))
		{
			super.Mobile(AM);
		}
		if(instance.equals("2"))
		{
			super.Mobile(AP);
		}
		if(instance.equals("3"))
		{
			super.Mobile(EU3);
		}
		if(instance.equals("4"))
		{
			super.Mobile(EU2);
		}
		if(instance.equals("5"))
		{
			super.Mobile(EU1);
		}
	}
	public void OptionsForInstancesApp(String instance) throws Exception {
		if(instance.equals("1"))
		{
			super.App(AM);
		}
		if(instance.equals("2"))
		{
			super.App(AP);
		}
		if(instance.equals("3"))
		{
			super.App(EU3);
		}
		if(instance.equals("4"))
		{
			super.App(EU2);
		}
		if(instance.equals("5"))
		{
			super.App(EU1);
		}
		
	}
}
