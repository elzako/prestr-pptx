package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentNullException;

class n9a {
   private o3h n5 = null;
   private Dictionary<String, t1n> l6 = null;

   n9a(o3h var1) {
      this.n5 = var1;
      this.l6 = new Dictionary<>();
   }

   final void n5(t1n var1) {
      if (var1 == null) {
         throw new ArgumentNullException("sourceFontConformityRule", "The source rule for adding doesn't specified!");
      }

      this.n5.n5(var1);
      String var2 = com.aspose.slides.ms.System.d1.l6(var1.n5());
      if (this.l6.containsKey(var2)) {
         t1n var3 = this.l6.get_Item(var2);
         var3.n5(var1, true);
      } else {
         this.l6.addItem(var2, var1);
      }
   }

   final t1n n5(String var1) {
      y1i var2 = this.n5.n5(var1);
      return this.n5(var2);
   }

   final t1n n5(y1i var1) {
      if (var1 == null) {
         return null;
      }

      String var2 = com.aspose.slides.ms.System.d1.l6(var1.n5());
      return this.l6.containsKey(var2) ? this.l6.get_Item(var2) : null;
   }
}
