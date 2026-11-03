package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;

class t6w implements IGenericEnumerable<q9r> {
   private final com.aspose.slides.internal.k4y.u8b n5;
   private final List<q9r> l6;

   public t6w(com.aspose.slides.internal.k4y.u8b var1) {
      this.n5 = var1;
      com.aspose.slides.internal.k4y.f7x[] var2 = var1.n5();
      this.l6 = new List<>(var2.length);

      for (com.aspose.slides.internal.k4y.f7x var6 : var2) {
         this.l6.addItem(new q9r(var6));
      }
   }

   public final void n5(q9r var1) {
      this.l6.addItem(var1);
      this.n5.n5(q9r.l6(var1));
   }

   final q9r n5(int var1, w4c var2, w4c var3, String var4) {
      q9r var5 = new q9r(var1);
      var5.n5(var2, this);
      var5.l6(var3, this);
      var5.n5(var4);
      this.n5(var5);
      return var5;
   }

   @Override
   public final IGenericEnumerator<q9r> iterator() {
      return this.l6.iterator();
   }
}
