package com.aspose.slides.internal.r1;

import com.aspose.slides.internal.f5.c4;
import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.z6;
import com.aspose.slides.internal.j3.z8;
import com.aspose.slides.internal.q3.c8;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.y8;

public class n5 extends c8 implements z6 {
   private static final y8 n5 = k5.n5(n5.class);

   @Override
   public final g7 n5(g7 var1, g7 var2) {
      int var3;
      try {
         var3 = var2.d2();
      } catch (RuntimeException var6) {
         return var1.u3(var2);
      }

      c4 var4 = (c4)var1.C_();
      z8 var5 = var4.n5(var3);
      return var5 == null ? this.u9() : this.n5(var5, j8.n5(var5));
   }

   @Override
   public final void n5(g7 var1, g7 var2, g7 var3) {
   }

   @Override
   public y8 n5() {
      return n5;
   }

   @Override
   public void l6() {
   }
}
