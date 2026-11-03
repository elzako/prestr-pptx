package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class u1s {
   private int n5;
   private List<p5k> l6 = new List<>();
   private long k5;

   public u1s(long var1, int var3, List<Integer> var4, f3c var5) {
      this.n5 = var3;
      if (var3 != var4.size()) {
         throw new r7c(
            com.aspose.slides.ms.System.d1.n5(
               com.aspose.slides.ms.System.d1.n5(new String[]{"array of anchor offsets has incorrect length = {0} ", "when ClassCount for this array = {1}"}),new Object[]{
               var4.size(),
               var3
            })
         );
      }

      this.k5 = var1 & 4294967295L;

      for (int var6 = 0; var6 < var3; var6++) {
         this.l6.addItem(f1s.n5(new p5k(var1 + ((Integer)var4.get_Item(var6) & 65535)), var5));
      }
   }

   public final p5k n5(int var1) {
      return this.l6.get_Item(var1);
   }
}
