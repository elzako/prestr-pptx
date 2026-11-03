package com.aspose.slides.internal.h0y;

import com.aspose.slides.internal.o9b.i1;
import com.aspose.slides.internal.o9b.m3;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.r5w.x8;
import com.aspose.slides.internal.t9z.h0;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.s7;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.PathIterator;
import java.util.List;

public class u3 extends n5 {
   private final boolean l6 = false;
   private final a6 k5;
   private final com.aspose.slides.internal.h2v.k5 u3;
   private final com.aspose.slides.internal.h2v.k5 a6;
   private static int u9 = 0;
   private static String h0 = "c:/tmp/drawPath-debug.java";

   public u3(x8 var1, a6 var2) {
      super(var1);
      this.k5 = var2;
      this.u3 = new com.aspose.slides.internal.h2v.n5(var1);
      this.a6 = new com.aspose.slides.internal.h2v.l6(var1);
   }

   public void n5(m3 var1, s7 var2) {
      this.n5(new l6(var1, var2));
   }

   @Override
   protected void n5(u9 var1, m1 var2, m1 var3) {
      l6 var4 = (l6)var1;
      m3 var5 = var4.n5;
      com.aspose.slides.internal.o9b.u3 var6 = var1.l6;
      s7 var7 = var1.k5;
      AffineTransform var8 = var2.t2();
      boolean var9 = this.n5(var5, var8);
      boolean var10 = var5.x8() != 0;
      boolean var11 = var9 && var10;
      boolean var12 = var9 && !var10;
      if (this.n5(var5, var12)) {
         Shape var14 = var7;
         if (!var8.isIdentity()) {
            var14 = var8.createTransformedShape(var7);
         }

         this.n5(var6, var14);
      } else {
         com.aspose.slides.internal.w1y.n5 var13 = this.n5(var5, var7, var8, var12);
         this.n5(var6, var13, var2, var3, var12, var11);
      }
   }

   private com.aspose.slides.internal.w1y.n5 n5(m3 var1, Shape var2, AffineTransform var3, boolean var4) {
      h0 var5 = new h0(var1, this.n5(var3, 1.0F));
      com.aspose.slides.internal.t9z.u9 var6 = new com.aspose.slides.internal.t9z.u9();
      var6.n5(var2);
      var6.n5(var5);
      var6.n5(var3);
      var6.n5(var4);
      var6.l6(true);
      com.aspose.slides.internal.t9z.l6 var7 = new com.aspose.slides.internal.t9z.l6(var6);
      return var7.n5();
   }

   private void n5(com.aspose.slides.internal.o9b.u3 var1, com.aspose.slides.internal.w1y.n5 var2, m1 var3, m1 var4, boolean var5, boolean var6) {
      if (!var2.n5().isEmpty()) {
         if (var5) {
            this.n5(var1, var2, var3, var4);
         } else if (this.n5(var2)) {
            this.n5(var1, var2, var3, var4, this.n5(var6));
         } else {
            this.l6(var1, var2, var3, var4, this.n5(var6));
         }
      }
   }

   private void n5(com.aspose.slides.internal.o9b.u3 var1, com.aspose.slides.internal.w1y.n5 var2, m1 var3, m1 var4) {
      for (com.aspose.slides.internal.w1y.l6 var7 : var2.n5()) {
         this.n5(var1, var7.n5);
         this.n5(var1, var7.l6, var3, var4, this.a6);
         this.n5(var1, var7.k5, var3, var4, this.a6);
      }
   }

   private void n5(com.aspose.slides.internal.o9b.u3 var1, com.aspose.slides.internal.w1y.n5 var2, m1 var3, m1 var4, com.aspose.slides.internal.h2v.k5 var5) {
      List var6 = var2.n5();
      Area var7 = new Area();

      for (Object recoveredElement$var9$3295 : var6) {
         com.aspose.slides.internal.w1y.l6 var9 = (com.aspose.slides.internal.w1y.l6)recoveredElement$var9$3295;
         var7.add(this.l6(var9));
      }

      this.n5(var1, var7, var3, var4, var5);
   }

   private void l6(com.aspose.slides.internal.o9b.u3 var1, com.aspose.slides.internal.w1y.n5 var2, m1 var3, m1 var4, com.aspose.slides.internal.h2v.k5 var5) {
      for (com.aspose.slides.internal.w1y.l6 var8 : var2.n5()) {
         if (this.n5(var8)) {
            Area var9 = this.l6(var8);
            this.n5(var1, var9, var3, var4, var5);
         } else {
            if (!this.n5(var8.l6)) {
               this.n5(var1, var8.l6, var3, var4, var5);
            }

            this.n5(var1, var8.n5, var3, var4, var5);
            if (!this.n5(var8.k5)) {
               this.n5(var1, var8.k5, var3, var4, var5);
            }
         }
      }
   }

   private boolean n5(com.aspose.slides.internal.w1y.n5 var1) {
      List var2 = var1.n5();
      if (var2.size() > 1) {
      }

      return false;
   }

   private boolean n5(com.aspose.slides.internal.w1y.l6 var1) {
      if (this.n5(var1.l6) && this.n5(var1.k5)) {
         return false;
      }

      short var2 = 500;
      return !this.n5(var1.l6, 500) && !this.n5(var1.k5, 500) && !this.n5(var1.n5, 500);
   }

   private com.aspose.slides.internal.h2v.k5 n5(boolean var1) {
      return var1 ? this.u3 : this.a6;
   }

   private Area l6(com.aspose.slides.internal.w1y.l6 var1) {
      Area var2 = new Area(var1.n5);
      var2.add(new Area(var1.l6));
      var2.add(new Area(var1.k5));
      return var2;
   }

   private void n5(com.aspose.slides.internal.o9b.u3 var1, Shape var2) {
      com.aspose.slides.internal.x4g.x8 var3 = new com.aspose.slides.internal.x4g.x8(this.n5, null, false);

      try {
         this.n5(this.n5);
         this.u3.l6();
         var2 = this.u3.n5(null, var2);
         this.n5(var1).n5(var2);
      } finally {
         var3.n5(this.n5);
      }
   }

   private com.aspose.slides.internal.t7k.k5 n5(com.aspose.slides.internal.o9b.u3 var1) {
      return var1 instanceof i1 ? com.aspose.slides.internal.t7k.k5.n5(this.n5, var1) : com.aspose.slides.internal.t7k.k5.l6(this.n5, var1);
   }

   private void n5(com.aspose.slides.internal.o9b.u3 var1, Shape var2, m1 var3, m1 var4, com.aspose.slides.internal.h2v.k5 var5) {
      m1 var6 = com.aspose.slides.internal.c9b.u3.n5(var3);
      Shape var7 = com.aspose.slides.internal.c9b.u3.n5(var6, var2);
      var5.l6();
      Shape var8 = var5.n5(null, var2);
      this.k5.n5(var1, var3, var4, var7, var8, var5);
   }

   private void n5(z1 var1) {
      var1.n5(1.0F);
      var1.u3(2);
      var1.l6(m1.n5);
   }

   private boolean n5(m3 var1, AffineTransform var2) {
      if (this.n5.c4()) {
         return false;
      }

      AffineTransform var3 = new AffineTransform(var1.t4().t2());
      var3.concatenate(var2);
      var2 = var3;
      float var4 = 1.5F;
      float var5 = this.n5(var2, 1.5F);
      return var1.q0() <= var5 || Float.isNaN(var5);
   }

   private boolean n5(m3 var1, boolean var2) {
      return !var2 ? false : !var1.u3() && var1.x8() == 0 && var1.n3() == 0 && var1.y4() == 0 && var1.t4().l6();
   }

   private float n5(AffineTransform var1, float var2) {
      double var3 = var1.getScaleX();
      double var5 = var1.getScaleY();
      if (var3 != 1.0 && var5 != 1.0) {
         double var7 = var1.getDeterminant();
         double var9;
         if ((var1.getType() & 36) != 0 && var7 >= 0.0) {
            var9 = Math.sqrt(var7);
         } else {
            double var11 = var1.getScaleX();
            double var13 = var1.getShearX();
            double var15 = var1.getShearY();
            double var17 = var1.getScaleY();
            double var19 = var11 * var11 + var15 * var15;
            double var21 = 2.0 * (var11 * var13 + var15 * var17);
            double var23 = var13 * var13 + var17 * var17;
            double var25 = Math.sqrt(var21 * var21 + (var19 - var23) * (var19 - var23));
            double var27 = (var19 + var23 + var25) / 2.0;
            var9 = Math.sqrt(var27);
         }

         return (float)(var2 / var9);
      } else {
         return var2;
      }
   }

   private boolean n5(Shape var1) {
      PathIterator var2 = var1.getPathIterator(null);
      return var2.isDone();
   }

   private boolean n5(Shape var1, int var2) {
      PathIterator var3 = var1.getPathIterator(null);
      int var4 = 0;

      while (!var3.isDone()) {
         if (++var4 > var2) {
            return true;
         }

         var3.next();
      }

      return false;
   }

   public static void n5(s7 var0, m3 var1, m1 var2, float var3) {
      if (var2 != null) {
         var0.l6(var2);
      }

      var0.n5((m1)null, var3);
      if (var2 != null) {
         m1 var4 = var2.u9();
         var4.h0();
         var0.l6(var4);
      }

      h0 var12 = new h0(var1, 1.0F);
      com.aspose.slides.internal.t9z.u9 var5 = new com.aspose.slides.internal.t9z.u9();
      var5.n5(var0);
      var5.n5(var12);
      var5.n5(var2 != null ? var2.t2() : new AffineTransform());
      var5.n5(false);
      var5.l6(false);
      com.aspose.slides.internal.t9z.l6 var6 = new com.aspose.slides.internal.t9z.l6(var5);
      com.aspose.slides.internal.w1y.n5 var7 = var6.n5();
      List var8 = var7.n5();
      s7 var9 = new s7();

      for (Object recoveredElement$var11$8583 : var8) {
         com.aspose.slides.internal.w1y.l6 var11 = (com.aspose.slides.internal.w1y.l6)recoveredElement$var11$8583;
         var9.l6().n5(var11.n5, false);
         if (var11.l6 != null) {
            var9.l6().n5(var11.l6, false);
         }

         if (var11.k5 != null) {
            var9.l6().n5(var11.k5, false);
         }
      }

      var0.n5(var9.l6());
      var0.n5(1);
   }
}
