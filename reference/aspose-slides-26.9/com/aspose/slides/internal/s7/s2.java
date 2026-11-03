package com.aspose.slides.internal.s7;

import com.aspose.slides.internal.k5.l6$n5;

public class s2 extends com.aspose.slides.internal.n3.s7 {
   private static final com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> n5 = new com.aspose.slides.internal.u3.c8<>();

   @Override
   public String n5() {
      return "max-width";
   }

   @Override
   public int l6() {
      return 174;
   }

   @Override
   public boolean k5() {
      return false;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 u3() {
      return l6$n5.a0;
   }

   @Override
   public com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> a6() {
      return n5;
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

   static {
      n5.n5("none", l6$n5.a0);
   }
}
