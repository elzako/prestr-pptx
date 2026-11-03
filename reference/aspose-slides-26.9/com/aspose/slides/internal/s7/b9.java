package com.aspose.slides.internal.s7;

import com.aspose.slides.internal.k5.l6$n5;

public class b9 extends com.aspose.slides.internal.n3.s7 {
   private static final com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> n5 = new com.aspose.slides.internal.u3.c8<>();

   @Override
   public String n5() {
      return "line-height";
   }

   @Override
   public int l6() {
      return 153;
   }

   @Override
   public boolean k5() {
      return true;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 u3() {
      return l6$n5.d2;
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
      if (var4.u3(var6)) {
         com.aspose.slides.internal.k5.u3 var8 = (com.aspose.slides.internal.k5.u3)var7;
         if (var8.n5() == 2) {
            return l6$n5.d2;
         }
      }

      return var7;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      com.aspose.slides.internal.k5.u9 var3 = super.n5(var1, var2);
      if (var3 == l6$n5.y8) {
         return this.u3();
      } else {
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

   static {
      n5.n5("normal", l6$n5.d2);
   }
}
