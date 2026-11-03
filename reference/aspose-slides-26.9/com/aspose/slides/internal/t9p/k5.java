package com.aspose.slides.internal.t9p;

import java.io.File;
import java.lang.reflect.Method;

public final class k5 {
   public static String n5;
   public static String l6;
   public static String k5;
   public static String u3;
   public static String a6;
   public static String u9;
   public static String h0;
   public static String c8;
   public static String t2;
   public static String s7;
   public static String x8;
   public static String n3;
   public static String y4;
   public static String e2;
   public static String t9;
   public static String z1;
   public static String t4;
   public static String q0;
   public static String z3;
   public static String m1;
   public static String k7;
   public static String m3;
   public static String z8;
   public static String j5;
   public static String w1;
   public static String r4;
   public static String c4;
   public static String y2;
   public static String y1;
   public static String a0;
   public static String d2;
   public static String d5;
   public static String s3;
   public static boolean p8;
   public static boolean f2;
   public static boolean i1;
   public static boolean e5;
   public static boolean b3;
   public static boolean o0;
   public static boolean z7;
   public static boolean v4;
   public static boolean u6;
   public static boolean t1;
   public static boolean a5;
   public static boolean h2;
   public static boolean v0;
   public static boolean f0;
   public static boolean a3;
   public static boolean p3;
   public static boolean x9;
   public static boolean y0;
   public static boolean j9;
   public static boolean z6;
   public static boolean e9;
   public static boolean o5;
   public static boolean j8;
   public static boolean w2;
   public static boolean s0;
   public static boolean v8;
   public static boolean v3;
   public static boolean g7;
   public static boolean j4;
   public static boolean i9;
   public static boolean f5;
   public static boolean j3;
   public static boolean n1;
   public static boolean p6;
   public static boolean d1;
   public static boolean s4;
   public static boolean h6;
   public static boolean y8;
   public static boolean c3;
   public static boolean l4;
   public static boolean i6;

   public static void n5() {
      n5 = k5("file.encoding");
      l6 = k5("file.separator");
      k5 = k5("java.home");
      u3 = k5("java.io.tmpdir");
      a6 = k5("java.library.path");
      u9 = k5("java.runtime.name");
      h0 = k5("java.runtime.version");
      c8 = k5("java.specification.name");
      t2 = k5("java.specification.vendor");
      s7 = k5("java.specification.version");
      x8 = k5("java.util.prefs.PreferencesFactory");
      n3 = k5("java.vendor");
      y4 = k5("java.vendor.url");
      e2 = k5("java.version");
      t9 = k5("java.vm.info");
      z1 = k5("java.vm.name");
      t4 = k5("java.vm.specification.name");
      q0 = k5("java.vm.specification.vendor");
      z3 = k5("java.vm.specification.version");
      m1 = k5("java.vm.vendor");
      k7 = k5("java.vm.version");
      m3 = k5("line.separator");
      z8 = k5("os.arch");
      j5 = k5("os.name");
      w1 = k5("os.version");
      r4 = k5("sun.os.patch.level");
      c4 = k5("path.separator");
      y2 = k5("user.country") == null ? k5("user.region") : k5("user.country");
      y1 = k5("user.dir");
      a0 = k5("user.home");
      d2 = k5("user.language");
      d5 = k5("user.name");
      s3 = k5("user.timezone");
      p8 = n5("1.1");
      f2 = n5("1.2");
      i1 = n5("1.3");
      e5 = n5("1.4");
      b3 = n5("1.5");
      o0 = n5("1.6");
      z7 = n5("1.7");
      v4 = n5("1.8");
      u6 = l6("AIX");
      t1 = l6("HP-UX");
      a5 = l6("OS/400");
      h2 = l6("Irix");
      v0 = l6("Linux") || l6("LINUX");
      f0 = l6("Mac");
      a3 = l6("Mac OS X");
      p3 = l6("FreeBSD");
      x9 = l6("OpenBSD");
      y0 = l6("NetBSD");
      j9 = l6("OS/2");
      z6 = l6("Solaris");
      e9 = l6("SunOS");
      o5 = u6 || t1 || h2 || v0 || a3 || z6 || e9 || p3 || x9 || y0 || l6("MPE/iX") || l6("Digital Unix");
      j8 = a5 || j9;
      w2 = v0 && n3.equals("The Android Project");
      s0 = l6("Windows");
      v8 = n5("Windows", "5.0");
      v3 = n5("Windows", "5.2");
      g7 = n5("Windows Server 2008", "6.0");
      j4 = n5("Windows Server 2008 R2", "6.1");
      i9 = n5("Windows Server 2012", "6.2");
      f5 = n5("Windows Server 2016", "10.0");
      j3 = n5("Windows 9", "4.0");
      n1 = n5("Windows 9", "4.1");
      p6 = l6("Windows CE");
      d1 = n5("Windows", "4.9");
      s4 = l6("Windows NT");
      h6 = n5("Windows", "5.1");
      y8 = n5("Windows", "6.0");
      c3 = n5("Windows", "6.1");
      l4 = n5("Windows", "6.2");
      i6 = n5("Windows", "6.3");
   }

   public static File l6() {
      if (w2) {
         try {
            File var0 = k5();
            File var1 = new File(var0, "tmp");
            return var1.mkdir() ? var1 : var0;
         } catch (Exception var2) {
            return new File(System.getProperty("java.io.tmpdir"));
         }
      } else {
         return new File(System.getProperty("java.io.tmpdir"));
      }
   }

   private static File k5() throws Exception {
      String var0 = "android.os.Environment";
      String var1 = "getExternalStorageDirectory";
      Class var2 = Class.forName("android.os.Environment");
      Method var3 = var2.getMethod("getExternalStorageDirectory");
      Object var4 = var3.invoke(null);
      return (File)var4;
   }

   private static boolean n5(String var0) {
      return l6(s7, var0);
   }

   private static boolean n5(String var0, String var1) {
      return n5(j5, w1, var0, var1);
   }

   private static boolean l6(String var0) {
      return k5(j5, var0);
   }

   private static String k5(String var0) {
      try {
         return System.getProperty(var0);
      } catch (SecurityException var2) {
         com.aspose.slides.internal.t9p.l6.l6
            .println("Caught a SecurityException reading the system property '" + var0 + "'; the SystemUtils property value will default to null.");
         return null;
      }
   }

   private static boolean l6(String var0, String var1) {
      return var0 != null && var0.startsWith(var1);
   }

   private static boolean n5(String var0, String var1, String var2, String var3) {
      return var0 != null && var1 != null && var0.startsWith(var2) && var1.startsWith(var3);
   }

   private static boolean k5(String var0, String var1) {
      return var0 != null && var0.startsWith(var1);
   }

   static {
      n5();
   }
}
