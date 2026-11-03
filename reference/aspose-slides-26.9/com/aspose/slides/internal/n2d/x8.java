package com.aspose.slides.internal.n2d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class x8 {
   private static final com.aspose.slides.internal.l7h.j5 n5 = l6();
   private static com.aspose.slides.internal.l7h.j5 l6 = null;

   public static com.aspose.slides.internal.l7h.j5 n5(String var0) {
      return com.aspose.slides.internal.l7h.j5.k5(var0);
   }

   public static com.aspose.slides.internal.l7h.j5 n5(int var0) {
      return com.aspose.slides.internal.l7h.j5.u3(var0);
   }

   public static void n5(com.aspose.slides.internal.l7h.j5 var0) {
      l6 = var0;
   }

   public static com.aspose.slides.internal.l7h.j5 n5() {
      return l6 != null ? l6 : n5;
   }

   private static com.aspose.slides.internal.l7h.j5 l6() {
      String var0 = "HKEY_LOCAL_MACHINE\\SYSTEM\\CurrentControlSet\\Control\\Nls\\CodePage";
      String var1 = "ACP";
      String var2 = n5("HKEY_LOCAL_MACHINE\\SYSTEM\\CurrentControlSet\\Control\\Nls\\CodePage", "ACP");
      if (var2 != null) {
         try {
            Integer var3 = Integer.parseInt(var2);
            return n5(var3);
         } catch (Exception var4) {
            return n5(1252);
         }
      } else {
         return n5(1252);
      }
   }

   private static String n5(String var0, String var1) {
      BufferedReader var2 = null;
      Process var3 = null;

      try {
         String[] var4 = new String[]{"reg", "query", var0, "/v", var1};
         var3 = Runtime.getRuntime().exec(var4);
         var2 = new BufferedReader(new InputStreamReader(var3.getInputStream()));

         String var5;
         while ((var5 = var2.readLine()) != null) {
            if (var5.contains(var1)) {
               String[] var6 = var5.split("\\s+", 4);
               if (var6.length == 4) {
                  return var6[3];
               }
            }
         }

         int var24 = var3.waitFor();
         if (var24 != 0) {
            return null;
         }
      } catch (IOException var21) {
         return null;
      } catch (InterruptedException var22) {
         return null;
      } finally {
         if (var2 != null) {
            try {
               var2.close();
            } catch (IOException var20) {
            }
         }

         if (var3 != null) {
            var3.destroy();
         }
      }

      return null;
   }
}
