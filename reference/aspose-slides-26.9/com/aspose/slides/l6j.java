package com.aspose.slides;

class l6j extends v6g {
   private int n5;
   private int l6;
   private final p4t[] k5;

   public final int u3() {
      return this.n5;
   }

   public l6j(g3y[] var1) {
      if (var1.length > 0) {
         ChartSeries var2 = var1[0].u9();
         int var3 = var2.getFirstSliceAngle() & 65535;
         this.n5 = var2.getDoughnutHoleSize() & 255;
         this.k5 = new p4t[var1.length];

         for (int var4 = 0; var4 < var1.length; var4++) {
            g3y var5 = var1[var4];
            p4t var6;
            if (var4 == var1.length - 1) {
               this.l6 = var5.u9().getExplosion();
               var6 = new p4t(var3, this.l6, var5.u9(), var1[var4].c8().toArray(new t9z[0]));
            } else {
               var6 = new p4t(var3, -1, var5.u9(), var1[var4].c8().toArray(new t9z[0]));
            }

            this.k5[var4] = var6;
            this.n5(var6);
         }
      } else {
         this.k5 = new p4t[0];
      }
   }

   @Override
   protected void n5(z5 var1) {
      a9v var2 = ((a9v)var1).u9();
      float var3 = var2.n5() / 2.0F;
      float var4 = this.n5 / 100.0F;
      float var5 = 1.0F - var4;
      float var6 = 1.0F / (1.0F + this.l6 / 100.0F);
      var4 *= var6;
      var5 *= var6;
      float var7 = var3 * var4;
      float var8 = var3 * var5 / this.k5.length;

      for (p4t var12 : this.k5) {
         var12.n3(n5(var7, var2, var8));
         var7 += var8;
      }
   }

   @Override
   protected void l6(z5 var1) {
      for (p4t var5 : this.k5) {
         float var6 = var1.n5() - var5.d2();
         float var7 = var1.l6() - var5.d5();
         var5.a6(var6 / 2.0F);
         var5.u9(var7 / 2.0F);
         var5.t1();
      }
   }

   @Override
   protected void l6() {
      for (v6g var4 : this.a0()) {
         var4.U_();
      }
   }

   private static t3o n5(float var0, a9v var1, float var2) {
      float var3 = var0 + var2;
      a9v var4 = var1.n5(var3 * 2.0F, var3 * 2.0F);
      return new t3o(var0, var4.n5(), var4.l6(), var4.u3(), var4.a6());
   }
}
