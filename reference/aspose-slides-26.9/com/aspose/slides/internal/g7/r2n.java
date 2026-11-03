package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

public class r2n extends r6i {
   @Override
   public void n5() {
      h3r var1 = (h3r)this.n5;
      if (!var1.y4().l6(k2.n5)) {
         var1.y4().n5(k2.n5);
      }

      n0 var2 = new n0();
      n0 var3 = new n0();
      IGenericEnumerator var4 = var1.y4().k5();

      try {
         while (var4.hasNext()) {
            r9 var5 = (r9)var4.next();
            var2.n5();
            ((u0a)var1.e2()).n5(var5, var2);
            if (var2.l6() > 0) {
               IGenericEnumerator var6 = var2.k5();

               try {
                  while (var6.hasNext()) {
                     r9 var7 = (r9)var6.next();
                     if (!var1.y4().l6(var7) && !var3.l6(var7)) {
                        var3.n5(var7);
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                     var6.dispose();
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      IGenericEnumerator var23 = var3.k5();

      try {
         while (var23.hasNext()) {
            r9 var24 = (r9)var23.next();
            if (!var1.y4().l6(var24)) {
               var1.y4().n5(var24);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var23, IDisposable.class)) {
            var23.dispose();
         }
      }

      super.n5();
   }
}
