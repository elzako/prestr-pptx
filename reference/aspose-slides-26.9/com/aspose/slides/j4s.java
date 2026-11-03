package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.ms.System.IDisposable;

class j4s {
   public static void n5(ISlide var0, com.aspose.slides.internal.g4.s7 var1, com.aspose.slides.internal.e7.c8 var2, Dictionary<String, c4y> var3) {
      float var4 = var1.k5().n3() - var1.k5().k5() - 3.6F;
      float var5 = var1.k5().s7() + 28.8F;
      float var6 = var1.k5().k5() + 3.6F + 3.6F;
      if (!(var5 < 0.0F) && !(var6 < 0.0F)) {
         IAutoShape var7 = var0.getShapes().addAutoShape(5, var1.k5().x8() - 3.96F, var4, var5, var6);
         if (var1.u3() > 0.0F) {
            IShapeFrame var8 = var7.getRawFrame();
            com.aspose.slides.internal.o9b.w1 var9 = new com.aspose.slides.internal.o9b.w1(var8.getCenterX(), var8.getCenterY());
            com.aspose.slides.internal.o9b.w1 var10 = var1.k5().u9().u3();
            com.aspose.slides.internal.o9b.w1 var11 = n5(var9.u3(), var10.u3(), var1.u3()).u3();
            float var12 = var11.l6() - var8.getWidth() / 2.0F;
            float var13 = var11.k5() - var8.getHeight() / 2.0F;
            var7.setRawFrame(new ShapeFrame(var12, var13, var8.getWidth(), var8.getHeight(), (byte)0, (byte)0, var1.u3()));
         }

         var7.getFillFormat().setFillType((byte)0);
         var7.getLineFormat().getFillFormat().setFillType((byte)0);
         var7.getLineFormat().setWidth(0.0);
         var7.getTextFrame().getTextFrameFormat().setMarginBottom(3.6F);
         var7.getTextFrame().getTextFrameFormat().setMarginTop(3.6F);
         var7.getTextFrame().getTextFrameFormat().setMarginRight(3.6F);
         var7.getTextFrame().getTextFrameFormat().setMarginLeft(3.6F);
         Paragraph var22 = new Paragraph();
         var22.getPortions().clear();
         var22.getParagraphFormat().setMarginLeft(0.0F);
         var22.getParagraphFormat().setMarginRight(0.0F);

         for (com.aspose.slides.internal.g4.y4 var26 : var1.n5()) {
            IPortion var27 = n5(var26);
            int var14 = var26.s7() ? 8 : (var26.t2() ? 4 : (var26.c8() ? 1 : (var26.h0() ? 2 : 0)));
            String var15 = var26.u3();
            if (!com.aspose.slides.ms.System.d1.n5(var15) && var3.containsKey(var15)) {
               c4y var29 = (c4y)var3.get_Item(var15);
               var27.getPortionFormat().setEastAsianFont(var29.n5());
               var27.getPortionFormat().setLatinFont(var29.n5());
               var27.getPortionFormat().setSymbolFont(var29.n5());
               IGenericEnumerator var30 = var29.c8().iterator();

               try {
                  while (var30.hasNext()) {
                     KeyValuePair var31 = (KeyValuePair)var30.next();
                     if (com.aspose.slides.ms.System.d1.t2(
                        var15, com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.o9b.e2.class, ((Integer)var31.getKey()).intValue())
                     )) {
                        if ((Integer)var31.getKey() == 1) {
                           var27.getPortionFormat().setFontBold((byte)1);
                        }

                        if ((Integer)var31.getKey() == 2) {
                           var27.getPortionFormat().setFontItalic((byte)1);
                        }

                        if ((Integer)var31.getKey() == 3) {
                           var27.getPortionFormat().setFontItalic((byte)1);
                           var27.getPortionFormat().setFontBold((byte)1);
                        }

                        n5(var0, var26.n5(), var27, var29.getFontName(), (Integer)var31.getKey());
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var30, IDisposable.class)) {
                     var30.dispose();
                  }
               }
            } else if (!com.aspose.slides.ms.System.d1.n5(var26.u9())) {
               String var16 = null;
               String[] var17 = new String[]{var16};
               String var18 = com.aspose.slides.internal.c8e.n5.n5(var26.u9(), var17);
               var16 = var17[0];
               com.aspose.slides.internal.e1x.i1 var19 = com.aspose.slides.internal.e1x.x8.u3().n5(var18, var14);
               if (var19 != null) {
                  if (!n5(var19, var26.n5())) {
                     var27.getPortionFormat().setLatinFont(n5((Presentation)var0.getPresentation(), var27.getPortionFormat().getLatinFont()));
                  } else {
                     var27.getPortionFormat().setLatinFont(new FontData(var18));
                  }
               }
            }

            var22.getPortions().add(var27);
         }

         var7.getTextFrame().getParagraphs().clear();
         var7.getTextFrame().getParagraphs().add(var22);
      }
   }

   public static boolean n5(double var0) {
      return var0 == 90.0 || var0 == 270.0;
   }

   static com.aspose.slides.internal.o9b.w1 n5(com.aspose.slides.internal.o9b.w1 var0, com.aspose.slides.internal.o9b.w1 var1, float var2) {
      double var3 = var2 * Math.PI / 180.0;
      float var5 = (float)com.aspose.slides.ms.System.q1.c8(var3);
      float var6 = (float)com.aspose.slides.ms.System.q1.h0(var3);
      float var7 = var0.l6() - var1.l6();
      float var8 = var0.k5() - var1.k5();
      return new com.aspose.slides.internal.o9b.w1(var1.l6() + var7 * var5 - var8 * var6, var1.k5() + var7 * var6 + var8 * var5);
   }

   private static boolean n5(com.aspose.slides.internal.e1x.i1 var0, String var1) {
      for (int var2 = 0; var2 < var1.length(); var2++) {
         char var3 = var1.charAt(var2);
         com.aspose.slides.internal.e1x.u6 var4 = var0.h0().l6(var3);
         if (var4.equals(var0.h0().l6())) {
            return false;
         }
      }

      return true;
   }

   private static IFontData n5(Presentation var0, IFontData var1) {
      IFontData var2 = null;
      int var3 = v6v.n5(var1.getFontName());
      LoadOptions var4 = var0.a6();
      String var5 = null;
      if (var4 != null) {
         switch (var3) {
            case 0:
               var5 = var4.getDefaultRegularFont();
               break;
            case 1:
               var5 = var4.getDefaultAsianFont();
               break;
            case 2:
               var5 = var4.getDefaultRegularFont();
         }
      }

      if (com.aspose.slides.ms.System.d1.n5(var5)) {
         var5 = "Calibri";
      }

      FontData var6 = new FontData(var5);
      FontsManager var7 = com.aspose.slides.internal.v6g.k5.n5(var0.getFontsManager(), FontsManager.class);
      if (var7 != null) {
         e4z var8 = var7.n5(var6);
         if (var8.u3()) {
            var2 = var6;
         }
      }

      if (var2 == null) {
         var2 = var1;
      }

      return var2;
   }

   private static IPortion n5(com.aspose.slides.internal.g4.y4 var0) {
      Portion var1 = new Portion(var0.n5());
      var1.getPortionFormat().setLatinFont(new FontData(var0.u9()));
      var1.getPortionFormat().setFontHeight(var0.x8());
      var1.getPortionFormat().setStrikethroughType((byte)(var0.s7() ? 1 : 0));
      var1.getPortionFormat().setFontUnderline((byte)(var0.t2() ? 2 : 0));
      var1.getPortionFormat().setFontBold((byte)(var0.c8() ? 1 : 0));
      var1.getPortionFormat().setFontItalic((byte)(var0.h0() ? 1 : 0));
      var1.getPortionFormat().getFillFormat().setFillType((byte)1);
      ((ColorFormat)var1.getPortionFormat().getFillFormat().getSolidFillColor()).n5(var0.k5().o8());
      if (!com.aspose.slides.ms.System.d1.n5(var0.e2())) {
         var1.getPortionFormat().setLanguageId(var0.e2());
      }

      return var1;
   }

   public static void n5(ISlide var0, IGenericList<m2g> var1) {
      IGenericEnumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            m2g var3 = (m2g)var2.next();
            double[] var4 = n5(var3);
            double[] var5 = l6(var3);
            ITable var6 = n5(var0, var3.n5(), var3.l6(), var5, var4);
            Paragraph var7 = new Paragraph();
            var7.getParagraphFormat().getBullet().setType((byte)1);
            var7.getParagraphFormat().getBullet().setChar(a5d.n5);
            float var8 = n5(var7, var6, 0, 0);
            Paragraph var9 = null;
            com.aspose.slides.internal.l7h.a5 var10 = new com.aspose.slides.internal.l7h.a5();
            int var11 = 0;

            for (int var12 = 0; var12 <= var6.getRows().size(); var12++) {
               if (var10.l6() > 0 && var9 != null) {
                  var9.setText(var10.toString());
                  var6.getRows().get_Item(var12 - 1).get_Item(var11).getTextFrame().getParagraphs().add(var9);
                  int var13 = var12 < var6.getRows().size() ? var12 : var12 - 1;
                  var9.getParagraphFormat().getBullet().applyDefaultParagraphIndentsShifts();
                  n5(var9, var3, var13, var11);
                  var10.n5(0);
               }

               if (var12 == var6.getRows().size()) {
                  break;
               }

               var9 = null;
               var10.n5(0);

               for (int var29 = 0; var29 < var6.getRows().get_Item(var12).size(); var29++) {
                  n5(var6, var12, var29, var3);
                  boolean var14 = false;
                  float var15 = 0.0F;
                  IGenericEnumerator var16 = var3.a6().iterator();

                  try {
                     while (var16.hasNext()) {
                        KeyValuePair var17 = (KeyValuePair)var16.next();
                        int[] var18 = new int[]{var11};
                        Paragraph[] var19 = new Paragraph[]{var9};
                        float[] var20 = new float[]{var15};
                        var14 = n5((s6y)var17.getKey(), var12, var29, var3, var14, var10, var6, var8, var18, var19, var20);
                        var11 = var18[0];
                        var9 = var19[0];
                        var15 = var20[0];
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var16, IDisposable.class)) {
                        var16.dispose();
                     }
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private static boolean n5(
      s6y var0,
      int var1,
      int var2,
      m2g var3,
      boolean var4,
      com.aspose.slides.internal.l7h.a5 var5,
      ITable var6,
      float var7,
      int[] var8,
      Paragraph[] var9,
      float[] var10
   ) {
      if (var0.n5() == var1 + 1 && var0.k5() == var2 + 1) {
         if (var3.a6().get_Item(var0).n5()[0].n5().charAt(0) == a5d.n5) {
            var4 = true;
            var8[0] = var2;
            if (var5.l6() > 0 && var9[0] != null) {
               n5(var9[0], var5, var6, var1, var2, var3);
            }

            var9[0] = new Paragraph();
            var9[0].getParagraphFormat().getBullet().setType((byte)1);
            var9[0].getParagraphFormat().getBullet().setChar(a5d.n5);
            var10[0] = var3.a6().get_Item(var0).n5()[0].n3().a6() + var7;
         } else if (var4) {
            if (com.aspose.slides.ms.System.q1.n5(var3.a6().get_Item(var0).n5()[0].n3().a6() - var10[0]) < 10.0F) {
               var5.n5(var3.a6().get_Item(var0).n5()[0].n5());
            } else {
               if (var5.l6() > 0) {
                  n5(var9[0], var5, var6, var1, var2, var3);
               }

               var9[0] = n5(var3, var0, var6, var1, var2);
               n5(var9[0], var3, var1, var2);
               var4 = false;
            }
         } else {
            var9[0] = n5(var3, var0, var6, var1, var2);
            n5(var9[0], var3, var1, var2);
         }
      }

      return var4;
   }

   private static void n5(ITable var0, int var1, int var2, m2g var3) {
      var0.getRows().get_Item(var1).get_Item(var2).getCellFormat().getBorderTop().getFillFormat().setFillType((byte)1);
      ((ColorFormat)var0.getRows().get_Item(var1).get_Item(var2).getCellFormat().getBorderTop().getFillFormat().getSolidFillColor())
         .n5(var3.k5().get_Item(var1).l6().o8());
      var0.getRows().get_Item(var1).get_Item(var2).getCellFormat().getBorderTop().setWidth(var3.k5().get_Item(var1).h0());
      var0.getRows().get_Item(var1).get_Item(var2).getCellFormat().getFillFormat().setFillType((byte)1);
      ((ColorFormat)var0.getRows().get_Item(var1).get_Item(var2).getCellFormat().getFillFormat().getSolidFillColor()).n5(var3.k5().get_Item(var1).k5().o8());
      var0.getRows().get_Item(var1).get_Item(var2).getCellFormat().getBorderBottom().getFillFormat().setFillType((byte)1);
      ((ColorFormat)var0.getRows().get_Item(var1).get_Item(var2).getCellFormat().getBorderBottom().getFillFormat().getSolidFillColor())
         .n5(var3.k5().get_Item(var1 + 1).l6().o8());
      var0.getRows().get_Item(var1).get_Item(var2).getCellFormat().getBorderBottom().setWidth(var3.k5().get_Item(var1 + 1).h0());
      var0.getRows().get_Item(var1).get_Item(var2).getCellFormat().getBorderLeft().getFillFormat().setFillType((byte)1);
      ((ColorFormat)var0.getRows().get_Item(var1).get_Item(var2).getCellFormat().getBorderLeft().getFillFormat().getSolidFillColor())
         .n5(var3.u3().get_Item(var2).l6().o8());
      var0.getRows().get_Item(var1).get_Item(var2).getCellFormat().getBorderLeft().setWidth(var3.u3().get_Item(var2).h0());
      var0.getRows().get_Item(var1).get_Item(var2).getCellFormat().getBorderRight().getFillFormat().setFillType((byte)1);
      ((ColorFormat)var0.getRows().get_Item(var1).get_Item(var2).getCellFormat().getBorderRight().getFillFormat().getSolidFillColor())
         .n5(var3.u3().get_Item(var2 + 1).l6().o8());
      var0.getRows().get_Item(var1).get_Item(var2).getCellFormat().getBorderRight().setWidth(var3.u3().get_Item(var2 + 1).h0());
   }

   private static double[] n5(m2g var0) {
      double[] var1 = new double[var0.k5().size() - 1];
      float var2 = var0.k5().get_Item(0).n5().a6()[1].k5();

      for (int var3 = 0; var3 < var1.length; var3++) {
         var1[var3] = var0.k5().get_Item(var3 + 1).n5().a6()[1].k5() - var2;
         var2 = var0.k5().get_Item(var3 + 1).n5().a6()[1].k5();
      }

      return var1;
   }

   private static double[] l6(m2g var0) {
      double[] var1 = new double[var0.u3().size() - 1];
      float var2 = var0.u3().get_Item(0).n5().a6()[1].l6();

      for (int var3 = 0; var3 < var1.length; var3++) {
         var1[var3] = var0.u3().get_Item(var3 + 1).n5().a6()[1].l6() - var2;
         var2 = var0.u3().get_Item(var3 + 1).n5().a6()[1].l6();
      }

      return var1;
   }

   private static ITable n5(ISlide var0, float var1, float var2, double[] var3, double[] var4) {
      return var0.getShapes().addTable(var1, var2, var3, var4);
   }

   private static Paragraph n5(m2g var0, s6y var1, ITable var2, int var3, int var4) {
      Paragraph var5 = new Paragraph();
      var5.setText(var0.a6().get_Item(var1).n5()[0].n5());
      var2.getRows().get_Item(var3).get_Item(var4).getTextFrame().getParagraphs().add(var5);
      return var5;
   }

   private static void n5(Paragraph var0, com.aspose.slides.internal.l7h.a5 var1, ITable var2, int var3, int var4, m2g var5) {
      var0.setText(var1.toString());
      var2.getRows().get_Item(var3).get_Item(var4).getTextFrame().getParagraphs().add(var0);
      var0.getParagraphFormat().getBullet().applyDefaultParagraphIndentsShifts();
      n5(var0, var5, var3, var4);
      var1.n5(0);
   }

   private static float n5(Paragraph var0, ITable var1, int var2, int var3) {
      var1.getRows().get_Item(var2).get_Item(var3).getTextFrame().getParagraphs().add(var0);
      var0.getParagraphFormat().getBullet().applyDefaultParagraphIndentsShifts();
      float var4 = var0.getParagraphFormat().getMarginLeft();
      var1.getRows().get_Item(var2).get_Item(var3).getTextFrame().getParagraphs().remove(var0);
      return var4;
   }

   private static void n5(Paragraph var0, m2g var1, int var2, int var3) {
      s6y var4 = new s6y();
      var4.n5(var2 + 1);
      var4.k5(var3 + 1);
      var4.l6(0);
      var0.getPortions().get_Item(0).getPortionFormat().setFontHeight(var1.a6().get_Item(var4).n5()[0].x8());
      var0.getPortions().get_Item(0).getPortionFormat().getFillFormat().setFillType((byte)1);
      s6y var5 = new s6y();
      var5.n5(var2 + 1);
      var5.k5(var3 + 1);
      var5.l6(0);
      ((ColorFormat)var0.getPortions().get_Item(0).getPortionFormat().getFillFormat().getSolidFillColor()).n5(var1.a6().get_Item(var5).n5()[0].k5().o8());
      s6y var6 = new s6y();
      var6.n5(var2 + 1);
      var6.k5(var3 + 1);
      var6.l6(0);
      var0.getPortions().get_Item(0).getPortionFormat().setFontBold((byte)(var1.a6().get_Item(var6).n5()[0].c8() ? 1 : 0));
      s6y var7 = new s6y();
      var7.n5(var2 + 1);
      var7.k5(var3 + 1);
      var7.l6(0);
      var0.getPortions().get_Item(0).getPortionFormat().setFontItalic((byte)(var1.a6().get_Item(var7).n5()[0].h0() ? 1 : 0));
   }

   private static void n5(ISlide var0, String var1, IPortion var2, String var3, int var4) {
      e6s var5 = ((Presentation)var0.getPresentation()).t9().n5();
      com.aspose.slides.internal.e1x.i1 var6 = var5.n5(var3, var4);
      if (var6 != null && !n5(var6, var1)) {
         var2.getPortionFormat().setEastAsianFont(n5((Presentation)var0.getPresentation(), var2.getPortionFormat().getEastAsianFont()));
         var2.getPortionFormat().setLatinFont(n5((Presentation)var0.getPresentation(), var2.getPortionFormat().getLatinFont()));
         var2.getPortionFormat().setSymbolFont(n5((Presentation)var0.getPresentation(), var2.getPortionFormat().getSymbolFont()));
      }
   }
}
