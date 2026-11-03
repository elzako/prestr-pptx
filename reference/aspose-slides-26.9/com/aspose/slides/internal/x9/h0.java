package com.aspose.slides.internal.x9;

import com.aspose.slides.internal.a0.s3$l6;
import com.aspose.slides.internal.p3.e9;
import com.aspose.slides.internal.p3.p6;

public class h0 extends k7 {
   public h0(com.aspose.slides.internal.v4.a6 var1) {
      super(var1);
   }

   @Override
   protected com.aspose.slides.internal.d2.c8 u3(boolean var1) {
      com.aspose.slides.internal.d2.c8 var2 = super.u3(var1);
      n5(var2, (com.aspose.slides.internal.v4.a6)this.k5, this.z8());
      return var2;
   }

   public static void n5(com.aspose.slides.internal.a0.l6 var0, com.aspose.slides.internal.v4.a6 var1, e9 var2) {
      p6.n5(var0, var1.u6());
      if (var1.h2()) {
         String var3 = var1.t1();
         com.aspose.slides.internal.a0.m3 var4 = new com.aspose.slides.internal.a0.m3(var3, var0);
         var4.n5(var3, var2.n5(var3));
         if (!var4.k5()) {
            var2.n5(var3, var4);
            if (com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.d2.k5.class)) {
               ((com.aspose.slides.internal.d2.k5)var0).n5(var4);
            }
         }
      } else if (var1.v0()) {
         String var5 = com.aspose.slides.internal.f2.s7.n5(var1.a5());
         boolean var6 = var1.f0() == 190;
         if (var5.length() > 0) {
            var0.n5(2, new s3$l6(var5, var6));
         }
      }
   }

   @Override
   protected com.aspose.slides.internal.d2.s7 y1() {
      return new com.aspose.slides.internal.d2.k5();
   }
}
