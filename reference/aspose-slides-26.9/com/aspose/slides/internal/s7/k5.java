package com.aspose.slides.internal.s7;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.k5.l6$n5;
import com.aspose.slides.ms.System.IDisposable;

public class k5 extends com.aspose.slides.internal.n3.l6 {
   private static final com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> n5 = new com.aspose.slides.internal.u3.c8<>();

   @Override
   public String n5() {
      return "azimuth";
   }

   @Override
   public int l6() {
      return 15;
   }

   @Override
   public boolean k5() {
      return true;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 u3() {
      com.aspose.slides.internal.k5.h0 var1 = new com.aspose.slides.internal.k5.h0();
      var1.l6(l6$n5.i1);
      return var1;
   }

   @Override
   public com.aspose.slides.internal.u3.c8<com.aspose.slides.internal.k5.u9> a6() {
      return n5;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 n5(com.aspose.slides.internal.z8.y4 var1, com.aspose.slides.internal.h0.h0 var2) {
      com.aspose.slides.internal.k5.h0 var3 = new com.aspose.slides.internal.k5.h0();

      do {
         var3.l6(super.n5(var1, var2));
         var1 = var1.k5();
      } while (var1 != null);

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
      if (var4.u3(var6)) {
         return var5;
      }

      com.aspose.slides.internal.k5.h0 var7 = (com.aspose.slides.internal.k5.h0)var5;
      boolean var8 = false;
      com.aspose.slides.internal.k5.u9 var9 = null;
      IGenericEnumerator var10 = var7.iterator();

      try {
         while (var10.hasNext()) {
            com.aspose.slides.internal.k5.u9 var11 = (com.aspose.slides.internal.k5.u9)var10.next();
            if (l6$n5.v4 == var11) {
               var8 = true;
            } else {
               if (((com.aspose.slides.internal.k5.u3)var11).n5() != 21) {
                  return var11;
               }

               if (l6$n5.u6 == var11 || l6$n5.t1 == var11) {
                  return var11;
               }

               var9 = var11;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
            var10.dispose();
         }
      }

      if (var9 != null) {
         if (l6$n5.d5 == var9) {
            return !var8 ? new com.aspose.slides.internal.y4.c8(270.0F, (short)11) : new com.aspose.slides.internal.y4.c8(270.0F, (short)11);
         }

         if (l6$n5.s3 == var9) {
            return !var8 ? new com.aspose.slides.internal.y4.c8(300.0F, (short)11) : new com.aspose.slides.internal.y4.c8(240.0F, (short)11);
         }

         if (l6$n5.p8 == var9) {
            return !var8 ? new com.aspose.slides.internal.y4.c8(320.0F, (short)11) : new com.aspose.slides.internal.y4.c8(220.0F, (short)11);
         }

         if (l6$n5.f2 == var9) {
            return !var8 ? new com.aspose.slides.internal.y4.c8(340.0F, (short)11) : new com.aspose.slides.internal.y4.c8(200.0F, (short)11);
         }

         if (l6$n5.i1 == var9) {
            return !var8 ? new com.aspose.slides.internal.y4.c8(0.0F, (short)11) : new com.aspose.slides.internal.y4.c8(180.0F, (short)11);
         }

         if (l6$n5.e5 == var9) {
            return !var8 ? new com.aspose.slides.internal.y4.c8(20.0F, (short)11) : new com.aspose.slides.internal.y4.c8(160.0F, (short)11);
         }

         if (l6$n5.b3 == var9) {
            return !var8 ? new com.aspose.slides.internal.y4.c8(40.0F, (short)11) : new com.aspose.slides.internal.y4.c8(140.0F, (short)11);
         }

         if (l6$n5.o0 == var9) {
            return !var8 ? new com.aspose.slides.internal.y4.c8(60.0F, (short)11) : new com.aspose.slides.internal.y4.c8(120.0F, (short)11);
         }

         if (l6$n5.z7 == var9) {
            return !var8 ? new com.aspose.slides.internal.y4.c8(90.0F, (short)11) : new com.aspose.slides.internal.y4.c8(90.0F, (short)11);
         }
      }

      return var5;
   }

   static {
      n5.n5("left-side", l6$n5.d5);
      n5.n5("far-left", l6$n5.s3);
      n5.n5("left", l6$n5.p8);
      n5.n5("center-left", l6$n5.f2);
      n5.n5("center", l6$n5.i1);
      n5.n5("center-right", l6$n5.e5);
      n5.n5("right", l6$n5.b3);
      n5.n5("far-right", l6$n5.o0);
      n5.n5("right-side", l6$n5.z7);
      n5.n5("behind", l6$n5.v4);
      n5.n5("leftwards", l6$n5.u6);
      n5.n5("rightwards", l6$n5.t1);
   }
}
