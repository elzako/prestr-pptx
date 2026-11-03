package com.aspose.slides.internal.r8;

import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.internal.j3.z8;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class l6 implements com.aspose.slides.internal.d1.k5 {
   private String n5;

   public l6(String var1) {
      this.n5 = var1;
   }

   @Override
   public final short n5(z8 var1) {
      IEnumerator var2 = var1.A_().iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.j3.k5 var3 = (com.aspose.slides.internal.j3.k5)var2.next();
            if (var3.u9() && d1.a6(var3.k5(), this.n5)) {
               return 1;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            ((IDisposable)var2).dispose();
         }
      }

      return 2;
   }
}
