package com.aspose.slides.internal.x4g;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidEnumArgumentException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.internal.o9b.e5;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.ms.System.v4;
import java.awt.Shape;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.PathIterator;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Arc2D.Double;
import java.awt.geom.CubicCurve2D.Float;
import java.util.ArrayList;

public final class s7 extends com.aspose.slides.internal.o9b.n5 implements v4 {
   private int l6 = 0;
   private boolean k5 = true;
   private k7 u3;

   public com.aspose.slides.internal.c9b.n5 l6() {
      return (com.aspose.slides.internal.c9b.n5)this.n5();
   }

   public s7() {
      this(0);
   }

   public s7(int var1) {
      this(new com.aspose.slides.internal.c9b.n5());
      if (var1 == 0 || var1 == 1) {
         this.l6().k5(com.aspose.slides.internal.c9b.n5.n5(var1));
      }

      this.l6 = var1;
      this.u3 = new k7(this.l6());
   }

   public s7(com.aspose.slides.internal.o9b.j5[] var1, byte[] var2) {
      this(var1, var2, 0);
   }

   public s7(com.aspose.slides.internal.o9b.w1[] var1, byte[] var2) {
      this(var1, var2, 0);
   }

   public s7(com.aspose.slides.internal.o9b.j5[] var1, byte[] var2, int var3) {
      this(com.aspose.slides.internal.c9b.c8.n5(var1), var2, var3);
   }

   public s7(com.aspose.slides.internal.o9b.w1[] var1, byte[] var2, int var3) {
      this(com.aspose.slides.internal.c9b.c8.n5(var1), var2, var3);
   }

   s7(com.aspose.slides.internal.c9b.c8[] var1, byte[] var2, int var3) {
      this(new com.aspose.slides.internal.c9b.n5());
      this.l6().k5(com.aspose.slides.internal.c9b.n5.n5(var3));
      this.n5(var1, var2);
      this.u3 = new k7(this.l6());
   }

   private s7(com.aspose.slides.internal.c9b.n5 var1) {
      super(var1);
      this.u3 = new k7(var1);
   }

   private s7(GeneralPath var1) {
      super(new com.aspose.slides.internal.c9b.n5(var1));
      this.u3 = new k7(var1);
   }

   @Override
   public Object deepClone() {
      s7 var1 = new s7((com.aspose.slides.internal.c9b.n5)this.l6().deepClone());
      var1.n5 = this.n5;
      var1.l6 = this.l6;
      var1.k5 = this.k5;
      return var1;
   }

   public int k5() {
      int var1 = this.l6().t9();
      if (var1 != this.l6) {
         return this.l6;
      } else if (var1 == 0) {
         return 0;
      } else {
         return var1 == 1 ? 1 : var1;
      }
   }

   public void n5(int var1) {
      if (var1 >= 0 && var1 <= 1) {
         this.l6().k5(com.aspose.slides.internal.c9b.n5.n5(var1));
         this.l6 = var1;
      } else {
         throw new InvalidEnumArgumentException("value");
      }
   }

   public k7 u3() {
      if (this.n5) {
         this.u3 = new k7(this.l6());
         this.n5 = false;
      }

      return (k7)this.u3.deepClone();
   }

   public com.aspose.slides.internal.o9b.w1[] a6() {
      if (this.h0() < 1) {
         throw new ArgumentException("Parameter is invalid");
      } else {
         return this.u3().n5();
      }
   }

   public byte[] u9() {
      if (this.u3().l6().length < 1) {
         throw new ArgumentException("Parameter is invalid");
      } else {
         return this.u3().l6();
      }
   }

   public int h0() {
      return this.u3().n5().length;
   }

   public void n5(com.aspose.slides.internal.o9b.y2 var1, float var2, float var3) {
      this.n5(var1.s7(), var1.x8(), var1.t2(), var1.l6(), var2, var3);
   }

   public void n5(y1 var1, float var2, float var3) {
      this.n5(var1.x8(), var1.n3(), var1.s7(), var1.k5(), var2, var3);
   }

   public void n5(int var1, int var2, int var3, int var4, float var5, float var6) {
      this.n5((float)var1, (float)var2, (float)var3, (float)var4, var5, var6);
   }

   public void n5(float var1, float var2, float var3, float var4, float var5, float var6) {
      s7 var7 = n5(var1, var2, var3, var4, var5, var6, false);
      this.l6().n5(var7, !this.z3());
      if (var3 != var4 && (var5 == 270.0F || var5 == 90.0F) && var6 == 90.0F) {
         com.aspose.slides.internal.o9b.w1 var8 = this.l6().x8();
         if (var8 != null) {
            this.l6().n5(var8.l6(), var8.k5(), var8.l6(), var8.k5(), var8.l6(), var8.k5());
         }
      }

      this.n5 = true;
   }

   static double n5(double var0, double var2) {
      double var4 = Math.toRadians(var2);
      double var6 = Math.tan(var4);
      double var8 = 1.0 / Math.sqrt(var0 * (var6 * var6) + 1.0);
      double var10 = Math.acos(var8);
      double var12 = Math.toDegrees(var10);
      int var14 = Math.abs((int)var2) / 90;
      switch (var14 & 3) {
         case 1:
            var12 = 180.0 - var12;
            break;
         case 2:
            var12 += 180.0;
            break;
         case 3:
            var12 = 360.0 - var12;
      }

      if (var2 < 0.0) {
         var12 = -var12;
      }

      return var12 + (int)var2 / 360 * 360;
   }

   public void n5(
      com.aspose.slides.internal.o9b.w1 var1,
      com.aspose.slides.internal.o9b.w1 var2,
      com.aspose.slides.internal.o9b.w1 var3,
      com.aspose.slides.internal.o9b.w1 var4
   ) {
      this.n5(var1.l6(), var1.k5(), var2.l6(), var2.k5(), var3.l6(), var3.k5(), var4.l6(), var4.k5());
   }

   public void n5(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      this.n5((float)var1, (float)var2, (float)var3, (float)var4, (float)var5, (float)var6, (float)var7, (float)var8);
   }

   public void n5(float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8) {
      Float var9 = new Float(var1, var2, var3, var4, var5, var6, var7, var8);
      this.l6().n5(var9, !this.z3());
      this.n5 = true;
   }

   private void n5(com.aspose.slides.internal.c9b.c8[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("points");
      }

      if (var1.length >= 4 && var1.length % 3 == 1) {
         this.n5(
            var1[0].n5().floatValue(),
            var1[0].l6().floatValue(),
            var1[1].n5().floatValue(),
            var1[1].l6().floatValue(),
            var1[2].n5().floatValue(),
            var1[2].l6().floatValue(),
            var1[3].n5().floatValue(),
            var1[3].l6().floatValue()
         );

         for (int var2 = 4; var2 < var1.length; var2 += 3) {
            this.l6()
               .n5(
                  var1[var2].n5().floatValue(),
                  var1[var2].l6().floatValue(),
                  var1[var2 + 1].n5().floatValue(),
                  var1[var2 + 1].l6().floatValue(),
                  var1[var2 + 2].n5().floatValue(),
                  var1[var2 + 2].l6().floatValue()
               );
         }
      } else {
         throw new ArgumentException("points");
      }
   }

   public void n5(com.aspose.slides.internal.o9b.j5[] var1) {
      this.n5(com.aspose.slides.internal.c9b.c8.n5(var1));
   }

   public void n5(com.aspose.slides.internal.o9b.w1[] var1) {
      this.n5(com.aspose.slides.internal.c9b.c8.n5(var1));
   }

   public void n5(float var1, float var2, float var3, float var4) {
      com.aspose.slides.internal.w1c.n5 var5 = new com.aspose.slides.internal.w1c.n5(var1, var2, var3, var4);
      this.l6().n5(var5, false);
      this.k5 = true;
      this.n5 = true;
   }

   public void n5(y1 var1) {
      this.n5(var1.x8(), var1.n3(), var1.s7(), var1.k5());
   }

   public void n5(com.aspose.slides.internal.o9b.y2 var1) {
      this.n5(var1.s7(), var1.x8(), var1.t2(), var1.l6());
   }

   public void n5(int var1, int var2, int var3, int var4) {
      this.n5((float)var1, (float)var2, (float)var3, (float)var4);
   }

   public void l6(float var1, float var2, float var3, float var4) {
      java.awt.geom.Line2D.Float var5 = new java.awt.geom.Line2D.Float(var1, var2, var3, var4);
      this.l6().n5(var5, !this.z3());
      this.n5 = true;
   }

   public void n5(com.aspose.slides.internal.o9b.j5 var1, com.aspose.slides.internal.o9b.j5 var2) {
      this.l6(var1.n5(), var1.l6(), var2.n5(), var2.l6());
   }

   public void n5(com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.w1 var2) {
      this.l6(var1.l6(), var1.k5(), var2.l6(), var2.k5());
   }

   public void l6(int var1, int var2, int var3, int var4) {
      this.l6((float)var1, (float)var2, (float)var3, (float)var4);
   }

   private void l6(com.aspose.slides.internal.c9b.c8[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("Value of 'points' cannot be null");
      }

      if (var1.length == 0) {
         throw new ArgumentException("Value of 'points' cannot be empty");
      }

      if (!this.z3() && !this.l6().a6()) {
         com.aspose.slides.internal.o9b.w1 var2 = this.c8();
         if (var1[0].n5().floatValue() != var2.l6() || var1[0].l6().floatValue() != var2.k5()) {
            this.l6().n5(var1[0].n5().floatValue(), var1[0].l6().floatValue());
         }
      } else {
         this.l6().l6(var1[0].n5().floatValue(), var1[0].l6().floatValue());
      }

      for (int var3 = 1; var3 < var1.length; var3++) {
         this.l6().n5(var1[var3].n5().floatValue(), var1[var3].l6().floatValue());
      }

      this.n5 = true;
   }

   public void l6(com.aspose.slides.internal.o9b.j5[] var1) {
      this.l6(com.aspose.slides.internal.c9b.c8.n5(var1));
   }

   public void l6(com.aspose.slides.internal.o9b.w1[] var1) {
      this.l6(com.aspose.slides.internal.c9b.c8.n5(var1));
   }

   public void l6(float var1, float var2, float var3, float var4, float var5, float var6) {
      s7 var7 = n5(var1, var2, var3, var4, var5, var6, true);
      com.aspose.slides.internal.o9b.w1[] var8 = var7.a6();
      byte[] var9 = var7.u9();
      com.aspose.slides.internal.o9b.w1 var10 = var8[var8.length - 1];
      if (var9.length - 1 >= 0) {
         System.arraycopy(var8, 0, var8, 1, var9.length - 1);
      }

      var8[0] = var10;
      var9[1] = 1;
      var9[var9.length - 1] = -125;
      if (var5 == 0.0F && var6 % 360.0F == 0.0F) {
         var8[0].l6((int)(var2 + var4 / 2.0F));
         var8[1].l6(var8[0].k5());
         var8[var8.length - 1].l6(var8[0].k5());
      }

      this.l6().n5(new s7(var8, var9).l6(), false);
      this.k5 = true;
      this.n5 = true;
   }

   private static s7 n5(float var0, float var1, float var2, float var3, float var4, float var5, boolean var6) {
      s7 var7 = new s7();
      double var8 = var2 / var3;
      double var10 = var8 * var8;
      double var12 = n5(var10, var4);
      double var14 = n5(var10, var4 + var5) - var12;
      boolean var16 = var14 >= 360.0;
      var14 = Math.min(var14, 360.0);
      double var17 = 90.0;
      if (var14 <= var17) {
         Double var19 = new Double(var0, var1, var2, var3, -var12, -var14, var6 ? 2 : 0);
         var7.l6().n5(var19, false);
      } else {
         boolean var21 = true;

         while (var14 > var17) {
            n5(var7, new Double(var0, var1, var2, var3, -var12, -var17, 0), var21);
            var21 = false;
            var12 += var17;
            var14 -= var17;
         }

         n5(var7, new Double(var0, var1, var2, var3, -var12, -var14, var6 ? 2 : 0), var21);
      }

      if (var16) {
         var7.n3();
      }

      var7.n5 = true;
      return var7;
   }

   private static void n5(s7 var0, Shape var1, boolean var2) {
      PathIterator var3 = var1.getPathIterator(null);
      double[] var4 = new double[6];

      while (!var3.isDone()) {
         switch (var3.currentSegment(var4)) {
            case 0:
               if (var2) {
                  var0.l6().l6(var4[0], var4[1]);
               }
               break;
            case 1:
               var0.l6().n5(var4[0], var4[1]);
               break;
            case 2:
               var0.l6().n5(var4[0], var4[1], var4[2], var4[3]);
               break;
            case 3:
               var0.l6().n5(var4[0], var4[1], var4[2], var4[3], var4[4], var4[5]);
               break;
            case 4:
               var0.l6().e2();
         }

         var3.next();
      }

      var0.n5 = true;
   }

   public void l6(com.aspose.slides.internal.o9b.y2 var1, float var2, float var3) {
      this.l6(var1.s7(), var1.x8(), var1.t2(), var1.l6(), var2, var3);
   }

   private void k5(com.aspose.slides.internal.c9b.c8[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("points");
      }

      if (var1.length < 3) {
         throw new ArgumentException("Invalid parameter used.");
      }

      this.l6().l6(var1[0].n5().floatValue(), var1[0].l6().floatValue());

      for (int var2 = 1; var2 < var1.length && (var1.length <= 3 || var2 != var1.length - 1 || !var1[var2].u9(var1[0])); var2++) {
         this.l6().n5(var1[var2].n5().floatValue(), var1[var2].l6().floatValue());
      }

      this.l6().e2();
      this.k5 = true;
      this.n5 = true;
   }

   public void k5(com.aspose.slides.internal.o9b.j5[] var1) {
      this.k5(com.aspose.slides.internal.c9b.c8.n5(var1));
   }

   public void k5(com.aspose.slides.internal.o9b.w1[] var1) {
      this.k5(com.aspose.slides.internal.c9b.c8.n5(var1));
   }

   public void k5(float var1, float var2, float var3, float var4) {
      if (var3 > 0.0F && var4 > 0.0F) {
         this.l6().l6(var1, var2);
         this.l6().n5(var1 + var3, var2);
         this.l6().n5(var1 + var3, var2 + var4);
         this.l6().n5(var1, var2 + var4);
         this.l6().e2();
         this.k5 = true;
         this.n5 = true;
      }
   }

   public void l6(y1 var1) {
      this.k5(var1.x8(), var1.n3(), var1.s7(), var1.k5());
   }

   public void l6(com.aspose.slides.internal.o9b.y2 var1) {
      this.k5(var1.s7(), var1.x8(), var1.t2(), var1.l6());
   }

   public void n5(y1[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("Value of 'rects' cannot be null");
      }

      if (var1.length == 0) {
         throw new ArgumentException("Value of 'rects' cannot be empty");
      }

      for (y1 var5 : var1) {
         this.k5(var5.x8(), var5.n3(), var5.s7(), var5.k5());
      }
   }

   public void n5(s7 var1, boolean var2) {
      if (var1 == null) {
         throw new ArgumentNullException("Value of 'addingPath' cannot be null");
      }

      if (this.z3() || this.l6().a6() || var1.l6().a6()) {
         var2 = false;
      }

      this.l6().n5(var1.l6(), var2);
      this.n5 = true;
   }

   public com.aspose.slides.internal.o9b.w1 c8() {
      return this.l6().x8();
   }

   public void t2() {
      this.l6().c8();
      this.n5 = true;
   }

   public y1 s7() {
      return this.n5((m1)null, (com.aspose.slides.internal.o9b.m3)null);
   }

   public y1 n5(m1 var1) {
      return this.n5(var1, null);
   }

   public y1 n5(m1 var1, com.aspose.slides.internal.o9b.m3 var2) {
      com.aspose.slides.internal.o9b.w1[] var3 = this.u3().n5();
      if (var3.length > 0) {
         float var4 = var3[0].l6();
         float var5 = var3[0].k5();
         float var6 = var4;
         float var7 = var5;

         for (int var8 = 1; var8 < var3.length; var8++) {
            if (var3[var8].l6() < var4) {
               var4 = var3[var8].l6();
            }

            if (var3[var8].k5() < var5) {
               var5 = var3[var8].k5();
            }

            if (var3[var8].l6() > var6) {
               var6 = var3[var8].l6();
            }

            if (var3[var8].k5() > var7) {
               var7 = var3[var8].k5();
            }
         }

         if (var2 != null) {
            float var11 = var2.q0();
            float var9 = Math.max(var11, 1.0F);
            float var10 = var9 / 2.0F;
            var4 -= var10;
            var5 -= var10;
            var6 += var10;
            var7 += var10;
         }

         if (var1 != null && !var1.l6()) {
            java.awt.geom.Rectangle2D.Float var12 = new java.awt.geom.Rectangle2D.Float(var4, var5, var6 - var4, var7 - var5);
            Rectangle2D var13 = var1.t2().createTransformedShape(var12).getBounds2D();
            return new y1((float)var13.getX(), (float)var13.getY(), (float)var13.getWidth(), (float)var13.getHeight());
         } else {
            return y1.n5(var4, var5, var6, var7);
         }
      } else {
         return y1.n5.y4();
      }
   }

   public void l6(m1 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("matrix");
      }

      this.l6().n5(var1.t2());
      this.n5 = true;
   }

   public boolean n5(com.aspose.slides.internal.o9b.w1 var1) {
      return this.n5(var1.l6(), var1.k5(), null);
   }

   public boolean n5(float var1, float var2, com.aspose.slides.internal.o9b.z1 var3) {
      return this.l6().contains(Math.round(var1), Math.round(var2));
   }

   private void n5(com.aspose.slides.internal.c9b.c8[] var1, float var2) {
      if (var1 == null) {
         throw new ArgumentNullException("Value of 'points' cannot be null");
      }

      if (var1.length < 3) {
         throw new ArgumentException("Value of 'points' is not valid");
      }

      int var3 = (var1.length + 3) * 2;
      float[] var4 = new float[var3];
      var4[--var3] = var1[1].l6().floatValue();
      var4[--var3] = var1[1].n5().floatValue();
      var4[--var3] = var1[0].l6().floatValue();
      var4[--var3] = var1[0].n5().floatValue();

      for (int var5 = var1.length - 1; var5 >= 0; var5--) {
         var4[--var3] = var1[var5].l6().floatValue();
         var4[--var3] = var1[var5].n5().floatValue();
      }

      var4[--var3] = var1[var1.length - 1].l6().floatValue();
      var4[--var3] = var1[var1.length - 1].n5().floatValue();
      this.n5(var4, false, var2);
      this.n3();
      this.n5 = true;
   }

   public void n5(com.aspose.slides.internal.o9b.w1[] var1, float var2) {
      this.n5(com.aspose.slides.internal.c9b.c8.n5(var1), var2);
   }

   public void u3(com.aspose.slides.internal.o9b.w1[] var1) {
      this.l6(var1, 0.5F);
   }

   private void l6(com.aspose.slides.internal.c9b.c8[] var1, float var2) {
      if (var1 == null) {
         throw new ArgumentNullException("Value of 'points' cannot be null");
      }

      this.n5(var1, 0, var1.length - 1, var2);
   }

   public void n5(com.aspose.slides.internal.o9b.j5[] var1, float var2) {
      this.l6(com.aspose.slides.internal.c9b.c8.n5(var1), var2);
   }

   public void l6(com.aspose.slides.internal.o9b.w1[] var1, float var2) {
      this.l6(com.aspose.slides.internal.c9b.c8.n5(var1), var2);
   }

   private void n5(com.aspose.slides.internal.c9b.c8[] var1, int var2, int var3, float var4) {
      if (var1 == null) {
         throw new ArgumentNullException("Value of 'points' cannot be null");
      }

      if (var1.length < 2) {
         throw new ArgumentException("Value of 'points' is not valid");
      }

      if (var3 <= 0) {
         throw new ArgumentException("Value of 'numberOfSegments' is not valid");
      }

      if (var2 < 0) {
         throw new ArgumentException("Value of 'offset' is not valid");
      }

      if (var2 + var3 >= var1.length) {
         throw new ArgumentException("Value of 'offset' or 'numberOfSegments' is not valid");
      }

      int var5 = var3 + 1;
      int var6 = var5 * 2 + 4;
      float[] var7 = new float[var6];
      int var8 = var2 + var5;
      if (var8 == var1.length) {
         var8--;
         var7[--var6] = var1[var8].l6().floatValue();
         var7[--var6] = var1[var8].n5().floatValue();
      }

      while (var6 > 0 && var8 >= 0) {
         var7[--var6] = var1[var8].l6().floatValue();
         var7[--var6] = var1[var8].n5().floatValue();
         var8--;
      }

      if (var6 > 0) {
         var7[1] = var1[0].l6().floatValue();
         var7[0] = var1[0].n5().floatValue();
      }

      this.n5(var7, !this.z3() && !this.l6().a6(), var4);
   }

   public void n5(com.aspose.slides.internal.o9b.j5[] var1, int var2, int var3, float var4) {
      this.n5(com.aspose.slides.internal.c9b.c8.n5(var1), var2, var3, var4);
   }

   public void n5(com.aspose.slides.internal.o9b.w1[] var1, int var2, int var3, float var4) {
      this.n5(com.aspose.slides.internal.c9b.c8.n5(var1), var2, var3, var4);
   }

   private void n5(float[] var1, boolean var2, float var3) {
      var3 /= 3.0F;
      if (var2) {
         com.aspose.slides.internal.o9b.w1 var4 = this.c8();
         if (var1[2] != var4.l6() || var1[3] != var4.k5()) {
            this.l6().n5(var1[2], var1[3]);
         }
      } else {
         this.l6().l6(var1[2], var1[3]);
      }

      float var20 = var1[4] - var1[0];
      float var5 = var1[5] - var1[1];
      float var6 = var1[2] + var3 * var20;
      float var7 = var1[3] + var3 * var5;
      byte var8 = 2;

      for (int var9 = var1.length - 4; var8 < var9; var8 += 2) {
         int var10 = var8;
         int var11 = var10++;
         int var12 = var10++;
         int var13 = var10++;
         int var14 = var10++;
         int var15 = var10++;
         int var16 = var10++;
         var20 = var1[var15] - var1[var11];
         var5 = var1[var16] - var1[var12];
         float var17 = var1[var13] - var3 * var20;
         float var18 = var1[var14] - var3 * var5;
         this.l6().n5(var6, var7, var17, var18, var1[var13], var1[var14]);
         var6 = var1[var13] + var3 * var20;
         var7 = var1[var14] + var3 * var5;
      }

      this.n5 = true;
   }

   public void n5(String var1, com.aspose.slides.internal.o9b.y4 var2, int var3, float var4, com.aspose.slides.internal.o9b.j5 var5, e5 var6) {
      this.n5(var1, var2, var4, var3, 2, var5.n5(), var5.l6(), java.lang.Float.POSITIVE_INFINITY, java.lang.Float.POSITIVE_INFINITY, var6);
   }

   public void n5(String var1, com.aspose.slides.internal.o9b.y4 var2, int var3, float var4, com.aspose.slides.internal.o9b.w1 var5, e5 var6) {
      this.n5(var1, var2, var4, var3, 2, var5.l6(), var5.k5(), java.lang.Float.POSITIVE_INFINITY, java.lang.Float.POSITIVE_INFINITY, var6);
   }

   private void n5(
      String var1, com.aspose.slides.internal.o9b.y4 var2, float var3, int var4, int var5, float var6, float var7, float var8, float var9, e5 var10
   ) {
      this.n5(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, false);
   }

   private void n5(
      String var1,
      com.aspose.slides.internal.o9b.y4 var2,
      float var3,
      int var4,
      int var5,
      float var6,
      float var7,
      float var8,
      float var9,
      e5 var10,
      boolean var11
   ) {
      if (var1 == null) {
         throw new NullReferenceException("Value of 's' cannot be null");
      }

      if (var2 == null) {
         throw new ArgumentException("Value of 'family' cannot be null");
      }

      var1 = var1.replaceAll("\u0000", "");
      com.aspose.slides.internal.o9b.n3 var12 = null;
      com.aspose.slides.internal.o9b.n3 var13 = null;
      if (var3 <= 0.0F) {
         var13 = new com.aspose.slides.internal.o9b.n3(var2, 1.0E-4F, var4, var5);
         var13 = com.aspose.slides.internal.r5w.k5.n5(var13, var1);
         var12 = var13;
         String var16 = com.aspose.slides.internal.f3l.k5.n5(var13.h0(), var1);
         var1 = com.aspose.slides.internal.f3l.k5.n5(var13, var16);
         var13 = com.aspose.slides.internal.f3l.k5.l6(var13, var1);
      } else {
         var13 = new com.aspose.slides.internal.o9b.n3(var2, var3, var4, var5);
         var13 = com.aspose.slides.internal.r5w.k5.n5(var13, var1);
         var12 = var13;
         String var18 = com.aspose.slides.internal.f3l.k5.n5(var13.h0(), var1);
         var1 = com.aspose.slides.internal.f3l.k5.n5(var13, var18);
         var13 = com.aspose.slides.internal.f3l.k5.l6(var13, var1);
      }

      var13 = com.aspose.slides.internal.r5w.k5.n5(var13, var10, 4);
      s7 var14 = new s7();
      var14.n5(null, var13, var12, var1, var6, var7, var8, var9, var10);
      this.l6(var14);
   }

   private void n5(
      s7 var1,
      com.aspose.slides.internal.o9b.n3 var2,
      com.aspose.slides.internal.o9b.n3 var3,
      String var4,
      float var5,
      float var6,
      float var7,
      float var8,
      e5 var9
   ) {
      this.n5(false, var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   private s7 n5(
      boolean var1,
      s7 var2,
      com.aspose.slides.internal.o9b.n3 var3,
      com.aspose.slides.internal.o9b.n3 var4,
      String var5,
      float var6,
      float var7,
      float var8,
      float var9,
      e5 var10
   ) {
      s7 var11 = var1 ? new s7() : this;
      FontRenderContext var12 = new FontRenderContext(null, true, true);
      com.aspose.slides.internal.o6x.u3 var13 = new com.aspose.slides.internal.o6x.u3(null, var5, var3, var4, var12, var10, var8, var9, false);
      int var14 = var11.l6().k5();
      int var15 = var14 * 2;
      if (var15 > 0) {
         var11.l6().l6(var14);
      }

      if (var2 == null) {
         boolean var16 = var3.u9() && var3.z1().getItalicAngle() == 0.0F && !com.aspose.slides.internal.f3l.k5.n5(var3.l6());

         for (com.aspose.slides.internal.o6x.l6 var17 = var13.c8(); var17 != null; var17 = var13.c8()) {
            Shape var18 = var16 ? var17.n5(var6, var7, var3) : var17.n5(var6, var7);
            var11.l6().n5(var18, false);
         }
      } else {
         var11.n5(var2, false);
      }

      var11.e2();
      AffineTransform var19 = var13.t9();
      if (var19 != null) {
         var11.l6().n5(var19, var15, var11.l6().u3() - var15);
      }

      var11.n5 = true;
      return var11;
   }

   private void l6(s7 var1) {
      s7 var2 = new s7();
      int var3 = this.l6().k5();
      int var4 = var3 * 2;
      if (var4 > 0) {
         this.l6().l6(var3);
      }

      var2.n5(var1, false);
      this.n5(var2, false);
      this.e2();
   }

   public void x8() {
      if (this.h0() >= 1) {
         com.aspose.slides.internal.c9b.n5 var1 = this.l6();
         var1.s7();
         if (!var1.a6()) {
            var1.e2();
         }

         this.k5 = true;
         this.n5 = true;
      }
   }

   public void n3() {
      if (new k7(this.l6()).l6().length > 0) {
         this.l6().e2();
      }

      this.k5 = true;
      this.n5 = true;
   }

   public void y4() {
      this.n5((m1)null, 0.25F);
   }

   public void n5(m1 var1, float var2) {
      AffineTransform var3 = null;
      if (var1 != null) {
         var3 = var1.t2();
      }

      if (this.l6().h0()) {
         this.n5(this.l6().getPathIterator(var3, var2));
         this.n5 = true;
      }
   }

   public void e2() {
      this.l6().t2();
   }

   public void t9() {
      this.k5 = true;
   }

   public void n5(com.aspose.slides.internal.o9b.m3 var1) {
      this.n5(var1, null);
   }

   public void n5(com.aspose.slides.internal.o9b.m3 var1, m1 var2) {
      this.n5(var1, var2, 0.6666667F);
   }

   public void n5(com.aspose.slides.internal.o9b.m3 var1, m1 var2, float var3) {
      if (var1 == null) {
         throw new ArgumentNullException("pen");
      }

      if (this.h0() != 0) {
         if (this.h0() <= 1) {
            throw new OutOfMemoryException("Path count must be greater than 1");
         }

         com.aspose.slides.internal.h0y.u3.n5(this, var1, var2, var3);
         this.n5 = true;
      }
   }

   private boolean z3() {
      boolean var1 = this.k5;
      this.k5 = false;
      return var1;
   }

   private void n5(PathIterator var1) {
      com.aspose.slides.internal.c9b.n5 var2 = new com.aspose.slides.internal.c9b.n5();
      var2.n5(var1, false);
      this.n5(var2);
   }

   void n5(com.aspose.slides.internal.o9b.w1[] var1, byte[] var2) {
      this.n5(com.aspose.slides.internal.c9b.c8.n5(var1), var2);
   }

   private void n5(com.aspose.slides.internal.c9b.c8[] var1, byte[] var2) {
      if (var1 == null) {
         throw new ArgumentNullException("Value of 'pts' cannot be null");
      }

      if (var2 == null) {
         throw new NullReferenceException("Value of 'types' cannot be null");
      }

      if (var1.length != var2.length) {
         throw new ArgumentException("Value of 'pts.length' must be equal to 'types.length'");
      }

      this.l6().c8();
      if (var2.length > 0 && (var2[0] & 255 & 7) != 0) {
         var2[0] = 0;
      }

      for (int var3 = 0; var3 < var1.length; var3++) {
         int var4 = var2[var3] & 255 & 7;
         switch (var4) {
            case 0:
               this.l6().l6(var1[var3].n5().floatValue(), var1[var3].l6().floatValue());
               break;
            case 1:
               this.l6().n5(var1[var3].n5().floatValue(), var1[var3].l6().floatValue());
            case 2:
            default:
               break;
            case 3:
               if (var3 + 2 >= var1.length || (var2[var3 + 1] & 255 & 7) != 3 || (var2[var3 + 2] & 255 & 7) != 3) {
                  this.n5(new com.aspose.slides.internal.o9b.w1[0], new byte[0]);
                  this.n5 = true;
                  return;
               }

               float var5 = var1[var3].n5().floatValue();
               float var6 = var1[var3].l6().floatValue();
               float var7 = var1[++var3].n5().floatValue();
               float var8 = var1[var3].l6().floatValue();
               float var9 = var1[++var3].n5().floatValue();
               float var10 = var1[var3].l6().floatValue();
               this.l6().n5(var5, var6, var7, var8, var9, var10);
         }

         if ((var2[var3] & 255 & 128) != 0) {
            this.l6().e2();
         }

         if ((var2[var3] & 255 & 4) != 0) {
            this.l6().e2();
         }

         if (var3 == var1.length - 1 && var1.length == var2.length - 1) {
            if ((var2[var3 + 1] & 255 & 128) != 0) {
               this.l6().e2();
            }

            if ((var2[var3 + 1] & 255 & 4) != 0) {
               this.l6().e2();
            }
         }

         if ((var2[var3] & 255 & 32) != 0) {
            this.e2();
         }
      }

      this.n5 = true;
   }

   public s7[] n5(boolean var1) {
      if (this.l6().u9() < 2) {
         return new s7[]{(s7)this.deepClone()};
      }

      byte[] var2 = this.u9();
      int[] var3 = new int[var2.length];
      int var4 = 0;

      for (int var5 = 0; var5 < var2.length; var5++) {
         if (var2[var5] == 0) {
            var3[var4++] = var5;
         }
      }

      if (var4 == 1) {
         return new s7[]{(s7)this.deepClone()};
      }

      com.aspose.slides.internal.o9b.w1[] var12 = this.a6();
      ArrayList var6 = new ArrayList();

      for (int var7 = 0; var7 < var4; var7++) {
         int var8 = (var7 == var4 - 1 ? var2.length : var3[var7 + 1]) - var3[var7];
         byte[] var9 = new byte[var8];
         com.aspose.slides.internal.o9b.w1[] var10 = new com.aspose.slides.internal.o9b.w1[var8];

         for (int var11 = 0; var11 < var8; var11++) {
            var10[var11] = var12[var3[var7] + var11].u3();
            var9[var11] = var2[var3[var7] + var11];
         }

         s7 var13 = new s7(var10, var9);
         if (var1) {
            throw new NotImplementedException();
         }

         var6.add(var13);
      }

      return (s7[])var6.toArray(new s7[0]);
   }

   public boolean z1() {
      if (!this.l6().a6()) {
         return true;
      }

      byte[] var1 = this.u9();

      for (int var2 = 1; var2 < var1.length; var2++) {
         if (var1[var2] == 0 && (var1[var2 - 1] & 128) == 0) {
            return true;
         }
      }

      return false;
   }

   public boolean t4() {
      if (this.h0() == 0) {
         return false;
      }

      if (this.l6().a6()) {
         return true;
      }

      byte[] var1 = this.u9();

      for (byte var5 : var1) {
         if ((var5 & 128) != 0) {
            return true;
         }
      }

      return false;
   }

   boolean q0() {
      if (!this.l6().a6()) {
         return false;
      }

      byte[] var1 = this.u9();
      com.aspose.slides.internal.o9b.w1[] var2 = this.a6();
      int var3 = 0;

      for (int var4 = 0; var4 < var1.length; var4++) {
         if ((var1[var4] & 128) != 0) {
            if (var4 - var3 >= 2) {
               for (int var5 = var3; var5 + 2 <= var4; var5++) {
                  if (!com.aspose.slides.internal.c9b.a6.n5(var2[var5], var2[var5 + 1], var2[var5 + 2], 0.499F)) {
                     return true;
                  }
               }
            }

            var3 = var4 + 1;
         }
      }

      return false;
   }

   public static Shape n5(s7 var0) {
      return var0 == null ? null : var0.l6().y4();
   }

   public static s7 n5(Object var0) {
      if (var0 == null) {
         return null;
      } else if (var0 instanceof GeneralPath) {
         return new s7((GeneralPath)var0);
      } else {
         return var0 instanceof Shape ? new s7(new com.aspose.slides.internal.c9b.n5((Shape)var0)) : null;
      }
   }
}
