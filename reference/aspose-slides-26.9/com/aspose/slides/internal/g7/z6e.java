package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class z6e implements q7 {
   private j8m n5;
   private p6r l6;

   public z6e(j8m var1, p6r var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public final boolean n5(g2x var1, int[] var2) {
      int var3 = this.n5.l6().k5(var1.n5(var2[0]).n5());
      if (var3 == -1) {
         return false;
      }

      p2i var4 = this.n5(var1, var2[0], var3);
      if (var4 == null) {
         return false;
      }

      List var5 = var1.n5();
      var5.set_Item(var2[0], new s2b(var4.u3()));
      int var6 = var1.t2() ? var2[0] - 1 : var2[0] + 1;
      var5.removeRange(var6, var4.l6() - 1);
      var1.n5(var2);
      return true;
   }

   private p2i n5(g2x var1, int var2, int var3) {
      f3l var4 = this.n5.n5(var3);
      boolean var5 = var1.t2();
      p2i[] var6 = var4.l6();

      for (p2i var10 : var6) {
         if (j3b.n5(var1, var2, var10.k5(), !var5)) {
            return var10;
         }
      }

      return null;
   }
}
