package com.aspose.slides.internal.d2n;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public final class u9 implements Shape, Cloneable {
   public Rectangle n5;
   public Rectangle[] l6;
   public u9 k5 = null;

   public u9() {
   }

   public u9(Rectangle[] var1) {
      this.n5 = (Rectangle)var1[0].clone();
      this.l6 = var1;

      for (int var2 = 1; var2 < var1.length; var2++) {
         this.n5 = this.n5.union(var1[var2]);
      }

      this.k5 = this;
   }

   public int n5(byte[] var1, int var2) {
      int var3 = var2;
      int var4 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var5 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      int var6 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
      var2 += 4;
      var2 += 4;
      this.n5 = com.aspose.slides.internal.l1b.k5.u9(var1, var2);
      var2 += 16;
      if (var4 > 0) {
         var2 = var3 + var4;
      }

      this.l6 = new Rectangle[var6];

      for (int var7 = 0; var7 < var6; var2 += 16) {
         this.l6[var7] = com.aspose.slides.internal.l1b.k5.u9(var1, var2);
         var7++;
      }

      return var2 - var3;
   }

   public int l6(byte[] var1, int var2) throws com.aspose.slides.internal.p7x.l6 {
      int var3 = var2;
      var2 += 8;
      int var4 = com.aspose.slides.internal.l1b.k5.k5(var1, var2);
      var2 += 2;
      int var5 = com.aspose.slides.internal.l1b.k5.k5(var1, var2);
      var2 += 2;
      int var6 = com.aspose.slides.internal.l1b.k5.k5(var1, var2) / 2;
      var2 += 2;
      this.n5 = com.aspose.slides.internal.l1b.k5.h0(var1, var2);
      var2 += 8;
      int var7 = 0;
      int var8 = var2;

      for (int var9 = 0; var9 < var5; var9++) {
         int var10 = com.aspose.slides.internal.l1b.k5.k5(var1, var8);
         var8 += 2;
         if ((var10 & 1) == 1) {
            throw new com.aspose.slides.internal.p7x.l6("Error reading WMF region");
         }

         var7 += var10 / 2;
         var8 += 4 + var10 + var10;
         if (var10 != com.aspose.slides.internal.l1b.k5.k5(var1, var8)) {
            throw new com.aspose.slides.internal.p7x.l6("Error reading WMF region");
         }

         var8 += 2;
      }

      if (var8 - var3 > var4) {
         throw new com.aspose.slides.internal.p7x.l6("Error reading WMF region");
      }

      this.l6 = new Rectangle[var7];
      int var29 = 0;

      for (int var30 = 0; var30 < var5; var30++) {
         int var11 = com.aspose.slides.internal.l1b.k5.k5(var1, var2);
         var2 += 2;
         int var12 = var11 / 2;
         short var13 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
         var2 += 2;
         short var14 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
         var2 += 2;

         for (int var15 = 0; var15 < var12; var15++) {
            short var16 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
            var2 += 2;
            short var17 = com.aspose.slides.internal.l1b.k5.l6(var1, var2);
            var2 += 2;
            this.l6[var29++] = new Rectangle(var16, var13, var17 - var16, var14 - var13);
         }

         var2 += 2;
      }

      this.k5 = this;
      return Math.max(var2 - var3, var4);
   }

   @Override
   public Rectangle getBounds() {
      return (Rectangle)this.n5.clone();
   }

   @Override
   public Rectangle2D getBounds2D() {
      return (Rectangle)this.n5.clone();
   }

   @Override
   public boolean contains(double x, double y) {
      if (!this.n5.contains(x, y)) {
         return false;
      }

      for (int var5 = 0; var5 < this.l6.length; var5++) {
         if (this.l6[var5].contains(x, y)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean contains(Point2D p) {
      return this.contains(p.getX(), p.getY());
   }

   @Override
   public boolean intersects(double x, double y, double w, double h) {
      if (!this.n5.intersects(x, y, w, h)) {
         return false;
      }

      for (int var9 = 0; var9 < this.l6.length; var9++) {
         if (this.l6[var9].intersects(x, y, w, h)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean intersects(Rectangle2D r) {
      return this.intersects(r.getX(), r.getY(), r.getWidth(), r.getHeight());
   }

   @Override
   public boolean contains(double x, double y, double w, double h) {
      return false;
   }

   @Override
   public boolean contains(Rectangle2D r) {
      return this.contains(r.getX(), r.getY(), r.getWidth(), r.getHeight());
   }

   @Override
   public PathIterator getPathIterator(AffineTransform at) {
      return new h0(this, at);
   }

   @Override
   public PathIterator getPathIterator(AffineTransform at, double flatness) {
      return new h0(this, at);
   }

   @Override
   public Object clone() {
      u9 var1 = null;

      try {
         var1 = (u9)super.clone();
         var1.n5 = (Rectangle)this.n5.clone();
         var1.l6 = new Rectangle[var1.l6.length];

         for (int var2 = 0; var2 < var1.l6.length; var2++) {
            var1.l6[var2] = (Rectangle)this.l6[var2].clone();
         }
      } catch (CloneNotSupportedException var3) {
      }

      return var1;
   }
}
