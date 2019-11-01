package maint;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class Checkmaiant {

public Long getResponseCode(String URL) throws IOException 

{
    URL url = new URL(URL);
	HttpURLConnection http = (HttpURLConnection)url.openConnection();
	int statusCode = http.getResponseCode();
	return statusCode;
	}



public String readUrlAndroid(String urlString) throws Exception {
    BufferedReader reader = null;
    String longString=null;
    int andr,len;
    try {
        URL url = new URL(urlString);
        reader = new BufferedReader(new InputStreamReader(url.openStream()));
        StringBuffer buffer = new StringBuffer();
        int read;
        char[] chars = new char[1024];
        while ((read = reader.read(chars)) != -1)
            buffer.append(chars, 0, read); 

        longString=buffer.toString();
        andr = longString.indexOf("hmrest.app.version.minimum.android");
    	len = andr + "hmrest.app.version.minimum.android".length();
    	
    	return longString.substring(len+9, len+11);
    } finally {
        if (reader != null)
            reader.close();
    }
}

public String readUrlIos(String urlString) throws Exception {
    BufferedReader reader = null;
    String longString=null;
    int ios,len2;
    try {
        URL url = new URL(urlString);
        reader = new BufferedReader(new InputStreamReader(url.openStream()));
        StringBuffer buffer = new StringBuffer();
        int read;
        char[] chars = new char[1024];
        while ((read = reader.read(chars)) != -1)
            buffer.append(chars, 0, read); 

        longString=buffer.toString();
    	ios =longString.indexOf("hmrest.app.version.minimum.ios");
    	len2 = ios + "hmrest.app.version.minimum.android".length();
    	
    	return longString.substring(len2+5, len2+7);
    } finally {
        if (reader != null)
            reader.close();
    }
}












}