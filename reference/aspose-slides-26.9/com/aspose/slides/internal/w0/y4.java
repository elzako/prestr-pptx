package com.aspose.slides.internal.w0;

import com.aspose.slides.internal.o9b.y1;

public class y4 extends t9 {
   protected com.aspose.slides.internal.o9b.t4 n5;
   private com.aspose.slides.internal.p1s.n5[] l6;
   private byte[] k5;
   private float u3 = -Float.MAX_VALUE;
   private y1 a6 = y1.n5.y4();

   public y4(byte[] var1) {
      this(var1, 0);
   }

   public y4(byte[] var1, int var2) {
      super(2);
      this.n5(var1);
      this.n5(new c8());
      this.n5(var2);
   }

   public final byte[] l6() {
      return this.k5;
   }

   public final void n5(byte[] var1) {
      this.k5 = var1;
   }

   public final float k5() {
      return this.u3;
   }

   public final void n5(float var1) {
      this.u3 = var1;
   }

   public final com.aspose.slides.internal.p1s.n5[] u3() {
      return this.l6;
   }

   public final y1 a6() {
      return this.a6;
   }

   public com.aspose.slides.internal.o9b.t4 u9() {
      if (this.n5 == null) {
         if (com.aspose.slides.internal.k4d.a6.q0(this.l6())) {
            com.aspose.slides.internal.y6.l6 var1 = com.aspose.slides.internal.y6.l6.n5(new com.aspose.slides.internal.z0k.e2(this.l6()));
            this.n5 = var1.u3();
         } else {
            this.n5 = com.aspose.slides.internal.o9b.t4.n5(new com.aspose.slides.internal.z0k.e2(this.l6()));
         }
      }

      return this.n5;
   }
}
