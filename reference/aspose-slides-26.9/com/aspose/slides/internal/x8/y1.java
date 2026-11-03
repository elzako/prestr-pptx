package com.aspose.slides.internal.x8;

import com.aspose.slides.ms.System.d1;

public class y1 extends i1 {
   private String n5;

   public y1(String var1) {
      super("dir(");
      if (!"ltr".equals(var1) && !"rtl".equals(var1) && !"auto".equals(var1)) {
         throw new com.aspose.slides.internal.z8.m1(var1);
      }

      this.n5 = var1;
   }

   @Override
   public boolean n5(com.aspose.slides.internal.j3.z3 var1, String var2) {
      String var3 = l6(var1);
      return d1.a6(var3, this.n5) ? true : d1.a6(var3, "auto") && d1.a6(this.n5, "ltr");
   }

   private static String l6(com.aspose.slides.internal.j3.z3 var0) {
      if (var0.t2("dir")) {
         String var1 = var0.u3("dir");
         if (!"ltr".equals(var1) || !"rtl".equals(var1) || !"auto".equals(var1)) {
            return var1;
         }
      }

      return var0.a5() != null && var0.a5().n3() == 1 ? l6(com.aspose.slides.internal.v6g.k5.n5(var0.a5(), com.aspose.slides.internal.j3.z3.class)) : "auto";
   }

   @Override
   public String a6() {
      return d1.n5(":{0}{1})",new Object[]{ "dir(", this.n5});
   }
}
