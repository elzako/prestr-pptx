package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class k2p implements q7 {
   private final c7f n5;
   private final p6r l6;

   public k2p(c7f var1, p6r var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public final boolean n5(g2x var1, int[] var2) {
      int var3 = this.n5.l6().k5(var1.n5(var2[0]).n5());
      if (var3 == -1) {
         return false;
      } else {
         e6r var4 = this.n5.n5(var3);
         if (var4 != null && var4.l6().size() == 1) {
            List var5 = var1.n5();
            ((s2b)var5.get_Item(var2[0])).n5(new k2(var4.l6().get_Item(0) & 65535));
            var1.n5(var2);
            return true;
         } else {
            return false;
         }
      }
   }
}
