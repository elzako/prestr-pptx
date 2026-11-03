package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.Queue;
import com.aspose.slides.Collections.ObjectModel.ReadOnlyCollection;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.ms.System.IDisposable;

final class j5u {
   public final TextFrame n5;
   private final e2n[] s7;
   private r4d[] x8;
   private r4d[] n3;
   public final float l6;
   private final float y4;
   private float e2;
   private float t9;
   private float z1;
   private float t4;
   private float q0 = 1.0F;
   private d2k z3 = new d2k();
   private final byte m1;
   private boolean k7;
   private final int m3;
   private final float z8;
   private IFontSchemeEffectiveData j5;
   public final LoadOptions k5;
   public final ISaveOptions u3;
   private final int[] w1;
   private final ShapeFrame r4;
   private final d2k c4 = new d2k();
   public final BaseSlide a6;
   private final boolean y2;
   public final boolean u9;
   public float h0;
   private final float y1;
   private final boolean a0;
   private final byte d2;
   private boolean d5;
   private final e7k s3;
   private final w7c p8;
   private static boolean f2;
   private com.aspose.slides.ms.System.o5<Boolean> i1 = new com.aspose.slides.ms.System.o5<>();
   static final char[] c8 = new char[]{'\n'};
   static final String[] t2 = new String[]{"+mn-lt", "+mn-ea", "+mn-cs", "+mn-lt", "+mn-ea", "+mn-cs", "+mj-lt", "+mj-ea", "+mj-cs"};
   private static final char[] e5 = new char[]{
      '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '!', ',', ';', '$', '%', '^', '-', '–', '+', '?', '\\', '@', '#', '%', '(', ')', '/', '|', ':', '.'
   };
   private static final float[] b3 = new float[]{1.0F, 1.0F};
   private static final float[] o0 = new float[]{0.5F, 0.5F};
   private static final float[] z7 = new float[]{3.0F, 2.0F};
   private static final float[] v4 = new float[]{1.5F, 1.0F};
   private static final float[] u6 = new float[]{8.0F, 4.0F};
   private static final float[] t1 = new float[]{4.0F, 2.0F};
   private static final float[] a5 = new float[]{1.0F, 2.0F, 3.0F, 2.0F};
   private static final float[] h2 = new float[]{0.5F, 1.0F, 1.5F, 1.0F};
   private static final float[] v0 = new float[]{1.0F, 2.0F, 1.0F, 2.0F, 3.0F, 2.0F};
   private static final float[] f0 = new float[]{0.5F, 1.0F, 0.5F, 1.0F, 1.5F, 1.0F};
   private static final float[] a3 = new float[]{0.0F, 0.333333F, 0.666667F, 1.0F};
   private static final float[] p3 = new float[]{0.0F, 0.1F, 0.9F, 1.0F};
   private static final float[] x9 = new float[]{0.0F, 0.333333F, 0.666667F, 1.0F};
   private final Dictionary<com.aspose.slides.internal.e1x.i1, f7x> y0 = new Dictionary<>();
   private static final com.aspose.slides.internal.v6g.u9 j9 = new com.aspose.slides.internal.v6g.u9("+mn-lt", "+mn-ea", "+mn-cs", "+mj-lt", "+mj-ea", "+mj-cs");

   j5u(TextFrame var1, d2k var2, IBaseSlide var3, e7k var4, e2n[] var5) {
      this.n5 = var1;
      this.s3 = var4;
      this.s7 = var5;
      h9z var6 = this.n5.s7().d2();
      this.q0 = var6.getAutofitType() == 1 ? var6.h0() : 1.0F;
      this.y1 = var6.getAutofitType() == 1 ? var6.c8() : 0.0F;
      var2.n5(this.c4);
      this.e2 = var2.l6;
      this.y4 = var2.n5;
      this.m3 = var6.getColumnCount();
      this.w1 = new int[this.m3];
      this.w1[0] = 0;
      this.z8 = var6.getColumnSpacing();
      this.l6 = (var2.n5 - this.z8 * (this.m3 - 1)) / this.m3;
      this.y2 = var6.getWrapText() || this.m3 > 1;
      this.d2 = var6.s7();
      this.u9 = var6.u9().l6();
      IThemeEffectiveData var7 = var3.createThemeEffective();
      if (var7 != null) {
         this.j5 = var7.getFontScheme();
      }

      this.r4 = new ShapeFrame(0.0F, 0.0F, var2.n5, var2.l6, (byte)0, (byte)0, 0.0F);
      this.a6 = (BaseSlide)var3;
      this.k5 = ((Presentation)var3.getPresentation()).a6();
      this.u3 = ((Presentation)var3.getPresentation()).u9();
      this.p8 = new w7c(this.a6, this.k5, this.n5, this.c4.u3());
      AutoShape var8 = com.aspose.slides.internal.v6g.k5.n5(this.n5.k5(), AutoShape.class);
      if (var8 != null) {
         this.h0 = var8.getRotation();
      }

      this.m1 = var6.getAnchoringType();
      this.n5();
      this.n5(var2.l6, this.y1);
      this.a0 = TextFrame.l6(var1);
      if (this.a0) {
         com.aspose.slides.internal.o9b.l6 var9 = new com.aspose.slides.internal.o9b.l6(1, 1);

         try {
            r1c var10 = new r1c(var9, 1.0F, 1.0F);
            this.n5(var10, null, (n6p)this.n5.u3);
         } finally {
            if (var9 != null) {
               var9.dispose();
            }
         }
      }
   }

   final void n5(float var1, float var2) {
      ITextFrameFormatEffectiveData var3 = this.n5.getTextFrameFormat().getEffective();
      h9z var4 = this.n5.s7().d2();
      float var5 = 0.0F;
      this.z3.l6 = 0.0F;
      this.t9 = 0.0F;
      e2n var6 = null;

      for (int var7 = 0; var7 < this.x8.length; var7++) {
         r4d var8 = this.x8[var7];
         e2n var9 = var8.l6;
         float var10 = n5(var9.n5.h0(), var2, var8.a6());
         if (var8.k5.a6() == null || this.q0 < 1.0F) {
            if (var10 != 0.0F && var8.a6() != 0.0F) {
               var8.k5(var8.u9 * var10 / var8.a6());
               var8.u3(var7 == this.x8.length - 1 ? var8.h0.l6 : var8.h0.l6 * var10 / var8.a6());
               if (var7 == 0 && var9.n5.h0() > 100.0F) {
                  this.z3.l6 = this.z3.l6 - var8.h0.k5 * var10 / var8.a6();
               }

               if (com.aspose.slides.internal.v6g.k5.l6(this.n5.k5(), Cell.class) && this.e2().length == 1 && var8.h0.k5 == 0.0F && var10 != var8.a6()) {
                  var8.k5(var8.n3() * 0.96F);
               }
            } else {
               var8.k5((var10 * 0.888F + var8.a6() * 0.112F) * var8.u9());
               var8.u3(var10 - var8.n3());
            }
         }

         var5 += var8.n3();
         if (var6 == null && var4.t2() || var6 != null && var9 != var6) {
            float var11 = 0.0F;
            if (var9.n5.getSpaceBefore() != 0.0F && var8.k5.a6() == null) {
               var11 = a6((float)com.aspose.slides.ms.System.q1.u3(var9.n5.getSpaceBefore()), var8.a6());
               var8.k5(var8.n3() + var11);
            }

            float var12 = 0.0F;
            if (var6 != null && var6.n5.getSpaceAfter() != 0.0F) {
               var12 = a6((float)com.aspose.slides.ms.System.q1.u3(var6.n5.getSpaceAfter()), this.x8[var7 - 1].a6());
               this.x8[var7 - 1].u3(this.x8[var7 - 1].y4() + var12);
            }

            var5 += var12 + var11;
         }

         var8.n5(var5);
         var5 += var8.y4();
         var6 = var9;
         this.t9 = com.aspose.slides.ms.System.q1.n5((float)(this.t9), (float)(var8.k5()));
      }

      boolean var25 = true;
      boolean var26 = false;
      boolean var27 = false;
      boolean var28 = false;
      int var29 = -1;

      for (int var30 = 0; var30 < this.x8.length; var30++) {
         int var13 = this.x8[var30].l6.n5.getAlignment();
         if (var25 && var29 != -1 && var13 != var29) {
            var25 = false;
         }

         var26 |= var13 == 0 || var13 == 3 || var13 == 4;
         var27 |= var13 == 2;
         var28 |= var13 == 1;
         var29 = var13;
      }

      boolean var31 = var25 && var29 == 1;
      this.k7 = !var25 && (!var26 || var27) && (var26 || !var27) ? false : var3.getCenterText();
      boolean var32 = this.k7 && var25 && !var31;
      if (!var32 && var29 == 5 && this.n5.getText().length() == 1) {
         var32 = true;
      }

      this.z1 = var32 ? this.t9 : this.l6;

      for (int var14 = 0; var14 < this.x8.length; var14++) {
         r4d var15 = this.x8[var14];
         e2n var16 = var15.l6;
         float var17 = 0.0F;
         switch (var16.n5.getAlignment()) {
            case -1:
            case 0:
               var17 = this.x8() > 0.0F ? 0.0F : -((float)var3.getMarginLeft());
               if (this.z1 < 0.0F && var17 < this.z1) {
                  var17 -= this.z1 - 3.6F;
               }
               break;
            case 1:
               var17 = (this.z1 - var16.n5.getMarginRight() - (var31 ? var15.u3() : var15.k5())) / 2.0F;
               break;
            case 2:
               var17 = this.k7 && this.n5.getParentCell() != null ? 0.0F : this.z1 - var16.n5.getMarginRight() - var15.k5();
         }

         var15.l6(var17);
      }

      this.e2 = var1;
      boolean var33 = false;
      if (this.x8.length > 0 && this.m3 > 1) {
         r4d var34 = this.x8[this.x8.length - 1];
         float var38 = var34.l6() - this.x8[0].n5();
         float var42 = var38 / this.m3;
         if (var42 < this.e2) {
            var42 = this.e2;
         }

         do {
            int var18 = 0;
            float var19 = Float.MAX_VALUE;

            for (int var20 = 0; var20 < this.m3; var20++) {
               this.w1[var20] = var18;
               if (var18 < this.x8.length) {
                  r4d var21 = this.x8[var18];
                  float var22 = var21.n5();

                  while (var18 < this.x8.length) {
                     var21 = this.x8[var18];
                     float var23 = var21.l6() - var22 - var42;
                     if (var23 >= 0.1F) {
                        var19 = com.aspose.slides.ms.System.q1.l6(var19, var23);
                        break;
                     }

                     var18++;
                  }
               }
            }

            if (var18 < this.x8.length && var19 > 0.1F) {
               var42 += var19;
            } else {
               var33 = true;
            }
         } while (!var33);
      }

      this.t4 = 0.0F;

      for (int var35 = 0; var35 < this.m3; var35++) {
         int var39 = this.w1[var35];
         int var43 = var35 < this.m3 - 1 ? this.w1[var35 + 1] : this.x8.length;
         if (var39 < var43) {
            float var45 = this.x8[var43 - 1].l6() - this.x8[var39].n5();
            this.t4 = com.aspose.slides.ms.System.q1.n5((float)(this.t4), (float)(var45));
         }
      }

      switch (this.m1) {
         case 1:
            this.z3.l6 = this.z3.l6 + (this.e2 - this.t4) / 2.0F;
            break;
         case 2:
            this.z3.l6 = this.z3.l6 + (this.e2 - this.t4);
      }

      if (this.m3 < 2 && this.x8.length > 0) {
         if (var32) {
            this.z3.n5 = (this.y4 - this.t9) / 2.0F;
         } else if (this.k7 && !var25) {
            float var36 = 0.0F;

            for (r4d var47 : this.x8) {
               var36 = com.aspose.slides.ms.System.q1.n5((float)(var36), (float)(var47.u3()));
            }

            if (!var27) {
               this.z3.n5 = (this.y4 - var36) / 4.0F;
            } else if (!var26) {
               this.z3.n5 = -(this.y4 - var36) / 4.0F;
            }
         }
      }

      this.n3 = this.x8;
      if (this.d2 == 2 && this.x8.length > 1) {
         List var37 = new List();
         var37.addItem(this.x8[0]);

         for (int var41 = 1; var41 < this.x8.length && !(this.x8[var41].l6() > this.e2); var41++) {
            var37.addItem(this.x8[var41]);
         }

         this.x8 = (r4d[])var37.toArray(new r4d[0]);
      }
   }

   final void n5() {
      List var1 = new List();
      List var2 = new List();
      this.d5 = false;

      for (e2n var6 : this.s7) {
         t4r var7 = t4r.n5(var6);
         y6e var8 = var7.n3();
         y6e var9 = var7;
         float var10 = this.n5(var6, var7.n5());
         i5u var11 = new i5u(this, this.s3, var6, var7, var8, var2, var1, var10);

         do {
            y6e[] var12 = new y6e[]{var9};
            boolean[] var13 = new boolean[]{this.d5};
            var11.n5(var12, var13);
            var9 = var12[0];
            this.d5 = var13[0];
         } while (var9.n5(var8));
      }

      this.x8 = (r4d[])var1.toArray(new r4d[0]);
   }

   final void l6(float var1, float var2) {
      this.q0 = var1;
      this.n5();
      this.n5(this.e2, var2);
   }

   private float n5(e2n var1, m4i var2) {
      if (v6o.n5(var1) && this.u9) {
         FontData var3 = null;
         if (var1.n5.k5.isBulletHardFont()) {
            var3 = (FontData)var1.n5.getBullet().getFont();
         }

         TextParam$FontArgs var4 = new TextParam$FontArgs();
         var4.Height = u3(var2.n5.h0(), this.q0);
         if (var3 == null) {
            var3 = n5(var2, var2.l6);
            var4.Name = var3.getFontName();
         } else {
            var4.Name = n5(var3, this.j5);
         }

         var4.set(var2.n5, this.k5.getDefaultRegularFont());
         t3x var5 = var1.n5;
         IBulletFormatEffectiveData var6 = var5.getBullet();
         if (com.aspose.slides.ms.System.n1.k5(var6.getHeight())) {
            var4.Height = Float.NaN;
         }

         if (!com.aspose.slides.ms.System.n1.k5(var1.n5.getBullet().getHeight())) {
            if (var1.n5.getBullet().getHeight() < 0.0F) {
               var4.Height = -var1.n5.getBullet().getHeight();
            } else {
               var4.Height = var4.Height * var1.n5.getBullet().getHeight() / 100.0F + 0.5F;
            }
         }

         TextParam var7 = new TextParam(
            var2.k5,
            var2.n5,
            var4.Clone(),
            var3.n5(),
            var3.l6(),
            var3.k5(),
            this.k5.getDefaultRegularFont(),
            this.c4.u3(),
            this.a6,
            null,
            this.n5.getTextFrameFormat().getEffective().getTextVerticalType()
         );
         if (var6.getType() == 3) {
            IPPImage var11 = var6.getFillFormat().getPictureFillFormat().getPicture().getImage();
            if (var11 != null) {
               float var12 = var7.u3(96.0F) * 0.7F;
               float var10 = (float)var11.getWidth() / var11.getHeight() * var12;
               return p2.n5(var1, var10);
            } else {
               return p2.n5(var1, 0.0F);
            }
         } else {
            if (var6.getType() == 2 && var5.getMarginLeft() != 0.0F) {
               return var5.getMarginLeft();
            }

            String var8 = var1.a6();
            if (var5.getRightToLeft()) {
               String[] var9 = new String[]{var8};
               com.aspose.slides.internal.n2d.u9.n5(var9);
               var8 = var9[0];
            }

            return p2.n5(var1, this.s3.n5(var8, var7, false).l6()) + 0.05F * var5.getDepth();
         }
      } else {
         return p2.n5(var1);
      }
   }

   final void n5(e3 var1, s5u var2, n6p var3) {
      e2n var4 = null;
      int var5 = 0;
      int var6 = 0;
      boolean var7 = false;
      boolean var8 = false;
      a1v var9 = this.q0();

      for (int var10 = 0; var10 < this.m3; var10++) {
         int var11 = var10 + 1 < this.w1.length ? this.w1[var10 + 1] : this.x8.length;
         d2k var12 = this.n5(var10, var11).u3();

         for (int var13 = this.w1[var10]; var13 < var11; var13++) {
            r4d var14 = this.x8[var13];
            boolean var15 = var13 == this.x8.length - 1 || var14.l6 != this.x8[var13 + 1].l6;
            e2n var16 = var14.l6;
            boolean var17 = var3.n5((IParagraph)var16.l6);
            if (var16 == var4 && var14.k5.s7().u3() == 11) {
               var1.z8();
               if (var14.u3.l6(var14.k5)) {
                  var1.j5();
               }
            }

            if (var4 != var16 && var14.k5.n5(var14.u3) && var4 != null) {
               var1.m3();
            }

            int[] var18 = new int[]{var5};
            int[] var19 = new int[]{var6};
            boolean[] var20 = new boolean[]{var7};
            boolean[] var21 = new boolean[]{var8};
            this.n5(var1, var2, var14, var17, var12.u3(), var15, var18, var9, var19, var20, var21);
            var5 = var18[0];
            var6 = var19[0];
            var7 = var20[0];
            var8 = var21[0];
            var4 = var16;
         }
      }

      while (var6-- > 0) {
         var1.u9();
         var1.u9();
         var1.u9();
      }

      if (var7) {
         var1.u9();
      }
   }

   final List<i2k> l6() {
      List var1 = new List();

      for (int var2 = 0; var2 < this.m3; var2++) {
         int var3 = var2 + 1 < this.w1.length ? this.w1[var2 + 1] : this.x8.length;
         d2k var4 = this.n5(var2, var3).u3();

         for (int var5 = this.w1[var2]; var5 < var3; var5++) {
            r4d var6 = this.x8[var5];
            boolean var7 = var5 == this.x8.length - 1 || var6.l6 != this.x8[var5 + 1].l6;
            var1.addRange(this.n5(var6, var4.u3(), var7));
         }
      }

      return var1;
   }

   private a1v q0() {
      r0s var1 = new r0s(0.0F, 0.6F, 0.6F);
      if (this.a6 != null) {
         var1 = this.a6.n5(10).t2();
      }

      return new a1v(var1.n5().o8());
   }

   final k8x n5(m4i var1) {
      c9g var2 = var1.n5;
      FontData var3 = n5(var1, var1.l6);
      TextParam$FontArgs var4 = new TextParam$FontArgs();
      var4.Name = var3.getFontName();
      var4.Height = u3(var2.h0(), this.q0);
      LoadOptions var5 = this.k5;
      var4.set(var2, var5.getDefaultRegularFont());
      e4z var6 = new TextParam(
            var1.k5,
            var2,
            var4.Clone(),
            var3.n5(),
            var3.l6(),
            var3.k5(),
            var5.getDefaultRegularFont(),
            this.c4.u3(),
            this.a6,
            null,
            this.n5.getTextFrameFormat().getEffective().getTextVerticalType()
         )
         .d2();
      return e7k.n5(var6);
   }

   private void n5(e3 var1, s5u var2, r4d var3, boolean var4, d2k var5, boolean var6, int[] var7, a1v var8, int[] var9, boolean[] var10, boolean[] var11) {
      TextParam var12 = null;
      byte var13 = 0;
      e2n var14 = var3.l6;
      t3x var15 = var14.n5;
      boolean var16 = var15.getRightToLeft();
      y6e var17 = var3.k5;
      y6e var18 = var3.u3;
      c9g var19;
      if (var17.n5().k5 != null) {
         var19 = var17.n5().k5.l6().r4();
      } else {
         var19 = var17.n5().n5;
      }

      Slide var20 = var2 != null && var2.u3() != this.a6 ? com.aspose.slides.internal.v6g.k5.n5(var2.u3(), Slide.class) : null;
      if (y0k.n5(var20, this.a6)) {
         var19.n5(var20, w6a.n5);
      }

      float var21 = 0.0F;
      byte var22 = 0;
      y6e var23 = var17;
      float var24 = var15.getMarginLeft();
      float var25 = 0.0F;
      boolean var26 = false;
      boolean var27 = var1.m1() != null && var1.m1().a5();
      if (var3.c8()) {
         var24 = p2.n5(var14);
         if (this.u9 && v6o.n5(var14)) {
            if (var10[0] && !var11[0]) {
               var1.u9();
            }

            if (!var27) {
               if (var9[0] < var15.getDepth() + 1) {
                  var1.n5("List");
                  var9[0]++;
               } else {
                  if (var11[0]) {
                     var1.u9();
                     var1.u9();
                  }

                  while (var9[0] != 0 && var9[0] > var15.getDepth() + 1) {
                     var1.u9();
                     var1.u9();
                     var1.u9();
                     var9[0]--;
                  }
               }

               var26 = var1.n5("ListItem");
               var1.n5("ListLabel");
            }

            m4i var28 = var23.n5();
            c9g var29 = var28.n5;
            MathPortion var30 = com.aspose.slides.internal.v6g.k5.n5(var28.k5, MathPortion.class);
            if (var30 != null) {
               IPortionFormat var31 = this.n5(var30.getMathParagraph());
               if (var31 != null) {
                  var29 = (c9g)var31.getEffective();
               }
            }

            if (var15.getBullet().getType() == 3) {
               try {
                  com.aspose.slides.internal.o9b.f2 var90 = this.n5(var29, var14.n5).a6();
                  float var32 = var5.n5 + this.z3.n5 + var3.x8() + p2.n5(var14.n5);
                  if (var16) {
                     var32 = var3.x8() + var3.k5() - (var32 - var3.x8()) - var90.l6();
                     if (var15.getAlignment() == 3 || var15.getAlignment() == 4) {
                        var32 += this.z1 - var3.k5();
                     }
                  }

                  PPImage var33 = (PPImage)var15.getBullet().getFillFormat().getPictureFillFormat().getPicture().getImage();
                  if (var33 != null && var4) {
                     var1.n5(var33, new com.aspose.slides.internal.o9b.y1(var32, var5.l6 + this.z3.l6 + var3.s7() - var90.k5(), var90.l6(), var90.k5()), null);
                  }

                  var24 = p2.n5(var14, var90.l6());
               } catch (RuntimeException var83) {
                  if (!com.aspose.slides.internal.v6g.k5.l6(var83, NullReferenceException.class)
                     && !com.aspose.slides.internal.v6g.k5.l6(var83, IndexOutOfRangeException.class)) {
                     throw var83;
                  }

                  com.aspose.slides.internal.n8e.v4.n5(var83);
               }
            } else {
               String var91 = p2.n5(this.s7[var7[0]].a6(), var16);
               FontData var93 = null;
               FontData[] var96 = new FontData[]{var93};
               TextParam$FontArgs var34 = this.p8.n5(var14.n5, var28, this.q0, var96).Clone();
               var93 = var96[0];
               float var35 = 0.0F;
               if (com.aspose.slides.internal.v6g.k5.l6(var1, w2.class) && this.m1()) {
                  var35 = var34.Height;
                  if ("•".equals(var91)) {
                     var91 = "●";
                     var34.Height *= 0.6F;
                  } else if ("-".equals(var91)) {
                     var91 = "˗";
                  }

                  var35 -= var34.Height;
                  var35 /= 3.0F;
               }

               TextParam var36 = new TextParam(
                  var28.k5,
                  var29,
                  var34.Clone(),
                  var93.n5(),
                  var93.l6(),
                  var93.k5(),
                  this.k5.getDefaultRegularFont(),
                  this.c4.u3(),
                  this.a6,
                  var2,
                  this.n5.getTextFrameFormat().getEffective().getTextVerticalType()
               );
               var36.l6(new com.aspose.slides.ms.System.o5<>(true));
               var36.n5(new com.aspose.slides.ms.System.o5<>(true));
               a1v var37 = a1v.n5(
                  new j5m(this.r4.cloneT(), var1.q0(), null, this.a6, var2),
                  var14.n5.getBullet().isBulletHardColor() ? var14.n5.getBullet().getFillFormat() : var29.getFillFormat(),
                  (byte)1,
                  null
               );
               var36.n5(var37);
               com.aspose.slides.internal.o9b.f2 var38 = this.s3.n5(var91, var36, false).a6();
               var25 = var24 - var38.l6();
               var24 = p2.n5(var14, var38.l6());
               float var39 = var5.n5 + this.z3.n5 + var3.x8() + p2.n5(var14.n5);
               if (var16) {
                  var39 = var3.x8() + var3.k5() - (var39 - var3.x8()) - var38.l6();
                  if (var15.getAlignment() == 3 || var15.getAlignment() == 4) {
                     var39 += this.z1 - var3.k5();
                  }
               }

               if (com.aspose.slides.internal.v6g.k5.l6(var37, u4z.class)) {
                  u4z var40 = (u4z)var37;
                  if (var40.t9() == 2 || var40.t9() == 0) {
                     if (com.aspose.slides.internal.v6g.k5.l6(var1, w2.class)) {
                        var40.k5(new com.aspose.slides.internal.o9b.y1(-var39, 0.0F, var3.k5(), var3.a6()));
                     } else {
                        var40.k5(new com.aspose.slides.internal.o9b.y1(var3.x8(), var3.s7() - var3.n3(), var3.k5(), var3.a6()));
                     }
                  }
               }

               com.aspose.slides.internal.o9b.y1 var118 = new com.aspose.slides.internal.o9b.y1(
                  var39, var5.l6 + this.z3.l6 + var3.s7() - var35, var38.l6(), var38.k5()
               );
               if (var36.t9() > 0 && (var36.n3 != null || var36.x8 != null) && var4) {
                  this.n5(
                     var1, var2, var36.t9(), null, var28.n5.getLineFormat(), var118.u9().u3(), var36, var118.x8(), var118.x8() + var118.s7(), var118.n3(), true
                  );
               }

               if (var4) {
                  this.n5(var1, var91, var118.y4(), var36, var2);
               }

               if (var36.t9() > 0 && var4) {
                  this.n5(
                     var1, var2, var36.t9(), null, var29.getLineFormat(), var118.u9().u3(), var36, var118.x8(), var118.x8() + var118.s7(), var118.n3(), false
                  );
               }
            }

            if (var26) {
               var1.u9();
               var11[0] = var1.n5("ListBody");
            }
         } else {
            while (var9[0] != 0 && var9[0]-- > 0) {
               var1.u9();
               var1.u9();
               var1.u9();
            }

            if (var1.m1() != null
               && !com.aspose.slides.internal.v6g.k5.l6(var1.m1(), SmartArtShape.class)
               && !com.aspose.slides.internal.v6g.k5.l6(var1.m1(), Chart.class)
               && !var1.m1().a5()
               && !var3.k5.l6(var3.u3)) {
               if (var10[0]) {
                  var1.u9();
               }

               if (!this.n5.n3()) {
                  var10[0] = var1.n5("Paragraph");
               }
            }
         }

         var7[0]++;
      }

      y6e var85 = var18;
      if ((var15.getAlignment() == 3 || var15.getAlignment() == 4) && !var6) {
         var85 = var23;
         y6e var86 = var23;

         while (var86.n5(var18)) {
            char var88 = var86.u3();
            var86 = var86.t2();
            if (var88 == '\t') {
               var85 = var86;
            }
         }
      }

      List var87 = new List();
      byte var89 = -1;
      boolean var92 = var14.n5((byte)1);
      boolean var95 = false;

      while (var23.n5(var18)) {
         m4i var97 = var23.n5();
         y6e var100 = this.n5(var23, var18, true);
         Hyperlink var106 = (Hyperlink)var97.n5.getHyperlinkClick();
         byte var109 = 0;
         IFillFormatEffectiveData var113 = null;
         ILineFormatEffectiveData var115 = null;
         byte[] var117 = new byte[]{0};
         ILineFormatEffectiveData[] var119 = new ILineFormatEffectiveData[]{var115};
         IFillFormatEffectiveData[] var41 = new IFillFormatEffectiveData[]{var113};
         n5(var97.n5, var117, var119, var41);
         var109 = var117[0];
         var115 = var119[0];
         var113 = var41[0];
         if (var109 > 0 || var89 > 0) {
            var22 = 0;
            var21 = 0.0F;
         }

         d2k var42 = d2k.n5(this.n5(var3), var5).u3();
         var42.n5 += var24;
         float var43 = var42.n5;
         boolean var44 = false;
         if (!com.aspose.slides.internal.v6g.k5.l6(var1, j0b.class)) {
            while (!var23.l6(var100) && var23.u3() == '\t') {
               var23 = var23.t2();
               int var45 = 0;
               int[] var46 = new int[]{0};
               float var47 = e7k.n5(var14, var24, var46);
               var45 = var46[0];
               if (var45 != 0 && var3.h0() != null) {
                  int var48 = 0;

                  while (var48 < var3.h0().length && var3.h0()[var48].n5.n5(var23)) {
                     var48++;
                  }

                  if (var48 < var3.h0().length && var3.h0()[var48].n5.l6(var23)) {
                     var24 = var3.h0()[var48].l6;
                     continue;
                  }
               }

               var24 += var47;
               if (var24 > this.z1) {
                  var24 = this.z1;
                  var44 = true;
               }
            }
         }

         y6e var121 = var23;
         boolean var122 = !var23.n5(var85);
         if (com.aspose.slides.internal.v6g.k5.l6(var1, j0b.class)) {
            if (var121.n5(var100)) {
               var121 = var121.t2();
            }
         } else if (var122) {
            var121 = var100;
         } else {
            label965:
            while (var121.n5(var100) && var121.u3() != '\t') {
               if (com.aspose.slides.internal.n2d.u9.n5(var121.h0())) {
                  while (true) {
                     if (com.aspose.slides.internal.n2d.u9.m1(var121.u3())) {
                        var121 = var121.t2();
                     }

                     var121 = var121.t2();
                     if (!com.aspose.slides.internal.n2d.u9.l6(var121.h0()) && var121.u3() != 8205 && !com.aspose.slides.internal.n2d.u9.k5((int)var121.u3())) {
                        break label965;
                     }
                  }
               }

               var121 = var121.t2();
               if (var121.u3() == 1548 || var121.y4() || var23.y4()) {
                  break;
               }
            }
         }

         var100 = var121;
         y6e var123 = var100;
         if (var122) {
            var123 = var23;
         }

         Object var124 = null;

         do {
            if (!var23.n5(var123)) {
               while (var123.n5(var100) && !com.aspose.slides.internal.n2d.u9.z1(var123.u3()) && var123.k5() != 1) {
                  var123 = var123.t2();
               }

               if (var123.n5(var100)) {
                  var123 = var123.t2();
               }
            }

            if (var23.h0() == 57346) {
               m4i var125 = var23.n5();
               Hyperlink var126 = (Hyperlink)var125.n5.getHyperlinkClick();
               r1f var127 = var23.a6();
               y6e var128 = var23;

               while (var23.t2().h0() == 57346 && var23.n5() == var23.t2().n5() && var23.t2().n5(var123)) {
                  var23 = var23.t2();
                  var127 = this.n5(var127, var23.a6());
               }

               var23 = var23.t2();
               l7y var129 = l7y.n5(this, var127, var125, var126, var128, var23, var123, var3, var8, var5.u3(), var100, var43, var25, var14, var24);
               var24 = var129.l6().x8();
               var129.k5(var24);
               if (var129.s7() != 0) {
                  boolean var130 = true;

                  for (int var131 = var87.size() - 1; var131 >= 0; var131--) {
                     i2k var132 = (i2k)var87.get_Item(var131);
                     if (var132.s7() == 0) {
                        break;
                     }

                     float var133 = com.aspose.slides.ms.System.q1.l6(var132.k5().k5(), var129.k5().k5());
                     var132.n5(var133);
                     var129.n5(var133);
                     float var134 = com.aspose.slides.ms.System.q1.n5((float)(var132.m1()), (float)(var129.m1()));
                     var132.l6(var134);
                     var129.l6(var134);
                     if (n5(var130, var132, var129)) {
                        var129.u3(var132.q0());
                     } else {
                        var130 = false;
                     }
                  }
               }

               var87.addItem(var129);
               var25 = 0.0F;
               var24 += var129.l6().s7() - var3.x8();
            } else {
               b4o var49 = e5a.n5(var14, var23, var123, new d4n(var14, var23, this.z1() || this.u3() && var92)).k5();
               byte var50;
               if (com.aspose.slides.internal.n2d.u9.n5(var23.h0())) {
                  var50 = 4;
               } else if (var23.l6(var123)) {
                  var50 = 0;
               } else {
                  var50 = var23.k5();
               }

               if (com.aspose.slides.internal.n2d.u9.u3(var23.u3()) && this.u3()) {
                  var50 = 0;
               }

               if (var50 == 4 && var12 != null && var12.d2().n5(var23.h0()) && var13 != var50) {
                  var50 = var13;
               }

               TextParam var51 = this.n5(var2, var50, var97, var49.n5);
               var51.n5(true);
               var12 = var51;
               var13 = var50;
               c9g var52 = var97.n5;
               boolean var53 = var52.getHyperlinkClick() != null || var52.getHyperlinkMouseOver() != null;
               boolean var54 = var53
                  && (
                     var52.getHyperlinkClick() != null && var52.getHyperlinkClick().getColorSource() == 0
                        || var52.getHyperlinkMouseOver() != null && var52.getHyperlinkMouseOver().getColorSource() == 0
                  );
               if (var53 && var54) {
                  var51.n5(var8);
               }

               if (var1 instanceof r1c) {
                  s3z.n5(var14, var51);
               }

               e4z var55 = var51.d2();
               boolean var56 = e5a.l6(var23, var14) || e5a.k5(var23, var14);
               d4n var57 = new d4n(var14, var23, var55, this.z1() || this.u3() && var92);
               boolean var58 = var23.y4();
               y6e[] var59 = new y6e[]{var23};
               b4o var60 = e5a.n5(var14, var59, var123, var57).k5();
               var23 = var59[0];
               if (var3.l6 != null && var3.l6.h0()) {
                  var60 = new b4o(" ");
                  var57 = null;
               }

               if (var97.n5.getTextCapType() == 2) {
                  var60.n5(var97.n5.getLanguageId()).n5(var60);
               }

               var89 = var51.t9();
               boolean var61 = this.h0 != 0.0F || !com.aspose.slides.ms.System.n1.k5(this.n5.getTextFrameFormat().getRotationAngle());
               boolean var62 = this.n5.getTextFrameFormat().getTextVerticalType() == 1;
               boolean var63 = !var61 || !var62 && !this.u3();
               f3v var64 = new f3v(this, var60.k5(), var50, var92, var63);
               if (var58) {
                  var64.l6(true);
                  var64.n5(true);
               }

               String var65 = var60.k5;
               var51.n5(true);
               com.aspose.slides.internal.o9b.f2 var66 = this.s3.n5(var65, var55, var51).a6();
               if (com.aspose.slides.internal.v6g.k5.l6(var1, j0b.class) && "\t".equals(var65)) {
                  int var67 = 0;
                  int[] var68 = new int[]{0};
                  var66.n5(e7k.n5(var14, var24, var68));
                  var67 = var68[0];
               }

               if (var64.a6() && var64.n5()) {
                  char var136 = var65.charAt(0);
                  int var138 = var136;
                  if (com.aspose.slides.internal.n2d.u9.m1(var136) && var65.length() > 1) {
                     var138 = com.aspose.slides.ms.System.t9.n5(var136, var65.charAt(1));
                  }

                  if (com.aspose.slides.internal.n2d.u9.n5(var138)) {
                     var66.l6(var66.l6() - var3.y4());
                  } else {
                     var66.l6(
                        !com.aspose.slides.internal.n2d.u9.z1(var136)
                              && (!com.aspose.slides.internal.n2d.u9.z8(var136) || !com.aspose.slides.ms.System.t9.x8(var136))
                           ? this.n5(var138, var51).k5() + var3.y4() * (this.u9 && v6o.n5(var14) ? 0.45F : 1.0F)
                           : var66.l6()
                     );
                  }
               }

               if (var64.l6()) {
                  var51.n5((byte)0);
               }

               d2k var137 = this.n5(var3, var66.l6(), var50, var24, var5.u3(), var64).u3();
               float var139 = var66.k5();
               if (!var64.k5() && this.z1() && var50 != 1) {
                  var139 = var66.k5() + var3.y4();
               }

               a1v var69 = var51.u3();
               if (com.aspose.slides.internal.v6g.k5.l6(var69, u4z.class)) {
                  u4z var70 = (u4z)var69;
                  if (var70.t9() == 2 || var70.t9() == 0) {
                     if (com.aspose.slides.internal.v6g.k5.l6(var1, w2.class)) {
                        var70.k5(new com.aspose.slides.internal.o9b.y1(-var24, 0.0F, var3.k5(), var3.a6()));
                     } else {
                        var70.k5(new com.aspose.slides.internal.o9b.y1(var3.x8(), var137.l6 - var3.n3(), var3.k5(), var3.a6()));
                     }
                  }
               } else if (com.aspose.slides.internal.v6g.k5.l6(var69, q3d.class)) {
                  ((q3d)var69).k5(new com.aspose.slides.internal.o9b.y1(var137.n5, var137.l6 - var3.n3(), var3.k5(), var3.a6()));
               }

               com.aspose.slides.internal.o9b.y1 var140 = new com.aspose.slides.internal.o9b.y1(var137.n5, var137.l6, var66.l6(), var66.k5());
               if (var64.a6() && var64.n5()) {
                  var140.l6(var66.k5());
                  var140.n5(var66.l6());
               }

               String var71;
               if (var57 == null) {
                  var71 = var60.k5;
               } else if (var55.l6().n5().a0() && var55.c8() == -78) {
                  var71 = var60.n5;
               } else {
                  var71 = var60.k5;
               }

               float var72 = var64.u9() ? var139 : var140.s7();
               if (var95) {
                  if (var24 >= this.z1 && var72 > 0.0F && var23.l6(var100)) {
                     i2k var73 = (i2k)var87.get_Item(var87.size() - 1);
                     com.aspose.slides.internal.o9b.w1 var74 = var73.l6().u9().u3();
                     var73.n5(new d2k(var74.l6() - var72, var74.k5()));
                     var24 -= var72;
                     var73.k5(var24);
                     var140.k5(var140.x8() - var72);
                  }

                  var95 = false;
               } else if (var44) {
                  if (var24 + var72 > this.z1) {
                     var24 = this.z1 - var72;
                     var140.k5(var24);
                  }

                  var44 = false;
                  var95 = true;
               }

               if (var58) {
                  var140.u3(var137.l6);
               }

               i2k var141 = new i2k(
                  var97,
                  var140.y4(),
                  var106,
                  var51,
                  var60.k5(),
                  var23,
                  var18,
                  var16,
                  var56,
                  var123,
                  var3,
                  var8,
                  var109,
                  var64,
                  var115,
                  var5.u3(),
                  var113,
                  var89,
                  var19,
                  var100,
                  var22,
                  var21,
                  (String)var124,
                  var43,
                  var25,
                  var50,
                  var72,
                  var71
               );
               var141.k5(var24);
               if (var141.s7() != 0) {
                  boolean var142 = true;

                  for (int var75 = var87.size() - 1; var75 >= 0; var75--) {
                     i2k var76 = (i2k)var87.get_Item(var75);
                     if (var76.s7() == 0) {
                        break;
                     }

                     float var77 = com.aspose.slides.ms.System.q1.l6(var76.k5().k5(), var141.k5().k5());
                     var76.n5(var77);
                     var141.n5(var77);
                     float var78 = com.aspose.slides.ms.System.q1.n5((float)(var76.m1()), (float)(var141.m1()));
                     var76.l6(var78);
                     var141.l6(var78);
                     if (n5(var142, var76, var141)) {
                        var141.u3(var76.q0());
                     } else {
                        var142 = false;
                     }
                  }
               }

               var87.addItem(var141);
               var25 = 0.0F;
               var24 += var141.z8();
            }
         } while (var23.n5(var100));
      }

      n5(var87);
      if (var87.size() > 0) {
         var3.n5 = new com.aspose.slides.internal.o9b.y1(
            ((i2k)var87.get_Item(0)).l6().x8(),
            ((i2k)var87.get_Item(0)).l6().n3(),
            var24 - ((i2k)var87.get_Item(0)).l6().x8(),
            ((i2k)var87.get_Item(0)).l6().k5()
         );
      }

      if (var15.getAlignment() == 5) {
         if (!var87.isEmpty() && this.n5.getText().length() != 1) {
            float var98 = ((i2k)var87.get_Item(0)).c8().l6.n5.getMarginRight();
            float var102 = (this.x8() - var98) / ((i2k)var87.get_Item(0)).c8().k5();
            List$Enumerator var107 = var87.iterator();

            try {
               while (var107.hasNext()) {
                  i2k var111 = (i2k)var107.next();
                  var111.a6(var102);
                  var111.n5(this.s3);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var107, IDisposable.class)) {
                  var107.dispose();
               }
            }
         }
      } else if ((var15.getAlignment() == 3 || var15.getAlignment() == 4) && !var6 && var87.size() > 1) {
         n5(var87, this.z1);
      }

      g7p var99 = new g7p();

      for (int var103 = 0; var103 < var87.size(); var103++) {
         i2k var108 = (i2k)var87.get_Item(var103);
         if (var103 > 0) {
            i2k var112 = (i2k)var87.get_Item(var103 - 1);
            var108.n5(var112.z1());
            if (var108.z1() != null
               && var108.m3() == 1
               && var108.m3() == var112.m3()
               && !com.aspose.slides.ms.System.d1.n5(com.aspose.slides.ms.System.d1.l6(var108.a6().k5))) {
               var108.k5().l6(var108.z1());
            } else {
               var108.n5((String)null);
            }
         }

         if (var4) {
            this.n5(var1, var108, var99, var2);
         }
      }

      if (var99.n5() && var4) {
         var99.n5(var1, this, var16, var2);
      }
   }

   final boolean n5(e2n var1) {
      List$Enumerator var2 = var1.u3().iterator();

      try {
         while (var2.hasNext()) {
            m4i var3 = (m4i)var2.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var3.k5, Portion.class) && !com.aspose.slides.ms.System.d1.n5(var3.k5.u9())) {
               return true;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return false;
   }

   private r1f n5(r1f var1, r1f var2) {
      MathBlock var3 = (MathBlock)var2.u3.k5.get_Item(0);
      var3.l6();
      MathBlock var4 = (MathBlock)var1.u3.k5.get_Item(0);
      var4.l6();
      var4.joinBlock(var3);
      MathParagraph var5 = new MathParagraph(var4);
      var5.n5(var1.u3());
      var5.setJustification(var1.u3.k5.getJustification());
      MathPortion var6 = new MathPortion(var5);
      y9t var7 = this.n5(var6, var1.u3);
      r1f var8 = new r1f(var7, var5.getJustification());
      var8.n5(var1.a6());
      var8.n5(new d2k(), false, 0.0F);
      var8.n5(var8.u3.n5[0].u9().n5);
      return var8;
   }

   final y9t n5(MathPortion var1, y9t var2) {
      MathParagraph var3 = (MathParagraph)var1.getMathParagraph();
      return new y9t(var3, var2.n5(), var2.l6, var2.u3.n5());
   }

   private List<i2k> n5(r4d var1, d2k var2, boolean var3) {
      e2n var4 = var1.l6;
      t3x var5 = var4.n5;
      boolean var6 = var5.getRightToLeft();
      y6e var7 = var1.k5;
      y6e var8 = var1.u3;

      while (var1.k5.n5(var8) && com.aspose.slides.ms.System.t9.t9(var8.s7().u3())) {
         var8 = var8.s7();
      }

      c9g var9;
      if (var7.n5().k5 != null) {
         var9 = var7.n5().k5.l6().r4();
      } else {
         var9 = var7.n5().n5;
      }

      y6e var10 = var7;
      float var11 = var5.getMarginLeft();
      if (var1.c8()) {
         var11 = p2.n5(var4);
         if (this.u9 && v6o.n5(var4)) {
            m4i var12 = var10.n5();
            if (var5.getBullet().getType() == 3) {
               com.aspose.slides.internal.o9b.f2 var13 = this.n5(var12.n5, var4.n5).a6();
               var11 = p2.n5(var4, var13.l6());
            } else {
               TextParam var46 = this.p8.n5(var1.l6, var12, this.q0);
               int var14 = var12.k5.n3().h0();
               String var15 = p2.n5(this.s7[var14].a6(), var6);
               if (var15 != null) {
                  com.aspose.slides.internal.o9b.f2 var16 = this.s3.n5(var15, var46, false).a6();
                  var11 = p2.n5(var4, var16.l6());
               }
            }
         }
      }

      y6e var45 = var8;
      if ((var5.getAlignment() == 3 || var5.getAlignment() == 4) && !var3) {
         var45 = var10;
         y6e var47 = var10;

         while (var47.n5(var8)) {
            char var49 = var47.u3();
            var47 = var47.t2();
            if (var49 == '\t') {
               var45 = var47;
            }
         }
      }

      List var17 = new List();
      boolean var48 = var1.k5.l6(var8);
      boolean var50 = var4.n5((byte)1);

      while (var10.n5(var8) || var48) {
         m4i var51 = var10.n5();
         y6e var53 = this.n5(var10, var8, false);
         d2k var18 = d2k.n5(this.n5(var1), var2).u3();
         var18.n5 += var11;
         float var19 = var18.n5;

         while (!var10.l6(var53) && var10.u3() == '\t') {
            var10 = var10.t2();
            int var20 = 0;
            int[] var21 = new int[]{0};
            float var22 = e7k.n5(var4, var11, var21);
            var20 = var21[0];
            if (var20 != 0 && var1.h0() != null) {
               int var23 = 0;

               while (var23 < var1.h0().length && var1.h0()[var23].n5.n5(var10)) {
                  var23++;
               }

               if (var23 < var1.h0().length && var1.h0()[var23].n5.l6(var10)) {
                  var11 = var1.h0()[var23].l6;
                  continue;
               }
            }

            var11 += var22;
         }

         y6e var59 = var10;
         boolean var60 = !var10.n5(var45);
         if (var60) {
            var59 = var53;
         } else {
            label451:
            while (var59.n5(var53) && var59.u3() != '\t') {
               if (com.aspose.slides.internal.n2d.u9.n5(var59.h0())) {
                  while (true) {
                     if (com.aspose.slides.internal.n2d.u9.m1(var59.u3())) {
                        var59 = var59.t2();
                     }

                     var59 = var59.t2();
                     if (!com.aspose.slides.internal.n2d.u9.l6(var59.h0()) && var59.u3() != 8205 && !com.aspose.slides.internal.n2d.u9.k5((int)var59.u3())) {
                        break label451;
                     }
                  }
               }

               var59 = var59.t2();
               if (var59.u3() == 1548) {
                  break;
               }
            }
         }

         var53 = var59;
         y6e var61 = var53;
         if (var60) {
            var61 = var10;
         }

         Object var62 = null;

         do {
            if (!var10.n5(var61)) {
               while (var61.n5(var53) && !com.aspose.slides.internal.n2d.u9.z1(var61.u3()) && var61.k5() != 1) {
                  var61 = var61.t2();
               }

               if (var61.n5(var53)) {
                  var61 = var61.t2();
               }
            }

            b4o var24 = e5a.n5(var4, var10, var61, new d4n(var4, var10, this.z1() || this.u3() && var50)).k5();
            byte var25;
            if (com.aspose.slides.internal.n2d.u9.n5(var10.h0())) {
               var25 = 4;
            } else if (var10.l6(var61)) {
               var25 = 0;
            } else {
               var25 = var10.k5();
            }

            TextParam var26 = this.n5(null, var25, var51, var24.n5);
            e4z var27 = var26.d2();
            boolean var28 = e5a.l6(var10, var4) || e5a.k5(var10, var4);
            d4n var29 = new d4n(var4, var10, var27, this.z1() || this.u3() && var50);
            y6e[] var30 = new y6e[]{var10};
            b4o var31 = e5a.n5(var4, var30, var61, var29).k5();
            var10 = var30[0];
            if (var1.l6 != null && var1.l6.h0()) {
               var31 = new b4o(" ");
               var29 = null;
            }

            if (var51.n5.getTextCapType() == 2) {
               var31.l6().n5(var31);
            }

            boolean var32 = this.h0 != 270.0F || this.n5.getTextFrameFormat().getTextVerticalType() != 1 && !this.u3();
            f3v var33 = new f3v(this, var31.k5(), var25, var50, var32);
            String var34 = var31.k5;
            com.aspose.slides.internal.o9b.f2 var35 = this.s3.n5(var34, var27, var26).a6();
            if (var33.a6() && var33.n5()) {
               char var36 = var34.charAt(0);
               int var37 = var36;
               if (com.aspose.slides.internal.n2d.u9.m1(var36) && var34.length() > 1) {
                  var37 = com.aspose.slides.ms.System.t9.n5(var36, var34.charAt(1));
               }

               var35.l6(
                  !com.aspose.slides.internal.n2d.u9.z1(var36) && (!com.aspose.slides.internal.n2d.u9.z8(var36) || !com.aspose.slides.ms.System.t9.x8(var36))
                     ? this.n5(var37, var26).k5() + var1.y4()
                     : var35.l6()
               );
            }

            if (var33.l6()) {
               var26.n5((byte)0);
            }

            d2k var63 = this.n5(var1, var35.l6(), var25, var11, var2.u3(), var33).u3();
            float var64 = var35.k5();
            if (!var33.k5() && this.z1() && var25 != 1) {
               var64 = var35.k5() + var1.y4();
            }

            com.aspose.slides.internal.o9b.y1 var38 = new com.aspose.slides.internal.o9b.y1(var63.n5, var63.l6, var35.l6(), var35.k5());
            if (var33.a6() && var33.n5()) {
               var38.l6(var35.k5());
               var38.n5(var35.l6());
            }

            String var39;
            if (var29 == null) {
               var39 = var31.k5;
            } else if (var27.l6().n5().a0() && var27.c8() == -78) {
               var39 = var31.n5;
            } else {
               var39 = var31.k5;
            }

            float var40 = var33.u9() ? var64 : var38.s7();
            i2k var41 = new i2k(
               var51,
               var38.y4(),
               null,
               var26,
               var31.k5(),
               var10,
               var8,
               var6,
               var28,
               var61,
               var1,
               null,
               (byte)0,
               var33,
               null,
               var2.u3(),
               null,
               (byte)-1,
               var9,
               var53,
               0,
               0.0F,
               (String)var62,
               var19,
               0.0F,
               var25,
               var40,
               var39
            );
            var41.k5(var11);
            var17.addItem(var41);
            var11 += var41.z8();
         } while (var10.n5(var53));

         if (var53.u3() == 11 && !var48) {
            var48 = true;
         } else {
            var48 = false;
         }
      }

      if (var5.getAlignment() == 5) {
         if (var17.size() > 0) {
            float var52 = ((i2k)var17.get_Item(0)).c8().l6.n5.getMarginRight();
            float var55 = (this.x8() - var52) / ((i2k)var17.get_Item(0)).c8().k5();
            List$Enumerator var56 = var17.iterator();

            try {
               while (var56.hasNext()) {
                  i2k var57 = (i2k)var56.next();
                  var57.a6(var55);
                  var57.n5(this.s3);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var56, IDisposable.class)) {
                  var56.dispose();
               }
            }
         }
      } else if ((var5.getAlignment() == 3 || var5.getAlignment() == 4) && !var3 && var17.size() > 1) {
         n5(var17, this.z1);
      }

      return var17;
   }

   private static void n5(List<i2k> var0, float var1) {
      i2k var2 = (i2k)var0.get_Item(0);
      int var3 = 0;
      int var4 = 0;
      if (!var2.w1().isEmpty()) {
         int[] var5 = new int[]{0};
         int[] var6 = new int[]{0};
         n5(var2, var5, var6);
         var3 = var5[0];
         var4 = var6[0];
         if (var3 + var4 != 0) {
            r4d var7 = var2.c8();
            float var8 = var7.k5();
            var1 -= var7.l6.n5.getMarginRight();
            float var9 = var7.x8();
            float var10 = (var1 - (var8 + var9)) / (var3 * 2 + var4);
            float var11 = var10 * 2.0F;
            float var12 = var10;
            n5(var0, var11, var12);
            i2k var13 = (i2k)var0.get_Item(var0.size() - 1);
            float var14 = var13.t4() + var13.z8();
            if (var1 < var14 && var4 > 0) {
               var10 = (var1 - var14) / (var3 * 2 + var4);
               var11 = var10 * 2.0F;
               var12 = var10;
               n5(var0, var11, var12);
            }
         }
      }
   }

   private static void n5(List<i2k> var0, float var1, float var2) {
      com.aspose.slides.internal.f8y.n5.n5(var0.size() > 1);
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;

      while (((i2k)var0.get_Item(var5)).c4() && var5 < var0.size() - 1) {
         var5++;
      }

      while (var5 < var0.size() - 1) {
         int var6 = 0;
         int var7 = 0;
         i2k var8 = (i2k)var0.get_Item(var5);
         boolean var9 = false;
         if (var8.n5() == null) {
            var9 = var8.c8().l6.n5.getRightToLeft();
            if (var8.w1().length() > 0) {
               int var10 = var9 ? 0 : var8.w1().length() - 1;
               if (com.aspose.slides.internal.n2d.u9.z1(var8.w1().charAt(var10))) {
                  var3++;
                  var6++;
               } else if (var8.m3() == 1) {
                  var4++;
                  var7++;
               }
            }
         } else {
            var3++;
            var6++;
         }

         i2k var16 = (i2k)var0.get_Item(var5 + 1);
         float var11 = var1 * var3 + var2 * var4;
         float var12 = var1 * var6 + var2 * var7;
         float var13 = var16.l6().x8() + (var9 ? -var11 : var11);
         var8.u9(var8.l6().s7() + (var9 ? -var12 : var12));
         d2k var14 = new d2k(var13, var16.l6().n3());
         var16.n5(var14.u3());
         float var15 = var16.t4() + var11;
         var16.k5(var15);
         var16.u3(var15);
         var5++;
      }
   }

   private static void n5(List<i2k> var0) {
      boolean var1 = true;

      for (int var2 = 0; var2 < var0.size(); var2++) {
         i2k var3 = (i2k)var0.get_Item(var2);
         if (var3.n5() == null) {
            if (!var3.r4()) {
               var1 = false;
            }

            if (var2 > 0) {
               TextParam var4 = ((i2k)var0.get_Item(var2 - 1)).k5();
               if (var4 != null
                  && com.aspose.slides.ms.System.o5.n5(var4.w1(), new com.aspose.slides.ms.System.o5<>(true))
                  && com.aspose.slides.ms.System.o5.n5(var4.j5(), new com.aspose.slides.ms.System.o5<>(true))) {
                  var3.k5().l6(new com.aspose.slides.ms.System.o5<>(true));
               }
            }

            if (var2 == 0) {
               var3.k5().l6(new com.aspose.slides.ms.System.o5<>(true));
            }

            if (var2 == var0.size() - 1) {
               var3.k5().n5(new com.aspose.slides.ms.System.o5<>(true));
            }

            if (var3.k5().k5() != 0) {
               var3.k5().l6(new com.aspose.slides.ms.System.o5<>(true));
               var3.k5().n5(new com.aspose.slides.ms.System.o5<>(true));
               if (var2 > 0) {
                  TextParam var5 = ((i2k)var0.get_Item(var2 - 1)).k5();
                  if (var5 != null) {
                     var5.n5(new com.aspose.slides.ms.System.o5<>(true));
                  }
               }
            }

            if (var1) {
               var3.k5().l6(new com.aspose.slides.ms.System.o5<>(true));
               var3.k5().n5(new com.aspose.slides.ms.System.o5<>(true));
            }
         }
      }
   }

   private static void n5(i2k var0, int[] var1, int[] var2) {
      y6e var3 = var0.k5;
      y6e var4 = var0.c8().k5;

      while (var4.n5(var3) && com.aspose.slides.internal.n2d.u9.z1(var4.u3())) {
         var4 = var4.t2();
      }

      var1[0] = 0;
      var2[0] = 0;
      y6e var5 = var4;

      while (var4.n5(var3)) {
         if (com.aspose.slides.internal.n2d.u9.z1(var4.u3())) {
            var1[0]++;
         } else {
            var5 = var4;
         }

         if (com.aspose.slides.internal.n2d.u9.a6(var4.h0()) == 1) {
            var2[0]++;
         }

         if (var4.h0() == 57346) {
            var1[0] += 2;
         }

         var4 = var4.t2();
      }

      var4 = var5;

      for (y6e var7 = var4.t2(); var7.n5(var3); var7 = var7.t2()) {
         var1[0]--;
         if (com.aspose.slides.internal.n2d.u9.a6(var7.h0()) == 1) {
            var2[0]--;
         }
      }
   }

   private void n5(e3 var1, i2k var2, g7p var3, s5u var4) {
      boolean var5 = false;
      if (var2.n5() != null) {
         com.aspose.slides.internal.w0.c8 var27 = var1.q0();

         try {
            if (var2.u3() != null) {
               var1.n5(var2.u3());
            }

            if (var2.k5() != null && (var2.k5().n3 != null || var2.k5().x8 != null)) {
               this.n5(var1, var2, com.aspose.slides.internal.o9b.y1.n5.y4(), true, var4);
               this.n5(var1, var2, true, var4);
            }

            var1.n5(var2.t4(), var2.l6().n3());
            com.aspose.slides.internal.o9b.y1 var7 = var1.q0().n5(new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var2.l6().s7(), var2.l6().k5())).y4();
            if (var1.m1() != null) {
               var7.k5(var1.m1().getX());
               var7.u3(var1.m1().getY());
               var7.l6(com.aspose.slides.ms.System.q1.n5((float)(var1.m1().getWidth()), (float)(var7.s7())));
               var7.n5(com.aspose.slides.ms.System.q1.n5((float)(var1.m1().getHeight()), (float)(var7.k5())));
            }

            var7.n5(5.0F, 5.0F);

            String var9;
            try {
               com.aspose.slides.internal.z0k.e2 var8 = new com.aspose.slides.internal.z0k.e2();

               try {
                  var2.n5().u3.k5.n5(var8);
                  var9 = j9g.n5(var8);
               } finally {
                  if (var8 != null) {
                     var8.dispose();
                  }
               }
            } catch (RuntimeException var21) {
               var9 = "Mathematical equation";
            }

            var5 = var1.n5("MathBlock", var7.y4(), var9);
            var2.n5().n5(var1);
         } finally {
            if (var5) {
               var1.u9();
            }

            var1.l6(var27);
         }

         if (var2.k5() != null) {
            this.n5(var1, var2, com.aspose.slides.internal.o9b.y1.n5.y4(), false, var4);
            this.n5(var1, var2, false, var4);
         }

         if (var2.u3() != null && var2.l6.l6(var2.a6)) {
            var1.u3();
         }
      } else {
         if (var2.u3() != null) {
            var1.n5(var2.u3());
         }

         if (var2.x8().a6()) {
            com.aspose.slides.internal.w0.c8 var6 = this.n5(var2);
            var1.k5(var6);
         }

         if (var2.k5().n3 != null || var2.k5().x8 != null) {
            this.n5(var1, var2, com.aspose.slides.internal.o9b.y1.n5.y4(), true, var4);
            this.n5(var1, var2, true, var4);
         }

         if (!var2.n5.n5.u9().t2() && (var2.n5.n5.u9().s7() & 255) != 0 && l6(var2.n5)) {
            com.aspose.slides.internal.o9b.y1 var24 = new com.aspose.slides.internal.o9b.y1(
               var2.l6().x8(), var2.l6().n3() + var2.k5().i1() * 2.0F - var2.l6().k5(), var2.l6().s7(), var2.l6().k5()
            );

            try {
               var1.n5(var24.y4(), null, new a1v(var2.n5.n5.u9().o8()));
            } catch (RuntimeException var23) {
               if (!com.aspose.slides.internal.v6g.k5.l6(var1, j0b.class)) {
                  throw var23;
               }
            }
         }

         if (var2.u9() != var2.h0()) {
            if (!var2.l6.l6(var2.k5) || !" ".equals(var2.a6().k5)) {
               var3.n5(var2);
            }
         } else {
            if (var3.n5()) {
               var3.n5(var1, this, var2.u9(), var4);
            }

            String var25;
            if (!com.aspose.slides.ms.System.d1.n5(var2.a6().n5) && com.aspose.slides.internal.v6g.k5.l6(var1, r1c.class)) {
               var25 = var2.a6().l6;
            } else {
               var25 = var2.a6().n5();
            }

            var2.n5(this.n5(var1, var25, var2.l6().y4(), var2.k5(), var4));
         }

         if (var2.x8().a6()) {
            d2k var26 = d2k.n5(this.n5(var2.c8()), var2.y4()).u3();
            var26.n5 = var26.n5 + var2.t4();
            var2.n5(var26.u3());
            var2.k5(var26.n5);
            var1.z3();
         }

         if (var2.u9() == var2.h0()) {
            this.n5(var1, var2, com.aspose.slides.internal.o9b.y1.n5.y4(), false, var4);
            this.n5(var1, var2, false, var4);
         }

         if (var2.u3() != null && var2.l6.l6(var2.a6)) {
            var1.u3();
         }
      }
   }

   private static boolean n5(boolean var0, i2k var1, i2k var2) {
      return var0
         && var1.s7() == var2.s7()
         && var1.s7() != 1
         && var1.u9() == var2.u9()
         && var1.h0() == var2.h0()
         && var1.x8().u3() == var2.x8().u3()
         && var1.x8().k5() == var2.x8().k5()
         && com.aspose.slides.ms.System.j8.l6(var1.u3(), var2.u3())
         && (var1.t2() == null && var2.t2() == null || com.aspose.slides.ms.System.j8.l6(var1.t2(), var2.t2()))
         && (
            var1.n5() != null
               || var2.n5() != null
               || com.aspose.slides.ms.System.j8.l6(var1.e2(), var2.e2()) && com.aspose.slides.ms.System.j8.l6(var1.n3(), var2.n3())
         )
         && com.aspose.slides.ms.System.q1.n5(var1.l6().x8() + var1.l6().s7() - var2.l6().x8())
            <= com.aspose.slides.ms.System.q1.n5(com.aspose.slides.ms.System.q1.n5(var1.m1(), var2.m1()) * 0.25F, 1.0F);
   }

   final void n5(e3 var1, i2k var2, com.aspose.slides.internal.o9b.y1 var3, boolean var4, s5u var5) {
      if (var2.s7() > 0) {
         float var6 = var2.u9() ? var2.l6().x8() : var2.q0();
         float var7 = var2.l6().x8() + var2.l6().s7();
         if (!var3.u3()) {
            var6 = var3.x8();
            var7 = var3.x8() + var3.s7();
         }

         float var8 = this.z3.l6 + var2.y4().l6 + var2.c8().s7() - var2.n5.n5.h0() * var2.z3() / 100.0F;
         if (var2.x8().u3()) {
            var8 -= var2.c8().n3();
            var6 += var2.l6().k5() / 10.0F;
            var7 += var2.l6().k5() / 10.0F;
            if (var2.x8().k5()) {
               var6 -= var2.l6().s7() / 4.0F;
               var7 -= var2.l6().s7() / 4.0F;
            }
         }

         float[] var9 = new float[]{var6};
         float[] var10 = new float[]{var7};
         this.n5(var2.l6, var2.u3, var2.u9() && var2.h0(), var2.a6().k5(), var2.k5(), var2.c8(), var9, var10);
         var6 = var9[0];
         var7 = var10[0];
         if (var7 > var6) {
            this.n5(var1, var5, var2.s7(), var2.m1(), var2.e2(), var2.n3(), var2.t2(), var2.l6().y4(), var2.k5(), var6, var7, var8, var4);
         }
      }
   }

   private void n5(e3 var1, i2k var2, boolean var3, s5u var4) {
      if (var2.t9() == 1 || var2.t9() == 2) {
         float var5 = var2.u9() ? var2.l6().x8() : var2.q0() - var2.k7();
         float var6 = var2.l6().x8() + var2.l6().s7() + (var2.u9() ? var2.k7() : 0.0F);
         float var7 = this.z3.l6 + var2.y4().l6 + var2.c8().s7();
         if (var2.x8().u3()) {
            var7 -= var2.c8().n3() / 2.5F;
            var5 += var2.l6().k5() / 10.0F;
            var6 += var2.l6().k5() / 10.0F;
            if (var2.x8().k5()) {
               var5 -= var2.l6().s7() / 4.0F;
               var6 -= var2.l6().s7() / 4.0F;
            }
         }

         float[] var8 = new float[]{var5};
         float[] var9 = new float[]{var6};
         this.n5(var2.l6, var2.u3, var2.u9(), var2.a6().k5(), var2.k5(), var2.c8(), var8, var9);
         var5 = var8[0];
         var6 = var9[0];
         if (var6 > var5) {
            this.n5(
               var1,
               var4,
               (byte)(var2.t9() == 1 ? 1 : 2),
               var2.n5.n5.getFillFormat(),
               var2.n5.n5.getLineFormat(),
               var2.l6().u9().u3(),
               var2.k5(),
               var5,
               var6,
               var7,
               var3
            );
         }
      }
   }

   private void n5(y6e var1, y6e var2, boolean var3, b4o var4, TextParam var5, r4d var6, float[] var7, float[] var8) {
      if (var1.l6(var2)) {
         String var9 = var4.k5;
         if (!com.aspose.slides.ms.System.d1.n5(var9)) {
            if (var3 && var9.charAt(0) == ' ') {
               int var13 = 0;
               float var15 = this.s3.n5(" ", var5).l6();
               var7[0] += var15;
               var13++;

               while (var13 < var9.length() && var9.charAt(var13) == ' ') {
                  var7[0] += var15;
                  var13++;
               }
            } else if (!var3 && var6.u3.l6(var2) && var9.charAt(var9.length() - 1) == ' ') {
               int var10 = var9.length() - 1;
               float var11 = this.s3.n5(" ", var5).l6();
               var8[0] -= var11;
               var10--;

               while (var10 > -1 && var9.charAt(var10) == ' ') {
                  var8[0] -= var11;
                  var10--;
               }
            }
         }
      }
   }

   public final s4s n5(Portion var1, boolean var2) {
      float var3 = Float.MAX_VALUE;
      float var4 = Float.MAX_VALUE;
      float var5 = -Float.MAX_VALUE;
      float var6 = 0.0F;
      List var7 = this.l6();
      r4d var8 = null;
      List$Enumerator var9 = var7.iterator();

      try {
         while (var9.hasNext()) {
            i2k var10 = (i2k)var9.next();
            if (var10.n5.k5 == var1) {
               if (var10.l6().t2() - var10.c8().a6() + var10.c8().h0.l6 < var4) {
                  var4 = var10.l6().t2() - var10.c8().a6() + var10.c8().h0.l6;
               }

               if (var10.l6().x8() < var3) {
                  var3 = var10.l6().x8();
               }

               if (var10.l6().h0() > var5) {
                  var5 = var10.l6().h0();
               }

               if (var10.c8() != var8) {
                  var6 += var10.l6().k5();
               }

               var8 = var10.c8();
               if (var2) {
                  break;
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
            var9.dispose();
         }
      }

      return new s4s(var3, var4, var5 - var3, var6);
   }

   public final int n5(Paragraph var1) {
      o1c var2 = this.k5(var1);
      return var2.n5.size() == 1 && var2.n5.get_Item(0).k5.h0() == 57346 ? var2.n5.get_Item(0).k5.a6().u3.n5.length : var2.n5.size();
   }

   public final s4s l6(Paragraph var1) {
      o1c var2 = this.k5(var1);
      List var3 = var2.n5;
      r4d var4 = (r4d)var3.get_Item(0);
      e2n var5 = var4.l6;
      y6e var6 = var4.k5;
      byte var7 = com.aspose.slides.internal.n2d.u9.a6(var6.h0());
      m4i var8 = var6.n5();
      TextParam var9 = this.n5(var7, var8);
      e4z var10 = var9.d2();
      b4o var11 = new b4o(var5.u3().get_Item(0).l6, new d4n(var4.l6, var6, var10, this.z1()));
      float var12 = 0.0F;
      IGenericEnumerator var13 = var1.getPortions().iterator();

      try {
         while (var13.hasNext()) {
            IPortion var14 = (IPortion)var13.next();
            if (com.aspose.slides.internal.v6g.k5.l6(var14, Portion.class)) {
               String var15 = com.aspose.slides.internal.v6g.k5.n5(var14, Portion.class).u9();
               k8x var16 = new k8x();
               k8x[] var17 = new k8x[]{var16};
               com.aspose.slides.internal.o9b.f2 var18 = this.s3.n5(var15, var10, var9, true, Integer.MIN_VALUE, var17).a6();
               var17[0].n5(var16);
               var12 += var18.l6();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
            var13.dispose();
         }
      }

      AutoShape var29 = com.aspose.slides.internal.v6g.k5.n5(this.n5.k5(), AutoShape.class);
      boolean var30 = var29 == null || var29.getRotation() != 270.0F || this.n5.getTextFrameFormat().getTextVerticalType() != 1;
      f3v var31 = new f3v(this, var11.k5(), var7, var4.l6.n5((byte)1), var30);
      float var32 = p2.n5(var5);
      float var34 = 0.0F;
      boolean var19 = v6o.n5(var5) && this.u9;
      if (var19) {
         if (var1.getParagraphFormat().getBullet().getType() == 3) {
            com.aspose.slides.internal.o9b.f2 var20 = this.n5(var8.n5, var5.n5).a6();
            var32 = p2.n5(var5, var20.l6());
            var34 = p2.n5(var5.n5) + var20.l6();
         } else {
            TextParam var35 = this.p8.n5(var5, var8, this.q0);
            int var21 = var1.h0();
            String var22 = p2.n5(this.s7[var21].a6(), var5.n5.getRightToLeft());
            if (var22 != null) {
               com.aspose.slides.internal.o9b.f2 var23 = this.s3.n5(var22, var35).a6();
               var32 = p2.n5(var5, var23.l6());
               var34 = p2.n5(var5.n5) + var23.l6();
            }
         }
      }

      d2k var36 = var2.l6.get_Item(0).u3();
      d2k var37 = this.n5(var4, var12, var7, var32, var36.u3(), var31).u3();
      if (var31.a6()) {
         d2k.n5(this.n5(var4), var36).n5(var37);
         var37.n5 += var32;
      }

      r4d var39 = (r4d)var3.get_Item(var3.size() - 1);
      if (var39.l6.n5.getSpaceWithin() < 100.0F && var39.l6.n5.getSpaceWithin() > 0.0F) {
         var37 = new d2k((float)com.aspose.slides.ms.System.q1.n5((double)(var37.n5), (int)(4)), var4.s7() - (var4.l6.n5.getSpaceBefore() == 0.0F ? var4.n3() : var4.u9));
      } else {
         var37 = new d2k((float)com.aspose.slides.ms.System.q1.n5((double)(var37.n5), (int)(4)), (float)com.aspose.slides.ms.System.q1.n5((double)(var37.l6 - var4.a6() + var4.h0.l6), (int)(4)));
      }

      float var40;
      if (var19) {
         if (var3.size() > 1) {
            var40 = var32 + var4.k5() - var5.n5.getMarginLeft();
         } else {
            var40 = var37.n5 + var12;
         }
      } else {
         var40 = com.aspose.slides.ms.System.d2.k5(var1.getParagraphFormat().getIndent())
            ? var37.n5 + var4.k5() - var5.n5.getMarginLeft()
            : var37.n5 + var4.k5() - (var1.getParagraphFormat().getIndent() + var5.n5.getMarginLeft());
      }

      var32 = com.aspose.slides.ms.System.q1.n5(var5.n5.getMarginLeft(), var34);

      for (int var24 = 1; var24 < var3.size(); var24++) {
         r4d var25 = (r4d)var3.get_Item(var24);
         d2k var26 = this.n5(var25, var12, var7, var32, var2.l6.get_Item(var24).u3(), var31).u3();
         if (var26.n5 + var25.k5() - var32 > var40) {
            var40 = var26.n5 + var25.k5() - var32;
         }

         if (var26.n5 < var37.n5) {
            var37.n5 = var26.n5;
         }

         if (var26.l6 < var37.l6) {
            var37.l6 = var26.l6 - var25.a6() + var25.h0.l6;
         }
      }

      float var41 = var39.s7() - var4.s7() + var4.u9 + var39.h0.l6;
      if (var4.l6.n5.getSpaceBefore() < 0.0F) {
         var41 -= var4.l6.n5.getSpaceBefore();
      }

      if (var39.l6.n5.getSpaceWithin() < 100.0F && var39.l6.n5.getSpaceWithin() > 0.0F) {
         var41 = var39.s7() - var4.s7() + (var4.l6.n5.getSpaceBefore() == 0.0F ? var4.n3() + var39.y4() : var4.u9 + var39.h0.l6);
      }

      if (var3.size() > 0) {
         float var43 = this.n5((r4d)var3.get_Item(0), var9);
         var37.l6 -= var43;
         var41 += var43;
         var41 += this.l6((r4d)var3.get_Item(var3.size() - 1), var9);
      }

      if (!this.a0) {
         return new s4s(var37.n5, var37.l6, var40 - var37.n5, var41);
      }

      if (var39.l6.n5.getSpaceWithin() >= 100.0F && var4.l6.n5.getSpaceBefore() < 0.0F) {
         var41 += var4.l6.n5.getSpaceBefore();
      }

      com.aspose.slides.internal.o9b.y1 var44 = var2.n5.get_Item(0).n5.y4();

      for (int var45 = 1; var45 < var2.n5.size(); var45++) {
         var44.k5(com.aspose.slides.ms.System.q1.l6(var2.n5.get_Item(var45).n5.x8(), var44.x8()));
         var44.l6(com.aspose.slides.ms.System.q1.n5(var2.n5.get_Item(var45).n5.s7(), var44.s7()));
      }

      return new s4s(var44.x8(), var37.l6, var44.s7(), var41);
   }

   private float n5(r4d var1, TextParam var2) {
      float var3 = 0.0F;
      e4z var4 = null;
      float var5 = 0.0F;
      ReadOnlyCollection var6 = var1.c8;
      IGenericEnumerator var7 = var6.iterator();

      try {
         while (var7.hasNext()) {
            m4i var8 = (m4i)var7.next();
            byte var9 = var1.k5.k5();
            TextParam var10 = this.n5(var9, var8);
            if (var10.k5() != 0) {
               short var11 = var10.k5();
               if (var11 > 0 && var11 > var3) {
                  var4 = var10.d2();
                  var3 = var11;
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      if (var3 != 0.0F && var4 != null) {
         com.aspose.slides.internal.o9b.n3 var15 = var4.n5();
         int var16 = var15.x8();
         com.aspose.slides.internal.o9b.y4 var17 = var15.l6();
         float var18 = var2.t4();
         float var12 = (float)var17.k5(var16) / var17.h0(var16) * var18;
         var5 = var12 * var3 / 100.0F;
      }

      return var5;
   }

   private float l6(r4d var1, TextParam var2) {
      float var3 = 0.0F;
      e4z var4 = null;
      float var5 = 0.0F;
      ReadOnlyCollection var6 = var1.c8;
      IGenericEnumerator var7 = var6.iterator();

      try {
         while (var7.hasNext()) {
            m4i var8 = (m4i)var7.next();
            byte var9 = var1.k5.k5();
            TextParam var10 = this.n5(var9, var8);
            if (var10.k5() != 0) {
               short var11 = var10.k5();
               if (var11 < 0 && var11 < var3) {
                  var4 = var10.d2();
                  var3 = var11;
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      if (var3 != 0.0F && var4 != null) {
         com.aspose.slides.internal.o9b.n3 var15 = var4.n5();
         int var16 = var15.x8();
         com.aspose.slides.internal.o9b.y4 var17 = var15.l6();
         float var18 = var2.t4();
         float var12 = (float)var17.k5(var16) / var17.h0(var16) * var18;
         var5 = var12 * (var3 * -1.0F) / 100.0F;
      }

      return var5;
   }

   private com.aspose.slides.internal.o9b.f2 n5(c9g var1, t3x var2) {
      float var3 = var2.getBullet().getHeight();
      float var4 = (var3 < 0.0F ? k5(-var3, this.q0) : k5(var1.h0(), this.q0)) * var3 / 100.0F * 0.7F;
      float var5 = 0.0F;
      PPImage var6 = (PPImage)var2.getBullet().getFillFormat().getPictureFillFormat().getPicture().getImage();
      if (var6 != null) {
         var5 = (float)var6.getWidth() / var6.getHeight() * var4;
      }

      return new com.aspose.slides.internal.o9b.f2(var5, var4);
   }

   private o1c k5(Paragraph var1) {
      o1c var2 = new o1c();

      for (int var3 = 0; var3 < this.m3; var3++) {
         int var4 = var3 + 1 < this.w1.length ? this.w1[var3 + 1] : this.n3.length;

         for (int var5 = this.w1[var3]; var5 < var4; var5++) {
            r4d var6 = this.n3[var5];
            e2n var7 = var6.l6;
            if (var7.l6 == var1) {
               var2.n5.addItem(var6);
               var2.l6.addItem(this.n5(var3, var4, this.n3).u3());
            }
         }
      }

      return var2;
   }

   final String[] k5() {
      List var1 = new List();
      Dictionary var2 = this.z3();
      Dictionary$Enumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            KeyValuePair var4 = (KeyValuePair)var3.next();
            com.aspose.slides.internal.l7h.a5 var5 = new com.aspose.slides.internal.l7h.a5();
            List$Enumerator var6 = ((List)var4.getValue()).iterator();

            try {
               while (var6.hasNext()) {
                  r4d var7 = (r4d)var6.next();
                  var5.n5(e5a.n5(var7.k5, var7.u3));
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                  var6.dispose();
               }
            }

            var1.addItem(var5.toString());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return (String[])var1.toArray(new String[0]);
   }

   private Dictionary<Integer, List<r4d>> z3() {
      Dictionary var1 = new Dictionary();

      for (int var2 = 0; var2 < this.m3; var2++) {
         int var3 = var2 + 1 < this.w1.length ? this.w1[var2 + 1] : this.x8.length;
         List var4 = new List();

         for (int var5 = this.w1[var2]; var5 < var3; var5++) {
            var4.addItem(this.x8[var5]);
         }

         var1.set_Item(var2, var4);
      }

      return var1;
   }

   private d2k n5(int var1, int var2) {
      return this.n5(var1, var2, this.x8);
   }

   private d2k n5(int var1, int var2, r4d[] var3) {
      float var4 = (this.l6 + this.z8) * var1;
      float var5 = 0.0F;
      int var6 = this.w1[var1];
      if (var6 < var2) {
         var5 = -(var3[var6].s7() - var3[this.w1[0]].n3());
      }

      return new d2k(var4, var5);
   }

   final boolean u3() {
      if (this.a6() == 4) {
         return true;
      } else {
         return ((Presentation)this.n5.getPresentation()).m3() == 0 && !this.n5.n5() ? this.a6() == 1 : false;
      }
   }

   final d2k n5(r4d var1, float var2, byte var3, float var4, d2k var5, f3v var6) {
      d2k var7 = d2k.n5(this.n5(var1), var5).u3();
      var7.n5 += var4;
      if (var6.l6()) {
         this.n5(var7.u3(), var1, var2, var3, var6.k5()).n5(var7);
      }

      t3x var8 = var1.l6.n5;
      if (!var8.getRightToLeft()) {
         return var7;
      }

      float var9 = var1.x8() + var1.k5() - (var7.n5 - var1.x8()) - var2;
      if (var8.getAlignment() == 3 || var8.getAlignment() == 4) {
         var9 += this.z1 - var1.k5();
      }

      return new d2k(var9, var7.l6);
   }

   private d2k n5(r4d var1) {
      t3x var2 = var1.l6.n5;
      float var3 = var2.getAlignment() == 2 ? com.aspose.slides.ms.System.q1.n5(this.z3.n5) : this.z3.n5;
      if (var2.getRightToLeft()) {
         var3 = -var3;
      }

      return d2k.n5(new d2k(var3, this.z3.l6), var1.t2());
   }

   private d2k n5(d2k var1, r4d var2, float var3, byte var4, boolean var5) {
      d2k var6 = var1.u3();
      if (!var5) {
         var6.n5();
         if (this.z1() && var4 != 1) {
            var6.l6 = var6.l6 + (var2.n3() - var3);
         }
      } else {
         var6.n5 += var3 / 4.0F;
      }

      return var6;
   }

   private com.aspose.slides.internal.w0.c8 n5(i2k var1) {
      r4d var2 = var1.c8();
      com.aspose.slides.internal.o9b.f2 var3 = var1.l6().c8().a6();
      float var4 = var1.y4().l6;
      f3v var5 = var1.x8();
      int var6 = com.aspose.slides.internal.v6g.k5.u3((var2.l6() + 0.001F - var2.a6()) / var2.a6(), 13);
      ITextFrameFormatEffectiveData var7 = this.n5.getTextFrameFormat().getEffective();
      float var8 = 0.0F;
      float var9 = this.c4.l6 - var3.k5() * this.x8.length;
      if (this.m1 == 1) {
         var9 /= 2.0F;
      } else if (this.m1 == 0) {
         var9 = 0.0F;
      }

      float var10 = 0.0F;
      if (var5.n5()) {
         var9 = 0.0F;
         var8 = (this.z3.l6 + var2.s7()) * 2.0F - var3.k5() + var2.y4() - (var2.a6() - var3.k5()) / 2.0F;
         if (!com.aspose.slides.ms.System.t9.h0(var1.w1().charAt(0))) {
            var8 -= var2.y4() / 2.0F;
         }

         if (com.aspose.slides.ms.System.t9.x8(var1.w1().charAt(0)) && com.aspose.slides.internal.n2d.u9.z8(var1.w1().charAt(0))) {
            var9 -= var3.k5() / 2.0F;
            var10 -= var3.l6() / 2.0F;
         }
      } else if (this.a6() != 6 && !this.n5.h0()) {
         var8 = this.c4.l6 + this.z3.l6 + var4 - (float)var7.getMarginLeft();
         var8 -= (var6 + 2) * var2.y4();
         var8 += var3.l6() / 2.0F;
         var9 = -var9;
         if (this.m1 == 2) {
            var9 += (float)var7.getMarginLeft();
         }
      } else {
         var8 = var3.l6() + this.z3.l6 + var4 + (float)var7.getMarginRight();
         var8 += var6 * var2.a6() * 2.0F;
         var8 += var6 * var2.y4();
         var8 -= var3.l6() / 2.0F;
      }

      com.aspose.slides.internal.w0.c8 var11 = new com.aspose.slides.internal.w0.c8(1.0F, 0.0F, 0.0F, 1.0F, var3.l6() + var10, var3.k5() + var8 + var9);
      var11.n5(270.0F);
      return var11;
   }

   final byte a6() {
      return this.n5.getTextFrameFormat().getEffective().getTextVerticalType();
   }

   private void n5(
      e3 var1,
      s5u var2,
      float var3,
      float[] var4,
      float[] var5,
      float var6,
      IFillFormatEffectiveData var7,
      ILineFormatEffectiveData var8,
      a1v var9,
      com.aspose.slides.internal.o9b.w1 var10,
      TextParam var11,
      float var12,
      float var13,
      float var14,
      boolean var15
   ) {
      com.aspose.slides.internal.x4g.s7 var16 = new com.aspose.slides.internal.x4g.s7();
      com.aspose.slides.internal.o9b.m3 var17 = new com.aspose.slides.internal.o9b.m3(com.aspose.slides.internal.o9b.c8.m3().o8(), var3);
      if (var4 != null) {
         var17.n5(var4);
      }

      if (var5 != null) {
         var17.l6(var5);
      }

      boolean var18 = true;
      if (com.aspose.slides.ms.System.n1.k5(var6)) {
         if (var4 == null && var5 == null) {
            var18 = false;
            float var19 = var3 / 2.0F;
            float var20 = var14 - var19;
            float var21 = var14 + var19;
            var16.k5(
               new com.aspose.slides.internal.o9b.w1[]{
                  new com.aspose.slides.internal.o9b.w1(var12, var20),
                  new com.aspose.slides.internal.o9b.w1(var13, var20),
                  new com.aspose.slides.internal.o9b.w1(var13, var21),
                  new com.aspose.slides.internal.o9b.w1(var12, var21)
               }
            );
         } else {
            var16.l6(var12, var14, var13, var14);
         }
      } else {
         float var23 = var12;
         float var25 = var6 / 2.0F;

         for (float var31 = var6 * 2.0F; var23 < var13; var23 += var31) {
            var16.l6(var23, var14 - var25, var23 + var6, var14 + var25);
            var16.l6(var23 + var6, var14 + var25, var23 + var31, var14 - var25);
         }
      }

      if (var18) {
         com.aspose.slides.internal.n2d.y4.n5(var16, var17);
      }

      a1v var24 = var9;
      if (var7 != null) {
         var24 = a1v.n5(new j5m(this.r4.cloneT(), var1.q0(), null, this.a6, var2), var7, (byte)1, null);
      }

      try {
         if (var15) {
            if (var11.x8() && var11.x8 != null) {
               z2r var29 = new z2r(var11.x8, true);
               var29.n5(var1, var16, var11);
            }

            if (var11.o0() && var11.n3 != null) {
               c8k var30 = new c8k(var11.n3);
               var30.n5(var1, var16, var11);
            }
         } else {
            if (var11.o0()) {
               c8k var26 = new c8k(var11.t2);
               var26.n5(var1, var16, var11);
            }

            if (var11.b3()) {
               q1k var27 = new q1k(var11.c8);
               var27.n5(var1, var16, var11, var10.u3());
            }

            if (var11.x8() && var11.s7 != null) {
               z2r var28 = new z2r(var11.s7);
               var28.n5(var1, var16, var11);
            }

            var1.n5(
               var16,
               var8 != null && var8.getFillFormat().getFillType() > 0 ? new l6v(new j5m(this.r4.cloneT(), var1.q0(), null, this.a6, var2), var8, 0) : null,
               var24
            );
         }
      } catch (RuntimeException var22) {
         if (!com.aspose.slides.internal.v6g.k5.l6(var1, j0b.class)) {
            throw var22;
         }
      }
   }

   private void n5(
      e3 var1,
      s5u var2,
      byte var3,
      float var4,
      IFillFormatEffectiveData var5,
      ILineFormatEffectiveData var6,
      a1v var7,
      com.aspose.slides.internal.o9b.y1 var8,
      TextParam var9,
      float var10,
      float var11,
      float var12,
      boolean var13
   ) {
      if (var3 > 0 && !(var4 <= 0.0F)) {
         float var14 = var4 / 20.0F;
         float[] var15 = null;
         float[] var16 = null;
         float var17 = Float.NaN;
         switch (var3) {
            case 1:
            case 2:
               var14 = var4 * 0.060000002F;
               break;
            case 3:
               var14 = var4 * 0.13F;
               var15 = a3;
               break;
            case 4:
               var14 = var4 * 0.13F;
               break;
            case 5:
               var14 = var4 * 0.060000002F;
               var16 = b3;
               break;
            case 6:
               var14 = var4 * 0.13F;
               var16 = o0;
               break;
            case 7:
               var14 = var4 * 0.060000002F;
               var16 = z7;
               break;
            case 8:
               var14 = var4 * 0.13F;
               var16 = v4;
               break;
            case 9:
               var14 = var4 * 0.060000002F;
               var16 = u6;
               break;
            case 10:
               var14 = var4 * 0.13F;
               var16 = t1;
               break;
            case 11:
               var14 = var4 * 0.060000002F;
               var16 = a5;
               break;
            case 12:
               var14 = var4 * 0.13F;
               var16 = h2;
               break;
            case 13:
               var14 = var4 * 0.060000002F;
               var16 = v0;
               break;
            case 14:
               var14 = var4 * 0.13F;
               var16 = f0;
               break;
            case 15:
               var14 = var4 * 0.01F;
               var17 = var4 * 0.13F - var14;
               break;
            case 16:
               var14 = var4 * 0.02F;
               var17 = var4 * 0.13F - var14;
               break;
            case 17:
               var14 = var4 * 0.060000002F;
               var15 = p3;
               var17 = var4 * 0.13F - var14;
         }

         var12 += var4 / 10.0F;
         this.n5(var1, var2, var14, var15, var16, var17, var5, var6, var7, var8.u9().u3(), var9, var10, var11, var12, var13);
      }
   }

   private void n5(
      e3 var1,
      s5u var2,
      byte var3,
      IFillFormatEffectiveData var4,
      ILineFormatEffectiveData var5,
      com.aspose.slides.internal.o9b.w1 var6,
      TextParam var7,
      float var8,
      float var9,
      float var10,
      boolean var11
   ) {
      float var12 = Float.NaN;
      float[] var13 = null;
      e4z var14 = var7.d2();
      float var15 = (float)var14.n5().l6().k5(var14.k5()) / var14.n5().l6().h0(var14.k5()) * var14.n5().n5(var1.a0());
      switch (var3) {
         case 1:
            var12 = var15 * 0.060000002F;
            break;
         case 2:
            var12 = var15 * 0.060000002F * 3.0F;
            var13 = x9;
      }

      var10 -= var15 / 4.0F;
      this.n5(var1, var2, var12, var13, null, Float.NaN, var4, var5, var7.u3(), var6.u3(), var7, var8, var9, var10, var11);
   }

   private void n5(e3 var1, List<j5u$n5> var2, com.aspose.slides.internal.o9b.y1 var3, float[] var4, s5u var5) {
      while (var2.size() > 0) {
         j5u$n5 var6 = (j5u$n5)var2.get_Item(var2.size() - 1);
         var2.removeAt(var2.size() - 1);
         e4z var7 = var6.l6.d2();
         com.aspose.slides.internal.o9b.f2 var8 = this.s3.n5(var6.n5, var7, var6.l6, Integer.MIN_VALUE).a6();
         this.l6(var1, var6.n5, new com.aspose.slides.internal.o9b.y1(var3.x8() + var4[0], var3.n3(), var8.l6(), var3.k5()), var6.l6, var5);
         var4[0] += var8.l6();
      }
   }

   final String n5(e3 var1, b4o var2, com.aspose.slides.internal.o9b.y1 var3, TextParam var4, s5u var5) {
      String var6;
      if (!com.aspose.slides.ms.System.d1.n5(var2.n5) && com.aspose.slides.internal.v6g.k5.l6(var1, r1c.class)) {
         var6 = var2.l6;
      } else {
         var6 = var2.n5();
      }

      return this.n5(var1, var6, var3.y4(), var4, var5);
   }

   final String n5(e3 var1, String var2, com.aspose.slides.internal.o9b.y1 var3, TextParam var4, s5u var5) {
      e4z var6 = var4.d2();
      String var7 = var6.n5().l6().a6();
      var2 = n5(var2, var7);
      if (var2.length() > 0 && var7.equalsIgnoreCase("Futura Medium")) {
         var2 = var2.replaceAll("…", "...");
      }

      if (var2.length() == 0) {
         this.l6(var1, var2, var3.y4(), var4, var5);
         n5(false);
         return var4.z3();
      }

      u8b var8 = null;
      List var9 = new List();
      List var10 = new List();
      List var11 = new List();
      int var12 = var2.length();
      int var13 = 0;
      int var14 = 0;
      TextParam var15 = var4;
      boolean var16 = false;
      float var17 = 0.0F;
      float var18 = 0.0F;

      while (var13 < var12) {
         boolean var19 = com.aspose.slides.ms.System.t9.a6(var2, var13);
         int var20 = var19 ? com.aspose.slides.ms.System.t9.n5(var2.charAt(var13), var2.charAt(var13 + 1)) : var2.charAt(var13);
         TextParam var21 = var4;
         boolean var22 = false;
         boolean var23 = false;
         boolean var24 = com.aspose.slides.internal.n2d.u9.n5.containsItem((char)var20);
         if (var24) {
            switch (var20 & 3) {
               case 1:
                  var22 = var10.size() == 0;
                  var16 |= var22;
                  var10.addItem((byte)1);
                  break;
               case 2:
                  var22 = var10.size() == 0;
                  var16 |= var22;
                  if (var13 + 1 < var12 && var2.charAt(var13 + 1) == 8237) {
                     var10.addItem((byte)0);
                     var13++;
                     break;
                  }

                  var10.addItem((byte)-1);
                  break;
               default:
                  int var25 = var10.size();
                  if (var25 > 0) {
                     if (--var25 == 0) {
                        var23 = (Byte)var10.get_Item(0) < 0;
                        var22 = true;
                     }

                     var10.removeAt(var25);
                  }
            }

            if (!var22) {
               var13 += var19 ? 2 : 1;
               continue;
            }
         } else {
            if (this.s3.n5(var6, var4, var20)) {
               if (var8 == null) {
                  if (var4.y1()) {
                     var4.a0();
                     var6 = var4.d2();
                  }

                  var8 = new u8b((Presentation)this.a6.getPresentation(), var4);
                  String[] var43 = var8.n5();
                  if (var43.length > 0) {
                     n5(this.u3, var4.z3(), com.aspose.slides.ms.System.u3.n5(var43));
                  }
               }

               var21 = var8.n5(var20);
            }

            if (var16) {
               var15 = var21;
               var16 = false;
            }
         }

         var22 |= var15 != var21;
         if (var22) {
            int var44 = var13 + (var20 == 8236 ? 1 : 0);
            if (var14 < var44) {
               String var26 = "";
               if (var11.size() > 0) {
                  List$Enumerator var27 = var11.iterator();

                  try {
                     while (var27.hasNext()) {
                        byte var28 = com.aspose.slides.internal.v6g.k5.u3(var27.next(), byte.class);
                        if (var28 <= 0) {
                           var26 = com.aspose.slides.ms.System.d1.l6(var26, '\u202e');
                        }

                        if (var28 >= 0) {
                           var26 = com.aspose.slides.ms.System.d1.l6(var26, '\u202d');
                        }
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var27, IDisposable.class)) {
                        var27.dispose();
                     }
                  }

                  var11.clear();
               }

               var26 = com.aspose.slides.ms.System.d1.n5(var26, com.aspose.slides.ms.System.d1.l6(var2, var14, var44 - var14));
               if (var10.size() > 0) {
                  var11.addRange(var10);
                  var23 = (Byte)var10.get_Item(0) < 0;
                  var26 = com.aspose.slides.ms.System.d1.n5(var26, com.aspose.slides.ms.System.d1.n5('\u202c', var10.size()));
               }

               if (var23) {
                  var9.addItem(new j5u$n5(var26, var15));
               } else {
                  if (var9.size() > 0) {
                     float[] var46 = new float[]{var18};
                     this.n5(var1, var9, var3.y4(), var46, var5);
                     var18 = var46[0];
                     var9.clear();
                  }

                  if (var14 > 0 && com.aspose.slides.ms.System.o5.n5(var15.w1(), new com.aspose.slides.ms.System.o5<>(true))) {
                     var15.l6(new com.aspose.slides.ms.System.o5<>(false));
                  }

                  e4z var47 = var15.d2();
                  com.aspose.slides.internal.o9b.f2 var48 = this.s3.n5(var26, var47, var15, Integer.MIN_VALUE).a6();
                  this.l6(var1, var26, new com.aspose.slides.internal.o9b.y1(var3.x8() + var18, var3.n3(), var48.l6(), var3.k5()), var15, var5);
                  var18 += var48.l6();
                  var17 += var48.l6();
               }

               var14 = var44;
            }

            var15 = var21;
         }

         var13 += var19 ? 2 : 1;
      }

      if (var14 < var13) {
         if (var9.size() > 0) {
            float[] var33 = new float[]{var18};
            this.n5(var1, var9, var3.y4(), var33, var5);
            var18 = var33[0];
            var9.clear();
         }

         String var34 = com.aspose.slides.ms.System.d1.l6(var2, var14, var13 - var14);
         if (var14 > 0 && com.aspose.slides.ms.System.o5.n5(var15.w1(), new com.aspose.slides.ms.System.o5<>(true))) {
            var15.l6(new com.aspose.slides.ms.System.o5<>(false));
         }

         e4z var37 = var15.d2();
         com.aspose.slides.internal.o9b.f2 var39 = this.s3.n5(var34, var37, var15, Integer.MIN_VALUE).a6();
         this.l6(var1, var34, new com.aspose.slides.internal.o9b.y1(var3.x8() + var18, var3.n3(), var39.l6(), var3.k5()), var15, var5);
      }

      if (var10.size() > 0) {
         throw new ArgumentException(
            com.aspose.slides.ms.System.d1.n5(new String[]{"Input string hasn't enough (", com.aspose.slides.ms.System.a3.l6(var10.size()), ") direction close-code!!!"})
         );
      }

      if (var8 != null) {
         e4z var35 = null;
         e4z[] var38 = new e4z[]{var35};
         boolean var40 = var8.n5(var38);
         var35 = var38[0];
         if (var40) {
            return var35.n5;
         }
      }

      n5(false);
      return var4.z3();
   }

   static String n5(String var0, String var1) {
      if (var0.length() == 1
         && var0.charAt(0) < '\uf000'
         && (
            var1.equalsIgnoreCase("Wingdings")
               || var1.equalsIgnoreCase("Wingdings 2")
               || var1.equalsIgnoreCase("Wingdings 3")
               || var1.equalsIgnoreCase("Webdings")
         )) {
         n5(true);
         if (var1.equalsIgnoreCase("Wingdings") && var0.charAt(0) == 8226) {
            return Character.toString('\u0095');
         } else if (var1.equalsIgnoreCase("Wingdings") && var0.charAt(0) == 11045) {
            return Character.toString('w');
         } else if (var1.equalsIgnoreCase("Wingdings") && var0.charAt(0) == 10065) {
            return Character.toString('q');
         } else if (var1.equalsIgnoreCase("Wingdings") && var0.charAt(0) == 10070) {
            return Character.toString('v');
         } else if (var1.equalsIgnoreCase("Wingdings") && var0.charAt(0) == 9632) {
            return Character.toString('n');
         } else if (var1.equalsIgnoreCase("Wingdings") && var0.charAt(0) == 10004) {
            return Character.toString('ü');
         } else {
            return var1.equalsIgnoreCase("Wingdings") && var0.charAt(0) == 11162 ? Character.toString('Ø') : String.valueOf((char)(var0.charAt(0) + '\uf000'));
         }
      } else {
         return var0;
      }
   }

   private void l6(e3 var1, String var2, com.aspose.slides.internal.o9b.y1 var3, TextParam var4, s5u var5) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, q4b.class)) {
         Portion var6 = var4.u3;
         if (var6 != null) {
            var5.n5((q4b)var1, var6, this.n5);
         }
      }

      this.s3.n5(var1, var2, var3.y4(), var4);
   }

   private static void n5(ISaveOptions var0, String var1, IGenericList<String> var2) {
      if (var0 != null && var0.getWarningCallback() != null) {
         com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5();
         var3.n5("{");
         IGenericEnumerator var4 = var2.iterator();

         try {
            while (var4.hasNext()) {
               String var5 = (String)var4.next();
               var3.n5(com.aspose.slides.ms.System.d1.n5(new String[]{var5, ","}));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }

         var3.l6(var3.l6() - 1, 1);
         var3.n5("}");
         com.aspose.slides.internal.n8e.u6 var9 = new com.aspose.slides.internal.n8e.u6(
            com.aspose.slides.ms.System.d1.n5("Font will be substituted from {0} to {1}",new Object[]{ var1, var3}), 1
         );
         var9.sendWarning(var0.getWarningCallback());
      }
   }

   private TextParam n5(s5u var1, byte var2, m4i var3, String var4) {
      return this.p8.n5(var1, var2, var3, var4, this.q0);
   }

   final TextParam n5(byte var1, m4i var2) {
      return this.p8.n5(null, var1, var2, null, this.q0);
   }

   final TextParam n5(y6e var1) {
      TextParam var2 = this.p8.n5(var1, this.q0);
      var2.n5(var1.l6());
      return var2;
   }

   final TextParam n5(m4i var1, byte var2, char var3) {
      return this.p8.n5(var1, var2, var3, this.q0);
   }

   static String n5(IFontData var0, IFontSchemeEffectiveData var1) {
      if (var0 == null) {
         return "Arial";
      }

      String var2 = var0.getFontName();
      if (com.aspose.slides.ms.System.d1.n5(var2)) {
         return "Arial";
      }

      if (var2.charAt(0) == '+') {
         IFontData var3 = null;
         switch (j9.n5(var2)) {
            case 0:
               var3 = var1.getMinor().getLatinFont();
               break;
            case 1:
               var3 = var1.getMinor().getEastAsianFont();
               break;
            case 2:
               var3 = var1.getMinor().getComplexScriptFont();
               break;
            case 3:
               var3 = var1.getMajor().getLatinFont();
               break;
            case 4:
               var3 = var1.getMajor().getEastAsianFont();
               break;
            case 5:
               var3 = var1.getMajor().getComplexScriptFont();
         }

         var2 = var3 != null ? var3.getFontName() : "Arial";
      }

      return var2;
   }

   static float k5(float var0, float var1) {
      float var2 = var0 * var1;
      if (var1 != 1.0F) {
         var2 = (float)com.aspose.slides.ms.System.q1.n5((double)(var2), (short)((short)1));
      }

      return var2;
   }

   static float u3(float var0, float var1) {
      return var1 != 1.0F && !(var0 * var1 < 1.0F) ? (float)com.aspose.slides.ms.System.q1.n5((double)(var0 * var1), (short)((short)1)) : var0;
   }

   static FontData n5(m4i var0, String var1) {
      c9g var2 = var0.n5;
      FontData var3 = (FontData)var2.getLatinFont();
      var1 = var1 == null ? null : com.aspose.slides.ms.System.d1.l6(var1);
      boolean var4 = var0.k5 != null
         && var0.k5.k5()
         && var0.k5.getField().getType() != null
         && "slidenum".equals(var0.k5.getField().getType().getInternalString());
      if (!com.aspose.slides.ms.System.d1.n5(var1) && !var4) {
         String var5 = var2.getLanguageId();
         int var6 = 0;
         Fonts$n5 var7 = null;
         Fonts$n5[] var8 = new Fonts$n5[]{var7};
         boolean var9 = !com.aspose.slides.ms.System.d1.n5(var5) && Fonts.l6.tryGetValue(var5, var8);
         var7 = var8[0];
         if (var9) {
            var6 = var7.k5;
         }

         if (var6 == 2 && n5(var1)) {
            var3 = (FontData)var2.getComplexScriptFont();
         }
      }

      return var3;
   }

   private static boolean n5(String var0) {
      for (int var1 = 0; var1 < var0.length(); var1++) {
         char var2 = var0.charAt(var1);
         if (com.aspose.slides.ms.System.t9.h0(var2) && com.aspose.slides.ms.System.u3.l6(com.aspose.slides.ms.System.u3.n5((Object)(e5)), var2) < 0) {
            return false;
         }
      }

      return true;
   }

   static float n5(float var0, float var1, float var2) {
      return var0 >= 0.0F ? var2 * com.aspose.slides.internal.n8e.v4.n5(var0 / 100.0F - var1, 0.0F, Float.POSITIVE_INFINITY) : -var0;
   }

   static float a6(float var0, float var1) {
      return var0 >= 0.0F ? var1 * var0 / 100.0F : -var0;
   }

   static void n5(c9g var0, byte[] var1, ILineFormatEffectiveData[] var2, IFillFormatEffectiveData[] var3) {
      if (var0.getHyperlinkClick() == null && var0.getHyperlinkMouseOver() == null) {
         var1[0] = var0.getFontUnderline();
      } else if (var0.getHyperlinkClick() != null && !((Hyperlink)var0.getHyperlinkClick()).c8()) {
         var1[0] = 2;
      } else {
         var1[0] = 0;
      }

      if (var0.getHyperlinkClick() == null && var0.getHyperlinkMouseOver() == null) {
         var3[0] = var0.getUnderlineFillFormat();
         var2[0] = var0.getUnderlineLineFormat();
      } else if ((var0.getHyperlinkClick() == null || var0.getHyperlinkClick().getColorSource() != 1)
         && (var0.getHyperlinkMouseOver() == null || var0.getHyperlinkMouseOver().getColorSource() != 1)) {
         var3[0] = null;
         var2[0] = null;
      } else {
         var3[0] = var0.getFillFormat();
         var2[0] = var0.getLineFormat();
      }
   }

   private boolean m1() {
      if (com.aspose.slides.ms.System.o5.n5(this.i1, null)) {
         this.i1 = new com.aspose.slides.ms.System.o5<>(false);

         for (e2n var4 : this.s7) {
            if (v6o.n5(var4) && com.aspose.slides.internal.n2d.u9.y4(var4.c8()) == 2 && !var4.n5.getRightToLeft()) {
               this.i1 = new com.aspose.slides.ms.System.o5<>(true);
               break;
            }
         }
      }

      return this.i1.n5();
   }

   final float u9() {
      return this.t4;
   }

   final int[] h0() {
      return this.w1;
   }

   final float c8() {
      float var1 = 0.0F;

      int var2;
      for (var2 = this.x8.length; var2 > 0; var2--) {
         r4d var3 = this.x8[var2 - 1];
         if (!var3.k5.l6(var3.u3)) {
            break;
         }
      }

      for (int var7 = 0; var7 < this.m3; var7++) {
         int var4 = this.w1[var7];
         int var5 = var7 < this.m3 - 1 ? this.w1[var7 + 1] : this.x8.length;
         if (var2 < var5) {
            var5 = var2;
         }

         if (var4 < var5) {
            float var6 = this.x8[var5 - 1].l6() - this.x8[var4].n5();
            var1 = com.aspose.slides.ms.System.q1.n5((float)(var1), (float)(var6));
         }
      }

      return var1;
   }

   final float t2() {
      return this.t9;
   }

   final boolean s7() {
      return this.y2;
   }

   final float x8() {
      return this.y4;
   }

   public final d2k n3() {
      return this.z3;
   }

   final boolean y4() {
      return this.d5;
   }

   final r4d[] e2() {
      return this.x8;
   }

   final String n5(float var1, float var2, boolean var3) {
      com.aspose.slides.internal.l7h.a5 var4 = new com.aspose.slides.internal.l7h.a5();
      List var5 = new List();
      r4d var8;
      if (this.x8.length > 1) {
         for (int var6 = 0; var6 < this.x8.length; var6++) {
            r4d var7 = this.x8[var6];
            if (!(var7.s7() + var7.a6() < var2)) {
               if (!var3) {
                  var5.addItem(var7);
               }
               break;
            }

            var5.addItem(var7);
         }

         int var11 = var5.size() - 1;

         for (int var13 = 0; var13 < var11; var13++) {
            var4.n5(e5a.n5(((r4d)var5.get_Item(var13)).k5, ((r4d)var5.get_Item(var13)).u3));
         }

         var8 = var5.size() == 0 ? this.x8[0] : (r4d)var5.get_Item(var5.size() - 1);
      } else {
         var8 = this.x8[0];
      }

      char var12 = 8230;
      if (var8 != null) {
         y6e var14 = var8.k5;
         byte var9 = com.aspose.slides.internal.n2d.u9.a6(var14.h0());
         com.aspose.slides.internal.l7h.a5 var10 = new com.aspose.slides.internal.l7h.a5(e5a.n5(var14, var8.u3));
         if (this.x8.length == 1 && this.s3.n5(var10.toString(), this.n5(var9, var14.n5())).l6() <= var1) {
            return com.aspose.slides.ms.System.d1.a6(var10.toString(),new char[]{ ' '});
         }

         while (this.s3.n5(com.aspose.slides.ms.System.d1.n5(new Object[]{var10.toString(), var12}), this.n5(var9, var14.n5())).l6() > var1 && var10.l6() > 0) {
            var10.n5(var10.l6() - 1);
         }

         var4.n5((Object)var10);
      }

      return com.aspose.slides.ms.System.d1.n5(new Object[]{com.aspose.slides.ms.System.d1.a6(var4.toString(),new char[]{ ' '}), var12});
   }

   final int t9() {
      return this.m3;
   }

   final boolean z1() {
      return this.n5.getTextFrameFormat().getTextVerticalType() == 3 || this.n5.getTextFrameFormat().getTextVerticalType() == 6;
   }

   final com.aspose.slides.internal.o9b.f2 n5(y6e var1, m4i var2) {
      TextParam var3;
      switch (var1.k5()) {
         case 0:
         default:
            var3 = this.p8.n5(null, var2, null, this.q0);
            break;
         case 1:
            var3 = this.p8.n5((s5u)null, var2, this.q0);
            break;
         case 2:
            var3 = this.p8.l6(null, var2, this.q0);
            break;
         case 3:
            var3 = this.p8.k5(null, var2, this.q0);
      }

      return this.n5(var1.h0(), var3);
   }

   private com.aspose.slides.internal.o9b.f2 n5(int var1, TextParam var2) {
      e4z var3 = var2.d2();
      f7x var4 = this.n5(var3.l6().n5());
      return var4.n5(var1, var2.z1());
   }

   private f7x n5(com.aspose.slides.internal.e1x.i1 var1) {
      f7x var2 = null;
      f7x[] var3 = new f7x[]{var2};
      boolean var4 = !this.y0.tryGetValue(var1, var3);
      var2 = var3[0];
      if (var4) {
         var2 = new f7x(var1);
         var2.n5(" ");
         this.y0.set_Item(var1, var2);
      }

      return var2;
   }

   private y6e n5(y6e var1, y6e var2, boolean var3) {
      y6e var4 = var1.x8();
      y6e var5 = var4;
      if (var2.n5(var5)) {
         var5 = var2;
      }

      if (!var4.l6(var2)) {
         while (
            var5.u3() != 0
               && !com.aspose.slides.internal.n2d.u9.z1(var5.u3())
               && !com.aspose.slides.internal.n2d.u9.z1(var1.u3())
               && !var2.n5(var5.x8())
               && var5.h0() != 57346
               && var3
               && this.n5(var1, var5)
         ) {
            var5 = var5.x8();
            if (var5.l6(var2)) {
               break;
            }
         }
      }

      return var5;
   }

   private boolean n5(y6e var1, y6e var2) {
      byte var3 = var1.k5();
      byte var4 = var2.k5();
      TextParam var5 = this.p8.n5(var1.n5(), var3, var1.u3(), this.q0);
      TextParam var6 = this.p8.n5(var2.n5(), var4, var2.u3(), this.q0);
      c9g var7 = var1.n5().n5;
      return var3 == var4
         && var5.t2() == var6.t2()
         && var5.s7() == var6.s7()
         && var5.x8() == var6.x8()
         && var5.e2() == var6.e2()
         && var5.k5() == var6.k5()
         && var5.t4() == var6.t4()
         && var5.q0() == var6.q0()
         && com.aspose.slides.internal.o9b.c8.n5(var5.l6, var6.l6)
         && com.aspose.slides.internal.o9b.c8.n5(var5.h0(), var6.h0())
         && var5.t9() == var6.t9()
         && com.aspose.slides.ms.System.d1.a6(var5.z3(), var6.z3())
         && com.aspose.slides.ms.System.d1.a6(var5.k5, var6.k5)
         && var5.m1() == var6.m1()
         && com.aspose.slides.ms.System.d1.a6(var5.y2(), var6.y2())
         && var5.l6() == var6.l6()
         && com.aspose.slides.internal.o9b.c8.n5(var5.u9(), var6.u9())
         && var5.k7() == var6.k7()
         && var5.m3() == var6.m3()
         && var7.getFontUnderline() == var2.n5().n5.getFontUnderline()
         && Hyperlink.op_Equality((Hyperlink)var7.getHyperlinkClick(), (Hyperlink)var2.n5().n5.getHyperlinkClick())
         && com.aspose.slides.internal.o9b.c8.n5(var7.u9(), var2.n5().n5.u9())
         && var7.u9.n5(var2.n5().n5.u9);
   }

   static boolean t4() {
      return f2;
   }

   static void n5(boolean var0) {
      f2 = var0;
   }

   public static boolean l6(m4i var0) {
      IPortionCollection var1 = var0.k5.n3().getPortions();
      return var1.getCount() == 0
         ? false
         : var0.k5 != var1.get_Item(var1.getCount() - 1) || var0.l6 != null && !com.aspose.slides.ms.System.d1.l6(var0.l6).isEmpty();
   }

   final IPortionFormat n5(IMathParagraph var1) {
      if (var1 != null && var1.getCount() != 0) {
         Queue var2 = new Queue();
         IGenericEnumerator var3 = var1.iterator();

         try {
            while (var3.hasNext()) {
               IMathBlock var4 = (IMathBlock)var3.next();
               var2.enqueue(var4);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }

         while (var2.size() > 0) {
            IMathElement var15 = (IMathElement)var2.dequeue();
            if (com.aspose.slides.internal.v6g.k5.l6(var15, MathematicalText.class)) {
               return ((MathematicalText)var15).getFormat();
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var15, q8r.class)) {
               q8r var5 = (q8r)var15;
               if (var5.getControlCharacterProperties() != null && var5.getControlCharacterProperties().l6() != null) {
                  return var5.getControlCharacterProperties().l6();
               }
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var15, MathBlock.class)) {
               MathBlock var16 = (MathBlock)var15;
               IGenericEnumerator var6 = var16.iterator();

               try {
                  while (var6.hasNext()) {
                     IMathElement var7 = (IMathElement)var6.next();
                     var2.enqueue(var7);
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                     var6.dispose();
                  }
               }
            }
         }

         return null;
      } else {
         return null;
      }
   }
}
