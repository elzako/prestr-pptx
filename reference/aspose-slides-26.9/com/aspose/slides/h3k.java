package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEqualityComparer;
import com.aspose.slides.exceptions.InvalidOperationException;

class h3k {
   static final IGenericEqualityComparer<p1s> n5 = new h3k$1();
   private final Dictionary<p1s, q6z> l6 = new Dictionary<>(n5);

   final q6z n5(p1s var1) {
      q6z var2 = null;
      q6z[] var3 = new q6z[]{var2};
      boolean var4 = this.l6.tryGetValue(var1.n5(), var3);
      var2 = var3[0];
      return var4 ? var2 : null;
   }

   final void n5(p1s var1, q6z var2) {
      if (!this.l6.containsKey(var1.n5())) {
         this.l6.addItem(var1.n5(), var2);
      } else {
         throw new InvalidOperationException("Trying to add new cached value with the same keys.");
      }
   }
}
