package com.aspose.slides.internal.s6;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.q1;

class u6$n5 {
   private com.aspose.slides.internal.o9b.l6 n5;
   private byte[] l6;
   private float k5;

   public u6$n5(com.aspose.slides.internal.o9b.l6 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("texture");
      }

      this.n5(var1);
      this.n5(new s0(var1.e2(), var1.h0()).k5() / (float)q1.z3(2.0));
   }

   public final void n5() {
      com.aspose.slides.internal.o9b.y2 var1 = new com.aspose.slides.internal.o9b.y2(0, 0, this.l6().e2(), this.l6().h0());
      com.aspose.slides.internal.j9e.n5 var2 = this.l6().n5(var1.n3(), 1, 2498570);
      int var3 = q1.n5(var2.a6()) * this.l6().h0();
      this.n5(new byte[var3]);
      com.aspose.slides.internal.e3m.n5.n5(var2.u3(), this.k5(), 0, var3);
      this.l6().n5(var2);
   }

   public final com.aspose.slides.internal.o9b.l6 l6() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.o9b.l6 var1) {
      this.n5 = var1;
   }

   public final byte[] k5() {
      return this.l6;
   }

   public final void n5(byte[] var1) {
      this.l6 = var1;
   }

   public final float u3() {
      return this.k5;
   }

   public final void n5(float var1) {
      this.k5 = var1;
   }
}
