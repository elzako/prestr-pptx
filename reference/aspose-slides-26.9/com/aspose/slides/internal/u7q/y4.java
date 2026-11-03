package com.aspose.slides.internal.u7q;

import com.aspose.slides.internal.w2i.z3;

public class y4 extends l6 {
   private z3 t2 = new z3();

   @Override
   public void n5(com.aspose.slides.internal.w2i.s7 var1) {
      this.h0 = (int)var1.k5();
      this.y4();
      this.c8 = var1.k5();
      this.t2.n5 = (int)var1.k5() / 65536.0F;
      this.t2.l6 = (int)var1.k5() / 65536.0F;
      this.t2.k5 = (int)var1.k5() / 65536.0F;
   }

   @Override
   protected void y4() {
      if (this.h0 != 1482250784) {
         throw new com.aspose.slides.internal.d3l.h0();
      }
   }

   public final z3 e2() {
      return this.t2;
   }
}
