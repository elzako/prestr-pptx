package com.aspose.slides.internal.x9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p3.j4;
import com.aspose.slides.internal.p3.j8;
import com.aspose.slides.internal.p3.t1;

class m1$n5 extends com.aspose.slides.internal.p3.k5 {
   private m1 a6;
   private t1 u9;

   public m1$n5(m1 var1, com.aspose.slides.internal.v8.u9 var2, t1 var3) {
      super(var1, var2);
      this.a6 = var1;
      this.u9 = var3;
   }

   @Override
   protected t1 x8() {
      t1 var1 = super.x8();
      var1.n5(((com.aspose.slides.internal.v4.z1)m1.n5(this.a6)).f0());
      return var1;
   }

   @Override
   protected List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2) {
      List var3 = new List();

      com.aspose.slides.internal.p3.y2 var4;
      while ((var4 = this.a6.q0()) != null) {
         t1 var5 = new t1(0);
         var5.n5(var1.q0());
         var5.l6(var1.z3());
         var5.n5(((com.aspose.slides.internal.v4.z1)m1.l6(this.a6)).f0());
         List var6 = null;
         if (!var4.m3()) {
            var6 = var4.n5(var5, var2);
         }

         if (var6 != null) {
            m1.n5(this.a6, var6, var3);
         }

         com.aspose.slides.internal.v8.u9 var7 = this.u9.f2();
         if (var7 != null) {
            var7 = var7.u9(var5.f2().n5()).h0(var5.f2().k5());
         } else {
            var7 = var5.f2();
         }

         this.u9.l6(var7);
      }

      j4.n5(var3);
      this.a6.k5(true);
      return var3;
   }

   @Override
   protected void n5(com.aspose.slides.internal.r4.y4<j8> var1, t1 var2) {
      this.k5().n5(var1, var2);
   }

   @Override
   protected int n5() {
      return ((com.aspose.slides.internal.v4.z1)m1.k5(this.a6)).u6();
   }
}
