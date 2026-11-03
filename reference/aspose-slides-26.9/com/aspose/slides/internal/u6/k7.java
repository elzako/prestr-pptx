package com.aspose.slides.internal.u6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.h2.d5;

public abstract class k7 extends w1 implements d5, s7 {
   private com.aspose.slides.internal.h2.c8 c8;
   public List<n3> u9;
   public k5 h0;

   public k7(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      super.n5(var1);
      this.c8 = com.aspose.slides.internal.h2.c8.n5(var1);
   }

   protected final void n5(m1 var1, boolean var2) {
      int var3 = var1.b3();
      int var4 = var1.z7();
      int var5 = var1.v4();
      z1 var6 = this.e5();
      if (var6.b3()) {
         if (var3 + var4 - 1 > var6.v4()) {
            x8 var7 = j5.n5(this.q_().m1());
            var7.k5(this, this.m_());
         }
      } else {
         var6.a6(var3 + var4 - 1);

         while (this.u9.size() < var3 + var4 - 1) {
            this.u9.addItem(null);
         }
      }

      if (var2) {
         this.n5(var1, var3, var4);
      }

      if (var5 > 1) {
         for (int var8 = 0; var8 < var4; var8++) {
            this.u9.set_Item(var3 - 1 + var8, new n3(var5));
         }
      }

      this.h0.n5(var3, var3 + var4 - 1);
      var6.j4().n5(var1);
   }

   private void n5(m1 var1, int var2, int var3) {
      z1 var4 = this.e5();
      com.aspose.slides.internal.f2.k5 var5 = null;
      if (var1.a5().a6() != 9 && var3 == 1) {
         var5 = var1.a5();
      }

      for (int var6 = var2; var6 < var2 + var3; var6++) {
         m3 var7 = var4.u9(var6 - 1);
         if (var5 != null) {
            var7.n5(var5);
         }
      }
   }

   public abstract y2 b3();

   @Override
   public final k5 n5() {
      return this.h0;
   }

   @Override
   public final com.aspose.slides.internal.h2.c8 i1() {
      return this.c8;
   }
}
