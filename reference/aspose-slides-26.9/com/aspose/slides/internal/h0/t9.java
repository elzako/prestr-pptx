package com.aspose.slides.internal.h0;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.x8.b3;
import com.aspose.slides.internal.x8.g7;
import com.aspose.slides.ms.System.d1;

public class t9 implements IGenericEnumerable<b3> {
   private List<b3> n5 = new List<>();
   private n5 l6;

   public t9(n5 var1) {
      this.l6 = var1;
   }

   public final int n5() {
      return this.n5.size();
   }

   public final b3 n5(int var1) {
      return var1 >= 0 && var1 <= this.n5.size() - 1 ? this.n5.get_Item(var1) : null;
   }

   @Override
   public final IGenericEnumerator<b3> iterator() {
      return this.n5.iterator();
   }

   public final void n5(g7 var1) {
      var1.n5(this.l6);
      this.n5.addItem(var1);
   }

   @Override
   public String toString() {
      if (this.n5() == 0) {
         return d1.n5;
      }

      a5 var1 = new a5();
      var1.n5(this.n5(0).u9());

      for (int var2 = 1; var2 < this.n5(); var2++) {
         var1.n5(", ");
         var1.n5(this.n5(var2).u9());
      }

      return var1.toString();
   }
}
