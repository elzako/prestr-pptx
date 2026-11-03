package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class s3z {
   public static void n5(f1z var0, float var1, float var2, s5u var3) {
      TextFrame var4 = var0.n5();
      d2k var5 = new d2k(var1, var2);
      byte var6 = var4.n5.y1();
      if (var6 == 1 || var6 == 2 || var6 == 4 || var6 == 5 || var6 == 3 || var6 == 6) {
         var5.n5();
      }

      var0.n5(var5.u3(), var3);
   }

   public static com.aspose.slides.internal.o9b.y1[] n5(f1z var0) {
      n2g[] var1 = var0.u9();
      if (var1 == null) {
         return (com.aspose.slides.internal.o9b.y1[])com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.y1.class), 0)
         );
      }

      com.aspose.slides.internal.o9b.y1[] var2 = (com.aspose.slides.internal.o9b.y1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.y1.class), var1.length)
      );

      for (int var3 = 0; var3 < var2.length; var3++) {
         n2g var4 = var1[var3].n5();
         var2[var3] = new com.aspose.slides.internal.o9b.y1(var4.n5.n5, var4.n5.l6 - var4.l6.l6, var4.l6.n5, var4.l6.l6);
      }

      return var2;
   }

   static boolean n5(TextFrame var0) {
      IGenericEnumerator var1 = var0.getParagraphs().iterator();

      try {
         while (var1.hasNext()) {
            IParagraph var2 = (IParagraph)var1.next();
            IGenericEnumerator var3 = var2.getPortions().iterator();

            try {
               while (var3.hasNext()) {
                  IPortion var4 = (IPortion)var3.next();
                  MathPortion var5 = com.aspose.slides.internal.v6g.k5.n5(var4, MathPortion.class);
                  if (var5 != null && !a1w.n5(var5.getMathParagraph())) {
                     return false;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
                  var3.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return true;
   }

   public static com.aspose.slides.internal.w0.c8 n5(f1z var0, s5u var1) {
      l3f var2 = new l3f();
      com.aspose.slides.internal.o9b.y1 var3 = new com.aspose.slides.internal.o9b.y1();
      l3f[] var4 = new l3f[]{var2};
      com.aspose.slides.internal.o9b.y1[] var5 = new com.aspose.slides.internal.o9b.y1[]{var3};
      n5(var0, var4, var5, var1);
      var4[0].n5(var2);
      var5[0].a6(var3);
      TextFrame var6 = var0.n5();
      TextFrameFormat var7 = var6.n5;
      d6z var8 = new d6z();
      d2k.n5(var2.n5, d2k.n5(var2.l6, 2)).n5(var8.n5);
      var8.u3 = var2.k5.u3;
      var8.k5 = var2.k5.k5;
      if (var1 != null && var1.t2()) {
         var8.l6 = var2.k5.l6;
      }

      i2h var9 = var6.a6().k5();
      return n5(var8.n5(), var3.y4(), var9.k5(), var7.y1(), var7.getRotationAngle(), var7.getWrapText(), var7.z1());
   }

   public static com.aspose.slides.internal.w0.c8 n5(d6z var0, com.aspose.slides.internal.o9b.y1 var1, i2h var2, byte var3, float var4, byte var5, byte var6) {
      float var7 = var0.l6;
      if (com.aspose.slides.ms.System.n1.k5(var7)) {
         var7 = 0.0F;
      }

      if (!com.aspose.slides.ms.System.n1.k5(var4)) {
         var7 += var4;
      }

      d2k var8 = var0.n5.u3();
      var4 %= 360.0F;
      if (var4 < 0.0F) {
         var4 += 360.0F;
      }

      if (var4 >= 135.0F && var4 < 225.0F) {
         var1.k5((var8.n5 - var1.x8()) * 2.0F - var1.s7(), (var8.l6 - var1.n3()) * 2.0F - var1.k5());
      }

      float var9;
      float var10;
      if (var3 != 1 && var3 != 4 && var3 != 5 && var3 != 3 && var3 != 6) {
         if (var3 == 2) {
            var7 -= 90.0F;
            if (!var0.u3) {
               var1.k5(var0.k5 ? (var8.n5 - var1.x8()) * 2.0F - var1.s7() : 0.0F, 0.0F);
            } else if (!var0.k5) {
               var1.k5((var8.n5 - var1.x8()) * 2.0F - var1.s7(), 0.0F);
            }

            var9 = var8.l6 - var1.l6() + var2.a6;
            var10 = var1.x8() - var8.n5 + var2.l6;
         } else {
            if (!var0.k5 && var0.u3 || var0.k5 && !var0.u3) {
               var1.k5((var8.n5 - var1.x8()) * 2.0F - var1.s7(), 0.0F);
            }

            var9 = var1.x8() - var8.n5 + var2.l6;
            var10 = var1.n3() - var8.l6 + var2.k5;
         }
      } else {
         if (var5 != 0 || var6 != 1) {
            var7 += 90.0F;
         }

         if (!var0.u3) {
            var1.k5(var0.k5 ? (var8.n5 - var1.x8()) * 2.0F - var1.s7() : 0.0F, 0.0F);
         } else if (!var0.k5) {
            var1.k5((var8.n5 - var1.x8()) * 2.0F - var1.s7(), 0.0F);
         }

         var9 = var1.n3() - var8.l6 + var2.k5;
         var10 = var8.n5 - var1.h0() + var2.u3;
      }

      com.aspose.slides.internal.w0.c8 var11 = new com.aspose.slides.internal.w0.c8();
      var11.n5(var0.k5 ? var7 + 180.0F : var7, new com.aspose.slides.internal.o9b.w1(var8.n5, var8.l6), 0);
      var11.l6(var8.n5 + var9, var8.l6 + var10, 0);
      return var11;
   }

   public static void l6(f1z var0) {
      ShapeFrame var1 = null;
      com.aspose.slides.internal.o9b.y1 var2 = new com.aspose.slides.internal.o9b.y1();
      ShapeFrame[] var3 = new ShapeFrame[]{var1};
      com.aspose.slides.internal.o9b.y1[] var4 = new com.aspose.slides.internal.o9b.y1[]{var2};
      n5(var0, var3, var4, null);
      var1 = var3[0];
      var4[0].a6(var2);
   }

   public static boolean n5(f1z var0, ShapeFrame[] var1, s5u var2) {
      com.aspose.slides.internal.o9b.y1 var3 = new com.aspose.slides.internal.o9b.y1();
      com.aspose.slides.internal.o9b.y1[] var4 = new com.aspose.slides.internal.o9b.y1[]{var3};
      boolean var5 = n5(var0, var1, var4, var2);
      var4[0].a6(var3);
      return var5;
   }

   public static boolean n5(f1z var0, ShapeFrame[] var1, com.aspose.slides.internal.o9b.y1[] var2, s5u var3) {
      l3f var4 = new l3f();
      l3f[] var5 = new l3f[]{var4};
      boolean var6 = n5(var0, var5, var2, var3);
      var5[0].n5(var4);
      var1[0] = new ShapeFrame(var4.n5.n5, var4.n5.l6, var4.l6.n5, var4.l6.l6, (byte)(var4.k5.u3 ? 1 : 0), (byte)(var4.k5.k5 ? 1 : 0), var4.k5.l6);
      return var6;
   }

   public static boolean n5(f1z var0, l3f[] var1, com.aspose.slides.internal.o9b.y1[] var2, s5u var3) {
      float var4 = 1.25F;
      TextFrame var5 = var0.n5();
      GeometryShape var6 = (GeometryShape)var5.getParent_Immediate();
      var6.e5().y4().n5(var1[0]);
      j2x var7 = var6.t4();
      var7.n5(var1[0].n5.u3(), var1[0].l6.u3()).a6(var2[0]);
      s9 var8 = com.aspose.slides.internal.v6g.k5.n5(var6.u9(), s9.class);
      if (var8 != null && var8.h0() != null) {
         e4c var9 = e4c.k5.u9();
         e4c var10 = e4c.k5.u9();
         x4t var11 = x4t.n5.n5();
         if (var8.h0() != null) {
            e4c[] var12 = new e4c[]{var9};
            e4c[] var13 = new e4c[]{var10};
            x4t[] var14 = new x4t[]{var11};
            z5b.n5(var8.h0(), var12, var13, var14);
            var12[0].l6(var9);
            var13[0].l6(var10);
            var14[0].n5(var11);
         }

         if (!com.aspose.slides.ms.System.d2.k5(var6.R_().k5())) {
            var11.l6 = (com.aspose.slides.ms.System.n1.k5(var11.l6) ? 0.0F : var11.l6) + var6.R_().k5();
         }

         l3f var18 = new l3f();
         var9.a6().n5(var18.n5);
         var10.a6().n5(var18.l6);
         var11.n5(var18.k5);
         var6.e5().n5(var18).n5(var1[0]);
         var2[0] = new com.aspose.slides.internal.o9b.y1(var1[0].n5.n5, var1[0].n5.l6, var1[0].l6.n5, var1[0].l6.l6);
      }

      if (var5.n5.q0()) {
         n5(var6, var1[0].l6()).a6(var2[0]);
         var1[0].k5.l6 = 0.0F;
         var1[0].k5.k5 = false;
      }

      i2h var15 = var5.n5(var6).k5();
      n5(var0, var2[0].s7() - var15.l6 - var15.u3, var2[0].k5() - var15.k5 - var15.a6, var3);
      float var16 = var0.k5().l6;
      float var17 = var16 / (var2[0].k5() - var15.k5 - var15.a6);
      if (var17 > 1.25F || var17 < 0.8F) {
         h9z var19 = var5.n5.d2();
         if (var19.getAutofitType() == 2 && var19.getTextVerticalType() == 0 && var19.u9().n5() == 0) {
            if (com.aspose.slides.internal.v6g.k5.l6(var6.f0().p3(), IChartComponent.class)) {
               o4f var20 = var6.f0().s3();
               e4c.l6(var1[0].n5.l6(), var20.n5()).a6().n5(var1[0].n5);
            }

            var1[0].l6.l6 = var16 + var15.k5 + var15.a6;
            return false;
         }
      }

      return true;
   }

   private static com.aspose.slides.internal.o9b.y1 n5(GeometryShape var0, l3f var1) {
      float var2 = var1.k5.l6;
      if (com.aspose.slides.ms.System.n1.k5(var2)) {
         var2 = 0.0F;
      }

      var2 %= 360.0F;
      com.aspose.slides.internal.o9b.y1 var3 = var0.e2().n5(d2k.k5.u3(), var1.l6.u3()).y4();
      d2k var4 = d2k.n5(var1.n5, d2k.n5(var1.l6, 2)).u3();
      com.aspose.slides.internal.w0.c8 var5 = new com.aspose.slides.internal.w0.c8();
      var5.n5(var2, new com.aspose.slides.internal.o9b.w1(var4.n5, var4.l6));
      float var6 = var1.k5.k5 ? var1.l6.l6 - var3.k5() : 0.0F;
      com.aspose.slides.internal.o9b.w1 var7 = var5.n5(
            new com.aspose.slides.internal.o9b.w1(var1.n5.n5 + var3.x8() + var3.s7() / 2.0F, var1.n5.l6 + var3.n3() + var3.k5() / 2.0F + var6)
         )
         .u3();
      float var8 = var3.k5() / 2.0F;
      float var9 = var3.s7() / 2.0F;
      if (var2 > 45.0F && var2 < 135.0F) {
         var8 = var9;
         var9 = var3.k5() / 2.0F;
      } else if (var2 > 225.0F && var2 < 315.0F) {
         var8 = var9;
         var9 = var3.k5() / 2.0F;
      }

      return new com.aspose.slides.internal.o9b.y1(var7.l6() - var9, var7.k5() - var8, var9 * 2.0F, var8 * 2.0F);
   }

   public static float k5(f1z var0) {
      n2g[] var1 = var0.u9();
      float var2 = 0.0F;

      int var3;
      for (var3 = var1.length; var3 > 0; var3--) {
         n2g var4 = var1[var3 - 1].n5();
         if (!var4.a6) {
            break;
         }
      }

      e4h[] var11 = var0.h0();

      for (int var5 = 0; var5 < var11.length; var5++) {
         int var6 = var11[var5].n5;
         int var7 = var5 + 1 < var11.length ? var11[var5 + 1].n5 : var1.length;
         if (var3 < var7) {
            var7 = var3;
         }

         if (var6 < var7) {
            n2g var8 = var1[var6].n5();
            n2g var9 = var1[var7 - 1].n5();
            float var10 = var9.n5.l6 + var9.u3 - (var8.n5.l6 - var8.k5);
            var2 = com.aspose.slides.ms.System.q1.n5((float)(var2), (float)(var10));
         }
      }

      return var2;
   }

   public static void n5(e2n var0, TextParam var1) {
      if (!var0.u3().isEmpty()) {
         for (m4i var3 : var0.u3()) {
            if (var3.n5 != null && var3.n5.getEscapement() > 0.0F) {
               var1.u3(false);
               break;
            }
         }
      }
   }
}
