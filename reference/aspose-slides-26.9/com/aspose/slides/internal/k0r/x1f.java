package com.aspose.slides.internal.k0r;

public class x1f extends k2p {
   public x1f(r5w var1) {
      super(var1);
      this.w1().n5(4000);
   }

   @Override
   public String l6() {
      String var1 = "";
      if (this.n5.length > 0) {
         com.aspose.slides.internal.l7h.t1 var2 = new com.aspose.slides.internal.l7h.t1();
         char[] var3 = var2.n5(this.n5);
         if (var3 != null) {
            var1 = com.aspose.slides.ms.System.d1.n5(var3);
         }
      }

      return var1;
   }

   @Override
   public void n5(String var1) {
      if (var1 != null) {
         com.aspose.slides.internal.l7h.t1 var2 = new com.aspose.slides.internal.l7h.t1();
         this.n5 = var2.l6(com.aspose.slides.ms.System.d1.c8(var1));
      }
   }
}
