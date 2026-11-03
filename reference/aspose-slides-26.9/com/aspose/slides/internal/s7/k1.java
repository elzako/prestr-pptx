package com.aspose.slides.internal.s7;

import com.aspose.slides.internal.k5.l6$n5;

public class k1 extends com.aspose.slides.internal.n3.t2 {
   @Override
   public String n5() {
      return "richness";
   }

   @Override
   public int l6() {
      return 221;
   }

   @Override
   public boolean k5() {
      return false;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 u3() {
      return l6$n5.u9;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      com.aspose.slides.internal.y4.n5 var3 = com.aspose.slides.internal.v6g.k5.n5(super.n5(var1, var2), com.aspose.slides.internal.y4.n5.class);
      if (var3 != null) {
         if (var3.n5() != 1) {
            throw com.aspose.slides.internal.z8.u9.k5(var3.u9());
         }

         float var4 = var3.n5((short)1);
         if (var4 < 0.0F || var4 > 100.0F) {
            throw com.aspose.slides.internal.z8.u9.k5(var3.u9());
         }
      }

      return var3;
   }
}
