package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class h1f extends o0s {
   static void l6(v5s var0) {
      x8t var1 = (x8t)var0.a6();
      com.aspose.slides.internal.k0r.e4 var2 = var1.k5();
      Table var3 = var1.c8();
      if (var3 == null) {
         var3 = ((ShapeCollection)var1.y4().y4().getShapes()).z3();
         var1.n5(var3);
      }

      n5(var0);
      n5(var1);
      l6(var1);
      u3(var1);
      k5(var1);
      if (var2.a6() != null) {
         com.aspose.slides.internal.k0r.v8 var4 = com.aspose.slides.internal.v6g.k5.n5(var2.a6().l6().n5(897), com.aspose.slides.internal.k0r.v8.class);
         if (var4 != null) {
            com.aspose.slides.internal.l7h.t1 var5 = new com.aspose.slides.internal.l7h.t1();
            char[] var6 = var5.n5(var4.l6());
            if (var6 != null && var6.length > 0) {
               if (var6[var6.length - 1] == 0) {
                  var3.setAlternativeText(com.aspose.slides.ms.System.d1.n5(var6, 0, var6.length - 1));
               } else {
                  var3.setAlternativeText(com.aspose.slides.ms.System.d1.n5(var6));
               }
            }
         }

         var4 = com.aspose.slides.internal.v6g.k5.n5(var2.a6().l6().n5(896), com.aspose.slides.internal.k0r.v8.class);
         if (var4 != null) {
            com.aspose.slides.internal.l7h.t1 var12 = new com.aspose.slides.internal.l7h.t1();
            char[] var16 = var12.n5(var4.l6());
            if (var16 != null && var16.length > 0) {
               if (var16[var16.length - 1] == 0) {
                  var3.setName(com.aspose.slides.ms.System.d1.n5(var16, 0, var16.length - 1));
               } else {
                  var3.setName(com.aspose.slides.ms.System.d1.n5(var16));
               }
            }
         }

         com.aspose.slides.internal.k0r.z5 var13 = com.aspose.slides.internal.v6g.k5.n5(var2.a6().l6().n5(959), com.aspose.slides.internal.k0r.z5.class);
         if (var13 != null) {
            var3.setHidden((var13.j5() & 4294967295L & 2L & 4294967295L) != 0L);
         }

         v0q.n5(var0);
      }

      com.aspose.slides.internal.k0r.a9 var11 = var2.h0();
      if (var11 != null) {
         int[] var14 = var11.k5();
         int var17 = com.aspose.slides.ms.System.q1.l6(var3.n5.size(), var14.length);

         for (int var7 = 0; var7 < var17; var7++) {
            var3.n5.get_Item(var7).setMinimalHeight(var14[var7] / 8.0);
         }
      }

      float var15 = var1.r4().t2() / 8.0F;
      float var18 = var3.getWidth();
      if (var15 < var18) {
         for (int var19 = 0; var19 < var3.l6.size(); var19++) {
            double var8 = var3.l6.get_Item(var19).getWidth() / var18;
            var3.l6.get_Item(var19).setWidth(var8 * var15);
         }
      }

      var3.e5().k5();
   }

   private static void n5(x8t var0) {
      Table var1 = var0.c8();
      double[] var2 = new double[var0.j5()];
      double[] var3 = new double[var0.w1()];

      for (int var4 = 0; var4 < var0.j5(); var4++) {
         var2[var4] = var0.n5(var4) / 8.0;
      }

      for (int var12 = 0; var12 < var0.w1(); var12++) {
         var3[var12] = var0.l6(var12) / 8.0;
      }

      var1.n5(var2, var3);
      com.aspose.slides.internal.o9b.y2 var13 = var0.r4().n3();
      o4f var5 = var1.R_();
      double var6 = var13.x8() / 8.0;
      double var8 = var13.t2() / 8.0;
      double var10 = var13.l6() / 8.0;
      var5.n5(new e4c(var13.s7() / 8.0, var6));
      var1.n5(var8, var10);
   }

   private static void l6(x8t var0) {
      Table var1 = var0.c8();
      int var2 = var1.getRows().size();
      int var3 = var1.getColumns().size();
      com.aspose.slides.internal.o9b.y2 var4 = new com.aspose.slides.internal.o9b.y2();
      com.aspose.slides.internal.o9b.y2 var5 = new com.aspose.slides.internal.o9b.y2();
      List$Enumerator var6 = var0.u9().iterator();

      try {
         label142:
         while (var6.hasNext()) {
            v5s var7 = (v5s)var6.next();
            b0t var8 = com.aspose.slides.internal.v6g.k5.n5(var7.a6(), b0t.class);
            if (var8 != null && (var8.n5() & 255) != 0) {
               com.aspose.slides.internal.k0r.q5 var9 = var8.n3();
               var8.l6().u3(var4);
               var0.n5(var4.n3()).u3(var5);
               int var10 = var5.s7();
               int var11 = var5.x8();
               int var12 = var5.t2();
               int var13 = var5.l6();
               LineFormat var14 = new LineFormat(var1);
               r9a.n5(var14, (byte)2, false, var8);
               boolean var15;
               byte var16;
               switch (var8.n5()) {
                  case 1:
                     while (true) {
                        if (var12 <= 0) {
                           continue label142;
                        }

                        if (var11 > 0) {
                           ((LineFormat)var1.get_Item(var10, var11 - 1).getCellFormat().getBorderBottom()).n5((ILineFormat)var14);
                        }

                        if (var11 < var2) {
                           ((LineFormat)var1.get_Item(var10, var11).getCellFormat().getBorderTop()).n5((ILineFormat)var14);
                        }

                        var10++;
                        var12--;
                     }
                  case 2:
                     while (true) {
                        if (var13 <= 0) {
                           continue label142;
                        }

                        if (var10 > 0) {
                           ((LineFormat)var1.get_Item(var10 - 1, var11).getCellFormat().getBorderRight()).n5((ILineFormat)var14);
                        }

                        if (var10 < var3) {
                           ((LineFormat)var1.get_Item(var10, var11).getCellFormat().getBorderLeft()).n5((ILineFormat)var14);
                        }

                        var11++;
                        var13--;
                     }
                  case 3:
                     var15 = var9.u3().a6() != var9.u3().u9();
                     var16 = 1;
                     if (var15) {
                        var16 = -1;
                        var10 += var12 - 1;
                     }
                     break;
                  default:
                     throw new com.aspose.slides.internal.e5a.u9("Unknown direction of table border!");
               }

               while (var12 > 0) {
                  while (var13 > 0) {
                     if (var15) {
                        ((LineFormat)var1.get_Item(var10, var11).getCellFormat().getBorderDiagonalUp()).n5((ILineFormat)var14);
                     } else {
                        ((LineFormat)var1.get_Item(var10, var11).getCellFormat().getBorderDiagonalDown()).n5((ILineFormat)var14);
                     }

                     var11++;
                     var13--;
                  }

                  var10 += var16;
                  var12--;
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }
   }

   private static void k5(x8t var0) {
      Table var1 = var0.c8();

      for (int var2 = 0; var2 < var0.j5(); var2++) {
         for (int var3 = 0; var3 < var0.w1(); var3++) {
            Cell var4 = (Cell)var1.get_Item(var2, var3);
            if (var4.getCellFormat().getBorderLeft().isFormatNotDefined()) {
               var4.getCellFormat().getBorderLeft().getFillFormat().setFillType((byte)0);
            }

            if (var4.getCellFormat().getBorderTop().isFormatNotDefined()) {
               var4.getCellFormat().getBorderTop().getFillFormat().setFillType((byte)0);
            }

            if (var4.getCellFormat().getBorderRight().isFormatNotDefined()) {
               var4.getCellFormat().getBorderRight().getFillFormat().setFillType((byte)0);
            }

            if (var4.getCellFormat().getBorderBottom().isFormatNotDefined()) {
               var4.getCellFormat().getBorderBottom().getFillFormat().setFillType((byte)0);
            }
         }
      }
   }

   private static void u3(x8t var0) {
      Table var1 = var0.c8();
      List$Enumerator var2 = var0.u9().iterator();

      try {
         while (var2.hasNext()) {
            v5s var3 = (v5s)var2.next();
            y5z var4 = com.aspose.slides.internal.v6g.k5.n5(var3.a6(), y5z.class);
            if (var4 != null) {
               com.aspose.slides.internal.k0r.q5 var5 = var4.n3();
               p3f var6 = var4.z3();
               com.aspose.slides.internal.o9b.y2 var7 = var4.l6().n3();
               com.aspose.slides.internal.o9b.y2 var8 = var0.n5(var7.n3()).n3();
               Cell var9 = (Cell)var1.get_Item(var8.s7(), var8.x8());
               var4.n5(var9);
               m3e.n5(var9.getCellFormat().getFillFormat(), var4);
               com.aspose.slides.internal.k0r.d3 var10 = var5.x8();
               if (var10 != null && var10.w1().n5()) {
                  g5x.l6(var6);
                  ((TextFrame)var9.getTextFrame()).n5((ITextFrame)var6.h0());
                  n5(var9);
               }

               var9.l6 = var8.t2() > 0 ? var8.t2() : 1;
               var9.n5 = var8.l6() > 0 ? var8.l6() : 1;
               if (var8.t2() > 1) {
                  ((LineFormat)var9.getCellFormat().getBorderRight())
                     .n5((ILineFormat)((LineFormat)var1.get_Item(var8.s7() + var8.t2() - 1, var8.x8()).getCellFormat().getBorderRight()));
               }

               if (var8.l6() > 1) {
                  ((LineFormat)var9.getCellFormat().getBorderBottom())
                     .n5((ILineFormat)((LineFormat)var1.get_Item(var8.s7(), var8.x8() + var8.l6() - 1).getCellFormat().getBorderBottom()));
               }

               var9.l6(false);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   static void n5(Cell var0) {
      TextFrameFormat var1 = (TextFrameFormat)var0.getTextFrame().getTextFrameFormat();
      var0.n5(var1.u3().n5(var0.n5().l6()).l6());
      var0.setTextAnchorType(var1.getAnchoringType() == -1 ? 0 : var1.getAnchoringType());
      var0.setAnchorCenter(var1.getCenterText() == 1);
      var0.setTextVerticalType(var1.getTextVerticalType() == -1 ? 0 : var1.getTextVerticalType());
   }

   static void n5(n7r var0) {
      Table var1 = var0.t9();
      com.aspose.slides.internal.k0r.q5 var2 = var0.z3();
      int var3 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var1.getX() * 8.0), 14);
      int var4 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var1.getY() * 8.0), 14);
      int var5 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var1.getWidth() * 8.0), 14);
      int var6 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var1.getHeight() * 8.0), 14);
      var2.l6().n5(new com.aspose.slides.internal.o9b.y2(var3, var4, var5, var6));
      com.aspose.slides.internal.k0r.p1 var7 = var2.u3();
      var7.n5(true);
      var7.u9(false);
      var7.h0(var1.getFrame().getFlipH() == 1);
      var7.c8(var1.getFrame().getFlipV() == 1);
      var7.s7(true);
      com.aspose.slides.internal.k0r.r3 var8 = var1.m1().n3();
      if (var8 == null) {
         var8 = var2.a6();
      } else {
         var2.n5(var8);
      }

      o7.n5(var1.getShapeLock(), var8);
      com.aspose.slides.internal.k0r.d1 var9 = (com.aspose.slides.internal.k0r.d1)var8.l6().n5(959);
      if (var9 == null) {
         var8.l6().n5(var9 = new com.aspose.slides.internal.k0r.d1());
      }

      var9.n5(true);
      var9.u3(var1.getHidden());
      var9.a6(false);
      var9.l6(false);
      var9.k5(false);
      if (!com.aspose.slides.ms.System.n1.k5(var1.getRotation())) {
         com.aspose.slides.internal.k0r.z5 var10 = new com.aspose.slides.internal.k0r.z5(
            4, ((com.aspose.slides.internal.v6g.k5.a6(var1.getRotation(), 13) & 4294967295L) % 360L & 4294967295L) << 16 & 4294967295L
         );
         var8.l6().l6(var10);
      }

      com.aspose.slides.internal.k0r.v8 var38 = new com.aspose.slides.internal.k0r.v8(896, var1.getName());
      var8.l6().l6(var38);
      var8.l6().l6(new com.aspose.slides.internal.k0r.z5(127, 16777472L));
      com.aspose.slides.internal.k0r.a9 var11 = var1.m1().y4();
      com.aspose.slides.internal.k0r.a9 var12 = var2.h0();
      com.aspose.slides.internal.k0r.s4 var13 = new com.aspose.slides.internal.k0r.s4();
      if (var11 != null && var11.l6().n5(927) != null) {
         var13 = (com.aspose.slides.internal.k0r.s4)var11.l6().n5(927);
      }

      var13.n5(true);
      var12.l6().l6(var13);
      com.aspose.slides.internal.k0r.b2 var14 = new com.aspose.slides.internal.k0r.b2(928, var1.getRows().size() & 65535, 4);
      var12.l6().l6(var14);

      for (int var15 = 0; var15 < var1.getRows().size(); var15++) {
         var14.n5(var15, com.aspose.slides.internal.v6g.k5.h0(com.aspose.slides.ms.System.q1.u3(var1.getRows().get_Item(var15).getHeight() * 8.0), 14));
      }

      com.aspose.slides.internal.k0r.t7 var53 = new com.aspose.slides.internal.k0r.t7();
      var2.e2().addItem(var53);
      var3 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var1.getX() * 8.0), 14);
      var4 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var1.getY() * 8.0), 14);
      var5 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var1.getWidth() * 8.0), 14);
      var6 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var1.getHeight() * 8.0), 14);
      var53.n5(var3);
      var53.l6(var4);
      var53.u3(var6);
      var53.k5(var5);
      if (var1.getRows().size() >= 1 && var1.getColumns().size() >= 1) {
         var1.e5().k5();
         int var22 = var1.getColumns().size();
         var3 = var1.getRows().size();
         int[] var36 = new int[var22 + 1];
         int[] var37 = new int[var3 + 1];
         double var16 = var1.getX();
         var36[0] = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var16 * 8.0), 14);

         for (int var31 = 0; var31 < var22; var31++) {
            if (var1.getRightToLeft()) {
               var16 += var1.l6.n5(var22 - var31 - 1).getWidth();
            } else {
               var16 += var1.l6.n5(var31).getWidth();
            }

            var36[var31 + 1] = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var16 * 8.0), 14);
         }

         var16 = var1.getY();
         var37[0] = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var16 * 8.0), 14);

         for (int var26 = 0; var26 < var3; var26++) {
            var16 += var1.n5.n5(var26).getHeight();
            var37[var26 + 1] = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(var16 * 8.0), 14);
         }

         Row var39 = null;
         Cell var42 = null;

         for (int var27 = 0; var27 < var1.getRows().size(); var27++) {
            var39 = var1.n5.n5(var27);
            var5 = var1.getRightToLeft() ? var22 - 1 : 0;
            int var44 = 0;

            while (var5 < var22 && var5 >= 0) {
               var42 = var39.n5(var5);
               if (var42.c8()) {
                  if (var42.a6().getRowSpan() > 1) {
                     var44++;
                  }

                  var5 += var1.getRightToLeft() ? -1 : var42.a6().getColSpan();
               } else {
                  int var47 = var1.getRightToLeft() ? var44 : var5;
                  com.aspose.slides.internal.o9b.y2 var49 = new com.aspose.slides.internal.o9b.y2(
                     var36[var47], var37[var27], var36[var47 + var42.getColSpan()] - var36[var47], var37[var27 + var42.getRowSpan()] - var37[var27]
                  );
                  x1k var54 = new x1k(var42, var0);
                  n5(var49.n3(), var54);
                  if (!var42.getCellFormat().getBorderDiagonalDown().isFormatNotDefined()) {
                     w2h var18 = new w2h(var42.getCellFormat().getBorderDiagonalDown(), var0);
                     n5(var49.n3(), var18);
                  }

                  if (!var42.getCellFormat().getBorderDiagonalUp().isFormatNotDefined()) {
                     w2h var58 = new w2h(var42.getCellFormat().getBorderDiagonalUp(), var0);
                     n5(var49.n3(), var58).u3().c8(true);
                  }

                  var5 += var1.getRightToLeft() ? -1 : var42.getColSpan();
                  var44 += var42.getColSpan();
               }
            }
         }

         int var48 = 0;

         for (int var33 = 0; var33 <= var22; var33++) {
            ILineFormat var45 = null;

            for (int var28 = 0; var28 < var3; var28++) {
               var39 = var1.n5.n5(var28);
               Cell var50 = null;
               Cell var55 = null;
               if (var33 > 0) {
                  var50 = var39.n5(var33 - 1);
               }

               if (var33 < var22) {
                  var55 = var39.n5(var33);
               }

               ILineFormat var59 = Table.n5(var50, var55, true);
               if (var59 != null ? !var59.equals(var45) : var45 != null) {
                  if (var45 != null && !var45.isFormatNotDefined()) {
                     w2h var19 = new w2h(var45, var0);
                     if (var1.getRightToLeft()) {
                        n5(new com.aspose.slides.internal.o9b.y2(var36[var22 - var33], var48, 0, var37[var28] - var48), var19);
                     } else {
                        n5(new com.aspose.slides.internal.o9b.y2(var36[var33], var48, 0, var37[var28] - var48), var19);
                     }
                  }

                  var45 = var59;
                  var48 = var37[var28];
               }
            }

            if (var45 != null && !var45.isFormatNotDefined()) {
               w2h var51 = new w2h(var45, var0);
               if (var1.getRightToLeft()) {
                  n5(new com.aspose.slides.internal.o9b.y2(var36[var22 - var33], var48, 0, var37[var3] - var48), var51);
               } else {
                  n5(new com.aspose.slides.internal.o9b.y2(var36[var33], var48, 0, var37[var3] - var48), var51);
               }
            }
         }

         for (int var29 = 0; var29 <= var3; var29++) {
            ILineFormat var46 = null;
            Row var52 = null;
            if (var29 > 0) {
               var52 = var1.n5.n5(var29 - 1);
            }

            Row var56 = null;
            if (var29 < var3) {
               var56 = var1.n5.n5(var29);
            }

            for (var5 = 0; var5 < var22; var5++) {
               Cell var60 = null;
               if (var52 != null) {
                  var60 = var52.n5(var5);
               }

               Cell var62 = null;
               if (var56 != null) {
                  var62 = var56.n5(var5);
               }

               ILineFormat var20 = Table.n5(var60, var62, false);
               if (var20 != null ? !var20.equals(var46) : var46 != null) {
                  if (var46 != null && !var46.isFormatNotDefined()) {
                     w2h var21 = new w2h(var46, var0);
                     if (var1.getRightToLeft()) {
                        n5(new com.aspose.slides.internal.o9b.y2(var36[var22 - var5], var37[var29], var48 - var36[var22 - var5], 0), var21);
                     } else {
                        n5(new com.aspose.slides.internal.o9b.y2(var48, var37[var29], var36[var5] - var48, 0), var21);
                     }
                  }

                  var46 = var20;
                  if (var1.getRightToLeft()) {
                     var48 = var36[var22 - var5];
                  } else {
                     var48 = var36[var5];
                  }
               }
            }

            if (var46 != null && !var46.isFormatNotDefined()) {
               w2h var61 = new w2h(var46, var0);
               if (var1.getRightToLeft()) {
                  n5(new com.aspose.slides.internal.o9b.y2(var36[0], var37[var29], var48 - var36[var22 - var5], 0), var61);
               } else {
                  n5(new com.aspose.slides.internal.o9b.y2(var48, var37[var29], var36[var22] - var48, 0), var61);
               }
            }
         }
      }
   }

   private static void n5(com.aspose.slides.internal.o9b.y2 var0, x1k var1) {
      Cell var2 = var1.t2();
      com.aspose.slides.internal.k0r.q5 var3 = var1.z3();
      com.aspose.slides.internal.k0r.p1 var4 = var3.u3();
      var4.l6(true);
      var4.s7(true);
      var4.n3(true);
      var4.n5(1);
      com.aspose.slides.internal.k0r.r3 var5 = var1.z8();
      com.aspose.slides.internal.k0r.a9 var6 = var1.j5();
      com.aspose.slides.internal.k0r.t3 var7 = new com.aspose.slides.internal.k0r.t3();
      var5.l6().n5(var7);
      var7.c8(true);
      com.aspose.slides.internal.k0r.d1 var8 = (com.aspose.slides.internal.k0r.d1)var5.l6().n5(959);
      if (var8 == null) {
         var5.l6().n5(var8 = new com.aspose.slides.internal.k0r.d1());
      }

      var8.n5(true);
      var8.u3(false);
      var8.a6(false);
      var8.l6(false);
      var8.k5(false);
      m3e.n5(var2.getCellFormat().getFillFormat(), var1);
      l6(var2);
      g5x.n5(var2.getTextFrame().getTextFrameFormat(), var1);
      com.aspose.slides.internal.k0r.v7 var9 = new com.aspose.slides.internal.k0r.v7();
      var3.e2().addItem(var9);
      var9.n5(var0.n3());
      var1.n5(var2.getTextFrame(), 7);
      var1.c8();
   }

   static void l6(Cell var0) {
      TextFrameFormat var1 = (TextFrameFormat)var0.getTextFrame().getTextFrameFormat();
      var1.n5(var0.n5().n5(var1.u3().l6()).l6());
      var1.setAnchoringType(var0.getTextAnchorType() == 0 ? -1 : var0.getTextAnchorType());
      var1.setCenterText((byte)(var0.getAnchorCenter() ? 1 : -1));
      var1.setTextVerticalType(var0.getTextVerticalType() == 0 ? -1 : var0.getTextVerticalType());
   }

   private static com.aspose.slides.internal.k0r.q5 n5(com.aspose.slides.internal.o9b.y2 var0, w2h var1) {
      com.aspose.slides.internal.k0r.q5 var2 = var1.z3();
      com.aspose.slides.internal.k0r.r3 var3 = var2.a6();
      com.aspose.slides.internal.k0r.a9 var4 = var2.h0();
      com.aspose.slides.internal.k0r.t3 var5 = new com.aspose.slides.internal.k0r.t3();
      var3.l6().n5(var5);
      var5.c8(true);
      com.aspose.slides.internal.k0r.d1 var6 = (com.aspose.slides.internal.k0r.d1)var3.l6().n5(959);
      if (var6 == null) {
         var3.l6().n5(var6 = new com.aspose.slides.internal.k0r.d1());
      }

      var6.n5(true);
      var6.u3(false);
      var6.a6(false);
      var6.l6(false);
      var6.k5(false);
      r9a.n5(var1.x8(), var2, (byte)2, var1.t2().a6().n5());
      new com.aspose.slides.internal.k0r.z5(191, 393216L);
      new com.aspose.slides.internal.k0r.z5(383, 65536L);
      new com.aspose.slides.internal.k0r.z5(447, 1048576L);
      com.aspose.slides.internal.k0r.v7 var10 = new com.aspose.slides.internal.k0r.v7();
      var2.e2().addItem(var10);
      var10.n5(var0.n3());
      var1.c8();
      return var2;
   }
}
