package com.aspose.slides.internal.u6;

import com.aspose.slides.Collections.BitArray;
import com.aspose.slides.Collections.Generic.List;

public class k5 {
   private int n5 = 1;
   private BitArray l6 = new BitArray(1000);

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1, int var2) {
      for (int var3 = var1 - 1; var3 < var2; var3++) {
         this.l6.set(var3, true);
      }

      this.n5 = var2 + 1;

      while (this.l6.get(this.n5 - 1)) {
         this.n5++;
      }
   }

   public final void n5(List<n3> var1) {
      this.l6.setAll(false);

      for (int var2 = 0; var2 < var1.size(); var2++) {
         n3 var3 = (n3)var1.get_Item(var2);
         if (var3 != null) {
            if (var3.n5() == 0) {
               var1.set_Item(var2, null);
            } else {
               this.l6.set(var2, true);
            }
         }
      }

      this.n5 = 1;

      while (this.l6.get(this.n5 - 1)) {
         this.n5++;
      }
   }

   public final boolean n5(int var1) {
      return this.l6.get(var1 - 1);
   }
}
