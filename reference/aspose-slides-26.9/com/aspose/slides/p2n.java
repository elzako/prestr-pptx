package com.aspose.slides;

abstract class p2n extends a0p {
   private t9z l6;

   protected p2n(t9z var1) {
      super(var1.t9());
      this.l6 = var1;
   }

   protected final String h0() {
      return this.l6.y4().k5();
   }

   protected final t9z n3() {
      return this.l6;
   }

   protected static double n5(double var0) {
      if (com.aspose.slides.ms.System.d2.u9(com.aspose.slides.ms.System.q1.n5(var0)).length() > 11) {
         int var2 = com.aspose.slides.ms.System.d2.u9(com.aspose.slides.ms.System.q1.n5(var0)).length();
         double var3 = com.aspose.slides.ms.System.q1.n5(var0 % 1.0) > 0.0
            ? com.aspose.slides.ms.System.d2.u9(com.aspose.slides.ms.System.q1.n5(var0 % 1.0)).length() - 2
            : 0.0;
         if (var3 > 0.0) {
            if (var2 - 11 <= var3) {
               int var5 = com.aspose.slides.internal.v6g.k5.u3(var3 - (var2 - 11), 14);
               if (var5 > 15) {
                  var5 = 15;
               }

               var0 = com.aspose.slides.ms.System.q1.n5(var0, var5);
            } else {
               var0 = com.aspose.slides.ms.System.q1.n5(var0, 0);
            }
         }
      }

      return var0;
   }
}
