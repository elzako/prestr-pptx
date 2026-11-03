package com.aspose.slides.internal.h0;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;

public class e2 implements com.aspose.slides.internal.k5.z3 {
   private List<com.aspose.slides.internal.k5.q0> n5 = new List<>();
   private q0 l6;

   public e2(q0 var1) {
      this.l6 = var1;
   }

   @Override
   public final long n5() {
      return this.n5.size();
   }

   @Override
   public final com.aspose.slides.internal.k5.q0 n5(int var1) {
      return var1 >= 0 && var1 <= this.n5.size() - 1 ? this.n5.get_Item(var1) : null;
   }

   @Override
   public final IGenericEnumerator<com.aspose.slides.internal.k5.q0> iterator() {
      return this.n5.iterator();
   }

   public final void n5(com.aspose.slides.internal.k5.q0 var1) {
      this.n5.addItem(var1);
   }

   public final void l6(int var1) {
      this.n5.removeAt(var1);
   }

   @Override
   public String toString() {
      if (this.n5() == 0L) {
         return d1.n5;
      }

      a5 var1 = new a5();
      var1.n5(this.n5(0).l6());

      for (int var2 = 1; var2 < this.n5(); var2++) {
         var1.n5(", ");
         var1.n5(this.n5(var2).l6());
      }

      return var1.toString();
   }
}
