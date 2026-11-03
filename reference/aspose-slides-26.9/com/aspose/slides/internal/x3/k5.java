package com.aspose.slides.internal.x3;

import com.aspose.slides.internal.a4.b3;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;

public abstract class k5 {
   public final void n5(b3 var1, a6 var2) {
      this.l6(var1, var2);
   }

   protected abstract void l6(b3 var1, a6 var2);

   public static w1[] n5(com.aspose.slides.internal.i0.u3[] var0) {
      if (var0 == null) {
         return null;
      }

      w1[] var1 = (w1[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(w1.class), var0.length));

      for (int var2 = 0; var2 < var0.length; var2++) {
         var0[var2].n5().n5(var1[var2]);
      }

      return var1;
   }

   protected static y1[] n5(com.aspose.slides.internal.i0.a6[] var0) {
      if (var0 == null) {
         return null;
      }

      y1[] var1 = (y1[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(y1.class), var0.length));

      for (int var2 = 0; var2 < var0.length; var2++) {
         var0[var2].n5().a6(var1[var2]);
      }

      return var1;
   }
}
