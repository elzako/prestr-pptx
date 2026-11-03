package com.aspose.slides.internal.s7;

import com.aspose.slides.internal.k5.l6$n5;

public class b2 extends com.aspose.slides.internal.n3.s7 {
   private static final com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> n5 = new com.aspose.slides.internal.u3.c8<>();

   @Override
   public String n5() {
      return "outline-width";
   }

   @Override
   public int l6() {
      return 192;
   }

   @Override
   public boolean k5() {
      return false;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 u3() {
      return l6$n5.w2;
   }

   @Override
   public com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> a6() {
      return n5;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      com.aspose.slides.internal.k5.u9 var3 = super.n5(var1, var2);
      if (var3.h0() == 1) {
         com.aspose.slides.internal.k5.u3 var4 = (com.aspose.slides.internal.k5.u3)var3;
         if (var4.n5() != 21 && var4.n5((short)1) < 0.0F) {
            throw com.aspose.slides.internal.z8.u9.k5(var3.u9());
         }
      }

      return var3;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(
      com.aspose.slides.internal.k5.k7 var1,
      com.aspose.slides.internal.h0.h0 var2,
      String var3,
      com.aspose.slides.internal.y4.z1 var4,
      com.aspose.slides.internal.k5.u9 var5,
      int var6
   ) {
      com.aspose.slides.internal.k5.u9 var7 = var2.n5(var1, var3, var2.u3(191));
      return l6$n5.a0 != var7 && l6$n5.z0 != var7 ? super.n5(var1, var2, var3, var4, var5, var6) : l6$n5.l6;
   }

   static {
      n5.n5("thin", l6$n5.j8);
      n5.n5("medium", l6$n5.w2);
      n5.n5("thick", l6$n5.s0);
   }
}
