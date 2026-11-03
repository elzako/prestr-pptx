package com.aspose.slides.internal.s7;

import com.aspose.slides.internal.k5.l6$n5;

public class b7 extends com.aspose.slides.internal.n3.h0 {
   private static final com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> n5 = new com.aspose.slides.internal.u3.c8<>();

   @Override
   public String n5() {
      return "text-align";
   }

   @Override
   public int l6() {
      return 240;
   }

   @Override
   public boolean k5() {
      return true;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 u3() {
      return l6$n5.p8;
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
      if (var4.u3(var6)) {
         com.aspose.slides.internal.k5.k7 var7 = com.aspose.slides.internal.h0.h0.n5((com.aspose.slides.internal.j3.z3)var1);
         if (var7 != null) {
            com.aspose.slides.internal.y4.z1 var8 = var7.n5(null);
            if (var8 != null) {
               com.aspose.slides.internal.k5.u9 var9 = var8.n5(var2.u3(92));
               if (var9 != null && var9 == l6$n5.s8) {
                  com.aspose.slides.internal.k5.u9 var10 = var8.n5(var2.u3(240));
                  if (var10 != null && var10 == l6$n5.i1) {
                     int var11 = var2.u3(164);
                     int var12 = var2.u3(165);
                     if (var4.n5(var11) == null && var4.n5(var12) == null) {
                        var5 = l6$n5.p8;
                        var4.n5(var11, l6$n5.y1);
                        var4.n5(var12, l6$n5.y1);
                     }
                  }
               }
            }
         }
      }

      if (var5 == null || com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.internal.y4.l6.class) || var4.u3(var6)) {
         int var13 = var2.u3(91);
         com.aspose.slides.internal.k5.u9 var14 = var2.n5(var1, var3, var13);
         if (var14 != l6$n5.e8) {
            if (var4.u3(var6) && var5 != null) {
               return var5;
            }

            return l6$n5.p8;
         }

         if (var5 == l6$n5.p8) {
            return l6$n5.b3;
         }

         if (var5 == l6$n5.b3) {
            return l6$n5.p8;
         }
      }

      return var5;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      com.aspose.slides.internal.k5.u9 var3 = super.n5(var1, var2);
      return var3 == l6$n5.y8 ? this.u3() : var3;
   }

   static {
      n5.n5("left", l6$n5.p8);
      n5.n5("right", l6$n5.b3);
      n5.n5("center", l6$n5.i1);
      n5.n5("justify", l6$n5.a9);
      n5.n5("middle", l6$n5.i1);
   }
}
