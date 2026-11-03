package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

class k0r implements IDisposable {
   private boolean n5;
   private com.aspose.slides.internal.b7.m0 l6;

   public k0r(com.aspose.slides.internal.b7.m0 var1) {
      this.l6 = var1;
   }

   public final void n5(e3 var1, s5u var2, GeometryShape var3, TextFrame var4, com.aspose.slides.internal.w0.c8 var5) {
      Presentation.n5(((FontsManager)var3.getPresentation().getFontsManager()).l6(), false);
      com.aspose.slides.internal.b7.n4 var6 = new com.aspose.slides.internal.b7.n4();
      com.aspose.slides.internal.b7.z6e var7 = n5(var3.e5().n3());
      com.aspose.slides.internal.b7.w7 var8 = new com.aspose.slides.internal.b7.w7(var6, null, n5(var3, var7));
      n5(var4, var8.l6());
      j0b var9 = new j0b(var1.s7(), var1.x8(), var1.c8() / 8.0F, var1.t2() / 8.0F);

      try {
         com.aspose.slides.internal.w0.c8 var10 = var5.k5();
         float var11 = (float)(-var7.u3()) / 60000.0F;
         var10.n5(
            var8.n5().u9().k5() ? var11 + 180.0F : var11,
            new com.aspose.slides.internal.o9b.w1(
               (float)(var7.n5().n5() + var7.l6().n5() / 2.0) / 12700.0F, (float)(var7.n5().l6() + var7.l6().l6() / 2.0) / 12700.0F
            ),
            1
         );
         com.aspose.slides.internal.w0.c8 var12 = var5.k5();
         var12.l6(-var10.c8(), -var10.t2());
         var9.k5(var10);
         var1.k5(var12);
         var4.u3.n5(var9, var2);
         var8.l6().n5(var9.n5(), var9.l6());
         com.aspose.slides.internal.o9b.y1 var13 = new com.aspose.slides.internal.o9b.y1();
         com.aspose.slides.internal.o9b.y1[] var14 = new com.aspose.slides.internal.o9b.y1[]{var13};
         com.aspose.slides.internal.x4g.s7[] var15 = var8.l6().n5(var14);
         var14[0].a6(var13);
         n5(var1, var9, var15, var13.y4());
         var1.z3();
         var9.z3();
      } finally {
         if (var9 != null) {
            var9.dispose();
         }
      }
   }

   public final com.aspose.slides.internal.o9b.l6 n5(s5u var1, GeometryShape var2, TextFrame var3, com.aspose.slides.internal.o9b.y1[] var4) {
      return this.n5(var1, var2, var3, var4, false);
   }

   public final com.aspose.slides.internal.o9b.l6 n5(s5u var1, GeometryShape var2, TextFrame var3, com.aspose.slides.internal.o9b.y1[] var4, boolean var5) {
      Presentation.n5(((FontsManager)var2.getPresentation().getFontsManager()).l6(), false);
      com.aspose.slides.internal.b7.n4 var6 = new com.aspose.slides.internal.b7.n4();
      com.aspose.slides.internal.b7.z6e var7 = new com.aspose.slides.internal.b7.z6e(
         new com.aspose.slides.internal.b7.w9(0.0, 0.0),
         new com.aspose.slides.internal.b7.j6(var2.getWidth() * 12700.0F, var2.getHeight() * 12700.0F),
         0.0,
         false,
         false
      );
      com.aspose.slides.internal.b7.w7 var8 = new com.aspose.slides.internal.b7.w7(var6, null, n5(var2, var7));
      n5(var3, var8.l6());
      j0b var9 = new j0b(65536, 65536, 96.0F, 96.0F);

      com.aspose.slides.internal.o9b.l6 var16;
      try {
         var3.u3.n5(var9, var1);
         var8.l6().n5(var9.n5(), var9.l6());
         com.aspose.slides.internal.o9b.y1 var10 = new com.aspose.slides.internal.o9b.y1();
         com.aspose.slides.internal.o9b.y1[] var11 = new com.aspose.slides.internal.o9b.y1[]{var10};
         com.aspose.slides.internal.x4g.s7[] var12 = var8.l6().n5(var11);
         var11[0].a6(var10);
         float var13 = com.aspose.slides.ms.System.q1.l6(var10.s7(), var10.k5());
         var4[0] = new com.aspose.slides.internal.o9b.y1(var10.x8() - var13, var10.n3() - var13, var10.s7() + var13 * 2.0F, var10.k5() + var13 * 2.0F);
         int var14 = com.aspose.slides.internal.v6g.k5.u3(var4[0].s7() * 96.0F / 72.0F + 0.5F, 13);
         int var15 = com.aspose.slides.internal.v6g.k5.u3(var4[0].k5() * 96.0F / 72.0F + 0.5, 14);
         var16 = new com.aspose.slides.internal.o9b.l6(var14, var15, 2498570);
         var16.n5(96.0F, 96.0F);
         com.aspose.slides.internal.o9b.z1 var17 = com.aspose.slides.internal.o9b.z1.n5(var16);

         try {
            var17.n5(com.aspose.slides.internal.o9b.c8.e2().o8());
         } finally {
            if (var17 != null) {
               var17.dispose();
            }
         }

         r1c var18 = new r1c(var16, var4[0].s7(), var4[0].k5());

         try {
            var18.l6(new com.aspose.slides.internal.w0.c8(1.0F, 0.0F, 0.0F, 1.0F, -var4[0].x8(), -var4[0].n3()));
            n5(var18, var9, var12, var10.y4(), var5);
         } finally {
            if (var18 != null) {
               var18.dispose();
            }
         }
      } finally {
         if (var9 != null) {
            var9.dispose();
         }
      }

      var4[0].k5(var2.getX(), var2.getY());
      return var16;
   }

   public static com.aspose.slides.internal.x4g.s7[] n5(
      e3 var0,
      s5u var1,
      GeometryShape var2,
      TextFrame var3,
      ShapeFrame var4,
      com.aspose.slides.internal.w0.c8 var5,
      List<TextParam>[] var6,
      com.aspose.slides.internal.o9b.y1[] var7
   ) {
      com.aspose.slides.internal.x4g.s7[] var8 = null;
      Presentation.n5(((FontsManager)var2.getPresentation().getFontsManager()).l6(), false);
      com.aspose.slides.internal.b7.n4 var9 = new com.aspose.slides.internal.b7.n4();
      com.aspose.slides.internal.b7.z6e var10 = n5(var4);
      com.aspose.slides.internal.b7.w7 var11 = new com.aspose.slides.internal.b7.w7(var9, null, n5(var2, var10));
      n5(var3, var11.l6());
      j0b var12 = new j0b(var0.s7(), var0.x8(), var0.c8() / 8.0F, var0.t2() / 8.0F);

      try {
         com.aspose.slides.internal.w0.c8 var13 = var5.k5();
         float var14 = (float)(-var10.u3()) / 60000.0F;
         var13.n5(
            var11.n5().u9().k5() ? var14 + 180.0F : var14,
            new com.aspose.slides.internal.o9b.w1(
               (float)(var10.n5().n5() + var10.l6().n5() / 2.0) / 12700.0F, (float)(var10.n5().l6() + var10.l6().l6() / 2.0) / 12700.0F
            ),
            1
         );
         com.aspose.slides.internal.w0.c8 var15 = var5.k5();
         var15.l6(-var13.c8(), -var13.t2());
         var12.k5(var13);
         var3.u3.n5(var12, var1);
         var11.l6().n5(var12.n5(), var12.l6());
         var8 = var11.l6().n5(var7);
         var6[0] = var12.k5();
         var12.z3();
      } finally {
         if (var12 != null) {
            var12.dispose();
         }
      }

      return var8;
   }

   private static void n5(
      IOuterShadowEffectiveData var0, com.aspose.slides.internal.x4g.s7 var1, TextParam var2, com.aspose.slides.internal.o9b.y1 var3, e3 var4, boolean var5
   ) {
      if (var0 != null) {
         if (var0.getBlurRadius() > 1.0 && var0.getScaleHorizontal() <= 110.0 && var0.getScaleVertical() <= 110.0) {
            z2r var19 = new z2r(var0, var5);
            com.aspose.slides.internal.x4g.s7 var20 = com.aspose.slides.internal.v6g.k5.n5(var1.deepClone(), com.aspose.slides.internal.x4g.s7.class);

            try {
               var19.n5(var4, var1, var2);
            } finally {
               if (var20 != null) {
                  var20.dispose();
               }
            }
         } else {
            z2r var6 = new z2r(var0, var5);
            com.aspose.slides.internal.x4g.s7 var7 = com.aspose.slides.internal.v6g.k5.n5(var1.deepClone(), com.aspose.slides.internal.x4g.s7.class);

            try {
               com.aspose.slides.internal.x4g.m1 var8 = var6.n5(var2, var3.y4(), Float.NaN, false);
               var7.l6(var8);
               float var9 = (var2.u3().n5().s7() & 0xFF) / 255.0F;
               float var10 = (((k0p)var0).l6().s7() & 0xFF) * var9;
               com.aspose.slides.internal.o9b.c8 var11 = com.aspose.slides.internal.o9b.c8.n5(
                     com.aspose.slides.internal.v6g.k5.u3(var10, 13), ((k0p)var0).l6().o8()
                  )
                  .o8();
               var4.n5(var7, null, new a1v(var11.o8()));
            } finally {
               if (var7 != null) {
                  var7.dispose();
               }
            }
         }
      }
   }

   @Override
   public final void dispose() {
      this.n5(true);
      com.aspose.slides.ms.System.e5.n5(this);
   }

   private void n5(boolean var1) {
      if (!this.n5) {
         if (var1 && this.l6 != null) {
            this.l6.dispose();
         }

         this.n5 = true;
      }
   }

   private static void n5(e3 var0, j0b var1, com.aspose.slides.internal.x4g.s7[] var2, com.aspose.slides.internal.o9b.y1 var3) {
      n5(var0, var1.k5(), var2, var3.y4(), false);
   }

   private static void n5(e3 var0, j0b var1, com.aspose.slides.internal.x4g.s7[] var2, com.aspose.slides.internal.o9b.y1 var3, boolean var4) {
      n5(var0, var1.k5(), var2, var3.y4(), var4);
   }

   static void n5(e3 var0, List<TextParam> var1, com.aspose.slides.internal.x4g.s7[] var2, com.aspose.slides.internal.o9b.y1 var3, boolean var4) {
      for (int var5 = 0; var5 < var2.length; var5++) {
         com.aspose.slides.internal.x4g.s7 var6 = var2[var5];
         TextParam var7 = (TextParam)var1.get_Item(var5);
         if (var6.h0() > 1 && var7.x8()) {
            n5(var7.x8, var6, var7, var3.y4(), var0, true);
            n5(var7.s7, var6, var7, var3.y4(), var0, false);
         }

         if (var6.h0() > 1 && var7.o0()) {
            i5q var8 = new i5q(var7.t2);
            var8.n5(var0, var6, var7.u3(), var7.a6());
         }

         if (var6.h0() > 1 && var7.b3()) {
            q1k var12 = new q1k(var7.c8);
            var12.n5(var0, var6, var7, new com.aspose.slides.internal.o9b.w1(var3.x8(), var3.l6()));
         }
      }

      for (int var9 = 0; var9 < var2.length; var9++) {
         com.aspose.slides.internal.x4g.s7 var10 = var2[var9];
         if (var10.h0() > 1) {
            TextParam var11 = (TextParam)var1.get_Item(var9);
            if (com.aspose.slides.internal.v6g.k5.l6(var11.u3(), u4z.class)) {
               com.aspose.slides.internal.v6g.k5.n5(var11.u3(), u4z.class).k5(var3.y4());
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var11.a6().u9, u4z.class)) {
               com.aspose.slides.internal.v6g.k5.n5(var11.a6().u9, u4z.class).k5(var3.y4());
            }

            if (!var4) {
               var0.n5(var10, var11.a6(), var11.u3());
            }

            if (var10.h0() > 1 && var11.z7()) {
               m8i var13 = new m8i(var11.y4);
               var13.n5(var0, var10, var11);
            }
         }
      }
   }

   private static void n5(TextFrame var0, com.aspose.slides.internal.b7.v7u var1) {
      if (var0 != null) {
         boolean var2 = ((TextFrameFormat)var0.getTextFrameFormat()).c8().l6();
         String[] var3 = null;
         int var4 = 0;
         if (var2) {
            IParagraphCollection var5 = var0.getParagraphs();
            i8f[] var6 = new i8f[var5.getCount()];

            for (int var7 = 0; var7 < var5.getCount(); var7++) {
               var6[var7] = new y5o((Paragraph)var5.get_Item(var7));
            }

            var3 = v6o.n5(com.aspose.slides.ms.System.u3.n5(var6), var5.getCount(), false);
         }

         IGenericEnumerator var32 = var0.getParagraphs().iterator();

         try {
            while (var32.hasNext()) {
               Paragraph var33 = (Paragraph)var32.next();
               com.aspose.slides.internal.b7.t9p var35 = new com.aspose.slides.internal.b7.t9p();
               IParagraphFormatEffectiveData var8 = var33.getParagraphFormat().getEffective();
               com.aspose.slides.internal.b7.o9 var9 = var35.n5();
               var9.n5(var8.getAlignment());
               var9.n5(var8.getDefaultTabSize());
               var9.l6(var8.getFontAlignment());
               var9.n5(new com.aspose.slides.internal.b7.r5d(var8.getMarginLeft() * 12700.0F));
               var9.l6(new com.aspose.slides.internal.b7.r5d(var8.getMarginRight() * 12700.0F));
               var9.u3(var9.x8());
               if (var2 && !com.aspose.slides.ms.System.d1.n5(var3[var4])) {
                  var9.n5(new com.aspose.slides.internal.b7.u0a(var3[var4]));
               }

               var4++;
               var1.n5(var35);
               IGenericEnumerator var10 = var33.getPortions().iterator();

               try {
                  while (var10.hasNext()) {
                     Portion var11 = (Portion)var10.next();
                     IPortionFormatEffectiveData var12 = var11.getPortionFormat().getEffective();
                     com.aspose.slides.internal.b7.w1n var13 = new com.aspose.slides.internal.b7.w1n();
                     var13.l6(var12.getAlternativeLanguageId());
                     var13.n5(var12.getFontBold());
                     var13.u3(var12.getTextCapType());
                     var13.k5(
                        var12.getComplexScriptFont().getFontName() != null
                           ? new com.aspose.slides.internal.b7.r6i(var12.getComplexScriptFont().getFontName())
                           : null
                     );
                     var13.l6(
                        !com.aspose.slides.ms.System.d1.a6(var12.getEastAsianFont().getFontName(), com.aspose.slides.ms.System.d1.n5)
                           ? new com.aspose.slides.internal.b7.r6i(var12.getEastAsianFont().getFontName())
                           : null
                     );
                     var13.n5(n5(var12.getFillFormat()));
                     var13.u3(((c9g)var12).h0() * 100.0F);
                     var13.l6(var12.getFontItalic());
                     var13.k5(var12.getKumimoji());
                     var13.n5(var12.getLanguageId());
                     var13.n5(
                        !com.aspose.slides.ms.System.d1.a6(var12.getLatinFont().getFontName(), com.aspose.slides.ms.System.d1.n5)
                           ? new com.aspose.slides.internal.b7.r6i(var12.getLatinFont().getFontName())
                           : null
                     );
                     var13.l6(n5(var12.getLineFormat().getFillFormat()));
                     var13.n5(new com.aspose.slides.internal.b7.g6());
                     n5(var12.getLineFormat(), var13.n5());
                     var13.u3(var12.getNormaliseHeight());
                     var13.k5(var12.getStrikethroughType());
                     var13.u3(
                        !com.aspose.slides.ms.System.d1.a6(var12.getSymbolFont().getFontName(), com.aspose.slides.ms.System.d1.n5)
                           ? new com.aspose.slides.internal.b7.r6i(var12.getSymbolFont().getFontName())
                           : null
                     );
                     var13.l6(var12.getFontUnderline());
                     com.aspose.slides.internal.b7.m5 var14 = new com.aspose.slides.internal.b7.m5(var11.u9());
                     var14.n5(var13);
                     var35.n5(var14);
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
                     var10.dispose();
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var32, IDisposable.class)) {
               var32.dispose();
            }
         }

         x8m var34 = var0.n5.c8();
         if (var0.h0() && var34.n5() != -1) {
            com.aspose.slides.internal.b7.n2z var36 = com.aspose.slides.internal.b7.n2z.n5(var34.n5());
            if (var34.n5 != null) {
               Dictionary$Enumerator var37 = var34.l6.iterator();

               try {
                  while (var37.hasNext()) {
                     KeyValuePair var38 = (KeyValuePair)var37.next();
                     double var17 = var34.n5[((Integer)var38.getValue()).intValue() - 1].n5();
                     var36.l6().n5((String)var38.getKey(), var17);
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var37, IDisposable.class)) {
                     var37.dispose();
                  }
               }
            }

            var1.n5().n5(var36);
         }
      }
   }

   private static void n5(ILineFormatEffectiveData var0, com.aspose.slides.internal.b7.g6 var1) {
      var1.k5(var0.getJoinStyle());
      if (var0.getDashStyle() != -1) {
         if (var0.getDashStyle() == 11) {
            var1.n5(new com.aspose.slides.internal.b7.t3());
         } else {
            var1.n5(new com.aspose.slides.internal.b7.p0(var0.getDashStyle()));
         }
      }

      var1.n5(var0.getMiterLimit() * 12700.0F);
      var1.l6(var0.getWidth() * 12700.0);
      var1.n5(var0.getAlignment());
      var1.l6(var0.getCapStyle());
      var1.u3(var0.getStyle());
      var1.k5().n5(var0.getBeginArrowheadStyle());
      var1.k5().l6(var0.getBeginArrowheadLength());
      var1.k5().k5(var0.getBeginArrowheadWidth());
      var1.u3().n5(var0.getEndArrowheadStyle());
      var1.u3().l6(var0.getEndArrowheadLength());
      var1.u3().k5(var0.getEndArrowheadWidth());
   }

   private static void n5(com.aspose.slides.internal.x4g.s7 var0, com.aspose.slides.internal.b7.c2 var1) {
      com.aspose.slides.internal.o9b.w1[] var2 = var0.a6();
      byte[] var3 = var0.u9();
      int var4 = var0.h0();

      for (int var5 = 0; var5 < var4; var5++) {
         byte var6 = var3[var5];
         if (var6 == 0) {
            com.aspose.slides.internal.b7.k0 var7 = n5(var2[var5].u3()).u3();
            var1.a6(var7.n5(), var7.l6());
         }

         if ((var6 & 255 & 3) == 3) {
            com.aspose.slides.internal.b7.k0 var12 = n5(var2[var5].u3()).u3();
            com.aspose.slides.internal.b7.k0 var8 = new com.aspose.slides.internal.b7.k0(var12.n5(), var12.l6());
            n5(var2[++var5].u3()).n5(var12);
            com.aspose.slides.internal.b7.k0 var9 = new com.aspose.slides.internal.b7.k0(var12.n5(), var12.l6());
            n5(var2[++var5].u3()).n5(var12);
            var6 = var3[var5];
            com.aspose.slides.internal.b7.k0 var10 = new com.aspose.slides.internal.b7.k0(var12.n5(), var12.l6());
            var1.n5(var8.u3(), var9.u3(), var10.u3());
         } else if ((var6 & 255 & 1) == 1) {
            com.aspose.slides.internal.b7.k0 var13 = n5(var2[var5].u3()).u3();
            var1.u9(var13.n5(), var13.l6());
         }

         if ((var6 & 255 & 128) == 128) {
            var1.a6();
         }
      }
   }

   private static com.aspose.slides.internal.b7.f1 n5(GeometryShape var0, com.aspose.slides.internal.b7.z6e var1) {
      if (var0.getShapeType() != 0 && var0.getShapeType() != -1) {
         com.aspose.slides.internal.b7.x2 var16 = com.aspose.slides.internal.b7.x2.n5(var0.getShapeType(), var1);
         AdjustValueCollection var17 = (AdjustValueCollection)var0.getAdjustments();

         for (int var18 = 0; var18 < var17.size(); var18++) {
            y2 var19 = var17.n5(var18);
            var16.l6().n5(var19.k5(), var19.n5());
         }

         return var16;
      } else {
         double var2 = var1.n5().n5();
         double var4 = var1.n5().l6();
         double var6 = var1.l6().n5();
         double var8 = var1.l6().l6();
         com.aspose.slides.internal.b7.c2 var10 = new com.aspose.slides.internal.b7.c2(var1);
         ShapeElement[] var11 = var0.e2().n5(var0, 0.0F, 0.0F, (float)var6 / 12700.0F, (float)var8 / 12700.0F);

         for (ShapeElement var15 : var11) {
            if (var15.k5() == 0) {
               var10.n5(var1.l6().n5(), var1.l6().l6(), n5(var15.getFillSource()), false, true);
               n5(var15.l6(), var10);
            }
         }

         return var10;
      }
   }

   private static com.aspose.slides.internal.b7.n9 n5(ILineFillFormatEffectiveData var0) {
      return n5(
         var0.getFillType(),
         (var0.getFillType() == 1 ? ((z1a)var0).u3() : com.aspose.slides.internal.o9b.c8.u3).o8(),
         var0.getFillType() == 2 ? var0.getGradientFormat() : null,
         var0.getRotateWithShape()
      );
   }

   private static com.aspose.slides.internal.b7.n9 n5(IFillFormatEffectiveData var0) {
      return n5(
         var0.getFillType(),
         (var0.getFillType() == 1 ? ((f6a)var0).h0() : com.aspose.slides.internal.o9b.c8.u3).o8(),
         var0.getFillType() == 2 ? var0.getGradientFormat() : null,
         var0.getRotateWithShape()
      );
   }

   private static com.aspose.slides.internal.b7.n9 n5(byte var0, com.aspose.slides.internal.o9b.c8 var1, IGradientFormatEffectiveData var2, boolean var3) {
      com.aspose.slides.internal.b7.n9 var4 = null;
      switch (var0) {
         case -1:
         case 0:
            var4 = new com.aspose.slides.internal.b7.x6();
            break;
         case 1:
            var4 = new com.aspose.slides.internal.b7.d0(n5(var1.o8()));
            break;
         case 2:
            var4 = n5(var2, var3);
            break;
         case 3:
         case 4:
            var4 = new com.aspose.slides.internal.b7.d0(com.aspose.slides.internal.b7.p6.n5(0, 0, 0));
      }

      return var4;
   }

   private static com.aspose.slides.internal.b7.p6 n5(com.aspose.slides.internal.o9b.c8 var0) {
      float var1 = 255.0F;
      return new com.aspose.slides.internal.b7.p6(
         (var0.x8() & 0xFF) / 255.0F, (var0.n3() & 0xFF) / 255.0F, (var0.y4() & 0xFF) / 255.0F, (var0.s7() & 0xFF) / 255.0F
      );
   }

   private static com.aspose.slides.internal.b7.k2 n5(IGradientFormatEffectiveData var0, boolean var1) {
      com.aspose.slides.internal.b7.k2 var6;
      if (var0.getGradientShape() == 0) {
         com.aspose.slides.internal.b7.b7 var2 = new com.aspose.slides.internal.b7.b7(var0.getLinearGradientAngle() * 60000.0F, var0.getLinearGradientScaled());
         IGenericEnumerator var3 = var0.getGradientStops().iterator();

         try {
            while (var3.hasNext()) {
               IGradientStopEffectiveData var4 = (IGradientStopEffectiveData)var3.next();
               var2.l6().n5(new com.aspose.slides.internal.b7.o8(n5(((GradientStopEffectiveData)var4).n5().o8()), var4.getPosition() * 100.0F));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         var6 = var2;
      } else {
         com.aspose.slides.internal.b7.q4 var14 = new com.aspose.slides.internal.b7.q4();
         var14.l6(var0.getGradientShape());
         IGenericEnumerator var15 = var0.getGradientStops().iterator();

         try {
            while (var15.hasNext()) {
               IGradientStopEffectiveData var16 = (IGradientStopEffectiveData)var15.next();
               var14.l6().n5(new com.aspose.slides.internal.b7.o8(n5(((GradientStopEffectiveData)var16).n5().o8()), var16.getPosition() * 100.0F));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var15, IDisposable.class)) {
               var15.dispose();
            }
         }

         var6 = var14;
      }

      var6.n5(var0.getTileFlip());
      var6.n5(var1);
      return var6;
   }

   private static com.aspose.slides.internal.b7.k0 n5(com.aspose.slides.internal.o9b.w1 var0) {
      return new com.aspose.slides.internal.b7.k0(var0.l6() * 12700.0F, var0.k5() * 12700.0F);
   }

   private static com.aspose.slides.internal.b7.z6e n5(ShapeFrame var0) {
      float var1 = var0.getX();
      float var2 = var0.getY();
      float var3 = var0.getWidth();
      float var4 = var0.getHeight();
      return !com.aspose.slides.ms.System.n1.k5(var1)
            && !com.aspose.slides.ms.System.n1.k5(var2)
            && !com.aspose.slides.ms.System.n1.k5(var3)
            && !com.aspose.slides.ms.System.n1.k5(var4)
         ? new com.aspose.slides.internal.b7.z6e(
            new com.aspose.slides.internal.b7.w9(var1 * 12700.0F, var2 * 12700.0F),
            new com.aspose.slides.internal.b7.j6(var3 * 12700.0F, var4 * 12700.0F),
            var0.getRotation() * 60000.0F,
            var0.getFlipH() == 1,
            var0.getFlipV() == 1
         )
         : new com.aspose.slides.internal.b7.z6e();
   }

   private static int n5(byte var0) {
      switch (var0) {
         case 0:
            return 5;
         case 1:
         default:
            return 0;
         case 2:
            return 3;
         case 3:
            return 4;
         case 4:
            return 1;
         case 5:
            return 2;
      }
   }
}
