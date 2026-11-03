package com.aspose.slides.internal.k0y;

import java.awt.Font;
import java.awt.Shape;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;

public class c8 extends z1 {
   @Override
   public void n5(com.aspose.slides.internal.c4i.e5 var1, com.aspose.slides.internal.o6t.l6 var2, com.aspose.slides.internal.m5l.k5 var3) throws com.aspose.slides.internal.p7x.l6 {
      com.aspose.slides.internal.c4i.x8 var4 = (com.aspose.slides.internal.c4i.x8)var1;
      boolean var5 = (var4.u9() & 2) != 0;
      com.aspose.slides.internal.o9b.n3 var6 = com.aspose.slides.internal.i8n.k5.n5((com.aspose.slides.internal.f4l.s3)var2.n5(var4.q0() & 255), var5);
      com.aspose.slides.internal.o9b.u3 var7 = this.n5(var2, var4);
      com.aspose.slides.internal.x4g.m1 var8 = null;

      try {
         if (var4.y4() != null) {
            var8 = var2.t4().m1().u9();
            var2.t4().n5(com.aspose.slides.internal.i8n.k5.n5(var4.y4()));
         }

         com.aspose.slides.internal.y5s.m1[] var9 = var4.c8();
         com.aspose.slides.internal.o9b.w1[] var10 = com.aspose.slides.internal.m0l.n5.n5(var9, 0, var9.length, false, false);
         String var11 = var4.s7();
         if ((var4.u9() & 1) != 0) {
            this.n5(var2, var4, var7, var6, var5, var11, var10);
         } else {
            this.n5(var2, var4, var7, var6, var11, var10);
         }
      } finally {
         if (var8 != null) {
            var2.t4().l6(var8);
         }
      }
   }

   private com.aspose.slides.internal.o9b.u3 n5(com.aspose.slides.internal.o6t.l6 var1, com.aspose.slides.internal.c4i.x8 var2) {
      return var2.x8()
         ? new com.aspose.slides.internal.o9b.i1(com.aspose.slides.internal.o9b.c8.n5(var2.u3()))
         : com.aspose.slides.internal.i8n.n5.n5((com.aspose.slides.internal.f4l.t9)var1.n5(var2.u3()));
   }

   private void n5(
      com.aspose.slides.internal.o6t.k5 var1,
      com.aspose.slides.internal.c4i.x8 var2,
      com.aspose.slides.internal.o9b.u3 var3,
      com.aspose.slides.internal.o9b.n3 var4,
      boolean var5,
      String var6,
      com.aspose.slides.internal.o9b.w1[] var7
   ) {
      float var8 = this.n5(var4);
      if ((var2.u9() & 4) != 0) {
         com.aspose.slides.internal.o9b.w1 var9 = new com.aspose.slides.internal.o9b.w1(var7[0].l6(), var7[0].k5());
         var9.l6(var9.k5() - var8);
         var1.t4().n5(var6, var4, var3, var9);
      } else {
         com.aspose.slides.internal.o9b.z1 var14 = var1.t4();
         float var10 = this.n5(var14, var4, 0.0F, false);

         for (int var11 = 0; var11 < var2.h0(); var11++) {
            com.aspose.slides.internal.o9b.w1 var12 = new com.aspose.slides.internal.o9b.w1(var7[var11].l6(), var7[var11].k5() - var8);
            if (var5) {
               var12.l6(var12.k5() + var10);
            } else {
               var12.n5(var12.l6() + var10);
            }

            String var13 = var6.substring(var11, var11 + 1);
            var14.n5(var13, var4, var3, var12);
         }
      }
   }

   private void n5(
      com.aspose.slides.internal.o6t.k5 var1,
      com.aspose.slides.internal.c4i.x8 var2,
      com.aspose.slides.internal.o9b.u3 var3,
      com.aspose.slides.internal.o9b.n3 var4,
      String var5,
      com.aspose.slides.internal.o9b.w1[] var6
   ) {
      int[] var7 = this.n5(var5);
      Font var8 = com.aspose.slides.internal.o9b.n3.n5(var4);
      GlyphVector var9 = var8.createGlyphVector(var1.z1().getFontRenderContext(), var7);
      com.aspose.slides.internal.o9b.z1 var10 = var1.t4();
      if ((var2.u9() & 4) != 0) {
         com.aspose.slides.internal.o9b.w1 var11 = new com.aspose.slides.internal.o9b.w1(var6[0].l6(), var6[0].k5());

         for (int var12 = 0; var12 < var2.h0(); var12++) {
            Shape var13 = var9.getGlyphOutline(var12);
            var13 = AffineTransform.getTranslateInstance(var11.l6(), var11.k5()).createTransformedShape(var13);
            var10.n5(var3, com.aspose.slides.internal.x4g.s7.n5((Object)(var13)));
         }
      } else {
         for (int var14 = 0; var14 < var2.h0(); var14++) {
            com.aspose.slides.internal.o9b.w1 var15 = new com.aspose.slides.internal.o9b.w1(var6[var14].l6(), var6[var14].k5());
            Shape var17 = var9.getGlyphOutline(var14);
            var17 = AffineTransform.getTranslateInstance(var15.l6(), var15.k5()).createTransformedShape(var17);
            var10.n5(var3, com.aspose.slides.internal.x4g.s7.n5((Object)(var17)));
         }
      }
   }

   private int[] n5(String var1) {
      byte[] var2 = var1.getBytes();
      int[] var3 = new int[var1.length()];

      for (int var4 = 0; var4 < var1.length(); var4++) {
         var3[var4] = var2[var4] & 255;
      }

      return var3;
   }

   private float n5(com.aspose.slides.internal.o9b.n3 var1) {
      com.aspose.slides.internal.o9b.y4 var2 = var1.l6();
      int var3 = var1.x8();
      return var2.k5(var3) * var1.c8() / var2.u9(var3);
   }
}
