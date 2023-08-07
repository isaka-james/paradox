/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 */
package com.pacompany.paradox;

public final class BuildConfig {
    public static final String APPLICATION_ID = "${getAppPackageName()}";
    public static final String BUILD_TYPE = "${getBuildTypeName()}";
    public static final boolean DEBUG = false;
    public static final String FLAVOR = "${getFlavorName()}";
    public static final int VERSION_CODE = 0;
    public static final String VERSION_NAME = "${Strings.nullToEmpty(getVersionName())}";

    static {
        DEBUG = Boolean.parseBoolean((String)"true");
    }
}

