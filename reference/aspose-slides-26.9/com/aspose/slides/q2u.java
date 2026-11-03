package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentNullException;

final class q2u extends DomObject<Chart> {
   private Dictionary<Integer, d4w> n5;

   q2u(Chart var1) {
      super(var1);
   }

   final com.aspose.slides.Collections.Generic.IGenericCollection<d4w> n5() {
      return this.n5 == null ? null : this.n5.getValues();
   }

   final Format n5(int var1) {
      if (this.n5 == null) {
         return null;
      }

      d4w var2 = null;
      d4w[] var3 = new d4w[]{var2};
      Format var4 = this.n5.tryGetValue(var1, var3) ? var3[0].k5() : null;
      var2 = var3[0];
      return var4;
   }

   final void n5(d4w var1) {
      if (var1 == null) {
         throw new ArgumentNullException("format");
      }

      if (this.n5 == null) {
         this.n5 = new Dictionary<>();
      }

      this.n5.set_Item(var1.n5(), var1);
   }
}
