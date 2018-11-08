/*
 * Copyright (c) 2011 - 2018, Apinauten GmbH
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.apiomat.nativemodule.tankstelle;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import com.apiomat.nativemodule.*;
import com.apiomat.nativemodule.basics.User;




/**
* Generated class for hooks on your Tankstellenfiliale data model
*/

public class TankstellenfilialeHooksTransient<T extends com.apiomat.nativemodule.tankstelle.Tankstellenfiliale> implements com.apiomat.nativemodule.IModelHooksTransient<com.apiomat.nativemodule.tankstelle.Tankstellenfiliale>
{
    protected com.apiomat.nativemodule.tankstelle.Tankstellenfiliale model;

    @Override
    public void setCallingModel( com.apiomat.nativemodule.tankstelle.Tankstellenfiliale model )
    {
        this.model = model;
    }


    /*
     * do-Methods can be used if your data model is set to TRANSIENT
     */

    @Override
    public String doPost( com.apiomat.nativemodule.tankstelle.Tankstellenfiliale obj, com.apiomat.nativemodule.Request r )
    {
        return null;
    }

    @Override
    public com.apiomat.nativemodule.tankstelle.Tankstellenfiliale doGet( String foreignId, com.apiomat.nativemodule.Request r )
    {
        return null;
    }

    @Override
    public java.util.List<com.apiomat.nativemodule.tankstelle.Tankstellenfiliale> doGetAll( String query, com.apiomat.nativemodule.Request r )
    {

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
			this.model.log(Level.DEBUG, response.toString());
			
			Tankstellenfiliale tsf = new Tankstellenfiliale();
			
			ArrayList<String> listdata = new ArrayList<String>();     
			JSONArray jArray = (JSONArray)response.getJSONArray("stations"); 
			if (jArray != null) { 
			   for (int i=0;i<jArray.length();i++){ 
			    tsf.setBrand(jArray.getJSONObject(i).getString("brand"));
			    tsf.setName(jArray.getJSONObject(i).getString("name"));
			    tsf.setDiesel(jArray.getJSONObject(i).getDouble("diesel"));
			    tsf.setE10(jArray.getJSONObject(i).getDouble("e10"));
			    tsf.setE5(jArray.getJSONObject(i).getDouble("e5"));
			   } 
			   
			  
			   
			} 
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
    	
    	
        return null;
    }

    @Override
    public long doCountAll( String query, com.apiomat.nativemodule.Request r )
    {
        return 0;
    }

    @Override
    public void doPut( com.apiomat.nativemodule.tankstelle.Tankstellenfiliale obj, com.apiomat.nativemodule.Request r )
    {
    }

    @Override
    public boolean doDelete( String foreignId, com.apiomat.nativemodule.Request r )
    {
        return false;
    }

    @Override
    public boolean doDeleteAll( String query, com.apiomat.nativemodule.Request r )
    {
        return false;
    }

    @Override
    public String doPostData( final String attributeName, final com.apiomat.nativemodule.DataWrapper dataWrapper, final com.apiomat.nativemodule.Request r )
    {
        return null;
    }

    @Override
    public com.apiomat.nativemodule.DataWrapper doGetData( final String dataId, final String attributeName, final com.apiomat.nativemodule.TranscodingConfiguration transcodingConfig, final com.apiomat.nativemodule.Request r )
    {
        return null;
    }

    @Override
    public boolean doDeleteData( final String attributeName, final String dataId, final com.apiomat.nativemodule.Request r )
    {
        return false;
    }

    /*
     * Please note: Before doPostRef gets called, doGet gets called internally,
     * so that this.model can be populated with attribute values.
     */
    @Override
    public void doPostRef( Object referencedObject, String referenceName, com.apiomat.nativemodule.Request r )
    {
    }

    /*
     * Please note: Before doGetRef gets called, doGet gets called internally,
     * so that this.model can be populated with attribute values.
     */
    @Override
    public <Z extends com.apiomat.nativemodule.AbstractClientDataModel> java.util.List<Z> doGetRef( String refName, String query, com.apiomat.nativemodule.Request r )
    {
        return null;
    }

    /*
     * Please note: Before doDeleteRef gets called, doGet gets called internally,
     * so that this.model can be populated with attribute values.
     */
    @Override
    public void doDeleteRef( String refName, String refForeignId, com.apiomat.nativemodule.Request r )
    {
    }


}
