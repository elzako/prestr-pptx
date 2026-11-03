package com.aspose.slides;

class p6w {
   private n1g n5;
   private boolean l6;
   private final float k5;
   private final float u3;
   private final float a6 = 1.0F;
   private com.aspose.slides.internal.o9b.l6 u9;
   private com.aspose.slides.internal.o9b.z1 h0;

   public p6w(n1g var1, float var2, boolean var3) {
      this.k5 = var2;
      this.n5(var3);
      this.u3 = var1.d2().a0() != null ? var1.d2().a0().m1().n5()[0] : 1.0F;
      if (var3) {
         float var4 = this.k5 * this.u3;
         this.u9 = new com.aspose.slides.internal.o9b.l6(
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)(var4 * (var1.n3().getX() + var1.n3().getWidth()))), 14),
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)(var4 * (var1.n3().getY() + var1.n3().getHeight()))), 14),
            2498570
         );
         this.h0 = com.aspose.slides.internal.o9b.z1.n5(this.u9);
         this.h0.u9(4);
      }

      this.n5(var1);
   }

   public final void n5(com.aspose.slides.internal.o9b.t4 var1, com.aspose.slides.internal.s6.s0 var2, com.aspose.slides.internal.s6.v8 var3, float var4) {
      if (this.k5()) {
         this.h0
            .n5(
               var1,
               com.aspose.slides.internal.v6g.k5.u3(var2.n5() - var3.n5() / 2.0F, 13) * var4,
               com.aspose.slides.internal.v6g.k5.u3(var2.l6() - var3.l6() / 2.0F, 13) * var4,
               var3.n5() * var4,
               var3.l6() * var4
            );
      } else {
         this.l6()
            .d2()
            .n5(
               var1,
               com.aspose.slides.internal.v6g.k5.u3(var2.n5() - var3.n5() / 2.0F, 13),
               com.aspose.slides.internal.v6g.k5.u3(var2.l6() - var3.l6() / 2.0F, 13),
               var3.n5(),
               var3.l6()
            );
      }
   }

   public final void n5() {
      if (this.k5()) {
         float var1 = this.k5 * this.u3;
         this.l6()
            .d2()
            .n5(this.u9, 0, 0, com.aspose.slides.internal.v6g.k5.u3(this.u9.e2() / var1, 13), com.aspose.slides.internal.v6g.k5.u3(this.u9.h0() / var1, 13));
         this.h0.dispose();
         this.u9.dispose();
      }
   }

   public final n1g l6() {
      return this.n5;
   }

   private void n5(n1g var1) {
      this.n5 = var1;
   }

   public final boolean k5() {
      return this.l6;
   }

   private void n5(boolean var1) {
      this.l6 = var1;
   }

   public final float u3() {
      return this.k5;
   }

   public final float a6() {
      return this.u3;
   }

   public final float u9() {
      return 1.0F;
   }
}
