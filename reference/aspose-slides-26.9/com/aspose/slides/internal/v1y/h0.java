package com.aspose.slides.internal.v1y;

import com.aspose.slides.internal.x4g.m1;

public class h0 extends l6<u9> {
   public h0(com.aspose.slides.internal.t9z.h0 var1, com.aspose.slides.internal.x4g.u9 var2) {
      super(var1, var2);
   }

   @Override
   protected com.aspose.slides.internal.x4g.s7 k5() {
      return this.u3.n3();
   }

   @Override
   protected u9 u3() {
      return new u9();
   }

   @Override
   protected void k5(u9 var1) {
      float var2 = var1.h0[0];
      float var3 = var1.h0[1];
      float var4 = var1.a6;
      float var5 = var1.u9;
      double var6 = com.aspose.slides.internal.e3j.u9.k5(var1.k5, var1.u3, var2, var3);
      float var8 = this.u3.t2() * this.l6.q0();
      if (!(var6 < var8)) {
         if (var6 == var1.l6) {
            var1.t2.l6();
            var1.t2.l6(com.aspose.slides.internal.v9l.l6.l6(var2, var3));
            var1.x8 = true;
         } else if (var6 > var1.l6) {
            var1.t2.l6(com.aspose.slides.internal.v9l.l6.l6(var2, var3));
            var1.x8 = true;
            if (var1.k5 != var4 || var1.u3 != var5) {
               float var9 = this.n5(var1, var4, var5, var2, var3);
               if (var9 != 0.0F) {
                  m1 var10 = new m1();
                  var10.n5((float)Math.toDegrees(var9));
                  this.u3.n3().l6(var10);
                  var1.s7 = this.u3;
               }
            }
         }
      }

      this.n5(var1, var2, var3);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   protected void l6(u9 bridgeArg0) {
      this.k5(bridgeArg0);
   }

}
