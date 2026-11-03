package com.aspose.slides.internal.c6;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.IDisposable;

class u9 extends x8 {
   private final IGenericList<e2> n5;

   public u9(IGenericList<e2> var1) {
      this(var1, "div");
   }

   public u9(IGenericList<e2> var1, String var2) {
      super(var2);
      this.n5 = var1;
   }

   @Override
   protected void n5(a5 var1) {
      IGenericEnumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            e2 var3 = (e2)var2.next();
            var3.l6(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   protected int n5(String var1, int var2) {
      int var3 = super.n5(var1, var2);
      IGenericEnumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            e2 var5 = (e2)var4.next();
            var3 = var5.l6(var1, var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return var3;
   }
}
