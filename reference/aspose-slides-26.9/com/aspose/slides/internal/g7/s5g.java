package com.aspose.slides.internal.g7;

class s5g implements q7 {
   private t5g n5;
   private p6r l6;

   s5g(t5g var1, p6r var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public final boolean n5(g2x var1, int[] var2) {
      int var3 = this.n5.l6().k5(var1.n5(var2[0]).n5());
      if (var3 == -1) {
         return false;
      }

      int var4 = var2[0] - 1;
      if (var4 < 0) {
         return false;
      }

      int var5 = this.n5.k5().k5(var1.n5(var4).n5());
      return var5 == -1 ? false : this.n5(var1, var3, var5, var2, var4);
   }

   private boolean n5(g2x var1, int var2, int var3, int[] var4, int var5) {
      y4k var6 = this.n5.u3().n5(var2);
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int[] var11 = new int[]{0};
      int[] var12 = new int[]{0};
      j3b.n5(var6.l6(), var1, var11, var12);
      var7 = var11[0];
      var8 = var12[0];
      u1s var13 = this.n5.a6().n5(var3);
      int[] var14 = new int[]{0};
      int[] var15 = new int[]{0};
      j3b.n5(var13.n5(var6.n5()), var1, var14, var15);
      var9 = var14[0];
      var10 = var15[0];
      var1.n5(var4[0]).l6().u3(var9 - var7 - com.aspose.slides.internal.v6g.k5.u3(var1.u9().t2().l6(var1.n5(var5).n5()), 14));
      var1.n5(var4[0]).l6().a6(var10 - var8);
      var1.n5(var4[0]).l6().u9(0);
      var1.n5(var4[0]).l6().h0(0);
      var4[0]++;
      return true;
   }
}
