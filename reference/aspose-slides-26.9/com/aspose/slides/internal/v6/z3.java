package com.aspose.slides.internal.v6;

import com.aspose.slides.internal.b9.c3;
import com.aspose.slides.internal.b9.s9;

public abstract class z3 extends com.aspose.slides.internal.r5.a6 {
   protected z3(com.aspose.slides.internal.r5.y4 var1) {
      super(var1);
   }

   @Override
   public void u9(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      c3 var3 = (c3)var1;
      if ((var3.l6() & 4294967295L) != 0L) {
         com.aspose.slides.internal.o9b.j5[] var4 = new com.aspose.slides.internal.o9b.j5[(int)((var3.l6() & 4294967295L) + 1L & 4294967295L)];

         for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5] = new com.aspose.slides.internal.o9b.j5();
         }

         (var2.e2() ? var2.k7() : var2.m1()).k5(var4[0]);

         for (int var6 = 0; var6 < var3.k5().length; var6++) {
            var3.k5()[var6].k5().k5(var4[var6 + 1]);
         }

         if (var2.e2()) {
            var2.y4().n5(var4);
            var2.l6(var4[var4.length - 1].k5());
         } else {
            if (var2.c8() != null) {
               this.n5(var4, var2);
            }

            var2.n5(var4[var4.length - 1].k5());
         }
      }
   }

   @Override
   public boolean h0(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      return !var2.e2();
   }

   protected abstract void n5(com.aspose.slides.internal.o9b.j5[] var1, com.aspose.slides.internal.r6.u9 var2);
}
