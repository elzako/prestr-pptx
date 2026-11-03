package com.aspose.slides.internal.m0l;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.internal.y5s.j5;
import com.aspose.slides.internal.y5s.w1;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.u3;

public class l6 {
   public static y1 n5(w1 var0) {
      return y1.n5(var0.n5(), var0.l6(), var0.a6(), var0.u9());
   }

   public static y1[] n5(u3 var0) {
      j5[] var1 = k5.n5(u3.n5(var0), j5[].class);
      if (var1 != null) {
         return n5(var1);
      } else {
         w1[] var2 = k5.n5(u3.n5(var0), w1[].class);
         if (var2 != null) {
            return n5(var2);
         } else {
            throw new ArgumentException(d1.n5("Support only {0} or {1} arrays.",new Object[]{ k5.n5(j5.class).s7(), k5.n5(w1.class).s7()}), "pointsArray");
         }
      }
   }

   public static y1[] n5(j5[] var0) {
      y1[] var1 = (y1[])u3.n5(u3.n5(k5.n5(y1.class), var0.length));

      for (int var2 = 0; var2 < var0.length; var2++) {
         y1.n5(var0[var2].k5(), var0[var2].u3(), var0[var2].t2(), var0[var2].s7()).a6(var1[var2]);
      }

      return var1;
   }

   public static y1[] n5(w1[] var0) {
      y1[] var1 = (y1[])u3.n5(u3.n5(k5.n5(y1.class), var0.length));

      for (int var2 = 0; var2 < var0.length; var2++) {
         y1.n5(var0[var2].n5(), var0[var2].l6(), var0[var2].a6(), var0[var2].u9()).a6(var1[var2]);
      }

      return var1;
   }
}
