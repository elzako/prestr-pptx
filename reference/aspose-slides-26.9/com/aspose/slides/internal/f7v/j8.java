package com.aspose.slides.internal.f7v;

public class j8 extends e9 {
   private int x8;

   public j8(com.aspose.slides.internal.c5e.l6 var1) {
      super("zTXt", var1);
   }

   @Override
   public void n5(a6 var1) {
      int var2 = -1;

      for (int var3 = 0; var3 < var1.k5.length; var3++) {
         if (var1.k5[var3] == 0) {
            var2 = var3;
            break;
         }
      }

      if (var2 >= 0 && var2 <= var1.k5.length - 2) {
         this.t2 = com.aspose.slides.internal.c5e.h0.n5.l6(var1.k5, 0, var2);
         byte var5 = var1.k5[var2 + 1];
         if (var5 != 0) {
            this.s7 = "";
         } else {
            byte[] var4 = com.aspose.slides.internal.f7v.n5.n5(var1.k5, var2 + 2, var1.k5.length - var2 - 2, false);
            this.s7 = com.aspose.slides.internal.c5e.h0.n5.l6(var4);
         }
      } else {
         throw new com.aspose.slides.internal.c5e.e2("bad zTXt chunk: no separator found");
      }
   }

   public int l6() {
      return this.x8;
   }
}
