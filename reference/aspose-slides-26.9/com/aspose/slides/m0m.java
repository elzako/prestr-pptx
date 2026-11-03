package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;

class m0m extends g4a {
   private boolean n5;
   private boolean l6;
   private boolean k5;
   private Dictionary<Cell, j5m> u3;

   public m0m(Table var1) {
      super(var1);
   }

   public final Table n5() {
      return (Table)this.a6();
   }

   public final void n5(s5u var1) {
      RowCollection var2 = this.n5().n5;
      int var3 = var2.size();
      int var4 = this.n5().l6.size();
      if (var3 >= 1) {
         double[] var5 = new double[var3 + 1];

         for (int var6 = 0; var6 <= var3; var6++) {
            var5[var6] = 0.0;
         }

         for (int var16 = 0; var16 < var3; var16++) {
            double var7 = var5[var16] + com.aspose.slides.ms.System.q1.l6(var2.n5(var16).getMinimalHeight(), 2.0);
            if (var5[var16 + 1] < var7) {
               var5[var16 + 1] = var7;
            }

            Row var9 = var2.n5(var16);
            int var10 = 0;

            while (var10 < var4) {
               Cell var11 = var9.n5(var10);
               if (var11.c8()) {
                  var10 += var11.a6().getColSpan();
               } else {
                  var11.n5(false);
                  TextFrame var12 = (TextFrame)var11.getTextFrame();
                  switch (var11.getTextVerticalType()) {
                     case 1:
                     case 2:
                     case 4:
                     case 5:
                     case 6:
                        var12.u3.a6();
                        break;
                     case 3:
                     default:
                        e4c var13 = new e4c(var11.getWidth() - var11.getMarginLeft() - var11.getMarginRight(), 0.0);
                        var12.u3.n5(var13.a6().u3(), var1);
                  }

                  var7 = var12.u3.k5().l6;
                  int var24 = var11.s7();
                  var7 += var5[var16] + var11.getMarginTop() + var11.getMarginBottom();
                  var5[var24] = com.aspose.slides.ms.System.q1.l6(var5[var24], var7);
                  var10 += var11.getColSpan();
               }
            }
         }

         for (int var17 = 0; var17 < var3; var17++) {
            Row var14 = var2.n5(var17);
            var14.k5 = var5[var17];
            var14.n5(var5[var17 + 1] - var5[var17]);
            var14.a6 = false;
            int var15 = 0;

            while (var15 < var4) {
               Cell var20 = var14.n5(var15);
               if (var20.c8()) {
                  var15 += var20.a6().getColSpan();
               } else {
                  int var21 = var20.s7();
                  e4c var22 = e4c.k5.u9();
                  var22.n5 = var20.getWidth() - var20.getMarginLeft() - var20.getMarginRight();
                  var22.l6 = var5[var21] - var5[var17] - var20.getMarginTop() - var20.getMarginBottom();
                  TextFrame var23 = (TextFrame)var20.getTextFrame();
                  f1z var25 = var23.u3;
                  switch (var20.getTextVerticalType()) {
                     case 1:
                     case 2:
                     case 4:
                     case 5:
                     case 6:
                        var22.k5();
                     case 3:
                     default:
                        var25.n5(var22.a6().u3(), var1);
                        var15 += var20.getColSpan();
                  }
               }
            }
         }

         this.n5().l6.t2();
         var2.l6 = var5[var3];
         var2.n5 = true;
      }
   }

   private boolean z3() {
      for (int var1 = 0; var1 < this.n5().getRows().size(); var1++) {
         for (int var2 = 0; var2 < this.n5().getColumns().size(); var2++) {
            Cell var3 = (Cell)this.n5().get_Item(var2, var1);
            if (var3.getTextFrame() != null && ((TextFrame)var3.getTextFrame()).n3()) {
               return true;
            }
         }
      }

      return false;
   }

   private boolean m1() {
      for (int var1 = 0; var1 < this.n5().getRows().size(); var1++) {
         for (int var2 = 0; var2 < this.n5().getColumns().size(); var2++) {
            Cell var3 = (Cell)this.n5().get_Item(var2, var1);
            if (var3.getTextFrame() != null && !s3z.n5((TextFrame)var3.getTextFrame())) {
               return false;
            }
         }
      }

      return true;
   }

   private boolean k7() {
      for (int var1 = 0; var1 < this.n5().getRows().size(); var1++) {
         for (int var2 = 0; var2 < this.n5().getColumns().size(); var2++) {
            Cell var3 = (Cell)this.n5().get_Item(var2, var1);
            if (var3.getTextFrame() != null && ((TextFrame)var3.getTextFrame()).c8()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   void k5() {
      this.k5(true);
   }

   final void k5(boolean var1) {
      if ((!var1 || !this.n5) && !this.k5) {
         if (!this.l6) {
            this.l6 = true;

            try {
               this.n5((com.aspose.slides.s5u)null);
               ShapeFrame var2 = this.n3();
               ShapeFrame var3 = new ShapeFrame(
                  var2.getX(), var2.getY(), (float)this.n5().l6.k5(), (float)this.n5().n5.l6(), var2.getFlipH(), var2.getFlipV(), var2.getRotation()
               );
               this.n5().l6(var3);
               this.k5 = true;
            } finally {
               this.l6 = false;
            }
         }
      }
   }

   final void l6() {
      this.k5 = false;
      this.n5 = false;
      this.u3 = null;
   }

   final void u3() {
      this.n5 = true;
   }

   @Override
   l3f l6(boolean var1) {
      this.k5(false);
      return super.l6(var1);
   }

   @Override
   ShapeFrame e2() {
      this.k5(false);
      return super.e2();
   }

   final void q0() {
      this.k5 = false;
   }

   @Override
   void n5(e3 var1, s5u var2, InterruptionToken var3) {
      if (!this.n5().getHidden()) {
         this.l6(var1, var2, var3);
         this.n5(var1, var2, var3, (byte)1, null);
         this.k5(var1, var2, var3);
      }
   }

   private void n5(e3 var1, s5u var2, InterruptionToken var3, byte var4, IEffectEffectiveData var5) {
      IEffectFormatEffectiveData var6 = this.n5().getEffectFormat().getEffective();
      if (this.n5(var6, var4)) {
         if (this.z3() && !this.m1() && (var4 & 1) != 0 && !this.k7() && this.n5().w1() != null) {
            this.n5().w1().l6(this.n5().f0());
            this.n5().w1().e5().n5(var1, var2, var3);
            this.n5().w1().l6((r0g)null);
         } else {
            this.n5 = false;
            ShapeFrame var7 = this.n3();
            float var8 = var7.getX();
            float var9 = var7.getY();
            float var10 = var7.getWidth();
            float var11 = var7.getHeight();
            if (!com.aspose.slides.ms.System.n1.k5(var8)
               && !com.aspose.slides.ms.System.n1.k5(var9)
               && !com.aspose.slides.ms.System.n1.k5(var10)
               && !com.aspose.slides.ms.System.n1.k5(var11)) {
               com.aspose.slides.internal.w0.c8 var12 = new com.aspose.slides.internal.w0.c8(
                  var7.getFlipH() == 1 ? -1.0F : 1.0F,
                  0.0F,
                  0.0F,
                  var7.getFlipV() == 1 ? -1.0F : 1.0F,
                  var7.getFlipH() == 1 ? var7.getCenterX() * 2.0F : 0.0F,
                  var7.getFlipV() == 1 ? var7.getCenterY() * 2.0F : 0.0F
               );
               if (!com.aspose.slides.ms.System.n1.k5(var7.getRotation())) {
                  var12.n5(
                     var7.getFlipH() == 1 ^ var7.getFlipV() == 1 ? -var7.getRotation() : var7.getRotation(),
                     new com.aspose.slides.internal.o9b.w1(var7.getCenterX(), var7.getCenterY()),
                     0
                  );
               }

               com.aspose.slides.internal.w0.c8 var13 = var12;
               com.aspose.slides.internal.w0.c8 var14 = var13.k5();
               var13.l6(var8, var9);
               var1.k5(var13);
               int var15 = this.n5().n5.size();
               int var16 = this.n5().l6.size();
               BaseSlide var17 = (BaseSlide)this.n5().getSlide();
               IThemeEffectiveData var18 = var17.createThemeEffective();
               this.n5(var2);
               a1v var19 = null;
               z2x var20 = this.n5().u9();
               a1v var21 = null;
               IFillParamSource var22 = var20 != null && var20.l6().n5().u3() != 0
                  ? var20.l6().n5().n5(var17, var18)
                  : this.n5().getTableFormat().getFillFormat();
               if (var22 != null) {
                  var21 = a1v.n5(
                     new j5m(
                        new ShapeFrame(0.0F, 0.0F, var7.getWidth(), var7.getHeight(), var7.getFlipH(), var7.getFlipV(), var7.getRotation()),
                        null,
                        null,
                        var17,
                        var2
                     ),
                     var22
                  );
                  var19 = a1v.n5(
                     new j5m(
                        new ShapeFrame(0.0F, 0.0F, var7.getWidth(), var7.getHeight(), var7.getFlipH(), var7.getFlipV(), var7.getRotation()),
                        null,
                        null,
                        var17,
                        var2
                     ),
                     (f6a)this.n5().getTableFormat().getFillFormat().getEffective()
                  );
               }

               if ((var4 & 1) != 0) {
                  var1.n5(new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var7.getWidth(), var7.getHeight()), null, var21);
               }

               if ((var4 & 4) != 0) {
                  com.aspose.slides.internal.x4g.s7 var23 = new com.aspose.slides.internal.x4g.s7();

                  try {
                     var23.l6(new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var7.getWidth(), var7.getHeight()));
                     this.l6(var1, var23, var5, var19, null, var7);
                  } finally {
                     if (var23 != null) {
                        var23.dispose();
                     }
                  }
               }

               var1.l6(false);

               for (int var25 = 0; var25 < var15; var25++) {
                  Row var87 = this.n5().n5.n5(var25);
                  double var26 = var87.c8();
                  int var28 = 0;

                  while (var28 < var16) {
                     Cell var29 = var87.n5(var28);
                     if (var29.c8()) {
                        var28 += var29.a6().getColSpan();
                     } else {
                        ShapeFrame var30 = this.n5(var29, var26);
                        com.aspose.slides.internal.o9b.y1 var31 = var30.n5().y4();
                        j5m var32 = this.n5(var29, var26, var2);
                        f6a var33 = var29.x8().u9().u9();
                        a1v var34 = a1v.l6(var32, var33);
                        if (var34 != null) {
                           var34 = var34.n5(var30);
                        } else {
                           var34 = var21;
                        }

                        com.aspose.slides.internal.x4g.s7 var35 = new com.aspose.slides.internal.x4g.s7();

                        try {
                           var35.l6(var31.y4());
                           if ((var4 & 2) != 0) {
                              this.n5(var1, var35, var5, var34, null, var7);
                           }

                           if ((var4 & 1) != 0) {
                              boolean var36 = l6o.n5(var1, var2, var29, var30, var35, var34);
                              if (!var36) {
                                 var1.n5(var31.y4(), null, var34);
                              }
                           }

                           if ((var4 & 4) != 0 && var25 == 0 && (var19 == null || var19.u3() == 0)) {
                              this.l6(var1, var35, var5, var34, null, var7);
                           }
                        } finally {
                           if (var35 != null) {
                              var35.dispose();
                           }
                        }

                        var28 += var29.getColSpan();
                     }
                  }
               }

               var1.l6(true);
               float var24 = 0.0F;

               for (int var94 = 0; var94 <= var16; var94++) {
                  l6v var88 = null;
                  float var38 = this.n5(var16, var94);

                  for (int var90 = 0; var90 < var15; var90++) {
                     float var97 = this.n5(var90);
                     boolean var102 = var94 < var16;
                     Cell var106 = var102 ? this.n5().n5(var94, var90) : this.n5().n5(var94 - 1, var90);
                     j5m var117 = this.n5(var106, var97, var2);
                     Cell var109 = null;
                     if (!var102) {
                        var109 = var106;
                     } else if (var94 >= 1) {
                        var109 = this.n5().n5(var94 - 1, var90);
                     }

                     Cell var113 = null;
                     if (var102 && var94 < var16) {
                        var113 = var106;
                     }

                     LineFormat var122 = (LineFormat)Table.l6(var109, var113, true);
                     l6v var125 = null;
                     if (!var102 || !var106.c8() || var106.c8() && var106.a6().getFirstColumnIndex() == var94) {
                        var125 = new l6v(var117, var122.getEffective(), 0);
                     }

                     if (var125 != var88) {
                        com.aspose.slides.internal.x4g.s7 var37 = new com.aspose.slides.internal.x4g.s7();

                        try {
                           var37.n5(new com.aspose.slides.internal.o9b.w1(var38, var24), new com.aspose.slides.internal.o9b.w1(var38, var97));
                           if ((var4 & 2) != 0) {
                              this.n5(var1, var37, var5, null, var88, var7);
                           }

                           if ((var4 & 1) != 0) {
                              this.n5(new com.aspose.slides.internal.o9b.w1(var38, var24), new com.aspose.slides.internal.o9b.w1(var38, var97), var88, var1);
                           }
                        } finally {
                           if (var37 != null) {
                              var37.dispose();
                           }
                        }

                        var88 = var125;
                        var24 = var97;
                     }
                  }

                  com.aspose.slides.internal.x4g.s7 var98 = new com.aspose.slides.internal.x4g.s7();

                  try {
                     var98.n5(new com.aspose.slides.internal.o9b.w1(var38, var24), new com.aspose.slides.internal.o9b.w1(var38, (float)this.n5().n5.l6()));
                     if ((var4 & 2) != 0) {
                        this.n5(var1, var98, var5, null, var88, var7);
                     }

                     if ((var4 & 1) != 0) {
                        this.n5(
                           new com.aspose.slides.internal.o9b.w1(var38, var24),
                           new com.aspose.slides.internal.o9b.w1(var38, (float)this.n5().n5.l6()),
                           var88,
                           var1
                        );
                     }
                  } finally {
                     if (var98 != null) {
                        var98.dispose();
                     }
                  }
               }

               float var130 = this.n5().getRightToLeft() ? 0.0F : (float)this.n5().l6.k5();

               for (int var91 = 0; var91 <= var15; var91++) {
                  l6v var89 = null;
                  float var99 = (float)(var91 < var15 ? this.n5().n5.n5(var91).c8() : this.n5().n5.l6());

                  for (int var95 = 0; var95 < var16; var95++) {
                     float var103 = this.n5(var16, var95);
                     boolean var107 = var91 < var15;
                     Cell var118 = var107 ? this.n5().n5(var95, var91) : this.n5().n5(var95, var91 - 1);
                     j5m var110 = this.n5(var118, var99, var2);
                     Cell var114 = null;
                     if (!var107) {
                        var114 = var118;
                     } else if (var91 >= 1) {
                        var114 = this.n5().n5(var95, var91 - 1);
                     }

                     Cell var123 = null;
                     if (var107 && var91 < var15) {
                        var123 = var118;
                     }

                     LineFormat var126 = (LineFormat)Table.l6(var114, var123, false);
                     l6v var129 = null;
                     if (!var107 || !var118.c8() || var118.c8() && var118.a6().getFirstRowIndex() == var91) {
                        var129 = new l6v(var110, var126.getEffective(), 0);
                     }

                     if (var129 != var89) {
                        com.aspose.slides.internal.x4g.s7 var39 = new com.aspose.slides.internal.x4g.s7();

                        try {
                           var39.n5(new com.aspose.slides.internal.o9b.w1(var24, var99), new com.aspose.slides.internal.o9b.w1(var103, var99));
                           if ((var4 & 2) != 0) {
                              this.n5(var1, var39, var5, null, var89, var7);
                           }

                           if ((var4 & 1) != 0) {
                              this.n5(new com.aspose.slides.internal.o9b.w1(var24, var99), new com.aspose.slides.internal.o9b.w1(var103, var99), var89, var1);
                           }
                        } finally {
                           if (var39 != null) {
                              var39.dispose();
                           }
                        }

                        var89 = var129;
                        var24 = var103;
                     }
                  }

                  com.aspose.slides.internal.x4g.s7 var104 = new com.aspose.slides.internal.x4g.s7();

                  try {
                     var104.n5(new com.aspose.slides.internal.o9b.w1(var24, var99), new com.aspose.slides.internal.o9b.w1(var130, var99));
                     if ((var4 & 2) != 0) {
                        this.n5(var1, var104, var5, null, var89, var7);
                     }

                     if ((var4 & 1) != 0) {
                        this.n5(new com.aspose.slides.internal.o9b.w1(var24, var99), new com.aspose.slides.internal.o9b.w1(var130, var99), var89, var1);
                     }
                  } finally {
                     if (var104 != null) {
                        var104.dispose();
                     }
                  }
               }

               for (int var92 = 0; var92 < var15; var92++) {
                  Row var100 = this.n5().n5.n5(var92);
                  double var43 = var100.c8();
                  int var96 = 0;

                  while (var96 < var16) {
                     Cell var119 = var100.n5(var96);
                     if (var119.c8()) {
                        var96 += var119.a6().getColSpan();
                     } else {
                        ShapeFrame var111 = this.n5(var119, var43);
                        com.aspose.slides.internal.o9b.y1 var115 = var111.n5().y4();
                        j5m var124 = this.n5(var119, var43, var2);
                        l6v var127 = new l6v(var124, ((LineFormat)var119.getCellFormat().getBorderDiagonalDown()).getEffective(), 0);
                        if (var127 != null) {
                           var1.n5(
                              var127,
                              new com.aspose.slides.internal.o9b.w1(var115.a6(), var115.t2()),
                              new com.aspose.slides.internal.o9b.w1(var115.h0(), var115.l6())
                           );
                        }

                        var127 = new l6v(var124, ((LineFormat)var119.getCellFormat().getBorderDiagonalUp()).getEffective(), 0);
                        if (var127 != null && (var4 & 1) != 0) {
                           var1.n5(
                              var127,
                              new com.aspose.slides.internal.o9b.w1(var115.h0(), var115.t2()),
                              new com.aspose.slides.internal.o9b.w1(var115.a6(), var115.l6())
                           );
                        }

                        var96 += var119.getColSpan();
                     }
                  }
               }

               boolean var101 = false;
               boolean var105 = false;
               if ((var4 & 1) != 0) {
                  if (!this.n5().a5()) {
                     var105 = var1.n5("Table", null, this.n5().getAlternativeText());
                  }

                  byte var108 = 0;
                  if (this.n5().getFirstRow() && var15 > 0) {
                     if (!this.n5().a5()) {
                        var1.n5("THead");
                     }

                     Row var120 = this.n5().n5.n5(var108);
                     this.n5(var120, var14, var1, var2, true, this.n5().getFirstCol());
                     if (!this.n5().a5()) {
                        var1.u9();
                     }

                     var108 = 1;
                     var101 = true;
                  }

                  if (var108 < var15) {
                     boolean var121 = false;
                     if (var101 && !this.n5().a5()) {
                        var121 = var1.n5("TBody");
                     }

                     for (int var93 = var108; var93 < var15; var93++) {
                        Row var112 = this.n5().n5.n5(var93);
                        if (this.n5().getLastRow() && var93 == var15 - 1 && var101) {
                           var1.u9();
                           var121 = false;
                           if (!this.n5().a5()) {
                              var1.n5("TFoot");
                           }

                           this.n5(var112, var14, var1, var2, false, this.n5().getFirstCol());
                           if (!this.n5().a5()) {
                              var1.u9();
                           }
                        } else {
                           this.n5(var112, var14, var1, var2, false, this.n5().getFirstCol());
                        }
                     }

                     if (var121) {
                        var1.u9();
                     }
                  }

                  if (var105) {
                     var1.u9();
                  }
               }

               var1.z3();
               this.u3 = null;
            }
         }
      }
   }

   private void n5(Row var1, com.aspose.slides.internal.w0.c8 var2, e3 var3, s5u var4, boolean var5, boolean var6) {
      if (!this.n5().a5()) {
         var3.n5("TR");
      }

      double var7 = var1.c8();
      int var9 = 0;

      while (var9 < this.n5().l6.size()) {
         if (!this.n5().a5()) {
            boolean var10 = var6 && var9 == 0;
            String var11;
            if (var5 && var10) {
               var11 = "/Both";
            } else if (var5) {
               var11 = "/Column";
            } else if (var10) {
               var11 = "/Row";
            } else {
               var11 = com.aspose.slides.ms.System.d1.n5;
            }

            var3.n5(com.aspose.slides.ms.System.d1.n5(var11) ? "TD" : "TH", var11);
         }

         Cell var17 = var1.n5(var9);
         if (var17.c8()) {
            var9 += var17.a6().getColSpan();
         } else {
            ShapeFrame var18 = this.n5(var17, var7);
            com.aspose.slides.internal.o9b.y1 var12 = var18.n5().y4();
            com.aspose.slides.internal.w0.c8 var13 = var2.k5();
            switch (var17.getTextVerticalType()) {
               case 1:
               case 3:
               case 4:
               case 5:
               case 6:
                  var13.l6(var12.x8() + var12.s7() - (float)var17.getMarginRight(), var12.n3() + (float)var17.getMarginTop());
                  var13.n5(90.0F);
                  break;
               case 2:
                  var13.l6(var12.x8() + (float)var17.getMarginLeft(), var12.n3() + var12.k5() - (float)var17.getMarginBottom());
                  var13.n5(270.0F);
                  break;
               default:
                  var13.l6(var12.x8() + (float)var17.getMarginLeft(), var12.n3() + (float)var17.getMarginTop());
            }

            var3.k5(var13);
            var4.n5(new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, (float)var17.getWidth(), (float)var17.getHeight()));
            boolean var14 = ((TextFrame)var17.getTextFrame()).u3.n5(var3, var4);
            if (!var14) {
               FillFormat var15 = new FillFormat(this.n5());
               var15.setFillType((byte)4);
               var15.getPictureFillFormat().getPicture().setImage(((ImageCollection)this.n5().getPresentation().getImages()).n5());
               var15.getPictureFillFormat().setPictureFillMode(1);
               a1v var16 = a1v.n5(
                  new j5m(
                     new ShapeFrame(
                        0.0,
                        0.0,
                        var18.getWidth() - var17.getMarginLeft() - var17.getMarginRight(),
                        var18.getHeight() - var17.getMarginTop() - var17.getMarginBottom(),
                        var18.getFlipH(),
                        var18.getFlipV(),
                        var18.getRotation()
                     ),
                     null,
                     null,
                     this.n5().getSlide(),
                     var4
                  ),
                  var15
               );
               var3.n5(new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var18.getWidth(), var18.getHeight()), null, var16);
            }

            var3.z3();
            var9 += var17.getColSpan();
            if (!this.n5().a5()) {
               var3.u9();
            }
         }
      }

      if (!this.n5().a5()) {
         var3.u9();
      }
   }

   private boolean n5(IEffectFormatEffectiveData var1, byte var2) {
      if ((var2 & 1) != 0) {
         return true;
      }

      if (!var1.isNoEffects()) {
         if (var2 == 2 && (var1.getOuterShadowEffect() != null || var1.getReflectionEffect() != null)) {
            return true;
         }

         if (var2 == 4 && var1.getInnerShadowEffect() != null) {
            return true;
         }
      }

      return false;
   }

   private ShapeFrame n5(Cell var1, double var2) {
      return this.n5().getRightToLeft()
         ? new ShapeFrame(this.n5().getWidth() - var1.getWidth() - (float)var1.getOffsetX(), var2, var1.getWidth(), var1.getHeight(), (byte)0, (byte)0, 0.0F)
         : new ShapeFrame(var1.getOffsetX(), var2, var1.getWidth(), var1.getHeight(), (byte)0, (byte)0, 0.0F);
   }

   private void l6(e3 var1, s5u var2, InterruptionToken var3) {
      IEffectFormatEffectiveData var4 = this.n5().getEffectFormat().getEffective();
      if (!var4.isNoEffects()) {
         if (var4.getReflectionEffect() != null) {
            this.n5(var1, var2, var3, (byte)2, var4.getReflectionEffect());
         }

         if (var4.getOuterShadowEffect() != null) {
            this.n5(var1, var2, var3, (byte)2, var4.getOuterShadowEffect());
         }
      }
   }

   private void n5(e3 var1, com.aspose.slides.internal.x4g.s7 var2, IEffectEffectiveData var3, a1v var4, l6v var5, IShapeFrame var6) {
      if (var3 != null) {
         k0p var7 = com.aspose.slides.internal.v6g.k5.n5(var3, k0p.class);
         if (var7 != null) {
            n7q var8 = new n7q(var7);
            if (var4 != null && var4.u3() != 0) {
               var5 = null;
            }

            var8.n5(var1, var2, var4, var5);
         }

         i2u var10 = com.aspose.slides.internal.v6g.k5.n5(var3, i2u.class);
         if (var10 != null) {
            e2r var9 = new e2r(var10);
            var9.n5(var1, var2, var4, var5, var6);
         }
      }
   }

   private void k5(e3 var1, s5u var2, InterruptionToken var3) {
      IEffectFormatEffectiveData var4 = this.n5().getEffectFormat().getEffective();
      if (!var4.isNoEffects()) {
         if (var4.getInnerShadowEffect() != null) {
            this.n5(var1, var2, var3, (byte)4, var4.getInnerShadowEffect());
         }
      }
   }

   private void l6(e3 var1, com.aspose.slides.internal.x4g.s7 var2, IEffectEffectiveData var3, a1v var4, l6v var5, IShapeFrame var6) {
      if (var4 != null && var4.u3() != 0) {
         if (com.aspose.slides.internal.v6g.k5.l6(var3, d8f.class)) {
            y3w var7 = new y3w((d8f)var3);
            var7.n5(var1, var2, var4, var5, var6);
         }
      }
   }

   private j5m n5(Cell var1, double var2, s5u var4) {
      if (this.u3 == null) {
         this.u3 = new Dictionary<>();
      }

      if (!this.u3.containsKey(var1)) {
         ShapeFrame var5 = this.n5(var1, var2);
         j5m var6 = new j5m(var5.cloneT(), null, null, this.n5().getSlide(), var4);
         this.u3.addItem(var1, var6);
      }

      return this.u3.get_Item(var1);
   }

   private float n5(int var1, int var2) {
      if (var2 < var1) {
         Column var3 = this.n5().l6.n5(var2);
         return this.n5().getRightToLeft() ? (float)(this.n5().getWidth() - var3.c8()) : (float)var3.c8();
      } else {
         return this.n5().getRightToLeft() ? (float)(this.n5().getWidth() - this.n5().l6.k5()) : (float)this.n5().l6.k5();
      }
   }

   private float n5(int var1) {
      Row var2 = this.n5().n5.n5(var1);
      return (float)var2.c8();
   }

   private void n5(com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.w1 var2, l6v var3, e3 var4) {
      if (var3 != null) {
         var4.n5(var3, var1.u3(), var2.u3());
      }
   }
}
