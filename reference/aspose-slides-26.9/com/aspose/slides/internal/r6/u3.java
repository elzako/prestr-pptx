package com.aspose.slides.internal.r6;

import com.aspose.slides.internal.b9.s9;

public abstract class u3 {
   public final void n5(s9 var1, u9 var2) {
      this.l6(var1, var2);
      if (a6(var1, var2)) {
         this.u3(var1, var2);
      }

      this.k5(var1, var2);
   }

   protected void l6(s9 var1, u9 var2) {
   }

   protected void k5(s9 var1, u9 var2) {
   }

   protected abstract void u3(s9 var1, u9 var2);

   public static boolean a6(s9 var0, u9 var1) {
      return var0.r4().l6() != 5 && var0.r4().l6() != 4 ? true : var0.c4() == 70L || var0.c4() == 1L || var1.a6;
   }
}
