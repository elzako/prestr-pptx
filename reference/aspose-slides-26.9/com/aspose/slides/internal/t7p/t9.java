package com.aspose.slides.internal.t7p;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.d1;

public class t9 {
   private final Dictionary<Integer, s7> n5 = new Dictionary<>();

   public t9(com.aspose.slides.internal.b7s.t9 var1) {
      int var2 = com.aspose.slides.internal.n5p.h0.k5(var1.u3().c8() & 65535, var1.u3().u3());

      for (int var3 = 0; var3 < var1.u9().l6.length; var3++) {
         int var4 = var1.u9().l6[var3];
         com.aspose.slides.internal.b7s.n3 var5 = null;

         for (int var6 = 0; var6 < var1.u3().l6().length; var6++) {
            if ((var1.u3().l6()[var6].u9() & 255) == var4) {
               var5 = var1.u3().l6()[var6];
               break;
            }
         }

         if (var5 == null) {
            throw new com.aspose.slides.internal.z3b.k5(
               d1.n5, new com.aspose.slides.internal.z3b.a6("Corrupted Jpeg scan component id definition. Cannot load image.")
            );
         }

         if ((var5.u3() & 255) == var1.u3().u3() && (var5.n3() & 255) == var1.u3().h0()) {
            this.n5.set_Item(var4, new t9$n5());
         } else if ((var5.u3() & 255) * 2 == var1.u3().u3() && (var5.n3() & 255) == var1.u3().h0()) {
            this.n5.set_Item(var4, new t9$k5(var2));
         } else if ((var5.u3() & 255) == var1.u3().u3() && (var5.n3() & 255) * 2 == var1.u3().h0()) {
            this.n5.set_Item(var4, new t9$l6(var2));
         } else {
            if ((var5.u3() & 255) * 2 != var1.u3().u3() || (var5.n3() & 255) * 2 != var1.u3().h0()) {
               throw new com.aspose.slides.internal.h6t.n5("Component configuration", new NotSupportedException("Jpeg component configuration not supported."));
            }

            this.n5.set_Item(var4, new t9$u3(var2));
         }
      }
   }

   public final s7 n5(int var1) {
      return this.n5.get_Item(var1);
   }
}
