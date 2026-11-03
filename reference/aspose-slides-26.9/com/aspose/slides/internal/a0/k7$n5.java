package com.aspose.slides.internal.a0;

import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

class k7$n5 {
   public int n5;
   public int l6;
   public int k5;
   public int u3;
   public double a6;
   public boolean u9;

   public k7$n5(int var1, int var2, int var3, int var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.a6 = 1.0;
      this.u9 = false;
   }

   @Override
   public String toString() {
      return d1.n5(
         j8.n5(this).s7(),
         ": diff=",
         a3.l6(this.l6),
         ", variation=",
         com.aspose.slides.ms.System.d2.u9(this.a6),
         ", stretch=",
         a3.l6(this.k5),
         ", shrink=",
         a3.l6(this.u3)
      );
   }
}
