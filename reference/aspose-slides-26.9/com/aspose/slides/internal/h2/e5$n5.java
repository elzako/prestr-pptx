package com.aspose.slides.internal.h2;

public class e5$n5 extends h2 implements Cloneable {
   public e5$n5(int var1) {
      super(var1);
   }

   @Override
   public a5 l6(a5 var1, com.aspose.slides.internal.e5.w1 var2, com.aspose.slides.internal.e5.t9 var3) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, z8.class)) {
         return new k7(var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, e5.class)) {
         return var1;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, v4.class)) {
         float var5 = var2.n5().q_().y4();
         return j5.n5(var1.u9().n5(), "px", 72.0F / var5);
      } else {
         com.aspose.slides.internal.f2.k5 var4 = var1.c8();
         return var4 != null ? (a5)var4 : this.n5(var1, var2, var3);
      }
   }
}
