package com.aspose.slides.internal.h2;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class a0 implements s3 {
   protected final a5 n5(a5 var1, int var2) {
      return var1.t_().size() > var2 ? var1.t_().get_Item(var2) : null;
   }

   @Override
   public a5 l6(int var1, a5 var2, h2 var3, com.aspose.slides.internal.e5.w1 var4) {
      if (var2.t_().size() == 1) {
         String var5 = this.n5(var2, 0).j_();
         if (var5 != null && d1.a6(var5, "inherit")) {
            return var4.h0(var1);
         }
      }

      return this.n5(var1, var2, var3, var4);
   }

   protected a5 n5(int var1, a5 var2, h2 var3, com.aspose.slides.internal.e5.w1 var4) {
      a5 var5 = null;
      List$Enumerator var6 = var2.t_().iterator();

      try {
         while (var6.hasNext()) {
            a5 var7 = (a5)var6.next();
            var5 = var3.n5(var4, var7, null);
            if (var5 != null) {
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      return var5;
   }
}
