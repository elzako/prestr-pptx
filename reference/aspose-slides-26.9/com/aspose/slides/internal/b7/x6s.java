package com.aspose.slides.internal.b7;

final class x6s extends m6n {
   private final double n5;
   private String l6;
   private double k5;
   private com.aspose.slides.internal.g7.b6 u3;
   private r6i a6;
   private final w1n u9;

   public x6s(w1n var1, j6 var2) {
      this.u9 = var1.c8();
      this.x8();
      this.s7();
      this.k5 = 0.0;
      this.n5 = (this.n5().h0() - this.u3.t2().n5(this.n5().h0())) * a6();
      this.l6 = com.aspose.slides.ms.System.d1.n5;
   }

   public final w1n n5() {
      return this.u9;
   }

   public final void l6() {
      double var1 = 0.0;

      for (int var3 = 0; var3 < this.l6.length(); var3++) {
         char var4 = this.l6.charAt(var3);
         if (var3 > 0) {
            char var5 = this.l6.charAt(var3 - 1);
            double var6 = this.n5(var5, var4);
            var1 += var6;
         }

         j2p var8 = new j2p(var4, this.n5(), this.u3);
         var8.n5(new w9(var1, 0.0));
         this.n5(var8);
         var1 += var8.k5().n5();
      }
   }

   @Override
   public j6 k5() {
      return new j6(this.k5, this.n5);
   }

   public final String c8() {
      return this.l6;
   }

   public final void n5(char var1) {
      if (this.l6.length() > 0) {
         char var2 = this.l6.charAt(this.l6.length() - 1);
         double var3 = this.n5(var2, var1);
         this.k5 += var3;
      }

      j2p var5 = new j2p(var1, this.n5(), this.u3);
      double var6 = var5.k5().n5();
      this.k5 = this.k5 + (var6 + this.n5().u9());
      this.l6 = com.aspose.slides.ms.System.d1.n5(new Object[]{this.l6, var1});
   }

   public final char t2() {
      char var1 = this.l6.charAt(this.l6.length() - 1);
      if (this.l6.length() > 1) {
         char var2 = this.l6.charAt(this.l6.length() - 2);
         double var3 = this.n5(var2, var1);
         this.k5 -= var3;
      }

      j2p var5 = new j2p(var1, this.n5(), this.u3);
      double var6 = var5.k5().n5();
      this.k5 -= var6;
      this.l6 = com.aspose.slides.ms.System.d1.l6(this.l6, 0, this.l6.length() - 1);
      return var1;
   }

   private void s7() {
      this.u3 = n5u.n5().n5(this.a6.n5(), this.n5().u3(), this.n5().a6());
   }

   private void x8() {
      this.a6 = this.n5().k5();
   }

   private double n5(char var1, char var2) {
      com.aspose.slides.internal.g7.r9 var3 = this.u3.s7().n5(var1);
      com.aspose.slides.internal.g7.r9 var4 = this.u3.s7().n5(var2);
      double var5 = this.u3.t2().n5(var3, var4);
      return var5 * this.n5().h0() / (this.u3.t2().u3() & 4294967295L) * a6();
   }
}
