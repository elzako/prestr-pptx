package com.aspose.slides.internal.h2;

import com.aspose.slides.ms.System.q1;

public class y2 extends z8$n5 {
   private a5[] h0 = null;

   public y2(int var1) {
      super(var1);
   }

   @Override
   public a5 l6(a5 var1, com.aspose.slides.internal.e5.w1 var2, com.aspose.slides.internal.e5.t9 var3) {
      if (var1.a6() == 85) {
         return this.l6(var2.h0(this.l6()), -1);
      } else {
         return var1.a6() == 160 ? this.l6(var2.h0(this.l6()), 1) : super.l6(var1, var2, var3);
      }
   }

   private a5 l6(a5 var1, int var2) {
      if (this.h0 == null) {
         this.h0 = new a5[]{
            this.n5("ultra-condensed"),
            this.n5("extra-condensed"),
            this.n5("condensed"),
            this.n5("semi-condensed"),
            this.n5("normal"),
            this.n5("semi-expanded"),
            this.n5("expanded"),
            this.n5("extra-expanded"),
            this.n5("ultra-expanded")
         };
      }

      int var3 = var1.a6();

      for (int var4 = 0; var4 < this.h0.length; var4++) {
         if (var3 == this.h0[var4].a6()) {
            var4 = q1.l6(q1.n5(0, var4 + var2), this.h0.length - 1);
            return this.h0[var4];
         }
      }

      return this.h0[4];
   }
}
