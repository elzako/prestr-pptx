package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;

class f5$n5 extends l6 {
   private f5 u3;
   private int a6;
   private int u9;
   private int h0 = 0;

   public f5$n5(f5 var1, int var2, int var3) {
      this.u3 = var1;
      this.u9 = var2;
      this.a6 = var3;
   }

   @Override
   protected boolean a6() {
      return false;
   }

   public final boolean n3() {
      return this.h0 != 0;
   }

   public final int y4() {
      return this.h0;
   }

   @Override
   protected a0 c8() {
      return new f5$n5$n5(this);
   }

   @Override
   protected y2 k5() {
      return this.u3;
   }

   @Override
   protected t1 x8() {
      t1 var1 = super.x8();
      var1.l6(this.u9);
      return var1;
   }

   @Override
   protected List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2) {
      List var3 = new List();

      y2 var4;
      while ((var4 = this.u3.q0()) != null) {
         t1 var5 = new t1(0);
         var5.n5(var1.q0());
         var5.l6(var1.z3());
         var5.n5(var1.y1());
         List var6 = null;
         boolean var7 = com.aspose.slides.internal.v6g.k5.l6(var4, com.aspose.slides.internal.x9.e5.class);
         if (!var4.m3()) {
            var6 = var4.n5(var5, var2);
         }

         if (var6 != null && !var7) {
            this.u3.n5(var6, var3);
         }
      }

      j4.n5(var3);
      this.u3.k5(true);
      return var3;
   }

   @Override
   protected int n5() {
      return this.a6;
   }

   @Override
   protected boolean l6() {
      return !this.u3.m3();
   }

   @Override
   protected void n5(com.aspose.slides.internal.r4.y4<j8> var1, t1 var2) {
      com.aspose.slides.internal.p3.h0.n5(this.u3, var1, var2);
   }

   @Override
   protected void n5(j9 var1, int var2, l6$n5 var3, l6$n5 var4) {
      if (var2 > 1) {
         l6$l6 var5 = var1.t9().get_Item(0);
         int var6 = q0.n5(var4, var4.n5, var5.n5());
         this.h0 = this.h0 + (var1.y4 - var6);
      }

      var1.z1();
      this.l6(var1, 1, var3, var4);
   }

   @Override
   protected void n5(j9 var1, l6$l6 var2) {
   }

   @Override
   protected y2 u3() {
      return null;
   }

   // $VF: synthetic method
   static int n5(f5$n5 var0) {
      return var0.h0;
   }

   // $VF: synthetic method
   static int n5(f5$n5 var0, int var1) {
      return var0.h0 = var1;
   }
}
