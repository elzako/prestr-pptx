package com.aspose.slides.internal.g7;

class x7i implements q7 {
   private w4w n5;
   private p6r l6;

   x7i(w4w var1, p6r var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public final boolean n5(g2x var1, int[] var2) {
      int var3 = this.n5.l6().k5(var1.n5(var2[0]).n5());
      if (var3 == -1) {
         return false;
      }

      int var4 = var2[0];

      while (++var4 != var1.l6()) {
         if (!j3b.n5(var1.n5(var4).n5(), var1.u9().l6().m1(), this.l6)) {
            int var5 = this.n5.a6().l6(var1.n5(var2[0]).n5());
            if (var5 == -1) {
               throw new r7c(
                  com.aspose.slides.ms.System.d1.n5(
                     com.aspose.slides.ms.System.d1.n5(new String[]{
                        "First glyph in pair with ID={0} presents in coverage but doesn't ", "presents in class definition table"
                     }),
                     new Object[]{var1.n5(var2[0]).n5()}
                  )
               );
            }

            int var6 = this.n5.u9().l6(var1.n5(var4).n5());
            if (var6 == -1) {
               return false;
            }

            if (var5 < this.n5.h0() && var6 < this.n5.c8()) {
               return this.n5(var1, var2, var5, var6, var4);
            }

            return false;
         }
      }

      return false;
   }

   private boolean n5(g2x var1, int[] var2, int var3, int var4, int var5) {
      boolean var6 = false;
      k1d var7 = this.n5.t2()[var3].n5()[var4];
      if (com.aspose.slides.internal.v6g.k5.k5(this.n5.k5(), 8) != 0) {
         j3b.n5(var7.n5(), var1.n5(var2[0]).l6(), var1);
         if (!var6) {
            var6 = true;
         }
      }

      if (com.aspose.slides.internal.v6g.k5.k5(this.n5.u3(), 8) != 0) {
         j3b.n5(var7.l6(), var1.n5(var2[0]).l6(), var1);
         if (!var6) {
            var6 = true;
         }

         var5++;
      }

      var2[0] = var5;
      return var6;
   }
}
