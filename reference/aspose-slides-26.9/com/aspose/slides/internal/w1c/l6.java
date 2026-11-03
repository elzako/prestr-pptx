package com.aspose.slides.internal.w1c;

import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.PathIterator;
import java.util.NoSuchElementException;

class l6 implements PathIterator {
   double n5;
   double l6;
   double k5;
   double u3;
   AffineTransform a6;
   int u9;
   private static double[][] h0 = new double[][]{
      {1.0, 0.7761423749153966, 0.7761423749153966, 1.0, 0.5, 1.0},
      {0.22385762508460333, 1.0, 0.0, 0.7761423749153966, 0.0, 0.5},
      {0.0, 0.22385762508460333, 0.22385762508460333, 0.0, 0.5, 0.0},
      {0.7761423749153966, 0.0, 1.0, 0.22385762508460333, 1.0, 0.5}
   };

   l6(Ellipse2D var1, AffineTransform var2) {
      this.n5 = var1.getX();
      this.l6 = var1.getY();
      this.k5 = var1.getWidth();
      this.u3 = var1.getHeight();
      this.a6 = var2;
   }

   @Override
   public int getWindingRule() {
      return 1;
   }

   @Override
   public boolean isDone() {
      return this.u9 > 5;
   }

   @Override
   public void next() {
      this.u9++;
   }

   @Override
   public int currentSegment(float[] coords) {
      if (this.isDone()) {
         throw new NoSuchElementException("ellipse iterator out of bounds");
      }

      if (this.u9 == 5) {
         return 4;
      }

      if (this.u9 == 0) {
         double[] var3 = h0[3];
         coords[0] = (float)(this.n5 + var3[4] * this.k5);
         coords[1] = (float)(this.l6 + var3[5] * this.u3);
         if (this.a6 != null) {
            this.a6.transform(coords, 0, coords, 0, 1);
         }

         return 0;
      } else {
         double[] var2 = h0[this.u9 - 1];
         coords[0] = (float)(this.n5 + var2[0] * this.k5);
         coords[1] = (float)(this.l6 + var2[1] * this.u3);
         coords[2] = (float)(this.n5 + var2[2] * this.k5);
         coords[3] = (float)(this.l6 + var2[3] * this.u3);
         coords[4] = (float)(this.n5 + var2[4] * this.k5);
         coords[5] = (float)(this.l6 + var2[5] * this.u3);
         if (this.a6 != null) {
            this.a6.transform(coords, 0, coords, 0, 3);
         }

         return 3;
      }
   }

   @Override
   public int currentSegment(double[] coords) {
      if (this.isDone()) {
         throw new NoSuchElementException("ellipse iterator out of bounds");
      }

      if (this.u9 == 5) {
         return 4;
      }

      if (this.u9 == 0) {
         double[] var3 = h0[3];
         coords[0] = this.n5 + var3[4] * this.k5;
         coords[1] = this.l6 + var3[5] * this.u3;
         if (this.a6 != null) {
            this.a6.transform(coords, 0, coords, 0, 1);
         }

         return 0;
      } else {
         double[] var2 = h0[this.u9 - 1];
         coords[0] = this.n5 + var2[0] * this.k5;
         coords[1] = this.l6 + var2[1] * this.u3;
         coords[2] = this.n5 + var2[2] * this.k5;
         coords[3] = this.l6 + var2[3] * this.u3;
         coords[4] = this.n5 + var2[4] * this.k5;
         coords[5] = this.l6 + var2[5] * this.u3;
         if (this.a6 != null) {
            this.a6.transform(coords, 0, coords, 0, 3);
         }

         return 3;
      }
   }
}
