package com.aspose.slides.internal.x4;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.InvalidOperationException;

public class u3 {
   private final Dictionary<Integer, l6> n5 = new Dictionary<>();
   private final boolean l6;
   private int k5;

   public u3(boolean var1) {
      this.l6 = var1;
   }

   public final l6 n5(int var1) {
      Object var2 = null;
      l6[] var3 = new l6[]{(l6)var2};
      this.n5.tryGetValue(var1, var3);
      return var3[0];
   }

   public final void n5(l6 var1) {
      int var3;
      if (this.l6) {
         if (this.n5.size() <= 19) {
            int var2 = this.k5++;
            var3 = var2 | -2147483648;
            var1.n5(var3);
         } else {
            var3 = var1.l6();
         }
      } else if (var1 == null) {
         var3 = this.k5++;
      } else {
         var3 = this.n5();
      }

      this.n5.set_Item(var3, var1);
   }

   public final void l6(int var1) {
      if (this.l6) {
         if ((var1 & -2147483648) == Integer.MIN_VALUE) {
            return;
         }

         this.n5.removeItemByKey(var1);
      } else {
         this.n5.set_Item(var1, null);
      }
   }

   private int n5() {
      for (int var1 = 0; var1 < this.n5.size(); var1++) {
         if (!this.n5.containsKey(var1)) {
            throw new InvalidOperationException("WMF Objects find slot error");
         }

         if (this.n5.get_Item(var1) == null) {
            return var1;
         }
      }

      throw new InvalidOperationException("Object count is out of range.");
   }
}
