package com.aspose.slides.internal.s7;

import com.aspose.slides.internal.k5.l6$n5;

public class b0 extends com.aspose.slides.internal.n3.x8 {
   @Override
   public String n5() {
      return "pitch-range";
   }

   @Override
   public int l6() {
      return 213;
   }

   @Override
   public boolean k5() {
      return true;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 u3() {
      return l6$n5.u9;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      com.aspose.slides.internal.k5.u9 var3 = super.n5(var1, var2);
      if (var3 == l6$n5.n5) {
         return var3;
      } else {
         com.aspose.slides.internal.k5.u3 var4 = (com.aspose.slides.internal.k5.u3)var3;
         if (var4.n5() != 1) {
            throw this.l6(var4.toString());
         } else {
            return var3;
         }
      }
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
      if (var5 == null) {
         return super.n5(var1, var2, var3, var4, var5, var6);
      }

      com.aspose.slides.internal.y4.n5 var7 = (com.aspose.slides.internal.y4.n5)var5;
      float var8 = var7.n5((short)1);
      return !(var8 < 0.0F) && !(var8 > 100.0F) ? var7 : l6$n5.u9;
   }
}
