package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class i5u {
   private final j5u n5;
   private final e7k l6;
   private final e2n k5;
   private final y6e u3;
   private final y6e a6;
   private boolean u9 = false;
   private boolean h0 = false;
   private boolean c8 = true;
   private k8x t2 = k8x.u3.n5();
   private float s7 = 0.0F;
   private k8x x8 = k8x.u3.n5();
   private y6e n3;
   private y6e y4;
   private y6e e2;
   private float t9;
   private float z1;
   private float t4;
   private float q0;
   private int z3 = 0;
   private y6e m1;
   private y6e k7;
   private float m3 = 0.0F;
   private boolean z8 = false;
   private boolean j5;
   private boolean w1;
   private float r4;
   private final List<m7f> c4;
   private final List<r4d> y2;
   private y6e y1;

   public i5u(j5u var1, e7k var2, e2n var3, y6e var4, y6e var5, List<m7f> var6, List<r4d> var7, float var8) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var5;
      this.a6 = var4;
      this.c4 = var6;
      this.y2 = var7;
      this.n3 = var4;
      this.y4 = var4;
      this.e2 = var4;
      this.t9 = var8;
      this.z1 = var8;
      this.t4 = var8;
      this.q0 = var8;
      this.z3 = 0;
      this.m1 = var4;
      this.k7 = var5;
      this.m3 = 0.0F;
      this.z8 = false;
      this.r4 = var1.s7() && var1.x8() > 0.0F ? var1.l6 : 11520.0F;
      t3x var9 = var3.n5;
      this.r4 = this.r4 - var9.getMarginRight();
      this.j5 = var9.getLatinLineBreak();
      this.w1 = var9.getHangingPunctuation()
         && var1.n5.getTextFrameFormat().getEffective().getMarginRight() > 0.0
         && var1.n5.getTextFrameFormat().getAutofitType() == 2
         && this.n5.t9() < 2;
      Cell var10 = null;
      Cell[] var11 = new Cell[]{var10};
      boolean var12 = d0u.n5(Cell.class, var1.n5, var11);
      var10 = var11[0];
      if (var12) {
         this.w1 = false;
         this.r4 = this.r4 - (float)(var10.getMarginLeft() + var10.getMarginRight()) / 150.0F;
      }

      Chart var13 = null;
      Chart[] var14 = new Chart[]{var13};
      boolean var15 = d0u.n5(Chart.class, var1.n5, var14);
      var13 = var14[0];
      if (var15) {
         this.j5 = true;
         this.r4 += 0.6F;
      }
   }

   public final void n5(y6e[] var1, boolean[] var2) {
      boolean var3 = false;
      boolean var4 = false;
      y6e var5 = var1[0].x8();
      boolean var6 = var1[0].n5().n5.getFontBold();
      boolean var7 = "Hang".equals(Fonts.n5(var1[0].n5().n5.getLanguageId()));
      boolean var8 = "Arab".equals(Fonts.n5(var1[0].n5().n5.getLanguageId()));
      byte var9 = var1[0].k5();
      TextParam var10 = this.n5.n5(var1[0]);
      e4z var11 = var10.d2();

      do {
         boolean var12 = false;
         k8x var13 = new k8x();
         if (this.h0) {
            var1[0] = var1[0].t2();
            this.e2 = var1[0];
            this.y4 = var1[0];
            this.n3 = var1[0];
         }

         if (var9 != var1[0].k5() || this.h0 || var6 != var1[0].n5().n5.getFontBold()) {
            var9 = var1[0].k5();
            var10 = this.n5.n5(var1[0]);
            var11 = var10.d2();
            var6 = var1[0].n5().n5.getFontBold();
         }

         y6e var14 = var1[0];
         if (this.z8 && this.k7.n5(var5)) {
            var5 = this.k7;
         }

         float var17;
         if (var1[0].n5(var5) && var1[0].u3() == '\t') {
            float[] var35 = new float[]{this.z1};
            n5(this.c4, this.z3, this.m1, this.q0, this.t4, this.m3, this.r4, var35);
            this.z1 = var35[0];
            this.t4 = this.z1;
            int[] var41 = new int[]{this.z3};
            var17 = e7k.n5(this.k5, this.z1, var41);
            this.z3 = var41[0];
            this.n5.n5(var1[0].n5()).n5(var13);
            this.q0 = this.z1 + var17;
            if (this.z3 != 0) {
               var17 = 0.0F;
            }

            var1[0] = var1[0].t2();
            this.m1 = var1[0];
            if (this.z3 != 3) {
               this.k7 = this.u3;
            } else {
               this.k7 = var1[0];

               while (this.k7.n5(this.u3) && this.k7.u3() != '\t' && (this.k7.u3() < '0' || this.k7.u3() > '9')) {
                  this.k7 = this.k7.t2();
               }

               while (this.k7.n5(this.u3) && (this.k7.u3() >= '0' && this.k7.u3() <= '9' || com.aspose.slides.internal.n2d.u9.z1(this.k7.u3()))) {
                  this.k7 = this.k7.t2();
                  if (this.k7.u3() == ',' && this.k7.n5(this.u3)) {
                     y6e var46 = this.k7.t2();
                     if (com.aspose.slides.ms.System.t9.u3(var46.u3())) {
                        this.k7 = this.k7.t2();
                     }
                  }
               }

               if (!this.k7.l6(this.u3) && this.k7.u3() != '\t') {
                  this.z8 = true;
               } else {
                  this.z3 = 2;
               }
            }
         } else if (!var4 && this.n5.z1() && var1[0].n5().n5.c8() && var1[0].n5().l6.length() > 0) {
            float var34 = this.z1;
            float var40 = 0.0F;

            for (int var44 = 0; var44 < var1[0].n5().l6.length(); var44++) {
               char var48 = var1[0].n5().l6.charAt(var44);
               float var50 = 0.0F;
               float[] var56 = new float[]{0.0F};
               var40 = this.l6.n5(com.aspose.slides.ms.System.d1.n5(var48, 1), var11, var10, var56).k5();
               var50 = var56[0];
               var34 += var40 + var50;
            }

            float var45 = com.aspose.slides.ms.System.q1.l6(var40 * 0.063F, 3.0F);
            if (var34 > this.r4 + var45) {
               var3 = true;
            }

            k8x.u3.n5(var13);
            var17 = 0.0F;
            var4 = true;
         } else {
            boolean var15 = false;
            boolean var16 = "th-TH".equals(var1[0].n5().n5.getLanguageId());
            float var18 = 0.0F;
            y6e var19 = var14;
            char var20 = var1[0].u3();
            if (var1[0].h0() == 57346) {
               var19 = var1[0];
               var1[0] = var1[0].t2();
               if (var1[0].h0() == 57346 || com.aspose.slides.internal.n2d.u9.z1(var1[0].u3())) {
                  var12 = true;
               }
            } else if ((com.aspose.slides.internal.n2d.u9.h0(var20) && !var7 || com.aspose.slides.internal.n2d.u9.c8(var20) || var16 || this.n5.z1())
               && !com.aspose.slides.internal.n2d.u9.j5(var20)) {
               short var54 = (short)var20;
               var1[0] = var1[0].t2();
               var12 = true;
               String var63 = var1[0].n5().n5.getLanguageId();
               int var71 = 0;
               Fonts$n5 var77 = null;
               Fonts$n5[] var84 = new Fonts$n5[]{var77};
               boolean var91 = !com.aspose.slides.ms.System.d1.n5(var63) && Fonts.l6.tryGetValue(var63, var84);
               var77 = var84[0];
               if (var91) {
                  var71 = var77.k5;
               }

               var15 = com.aspose.slides.internal.n2d.u9.u3((int)var1[0].u3()) == 1 || var71 == 1;
               String var27 = var1[0].s7().n5().n5.getLanguageId();
               int var28 = 0;
               Fonts$n5 var29 = null;
               Fonts$n5[] var30 = new Fonts$n5[]{var29};
               boolean var31 = !com.aspose.slides.ms.System.d1.n5(var27) && Fonts.l6.tryGetValue(var27, var30);
               var29 = var30[0];
               if (var31) {
                  var28 = var29.k5;
               }

               boolean var32 = (com.aspose.slides.internal.n2d.u9.u3((int)var1[0].s7().u3()) == 1 || var28 == 1)
                  && com.aspose.slides.ms.System.t9.x8(var1[0].u3());
               if (var15 || var32) {
                  if (com.aspose.slides.internal.n2d.u9.n5(var54, (short)var1[0].u3())) {
                     var54 = (short)var1[0].u3();
                     var1[0] = var1[0].t2();
                  }

                  if (com.aspose.slides.internal.n2d.u9.m3(var1[0].u3()) && com.aspose.slides.internal.n2d.u9.k7((char)var54)) {
                     var1[0] = var1[0].t2();
                  }

                  if (com.aspose.slides.ms.System.t9.x8(var1[0].u3())
                     && !com.aspose.slides.internal.n2d.u9.j5(var1[0].u3())
                     && this.k5.n5.getAlignment() != 1
                     && var1[0].t2().u3() != 0) {
                     var1[0] = var1[0].t2();
                  }

                  while (com.aspose.slides.ms.System.t9.t9(var1[0].u3()) && var1[0].n5().n5.getFontUnderline() != 0 && var1[0].u3() != 11) {
                     var1[0] = var1[0].t2();
                     if (!com.aspose.slides.ms.System.t9.t9(var1[0].u3())) {
                        while (
                           !com.aspose.slides.ms.System.t9.t9(var1[0].u3())
                              && com.aspose.slides.internal.n2d.u9.u3((int)var1[0].u3()) != 1
                              && var1[0].n5(this.u3)
                        ) {
                           var1[0] = var1[0].t2();
                        }
                        break;
                     }
                  }
               }
            } else if (com.aspose.slides.internal.n2d.u9.n5(var1[0].h0())) {
               while (true) {
                  if (com.aspose.slides.internal.n2d.u9.m1(var1[0].u3())) {
                     var1[0] = var1[0].t2();
                  }

                  var1[0] = var1[0].t2();
                  if (!com.aspose.slides.internal.n2d.u9.l6(var1[0].h0()) && var1[0].u3() != 8205 && !com.aspose.slides.internal.n2d.u9.k5((int)var1[0].u3())) {
                     var12 = true;
                     break;
                  }
               }
            } else if (com.aspose.slides.internal.n2d.u9.m1(var20)) {
               var1[0] = var1[0].t2();
               var1[0] = var1[0].t2();
               var12 = true;
            } else {
               var18 = 0.0F;
               c9g var21 = var1[0].n5().n5;
               float var22 = var21.h0();
               float var23 = var21.getEscapement();
               float var24 = var21.getSpacing();
               String var25 = var21.getLatinFont().getFontName();

               while (
                  var20 != 0
                        && !com.aspose.slides.internal.n2d.u9.z1(var20)
                        && var20 != '\n'
                        && var20 != 11
                        && var20 != '\t'
                        && (!com.aspose.slides.internal.n2d.u9.h0(var20) || this.j5 || var7)
                     || com.aspose.slides.internal.n2d.u9.j5(var20)
                     || com.aspose.slides.internal.n2d.u9.r4(var20)
               ) {
                  if (com.aspose.slides.internal.n2d.u9.c8(var20) || com.aspose.slides.internal.n2d.u9.t2(var20)) {
                     var1[0] = var1[0].t2();
                     break;
                  }

                  var1[0] = var1[0].t2();
                  var21 = var1[0].n5().n5;
                  if (this.z8 && var1[0].l6(this.k7) || var1[0].h0() == 57346) {
                     break;
                  }

                  if (this.k5.n5.getAlignment() == 1
                     && !com.aspose.slides.ms.System.d1.a6(var25, var21.getLatinFont().getFontName())
                     && var23 == var21.getEscapement()
                     && !com.aspose.slides.internal.n2d.u9.z1(var1[0].u3())) {
                     this.y1 = var1[0];
                     break;
                  }

                  if (var22 != var21.h0()
                     || var23 != var21.getEscapement()
                     || var24 != var21.getSpacing()
                     || !com.aspose.slides.ms.System.d1.a6(var25, var21.getLatinFont().getFontName())
                     || var9 != var1[0].k5() && var1[0].t2().u3() != 0) {
                     break;
                  }

                  if (var6 != var21.getFontBold() && var1[0].u3() != 0) {
                     k8x[] var26 = new k8x[]{var13};
                     var18 += this.l6.n5(this.k5, var19, var1[0], var11, var10, var19.n5().l6() + var19.c8(), this.n5.z1(), new i5u$1(this), var26);
                     var26[0].n5(var13);
                     var19 = var1[0];
                     var6 = var21.getFontBold();
                     var9 = var1[0].k5();
                     var10 = this.n5.n5(var1[0]);
                     var11 = var10.d2();
                  }

                  if (com.aspose.slides.internal.n2d.u9.n5(var1[0].h0())) {
                     break;
                  }

                  var20 = var1[0].u3();
               }
            }

            k8x[] var55 = new k8x[]{var13};
            var17 = var18 + this.l6.n5(this.k5, var19, var1[0], var11, var10, this.n3.n5().l6() + this.n3.c8(), this.n5.z1(), new i5u$2(this), var55);
            var55[0].n5(var13);
            if (this.n5.z1()) {
               var17 = var13.n5;
            }

            if (var15 && this.n5.u3() && this.n5.h0 != 270.0F && !v6o.n5(this.k5)) {
               var17 = this.n5.n5(var14, var14.n5()).k5() + var13.l6;
            }
         }

         y6e var36 = var1[0];
         k8x.n5(this.x8.n5(), var13.n5()).n5(this.x8);
         this.s7 += var17;
         char var42 = var1[0].u3();
         boolean var47 = var42 == '\n';
         this.h0 = var47 || var42 == 11 || var42 == 0;
         boolean var49 = var1[0].l6(this.u3) || this.h0;
         var12 = var12
            || var49
            || com.aspose.slides.internal.n2d.u9.z1(var42)
            || var42 == '\t'
            || com.aspose.slides.internal.n2d.u9.h0(var42)
            || com.aspose.slides.internal.n2d.u9.c8(var1[0].s7().u3())
            || com.aspose.slides.internal.n2d.u9.t2(var1[0].s7().u3());

         while (var1[0].n5(this.u3) && com.aspose.slides.internal.n2d.u9.z1(var1[0].u3())) {
            var1[0] = var1[0].t2();
         }

         if (var1[0].l6(this.u3)) {
            var49 = true;
         }

         var4 &= var1[0].n5().n5.c8();
         if (this.z8 && var1[0].l6(this.k7)) {
            this.m3 = this.z1 + this.s7;
            var5 = var1[0].x8();
            this.z8 = false;
         }

         float var52 = 0.0F;
         if (this.s7 > 0.0F && this.z1 + this.s7 > this.r4) {
            var36 = var36.s7();
            char var57 = var36.u3();
            var36 = var36.s7();
            y6e var64 = var36;
            var36 = var36.t2();
            var36 = var36.t2();
            float var72 = this.l6.n5(com.aspose.slides.ms.System.d1.n5(var57, 1), var11, var10).l6();
            if (var72 == 0.0F) {
               var72 = this.l6.n5(com.aspose.slides.ms.System.d1.n5(var64.u3(), 1), var11, var10).l6();
            }

            if (var64.k5() == 1 && com.aspose.slides.internal.n2d.u9.r4(var57) && com.aspose.slides.ms.System.t9.u9(var64.u3()) && !var7) {
               var52 = var72 * 0.9F;
            }

            if (this.z1 == 0.0F
               && var1[0].h0() == 0
               && com.aspose.slides.ms.System.t9.u9(var57)
               && this.r4 + this.n5.n5.getTextFrameFormat().getMarginLeft() + this.n5.n5.getTextFrameFormat().getMarginRight() - this.s7 > 0.0) {
               var52 = var72 * 0.1F;
            }

            boolean var79 = com.aspose.slides.internal.n2d.u9.u3((int)var57) == 1;
            boolean var85 = com.aspose.slides.internal.n2d.u9.u3((int)var57) == 2;
            if (var79 || var85 || var10.e2() == 2 && com.aspose.slides.ms.System.q1.n5(var10.q0()) < 0.005) {
               if (!var85 || var11.c8() == -78 || var8 && !(this.k5.n5.getIndent() < 0.0F)) {
                  if (!var85 && !var79) {
                     float var92 = var49
                        ? 1.0F
                        : (float)com.aspose.slides.ms.System.q1.k5(((TextFrameFormat)this.n5.n5.getTextFrameFormat()).getEffective().getMarginRight(), 1.0);
                     var52 = com.aspose.slides.ms.System.q1.l6(this.x8.n5 * 0.098F, 3.0F) * var92;
                  } else if (var79 && com.aspose.slides.internal.n2d.u9.z1(var57)) {
                     var52 = var72;
                  }
               } else {
                  var52 = var72 * 0.3F;
                  if (var52 > 4.5F) {
                     var52 = com.aspose.slides.ms.System.q1.l6(1.5F + (var52 - 3.0F) / 2.0F, 4.5F);
                  }

                  if (com.aspose.slides.ms.System.t9.l6(var57) == 6) {
                     var52 = var72;
                  }
               }
            }
         }

         if (this.z1 + this.s7 > this.r4 + var52 + 1.0E-4) {
            this.h0 = false;
            if (this.n3.l6(this.y4)) {
               if (var1[0].h0() == 0 && var1[0].s7().h0() == 57346) {
                  y6e var60 = var1[0].s7();
                  r1f var67 = var60.a6();
                  if (var67.k5()) {
                     var60.u9();
                     var67 = var60.a6();
                     this.x8 = new k8x();
                     this.x8.l6 = var67.u3.l6().l6.l6;
                     this.x8.n5 = var67.u3.l6().l6.n5();
                     k8x.n5(this.t2.n5(), this.x8.n5()).n5(this.t2);
                     y6e var74 = var60.t2();
                     var1[0] = var74;
                     this.e2 = var74;
                     this.y4 = var74;
                     var3 = true;
                     var12 = false;
                  }
               } else {
                  float var59 = this.s7 - var17;
                  y6e var66 = this.n5(var14, var36, var9, this.r4 - this.z1 - var59, this.r4 - this.t9 - this.q0, var59);
                  if (var66 == this.u3 && com.aspose.slides.internal.n2d.u9.k5(var66.s7().u3())) {
                     var12 = true;
                  } else {
                     if (this.n3.l6(var66)) {
                        var66 = var66.t2();
                     }

                     var1[0] = var66;
                     this.e2 = var66;
                     this.y4 = var66;
                     this.t9 = this.t9 + (this.s7 - var17 + this.n5(var14, var66, var11, var10));
                     k8x.n5(this.t2.n5(), this.x8.n5()).n5(this.t2);
                     k8x.u3.n5(this.x8);
                     var3 = true;
                     var12 = false;
                     this.s7 = 0.0F;
                     var2[0] = true;
                  }
               }
            } else {
               boolean var58 = false;
               String var65 = var1[0].s7().n5().n5.getLanguageId();
               int var73 = 0;
               Fonts$n5 var80 = null;
               Fonts$n5[] var86 = new Fonts$n5[]{var80};
               boolean var93 = !com.aspose.slides.ms.System.d1.n5(var65) && Fonts.l6.tryGetValue(var65, var86);
               var80 = var86[0];
               if (var93) {
                  var73 = var80.k5;
               }

               boolean var96 = com.aspose.slides.internal.n2d.u9.u3((int)var1[0].s7().u3()) == 1 && var73 == 1;
               boolean var99 = var96 && !this.j5
                  || !v6o.n5(this.k5) && this.w1 && !var10.s7() && com.aspose.slides.ms.System.q1.n5(var10.q0()) < 0.005 && this.k5.n5.getAlignment() != 1;
               if (var99) {
                  y6e var102 = var1[0].s7();

                  while (com.aspose.slides.internal.n2d.u9.z1(var102.u3()) && !var102.l6(this.a6)) {
                     var102 = var102.s7();
                  }

                  if (com.aspose.slides.internal.n2d.u9.k5(var102.u3()) && (!com.aspose.slides.ms.System.t9.e2(var102.s7().u3()) || var9 != var102.s7().k5())) {
                     while (com.aspose.slides.internal.n2d.u9.k5(var102.u3()) && !var102.l6(this.a6)) {
                        var102 = var102.s7();
                     }

                     var42 = var102.u3();
                     if (!com.aspose.slides.internal.n2d.u9.k5(var42)) {
                        if (!var96 && com.aspose.slides.internal.n2d.u9.u3((int)var102.s7().u3()) != 1) {
                           var102 = var102.t2();
                           if (com.aspose.slides.internal.n2d.u9.u3((int)var1[0].u3()) != 1) {
                              var58 = this.z1 + this.s7 - this.n5(var102, var102.t2(), var11, var10) <= this.r4
                                 && (this.n3.t2().n5(var102) || this.n3.t2().l6(var102));
                              var12 = true;
                           }
                        } else if (com.aspose.slides.ms.System.t9.u9(var42)
                           || com.aspose.slides.ms.System.t9.t9(var42)
                           || (!com.aspose.slides.ms.System.t9.x8(var42) || com.aspose.slides.internal.n2d.u9.s3(var42))
                              && !com.aspose.slides.internal.n2d.u9.a6(var102.t2().u3())) {
                           var102 = var102.t2();
                           if (this.r4 > this.s7 * 2.0F || (this.r4 - this.z1) / this.z1 > 0.2F) {
                              var58 = this.z1 + this.s7 - this.n5(var102, var102.t2(), var11, var10) <= this.r4
                                 && (this.n3.t2().n5(var102) || this.n3.t2().l6(var102));
                              var12 = true;
                           }
                        } else if (var102.n5().n5.getEscapement() == 0.0F) {
                           this.e2 = var102;
                        }
                     }
                  }
               }

               if (!var58) {
                  y6e var105 = var1[0].s7().s7();
                  if (!com.aspose.slides.internal.n2d.u9.j5(var105.u3())) {
                     if (var1[0].u3() == 11 && var1[0].l6(this.e2)) {
                        this.h0 = true;
                     }
                  } else {
                     while (com.aspose.slides.internal.n2d.u9.j5(var105.u3())) {
                        var105 = var105.s7();
                     }

                     var105 = var105.t2();
                     if (this.n3.n5(var105)) {
                        this.e2 = var105;
                        this.t9 = this.t9 - this.n5(var105, var105.t2(), var11, var10);
                     }
                  }

                  y6e var107 = var1[0].s7();
                  if (var96 && var107.l6(this.e2) && com.aspose.slides.internal.n2d.u9.r4(var107.u3()) && this.a6.n5(var107)) {
                     y6e var108 = var107.s7();

                     while (com.aspose.slides.internal.n2d.u9.z1(var108.u3()) && this.a6.n5(var108)) {
                        var108 = var108.s7();
                     }

                     if (var108.n5().n5.getEscapement() == 0.0F) {
                        this.e2 = var108;
                     }
                  }

                  if (com.aspose.slides.internal.n2d.u9.n5(var105.h0())) {
                     y6e var109 = var105;

                     while (com.aspose.slides.internal.n2d.u9.n5(var109.h0()) && this.a6.n5(var109)) {
                        do {
                           var109 = var109.s7();
                           if (com.aspose.slides.ms.System.t9.t2(var109.u3())) {
                              var109 = var109.s7();
                           }
                        } while (
                           com.aspose.slides.internal.n2d.u9.l6(var109.h0()) || var109.u3() == 8205 || com.aspose.slides.internal.n2d.u9.k5((int)var109.u3())
                        );
                     }

                     if (this.n3.n5(var109)) {
                        this.e2 = var109.t2();
                     }
                  }

                  var3 = true;
                  var1[0] = this.e2;
                  var5 = var1[0].x8();
                  this.s7 = 0.0F;
                  var12 = false;
               }
            }
         }

         if (var12) {
            k8x.n5(this.t2.n5(), this.x8.n5()).n5(this.t2);
            k8x.u3.n5(this.x8);
            TextParam var61 = this.n5.n5(var36.n5(), var36.k5(), var36.u3());
            float var69 = this.s7 + this.n5(var36, var1[0], var11, var61);
            if (var1[0].h0() == 57346 && var1[0].a6() != null) {
               var69 = this.s7 + var1[0].a6().k5;
            }

            if (this.u9 && this.n3.l6(this.y4) && var14.l6(var36)) {
               this.n3 = var1[0];
               k8x.u3.n5(this.t2);
               this.z1 = this.k5.n5.getMarginLeft();
            } else {
               if (var14.n5(var36)) {
                  this.t9 = this.z1 + this.s7;
               }

               String var75 = var1[0].n5().n5.getLanguageId();
               int var82 = 0;
               Fonts$n5 var87 = null;
               Fonts$n5[] var94 = new Fonts$n5[]{var87};
               boolean var97 = !com.aspose.slides.ms.System.d1.n5(var75) && Fonts.l6.tryGetValue(var75, var94);
               var87 = var94[0];
               if (var97) {
                  var82 = var87.k5;
               }

               if (this.n5.z1() && var82 != 1) {
                  this.z1 = this.z1 + (this.t2.n5 + var13.l6);
               } else {
                  this.z1 += var69;
               }
            }

            this.e2 = var1[0];
            this.s7 = 0.0F;
            this.y4 = var36;
            if (var49) {
               var3 = true;
            }
         }

         if (var3) {
            float[] var62 = new float[]{this.t9};
            n5(this.c4, this.z3, this.m1, this.q0, this.t4, this.m3, this.r4, var62);
            this.t9 = var62[0];
            float var70 = this.t9;
            if (!this.n5.s7()) {
               var70 = com.aspose.slides.ms.System.q1.n5(var70, this.z1);
            }

            m7f[] var76 = null;
            if (this.c4.size() > 0) {
               var76 = this.c4.toArray(new m7f[0]);
               this.c4.clear();
            }

            for (y6e var83 = var1[0]; !var83.l6(this.n3) && com.aspose.slides.internal.n2d.u9.z1(var83.s7().u3()); k8x.n5(this.t2.n5(), var13.n5()).n5(this.t2)) {
               var83 = var83.s7();
               byte var89 = var83.k5();
               TextParam var95 = this.n5.n5(var83.n5(), var89, var83.u3());
               e4z var98 = var95.d2();
               k8x[] var100 = new k8x[]{var13};
               float var106 = this.l6.n5(this.k5, var83, var83.t2(), var98, var95, this.n3.n5().l6() + this.n3.c8(), this.n5.z1(), new i5u$3(this), var100);
               var100[0].n5(var13);
               if (this.y1 != null && this.y1.n5(var1[0])) {
                  var70 -= var106;
                  this.y1 = null;
               }
            }

            r4d var90 = new r4d(this.k5, this.n3, var1[0], var70, var70, this.t2.n5(), var76, this.c8);
            this.c8 = var47;
            this.y1 = null;
            this.y2.addItem(var90);
            k8x.u3.n5(this.t2);
            this.y4 = var1[0];
            this.n3 = var1[0];
            this.s7 = 0.0F;
            this.t9 = this.z1 = this.k5.n5.getMarginLeft();
            this.u9 = this.n5.s7() && !this.h0;
            var3 = false;
            this.z3 = 0;
            this.m1 = this.n3;
            this.q0 = 0.0F;
         }
      } while (var1[0].n5(var5));
   }

   private y6e n5(y6e var1, y6e var2, byte var3, float var4, float var5, float var6) {
      if (var6 < 0.01F && var4 + 0.01F < var5) {
         return var1;
      }

      m4i var7 = var1.n5();
      boolean var8 = this.k5.n5.getHangingPunctuation();
      boolean var9 = this.k5.n5.getEastAsianLineBreak();
      y6e var10 = var1;
      y6e var11 = var10;
      boolean var12 = false;
      if (var10.n5(var2) && var10.u3() == '\t') {
         var11 = var10;
         var10 = var10.t2();
      }

      TextParam var13 = this.n5.n5(var10);
      e4z var14 = var13.d2();
      float var15 = 0.0F;
      float var16 = 0.0F;
      boolean var17 = var13.t2();
      float var18 = 0.0F;

      while (true) {
         float var20;
         boolean var24;
         label66: {
            while (var10.n5(var2)) {
               if (var17 == var10.n5().n5.getFontBold()) {
                  String var19 = com.aspose.slides.ms.System.d1.n5(var10.u3(), 1);
                  if (com.aspose.slides.ms.System.t9.a6(var10.u3())) {
                     var19 = com.aspose.slides.ms.System.d1.n5(new char[]{var10.u3(), var10.t2().u3()});
                     var10 = var10.t2().t2();
                  }

                  if (var7.n5.getTextCapType() == 2) {
                     var19 = com.aspose.slides.ms.System.d1.t2(var19);
                  }

                  var20 = this.l6.n5(var19, var13).l6();
                  k8x var21 = new k8x();
                  y6e var22 = var10;
                  var22 = var22.t2();
                  k8x[] var23 = new k8x[]{var21};
                  var18 = var15 + this.n5(var1, var22, var14, var13, var23);
                  var23[0].n5(var21);
                  var24 = var8 && com.aspose.slides.internal.n2d.u9.k5(var10.u3());
                  if (!(var4 - var18 < 0.0F)) {
                     break label66;
                  }

                  if (var24) {
                     if (var12 || var3 == 1 && var16 + var20 > var4 && var20 <= this.n5.l6 && !var9) {
                        return var11;
                     }
                     break label66;
                  }
                  break;
               }

               var17 = var10.n5().n5.getFontBold();
               var13 = this.n5.n5(var10);
               var14 = var13.d2();
               var15 = var18;
               var1 = var10;
            }

            return var10;
         }

         var12 = var24;
         var16 = var20;
         var11 = var10;
         var10 = var10.t2();
      }
   }

   private float n5(y6e var1, y6e var2, e4z var3, TextParam var4) {
      k8x var5 = new k8x();
      k8x[] var6 = new k8x[]{var5};
      float var7 = this.l6.n5(this.k5, var1, var2, var3, var4, Integer.MIN_VALUE, this.n5.z1(), new i5u$4(this), var6);
      var6[0].n5(var5);
      return var7;
   }

   private float n5(y6e var1, y6e var2, e4z var3, TextParam var4, k8x[] var5) {
      return this.l6.n5(this.k5, var1, var2, var3, var4, Integer.MIN_VALUE, this.n5.z1(), new i5u$5(this), var5);
   }

   private static void n5(List<m7f> var0, int var1, y6e var2, float var3, float var4, float var5, float var6, float[] var7) {
      if (var1 != 0) {
         float var8 = var4;
         switch (var1) {
            case 1:
               var8 = var3 - (var7[0] - var4) / 2.0F;
               if (var8 + (var7[0] - var4) > var6) {
                  var8 = var6 - (var7[0] - var4);
               }
               break;
            case 2:
               var8 = var3 - (var7[0] - var4);
               break;
            case 3:
               var8 = var3 - (var5 - var4);
               if (var8 + (var7[0] - var4) > var6) {
                  var8 = var6 - (var7[0] - var4);
               }
         }

         if (var8 < var4) {
            var8 = var4;
         }

         var0.addItem(new m7f(var2, var8));
         var7[0] += var8 - var4;
      }
   }

   // $VF: synthetic method
   static j5u n5(i5u var0) {
      return var0.n5;
   }
}
