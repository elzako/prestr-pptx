package com.aspose.slides.internal.b7s;

class j5$n5 {
   private final j5$l6[] n5 = (j5$l6[])com.aspose.slides.ms.System.u3.n5(
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(j5$l6.class), 256)
   );

   public j5$n5() {
   }

   public final void n5(byte var1, j5$l6 var2) {
      com.aspose.slides.internal.f8y.n5.n5(var2.l6() <= 8, "Invalid length of the Golomb code.");

      for (int var3 = 0; var3 < 1 << 8 - var2.l6(); var3++) {
         int var4 = ((var1 & 255) << 8 - var2.l6()) + var3;
         com.aspose.slides.internal.f8y.n5.n5(this.n5[var4].l6() == 0, "The length of the unintialized Golomb code must be equal to zero.");
         var2.n5(this.n5[var4]);
      }
   }

   public final j5$l6 n5(int var1) {
      return this.n5[var1];
   }

   static {
      com.aspose.slides.internal.v6g.k5.n5(j5$l6.class, new w1());
   }
}
