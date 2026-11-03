package com.aspose.slides.internal.n8e;

import com.aspose.slides.Collections.Generic.List;

class u3 {
   private final List<k5> n5 = new List<>(8);

   public final k5 n5(int var1) {
      return this.n5.get_Item(var1);
   }

   public final void n5(String var1, String var2, String var3, int var4, int var5, j4 var6, boolean var7) {
      if (var7) {
         for (int var8 = 0; var8 < this.n5.size(); var8++) {
            k5 var9 = this.n5.get_Item(var8);
            if (com.aspose.slides.ms.System.d1.a6(var1, var9.n5) && com.aspose.slides.ms.System.d1.a6(var2, var9.l6)) {
               var6.n5(var4, var5 - var4);
               return;
            }
         }
      }

      this.n5.addItem(new k5(var1, var2, var3, var4, var5));
   }

   public final int n5() {
      return this.n5.size();
   }

   public final void l6() {
      this.n5.clear();
   }
}
