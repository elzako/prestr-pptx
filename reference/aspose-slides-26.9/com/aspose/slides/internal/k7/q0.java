package com.aspose.slides.internal.k7;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

public class q0 extends n5 {
   private IGenericList<String> n5 = new List<>();

   public q0(com.aspose.slides.internal.k5.u9 var1) {
      super(var1);
      com.aspose.slides.internal.k5.h0 var2 = (com.aspose.slides.internal.k5.h0)var1;
      IGenericEnumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            com.aspose.slides.internal.k5.u9 var4 = (com.aspose.slides.internal.k5.u9)var3.next();
            this.n5.addItem(((com.aspose.slides.internal.k5.u3)var4).l6());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   public final IGenericList<String> h0() {
      return this.n5;
   }
}
