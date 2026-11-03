package com.aspose.slides.internal.s7;

import com.aspose.slides.internal.k5.l6$n5;

public class s1 extends com.aspose.slides.internal.n3.s7 {
   private static final com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> n5 = new com.aspose.slides.internal.u3.c8<>();

   @Override
   public String n5() {
      return "z-index";
   }

   @Override
   public int l6() {
      return 289;
   }

   @Override
   public boolean k5() {
      return false;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 u3() {
      return l6$n5.y1;
   }

   @Override
   public com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> a6() {
      return n5;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      com.aspose.slides.internal.k5.u9 var3 = super.n5(var1, var2);
      if (var3.h0() == 1 && ((com.aspose.slides.internal.k5.u3)var3).n5() != 21) {
         com.aspose.slides.internal.y4.n5 var4 = com.aspose.slides.internal.v6g.k5.n5(var3, com.aspose.slides.internal.y4.n5.class);
         if (var4 != null && var4.n5() != 1) {
            throw com.aspose.slides.internal.z8.u9.k5(var4.u9());
         }
      }

      return var3;
   }

   static {
      n5.n5("auto", l6$n5.y1);
   }
}
