package com.aspose.slides.internal.z8;

import com.aspose.slides.internal.k5.l6$n5;
import com.aspose.slides.ms.System.d1;

public class c8 implements t4 {
   private final com.aspose.slides.internal.h0.u9 n5;
   private static final com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> l6 = new com.aspose.slides.internal.u3.c8<>();
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("type", "suffix", "prefix", "glyphs", "fallback");

   public c8(com.aspose.slides.internal.h0.u9 var1) {
      this.n5 = var1;
   }

   @Override
   public final void n5(String var1, y4 var2, boolean var3) {
      switch (k5.n5(d1.a6(var1))) {
         case 0:
            if (var2.n5() != 35) {
               throw u9.n5(var2.n5());
            }

            com.aspose.slides.internal.k5.u9 var5 = l6.n5(var2.t2());
            if (var5 == null) {
               throw u9.l6(var2.t2());
            }

            this.n5.k5(((com.aspose.slides.internal.k5.u3)var5).l6());
            break;
         case 1:
            if (var2.n5() != 36) {
               throw u9.n5(var2.n5());
            }

            this.n5.a6(var2.t2());
            break;
         case 2:
            if (var2.n5() != 36) {
               throw u9.n5(var2.n5());
            }

            this.n5.u3(var2.t2());
            break;
         case 3:
            while (var2.n5() == 36) {
               this.n5.n3().addItem(var2.t2());
               var2 = var2.k5();
               if (var2 == null) {
                  return;
               }
            }

            throw u9.n5(var2.n5());
         case 4:
            if (var2.n5() != 36) {
               throw u9.n5(var2.n5());
            }

            com.aspose.slides.internal.k5.u9 var4 = l6.n5(var2.t2());
            this.n5.u9(((com.aspose.slides.internal.k5.u3)var4).l6());
            break;
         default:
            this.n5.a_().u3().u3().n5(new u3(d1.n5("Invalid property name '{0}'.", new Object[]{var1})));
      }
   }

   static {
      l6.n5("repeating", l6$n5.d4n);
      l6.n5("numeric", l6$n5.f8y);
      l6.n5("alphabetic", l6$n5.f5);
      l6.n5("symbolic", l6$n5.o9b);
      l6.n5("additive", l6$n5.x4g);
      l6.n5("non-repeating", l6$n5.j9e);
   }
}
