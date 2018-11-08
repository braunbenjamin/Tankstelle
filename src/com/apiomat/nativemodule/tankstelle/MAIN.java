package com.apiomat.nativemodule.tankstelle;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.json.JSONObject;

public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test");
		
		try {
			URL url = new URL("https://creativecommons.tankerkoenig.de/json/list.php?lat=51.3349021&lng=12.3999524&type=all&rad=4&sort=dist&apikey=4413f0a7-8d1c-2e78-9d4b-85062d1a9d0a");
			
			InputStream in = url.openStream();
			
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			byte[] buffer = new byte[4096];
			int n;
			while((n = in.read(buffer))>0)
			{
				out.write(buffer, 0, n);
			}
			in.close();
			
			JSONObject response = new JSONObject( out.toString());
			System.out.println(out.toString());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		
	}

}
