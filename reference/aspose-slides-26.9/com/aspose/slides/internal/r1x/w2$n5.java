package com.aspose.slides.internal.r1x;

import com.aspose.slides.ms.System.d1;

class w2$n5 {
   private final v3 n5;
   private int l6;
   private int k5;

   public w2$n5(v3 var1, int var2, int var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   public final v3 n5() {
      return this.n5;
   }

   public final int l6() {
      return this.l6;
   }

   public final void n5(int var1) {
      if (var1 >= 0 && var1 <= this.n5.u3()) {
         if (var1 < this.l6) {
            this.l6 = var1;
         }

         this.k5 = var1;
      } else {
         throw new com.aspose.slides.internal.z3b.k5(d1.n5("Can't set left position with {0} because of this value exceeds stream range", new Object[]{var1}));
      }
   }
}
