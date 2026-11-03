package com.aspose.slides.internal.b7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentNullException;

class h3r {
   private final Dictionary<String, com.aspose.slides.internal.g7.n2> n5;

   public h3r(com.aspose.slides.internal.g7.c9 var1) {
      if (null == var1) {
         throw new ArgumentNullException("source");
      }

      this.n5 = new Dictionary<>();
      com.aspose.slides.internal.g7.n2[] var2 = var1.n5();

      for (com.aspose.slides.internal.g7.n2 var6 : var2) {
         if (!this.n5.containsKey(var6.n5())) {
            this.n5.addItem(var6.n5(), var6);
         }
      }
   }

   com.aspose.slides.internal.g7.b6 n5(String var1) {
      return this.n5.containsKey(var1) ? com.aspose.slides.internal.g7.i2.n5(this.n5.get_Item(var1)) : null;
   }
}
