package com.aspose.slides.internal.w8;

import com.aspose.slides.ms.System.d1;

public class y1 extends com.aspose.slides.internal.w5.k5 {
   public y1(com.aspose.slides.internal.f5.e2 var1, com.aspose.slides.internal.f5.z1 var2) {
      super(var1, var2);
   }

   public final String j9() {
      return this.t2("type", d1.n5);
   }

   public final void m3(String var1) {
      this.n5("type", var1);
   }

   public final int z6() {
      return this.n5("value", 0, Integer.class);
   }

   public final void n5(int var1) {
      this.n5("value", var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.w5.a6 var1) {
      if (this.a3().k7().h0() != 21) {
         if ((this.a3().k7().h0() == 2 || this.p3() == null || this.p3().a3().k7().h0() == 1) && this.a3().w1() == 2) {
            var1.n5(this);
            this.l6(var1);
            var1.l6(this);
         } else {
            var1.n5((com.aspose.slides.internal.w5.k5)this);
            this.l6(var1);
            var1.l6((com.aspose.slides.internal.w5.k5)this);
         }
      }
   }
}
