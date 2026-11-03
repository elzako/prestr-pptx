package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

class g4 {
   private List<Object> n5 = new List<>();

   public final Object n5(int var1) {
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("level must be >= 0");
      } else if (var1 >= this.n5.size()) {
         return null;
      } else {
         return this.n5.get_Item(var1) != null ? this.n5.get_Item(var1) : null;
      }
   }

   public final void n5(int var1, Object var2) {
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("level must be >= 0");
      }

      for (int var3 = this.n5.size(); var3 <= var1; var3++) {
         this.n5.addItem(null);
      }

      if (var2 != null) {
         this.n5.set_Item(var1, var2);
      }
   }

   final int n5() {
      return this.n5.size();
   }
}
