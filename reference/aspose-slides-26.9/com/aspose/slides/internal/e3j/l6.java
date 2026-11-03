package com.aspose.slides.internal.e3j;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;

public class l6 implements Shape {
   private static final double[][][] k7 = new double[][][]{
      {
            {3.92478, -13.5822, -0.233377, 0.0128206},
            {-1.08814, 0.859987, 3.62265E-4, 2.29036E-4},
            {-0.942512, 0.390456, 0.0080909, 0.00723895},
            {-0.736228, 0.20998, 0.0129867, 0.0103456}
      },
      {
            {-0.395018, 6.82464, 0.0995293, 0.0122198},
            {-0.545608, 0.0774863, 0.0267327, 0.0132482},
            {0.0534754, -0.0884167, 0.012595, 0.0343396},
            {0.209052, -0.0599987, -0.00723897, 0.00789976}
      }
   };
   private static final double[][][] m3 = new double[][][]{
      {
            {0.0863805, -11.5595, -2.68765, 0.181224},
            {0.242856, -1.81073, 1.56876, 1.68544},
            {0.233337, -0.455621, 0.222856, 0.403469},
            {0.0612978, -0.104879, 0.0446799, 0.00867312}
      },
      {
            {0.028973, 6.68407, 0.171472, 0.0211706},
            {0.0307674, -0.0517815, 0.0216803, -0.0749348},
            {-0.0471179, 0.1288, -0.0781702, 2.0},
            {-0.0309683, 0.0531557, -0.0227191, 0.0434511}
      }
   };
   private static final double[] z8 = new double[]{0.02, 2.83, 0.125, 0.01};
   private static final double[][][] j5 = new double[][][]{
      {
            {3.85268, -21.229, -0.330434, 0.0127842},
            {-1.61486, 0.706564, 0.225945, 0.263682},
            {-0.910164, 0.388383, 0.00551445, 0.00671814},
            {-0.630184, 0.192402, 0.0098871, 0.0102527}
      },
      {
            {-0.162211, 9.94329, 0.13723, 0.0124084},
            {-0.253135, 0.00187735, 0.0230286, 0.01264},
            {-0.0695069, -0.0437594, 0.0120636, 0.0163087},
            {-0.0328856, -0.00926032, -0.00173573, 0.00527385}
      }
   };
   private static final double[][][] w1 = new double[][][]{
      {
            {0.0899116, -19.2349, -4.11711, 0.183362},
            {0.138148, -1.45804, 1.32044, 1.38474},
            {0.230903, -0.450262, 0.219963, 0.414038},
            {0.0590565, -0.101062, 0.0430592, 0.0204699}
      },
      {
            {0.0164649, 9.89394, 0.0919496, 0.00760802},
            {0.0191603, -0.0322058, 0.0134667, -0.0825018},
            {0.0156192, -0.017535, 0.00326508, -0.228157},
            {-0.0236752, 0.0405821, -0.0173086, 0.176187}
      }
   };
   private static final double[] r4 = new double[]{0.001, 4.98, 0.207, 0.0067};
   protected double n5;
   protected double l6;
   protected double k5;
   protected double u3;
   protected double a6;
   private double c4;
   private double y2;
   protected double u9;
   protected double h0;
   protected double c8;
   protected double t2;
   protected double s7;
   protected double x8;
   protected double n3;
   protected double y4;
   protected double e2;
   protected double t9;
   private double y1;
   private double a0;
   private double d2;
   private double d5;
   protected boolean z1;
   private int s3;
   private double p8;
   protected double t4;
   protected double q0;
   protected double z3;
   protected double m1;

   public l6() {
      this.n5 = 0.0;
      this.l6 = 0.0;
      this.k5 = 1.0;
      this.u3 = 1.0;
      this.a6 = 0.0;
      this.u9 = 0.0;
      this.h0 = Math.PI * 2;
      this.c4 = 1.0;
      this.y2 = 0.0;
      this.z1 = false;
      this.s3 = 3;
      this.p8 = 0.5;
      this.n5();
      this.l6();
      this.k5();
      this.u3();
   }

   public l6(double var1, double var3, double var5, double var7, double var9, double var11, double var13, boolean var15) {
      this.n5 = var1;
      this.l6 = var3;
      this.k5 = var5;
      this.u3 = var7;
      this.a6 = var9;
      this.z1 = var15;
      this.u9 = Math.atan2(Math.sin(var11) / var7, Math.cos(var11) / var5);
      this.h0 = Math.atan2(Math.sin(var13) / var7, Math.cos(var13) / var5);
      this.c4 = Math.cos(var9);
      this.y2 = Math.sin(var9);
      this.s3 = 3;
      this.p8 = 0.5;
      this.h0 = this.h0 - (Math.PI * 2) * Math.floor((this.h0 - this.u9) / (Math.PI * 2));
      if (var13 - var11 > Math.PI && this.h0 - this.u9 < Math.PI) {
         this.h0 += Math.PI * 2;
      }

      this.n5();
      this.l6();
      this.k5();
      this.u3();
   }

   private void n5() {
      double var1 = Math.sqrt(this.k5 * this.k5 - this.u3 * this.u3);
      double var3 = var1 * this.c4;
      double var5 = var1 * this.y2;
      this.n3 = this.n5 - var3;
      this.y4 = this.l6 - var5;
      this.e2 = this.n5 + var3;
      this.t9 = this.l6 + var5;
   }

   private void l6() {
      double var1 = this.k5 * Math.cos(this.u9);
      double var3 = this.u3 * Math.sin(this.u9);
      this.c8 = this.n5 + var1 * this.c4 - var3 * this.y2;
      this.t2 = this.l6 + var1 * this.y2 + var3 * this.c4;
      double var5 = this.k5 * Math.cos(this.h0);
      double var7 = this.u3 * Math.sin(this.h0);
      this.s7 = this.n5 + var5 * this.c4 - var7 * this.y2;
      this.x8 = this.l6 + var5 * this.y2 + var7 * this.c4;
   }

   private void k5() {
      double var1 = this.u3 / this.k5;
      double var5;
      double var7;
      double var9;
      double var11;
      if (Math.abs(this.y2) < 0.1) {
         double var3 = this.y2 / this.c4;
         if (this.c4 < 0.0) {
            var5 = -Math.atan(var3 * var1);
            var7 = var5 + Math.PI;
            var9 = (Math.PI / 2) - Math.atan(var3 / var1);
            var11 = var9 + Math.PI;
         } else {
            var7 = -Math.atan(var3 * var1);
            var5 = var7 - Math.PI;
            var11 = (Math.PI / 2) - Math.atan(var3 / var1);
            var9 = var11 - Math.PI;
         }
      } else {
         double var13 = this.c4 / this.y2;
         if (this.y2 < 0.0) {
            var7 = (Math.PI / 2) + Math.atan(var13 / var1);
            var5 = var7 - Math.PI;
            var9 = Math.atan(var13 * var1);
            var11 = var9 + Math.PI;
         } else {
            var5 = (Math.PI / 2) + Math.atan(var13 / var1);
            var7 = var5 + Math.PI;
            var11 = Math.atan(var13 * var1);
            var9 = var11 - Math.PI;
         }
      }

      var5 -= (Math.PI * 2) * Math.floor((var5 - this.u9) / (Math.PI * 2));
      var9 -= (Math.PI * 2) * Math.floor((var9 - this.u9) / (Math.PI * 2));
      var7 -= (Math.PI * 2) * Math.floor((var7 - this.u9) / (Math.PI * 2));
      var11 -= (Math.PI * 2) * Math.floor((var11 - this.u9) / (Math.PI * 2));
      this.y1 = var5 <= this.h0 ? this.n5 + this.k5 * Math.cos(var5) * this.c4 - this.u3 * Math.sin(var5) * this.y2 : Math.min(this.c8, this.s7);
      this.a0 = var9 <= this.h0 ? this.l6 + this.k5 * Math.cos(var9) * this.y2 + this.u3 * Math.sin(var9) * this.c4 : Math.min(this.t2, this.x8);
      this.d2 = (var7 <= this.h0 ? this.n5 + this.k5 * Math.cos(var7) * this.c4 - this.u3 * Math.sin(var7) * this.y2 : Math.max(this.c8, this.s7)) - this.y1;
      this.d5 = (var11 <= this.h0 ? this.l6 + this.k5 * Math.cos(var11) * this.y2 + this.u3 * Math.sin(var11) * this.c4 : Math.max(this.t2, this.x8)) - this.a0;
   }

   private void u3() {
      this.t4 = (this.k5 - this.u3) / this.k5;
      this.q0 = this.t4 * (2.0 - this.t4);
      this.z3 = 1.0 - this.t4;
      this.m1 = this.z3 * this.z3;
   }

   private static double n5(double var0, double[] var2) {
      return (var0 * (var0 * var2[0] + var2[1]) + var2[2]) / (var0 + var2[3]);
   }

   protected double n5(int var1, double var2, double var4) {
      double var6 = 0.5 * (var2 + var4);
      if (var1 < 2) {
         double var38 = this.k5 * Math.cos(var2);
         double var39 = this.u3 * Math.sin(var2);
         double var40 = this.n5 + var38 * this.c4 - var39 * this.y2;
         double var41 = this.l6 + var38 * this.y2 + var39 * this.c4;
         double var42 = this.k5 * Math.cos(var4);
         double var18 = this.u3 * Math.sin(var4);
         double var43 = this.n5 + var42 * this.c4 - var18 * this.y2;
         double var44 = this.l6 + var42 * this.y2 + var18 * this.c4;
         double var24 = this.k5 * Math.cos(var6);
         double var26 = this.u3 * Math.sin(var6);
         double var28 = this.n5 + var24 * this.c4 - var26 * this.y2;
         double var30 = this.l6 + var24 * this.y2 + var26 * this.c4;
         double var32 = var43 - var40;
         double var34 = var44 - var41;
         return Math.abs(var28 * var34 - var30 * var32 + var43 * var41 - var40 * var44) / Math.sqrt(var32 * var32 + var34 * var34);
      }

      double var8 = this.u3 / this.k5;
      double var10 = var4 - var2;
      double var12 = Math.cos(2.0 * var6);
      double var14 = Math.cos(4.0 * var6);
      double var16 = Math.cos(6.0 * var6);
      double[][][] var36;
      double[] var37;
      if (var1 == 2) {
         var36 = var8 < 0.25 ? k7 : m3;
         var37 = z8;
      } else {
         var36 = var8 < 0.25 ? j5 : w1;
         var37 = r4;
      }

      double var20 = n5(var8, var36[0][0]) + var12 * n5(var8, var36[0][1]) + var14 * n5(var8, var36[0][2]) + var16 * n5(var8, var36[0][3]);
      double var22 = n5(var8, var36[1][0]) + var12 * n5(var8, var36[1][1]) + var14 * n5(var8, var36[1][2]) + var16 * n5(var8, var36[1][3]);
      return n5(var8, var37) * this.k5 * Math.exp(var20 + var22 * var10);
   }

   @Override
   public boolean contains(double x, double y) {
      double var5 = x - this.n3;
      double var7 = y - this.y4;
      double var9 = x - this.e2;
      double var11 = y - this.t9;
      if (var5 * var5 + var7 * var7 + var9 * var9 + var11 * var11 > 4.0 * this.k5 * this.k5) {
         return false;
      } else if (this.z1) {
         double var23 = x - this.n5;
         double var24 = y - this.l6;
         double var17 = var23 * this.c4 + var24 * this.y2;
         double var19 = var24 * this.c4 - var23 * this.y2;
         double var21 = Math.atan2(var19 / this.u3, var17 / this.k5);
         var21 -= (Math.PI * 2) * Math.floor((var21 - this.u9) / (Math.PI * 2));
         return var21 <= this.h0;
      } else {
         double var13 = this.s7 - this.c8;
         double var15 = this.x8 - this.t2;
         return x * var15 - y * var13 + this.s7 * this.t2 - this.c8 * this.x8 >= 0.0;
      }
   }

   private boolean n5(double var1, double var3, double var5, double var7) {
      double var9 = var1 - var5;
      double var11 = var3 - var7;
      double var13 = Math.sqrt(var9 * var9 + var11 * var11);
      if (var13 < 1.0E-10 * this.k5) {
         return false;
      }

      double var15 = (var9 * this.c4 + var11 * this.y2) / var13;
      double var17 = (var11 * this.c4 - var9 * this.y2) / var13;
      var9 = var1 - this.n5;
      var11 = var3 - this.l6;
      double var19 = var9 * this.c4 + var11 * this.y2;
      double var21 = var11 * this.c4 - var9 * this.y2;
      double var23 = var19 * var19;
      double var25 = var21 * var21;
      double var27 = this.m1 * (var23 - this.k5 * this.k5);
      double var29 = var27 - var25;
      double var31 = var27 + var25;
      double var33 = 1.0 - this.q0 * var15 * var15;
      double var35 = this.m1 * var19 * var15 + var21 * var17;
      double var37 = var35 * var35;
      double var39 = var33 * var31;
      if (var37 < var39) {
         return false;
      }

      double var41 = var35 >= 0.0 ? (var35 + Math.sqrt(var37 - var39)) / var33 : var31 / (var35 - Math.sqrt(var37 - var39));
      if (var41 >= 0.0 && var41 <= var13) {
         double var43 = var19 - var41 * var15;
         double var45 = var21 - var41 * var17;
         double var47 = Math.atan2(var45 / this.u3, var43 / this.k5);
         var47 -= (Math.PI * 2) * Math.floor((var47 - this.u9) / (Math.PI * 2));
         if (var47 <= this.h0) {
            return true;
         }
      }

      var41 = var31 / (var41 * var33);
      if (var41 >= 0.0 && var41 <= var13) {
         double var52 = var19 - var41 * var15;
         double var53 = var21 - var41 * var17;
         double var55 = Math.atan2(var53 / this.u3, var52 / this.k5);
         var55 -= (Math.PI * 2) * Math.floor((var55 - this.u9) / (Math.PI * 2));
         if (var55 <= this.h0) {
            return true;
         }
      }

      return false;
   }

   private static boolean n5(double var0, double var2, double var4, double var6, double var8, double var10, double var12, double var14) {
      double var16 = var4 - var0;
      double var18 = var6 - var2;
      double var20 = var4 * var2 - var0 * var6;
      double var22 = var12 - var8;
      double var24 = var14 - var10;
      double var26 = var12 * var10 - var8 * var14;
      double var28 = var8 * var18 - var10 * var16 + var20;
      double var30 = var12 * var18 - var14 * var16 + var20;
      double var32 = var0 * var24 - var2 * var22 + var26;
      double var34 = var4 * var24 - var6 * var22 + var26;
      return var28 * var30 <= 0.0 && var32 * var34 <= 0.0;
   }

   private boolean l6(double var1, double var3, double var5, double var7) {
      if (this.n5(var1, var3, var5, var7)) {
         return true;
      } else {
         return !this.z1
            ? n5(this.c8, this.t2, this.s7, this.x8, var1, var3, var5, var7)
            : n5(this.n5, this.l6, this.c8, this.t2, var1, var3, var5, var7) || n5(this.n5, this.l6, this.s7, this.x8, var1, var3, var5, var7);
      }
   }

   @Override
   public boolean contains(double x, double y, double w, double h) {
      double var9 = x + w;
      double var11 = y + h;
      return this.contains(x, y)
         && this.contains(var9, y)
         && this.contains(x, var11)
         && this.contains(var9, var11)
         && !this.l6(x, y, var9, y)
         && !this.l6(var9, y, var9, var11)
         && !this.l6(var9, var11, x, var11)
         && !this.l6(x, var11, x, y);
   }

   @Override
   public boolean contains(Point2D p) {
      return this.contains(p.getX(), p.getY());
   }

   @Override
   public boolean contains(Rectangle2D r) {
      return this.contains(r.getX(), r.getY(), r.getWidth(), r.getHeight());
   }

   @Override
   public Rectangle getBounds() {
      int var1 = (int)Math.rint(this.y1 - 0.5);
      int var2 = (int)Math.rint(this.a0 - 0.5);
      int var3 = (int)Math.rint(this.y1 + this.d2 + 0.5);
      int var4 = (int)Math.rint(this.a0 + this.d5 + 0.5);
      return new Rectangle(var1, var2, var3 - var1, var4 - var2);
   }

   @Override
   public Rectangle2D getBounds2D() {
      return new Double(this.y1, this.a0, this.d2, this.d5);
   }

   private PathIterator n5(int var1, double var2, AffineTransform var4) {
      boolean var5 = false;

      byte var6;
      for (var6 = 1; !var5 && var6 < 1024; var6 <<= 1) {
         double var7 = (this.h0 - this.u9) / var6;
         if (var7 <= Math.PI / 2) {
            double var9 = this.u9;
            var5 = true;

            for (int var11 = 0; var5 && var11 < var6; var11++) {
               double var12 = var9;
               var9 += var7;
               var5 = this.n5(var1, var12, var9) <= var2;
            }
         }
      }

      GeneralPath var14 = new GeneralPath(0);
      double var15 = (this.h0 - this.u9) / var6;
      double var17 = this.u9;
      double var54 = Math.cos(var17);
      double var19 = Math.sin(var17);
      double var21 = this.k5 * var54;
      double var23 = this.u3 * var19;
      double var25 = this.k5 * var19;
      double var27 = this.u3 * var54;
      double var29 = this.n5 + var21 * this.c4 - var23 * this.y2;
      double var31 = this.l6 + var21 * this.y2 + var23 * this.c4;
      double var33 = -var25 * this.c4 - var27 * this.y2;
      double var35 = -var25 * this.y2 + var27 * this.c4;
      if (this.z1) {
         var14.moveTo((float)this.n5, (float)this.l6);
         var14.lineTo((float)var29, (float)var31);
      } else {
         var14.moveTo((float)var29, (float)var31);
      }

      double var37 = Math.tan(0.5 * var15);
      double var39 = Math.sin(var15) * (Math.sqrt(4.0 + 3.0 * var37 * var37) - 1.0) / 3.0;

      for (int var41 = 0; var41 < var6; var41++) {
         double var44 = var29;
         double var46 = var31;
         double var48 = var33;
         double var50 = var35;
         var17 += var15;
         var54 = Math.cos(var17);
         var19 = Math.sin(var17);
         var21 = this.k5 * var54;
         var23 = this.u3 * var19;
         var25 = this.k5 * var19;
         var27 = this.u3 * var54;
         var29 = this.n5 + var21 * this.c4 - var23 * this.y2;
         var31 = this.l6 + var21 * this.y2 + var23 * this.c4;
         var33 = -var25 * this.c4 - var27 * this.y2;
         var35 = -var25 * this.y2 + var27 * this.c4;
         if (var1 == 1) {
            var14.lineTo((float)var29, (float)var31);
         } else if (var1 == 2) {
            double var52 = (var35 * (var29 - var44) - var33 * (var31 - var46)) / (var48 * var35 - var50 * var33);
            var14.quadTo((float)(var44 + var52 * var48), (float)(var46 + var52 * var50), (float)var29, (float)var31);
         } else {
            var14.curveTo(
               (float)(var44 + var39 * var48),
               (float)(var46 + var39 * var50),
               (float)(var29 - var39 * var33),
               (float)(var31 - var39 * var35),
               (float)var29,
               (float)var31
            );
         }
      }

      if (this.z1) {
         var14.closePath();
      }

      return var14.getPathIterator(var4);
   }

   @Override
   public PathIterator getPathIterator(AffineTransform at) {
      return this.n5(this.s3, this.p8, at);
   }

   @Override
   public PathIterator getPathIterator(AffineTransform at, double flatness) {
      return this.n5(1, flatness, at);
   }

   @Override
   public boolean intersects(double x, double y, double w, double h) {
      double var9 = x + w;
      double var11 = y + h;
      return this.contains(x, y)
         || this.contains(var9, y)
         || this.contains(x, var11)
         || this.contains(var9, var11)
         || this.l6(x, y, var9, y)
         || this.l6(var9, y, var9, var11)
         || this.l6(var9, var11, x, var11)
         || this.l6(x, var11, x, y);
   }

   @Override
   public boolean intersects(Rectangle2D r) {
      return this.intersects(r.getX(), r.getY(), r.getWidth(), r.getHeight());
   }
}
