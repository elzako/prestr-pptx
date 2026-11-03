package com.aspose.slides.internal.h2;

public class u9$n5 extends h2 implements Cloneable {
   public u9$n5(int var1) {
      super(var1);
   }

   @Override
   public a5 l6(a5 var1, com.aspose.slides.internal.e5.w1 var2, com.aspose.slides.internal.e5.t9 var3) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, u9.class)) {
         return var1;
      }

      com.aspose.slides.internal.e5.t9 var4 = var3 == null ? var2.n5() : var3;
      com.aspose.slides.internal.y1.u3 var5 = var4 == null ? null : var4.q_();
      com.aspose.slides.internal.o9b.c8 var6 = var1.n5(var5).o8();
      return !var6.t2() ? new u9(var6.o8(), null) : this.n5(var1, var2, var3);
   }
}
