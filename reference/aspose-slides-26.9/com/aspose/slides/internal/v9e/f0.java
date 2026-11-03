package com.aspose.slides.internal.v9e;

import com.aspose.slides.exceptions.XsltException;
import com.aspose.slides.ms.System.Xml.y5;

public final class f0 {
   public String n5;
   public String l6;
   public String k5;

   public final void n5() {
      this.n5 = com.aspose.slides.ms.System.d1.n5;
   }

   public final void n5(String var1) {
      String[] var2 = new String[]{this.n5};
      String[] var3 = new String[]{this.l6};
      n5(var1, var2, var3);
      this.n5 = var2[0];
      this.l6 = var3[0];
   }

   public static void n5(String var0, String[] var1, String[] var2) {
      var1[0] = com.aspose.slides.ms.System.d1.n5;
      var2[0] = com.aspose.slides.ms.System.d1.n5;
      int var3 = y5.l6(var0);
      if (var3 == 0) {
         throw XsltException.create("'{0}' is an invalid QName.", var0);
      }

      var2[0] = com.aspose.slides.ms.System.d1.l6(var0, 0, var3);
      if (var3 < var0.length()) {
         if (var0.charAt(var3) == ':') {
            int var4 = ++var3;
            var1[0] = var2[0];
            int var5 = y5.u3(var0, var3);
            var3 += var5;
            if (var5 == 0) {
               throw XsltException.create("'{0}' is an invalid QName.", var0);
            }

            var2[0] = com.aspose.slides.ms.System.d1.l6(var0, var4, var5);
         }

         if (var3 < var0.length()) {
            throw XsltException.create("'{0}' is an invalid QName.", var0);
         }
      }
   }

   public static boolean l6(String var0) {
      if (var0.length() == 0) {
         return false;
      }

      int var1 = y5.u3(var0, 0);
      return var1 == var0.length();
   }
}
