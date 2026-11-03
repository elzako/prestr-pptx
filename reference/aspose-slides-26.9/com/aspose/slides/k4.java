package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.s6.c8$a6;
import com.aspose.slides.internal.s6.c8$c8;
import com.aspose.slides.internal.s6.c8$h0;
import com.aspose.slides.internal.s6.c8$k5;
import com.aspose.slides.internal.s6.c8$l6;
import com.aspose.slides.internal.s6.c8$n3;
import com.aspose.slides.internal.s6.c8$n5;
import com.aspose.slides.internal.s6.c8$s7;
import com.aspose.slides.internal.s6.c8$t2;
import com.aspose.slides.internal.s6.c8$u3;
import com.aspose.slides.internal.s6.c8$u9;
import com.aspose.slides.internal.s6.c8$x8;

class k4 {
   public static final com.aspose.slides.internal.s6.s0 n5 = new com.aspose.slides.internal.s6.s0(1.0F, 1.0F);
   public static final com.aspose.slides.internal.s6.s0 l6 = new com.aspose.slides.internal.s6.s0(8.0F, 8.0F);
   private static final Dictionary<Integer, k4$n5> k5 = new Dictionary<>();

   public static com.aspose.slides.internal.s6.t2 n5(x2i var0) {
      com.aspose.slides.internal.s6.h0 var1 = null;
      com.aspose.slides.internal.s6.h0 var2 = null;
      if (var0.h0() != null) {
         k4$n5 var3 = null;
         k4$n5[] var4 = new k4$n5[]{var3};
         boolean var5 = k5.tryGetValue(var0.h0().getBevelType(), var4);
         var3 = var4[0];
         if (var5) {
            float var6 = (float)(var0.h0().getWidth() < n5.n5() ? com.aspose.slides.ms.System.q1.l6(var0.h0().getWidth()) : var0.h0().getWidth());
            float var7 = (float)(var0.h0().getHeight() < n5.l6() ? com.aspose.slides.ms.System.q1.l6(var0.h0().getHeight()) : var0.h0().getHeight());
            var1 = new com.aspose.slides.internal.s6.h0(var6, var7, var3.n5(), var3.l6());
         }
      }

      if (var0.c8() != null) {
         k4$n5 var9 = null;
         k4$n5[] var11 = new k4$n5[]{var9};
         boolean var12 = k5.tryGetValue(var0.c8().getBevelType(), var11);
         var9 = var11[0];
         if (var12) {
            var2 = new com.aspose.slides.internal.s6.h0(
               (float)com.aspose.slides.ms.System.q1.l6(var0.c8().getWidth()),
               (float)com.aspose.slides.ms.System.q1.l6(var0.c8().getHeight()),
               var9.n5(),
               var9.l6()
            );
         }
      }

      return var1 == null && var2 == null ? null : new com.aspose.slides.internal.s6.t2(var1, var2);
   }

   static {
      k5.addItem(0, new k4$n5(c8$n5.n5(), c8$n5.l6()));
      k5.addItem(1, new k4$n5(c8$l6.n5(), c8$l6.l6()));
      k5.addItem(2, new k4$n5(c8$k5.n5(), c8$k5.l6()));
      k5.addItem(3, new k4$n5(c8$u3.n5(), c8$u3.l6()));
      k5.addItem(4, new k4$n5(c8$a6.n5(), c8$a6.l6()));
      k5.addItem(5, new k4$n5(c8$u9.n5(), c8$u9.l6()));
      k5.addItem(6, new k4$n5(c8$h0.n5(), c8$h0.l6()));
      k5.addItem(7, new k4$n5(c8$c8.n5(), c8$c8.l6()));
      k5.addItem(8, new k4$n5(c8$t2.n5(), c8$t2.l6()));
      k5.addItem(9, new k4$n5(c8$s7.n5(), c8$s7.l6()));
      k5.addItem(10, new k4$n5(c8$x8.n5(), c8$x8.l6()));
      k5.addItem(11, new k4$n5(c8$n3.n5(), c8$n3.l6()));
   }
}
