package com.aspose.slides.internal.s7;

import com.aspose.slides.internal.k5.l6$n5;

public class l0 extends com.aspose.slides.internal.n3.x8 {
   @Override
   public String n5() {
      return "min-width";
   }

   @Override
   public int l6() {
      return 176;
   }

   @Override
   public boolean k5() {
      return false;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 u3() {
      return l6$n5.l6;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      com.aspose.slides.internal.k5.u9 var3 = super.n5(var1, var2);
      com.aspose.slides.internal.y4.n5 var4 = com.aspose.slides.internal.v6g.k5.n5(var3, com.aspose.slides.internal.y4.n5.class);
      if (var4 != null
         && (
            com.aspose.slides.internal.v6g.k5.l6(var4, com.aspose.slides.internal.y4.n3.class)
               || com.aspose.slides.internal.v6g.k5.l6(var4, com.aspose.slides.internal.y4.c8.class)
         )
         && var4.n5(var4.n5()) < 0.0F) {
         throw com.aspose.slides.internal.z8.u9.k5(var4.u9());
      } else {
         return var3;
      }
   }
}
