package com.aspose.slides.internal.b7;

final class j2p extends k1d {
   private final char n5;
   private com.aspose.slides.internal.g7.b6 l6;
   private final w1n k5;

   public final w1n n5() {
      return this.k5;
   }

   public j2p(char var1, w1n var2, com.aspose.slides.internal.g7.b6 var3) {
      this.n5 = var1;
      this.k5 = var2;
      this.l6 = var3;
   }

   @Override
   public j6 k5() {
      com.aspose.slides.internal.g7.r9 var1 = this.l6.s7().n5(this.n5);
      double var2 = (this.n5().h0() - this.l6.t2().n5(this.n5().h0())) * a6();
      double var4 = this.l6.t2().l6(var1);
      double var6 = var4 * this.n5().h0() / (this.l6.t2().u3() & 4294967295L) * a6();
      return new j6(var6, var2);
   }

   public final n7 l6() {
      n7 var1 = new n7();

      try {
         if (com.aspose.slides.ms.System.t9.t9(this.n5)) {
            return var1;
         }

         b8c var2 = new b8c(var1);
         com.aspose.slides.internal.g7.t0 var3 = new com.aspose.slides.internal.g7.t0(var2);
         double var4 = this.n5().h0();
         com.aspose.slides.internal.g7.v2 var6 = new com.aspose.slides.internal.g7.v2(new double[]{var4, 0.0, 0.0, -var4, 0.0, 0.0});
         var3.n5(this.l6, this.l6.s7().n5(this.n5), var6);
         float var7 = (float)a6();
         var1.k5();
         var1.l6(var7 * 4.0F, var7 * 4.0F, false);
         var1.a6();
         var1.h0();
         var1.l6(0.25, 0.25, false);
         var1.n5(this.u3().n5(), this.u3().l6(), false);
         var1.a6();
         return var1;
      } catch (RuntimeException var8) {
         var1.n5();
         throw var8;
      }
   }
}
