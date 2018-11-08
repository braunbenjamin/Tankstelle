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


import com.apiomat.nativemodule.basics.*;
/**
* Generated class for your Tankstellenfiliale data model
*
* DO NOT CHANGE ANY CODE EXCEPT CLASS ANNOTATIONS OR CLASS ATTRIBUTES HERE!
* EVERYTHING ELSE WILL GET OVERWRITTEN!
*
*/
@java.lang.SuppressWarnings( "unused" )
@com.apiomat.nativemodule.Model( moduleName = "Tankstelle",
    hooksClassNameTransient = "com.apiomat.nativemodule.tankstelle.TankstellenfilialeHooksTransient", 
    hooksClassNameNonTransient = "com.apiomat.nativemodule.tankstelle.TankstellenfilialeHooksNonTransient", 
    isTransient = true,     requiredUserRoleCreate=com.apiomat.nativemodule.UserRole.User, requiredUserRoleRead=com.apiomat.nativemodule.UserRole.User,
    requiredUserRoleWrite=com.apiomat.nativemodule.UserRole.Owner, restrictResourceAccess=false,    allowedRolesCreate={}, allowedRolesRead={},
    allowedRolesWrite={}, allowedRolesGrant={}, 
    roleClassesMap={})
public class Tankstellenfiliale extends com.apiomat.nativemodule.AbstractClientDataModel<com.apiomat.nativemodule.tankstelle.Tankstellenfiliale> implements com.apiomat.nativemodule.IModel<com.apiomat.nativemodule.tankstelle.Tankstellenfiliale>
{
    /**
     * Contains the name of the module that this model belongs to
     */
    public static final String MODULE_NAME = "Tankstelle";
    /**
     * Contains the name of the model
     */
    public static final String MODEL_NAME = "Tankstellenfiliale";

    /** class specific attributes */
    private String brand = null;
    private Long diesel = null;
    private Long e10 = null;
    private Long e5 = null;
    private String name = null;
    /**
     * Protected constructor; to create a new instance, use the createObject() method
     */
    public Tankstellenfiliale ()
    {}

    /**
     * Returns the name of the module where this class belongs to
     */
    @Override
    public String getModuleName( )
    {
        return MODULE_NAME;
    }

    /**
     * Returns the name of the model
     */
    @Override
    public String getModelName( )
    {
        return MODEL_NAME;
    }

    public String getBrand()
    {
         return this.brand;
    }

    public void setBrand( String arg )
    {
        this.brand = arg;
    }

    public Long getDiesel()
    {
         return this.diesel;
    }

    public void setDiesel( Long arg )
    {
        this.diesel = arg;
    }

    public Long getE10()
    {
         return this.e10;
    }

    public void setE10( Long arg )
    {
        this.e10 = arg;
    }

    public Long getE5()
    {
         return this.e5;
    }

    public void setE5( Long arg )
    {
        this.e5 = arg;
    }

    public String getName()
    {
         return this.name;
    }

    public void setName( String arg )
    {
        this.name = arg;
    }

}
