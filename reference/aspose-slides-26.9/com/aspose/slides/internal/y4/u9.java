package com.aspose.slides.internal.y4;

import com.aspose.slides.ms.System.f0;
import com.aspose.slides.ms.System.j8;

public class u9 extends com.aspose.slides.internal.k5.u9 {
   private short n5;
   private String l6;

   public u9(com.aspose.slides.internal.z8.y4 var1) {
      super((short)3);
      this.n5 = var1.n5();
      this.l6 = var1.t2();
   }

   @Override
   public String u9() {
      return this.l6;
   }

   @Override
   public void n5(String var1) {
      throw new com.aspose.slides.internal.j3.l6((byte)9);
   }

   @Override
   protected boolean n5(com.aspose.slides.internal.k5.u9 var1) {
      u9 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, u9.class);
      if (j8.l6(null, var2)) {
         return false;
      } else {
         return j8.l6(this, var2) ? true : f0.l6(this.n5, this.n5);
      }
   }
}
