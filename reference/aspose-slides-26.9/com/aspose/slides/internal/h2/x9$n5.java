package com.aspose.slides.internal.h2;

import com.aspose.slides.ms.System.d1;

public class x9$n5 extends h2 implements Cloneable {
   public x9$n5(int var1) {
      super(var1);
   }

   @Override
   public a5 n5(com.aspose.slides.internal.e5.w1 var1, String var2, com.aspose.slides.internal.e5.t9 var3) {
      int var4 = var2.length() - 1;
      if (var4 > 0) {
         char var5 = var2.charAt(0);
         if ((var5 == '"' || var5 == '\'') && var2.charAt(var4) == var5) {
            return new x9(d1.l6(var2, 1, var4), null);
         }

         String var6 = this.k5(var2);
         if (var6 != null) {
            var2 = var6;
         }
      }

      return x9.l6(var2);
   }
}
