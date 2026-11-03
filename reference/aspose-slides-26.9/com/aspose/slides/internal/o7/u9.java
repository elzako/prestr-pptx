package com.aspose.slides.internal.o7;

import com.aspose.slides.internal.e1x.i1;
import com.aspose.slides.internal.e1x.u6;
import com.aspose.slides.internal.i0.s0;
import com.aspose.slides.internal.o9b.e5;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.o5;

public class u9 extends com.aspose.slides.internal.k6.c8 {
   private final com.aspose.slides.internal.k6.n5 n5 = new m3(this);

   @Override
   public com.aspose.slides.internal.k6.n5 n5() {
      return this.n5;
   }

   @Override
   protected void n5(com.aspose.slides.internal.a4.x8 var1, com.aspose.slides.internal.x3.a6 var2) {
      long var3 = var1.c8();
      com.aspose.slides.internal.o9b.z1 var5 = var2.n5();
      e5 var6 = new e5(e5.t2());
      boolean var7 = false;
      if ((var3 & 2L) == 2L) {
         var6.k5(var6.k5() | 2);
      }

      if ((var3 & 8L) == 8L) {
         if (o5.n5(var2.l6().s7(), null)) {
            var5.c8(4);
         }

         if (o5.n5(var2.l6().c8(), null)) {
            var5.a6(1);
         }
      } else {
         if (o5.n5(var2.l6().s7(), null)) {
            var5.c8(4);
         }

         if (o5.n5(var2.l6().c8(), null)) {
            var5.a6(0);
         }
      }

      if ((var3 & 4L) == 4L) {
         var7 = true;
      }

      if ((var1.e2() & 4294967295L) == 1L && var1.t9() != null) {
         var5.n5(var1.t9().c8());
      }

      short[] var8 = var1.x8();
      s0[] var9 = var1.s7();
      String var10 = "";
      if ((var3 & 1L) == 1L) {
         var10 = com.aspose.slides.internal.o6.n5.n5(var8);
      } else {
         i1 var11 = com.aspose.slides.internal.e1x.x8.u3().n5(var2.t2().l6().a6(), var2.t2().x8(), null);
         char[] var12 = new char[var8.length];

         for (int var13 = 0; var13 < var8.length; var13++) {
            u6 var14 = var11.h0().k5(var8[var13]);
            var12[var13] = (char)var14.n5();
         }

         var10 = d1.n5(var12);
      }

      float var16 = this.n5(var2.t2());
      if (var7) {
         w1 var17 = var9[0].n5().u3();
         var17.l6(var17.k5() - var16);
         var5.n5(var10, var2.t2(), var2.h0(), var17.u3(), var6);
      } else {
         for (int var18 = 0; var18 < var1.t2(); var18++) {
            w1 var19 = var9[var18].n5().u3();
            var19.l6(var19.k5() - var16);
            var5.n5(com.aspose.slides.ms.System.t9.q0(var10.charAt(var18)), var2.t2(), var2.h0(), var19.u3(), var6);
         }
      }
   }
}
