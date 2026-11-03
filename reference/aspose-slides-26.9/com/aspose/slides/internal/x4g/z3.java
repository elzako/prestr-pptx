package com.aspose.slides.internal.x4g;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidEnumArgumentException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.ms.System.q1;
import java.awt.Paint;
import java.awt.PaintContext;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D.Double;
import java.awt.image.ColorModel;

public final class z3 extends com.aspose.slides.internal.o9b.u3 {
   private u3 l6;
   private boolean k5 = false;
   private a6 u3;
   private int a6;
   private y1 u9 = new y1();
   private boolean h0 = false;
   private boolean c8 = false;
   private boolean t2 = false;
   private double s7 = 45.0;
   private com.aspose.slides.internal.o9b.w1 x8 = new com.aspose.slides.internal.o9b.w1(0.0F, 0.0F);
   private com.aspose.slides.internal.o9b.w1 n3 = new com.aspose.slides.internal.o9b.w1(0.0F, 0.0F);
   private com.aspose.slides.internal.o9b.c8 y4 = new com.aspose.slides.internal.o9b.c8();
   private com.aspose.slides.internal.o9b.c8 e2 = new com.aspose.slides.internal.o9b.c8();

   @Override
   public Paint n5() {
      return this;
   }

   @Override
   public PaintContext createContext(ColorModel cm, Rectangle deviceBounds, Rectangle2D userBounds, AffineTransform xform, RenderingHints hints) {
      return new com.aspose.slides.internal.a0p.l6(this).n5(xform);
   }

   @Override
   public int getTransparency() {
      return this.a6() ? 1 : 3;
   }

   public z3(
      com.aspose.slides.internal.o9b.w1 var1,
      com.aspose.slides.internal.o9b.w1 var2,
      com.aspose.slides.internal.o9b.c8 var3,
      com.aspose.slides.internal.o9b.c8 var4
   ) {
      this(com.aspose.slides.internal.c9b.c8.n5(var1), com.aspose.slides.internal.c9b.c8.n5(var2), var3.o8(), var4.o8());
   }

   public z3(y1 var1, com.aspose.slides.internal.o9b.c8 var2, com.aspose.slides.internal.o9b.c8 var3, float var4) {
      this(var1, var2.o8(), var3.o8(), var4, false);
   }

   public z3(y1 var1, com.aspose.slides.internal.o9b.c8 var2, com.aspose.slides.internal.o9b.c8 var3, float var4, boolean var5) {
      this.n5(var1);
      this.n5(var1, var2, var3, var4, var5, 0);
   }

   public static z3 n5(com.aspose.slides.internal.o9b.y2 var0, com.aspose.slides.internal.o9b.c8 var1, com.aspose.slides.internal.o9b.c8 var2, int var3) {
      return new z3(var0, var1, var2, var3);
   }

   public static z3 n5(y1 var0, com.aspose.slides.internal.o9b.c8 var1, com.aspose.slides.internal.o9b.c8 var2, int var3) {
      return new z3(var0, var1, var2, var3);
   }

   private z3(com.aspose.slides.internal.o9b.y2 var1, com.aspose.slides.internal.o9b.c8 var2, com.aspose.slides.internal.o9b.c8 var3, int var4) {
      if (var4 >= 0 && var4 <= 3) {
         this.n5(y1.n5(var1));
         this.u9 = y1.n5(var1);
         this.n5(this.u9, var2.o8(), var3.o8(), this.l6(var4), false, 0);
      } else {
         throw new InvalidEnumArgumentException("linearGradientMode");
      }
   }

   private z3(y1 var1, com.aspose.slides.internal.o9b.c8 var2, com.aspose.slides.internal.o9b.c8 var3, int var4) {
      if (var4 >= 0 && var4 <= 3) {
         this.n5(var1);
         this.n5(var1.y4(), var2.o8(), var3.o8(), this.l6(var4), false, 0);
      } else {
         throw new InvalidEnumArgumentException("linearGradientMode");
      }
   }

   private z3(
      com.aspose.slides.internal.c9b.c8 var1,
      com.aspose.slides.internal.c9b.c8 var2,
      com.aspose.slides.internal.o9b.c8 var3,
      com.aspose.slides.internal.o9b.c8 var4
   ) {
      com.aspose.slides.internal.o9b.j5 var5 = com.aspose.slides.internal.c9b.c8.a6(var1);
      com.aspose.slides.internal.o9b.j5 var6 = com.aspose.slides.internal.c9b.c8.a6(var2);
      com.aspose.slides.internal.o9b.j5 var7 = com.aspose.slides.internal.c9b.c8.u3(var1);
      com.aspose.slides.internal.o9b.j5 var8 = com.aspose.slides.internal.c9b.c8.u3(var2);
      com.aspose.slides.internal.o9b.w1 var9 = com.aspose.slides.internal.c9b.c8.k5(var1);
      com.aspose.slides.internal.o9b.w1 var10 = com.aspose.slides.internal.c9b.c8.k5(var2);
      if (!var5.equals(var6)) {
         this.n5(var9, var10, var3.o8(), var4.o8(), 0);
      } else if (!var7.equals(var8)) {
         this.n5(var9, var10, var3.o8(), var4.o8(), 0);
      } else {
         this.n5(com.aspose.slides.internal.c9b.c8.k5(var1), com.aspose.slides.internal.c9b.c8.k5(var2), var3.o8(), var4.o8(), 0);
      }
   }

   private void q0() {
      this.l6 = new u3(1);
      this.l6.k5(new float[]{1.0F});
      this.l6.u3(new float[]{1.0F});
   }

   private double l6(int var1) {
      switch (var1) {
         case 0:
         default:
            return 0.0;
         case 1:
            return 90.0;
         case 2:
            return 45.0;
         case 3:
            return 135.0;
      }
   }

   private void z3() {
      this.a6 = 0;
      this.k5(new m1());
      this.u9 = new y1();
      this.k5 = false;
      this.s7 = 45.0;
      this.h0 = false;
      this.u3 = new a6(0);
      this.q0();
   }

   private void m1() {
      Point2D[] var1 = new Point2D[]{new Double(0.0, 0.0), new Double(0.0, 0.0), new Double(0.0, 0.0)};
      java.awt.geom.Rectangle2D.Double var2 = new java.awt.geom.Rectangle2D.Double(this.x8().x8(), this.x8().n3(), this.x8().s7(), this.x8().k5());
      double var3 = Math.toRadians(this.s7);
      double var5 = Math.cos(var3);
      double var7 = Math.sin(var3);
      double var9 = Math.abs(var5);
      double var11 = Math.abs(var7);
      double var13 = var2.getX() + var2.getWidth() / 2.0;
      double var15 = var2.getY() + var2.getHeight() / 2.0;
      double var17 = (var9 * var2.getWidth() + var11 * var2.getHeight()) / var2.getWidth();
      double var19 = (var11 * var2.getWidth() + var9 * var2.getHeight()) / var2.getHeight();
      AffineTransform var21 = this.n3().t2();
      var21.translate(var13, var15);
      var21.rotate(var3);
      var21.scale(var17, var19);
      var21.translate(-var13, -var15);
      this.k5(new m1(var21));
      if (this.h0 && !com.aspose.slides.internal.c9b.u3.n5(var5) && !com.aspose.slides.internal.c9b.u3.n5(var7)) {
         double var22 = var2.getX() + var2.getWidth();
         double var24 = var2.getY() + var2.getHeight();
         var1[0].setLocation(var2.getX(), var2.getY());
         var1[1].setLocation(var22, var2.getY());
         var1[2].setLocation(var2.getX(), var24);
         com.aspose.slides.internal.c9b.u3.n5(var21, var1);
         if (var7 > 0.0 && var5 > 0.0) {
            double var30 = -1.0 / (var2.getWidth() / var2.getHeight() * Math.tan(var3));
            var1[0].setLocation(var1[0].getX(), var30 * (var1[0].getX() - var2.getX()) + var2.getY());
            var1[1].setLocation((var1[1].getY() - var24) / var30 + var22, var1[1].getY());
            var1[2].setLocation((var1[2].getY() - var2.getY()) / var30 + var2.getX(), var1[2].getY());
         } else if (var7 > 0.0 && var5 < 0.0) {
            double var29 = -1.0 / (var2.getWidth() / var2.getHeight() * Math.tan(var3 - (Math.PI / 2)));
            var1[0].setLocation((var1[0].getY() - var24) / var29 + var22, var1[0].getY());
            var1[1].setLocation(var1[1].getX(), var29 * (var1[1].getX() - var22) + var24);
            var1[2].setLocation(var1[2].getX(), var29 * (var1[2].getX() - var2.getX()) + var2.getY());
         } else if (var7 < 0.0 && var5 < 0.0) {
            double var28 = -1.0 / (var2.getWidth() / var2.getHeight() * Math.tan(var3));
            var1[0].setLocation(var1[0].getX(), var28 * (var1[0].getX() - var22) + var24);
            var1[1].setLocation((var1[1].getY() - var2.getY()) / var28 + var2.getX(), var1[1].getY());
            var1[2].setLocation((var1[2].getY() - var24) / var28 + var22, var1[2].getY());
         } else {
            double var26 = -1.0 / (var2.getWidth() / var2.getHeight() * Math.tan(var3 - (Math.PI * 3.0 / 2.0)));
            var1[0].setLocation((var1[0].getY() - var2.getY()) / var26 + var2.getX(), var1[0].getY());
            var1[1].setLocation(var1[1].getX(), var26 * (var1[1].getX() - var2.getX()) + var2.getY());
            var1[2].setLocation(var1[2].getX(), var26 * (var1[2].getX() - var22) + var24);
         }

         this.k5(
            new m1(
               new y1((float)var2.getX(), (float)var2.getY(), (float)var2.getWidth(), (float)var2.getHeight()),
               new com.aspose.slides.internal.o9b.w1[]{
                  new com.aspose.slides.internal.o9b.w1((float)var1[0].getX(), (float)var1[0].getY()),
                  new com.aspose.slides.internal.o9b.w1((float)var1[1].getX(), (float)var1[1].getY()),
                  new com.aspose.slides.internal.o9b.w1((float)var1[2].getX(), (float)var1[2].getY())
               }
            )
         );
      }
   }

   private void n5(
      com.aspose.slides.internal.o9b.w1 var1,
      com.aspose.slides.internal.o9b.w1 var2,
      com.aspose.slides.internal.o9b.c8 var3,
      com.aspose.slides.internal.o9b.c8 var4,
      int var5
   ) {
      boolean var6 = false;
      boolean var7 = false;
      if (var1 != null && var2 != null) {
         this.z3();
         double var8 = 1.0E-5F;
         this.a6 = var5;
         this.y4 = com.aspose.slides.internal.o9b.c8.n5(var3.h0());
         this.e2 = com.aspose.slides.internal.o9b.c8.n5(var4.h0());
         this.h0 = false;
         this.u9.l6(var2.l6() - var1.l6());
         this.u9.n5(var2.k5() - var1.k5());
         this.u9.k5(this.u9.s7() < 0.0F ? var2.l6() : var1.l6());
         this.u9.u3(this.u9.k5() < 0.0F ? var2.k5() : var1.k5());
         if (this.u9.s7() < 0.0F) {
            this.u9.l6(-this.u9.s7());
            var6 = true;
         }

         if (this.u9.k5() < 0.0F) {
            this.u9.n5(-this.u9.k5());
            var7 = true;
         }

         if (this.u9.k5() >= -var8 && this.u9.k5() <= var8) {
            this.u9.n5(this.u9.s7());
            this.u9.u3(this.u9.n3() - this.u9.k5() / 2.0F);
            this.s7 = var6 ? 180.0 : 0.0;
         } else if (this.u9.s7() >= -var8 && this.u9.s7() <= var8) {
            this.u9.l6(this.u9.k5());
            this.u9.k5(this.u9.x8() - this.u9.s7() / 2.0F);
            this.s7 = var7 ? 270.0 : 90.0;
         } else {
            double var10 = this.u9.k5() / this.u9.s7();
            double var12 = Math.atan(var10);
            double var14 = Math.toDegrees(var12);
            if (var6) {
               var14 = 180.0 - var14;
            }

            if (var7) {
               var14 = 360.0 - var14;
            }

            this.s7 = var14;
         }

         this.x8.n5(this.u9.x8());
         this.x8.l6(this.u9.n3());
         this.n3.n5(this.u9.x8() + this.u9.s7());
         this.n3.l6(this.u9.n3());
         this.m1();
      } else {
         throw new ArgumentException("Argument of 'point1' or 'point2' is invalid");
      }
   }

   private void n5(y1 var1, com.aspose.slides.internal.o9b.c8 var2, com.aspose.slides.internal.o9b.c8 var3, double var4, boolean var6, int var7) {
      this.z3();
      this.a6 = var7;
      this.y4 = com.aspose.slides.internal.o9b.c8.n5(var2.h0());
      this.e2 = com.aspose.slides.internal.o9b.c8.n5(var3.h0());
      this.s7 = !java.lang.Double.isNaN(var4) ? var4 % 360.0 : 0.0;
      this.h0 = var6;
      this.x8.n5(var1.x8());
      this.x8.l6(var1.n3());
      this.n3.n5(var1.x8() + var1.s7());
      this.n3.l6(var1.n3());
      this.u9 = var1.y4();
      this.m1();
   }

   private void n5(y1 var1) {
      if (var1.s7() == 0.0 || var1.k5() == 0.0) {
         throw new ArgumentException("rectangle cannot have width or height equal to 0");
      }
   }

   public u3 h0() {
      if (this.l6 == null) {
         return null;
      }

      u3 var1 = new u3();
      var1.k5((float[])this.l6.l6().clone());
      var1.u3((float[])this.l6.k5().clone());
      return var1;
   }

   public void n5(u3 var1) {
      if (var1 == null) {
         throw new NullReferenceException("Value of 'value' cannot be null");
      }

      if (var1.k5().length != var1.l6().length) {
         throw new ArgumentOutOfRangeException("Requested diapason exceeds array size");
      }

      if (var1.k5().length <= 1 || !(q1.n5((double)(q1.n5((float)(var1.k5()[0] - 0.0F))), (int)(7)) > 1.0E-7F) && !(q1.n5((double)(q1.n5((float)(var1.k5()[var1.k5().length - 1] - 1.0F))), (int)(7)) > 1.0E-7F)) {
         u3 var2 = new u3();
         var2.k5((float[])var1.l6().clone());
         var2.u3((float[])var1.k5().clone());
         this.l6 = var2;
         if (this.l6.k5().length > 1) {
            this.t2 = true;
            this.l6(this.k7());
         }
      } else {
         throw new ArgumentException("Parameter's value is invalid");
      }
   }

   private a6 k7() {
      u3 var1 = this.h0();
      com.aspose.slides.internal.o9b.c8 var2 = this.s7()[0];
      com.aspose.slides.internal.o9b.c8 var3 = this.s7()[1];
      float[] var4 = var1.k5();
      float[] var5 = var1.l6();
      a6 var6 = new a6();
      List var7 = new List();
      List var8 = new List();
      int var9 = (var3.s7() & 255) - (var2.s7() & 255);
      int var10 = (var3.x8() & 255) - (var2.x8() & 255);
      int var11 = (var3.n3() & 255) - (var2.n3() & 255);
      int var12 = (var3.y4() & 255) - (var2.y4() & 255);

      for (int var13 = 1; var13 < var5.length - 1; var13++) {
         if (var5[var13] == 1.0F) {
            var5[var13] -= 1.0E-5F;
         }
      }

      for (int var26 = 1; var26 < var5.length; var26++) {
         float var14 = var4[var26 - 1];
         float var15 = var4[var26];
         float var16 = var5[var26 - 1];
         float var17 = var5[var26];
         if (var16 < 0.0F || var17 < 0.0F) {
            throw new NotImplementedException("Support for factors < 0 is not implemented now");
         }

         float var18 = var16 - (int)var16;
         float var19 = var17 - (int)var17;
         if (var18 > 0.0F) {
            var8.add(var14);
            var7.add(
               com.aspose.slides.internal.o9b.c8.n5(
                  (var2.s7() & 255) + (int)(var9 * var18),
                  (var2.x8() & 255) + (int)(var10 * var18),
                  (var2.n3() & 255) + (int)(var11 * var18),
                  (var2.y4() & 255) + (int)(var12 * var18)
               )
            );
         } else {
            var8.add(var14);
            var7.add(var16 < var17 ? var2 : var3);
         }

         float var20 = var17 - var16;
         float var21 = var15 - var14;
         float var22 = var14;
         if (q1.n5(var20) >= 1.0F) {
            float var23 = var21 / Math.abs(var20);
            float var24 = 0.0F;
            if (var18 > 0.0F) {
               if (var20 > 0.0F) {
                  var24 = var23 * var18;
                  var22 -= var24;
               } else {
                  var24 = var23 * (1.0F - var18);
                  var22 -= var24;
               }
            }

            for (int var25 = 0; var25 < (int)Math.abs(var20); var25++) {
               var22 += var23;
               var8.add(var22);
               var7.add(var20 > 0.0F ? var3 : var2);
               var8.add(var22);
               var7.add(var20 > 0.0F ? var2 : var3);
            }
         } else if (var16 != 0.0F && var16 != 1.0F && (int)var16 != (int)var17) {
            float var30 = var21 / Math.abs(var20);
            float var33 = 0.0F;
            if (var18 > 0.0F) {
               if (var20 > 0.0F) {
                  var33 = var30 * var18;
                  var22 -= var33;
               } else {
                  var33 = var30 * (1.0F - var18);
                  var22 -= var33;
               }
            }

            var22 += var30;
            var8.add(var22);
            var7.add(var20 > 0.0F ? var3 : var2);
            var8.add(var22);
            var7.add(var20 > 0.0F ? var2 : var3);
         }

         if (var19 > 0.0F) {
            var8.add(var15);
            var7.add(
               com.aspose.slides.internal.o9b.c8.n5(
                  (var2.s7() & 255) + (int)(var9 * var19),
                  (var2.x8() & 255) + (int)(var10 * var19),
                  (var2.n3() & 255) + (int)(var11 * var19),
                  (var2.y4() & 255) + (int)(var12 * var19)
               )
            );
         } else {
            var8.add(var15);
            var7.add(var16 < var17 ? var3 : var2);
         }
      }

      float[] var27 = new float[var8.size()];

      for (int var28 = 0; var28 < var8.size(); var28++) {
         var27[var28] = (Float)var8.get_Item(var28);
      }

      var6.n5(var27);
      var6.n5((com.aspose.slides.internal.o9b.c8[])var7.toArray(new com.aspose.slides.internal.o9b.c8[0]));
      return var6;
   }

   public boolean c8() {
      return this.k5;
   }

   public void l6(boolean var1) {
      this.k5 = var1;
   }

   public a6 t2() {
      if (!this.c8) {
         throw new ArgumentException(
            "Property must be set to a valid ColorBlend object to use interpolation colors. ColorBlend objects must be constructed with the same number of positions and color values. Positions must be between 0.0 and 1.0, 1.0 indicating the last element in the array."
         );
      } else {
         return this.u3;
      }
   }

   public void n5(a6 var1) {
      this.l6(var1);
      this.l6 = null;
   }

   private void l6(a6 var1) {
      if (var1 == null) {
         throw new ArgumentException("ColorBlend value can not be null");
      }

      if (var1.n5().length < 2) {
         throw new ArgumentException("ColorBlend's colors array length can not be less than 2");
      }

      if (var1.n5().length != var1.l6().length) {
         throw new ArgumentException("ColorBlend's positions and colors arrays must have the same length");
      }

      if (q1.n5((double)(q1.n5((float)(var1.l6()[0] - 0.0F))), (int)(7)) > 1.0E-7F) {
         throw new ArgumentException("The ColorBlend's first position value must be equal to 0.0 (but have " + var1.l6()[0] + ")");
      }

      if (q1.n5((double)(q1.n5((float)(var1.l6()[var1.l6().length - 1] - 1.0F))), (int)(7)) > 1.0E-7F) {
         throw new ArgumentException("The ColorBlend's last position value must be equal to 1.0");
      }

      this.u3 = this.k5(var1);
      this.c8 = true;
   }

   private a6 k5(a6 var1) {
      com.aspose.slides.internal.o9b.c8[] var2 = var1.n5();
      float[] var3 = var1.l6();
      com.aspose.slides.internal.o9b.c8[] var4 = new com.aspose.slides.internal.o9b.c8[var2.length];
      float[] var5 = new float[var3.length];
      var4[0] = var2[0];
      var5[0] = var3[0];
      int var6 = 1;
      float var7 = var3[0];

      for (int var8 = 1; var8 < var2.length; var8++) {
         if (var3[var8] > 1.0F) {
            var4[var6] = var2[var8];
            var5[var6] = var3[var8];
            var6++;
            break;
         }

         if (var3[var8] > var7) {
            var7 = var3[var8];
         }

         if (!(var3[var8] < var7) || var8 + 1 >= var2.length || !(var3[var8 + 1] < var7)) {
            var4[var6] = var2[var8];
            var5[var6] = var3[var8];
            var6++;
         }
      }

      var2 = var4;
      var3 = var5;
      com.aspose.slides.internal.o9b.c8[] var23 = new com.aspose.slides.internal.o9b.c8[var6];
      float[] var9 = new float[var6];
      int var10 = 0;

      for (int var11 = 0; var11 < var6; var11++) {
         if (var11 == 0) {
            var9[var10] = var3[var11];
            var23[var10] = var2[var11];
            var10++;
         } else if (var3[var11] < var3[var11 - 1]) {
            float var12 = 1.0F;
            int var13 = var6 - 1;

            for (int var14 = var11; var14 < var6; var14++) {
               if (var3[var14] > var3[var11 - 1]) {
                  var12 = var3[var14];
                  var13 = var14;
                  break;
               }
            }

            float var29 = (var3[var11 - 1] - var3[var11]) / (var12 - var3[var11]);
            int var15 = (var2[var13].s7() & 255) - (var2[var11].s7() & 255);
            int var16 = (var2[var13].x8() & 255) - (var2[var11].x8() & 255);
            int var17 = (var2[var13].n3() & 255) - (var2[var11].n3() & 255);
            int var18 = (var2[var13].y4() & 255) - (var2[var11].y4() & 255);
            var9[var10] = var3[var11 - 1];
            var23[var10] = com.aspose.slides.internal.o9b.c8.n5(
               (var2[var11].s7() & 255) + (int)(var15 * var29),
               (var2[var11].x8() & 255) + (int)(var16 * var29),
               (var2[var11].n3() & 255) + (int)(var17 * var29),
               (var2[var11].y4() & 255) + (int)(var18 * var29)
            );
            var10++;
         } else {
            if (var3[var11] > 1.0F) {
               var9[var10] = 1.0F;
               com.aspose.slides.internal.o9b.c8 var25 = var2[var11 - 1].o8();
               com.aspose.slides.internal.o9b.c8 var27 = var2[var11].o8();
               float var30 = var3[var11 - 1];
               float var31 = var3[var11];
               int var32 = (var27.s7() & 255) - (var25.s7() & 255);
               int var33 = (var27.x8() & 255) - (var25.x8() & 255);
               int var34 = (var27.n3() & 255) - (var25.n3() & 255);
               int var19 = (var27.y4() & 255) - (var25.y4() & 255);
               var9[var10] = 1.0F;
               float var20 = (1.0F - var30) / (var31 - var30);
               var23[var10] = com.aspose.slides.internal.o9b.c8.n5(
                  (var25.s7() & 255) + (int)(var32 * var20),
                  (var25.x8() & 255) + (int)(var33 * var20),
                  (var25.n3() & 255) + (int)(var34 * var20),
                  (var25.y4() & 255) + (int)(var19 * var20)
               );
               var10++;
               break;
            }

            var9[var10] = var3[var11];
            var23[var10] = var2[var11];
            var10++;
         }
      }

      a6 var24 = new a6(var10);
      com.aspose.slides.internal.o9b.c8[] var26 = new com.aspose.slides.internal.o9b.c8[var10];
      float[] var28 = new float[var10];
      com.aspose.slides.ms.System.u3.n5(var23, var26, var10);
      com.aspose.slides.ms.System.u3.n5(var9, var28, var10);
      var24.n5(var26);
      var24.n5(var28);
      return var24;
   }

   public com.aspose.slides.internal.o9b.c8[] s7() {
      com.aspose.slides.internal.o9b.c8[] var1 = new com.aspose.slides.internal.o9b.c8[]{
         new com.aspose.slides.internal.o9b.c8(), new com.aspose.slides.internal.o9b.c8()
      };
      this.y4.n5(var1[0]);
      this.e2.n5(var1[1]);
      return var1;
   }

   public void n5(com.aspose.slides.internal.o9b.c8[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("colors");
      }

      this.y4 = com.aspose.slides.internal.o9b.c8.n5(var1[0].h0());
      this.e2 = com.aspose.slides.internal.o9b.c8.n5(var1[1].h0());
   }

   public y1 x8() {
      return this.u9;
   }

   public m1 n3() {
      return this.k5();
   }

   public void k5(m1 var1) {
      this.n5(var1);
   }

   public int y4() {
      return this.a6;
   }

   public void n5(int var1) {
      if (var1 == 4) {
         throw new ArgumentException("Argument 'value' is invalid");
      }

      if (var1 >= 0 && var1 <= 4) {
         this.a6 = var1;
      } else {
         throw new InvalidEnumArgumentException("value");
      }
   }

   public void u3(m1 var1) {
      this.n5(var1, 1);
   }

   public void l6(m1 var1, int var2) {
      this.n5(var1, var2);
   }

   public void k5(float var1, float var2) {
      this.l6(var1, var2, 0);
   }

   public void u3(float var1, float var2) {
      if (!(var1 < 0.0F) && !(var1 > 1.0F) && !(var2 < 0.0F) && !(var2 > 1.0F)) {
         this.u9(var1, var2);
         this.t2 = true;
      } else {
         throw new ArgumentException("Parameter is invalid");
      }
   }

   public void a6(float var1, float var2) {
      this.n5(var1, (float)var2);
   }

   @Override
   public Object deepClone() {
      z3 var1 = (z3)this.l6();
      if (this.u3 != null) {
         var1.u3 = new a6();
         if (this.u3.n5() != null) {
            var1.u3.n5((com.aspose.slides.internal.o9b.c8[])this.u3.n5().clone());
         }

         if (this.u3.l6() != null) {
            var1.u3.n5((float[])this.u3.l6().clone());
         }
      }

      if (this.l6 != null) {
         var1.l6 = new u3();
         if (this.l6.l6() != null) {
            var1.l6.k5((float[])this.l6.l6().clone());
         }

         if (this.l6.k5() != null) {
            var1.l6.u3((float[])this.l6.k5().clone());
         }
      }

      var1.n5((com.aspose.slides.internal.o9b.c8[])this.s7().clone());
      var1.s7 = this.s7;
      var1.h0 = this.h0;
      var1.u9 = this.u9.y4();
      var1.c8 = this.c8;
      var1.k5 = this.k5;
      var1.a6 = this.a6;
      var1.x8 = this.x8.u3();
      var1.n3 = this.n3.u3();
      return var1;
   }

   private float n5(float var1, float var2, float var3) {
      float var4 = (float)(2.0 / Math.sqrt(Math.PI));
      float var5 = (var1 - var3) / var2;
      var5 = (float)(var5 / Math.sqrt(2.0));
      float var6 = (float)(
         var5
            - Math.pow(var5, 3.0) / 3.0
            + Math.pow(var5, 5.0) / 10.0
            - Math.pow(var5, 7.0) / 42.0
            + Math.pow(var5, 9.0) / 216.0
            - Math.pow(var5, 11.0) / 1420.0
      );
      return var4 * var6;
   }

   private boolean u9(float var1, float var2) {
      float[] var3 = null;
      float[] var4 = null;
      float var5 = 0.0F;
      short var6 = 511;
      float var7 = 2.0F;
      if (var1 == 0.0F || var1 == 1.0F) {
         var6 = 256;
      }

      if (this.h0().k5().length != var6) {
         var3 = new float[var6];
         if (var3 == null) {
            throw new OutOfMemoryException();
         }

         var4 = new float[var6];
         if (var4 == null) {
            throw new OutOfMemoryException();
         }

         if (this.h0().k5().length != 0) {
            this.l6.k5(null);
            this.l6.u3(null);
         }

         this.l6.k5(var3);
         this.l6.u3(var4);
      }

      if (this.u3.n5().length != 0) {
         this.u3.n5((com.aspose.slides.internal.o9b.c8[])null);
         this.u3.n5((float[])null);
         this.c8 = false;
      }

      if (var1 == 0.0F) {
         float var8 = 1.0F / var7;
         float var9 = 0.5F;
         float var10 = 0.003921569F;
         float var11 = 0.5F * (1.0F - this.n5(1.0F, var8, var9));
         float var12 = 0.5F * (1.0F - this.n5(var1, var8, var9));
         float var13 = var12 - var11;
         this.l6.k5()[0] = var1;
         this.l6.l6()[0] = var2;
         int var14 = 1;

         for (float var17 = var10; var14 < 255; var17 += var10) {
            this.l6.k5()[var14] = var17;
            this.l6.l6()[var14] = var2 / var13 * (0.5F * (1.0F - this.n5(var17, var8, var9)) - var11);
            var14++;
         }

         this.l6.k5()[var6 - 1] = 1.0F;
         this.l6.l6()[var6 - 1] = 0.0F;
      } else if (var1 == 1.0F) {
         float var21 = 1.0F / var7;
         float var24 = 0.5F;
         float var27 = 0.003921569F;
         float var30 = 0.5F * (1.0F + this.n5(0.0F, var21, var24));
         float var33 = 0.5F * (1.0F + this.n5(var1, var21, var24));
         float var36 = var33 - var30;
         this.l6.k5()[0] = 0.0F;
         this.l6.l6()[0] = 0.0F;
         int var39 = 1;

         for (float var18 = var27; var39 < 255; var18 += var27) {
            this.l6.k5()[var39] = var18;
            this.l6.l6()[var39] = var2 / var36 * (0.5F * (1.0F + this.n5(var18, var21, var24)) - var30);
            var39++;
         }

         this.l6.k5()[var6 - 1] = var1;
         this.l6.l6()[var6 - 1] = var2;
      } else {
         float var22 = var1 / (2.0F * var7);
         float var25 = var1 / 2.0F;
         float var28 = var1 / 255.0F;
         this.l6.k5()[0] = 0.0F;
         this.l6.l6()[0] = 0.0F;
         float var31 = 0.5F * (1.0F + this.n5(0.0F, var22, var25));
         float var34 = 0.5F * (1.0F + this.n5(var1, var22, var25));
         float var37 = var34 - var31;
         int var40 = 1;

         for (float var19 = var28; var40 < 255; var19 += var28) {
            this.l6.k5()[var40] = var19;
            this.l6.l6()[var40] = var2 / var37 * (0.5F * (1.0F + this.n5(var19, var22, var25)) - var31);
            var40++;
         }

         this.l6.k5()[var40] = var1;
         this.l6.l6()[var40] = var2;
         var22 = (1.0F - var1) / (2.0F * var7);
         var25 = (1.0F + var1) / 2.0F;
         var28 = (1.0F - var1) / 255.0F;
         var31 = 0.5F * (1.0F - this.n5(1.0F, var22, var25));
         var34 = 0.5F * (1.0F - this.n5(var1, var22, var25));
         var37 = var34 - var31;
         var40++;

         for (float var20 = var1 + var28; var40 < 510; var20 += var28) {
            this.l6.k5()[var40] = var20;
            this.l6.l6()[var40] = var2 / var37 * (0.5F * (1.0F - this.n5(var20, var22, var25)) - var31);
            var40++;
         }

         this.l6.k5()[var6 - 1] = 1.0F;
         this.l6.l6()[var6 - 1] = 0.0F;
      }

      return true;
   }

   public boolean e2() {
      return this.c8;
   }

   public boolean t9() {
      return this.t2;
   }

   public com.aspose.slides.internal.o9b.w1 z1() {
      return this.x8.u3();
   }

   public com.aspose.slides.internal.o9b.w1 t4() {
      return this.n3.u3();
   }
}
