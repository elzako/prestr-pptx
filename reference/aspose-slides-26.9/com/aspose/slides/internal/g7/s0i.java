package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public abstract class s0i extends f1s {
   public s0i() {
      super(0L);
   }

   public final void n5(long var1, long var3, f3c var5) {
      if (var3 == 0L) {
         throw new r7c("Trying to load table with zero offset");
      }

      this.n5 = var1 + var3 & 4294967295L;
      this.n5(var5);
   }

   public static void n5(List<y9r> var0, int var1) {
      List$Enumerator var2 = var0.iterator();

      try {
         while (var2.hasNext()) {
            y9r var3 = (y9r)var2.next();
            if ((var3.n5() & 65535) > var1 - 1) {
               throw new r7c(com.aspose.slides.ms.System.d1.n5(new String[]{"Incorrect sequence index in rule table", " exceeds input glyph count"}));
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }
}
