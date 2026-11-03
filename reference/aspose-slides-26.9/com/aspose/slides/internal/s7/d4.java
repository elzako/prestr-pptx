package com.aspose.slides.internal.s7;

import com.aspose.slides.internal.k5.l6$n5;

public class d4 extends com.aspose.slides.internal.n3.s7 {
   private static final com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> n5 = new com.aspose.slides.internal.u3.c8<>();

   @Override
   public String n5() {
      return "volume";
   }

   @Override
   public int l6() {
      return 282;
   }

   @Override
   public boolean k5() {
      return true;
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
   public com.aspose.slides.internal.k5.u9 n5(
      com.aspose.slides.internal.k5.k7 var1,
      com.aspose.slides.internal.h0.h0 var2,
      String var3,
      com.aspose.slides.internal.y4.z1 var4,
      com.aspose.slides.internal.k5.u9 var5,
      int var6
   ) {
      com.aspose.slides.internal.k5.u9 var7 = super.n5(var1, var2, var3, var4, var5, var6);
      com.aspose.slides.internal.y4.n5 var8 = null;
      if (com.aspose.slides.internal.v6g.k5.l6(var7, com.aspose.slides.internal.y4.n3.class)) {
         var8 = com.aspose.slides.internal.v6g.k5.n5(var7, com.aspose.slides.internal.y4.n3.class);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(var7, com.aspose.slides.internal.y4.c8.class)) {
         var8 = com.aspose.slides.internal.v6g.k5.n5(var7, com.aspose.slides.internal.y4.c8.class);
      }

      if (var8 != null) {
         float var9 = var8.n5((short)1);
         if (var9 < 0.0F || var9 > 100.0F) {
            return l6$n5.w2;
         }
      }

      return var7;
   }

   static {
      n5.n5("silent", l6$n5.l7);
      n5.n5("x-soft", l6$n5.p7);
      n5.n5("soft", l6$n5.z5);
      n5.n5("medium", l6$n5.w2);
      n5.n5("loud", l6$n5.h5);
      n5.n5("x-loud", l6$n5.a8);
   }
}
