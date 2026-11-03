package com.aspose.slides.internal.s6;

import com.aspose.slides.Collections.Generic.List;

public final class z3 extends o0 {
   private r4 a6 = new r4();
   private float u9;
   private float h0;

   public z3(k7 var1, b3 var2, w1 var3, int var4, float var5, float var6) {
      super(var1, var2, var3, var4);
      this.u9 = var5;
      this.h0 = var6;
   }

   public z3(k7 var1, b3 var2, List<w1> var3, int var4, float var5, float var6) {
      super(var1, var2, var3, var4);
      this.u9 = var5;
      this.h0 = var6;
   }

   @Override
   public o0$k5 n5(o0$l6 var1) {
      o0$k5 var2 = new o0$k5();
      this.a6.k5(var1.n5.h0()).n5(var2.n5);
      this.l6.k5().l6(var1.l6.h0()).l6(var2.l6);
      var1.k5.n5(var2.k5);
      v3 var3 = this.l6.k5().n5(var1.n5.h0()).h0();
      return var2;
   }

   @Override
   public g7 n5(o0$k5 var1) {
      g7 var2 = new g7();
      g7[] var3 = new g7[]{var2};
      this.n5.getPixel(var1.k5.n5(), var1.k5.l6(), var3);
      var3[0].n5(var2);
      float var4 = w2.n5(this.u9, this.h0, v3.k5(var1.l6.h0(), new v3(0.0F, 0.0F, 1.0F)));
      var2.u3(var2.u3() * var4);
      return var2;
   }

   @Override
   protected void n5() {
      r4.n5(r4.n5(this.l6.k5(), this.l6.n5()), this.l6.l6()).n5(this.a6);
   }
}
