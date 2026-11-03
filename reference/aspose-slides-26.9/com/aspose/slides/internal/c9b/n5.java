package com.aspose.slides.internal.c9b;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.o9b.m3;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.v4;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class n5 extends h0 implements v4, Shape, Cloneable {
   HashSet<Integer> n5 = new HashSet<>();

   public n5() {
   }

   public n5(GeneralPath var1) {
      super(var1);
      this.z1();
   }

   public n5(Shape var1) {
      super(var1);
      if (var1 instanceof n5) {
         this.n5 = new HashSet<>(((n5)var1).n5);
      }

      this.z1();
   }

   public byte[] n5() {
      byte[] var1 = new byte[20];
      int var2 = 0;
      double[] var3 = new double[6];

      for (PathIterator var4 = this.getPathIterator(null); !var4.isDone(); var4.next()) {
         byte var5 = (byte)var4.currentSegment(var3);
         if (var2 + 3 >= var1.length) {
            int var6 = var1.length;
            if (var6 > 500) {
               var6 = 500;
            }

            var1 = Arrays.copyOf(var1, var1.length + var6);
         }

         switch (var5) {
            case 0:
            case 1:
               var1[var2++] = var5;
               break;
            case 2:
               var1[var2++] = var5;
               var1[var2++] = var5;
               break;
            case 3:
               var1[var2++] = var5;
               var1[var2++] = var5;
               var1[var2++] = var5;
               break;
            case 4:
               var1[var2 - 1] = (byte)(var1[var2 - 1] | 128);
         }
      }

      for (Integer var11 : this.n5) {
         int var17 = var11;
         var1[var17] = (byte)(var1[var17] | 32);
      }

      return Arrays.copyOf(var1, var2);
   }

   public float[] l6() {
      float[] var1 = new float[6];
      float[] var2 = new float[20];
      int var3 = 0;

      for (PathIterator var4 = this.getPathIterator(null); !var4.isDone(); var4.next()) {
         byte var5 = (byte)var4.currentSegment(var1);
         if (var3 + 6 >= var2.length) {
            int var6 = var2.length;
            if (var6 > 500) {
               var6 = 500;
            }

            var2 = Arrays.copyOf(var2, var2.length + var6);
         }

         switch (var5) {
            case 0:
               var2[var3++] = var1[0];
               var2[var3++] = var1[1];
               break;
            case 1:
               var2[var3++] = var1[0];
               var2[var3++] = var1[1];
               break;
            case 2:
               var2[var3++] = var1[0];
               var2[var3++] = var1[1];
               var2[var3++] = var1[2];
               var2[var3++] = var1[3];
               break;
            case 3:
               var2[var3++] = var1[0];
               var2[var3++] = var1[1];
               var2[var3++] = var1[2];
               var2[var3++] = var1[3];
               var2[var3++] = var1[4];
               var2[var3++] = var1[5];
         }
      }

      return Arrays.copyOf(var2, var3);
   }

   public int k5() {
      int var1 = 0;
      double[] var2 = new double[6];

      for (PathIterator var3 = this.getPathIterator(null); !var3.isDone(); var3.next()) {
         byte var4 = (byte)var3.currentSegment(var2);
         switch (var4) {
            case 0:
               var1++;
               break;
            case 1:
               var1++;
               break;
            case 2:
               var1 += 2;
               break;
            case 3:
               var1 += 3;
            case 4:
         }
      }

      return var1;
   }

   public int u3() {
      return this.l6().length;
   }

   public boolean a6() {
      byte var1 = -1;
      double[] var2 = new double[6];
      PathIterator var3 = this.getPathIterator(null);

      while (!var3.isDone()) {
         var1 = (byte)var3.currentSegment(var2);
         var3.next();
      }

      return var1 == -1 ? true : var1 == 4;
   }

   public int u9() {
      return this.u3() / 2;
   }

   public void n5(Shape var1) {
      this.n5(var1, !this.a6());
   }

   @Override
   public void n5(Shape var1, boolean var2) {
      super.n5(var1, var2);
      this.z1();
   }

   @Override
   public Object deepClone() {
      return new n5(this);
   }

   static boolean n5(float var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, List<w1> var10) {
      boolean var11 = false;
      boolean var12 = false;
      float var13 = var2 - var0;
      float var14 = var3 - var1;
      float var15 = var4 - var0;
      float var16 = var5 - var1;
      float var17 = var6 - var0;
      float var18 = var7 - var1;
      float var19 = var6 - var4;
      float var20 = var7 - var5;
      float var21 = var8;
      float var22 = var17 * var17 + var18 * var18;
      if (var22 < var21) {
         float var23 = var13 * var13 + var14 * var14;
         float var24 = var15 * var15 + var16 * var16;
         if (var23 < var21 && var24 < var21) {
            var11 = true;
         } else {
            var12 = true;
         }
      }

      if (!var11 && !var12) {
         float var25 = var21 * var22;
         float var26 = var13 * var17 + var14 * var18;
         float var27 = var14 * var17 - var13 * var18;
         float var28 = var15 * var17 + var16 * var18;
         float var29 = var16 * var17 - var15 * var18;
         float var30 = var19 * var17 + var20 * var18;
         if (var27 * var27 > var25) {
            var12 = true;
         } else if (var29 * var29 > var25) {
            var12 = true;
         } else if (var26 < 0.0 && var26 * var26 > var25) {
            var12 = true;
         } else if (var30 < 0.0 && var30 * var30 > var25) {
            var12 = true;
         } else if (var26 >= var28) {
            var12 = true;
         }
      }

      if (var11) {
         var10.add(new w1(var6, var7));
         return true;
      }

      if (var9 >= 15) {
         return false;
      }

      float var31 = (var0 + var2) * 0.5F;
      float var32 = (var1 + var3) * 0.5F;
      float var33 = (var0 + 2.0F * var2 + var4) * 0.25F;
      float var34 = (var1 + 2.0F * var3 + var5) * 0.25F;
      float var35 = (var2 + 2.0F * var4 + var6) * 0.25F;
      float var36 = (var3 + 2.0F * var5 + var7) * 0.25F;
      float var37 = (var4 + var6) * 0.5F;
      float var38 = (var5 + var7) * 0.5F;
      float var39 = (var33 + var35) * 0.5F;
      float var40 = (var34 + var36) * 0.5F;
      return !n5(var0, var1, var31, var32, var33, var34, var39, var40, var8, var9 + 1, var10)
         ? false
         : n5(var39, var40, var35, var36, var37, var38, var6, var7, var8, var9 + 1, var10);
   }

   private static boolean n5(float[] var0, int var1, float var2, List<w1> var3, List<Byte> var4) {
      if (var1 > 0 && var1 + 2 < var0.length / 2) {
         w1 var5 = new w1(var0[(var1 - 1) * 2], var0[(var1 - 1) * 2 + 1]);
         w1 var6 = new w1(var0[var1 * 2], var0[var1 * 2 + 1]);
         w1 var7 = new w1(var0[(var1 + 1) * 2], var0[(var1 + 1) * 2 + 1]);
         w1 var8 = new w1(var0[(var1 + 2) * 2], var0[(var1 + 2) * 2 + 1]);
         ArrayList var9 = new ArrayList();
         if (!n5(var5.l6(), var5.k5(), var6.l6(), var6.k5(), var7.l6(), var7.k5(), var8.l6(), var8.k5(), var2, 0, var9)) {
            var9.clear();
            return false;
         }

         if (var9.size() > 0) {
            var3.add((w1)var9.get(0));
            byte var10 = 1;
            var4.add(var10);
         }

         byte var13 = 1;

         for (int var11 = 1; var11 < var9.size(); var11++) {
            w1 var12 = (w1)var9.get(var11);
            var3.add(var12);
            var4.add(var13);
         }

         var9.clear();
         return true;
      } else {
         return false;
      }
   }

   public boolean n5(m1 var1, float var2) {
      ArrayList var3 = new ArrayList();
      ArrayList var4 = new ArrayList();
      if (var1 != null) {
         Rectangle2D var5 = this.getBounds2D();
         this.c8();
         this.n5(var1.t2().createTransformedShape(var5));
      }

      if (!this.h0()) {
         return true;
      }

      float[] var11 = this.l6();
      byte[] var6 = this.n5();

      for (int var7 = 0; var7 < var11.length / 2; var7++) {
         w1 var8 = new w1(var11[var7 * 2], var11[var7 * 2 + 1]);
         byte var9 = var6[var7];
         if ((var9 & 3) == 3) {
            if (!n5(var11, var7, Math.abs(var2), var3, var4)) {
               w1 var10 = new w1(0.0F, 0.0F);
               var3 = new ArrayList();
               var4 = new ArrayList();
               var9 = 0;
               var3.add(var10);
               var4.add(var9);
               var9 = 1;
               var3.add(var10);
               var4.add(var9);
               var3.add(var10);
               var4.add(var9);
               var3.add(var10);
               var4.add(var9);
               break;
            }

            var7 += 2;
         } else {
            var3.add(var8);
            var4.add(var9);
         }
      }

      this.c8();

      for (int var12 = 0; var12 < var4.size(); var12++) {
         int var13 = (Byte)var4.get(var12) & 255;
         switch (var13) {
            case 0:
               this.l6(((w1)var3.get(var12)).l6(), ((w1)var3.get(var12)).k5());
               break;
            case 1:
               this.n5(((w1)var3.get(var12)).l6(), ((w1)var3.get(var12)).k5());
               break;
            case 2:
            case 3:
            default:
               throw new IllegalStateException("Invalid path point type=" + var13);
            case 4:
               this.e2();
               break;
            case 129:
            case 161:
               this.n5(((w1)var3.get(var12)).l6(), ((w1)var3.get(var12)).k5());
               this.e2();
         }
      }

      return true;
   }

   public boolean h0() {
      double[] var1 = new double[6];
      PathIterator var2 = this.getPathIterator(null);

      while (!var2.isDone()) {
         byte var3 = (byte)var2.currentSegment(var1);
         if (var3 == 3) {
            return true;
         }

         var2.next();
      }

      return false;
   }

   public boolean n5(com.aspose.slides.internal.v6g.a6<y1> var1, m1 var2, m3 var3) {
      y1 var4 = (y1)var1.n5;
      n5 var5 = null;
      if (var4 == null) {
         return false;
      }

      if (this.getPathIterator(null).isDone()) {
         var4.k5(0.0F);
         var4.u3(0.0F);
         var4.l6(0.0F);
         var4.n5(0.0F);
         return true;
      }

      var5 = (n5)this.deepClone();
      if (var5.n5(var2, 25.0F)) {
         float[] var6 = var5.l6();
         w1 var7 = new w1(var6[0], var6[1]);
         var4.k5(var7.l6());
         var4.u3(var7.k5());
         if (var5.u9() == 1) {
            var4.l6(0.0F);
            var4.n5(0.0F);
            return true;
         }

         var4.l6(var7.l6());
         var4.n5(var7.k5());

         for (int var8 = 1; var8 < var6.length / 2; var8++) {
            var7 = new w1(var6[var8 * 2], var6[var8 * 2 + 1]);
            if (var7.l6() < var4.x8()) {
               var4.k5(var7.l6());
            }

            if (var7.k5() < var4.n3()) {
               var4.u3(var7.k5());
            }

            if (var7.l6() > var4.s7()) {
               var4.l6(var7.l6());
            }

            if (var7.k5() > var4.k5()) {
               var4.n5(var7.k5());
            }
         }

         var4.l6(var4.s7() - var4.x8());
         var4.n5(var4.k5() - var4.n3());
         if (var3 != null) {
            float var12 = var3.q0() < 1.0F ? 1.0F : var3.q0();
            float var9 = var12 / 2.0F;
            var4.k5(var4.x8() - var9);
            var4.u3(var4.n3() - var9);
            var4.l6(var4.s7() + var12);
            var4.n5(var4.k5() + var12);
         }
      }

      return true;
   }

   public boolean l6(com.aspose.slides.internal.v6g.a6<y2> var1, m1 var2, m3 var3) {
      y1 var4 = new y1();
      n5 var5 = this;
      y2 var6 = (y2)var1.n5;
      if (var5 != null && var6 != null) {
         if (!var5.n5(new com.aspose.slides.internal.v6g.a6<>(var4), var2, var3)) {
            return false;
         }

         var6.k5((int)var4.x8());
         var6.u3((int)var4.n3());
         var6.l6((int)var4.s7());
         var6.n5((int)var4.k5());
         return true;
      } else {
         return false;
      }
   }

   @Override
   public PathIterator getPathIterator(AffineTransform at, double flatness) {
      Shape var4 = com.aspose.slides.internal.n1b.l6.n5(this.getPathIterator(at), flatness);
      k5 var5 = new k5(var4.getPathIterator(null), flatness);
      Shape var6 = com.aspose.slides.internal.n1b.l6.l6(var5, flatness);
      return var6.getPathIterator(null);
   }

   @Override
   public void c8() {
      super.c8();
      this.k5(n5(0));
      this.n5.clear();
   }

   public static int n5(int var0) {
      if (var0 == 0) {
         return 0;
      } else {
         return var0 == 1 ? 1 : var0;
      }
   }

   public void n5(AffineTransform var1, int var2, int var3) {
      float[] var4 = this.l6();
      ArrayList var5 = new ArrayList();
      double[] var6 = new double[6];
      PathIterator var7 = this.getPathIterator(null);

      while (!var7.isDone()) {
         byte var8 = (byte)var7.currentSegment(var6);
         var5.add(var8);
         var7.next();
      }

      var1.transform(var4, var2, var4, var2, var3 / 2);
      this.c8();
      int var10 = 0;

      for (Object recoveredElement$var9$13791 : var5) {
         Byte var9 = (Byte)recoveredElement$var9$13791;
         switch (var9) {
            case 0:
               this.l6(var4[var10++], var4[var10++]);
               break;
            case 1:
               this.n5(var4[var10++], var4[var10++]);
               break;
            case 2:
               this.n5(var4[var10++], var4[var10++], var4[var10++], var4[var10++]);
               break;
            case 3:
               this.n5(var4[var10++], var4[var10++], var4[var10++], var4[var10++], var4[var10++], var4[var10++]);
               break;
            case 4:
               this.e2();
               break;
            default:
               throw new IllegalStateException("Invalid path point type=" + var9);
         }
      }
   }

   public void t2() {
      int var1 = this.k5();
      this.l6(var1);
   }

   public void l6(int var1) {
      if (var1 > 0) {
         this.n5.add(var1 - 1);
      }
   }

   public void s7() {
      float[] var1 = this.l6();
      ArrayList var2 = new ArrayList();
      double[] var3 = new double[6];
      PathIterator var4 = this.getPathIterator(null);

      while (!var4.isDone()) {
         byte var5 = (byte)var4.currentSegment(var3);
         var2.add(var5);
         var4.next();
      }

      for (int var7 = 1; var7 < var2.size(); var7++) {
         if ((Byte)var2.get(var7) == 0 && (Byte)var2.get(var7 - 1) != 4) {
            var2.add(var7, (byte)4);
         }
      }

      this.c8();
      int var8 = 0;

      for (int var19 = 0; var19 < var2.size(); var19++) {
         byte var6 = (Byte)var2.get(var19);
         switch (var6) {
            case 0:
               this.l6(var1[var8++], var1[var8++]);
               break;
            case 1:
               this.n5(var1[var8++], var1[var8++]);
               break;
            case 2:
               this.n5(var1[var8++], var1[var8++], var1[var8++], var1[var8++]);
               break;
            case 3:
               this.n5(var1[var8++], var1[var8++], var1[var8++], var1[var8++], var1[var8++], var1[var8++]);
               break;
            case 4:
               this.e2();
         }
      }
   }

   public w1 x8() {
      Point2D var1 = this.y4().getCurrentPoint();
      if (var1 == null) {
         throw new ArgumentException("Invalid parameter used.");
      }

      float[] var2 = new float[6];
      PathIterator var3 = this.getPathIterator(null);
      if (!var3.isDone()) {
         byte var4 = (byte)var3.currentSegment(var2);
      }

      if (var2[0] == (float)var1.getX() && var2[1] == (float)var1.getY()) {
         float[] var5 = this.l6();
         return new w1(var5[var5.length - 2], var5[var5.length - 1]);
      } else {
         return new w1((float)var1.getX(), (float)var1.getY());
      }
   }

   private void z1() {
      ArrayList var1 = new ArrayList();
      boolean var2 = true;
      double[] var3 = new double[6];

      for (PathIterator var4 = this.getPathIterator(null); !var4.isDone(); var4.next()) {
         byte var5 = (byte)var4.currentSegment(var3);
         var1.add(var5);
         if (var5 == 2) {
            var2 = false;
         }
      }

      if (!var2) {
         float[] var20 = this.l6();
         this.c8();
         float var21 = 0.0F;
         float var6 = 0.0F;
         int var7 = 0;

         for (int var8 = 0; var8 < var1.size(); var8++) {
            byte var9 = (Byte)var1.get(var8);
            switch (var9) {
               case 0:
                  var21 = var20[var7++];
                  var6 = var20[var7++];
                  this.l6(var21, var6);
                  break;
               case 1:
                  float var10 = var20[var7++];
                  float var11 = var20[var7++];
                  if (var10 != var21 || var11 != var6) {
                     this.n5(var10, var11);
                  } else if (var8 > 0 && (Byte)var1.get(var8 - 1) != 0 && (var8 + 1 >= var1.size() || (Byte)var1.get(var8 + 1) != 4)) {
                     this.e2();
                  }
                  break;
               case 2:
                  float var12 = var20[var7 - 2];
                  float var13 = var20[var7 - 1];
                  float var14 = var12 + 0.6666667F * (var20[var7++] - var12);
                  float var15 = var13 + 0.6666667F * (var20[var7++] - var13);
                  float var16 = var20[var7++];
                  float var17 = var20[var7++];
                  float var18 = var14 + 0.33333334F * (var16 - var12);
                  float var19 = var15 + 0.33333334F * (var17 - var13);
                  this.n5(var14, var15, var18, var19, var16, var17);
                  break;
               case 3:
                  this.n5(var20[var7++], var20[var7++], var20[var7++], var20[var7++], var20[var7++], var20[var7++]);
                  break;
               case 4:
                  this.e2();
            }
         }
      }
   }

   public HashSet<Integer> n3() {
      return this.n5;
   }
}
