package com.aspose.slides.internal.h2;

import com.aspose.slides.ms.System.d1;

public class c8 {
   private static final c8 n5 = new c8(null, null);
   private final String l6;
   private final String k5;

   private c8(String var1, String var2) {
      this.l6 = var1;
      this.k5 = var2;
   }

   public static c8 n5(com.aspose.slides.internal.e5.w1 var0) {
      String var1 = var0.u3(221).j_();
      if (d1.a6("none", var1)) {
         var1 = null;
      }

      String var2 = var0.u3(212).j_();
      if (d1.a6("none", var2)) {
         var2 = null;
      }

      return var1 == null && var2 == null ? n5 : new c8(var1, var2);
   }

   public final String n5() {
      return this.k5;
   }
}
