package com.aspose.slides.internal.q6r;

import com.aspose.slides.Collections.Generic.Dictionary;

public class n5 {
   private final Dictionary<l6, Double> n5 = new Dictionary<>();

   public Double n5(l6 var1) {
      Double var2 = null;
      Double[] var3 = new Double[]{var2};
      boolean var4 = this.n5.tryGetValue(var1, var3);
      var2 = var3[0];
      if (var4) {
         return var2;
      }

      var2 = var1.n5();
      this.n5.addItem(var1, var2);
      return var2;
   }
}
