package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class h3o extends d5 {
   @Override
   public boolean u3() {
      return true;
   }

   @Override
   public boolean l6() {
      return true;
   }

   @Override
   public boolean n5(int var1) {
      return var1 == 22 || var1 == 27 || var1 == 33 || var1 == 5 || var1 == 19 || var1 == 25;
   }

   @Override
   protected void L_() {
      List$Enumerator var1 = this.h0().iterator();

      try {
         while (var1.hasNext()) {
            k6a var2 = (k6a)var1.next();
            o5t var3 = this.c8();
            var2.c8().l6(var3.k5());
            SmartArtShape var4 = var2.c8().l6();
            List var5 = var2.u9();
            if (var4 != null && var5.size() > 0) {
               TextFrame var6 = new TextFrame(var4);
               n5(var6, var5, var3);
               var4.n5(var6);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   private static void n5(TextFrame var0, List<l6s> var1, o5t var2) {
      int var3 = n5(var1);
      TextFrameFormat var4 = var0.n5;
      boolean var5 = false;
      List$Enumerator var6 = var1.iterator();

      try {
         while (var6.hasNext()) {
            l6s var7 = (l6s)var6.next();
            boolean var8 = var2.s7() <= var7.z1() - var3 + 1;
            if (var8) {
               var5 = true;
            }

            IGenericEnumerator var9 = var7.y4().n5().getParagraphs().iterator();

            try {
               while (var9.hasNext()) {
                  Paragraph var10 = (Paragraph)var9.next();
                  Paragraph var11 = new Paragraph(var10);
                  var0.getParagraphs().add(var11);
                  IParagraphFormat var12 = var11.getParagraphFormat();
                  if (com.aspose.slides.ms.System.n1.k5(var12.getSpaceAfter())) {
                     var12.setSpaceAfter((float)(!var8 ? var2.a6() : var2.u3()));
                  }

                  if (com.aspose.slides.ms.System.n1.k5(var12.getSpaceBefore())) {
                     var12.setSpaceBefore(0.0F);
                  }

                  if (com.aspose.slides.ms.System.n1.k5(var12.getSpaceWithin())) {
                     var12.setSpaceWithin((float)(!var8 ? var2.h0() : var2.u9()));
                  } else if (var12.getSpaceWithin() > 0.0F && var8) {
                     String var13 = var11.getPortions().get_Item(0).getPortionFormat().getLanguageId();
                     int var14 = 0;
                     Fonts$n5 var15 = null;
                     Fonts$n5[] var16 = new Fonts$n5[]{var15};
                     boolean var17 = !com.aspose.slides.ms.System.d1.n5(var13) && Fonts.l6.tryGetValue(var13, var16);
                     var15 = var16[0];
                     if (var17) {
                        var14 = var15.k5;
                     }

                     boolean var18 = var11.getPortions().getCount() > 0 && var14 == 1;
                     if (var18) {
                        var12.setSpaceWithin(var12.getSpaceWithin() * 1.3333334F);
                     }
                  }

                  if (var8) {
                     var12.getBullet().setType((byte)1);
                     var12.getBullet().setChar('•');
                  }

                  if (var12.getAlignment() == -1) {
                     var12.setAlignment(l6(var1.size() == 1 && !var8 ? var2.c8() : var2.t2()));
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                  var9.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      var4.u3((byte)0);
      if (var5) {
         var4.setAnchoringType(k5(var2.n3()));
         var4.setCenterText((byte)(var2.t9() ? 1 : 0));
      } else {
         var4.setAnchoringType(k5(var2.x8()));
         var4.setCenterText((byte)(var2.e2() ? 1 : 0));
      }

      ITextFrameFormat var27 = ((l6s)var1.get_Item(0)).y4().n5().getTextFrameFormat();
      if (var27.getAnchoringType() != -1) {
         var4.setAnchoringType(var27.getAnchoringType());
      }

      if (var27.getCenterText() != -1) {
         var4.setCenterText(var27.getCenterText());
      }

      var4.setColumnSpacing(0.1F);
      var4.setWrapText((byte)1);
      var4.setAutofitType((byte)0);
      if (var27.getTextVerticalType() != -1) {
         var4.setTextVerticalType(var27.getTextVerticalType());
      } else {
         var4.setTextVerticalType((byte)(var2.y4() ? 1 : 0));
      }
   }

   @Override
   public void l6(k6a var1) {
      k7t var2 = var1.c8();
      if (var2.m1()) {
         int var3 = var2.l6().getShapeType();
         boolean var4 = var3 != 5 && var3 != 26 && var3 != 35;
         boolean var5 = n5(var2.r4() * 1.1 / var2.m3()) || n5(var2.c4() * 1.1 / var2.z8());
         if (var4 && var5 && !var2.y2() && !var2.y1()) {
            double var6 = var1.h0(22);
            double var8 = var1.h0(27);
            h3o$l6 var10 = this.l6(var1, var6, var8).l6();
            d2k var11 = var2.l6().k5().u3.t2().u3();

            while (!var10.n5() && n5(var1, 1.0, true, true, true)) {
               this.l6(var1, var6, var8).n5(var10);
               d2k var12 = var2.l6().k5().u3.t2().u3();
               if (!(var12.n5 > var11.n5) && !(var12.l6 > var11.l6)) {
                  break;
               }

               var12.n5(var11);
               if (var10.n5()) {
                  n5(var1, -1.0, true, true, false);
                  this.l6(var1, var6, var8);
               }
            }
         }

         if (!com.aspose.slides.ms.System.d2.k5(var1.h0(15)) && !com.aspose.slides.ms.System.d2.k5(var1.h0(22))) {
            h3o$n5 var13 = this.n5(var1, false).u3();
            if (var13.k5()) {
               SmartArtShape var14 = var2.l6();
               ITextFrameFormat var15 = var14.k5().getTextFrameFormat();
               e4c var16 = var14.k5().u3.t2().l6().u9();
               double var17 = var16.l6;
               if (var17 != 0.0 && var16.n5 != 0.0) {
                  var17 += var15.getMarginTop() + var15.getMarginBottom();
                  double var19 = com.aspose.slides.ms.System.q1.k5(var1.t2().a6(15), var1.u3(15));
                  var17 = com.aspose.slides.ms.System.q1.k5(var17, var19);
                  double var21 = var2.z8();
                  double var23 = var21 / var2.x8();
                  var17 = var17 / var23 / var1.j5().l6;
                  if (var17 < var1.h0(15)) {
                     boolean var25 = true;
                     List$Enumerator var26 = this.h0().iterator();

                     try {
                        while (var26.hasNext()) {
                           k6a var27 = (k6a)var26.next();
                           if (var17 < var2.n3()) {
                              var25 = false;
                              break;
                           }
                        }
                     } finally {
                        if (com.aspose.slides.internal.v6g.k5.n5(var26, IDisposable.class)) {
                           var26.dispose();
                        }
                     }

                     if (var25) {
                        List$Enumerator var41 = this.h0().iterator();

                        try {
                           while (var41.hasNext()) {
                              k6a var28 = (k6a)var41.next();
                              double var29 = (var28.c8().x8() - var17 * var28.j5().l6) / 2.0;
                              var28.c8().u9(var17);
                              var28.c8().n5(0.0, var29);
                           }
                        } finally {
                           if (com.aspose.slides.internal.v6g.k5.n5(var41, IDisposable.class)) {
                              var41.dispose();
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @Override
   public boolean n5(k6a var1) {
      var1.c8().k5(var1.a6(61));
      if (var1.l6(61)) {
         var1.c8().k5(var1.c8().c8() + var1.a6(63));
      }

      var1.c8().u9(var1.a6(15));
      if (var1.l6(15)) {
         var1.c8().u9(var1.c8().n3() + var1.a6(17));
      }

      if (var1.n5() != null && var1.n5().n5() != null) {
         r1l var2 = com.aspose.slides.internal.v6g.k5.n5(var1.n5().n5().s7(), r1l.class);
         if (var2 != null && !var2.c8()) {
            return true;
         }
      }

      if (t2(var1)) {
         var1.c8().n5(true);
         if (com.aspose.slides.ms.System.d2.k5(var1.c8().w1())) {
            var1.c8().s7(var1.c8().c8());
         }

         boolean var30 = var1.k5(61);
         if (!var30) {
            var1.c8().k5(Double.MAX_VALUE);
            this.n5(var1, false);
            s7(var1);
         }

         double var3 = var1.h0(22);
         double var5 = var1.h0(27);
         h3o$l6 var7 = this.l6(var1, var3, var5).l6();

         while (var7.n5() && n5(var1, -1.0, var7.n5, var7.l6, false)) {
            this.l6(var1, var3, var5).n5(var7);
         }

         if (!var30) {
            s7(var1);
         }
      } else {
         double var8 = this.c8(var1);
         if (var1.c8().y1()) {
            if (var8 > var1.c8().n3()) {
               var1.k5(15, var8);
               var1.c8().u9(var1.a6(15));
            }
         } else {
            double var10 = var1.h0(22);
            double var12 = var1.h0(27);
            h3o$l6 var14 = this.l6(var1, var10, var12).l6();
            boolean var15 = var14.n5;
            double var16 = var15 ? x8(var1).n5() : x8(var1).l6();
            double var18 = var15 ? com.aspose.slides.ms.System.q1.u3(var10 / 2.0) : com.aspose.slides.ms.System.q1.u3(var12 / 2.0);

            while (var14.n5()) {
               double var20 = var16 - var18 < 1.0 ? var18 : var18 + (var16 - var18) / 2.0;
               n5(var1, var20, var20, var14.n5, var14.l6, true);
               double var22 = 0.0;
               double var24 = 0.0;
               boolean var26 = false;
               double[] var27 = new double[]{0.0};
               double[] var28 = new double[]{0.0};
               boolean[] var29 = new boolean[]{false};
               this.n5(var1, var10, var12, var27, var28, var29).n5(var14);
               var22 = var27[0];
               var24 = var28[0];
               var26 = var29[0];
               if (!(var22 < 0.9999) && !(var24 < 0.9999) && !var26) {
                  if (var22 > 1.001 || var24 > 1.001) {
                     var18 = var15 ? x8(var1).n5() : x8(var1).l6();
                     var14.n5 = var15;
                     var14.l6 = !var15;
                  }
               } else {
                  var16 = var15 ? x8(var1).n5() : x8(var1).l6();
               }

               if (var16 - var18 <= 1.0) {
                  break;
               }
            }
         }
      }

      return true;
   }

   public final boolean n5(k6a var1, double var2, double var4) {
      return !this.l6(var1, var2, var4).n5();
   }

   private double c8(k6a var1) {
      double var2 = var1.h0(22);
      double var4 = var1.h0(27);
      double var6 = var1.h0(15);
      if (!com.aspose.slides.ms.System.d2.k5(var6)
         && com.aspose.slides.ms.System.d2.k5(var2)
         && com.aspose.slides.ms.System.d2.k5(var4)
         && var1.c8().m1()
         && var1.c8().c8() != 0.0
         && var1.c8().n3() != 0.0) {
         this.u3(var1);
         SmartArtShape var8 = var1.c8().l6();
         h3o$n5 var9 = this.n5(var1, false).u3();
         ITextFrameFormat var10 = var8.k5().getTextFrameFormat();
         e4c var11 = var8.k5().u3.t2().l6().u9();
         double var12 = var11.l6;
         if (var12 != 0.0 && var11.n5 != 0.0) {
            var12 += var10.getMarginTop() + var10.getMarginBottom();
            double var14 = var1.c8().z8();
            double var16 = var14 / var1.c8().x8();
            double var18 = var1.u3(15);
            if (!var9.k5()) {
               var12 = com.aspose.slides.ms.System.q1.k5(var12, var18);
               if (var1.j5().l6 < 1.0) {
                  if (com.aspose.slides.ms.System.d2.k5(var1.c8().j5())) {
                     var1.c8().t2(var12);
                  } else {
                     var12 = com.aspose.slides.ms.System.q1.k5(var1.c8().j5(), var18);
                  }
               }
            } else if (var12 > var18) {
               var1.n5(15, var12, true);
            }

            var1.c8().l6(true);
            if (var6 >= var14) {
               return var12 / var16;
            }
         }
      }

      var1.c8().l6(false);
      return 0.0;
   }

   private h3o$l6 l6(k6a var1, double var2, double var4) {
      double var6 = 0.0;
      double var8 = 0.0;
      boolean var10 = false;
      double[] var11 = new double[]{0.0};
      double[] var12 = new double[]{0.0};
      boolean[] var13 = new boolean[]{false};
      h3o$l6 var14 = this.n5(var1, var2, var4, var11, var12, var13).l6();
      var6 = var11[0];
      var8 = var12[0];
      var10 = var13[0];
      return var14;
   }

   private h3o$l6 n5(k6a var1, double var2, double var4, double[] var6, double[] var7, boolean[] var8) {
      var6[0] = var7[0] = 0.0;
      var8[0] = false;
      boolean var9 = this.u3(var1);
      h3o$l6 var10 = new h3o$l6();
      SmartArtShape var11 = var1.c8().l6();
      if (var11 != null && var1.u9().size() > 0 && var1.c8().c8() != 0.0 && var1.c8().n3() != 0.0) {
         h3o$n5 var12 = this.n5(var1, var9).u3();
         if (!var1.c8().m1()) {
            return var10;
         }

         ITextFrameFormat var13 = var11.k5().getTextFrameFormat();
         e4c var14 = var11.k5().u3.t2().l6().u9();
         if (var14.l6 != 0.0 && var14.n5 != 0.0) {
            var8[0] = var11.k5().u3.u3();
            e4c.n5(var14, new e4c(var13.getMarginLeft() + var13.getMarginRight(), var13.getMarginTop() + var13.getMarginBottom())).l6(var14);
            var6[0] = var1.c8().m3() / var14.n5;
            boolean var15 = n5(var6[0]);
            var7[0] = var1.c8().z8() / var14.l6;
            boolean var16 = n5(var7[0]);
            if (!var12.k5() && (var16 || var15 || var8[0])) {
               if (!com.aspose.slides.ms.System.d2.k5(var2) && q3g.l6(var2) < var12.n5()) {
                  var10.n5 = true;
               }

               if (!com.aspose.slides.ms.System.d2.k5(var4) && q3g.l6(var4) < var12.l6()) {
                  var10.l6 = true;
               }
            }
         }
      }

      return var10;
   }

   private h3o$n5 n5(k6a var1, boolean var2) {
      h3o$n5 var3 = x8(var1).u3();
      int var4 = n5(var1.u9());
      SmartArtShape var5 = var1.c8().l6();
      if (var5 != null && var1.u9().size() > 0) {
         long var6 = var5.k5().s7().s3();
         IParagraphCollection var8 = var5.k5().getParagraphs();
         int var9 = 0;
         double var10 = Double.NaN;
         boolean var12 = true;
         IGenericEnumerator var13 = var8.iterator();

         try {
            while (var13.hasNext()) {
               IParagraph var14 = (IParagraph)var13.next();
               if (var14.getEndParagraphPortionFormat() == null) {
                  var12 = false;
                  break;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
               var13.dispose();
            }
         }

         List$Enumerator var43 = var1.u9().iterator();

         try {
            while (var43.hasNext()) {
               l6s var15 = (l6s)var43.next();
               boolean var16 = this.c8().s7() <= var15.z1() - var4 + 1;
               int var17 = this.n5(var1.u9(), var4);

               for (int var18 = 0; var18 < var15.y4().n5().getParagraphs().getCount() && var9 < var8.getCount(); var18++) {
                  IParagraph var19 = var15.y4().n5().getParagraphs().get_Item(var18);
                  IParagraph var20 = var8.get_Item(var9);
                  double var21 = var3.n5();
                  var10 = Double.NaN;

                  for (int var23 = 0; var23 < var20.getPortions().getCount(); var23++) {
                     IPortion var24 = var19.getPortions().get_Item(var23);
                     IPortion var25 = var20.getPortions().get_Item(var23);
                     var21 = var24.getPortionFormat().getFontHeight();
                     if (com.aspose.slides.ms.System.d2.k5(var21)) {
                        var21 = var16 ? var3.l6() : var3.n5();
                     } else {
                        if (var23 == 0) {
                           var10 = var21;
                        }

                        var3.n5(true);
                     }

                     var25.getPortionFormat().setFontHeight((float)var21);
                  }

                  if (var12 && ((Paragraph)var20).getEndParagraphPortionFormat() != null) {
                     ((Paragraph)var20).getEndParagraphPortionFormat().setFontHeight((float)(var16 ? var3.l6() : var3.n5()));
                  }

                  IParagraphFormat var53 = var19.getParagraphFormat();
                  IParagraphFormat var54 = var20.getParagraphFormat();
                  if (com.aspose.slides.ms.System.d2.k5(var53.getDefaultTabSize())) {
                     var54.setDefaultTabSize((float)(var21 / 0.286));
                  } else {
                     var54.setDefaultTabSize(var53.getDefaultTabSize());
                  }

                  if (var16) {
                     if (com.aspose.slides.ms.System.n1.k5(var53.getIndent())) {
                        short var55 = (short)com.aspose.slides.ms.System.q1.n5(0, var15.z1() - var17);
                        double var26 = u3(com.aspose.slides.internal.v6g.k5.u3(var21, 14));
                        var54.setDepth(var55);
                        var54.setMarginLeft((float)((var55 + 1) * var26));
                        var54.setIndent((float)(-var26));
                     } else {
                        var54.setIndent(var53.getIndent());
                     }
                  } else {
                     var54.setDepth((short)0);
                  }

                  var9++;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var43, IDisposable.class)) {
               var43.dispose();
            }
         }

         if (var3.k5() && var1.m1() != null && !com.aspose.slides.ms.System.d2.k5(var10)) {
            for (l3d var48 : var1.m1().k5()) {
               if (var48.c8() == 22) {
                  double var29 = var1.n5(var48);
                  double var52 = q3g.n5(var10) * var29;
                  double var31 = var1.n5(var48.c8()) * var29;
                  if (n5(var52, var31)) {
                     var1.k5(var48.k5(), var52);
                  }
               }
            }
         }

         double var33 = var3.k5() ? var10 : var3.n5();
         ITextFrameFormat var47 = var1.u9().get_Item(0).y4().n5().getTextFrameFormat();
         c0u var49 = TextFrameFormat.n5(var47).l6();
         c0u var50 = new c0u();
         var50.k5 = n5(var1, 33, var33, var49.k5);
         var50.a6 = n5(var1, 5, var33, var49.a6);
         var50.l6 = n5(var1, 19, var33, var49.l6);
         var50.u3 = n5(var1, 25, var33, var49.u3);
         TextFrameFormat var51 = (TextFrameFormat)var5.k5().getTextFrameFormat();
         boolean var35 = var2 || c0u.l6(var50, var51.u3()) || (var6 & 4294967295L) != (var51.s3() & 4294967295L);
         if (!var35) {
            d2k var36 = var5.k5().u3.l6().u3();
            var35 = com.aspose.slides.ms.System.n1.k5(var36.n5) || com.aspose.slides.ms.System.n1.k5(var36.l6);
         }

         if (var35) {
            var51.n5(var50.l6());
            s3z.l6(var5.k5().u3);
         }
      }

      return var3;
   }

   private int n5(List<l6s> var1, int var2) {
      int var3 = Integer.MAX_VALUE;
      List$Enumerator var4 = var1.iterator();

      try {
         while (var4.hasNext()) {
            l6s var5 = (l6s)var4.next();
            boolean var6 = this.c8().s7() <= var5.z1() - var2 + 1;
            if (var6 && var3 > var5.z1()) {
               var3 = var5.z1();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return var3 == Integer.MAX_VALUE ? 0 : var3;
   }

   private static boolean t2(k6a var0) {
      if (var0.c8().m1() && var0.k7() != null) {
         for (j2l var4 : var0.k7().k5()) {
            if (var4.a6() == 61 && var4.k5() == 1) {
               return true;
            }
         }
      }

      return false;
   }

   private static void s7(k6a var0) {
      SmartArtShape var1 = var0.c8().l6();
      ITextFrameFormat var2 = var1.k5().getTextFrameFormat();
      double var3 = com.aspose.slides.ms.System.q1.l6(var0.c8().w1(), var1.k5().u3.k5().n5 * 1.01 + 15.0 + var2.getMarginLeft() + var2.getMarginRight());
      var0.k5(61, var3);
      var0.c8().k5(var3);
   }

   public static void l6(k6a var0, double var1) {
      double var3 = var0.a6(22);
      double var5 = var1 - q3g.n5(1.0);
      n5(var0, q3g.l6(var5 - var3), true, true, true);
   }

   private static boolean n5(k6a var0, double var1, boolean var3, boolean var4, boolean var5) {
      h3o$n5 var6 = x8(var0).u3();
      boolean var7 = false;
      double var8 = 1.0;
      if (var3 && var6.n5() > 1.0 && var6.n5() < 1000.0) {
         double var10 = var6.n5() + com.aspose.slides.ms.System.q1.u3(var1);
         var8 = com.aspose.slides.ms.System.q1.k5(var8, var10 / var6.n5());
         double var12 = q3g.n5(var10);
         var0.n5(22, var12, var5);
         var0.w1();
         var7 |= !n5(var0.a6(22), var12);
      }

      if (var4 && var6.l6() > 1.0 && var6.l6() < 1000.0) {
         double var15 = var6.l6() + com.aspose.slides.ms.System.q1.u3(var1);
         var8 = com.aspose.slides.ms.System.q1.k5(var8, var15 / var6.l6());
         double var16 = q3g.n5(var15);
         var0.n5(27, var16, var5);
         var0.w1();
         var7 |= !n5(var0.a6(27), var16);
      }

      return var7;
   }

   private static boolean n5(k6a var0, double var1, double var3, boolean var5, boolean var6, boolean var7) {
      h3o$n5 var8 = x8(var0).u3();
      boolean var9 = false;
      if (var5 && var8.n5() > 1.0 && var8.n5() < 1000.0) {
         double var10 = q3g.n5(var1);
         var0.n5(22, var10, var7);
         var0.w1();
         var9 |= !n5(var0.a6(22), var10);
      }

      if (var6 && var8.l6() > 1.0 && var8.l6() < 1000.0) {
         double var12 = q3g.n5(var3);
         var0.n5(27, var12, var7);
         var0.w1();
         var9 |= !n5(var0.a6(27), var12);
      }

      return var9;
   }

   private static int l6(int var0) {
      switch (var0) {
         case 1:
            return 0;
         case 2:
            return 1;
         case 3:
            return 2;
         default:
            return -1;
      }
   }

   private static byte k5(int var0) {
      switch (var0) {
         case 1:
            return 0;
         case 2:
            return 1;
         case 3:
            return 2;
         default:
            return -1;
      }
   }

   private static int n5(List<l6s> var0) {
      if (var0.size() == 0) {
         return 0;
      }

      int var1 = Integer.MAX_VALUE;
      List$Enumerator var2 = var0.iterator();

      try {
         while (var2.hasNext()) {
            l6s var3 = (l6s)var2.next();
            if (var1 > var3.z1()) {
               var1 = var3.z1();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   private static h3o$n5 x8(k6a var0) {
      double var1 = n5(22, var0);
      if (var1 == 0.0 && !var0.l6(22)) {
         var1 = 38.0;
         var0.k5(22, q3g.n5(38.0));
      }

      double var3 = var0.l6(27) ? n5(27, var0) : com.aspose.slides.ms.System.q1.u3(var1 * 0.78);
      return new h3o$n5(var1, var3);
   }

   private static double n5(k6a var0, int var1, double var2, double var4) {
      if (!com.aspose.slides.ms.System.d2.k5(var4)) {
         return var4;
      }

      double var6 = var2 * 0.56;
      return var0.l6(var1) ? n5(var1, var0) : var6;
   }

   private static double n5(int var0, k6a var1) {
      return var0 != 22 && var0 != 27 ? com.aspose.slides.ms.System.q1.u3(q3g.l6(var1.a6(var0))) : com.aspose.slides.ms.System.q1.n5((double)(q3g.l6(var1.a6(var0))), 1);
   }

   private static double u3(int var0) {
      double var1 = 4.5;
      double var3 = 4.5;
      int[] var5 = new int[]{11, 15, 19, 27};

      for (int var9 : var5) {
         if (var0 <= var9) {
            break;
         }

         var3 += 4.5;
      }

      return var3;
   }

   private o5t c8() {
      return (o5t)this.n5();
   }
}
