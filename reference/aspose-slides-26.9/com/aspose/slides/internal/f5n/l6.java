package com.aspose.slides.internal.f5n;

import com.aspose.slides.internal.b5j.n3;
import com.aspose.slides.internal.b5j.y4;
import com.aspose.slides.internal.d0e.a6;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class l6 {
   public static void n5(com.aspose.slides.internal.w9s.u3 var0, f2 var1, a6 var2, com.aspose.slides.internal.w5i.k5 var3, w1 var4, double var5) {
      var3 = n5(var2, var3);
      m1 var7 = var0.n5().a6();
      a0 var8 = var0.n5().l6();

      try {
         m1 var9 = var7.u9();
         var9.k5(var4.l6(), var4.k5());
         if (d1.u3(d1.l6(var3.p8()), "auto", (short)3)) {
            var9.n5((float)var5);
         } else {
            com.aspose.slides.internal.b3z.l6 var10 = com.aspose.slides.internal.b3z.l6.n5(var3.p8(), new com.aspose.slides.internal.b3z.l6());
            var9.n5(var10.k5());
         }

         n3 var23 = var0.a6();
         if (var3.i1()) {
            float var11 = var23.n5(var2.c8(), "xy", var2, var1.a6());
            if (q1.n5(var11) < 0.001) {
               var11 = 1.0F;
            }

            var9.n5(var11, var11);
         }

         float var24 = var23.n5(var3.d5(), "x", var2, var1.a6());
         float var12 = var23.n5(var3.s3(), "y", var2, var1.a6());
         y1 var13 = new y1(w1.n5.u3(), new f2(var24, var12));
         float var14 = 1.0F;
         float var15 = 1.0F;
         y1 var16 = var13.y4();
         if (var3.e5() != null) {
            var3.e5().n5(var23).a6(var16);
            f2 var17 = var16.c8().a6();
            y1 var18 = y4.n5(var3.b3(), new y1(w1.n5.u3(), var17.a6()), var13.y4()).y4();
            var14 = var18.s7() / var17.l6();
            var15 = var18.k5() / var17.k5();
         }

         var9.k5(-var23.n5(var3.a0(), "x", var2, var1.a6()) * var14, -var23.n5(var3.d2(), "y", var2, var1.a6()) * var15);
         var9.n5(var14, var15);
         var0.n5().n5(var9);
         if (var3.k5()) {
            var0.n5().l6(new a0(new y1(var16.x8(), var16.n3(), var24 / var14, var12 / var15)));
         }

         var0.n5(var3, var1.a6(), null);
      } finally {
         var0.n5().n5(var7);
         var0.n5().l6(var8);
      }
   }

   private static com.aspose.slides.internal.w5i.k5 n5(a6 var0, com.aspose.slides.internal.w5i.k5 var1) {
      com.aspose.slides.internal.w5i.k5 var2 = (com.aspose.slides.internal.w5i.k5)var1.y1();
      var2.l6.l6("display");
      k5.n5(var2);
      return var2;
   }
}
