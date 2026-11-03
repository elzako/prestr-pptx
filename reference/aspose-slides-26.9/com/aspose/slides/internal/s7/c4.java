package com.aspose.slides.internal.s7;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.k5.l6$n5;

public class c4 extends com.aspose.slides.internal.n3.s7 {
   private static final com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> n5 = new com.aspose.slides.internal.u3.c8<>();

   @Override
   public String n5() {
      return "border-image-width";
   }

   @Override
   public int l6() {
      return 46;
   }

   @Override
   public boolean k5() {
      return false;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 u3() {
      return new com.aspose.slides.internal.k5.h0(l6$n5.k5);
   }

   @Override
   public com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> a6() {
      return n5;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      com.aspose.slides.internal.k5.h0 var3 = new com.aspose.slides.internal.k5.h0();

      while (var1 != null) {
         var3.l6(super.n5(var1, var2));
         var1 = var1.k5();
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
      com.aspose.slides.internal.k5.h0 var7 = (com.aspose.slides.internal.k5.h0)var5;
      if (var7.n5() != 4) {
         IGenericList var8 = new List<>(var7);
         var8 = this.n5(var8, com.aspose.slides.internal.k5.u9.class);
         var7 = new com.aspose.slides.internal.k5.h0(var8);
      }

      return super.n5(var1, var2, var3, var4, var7, var6);
   }

   static {
      n5.n5("auto", l6$n5.y1);
   }
}
