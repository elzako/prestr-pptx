package com.aspose.slides.internal.v3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class s7 {
   static Map<String, List<String>> n5 = new HashMap<>();
   static Map<String, List<Object>> l6 = new HashMap<>();

   private s7() {
   }

   public static synchronized Iterator<Object> n5(Class<?> var0) {
      String var1 = k5(var0);
      List var2 = (List)l6.get(var1);
      if (var2 != null) {
         return var2.iterator();
      }

      var2 = new ArrayList();
      l6.put(var1, var2);
      ClassLoader var3 = l6(var0);
      if (var3 != null) {
         for (String var6 : n5(var0, var3)) {
            try {
               Object var7 = var3.loadClass(var6).newInstance();
               var2.add(var7);
            } catch (Exception var8) {
            }
         }
      }

      return var2.iterator();
   }

   private static List<String> n5(Class<?> var0, ClassLoader var1) {
      ArrayList var2 = new ArrayList();
      if (var1 == null) {
         return var2;
      }

      Enumeration var3;
      try {
         var3 = var1.getResources(k5(var0));
      } catch (IOException var21) {
         return var2;
      }

      while (var3.hasMoreElements()) {
         try {
            URL var4 = (URL)var3.nextElement();
            InputStream var5 = var4.openStream();
            InputStreamReader var6 = new InputStreamReader(var5, "UTF-8");
            BufferedReader var7 = new BufferedReader(var6);

            try {
               for (String var8 = var7.readLine(); var8 != null; var8 = var7.readLine()) {
                  int var9 = var8.indexOf(35);
                  if (var9 != -1) {
                     var8 = var8.substring(0, var9);
                  }

                  var8 = var8.trim();
                  if (var8.length() != 0) {
                     var2.add(var8);
                  }
               }
            } finally {
               try {
                  if (var7 != null) {
                     var7.close();
                  }
               } catch (IOException var20) {
               }

               try {
                  if (var5 != null) {
                     var5.close();
                  }
               } catch (IOException var19) {
               }
            }
         } catch (Exception var23) {
         }
      }

      return var2;
   }

   private static ClassLoader l6(Class<?> var0) {
      ClassLoader var1 = null;

      try {
         var1 = var0.getClassLoader();
      } catch (SecurityException var3) {
      }

      if (var1 == null) {
         var1 = s7.class.getClassLoader();
      }

      if (var1 == null) {
         var1 = ClassLoader.getSystemClassLoader();
      }

      return var1;
   }

   private static String k5(Class<?> var0) {
      return "META-INF/services/" + var0.getName();
   }
}
