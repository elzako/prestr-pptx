package com.aspose.slides.internal.d4n;

import java.util.ArrayList;
import java.util.List;

class n5$n5 {
   String n5;
   String l6;

   static List<n5$n5> n5(String... var0) {
      ArrayList var1 = new ArrayList();
      String var2 = "";
      String var3 = "";

      for (int var4 = 0; var4 < var0.length; var4 += 2) {
         var2 = var0[var4];
         var3 = var0[var4 + 1];
         n5$n5 var5 = new n5$n5(var2, var3);
         var1.add(var5);
      }

      return var1;
   }

   n5$n5(String var1, String var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public String n5() {
      return this.n5;
   }

   public String l6() {
      return this.l6;
   }
}
