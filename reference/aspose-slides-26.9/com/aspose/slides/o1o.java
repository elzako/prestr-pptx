package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class o1o implements IGenericEnumerable<w4c> {
   private final com.aspose.slides.internal.k4y.q2u n5;
   private final List<w4c> l6;

   public o1o(com.aspose.slides.internal.k4y.q2u var1, SmartArt var2, t5w var3) {
      this.n5 = var1;
      com.aspose.slides.internal.k4y.h6q[] var4 = this.n5.n5();
      this.l6 = new List<>(var4.length);

      for (com.aspose.slides.internal.k4y.h6q var8 : var4) {
         this.l6.addItem(new w4c(var8, var2, var3));
      }
   }

   public final void n5(w4c var1) {
      this.l6.addItem(var1);
      this.n5.n5(w4c.n5(var1));
   }

   @Override
   public final IGenericEnumerator<w4c> iterator() {
      return this.l6.iterator();
   }

   final w4c n5(String var1, int var2) {
      List$Enumerator var3 = this.l6.iterator();

      try {
         while (var3.hasNext()) {
            w4c var4 = (w4c)var3.next();
            if ((var4.a6() == var2 || var2 == 0) && (var1 == null || com.aspose.slides.ms.System.d1.a6(var4.u3(), var1))) {
               return var4;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return null;
   }

   final w4c n5(String var1, String var2) {
      List$Enumerator var3 = this.l6.iterator();

      try {
         while (var3.hasNext()) {
            w4c var4 = (w4c)var3.next();
            if (com.aspose.slides.ms.System.d1.a6(var4.k5().l6(), var1) && com.aspose.slides.ms.System.d1.a6(var4.k5().k5(), var2)) {
               return var4;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return null;
   }
}
