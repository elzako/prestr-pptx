package com.aspose.slides.internal.h2;

import com.aspose.slides.ms.System.q1;

public class c4 extends e5$n5 {
   public c4(int var1) {
      super(var1);
   }

   @Override
   public a5 n5(com.aspose.slides.internal.e5.w1 var1, String var2, com.aspose.slides.internal.e5.t9 var3) {
      a5 var4 = super.n5(var1, var2, var3);
      if (com.aspose.slides.internal.v6g.k5.l6(var4, t1.class)) {
         a5 var5 = var1.h0(this.n5);
         var4 = j5.n5(var5.c8().u3() * ((t1)var4).e2() / 100.0);
      }

      return var4;
   }

   @Override
   public a5 l6(a5 var1, com.aspose.slides.internal.e5.w1 var2, com.aspose.slides.internal.e5.t9 var3) {
      if (var1.a6() != 71 && var1.a6() != 132) {
         return super.l6(var1, var2, var3);
      }

      a5 var4 = var2.h0(this.n5);
      int var5 = k5(var4.c8().u3());
      return var1.a6() == 71 ? j5.n5(q1.u3(var5 * 1.2)) : j5.n5(q1.u3(var5 / 1.2));
   }

   private static int k5(int var0) {
      double var1 = 1.2;
      int var3 = 12000;
      if (var0 < 12000) {
         var1 = 0.8333333333333334;
      }

      int var4;
      for (var4 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(var3 * var1), 14);
         var1 < 1.0 && var4 > var0 || var1 > 1.0 && var4 < var0;
         var4 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(var3 * var1), 14)
      ) {
         var3 = var4;
      }

      return q1.n5(var3 - var0) <= q1.n5(var0 - var4) ? var3 : var4;
   }
}
