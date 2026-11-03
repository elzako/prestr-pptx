package com.aspose.slides.internal.t2;

public class u3 extends com.aspose.slides.internal.c8.u3 {
   private float n5;
   private float l6;

   public u3(String var1, com.aspose.slides.internal.k5.u9 var2) {
      super(var1, var2);
      com.aspose.slides.internal.k5.h0 var3 = com.aspose.slides.internal.v6g.k5.n5(var2, com.aspose.slides.internal.k5.h0.class);
      if (var3 != null) {
         this.n5 = ((com.aspose.slides.internal.k5.u3)var3.n5(0)).n5((short)1);
         this.l6 = ((com.aspose.slides.internal.k5.u3)var3.n5(2)).n5((short)1);
      }
   }

   @Override
   public boolean n5(com.aspose.slides.internal.u3.l6 var1) {
      return this.n5 / this.l6 == (float)var1.k5().l6() / var1.k5().k5();
   }
}
