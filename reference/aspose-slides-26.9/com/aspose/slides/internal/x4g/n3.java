package com.aspose.slides.internal.x4g;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.o9b.i1;
import com.aspose.slides.internal.o9b.u6;
import java.awt.Paint;
import java.awt.PaintContext;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.ColorModel;

public final class n3 extends com.aspose.slides.internal.o9b.u3 {
   private final int k5;
   private final com.aspose.slides.internal.o9b.c8 u3 = new com.aspose.slides.internal.o9b.c8();
   private final com.aspose.slides.internal.o9b.c8 a6 = new com.aspose.slides.internal.o9b.c8();
   static final double[][] l6 = new double[][]{
      {8.0, 8.0, 1.0},
      {8.0, 8.0, 1.0},
      {8.0, 8.0, 1.0},
      {8.0, 8.0, 1.0},
      {8.0, 8.0, 1.0},
      {8.0, 8.0, 1.0},
      {8.0, 8.0, 1.0},
      {8.0, 4.0, 1.0},
      {4.0, 4.0, 1.0},
      {4.0, 2.0, 1.0},
      {4.0, 4.0, 1.0},
      {8.0, 8.0, 1.0},
      {2.0, 2.0, 1.0},
      {4.0, 4.0, 1.0},
      {4.0, 2.0, 1.0},
      {4.0, 4.0, 1.0},
      {8.0, 4.0, 1.0},
      {8.0, 8.0, 1.0},
      {4.0, 4.0, 1.0},
      {4.0, 4.0, 1.0},
      {4.0, 4.0, 1.0},
      {4.0, 4.0, 1.0},
      {8.0, 8.0, 2.0},
      {8.0, 8.0, 2.0},
      {4.8999999999999995, 4.8999999999999995, 1.0},
      {4.8999999999999995, 4.8999999999999995, 1.0},
      {2.0, 2.0, 1.0},
      {2.0, 2.0, 1.0},
      {4.2, 4.2, 2.0},
      {4.2, 4.2, 2.0},
      {4.0, 8.0, 1.0},
      {4.0, 8.0, 1.0},
      {8.0, 8.0, 1.0},
      {8.0, 8.0, 1.0},
      {8.0, 8.0, 1.0},
      {8.0, 8.0, 1.0},
      {8.0, 4.0, 1.0},
      {8.0, 4.5, 1.0},
      {8.0, 8.0, 1.0},
      {8.0, 8.0, 1.0},
      {8.0, 8.0, 1.0},
      {8.0, 8.0, 1.0},
      {8.0, 8.0, 1.0},
      {8.0, 8.0, 1.0},
      {8.0, 8.0, 1.0},
      {8.0, 8.0, 1.0},
      {4.0, 4.0, 1.0},
      {8.0, 8.0, 1.0},
      {4.2, 4.2, 1.0},
      {4.0, 4.0, 1.0},
      {8.0, 8.0, 1.0},
      {8.0, 8.0, 1.0},
      {8.0, 8.0, 1.0}
   };

   public n3(int var1, com.aspose.slides.internal.o9b.c8 var2) {
      this(var1, var2.o8(), com.aspose.slides.internal.o9b.c8.m3().o8());
   }

   public n3(int var1, com.aspose.slides.internal.o9b.c8 var2, com.aspose.slides.internal.o9b.c8 var3) {
      this.k5 = var1;
      var2.n5(this.u3);
      var3.n5(this.a6);
   }

   public com.aspose.slides.internal.o9b.c8 h0() {
      return this.a6;
   }

   public com.aspose.slides.internal.o9b.c8 c8() {
      return this.u3;
   }

   public int t2() {
      return this.k5;
   }

   @Override
   public Object deepClone() {
      return new n3(this.k5, this.u3.o8(), this.a6.o8());
   }

   @Override
   public Paint n5() {
      return this.u3.n5();
   }

   @Override
   public PaintContext createContext(ColorModel cm, Rectangle deviceBounds, Rectangle2D userBounds, AffineTransform xform, RenderingHints hints) {
      if (this.t2() == 2) {
         return new c8(this);
      }

      if (this.t2() == 3) {
         return new k5(this);
      }

      if (this.t2() == 5) {
         return new h0(this);
      }

      if (this.t2() == 23) {
         return new r4(this);
      }

      if (this.k5().k5()) {
         m1.n5(xform, this.k5().t2(), 1);
      }

      com.aspose.slides.internal.o9b.t4 var6 = this.s7();
      u6 var7 = new u6(var6, 0, new com.aspose.slides.internal.o9b.y2(0, 0, var6.e2(), var6.h0()));
      var7.l6(false);
      return var7.n5().createContext(cm, deviceBounds, userBounds, xform, hints);
   }

   @Override
   public int getTransparency() {
      return this.a6() ? 1 : 3;
   }

   static com.aspose.slides.internal.o9b.z1 n5(com.aspose.slides.internal.o9b.t4 var0, int var1, boolean var2) {
      com.aspose.slides.internal.o9b.z1 var3 = com.aspose.slides.internal.o9b.z1.n5(var0);
      if (!var2) {
         var3.z8().setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
      } else {
         var3.z8().setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
      }

      return var3;
   }

   static void n5(com.aspose.slides.internal.o9b.z1 var0, com.aspose.slides.internal.o9b.c8 var1, int var2, int var3) {
      var0.n5(new i1(var1), -1, -1, var2 + 1, var3 + 1);
   }

   private static float n5(n3 var0) {
      return (float)l6[var0.t2()][0];
   }

   private static float l6(n3 var0) {
      return (float)l6[var0.t2()][1];
   }

   private static float k5(n3 var0) {
      return (float)l6[var0.t2()][2];
   }

   private static boolean n5(com.aspose.slides.internal.o9b.t4 var0, n3 var1) {
      float var2 = n5(var1);
      float var3 = k5(var1);
      com.aspose.slides.internal.o9b.z1 var4 = n5(var0, 1, false);
      if (var4 == null) {
         return false;
      }

      n5(var4, var1.h0(), (int)var2, (int)var2);
      var4.n5(new com.aspose.slides.internal.o9b.m3(var1.c8(), var3), 0.0F, var3 - 1.0F, var2, var3 - 1.0F);
      var4.dispose();
      return true;
   }

   private static boolean l6(com.aspose.slides.internal.o9b.t4 var0, n3 var1) {
      float var2 = n5(var1);
      float var3 = k5(var1);
      com.aspose.slides.internal.o9b.z1 var4 = n5(var0, 1, false);
      if (var4 == null) {
         return false;
      }

      n5(var4, var1.h0(), (int)var2, (int)var2);
      if (var1.t2() == 26) {
         var4.n5(new com.aspose.slides.internal.o9b.m3(var1.c8(), var3), var3 - 0.0F, 0.0F, var3 - 0.0F, var2 + 0.0F);
      } else {
         var4.n5(new com.aspose.slides.internal.o9b.m3(var1.c8(), var3), var3 - 1.0F, 0.0F, var3 - 1.0F, var2 + 0.0F);
      }

      var4.dispose();
      return true;
   }

   private static boolean k5(com.aspose.slides.internal.o9b.t4 var0, n3 var1) {
      float var2 = n5(var1);
      float var3 = k5(var1);
      com.aspose.slides.internal.o9b.z1 var4 = n5(var0, 1, true);
      if (var4 == null) {
         return false;
      }

      n5(var4, var1.h0(), (int)var2, (int)var2);
      var4.n5(new com.aspose.slides.internal.o9b.m3(var1.c8(), var3), 0.0F, (int)(var2 / 2.0) - 1 - 3, (int)(var2 / 2.0) + 2 + 1, var2 - 2.0F + 1.0F);
      var4.n5(new com.aspose.slides.internal.o9b.m3(var1.c8(), var3), (int)(var2 / 2.0) - 1 + 3, -2.0F, var2 + 4.0F, (int)(var2 / 2.0) - 0);
      int var5 = -Math.round(var2 + 2.0F);
      byte var6 = 1;
      var4.n5(
         new com.aspose.slides.internal.o9b.m3(var1.c8(), var3), (int)(var2 / 2.0) - 1 - 2 + var5, -2 + var6, var2 + 3.0F + var5, (int)(var2 / 2.0) + 4 + var6
      );
      var4.dispose();
      return true;
   }

   private static boolean u3(com.aspose.slides.internal.o9b.t4 var0, n3 var1) {
      float var2 = n5(var1);
      double var3 = k5(var1);
      com.aspose.slides.internal.o9b.z1 var5 = n5(var0, 1, true);
      if (var5 == null) {
         return false;
      }

      n5(var5, var1.h0(), (int)var2, (int)var2);
      float var6 = var2 - 1.0F;
      var5.n5(new com.aspose.slides.internal.o9b.m3(var1.c8(), (float)var3), 0.0F, var6, var6, 0.0F);
      var5.n5(new com.aspose.slides.internal.o9b.m3(var1.c8(), (float)var3), -1, 0, 1, -2);
      var5.n5(new com.aspose.slides.internal.o9b.m3(var1.c8(), (float)var3), var6 - 1.0F, var6 + 2.0F, var6 + 1.0F, var6);
      var5.dispose();
      return true;
   }

   private static boolean a6(com.aspose.slides.internal.o9b.t4 var0, n3 var1) {
      float var2 = n5(var1);
      double var3 = k5(var1);
      float[] var10000 = new float[]{1.0F, 1.0F};
      boolean var6 = var1.t2() == 43;
      com.aspose.slides.internal.o9b.z1 var7 = n5(var0, var6 ? 0 : 1, false);
      if (var7 == null) {
         return false;
      }

      n5(var7, var1.h0(), (int)var2, (int)var2);
      com.aspose.slides.internal.o9b.m3 var8 = new com.aspose.slides.internal.o9b.m3(var1.c8(), (float)var3);
      float var9 = var2 - 1.0F;
      if (var6) {
         byte var10 = -1;
         var7.l6(var8, var10, var10, var9, var9);
         var7.l6(var8, var10 - 2, var10 - 2, var9, var9);
         var7.l6(var8, var10 - 4, var10 - 4, var9, var9);
         var7.l6(var8, var10 - 6, var10 - 6, var9, var9);
         var7.n5(new i1(var1.h0()), 1.0F, 1.0F, var9, var9);
      } else {
         var7.n5(var8, 0.0F, 0.0F, var9, 0.0F);
         var7.n5(var8, 0.0F, 0.0F, 0.0F, var9);
      }

      var7.dispose();
      return true;
   }

   private static boolean u9(com.aspose.slides.internal.o9b.t4 var0, n3 var1) {
      float var2 = n5(var1);
      float var3 = k5(var1);
      com.aspose.slides.internal.o9b.z1 var4 = n5(var0, 1, true);
      if (var4 == null) {
         return false;
      }

      n5(var4, var1.h0(), (int)var2, (int)var2);
      com.aspose.slides.internal.o9b.m3 var5 = new com.aspose.slides.internal.o9b.m3(var1.c8(), var3);
      var4.n5(var5, 0.0F, 0.0F, var2, var2);
      var4.n5(var5, (int)var2 % 2 == 0 ? var2 - 1.0F : var2, 0.0F, 0.0F, (int)var2 % 2 == 0 ? var2 - 1.0F : var2);
      var4.dispose();
      return true;
   }

   private static boolean h0(com.aspose.slides.internal.o9b.t4 var0, n3 var1) {
      float var2 = n5(var1);
      float var3 = l6(var1);
      com.aspose.slides.internal.o9b.z1 var4 = n5(var0, 1, false);
      if (var4 == null) {
         return false;
      }

      com.aspose.slides.internal.o9b.u3 var5 = null;
      switch (var1.t2()) {
         case 6:
         case 7:
         case 8:
         case 9:
            n5(var4, var1.h0(), (int)var2, (int)var3);
            var5 = new i1(var1.c8());
            break;
         default:
            n5(var4, var1.c8(), (int)var2, (int)var3);
            var5 = new i1(var1.h0());
      }

      s7 var6 = new s7();
      var6.k5(0.0F, 0.0F, 1.0F, 1.0F);
      var6.k5(var2 / 2.0F, var3 / 2.0F, 1.0F, 1.0F);
      if (var1.t2() == 16) {
         var6.l6(new m1(1.0F, 0.0F, 0.0F, 1.0F, 3.0F, 0.0F));
      }

      if (var1.t2() == 17) {
         var6.l6(new m1(1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -1.0F));
         var4.n5(var5, var6);
         var6.l6(new m1(1.0F, 0.0F, 0.0F, 1.0F, 0.0F, var3));
         var4.n5(var5, var6);
      } else {
         var4.n5(var5, var6);
      }

      var4.dispose();
      return true;
   }

   private static boolean c8(com.aspose.slides.internal.o9b.t4 var0, n3 var1) {
      float var2 = n5(var1);
      float var3 = k5(var1);
      com.aspose.slides.internal.o9b.z1 var4 = n5(var0, 1, false);
      if (var4 == null) {
         return false;
      }

      com.aspose.slides.internal.o9b.m3 var5 = null;
      if (var1.t2() == 13) {
         n5(var4, var1.c8(), (int)var2, (int)var2);
         var5 = new com.aspose.slides.internal.o9b.m3(var1.h0(), var3);
      } else {
         n5(var4, var1.h0(), (int)var2, (int)var2);
         var5 = new com.aspose.slides.internal.o9b.m3(var1.c8(), var3);
      }

      int var6 = Math.round(var2 - 1.0F);
      if (var1.t2() == 10 || var1.t2() == 51) {
         var4.n5(var5, 0, 0, var6, var6);
         var4.n5(var5, 0, var6 - 1, var6 - 1, 0);
      } else if (var1.t2() == 13) {
         var4.n5(var5, 0, 1, var6 - 1, var6);
         var4.n5(var5, 0, var6, var6, 0);
      } else {
         var4.n5(var5, 0.0F, 0.0F, var2 + 0.0F, var2 + 0.0F);
         var4.n5(var5, var2 + 0.0F, 0.0F, 0.0F, var2 + 0.0F);
         var5 = new com.aspose.slides.internal.o9b.m3(var1.h0(), var3);

         for (float var7 = 1.0F; var7 <= var2; var7 += 2.0F) {
            var4.n5(var5, var7, 0.0F, var7, var2);
         }
      }

      var4.dispose();
      return true;
   }

   private static boolean t2(com.aspose.slides.internal.o9b.t4 var0, n3 var1) {
      float var2 = n5(var1);
      float var3 = 2.0F;
      float var4 = (float)Math.sqrt(10.0 * var2 * var2 / 628.3185307179587);
      com.aspose.slides.internal.o9b.l6 var5 = new com.aspose.slides.internal.o9b.l6((int)var3, (int)var3);
      if (var5 == null) {
         return false;
      }

      com.aspose.slides.internal.o9b.z1 var6 = n5(var0, 1, false);
      n5(var6, var1.h0(), (int)var2, (int)var2);
      var6.n5(new n3(12, var1.c8(), var1.h0()), 0.0F, 0.0F, var2, var2);
      new s7();
      i1 var8 = new i1(var1.h0());
      s7 var7 = new s7();
      float var9 = var2 - 1.0F;
      var7.k5(1.0F, var9, 1.0F, 1.0F);
      var7.k5(var9 - 2.0F, var9 - (var9 - 2.0F) + 1.0F, 1.0F, 1.0F);
      var6.n5(var8, var7);
      var6.dispose();
      return true;
   }

   private static boolean s7(com.aspose.slides.internal.o9b.t4 var0, n3 var1) {
      float var2 = n5(var1);
      com.aspose.slides.internal.o9b.z1 var3 = n5(var0, 1, false);
      if (var3 == null) {
         return false;
      }

      n5(var3, var1.h0(), (int)var2, (int)var2);
      i1 var4 = new i1(var1.c8());
      s7 var5 = new s7();
      var5.k5(0.0F, 0.0F, var2 / 2.0F, var2 / 2.0F);
      var5.k5(var2 / 2.0F, var2 / 2.0F, var2, var2);
      var3.n5(var4, var5);
      var3.dispose();
      return true;
   }

   private static boolean x8(com.aspose.slides.internal.o9b.t4 var0, n3 var1) {
      float var2 = n5(var1);
      float var3 = k5(var1);
      com.aspose.slides.internal.o9b.z1 var4 = n5(var0, 1, false);
      if (var4 == null) {
         return false;
      }

      n5(var4, var1.h0(), (int)var2, (int)var2);
      com.aspose.slides.internal.o9b.m3 var5 = new com.aspose.slides.internal.o9b.m3(var1.c8(), var3);
      var4.n5(var5, 0.0F, 0.0F, var2, var2);
      var4.n5(var5, var2 / 2.0F, -var2 / 2.0F, var2 + var2 / 2.0F, var2 - var2 / 2.0F);
      var4.n5(var5, -var2 / 2.0F, var2 / 2.0F, var2 - var2 / 2.0F, var2 + var2 / 2.0F);
      var4.dispose();
      return true;
   }

   private static boolean n3(com.aspose.slides.internal.o9b.t4 var0, n3 var1) {
      float var2 = n5(var1);
      com.aspose.slides.internal.o9b.z1 var3 = n5(var0, 1, false);
      if (var3 == null) {
         return false;
      }

      n5(var3, var1.h0(), (int)var2, (int)var2);
      i1 var4 = new i1(var1.c8());
      com.aspose.slides.internal.o9b.m3 var5 = new com.aspose.slides.internal.o9b.m3(var4);
      s7 var6 = new s7();
      if (var1.t2() == 20) {
         var6.k5(0.0F, 0.0F, 2.0F, 1.0F);
         var6.k5(1.0F, 1.0F, 2.0F, 1.0F);
         var6.k5(2.0F, 2.0F, 2.0F, 1.0F);
         var6.k5(0.0F, 3.0F, 1.0F, 1.0F);
         var6.k5(3.0F, 3.0F, 1.0F, 1.0F);
         var3.n5(var4, var6);
      } else {
         var6.l6(0, 2, 2, 0);
         var6.l6(0, 3, 3, 0);
         var6.n3();
         int var7 = Math.round(var2 - 1.0F);
         var6.l6(var7 - 1, var7 + 1, var7 + 1, var7 - 1);
         var6.n3();
         var3.n5(var5, var6);
      }

      var3.dispose();
      return true;
   }

   private static boolean y4(com.aspose.slides.internal.o9b.t4 var0, n3 var1) {
      float var2 = n5(var1);
      float var3 = k5(var1);
      com.aspose.slides.internal.o9b.z1 var4 = n5(var0, 1, false);
      if (var4 == null) {
         return false;
      }

      n5(var4, var1.h0(), (int)var2, (int)var2);
      com.aspose.slides.internal.o9b.m3 var5 = new com.aspose.slides.internal.o9b.m3(var1.c8(), var3);
      if (var1.t2() == 23) {
         boolean var6 = false;
         boolean var7 = false;
         int var8 = Math.round(var2 - 1.0F);
         var4.n5(var5, 0, var8, var8 + 1, -1);
         var4.n5(var5, -1, 1, 1, -1);
         var4.n5(var5, var8, var8 + 1, var8 + 2, var8 - 1);
         var4.n5(var5, 1, var8, var8 + 1, 0);
      } else {
         var4.n5(var5, var2 / 2.0F + 0.0F + 1.0F + 1.0F, -1.0F, 0.0F, var2 / 2.0F + 0.0F + 1.0F);
         var4.n5(var5, var2 + 0.0F + 1.0F + 1.0F, var2 / 2.0F + 0.0F - 1.0F, var2 / 2.0F + 0.0F + 1.0F - 1.0F, var2 + 0.0F + 1.0F);
      }

      var4.dispose();
      return true;
   }

   private static boolean e2(com.aspose.slides.internal.o9b.t4 var0, n3 var1) {
      float var2 = n5(var1);
      float var3 = l6(var1);
      float var4 = k5(var1);
      com.aspose.slides.internal.o9b.z1 var5 = n5(var0, 1, false);
      if (var5 == null) {
         return false;
      }

      n5(var5, var1.h0(), (int)var2, (int)var3);
      com.aspose.slides.internal.o9b.m3 var6 = new com.aspose.slides.internal.o9b.m3(var1.c8(), var4);
      if (var1.t2() == 31) {
         var5.n5(var6, var2 + 0.0F, 1.0F, 0.0F, var2 + 0.0F + 1.0F);
      } else {
         var5.n5(var6, 0.0F, 2.0F, var2, var2 - 0.0F + 2.0F);
      }

      var5.dispose();
      return true;
   }

   private static boolean t9(com.aspose.slides.internal.o9b.t4 var0, n3 var1) {
      float var2 = n5(var1);
      float var3 = l6(var1);
      float var4 = k5(var1);
      float var5 = 4.0F;
      float var6 = 4.0F;
      com.aspose.slides.internal.o9b.z1 var7 = n5(var0, 1, false);
      if (var7 == null) {
         return false;
      }

      n5(var7, var1.h0(), (int)var2, (int)var3);
      com.aspose.slides.internal.o9b.m3 var8 = new com.aspose.slides.internal.o9b.m3(var1.c8(), var4);
      var7.n5(var8, 0.0F, var5 / 2.0F + 0.0F - 2.0F, (int)var6 - 1, var5 / 2.0F + 0.0F - 2.0F);
      var7.n5(var8, var2 - var6 + 0.0F, var3 - var5 / 2.0F + 0.0F - 2.0F, var2, var3 - var5 / 2.0F + 0.0F - 2.0F);
      var7.dispose();
      return true;
   }

   private static boolean z1(com.aspose.slides.internal.o9b.t4 var0, n3 var1) {
      float var2 = n5(var1);
      float var3 = l6(var1);
      float var4 = k5(var1);
      float var5 = 4.0F;
      float var6 = 4.0F;
      com.aspose.slides.internal.o9b.z1 var7 = n5(var0, 1, false);
      if (var7 == null) {
         return false;
      }

      n5(var7, var1.h0(), (int)var2, (int)var3);
      com.aspose.slides.internal.o9b.m3 var8 = new com.aspose.slides.internal.o9b.m3(var1.c8(), var4);
      var7.n5(var8, var5 / 2.0F + 0.0F - 2.0F, 0.0F, var5 / 2.0F + 0.0F - 2.0F, var6 - 0.0F - 1.0F);
      var7.n5(var8, var2 - var5 / 2.0F + 0.0F - 2.0F, var3 - var6 + 0.0F, var2 - var5 / 2.0F + 0.0F - 2.0F, var3);
      var7.dispose();
      return true;
   }

   private static boolean t4(com.aspose.slides.internal.o9b.t4 var0, n3 var1) {
      float var2 = n5(var1);
      float var3 = var1.t2() == 35 ? 1.5F : 1.0F;
      com.aspose.slides.internal.o9b.z1 var4 = n5(var0, 1, false);
      if (var4 == null) {
         return false;
      }

      n5(var4, var1.h0(), (int)var2, (int)var2);
      i1 var5 = new i1(var1.c8());
      s7 var6 = new s7();
      if (var1.t2() != 35) {
         var6.k5(0.0F, 0.0F, var3, var3);
         var6.k5(var2 / 8.0F, var2 / 4.0F, var3, var3);
         var6.k5(3.0F * var2 / 8.0F, var2 / 2.0F, var3, var3);
         var6.k5(var2 / 4.0F, 3.0F * var2 / 4.0F, var3, var3);
         var6.k5(var2 / 2.0F, var2 / 8.0F, var3, var3);
         var6.k5(3.0F * var2 / 4.0F, 3.0F * var2 / 8.0F, var3, var3);
         var6.k5(7.0F * var2 / 8.0F, 5.0F * var2 / 8.0F, var3, var3);
         var6.k5(5.0F * var2 / 8.0F, 7.0F * var2 / 8.0F, var3, var3);
      } else {
         var6.k5(-var2 / 8.0F, -var2 / 8.0F, var3, var3);
         var6.k5(-var2 / 8.0F, var2 - 1.0F, var3, var3);
         var6.k5(var2 / 4.0F, 0.0F, var3, var3);
         var6.k5(3.0F * var2 / 8.0F, var2 / 2.0F - 1.0F, var3, var3);
         var6.k5(var2 / 2.0F, 3.0F * var2 / 4.0F, var3, var3);
         var6.k5(var2 - 1.0F, var2 - 1.0F, var3, var3);
         var6.k5(3.0F * var2 / 4.0F, 3.0F * var2 / 8.0F - 1.0F, var3, var3);
         var6.k5(0.0F, 5.0F * var2 / 8.0F - 1.0F, var3, var3);
         var6.k5(var2 - 1.0F, -var2 / 8.0F, var3, var3);
      }

      var4.n5(var5, var6);
      var4.dispose();
      return true;
   }

   private static boolean q0(com.aspose.slides.internal.o9b.t4 var0, n3 var1) {
      float var2 = n5(var1);
      float var3 = l6(var1);
      float var4 = k5(var1);
      com.aspose.slides.internal.o9b.z1 var5 = n5(var0, 1, false);
      if (var5 == null) {
         return false;
      }

      n5(var5, var1.h0(), (int)var2, (int)var3);
      com.aspose.slides.internal.o9b.m3 var6 = new com.aspose.slides.internal.o9b.m3(var1.c8(), var4);
      var5.n5(var6, 0.0F, 0.0F, var3 + 0.0F, var3 + 0.0F);
      var5.n5(var6, var2 - 1.0F + 0.0F, 0.0F, var3 - 0.0F, var3 + 0.0F - 1.0F);
      var5.dispose();
      return true;
   }

   private static boolean z3(com.aspose.slides.internal.o9b.t4 var0, n3 var1) {
      float var2 = n5(var1);
      float var3 = l6(var1);
      float var4 = k5(var1);
      com.aspose.slides.internal.o9b.z1 var5 = n5(var0, 1, false);
      if (var5 == null) {
         return false;
      }

      n5(var5, var1.h0(), (int)var2, (int)var3);
      com.aspose.slides.internal.o9b.m3 var6 = new com.aspose.slides.internal.o9b.m3(var1.c8(), var4);
      var5.l6(var2 - 2.0F, 0.0F);
      var5.l6(
         var6,
         new com.aspose.slides.internal.o9b.j5[]{
            new com.aspose.slides.internal.o9b.j5(1, 1),
            new com.aspose.slides.internal.o9b.j5((int)(var2 / 4.0 + 0.0), (int)(var3 + 0.0F - 1.0F)),
            new com.aspose.slides.internal.o9b.j5((int)(var2 / 2.0 + 0.0), (int)(var3 / 2.0 + 0.0))
         }
      );
      var5.l6(-var2, 0.0F);
      var5.l6(
         var6,
         new com.aspose.slides.internal.o9b.j5[]{
            new com.aspose.slides.internal.o9b.j5(1, 1),
            new com.aspose.slides.internal.o9b.j5((int)(var2 / 4.0 + 0.0), (int)(var3 + 0.0F - 1.0F)),
            new com.aspose.slides.internal.o9b.j5((int)(var2 / 2.0 + 0.0), (int)(var3 / 2.0 + 0.0))
         }
      );
      var5.l6(
         var6,
         new com.aspose.slides.internal.o9b.j5[]{
            new com.aspose.slides.internal.o9b.j5((int)(var2 / 2.0 + 0.0), (int)(var3 / 2.0 + 0.0)),
            new com.aspose.slides.internal.o9b.j5((int)(3.0F * var2 / 4.0 + 0.0), 1),
            new com.aspose.slides.internal.o9b.j5((int)(var2 - 1.0 + 0.0), (int)(var3 - 1.0 + 0.0 - 1.0))
         }
      );
      var5.dispose();
      return true;
   }

   private static boolean m1(com.aspose.slides.internal.o9b.t4 var0, n3 var1) {
      float var2 = n5(var1);
      float var3 = k5(var1);
      com.aspose.slides.internal.o9b.z1 var4 = n5(var0, 1, false);
      if (var4 == null) {
         return false;
      }

      n5(var4, var1.h0(), (int)var2, (int)var2);
      com.aspose.slides.internal.o9b.m3 var5 = new com.aspose.slides.internal.o9b.m3(var1.c8(), var3);
      var4.n5(var5, 0.0F, var2 + 0.0F - 1.0F, var2 + 0.0F - 1.0F, 0.0F);
      var4.n5(var5, var2 / 2.0F + 0.0F, var2 / 2.0F + 0.0F, var2 + 0.0F, var2 + 0.0F);
      var4.dispose();
      return true;
   }

   private static boolean k7(com.aspose.slides.internal.o9b.t4 var0, n3 var1) {
      float var2 = n5(var1);
      float var3 = k5(var1);
      com.aspose.slides.internal.o9b.z1 var4 = n5(var0, 1, false);
      if (var4 == null) {
         return false;
      }

      n5(var4, var1.h0(), (int)var2, (int)var2);
      com.aspose.slides.internal.o9b.m3 var5 = new com.aspose.slides.internal.o9b.m3(var1.c8(), var3);
      var4.n5(var5, var2 + 0.0F, 0.0F, 0.0F, 0.0F);
      var4.n5(var5, 0.0F, 0.0F, 0.0F, var2 / 2.0F + 0.0F);
      var4.n5(var5, 0.0F, var2 / 2.0F + 0.0F, var2 + 0.0F, var2 / 2.0F + 0.0F);
      var4.n5(var5, var2 / 2.0F + 0.0F, var2 / 2.0F + 0.0F, var2 / 2.0F + 0.0F, var2 + 0.0F);
      var4.dispose();
      return true;
   }

   private static boolean m3(com.aspose.slides.internal.o9b.t4 var0, n3 var1) {
      float var2 = n5(var1);
      float var3 = k5(var1);
      float[] var4 = new float[]{0.5F};
      com.aspose.slides.internal.o9b.z1 var5 = n5(var0, 1, false);
      if (var5 == null) {
         return false;
      }

      n5(var5, var1.h0(), (int)var2, (int)var2);
      com.aspose.slides.internal.o9b.m3 var6 = new com.aspose.slides.internal.o9b.m3(var1.c8(), var3);
      var6.l6(var4);
      var5.n5(var6, 0.0F, var2 / 2.0F + 0.0F, var2 / 2.0F + 0.0F, 0.0F);
      var5.n5(var6, var2 / 2.0F + 0.0F, 0.0F, var2 + 0.0F, var2 / 2.0F + 0.0F);
      var5.n5(var6, 3.0F * var2 / 4.0F + 0.0F, var2 / 4.0F + 0.0F, 0.0F, var2 + 0.0F);
      var5.n5(var6, 0.0F, 0.0F, var2 / 4.0F + 0.0F, var2 / 4.0F + 0.0F);
      var5.n5(var6, var2 / 4.0F + 0.0F, 3.0F * var2 / 4.0F + 0.0F, var2 / 2.0F + 0.0F, var2 + 0.0F);
      var5.n5(var6, var2 + 0.0F, var2 + 0.0F, var2 / 2.0F + 0.0F, var2 / 2.0F + 0.0F);
      var5.dispose();
      return true;
   }

   private static boolean z8(com.aspose.slides.internal.o9b.t4 var0, n3 var1) {
      float var2 = n5(var1);
      float var3 = 2.0F;
      com.aspose.slides.internal.o9b.z1 var4 = null;
      com.aspose.slides.internal.o9b.l6 var5 = new com.aspose.slides.internal.o9b.l6((int)var3, (int)var3);
      if (var5 == null) {
         return false;
      } else {
         var4 = n5(var0, 1, false);
         if (var4 == null) {
            var5.dispose();
            return false;
         } else {
            n5(var4, var1.h0(), (int)var2, (int)var2);
            n3 var6 = new n3(12, var1.c8(), var1.h0());
            s7 var7 = new s7();
            var7.k5(0.0F, 0.0F, var2, var2 / 2.0F);
            var4.n5(var6, var7);
            i1 var9 = new i1(var1.c8());
            var7 = new s7();
            var7.k5(0.0F, var2 / 2.0F, var2 / 2.0F, var2 / 2.0F);
            var4.n5(var9, var7);
            i1 var10 = new i1(var1.h0());
            var7 = new s7();
            var7.k5(var2 / 2.0F, var2 / 2.0F, var2 / 2.0F, var2 / 2.0F);
            var4.n5(var10, var7);
            var4.dispose();
            return true;
         }
      }
   }

   private static boolean j5(com.aspose.slides.internal.o9b.t4 var0, n3 var1) {
      float var2 = n5(var1);
      float var3 = k5(var1);
      com.aspose.slides.internal.o9b.z1 var4 = n5(var0, 1, false);
      if (var4 == null) {
         return false;
      }

      n5(var4, var1.h0(), (int)var2, (int)var2);
      com.aspose.slides.internal.o9b.m3 var5 = new com.aspose.slides.internal.o9b.m3(var1.c8(), var3);
      float var6 = var2 / 8.0F + 0.0F;
      float var7 = var2 / 8.0F + 0.0F;
      s7 var8 = new s7();
      var8.k5(var6, var7, 1.0F, 1.0F);
      var8.k5(var6 + 1.0F, var7 + 1.0F, 1.0F, 1.0F);
      var8.k5(var6, var7 + 2.0F, 1.0F, 1.0F);
      var6 = -2.0F;
      var7 = var2 - 1.0F;
      var8.k5(var6, var7, 1.0F, 1.0F);
      var8.k5(var6 - 1.0F, var7 - 1.0F, 1.0F, 1.0F);
      var8.k5(var6, var7 - 2.0F, 1.0F, 1.0F);
      var6 += var2;
      var8.k5(var6, var7, 1.0F, 1.0F);
      var8.k5(var6 - 1.0F, var7 - 1.0F, 1.0F, 1.0F);
      var8.k5(var6, var7 - 2.0F, 1.0F, 1.0F);
      var8.l6(new m1(1.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F));
      var4.n5(new i1(var5.k5()), var8);
      var4.dispose();
      return true;
   }

   private static boolean w1(com.aspose.slides.internal.o9b.t4 var0, n3 var1) {
      float var2 = n5(var1);
      float var3 = l6(var1);
      com.aspose.slides.internal.o9b.z1 var4 = n5(var0, 0, false);
      if (var4 == null) {
         return false;
      }

      n5(var4, var1.h0(), (int)var2, (int)var3);
      i1 var5 = new i1(var1.c8());
      s7 var6 = new s7();
      float var7 = var2 / 2.0F - 1.0F;
      var6.k5(
         new com.aspose.slides.internal.o9b.w1[]{
            new com.aspose.slides.internal.o9b.w1(0.0F, var7),
            new com.aspose.slides.internal.o9b.w1(var7 + 0.5F, -0.5F),
            new com.aspose.slides.internal.o9b.w1(var7 * 2.0F + 0.5F, var7 + 0.5F),
            new com.aspose.slides.internal.o9b.w1(var7 + 0.5F, var7 * 2.0F + 0.5F)
         }
      );
      var6.n3();
      var4.n5(var5, var6);
      var4.dispose();
      return true;
   }

   private static boolean r4(com.aspose.slides.internal.o9b.t4 var0, n3 var1) {
      float var2 = n5(var1);
      float var3 = k5(var1);
      com.aspose.slides.internal.o9b.z1 var4 = n5(var0, 1, false);
      if (var4 == null) {
         return false;
      }

      n5(var4, var1.h0(), (int)var2, (int)var2);
      com.aspose.slides.internal.o9b.m3 var5 = new com.aspose.slides.internal.o9b.m3(var1.c8(), var3);
      var4.n5(var5, -1.0F, 0.0F, var2 / 4.0F + 0.0F - 0.0F, var2 / 4.0F + 0.0F + 1.0F);
      var4.n5(var5, 3.0F, 3.0F, var2 / 4.0F + 0.0F + 2.0F, var2 / 4.0F + 0.0F + 2.0F);
      var4.n5(var5, var2 - 2.0F, 0.0F, var2, 0.0F);
      var4.n5(var5, 3.0F * var2 / 4.0F + 0.0F - 3.0F, var2 / 4.0F + 0.0F + 1.0F, var2 + 0.0F - 2.0F, 0.0F);
      float var6 = Math.round((float)Math.sqrt(2.0) * (var2 / 2.0F));
      var4.n5(var5, -var6 + 1.0F, (int)var2 - var6, var6 * 2.0F, var6 * 2.0F, -45.0F, 45.0F);
      var4.dispose();
      return true;
   }

   private static boolean c4(com.aspose.slides.internal.o9b.t4 var0, n3 var1) {
      float var2 = n5(var1);
      com.aspose.slides.internal.o9b.z1 var3 = n5(var0, 1, false);
      if (var3 == null) {
         return false;
      }

      n5(var3, var1.c8(), (int)var2, (int)var2);
      i1 var4 = new i1(var1.h0());
      s7 var5 = new s7();
      var5.k5(0.0F, var2 / 4.0F, var2 / 2.0F, var2 / 4.0F);
      var5.k5(var2 / 2.0F, 3.0F * var2 / 4.0F, var2 / 2.0F, var2 / 4.0F);
      var5.l6(new m1(1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F));
      var3.n5(var4, var5);
      var5.l6(new m1(1.0F, 0.0F, 0.0F, 1.0F, var2, 0.0F));
      var3.n5(var4, var5);
      var3.dispose();
      return true;
   }

   private static boolean y2(com.aspose.slides.internal.o9b.t4 var0, n3 var1) {
      float var2 = n5(var1);
      float var3 = k5(var1);
      float var4 = var2 / 4.0F + 0.5F;
      com.aspose.slides.internal.o9b.z1 var5 = n5(var0, 1, false);
      if (var5 == null) {
         return false;
      }

      n5(var5, var1.h0(), (int)var2, (int)var2);
      byte var6 = 5;
      byte var7 = -1;
      byte var8 = 4;
      com.aspose.slides.internal.o9b.m3 var9 = new com.aspose.slides.internal.o9b.m3(var1.c8());
      n5(var5, var9, var7, var8, var6);
      n5(var5, var9, var7, var8 - 2 * (var6 - 1), var6);
      n5(var5, var9, var7 + var6 - 1, var8 + var6 - 1, var6);
      n5(var5, var9, var7 - var6 + 1, var8 - var6 + 1, var6);
      n5(var5, var9, var7 + var6 - 1, var8 - var6 + 1, var6);
      n5(var5, var9, var7 - var6 + 1, var8 + var6 - 1, var6);
      return true;
   }

   private static void n5(com.aspose.slides.internal.o9b.z1 var0, com.aspose.slides.internal.o9b.m3 var1, int var2, int var3, int var4) {
      var0.n5(var1, var2 + 2, var3, var2 + var4 - 1, var3);
      var0.n5(var1, var2 + 1, var3 + 1, var2 + 1, var3 + var4 - 2);
      var0.n5(var1, var2 + var4, var3 + 1, var2 + var4, var3 + var4 - 2);
      var0.n5(var1, var2 + 2, var3 + var4 - 1, var2 + var4 - 1, var3 + var4 - 1);
      var0.n5(var1, var2 + 2, var3 + var4 - 2, var2 + var4 - 1, var3 + var4 - 2);
      var0.n5(var1, var2 + 2, var3 + var4 - 3, var2 + var4 - 1, var3 + var4 - 3);
      var0.n5(var1, var2 + var4 - 1, var3 + 1, var2 + var4 - 1, var3 + var4 - 2);
   }

   private static boolean y1(com.aspose.slides.internal.o9b.t4 var0, n3 var1) {
      float var2 = n5(var1);
      com.aspose.slides.internal.o9b.z1 var3 = n5(var0, 1, false);
      if (var3 == null) {
         return false;
      }

      n5(var3, var1.h0(), (int)var2, (int)var2);
      i1 var4 = new i1(var1.c8());
      float var5 = var2 / 2.0F;
      if (var1.t2() == 49) {
         var3.l6(-1.0F, -1.0F);
      }

      var3.n5(var4, 0.0F, 0.0F, var5, var5);
      var3.n5(var4, var5, var5, var5, var5);
      if (var1.t2() == 49) {
         var3.l6(var2, 0.0F);
         var3.n5(var4, 0.0F, 0.0F, var5, var5);
         var3.n5(var4, var5, var5, var5, var5);
         var3.l6(0.0F, var2);
         var3.n5(var4, 0.0F, 0.0F, var5, var5);
         var3.n5(var4, var5, var5, var5, var5);
         var3.l6(-var2, 0.0F);
         var3.n5(var4, 0.0F, 0.0F, var5, var5);
         var3.n5(var4, var5, var5, var5, var5);
      }

      var3.dispose();
      return true;
   }

   public com.aspose.slides.internal.o9b.t4 s7() {
      return n5((com.aspose.slides.internal.o9b.u3)this);
   }

   private static com.aspose.slides.internal.o9b.t4 n5(com.aspose.slides.internal.o9b.u3 var0) {
      n3 var1 = null;
      boolean var2 = true;
      if (var0 == null) {
         throw new ArgumentException();
      }

      com.aspose.slides.internal.o9b.l6 var3 = null;
      var1 = (n3)var0;
      int var4 = (int)n5(var1);
      int var5 = (int)l6(var1);
      var3 = new com.aspose.slides.internal.o9b.l6(var4, var5, 2498570);
      if (var3 == null) {
         return null;
      }

      switch (var1.t2()) {
         case 0:
         case 25:
         case 27:
         case 29:
            var2 = n5(var3, var1);
            break;
         case 1:
         case 24:
         case 26:
         case 28:
            var2 = l6(var3, var1);
            break;
         case 2:
            var2 = k5(var3, var1);
            break;
         case 3:
            var2 = u3(var3, var1);
            break;
         case 4:
         case 43:
         case 48:
            var2 = a6(var3, var1);
            break;
         case 5:
            var2 = u9(var3, var1);
            break;
         case 6:
         case 7:
         case 8:
         case 9:
         case 14:
         case 15:
         case 16:
         case 17:
            var2 = h0(var3, var1);
            break;
         case 10:
         case 13:
         case 44:
         case 51:
            var2 = c8(var3, var1);
            break;
         case 11:
            var2 = t2(var3, var1);
            break;
         case 12:
            var2 = s7(var3, var1);
            break;
         case 18:
         case 22:
            var2 = x8(var3, var1);
            break;
         case 19:
         case 23:
            var2 = y4(var3, var1);
            break;
         case 20:
         case 21:
            var2 = n3(var3, var1);
            break;
         case 30:
         case 31:
            var2 = e2(var3, var1);
            break;
         case 32:
            var2 = t9(var3, var1);
            break;
         case 33:
            var2 = z1(var3, var1);
            break;
         case 34:
         case 35:
            var2 = t4(var3, var1);
            break;
         case 36:
            var2 = q0(var3, var1);
            break;
         case 37:
            var2 = z3(var3, var1);
            break;
         case 38:
            var2 = m1(var3, var1);
            break;
         case 39:
            var2 = k7(var3, var1);
            break;
         case 40:
            var2 = m3(var3, var1);
            break;
         case 41:
            var2 = z8(var3, var1);
            break;
         case 42:
            var2 = j5(var3, var1);
            break;
         case 45:
            var2 = r4(var3, var1);
            break;
         case 46:
            var2 = c4(var3, var1);
            break;
         case 47:
            var2 = y2(var3, var1);
            break;
         case 49:
         case 50:
            var2 = y1(var3, var1);
            break;
         case 52:
            var2 = w1(var3, var1);
            break;
         default:
            var2 = false;
      }

      if (!var2) {
         var3.dispose();
         return null;
      } else {
         return var3;
      }
   }
}
