package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;

final class n8z {
   private int n5;
   private int l6;
   private static final Dictionary<String, n8z> k5 = new Dictionary<>(com.aspose.slides.ms.System.p6.l6());

   static int n5(String var0, int var1) {
      if (var0 == null) {
         return var1;
      }

      n8z var2 = null;
      n8z[] var3 = new n8z[]{var2};
      k5.tryGetValue(var0, var3);
      var2 = var3[0];
      return var2 == null ? var1 : var1 & var2.n5 | var2.l6;
   }

   private n8z(int var1, int var2) {
      this.n5 = ~var1;
      this.l6 = var2;
   }

   static {
      k5.addItem("arial black", new n8z(1, 0));
      k5.addItem("arial narrow bold", new n8z(0, 1));
      k5.addItem("franklin gothic medium", new n8z(1, 0));
      k5.addItem("aharoni", new n8z(0, 1));
      k5.addItem("Berlin Sans FB Demi", new n8z(0, 1));
      k5.addItem("Harlow Solid Italic", new n8z(0, 2));
   }
}
