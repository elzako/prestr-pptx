package com.aspose.slides;

class z4n implements x4j {
   private final com.aspose.slides.internal.o9b.l6 n5;
   private final com.aspose.slides.internal.o9b.l6 l6;
   private final boolean k5;
   private final c2l u3;

   public z4n(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.o9b.l6 var2, boolean var3, com.aspose.slides.ms.System.i9 var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      int var5 = var3 ? var1.h0() : var1.e2();
      this.u3 = new c2l(var5, var4);
   }

   @Override
   public final void n5(float var1, com.aspose.slides.internal.o9b.z1 var2) {
      this.u3.n5(var1);
      com.aspose.slides.internal.o9.n5.n5(
         this.n5,
         this.l6,
         com.aspose.slides.internal.w0.t4.n5.n5(),
         com.aspose.slides.internal.w0.t4.n5.n5(),
         new com.aspose.slides.internal.w0.t4(this.n5.e2(), this.n5.h0()),
         new z4n$1(this)
      );
      var2.l6(this.n5, 0, 0);
   }

   private int n5(com.aspose.slides.internal.w0.t4 var1, int var2, int var3) {
      float[] var4 = this.u3.n5();
      float var5 = this.k5 ? var4[var1.u3] : var4[var1.k5];
      return r2t.n5(var2, var3, var5);
   }

   // $VF: synthetic method
   static int n5(z4n var0, com.aspose.slides.internal.w0.t4 var1, int var2, int var3) {
      return var0.n5(var1, var2, var3);
   }
}
