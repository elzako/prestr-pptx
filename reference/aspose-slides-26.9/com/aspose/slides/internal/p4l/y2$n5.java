package com.aspose.slides.internal.p4l;

import com.aspose.slides.ms.System.d1;

class y2$n5 {
   private int n5;
   private String l6;

   public y2$n5(String var1, int var2) {
      this.n5 = var2;
      this.l6 = var1;
   }

   public boolean n5(String var1) {
      if (this.n5 != 1) {
         return this.n5 == 2 ? d1.u3(this.l6, var1, (short)3) : true;
      } else {
         return this.l6 == null && var1 != null || d1.a6(this.l6, var1);
      }
   }
}
