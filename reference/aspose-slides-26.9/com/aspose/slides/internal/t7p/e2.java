package com.aspose.slides.internal.t7p;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.b7s.p3;

public class e2 {
   private final Dictionary<Integer, t2> n5 = new Dictionary<>();

   public e2(com.aspose.slides.internal.b7s.z1 var1) {
      p3 var2 = var1.s7().get_Item(var1.n5);

      for (int var3 = 0; var3 < var2.l6.length; var3++) {
         int var4 = var2.l6[var3];
         com.aspose.slides.internal.b7s.n3 var5 = var1.a6().l6()[var4];
         if ((var5.u3() & 255) == var1.a6().u3() && (var5.n3() & 255) == var1.a6().h0()) {
            this.n5.set_Item(var5.u9() & 255, new e2$n5());
         } else if ((var5.u3() & 255) * 2 == var1.a6().u3() && (var5.n3() & 255) == var1.a6().h0()) {
            this.n5.set_Item(var5.u9() & 255, new e2$k5(var1));
         } else if ((var5.u3() & 255) == var1.a6().u3() && (var5.n3() & 255) * 2 == var1.a6().h0()) {
            this.n5.set_Item(var5.u9() & 255, new e2$l6(var1));
         } else {
            if ((var5.u3() & 255) * 2 != var1.a6().u3() || (var5.n3() & 255) * 2 != var1.a6().h0()) {
               throw new com.aspose.slides.internal.h6t.n5("Component configuration", new NotSupportedException("Jpeg component configuration not supported."));
            }

            this.n5.set_Item(var5.u9() & 255, new e2$u3(var1));
         }
      }
   }

   public final t2 n5(int var1) {
      return this.n5.get_Item(var1);
   }
}
