package com.aspose.slides.internal.q9r;

import com.aspose.slides.Collections.Generic.Dictionary;

public class t2 {
   private final Dictionary<Integer, c8> n5 = new Dictionary<>();
   private c8 l6;
   private boolean k5;

   public t2(boolean var1) {
      this.k5 = var1;
   }

   public final c8 n5(int var1) {
      c8 var2 = null;
      c8[] var3 = new c8[]{var2};
      boolean var4 = this.n5.tryGetValue(var1, var3);
      var2 = var3[0];
      if (var4) {
         return var2;
      }

      if (this.k5) {
         if (com.aspose.slides.internal.z5z.k5.l6(var1)) {
            var3[0] = var2;
            this.n5.tryGetValue(Integer.valueOf(com.aspose.slides.internal.z5z.k5.n5(var1)), var3);
            var2 = var3[0];
         } else {
            var3[0] = var2;
            this.n5.tryGetValue(Integer.valueOf(com.aspose.slides.internal.z5z.k5.k5(var1)), var3);
            var2 = var3[0];
         }

         return var2;
      } else {
         return null;
      }
   }

   public final void n5(c8 var1) {
      this.n5.set_Item(var1.n5(), var1);
   }

   public final c8 n5() {
      return this.l6;
   }

   public final void l6(c8 var1) {
      this.l6 = var1;
   }
}
