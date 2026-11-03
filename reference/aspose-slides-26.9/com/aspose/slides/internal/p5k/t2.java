package com.aspose.slides.internal.p5k;

public class t2 extends d2 {
   public t2(l6 var1) {
      super(var1);
   }

   public final void n5(com.aspose.slides.internal.w0.h0 var1) {
      this.u9().l6(2, 2, false);
      this.u9().l6(0, 2, false);
      if (var1.l6() == null) {
         this.u9().l6(2, 4, false);
         this.n5(var1.u9(), (byte)0);
         this.n5(var1.h0(), (byte)-1);
      } else {
         this.u9().l6(var1.l6().length, 4, false);

         for (int var2 = 0; var2 < var1.l6().length; var2++) {
            com.aspose.slides.internal.p1s.n5 var3 = var1.l6()[var2].n5();
            byte var4 = com.aspose.slides.internal.v6g.k5.n5((Object)(var1.l6()[var2].l6() * 255.0F), 13);
            this.n5(var3, var4);
         }
      }
   }

   private void n5(com.aspose.slides.internal.p1s.n5 var1, byte var2) {
      this.u9().n5(var2 & 255);
      this.u9().l6(var1);
   }
}
