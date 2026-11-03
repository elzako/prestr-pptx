package com.aspose.slides.internal.q6f;

import com.aspose.slides.internal.o9b.y4;
import com.aspose.slides.internal.z0k.m3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class l6 {
   private static HashMap<String, y4> n5 = new HashMap<>(3);

   public static y4 n5(int var0) {
      String var1;
      switch (var0) {
         case 0:
            var1 = "serif";
            break;
         case 1:
            var1 = "sans-serif";
            break;
         default:
            var1 = "monospace";
      }

      return n5(var1);
   }

   private static y4 n5(String var0) {
      if (!n5.containsKey(var0)) {
         String var1 = l6(var0);
         if (var1 == null) {
            var1 = k5(var0);
         }

         n5.put(var0, com.aspose.slides.internal.f3l.k5.k5(var1));
      }

      return n5.get(var0);
   }

   private static String l6(String var0) {
      String var1 = null;

      try {
         Runtime var2 = Runtime.getRuntime();
         Process var3 = var2.exec("fc-match " + var0);
         var3.waitFor();
         if (var3.exitValue() == 0) {
            BufferedReader var4 = new BufferedReader(new InputStreamReader(var3.getInputStream()));
            String var5 = null;
            StringBuilder var6 = new StringBuilder();

            while ((var5 = var4.readLine()) != null) {
               var6.append(var5);
            }

            if (var6.length() > 0) {
               String var7 = var6.toString();
               if (var7.indexOf(":") > 0) {
                  String var8 = var7.substring(var7.indexOf(":") + 1);
                  int var9 = -1;
                  int var10 = -1;

                  for (int var11 = 0; var11 < var8.length(); var11++) {
                     char var12 = var8.charAt(var11);
                     if (var12 == '"') {
                        if (var9 >= 0) {
                           var10 = var11;
                           break;
                        }

                        var9 = var11;
                     }
                  }

                  var1 = var8.substring(var9 + 1, var10);
               }
            }
         }
      } catch (IOException var13) {
         com.aspose.slides.internal.f8y.n5.k5("Unexpected IOException in LinuxGenericFamilyHelper.getDefaultFontFamily." + var13.getMessage());
      } catch (InterruptedException var14) {
         com.aspose.slides.internal.f8y.n5.k5("Unexpected InterruptedException in LinuxGenericFamilyHelper.getDefaultFontFamily." + var14.getMessage());
      } catch (SecurityException var15) {
         com.aspose.slides.internal.f8y.n5.k5("Unexpected SecurityException in LinuxGenericFamilyHelper.getDefaultFontFamily." + var15.getMessage());
      } catch (Exception var16) {
         com.aspose.slides.internal.f8y.n5.k5("Unexpected Exception in LinuxGenericFamilyHelper.getDefaultFontFamily." + var16.getMessage());
      }

      return var1;
   }

   private static String k5(String var0) {
      String var1 = null;

      try {
         String var2 = "/etc/fonts/conf.d/";
         String[] var3 = com.aspose.slides.internal.z0k.u3.l6(var2, "6?-*.conf");

         for (String var7 : var3) {
            m3 var8 = new m3(var7);
            StringBuilder var9 = new StringBuilder();

            String var10;
            while ((var10 = var8.h0()) != null) {
               if (!var10.contains("<!DOCTYPE")) {
                  var9.append(var10);
               }
            }

            String var11 = var9.toString();
            var8.u3();
            n5 var12 = new n5(var0);
            var12.u3(var11);
            var1 = var12.u3();
            if (var1 != null) {
               break;
            }
         }

         return var1;
      } catch (Exception var13) {
         return var1;
      }
   }
}
