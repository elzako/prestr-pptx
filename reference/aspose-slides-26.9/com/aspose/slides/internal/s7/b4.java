package com.aspose.slides.internal.s7;

import com.aspose.slides.internal.k5.l6$n5;

public class b4 extends com.aspose.slides.internal.n3.x8 {
   @Override
   public String n5() {
      return "opacity";
   }

   @Override
   public int l6() {
      return 185;
   }

   @Override
   public boolean k5() {
      return false;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 u3() {
      return l6$n5.k5;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      switch (var1.n5()) {
         case 12:
            return l6$n5.n5;
         case 13:
            return new com.aspose.slides.internal.y4.c8(var1.a6(), (short)1);
         case 14:
            return new com.aspose.slides.internal.y4.c8(var1.u9(), (short)1);
         default:
            throw com.aspose.slides.internal.z8.u9.n5(var1.n5());
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
      com.aspose.slides.internal.y4.c8 var7 = (com.aspose.slides.internal.y4.c8)super.n5(var1, var2, var3, var4, var5, var6);
      float var8 = var7.n5(var7.n5());
      if (var8 < 0.0F) {
         return l6$n5.l6;
      } else {
         return var8 > 1.0F ? l6$n5.k5 : var7;
      }
   }
}
