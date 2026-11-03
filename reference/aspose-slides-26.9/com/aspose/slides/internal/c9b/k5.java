package com.aspose.slides.internal.c9b;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.PathIterator;
import java.awt.geom.QuadCurve2D;
import java.util.NoSuchElementException;

public class k5 implements PathIterator {
   PathIterator n5;
   double l6;
   int k5;
   double[] u3 = new double[14];
   double a6;
   double u9;
   double h0;
   double c8;
   int t2;
   boolean s7 = false;
   int x8;
   int n3;
   int[] y4;
   int e2;
   boolean t9;

   public k5(PathIterator var1, double var2) {
      this(var1, var2, 10);
   }

   public k5(PathIterator var1, double var2, int var4) {
      if (var2 < 0.0) {
         throw new ArgumentOutOfRangeException("flatness", "flatness must be >= 0");
      }

      if (var4 < 0) {
         throw new ArgumentOutOfRangeException("limit", "limit must be >= 0");
      }

      this.n5 = var1;
      this.l6 = var2 * var2;
      this.k5 = var4;
      this.y4 = new int[var4 + 1];
      this.n5(false);
   }

   @Override
   public int getWindingRule() {
      return this.n5.getWindingRule();
   }

   @Override
   public boolean isDone() {
      if (this.t9 && ((this.t2 & 128) == 128 || (this.t2 & 4) == 4)) {
         this.a6 = this.h0;
         this.u9 = this.c8;
         this.n3 = 0;
         this.x8 = 0;
      }

      return this.t9;
   }

   void n5(int var1) {
      if (this.n3 - var1 < 0) {
         int var2 = this.u3.length - this.n3;
         int var3 = this.u3.length + 24;
         double[] var4 = new double[var3];
         System.arraycopy(this.u3, this.n3, var4, this.n3 + 24, var2);
         this.u3 = var4;
         this.n3 += 24;
         this.x8 += 24;
      }
   }

   @Override
   public void next() {
      this.n5(true);
   }

   private void n5(boolean var1) {
      if (this.n3 >= this.x8) {
         if (var1) {
            this.n5.next();
         }

         if (this.n5.isDone()) {
            this.t9 = true;
            return;
         }

         this.s7 = false;
         this.t2 = this.n5.currentSegment(this.u3) & 0xFF;
         if ((this.t2 & 128) == 128) {
            this.t2 &= -129;
            this.s7 = true;
         }

         this.e2 = 0;
         this.y4[0] = 0;
      }

      int var2 = this.t2 & 7;
      switch (var2) {
         case 0:
         case 1:
            this.a6 = this.u3[0];
            this.u9 = this.u3[1];
            if (var2 == 0) {
               this.h0 = this.a6;
               this.c8 = this.u9;
            }

            this.n3 = 0;
            this.x8 = 0;
            break;
         case 2:
            if (this.n3 >= this.x8) {
               this.n3 = this.u3.length - 6;
               this.x8 = this.u3.length - 2;
               this.u3[this.n3 + 0] = this.a6;
               this.u3[this.n3 + 1] = this.u9;
               this.u3[this.n3 + 2] = this.u3[0];
               this.u3[this.n3 + 3] = this.u3[1];
               this.u3[this.n3 + 4] = this.a6 = this.u3[2];
               this.u3[this.n3 + 5] = this.u9 = this.u3[3];
            }

            for (int var4 = this.y4[this.e2]; var4 < this.k5 && !(QuadCurve2D.getFlatnessSq(this.u3, this.n3) < this.l6); this.y4[this.e2] = var4) {
               this.n5(4);
               QuadCurve2D.subdivide(this.u3, this.n3, this.u3, this.n3 - 4, this.u3, this.n3);
               this.n3 -= 4;
               this.y4[this.e2] = ++var4;
               this.e2++;
            }

            this.n3 += 4;
            this.e2--;
            break;
         case 3:
            if (this.n3 >= this.x8) {
               this.n3 = this.u3.length - 8;
               this.x8 = this.u3.length - 2;
               this.u3[this.n3 + 0] = this.a6;
               this.u3[this.n3 + 1] = this.u9;
               this.u3[this.n3 + 2] = this.u3[0];
               this.u3[this.n3 + 3] = this.u3[1];
               this.u3[this.n3 + 4] = this.u3[2];
               this.u3[this.n3 + 5] = this.u3[3];
               this.u3[this.n3 + 6] = this.a6 = this.u3[4];
               this.u3[this.n3 + 7] = this.u9 = this.u3[5];
            }

            for (int var3 = this.y4[this.e2]; var3 < this.k5 && !(CubicCurve2D.getFlatnessSq(this.u3, this.n3) < this.l6); this.y4[this.e2] = var3) {
               this.n5(6);
               CubicCurve2D.subdivide(this.u3, this.n3, this.u3, this.n3 - 6, this.u3, this.n3);
               this.n3 -= 6;
               this.y4[this.e2] = ++var3;
               this.e2++;
            }

            this.n3 += 6;
            this.e2--;
            break;
         case 4:
         case 128:
            this.a6 = this.h0;
            this.u9 = this.c8;
            this.n3 = 0;
            this.x8 = 0;
      }

      if (this.n3 >= this.x8 && ((this.t2 & 128) == 128 || this.s7)) {
         this.t2 |= 128;
         this.s7 = false;
      }
   }

   @Override
   public int currentSegment(float[] coords) {
      if (this.isDone()) {
         throw new NoSuchElementException("flattening iterator out of bounds");
      }

      int var2 = this.t2;
      if (var2 != 4 && var2 != 128) {
         coords[0] = (float)this.u3[this.n3 + 0];
         coords[1] = (float)this.u3[this.n3 + 1];
         if (var2 != 0) {
            var2 = 1;
            if ((this.t2 & 128) == 128) {
               var2 |= 128;
            }
         }
      }

      return var2;
   }

   @Override
   public int currentSegment(double[] coords) {
      if (this.isDone()) {
         throw new NoSuchElementException("flattening iterator out of bounds");
      }

      int var2 = this.t2;
      if (var2 != 4 && var2 != 128) {
         coords[0] = this.u3[this.n3 + 0];
         coords[1] = this.u3[this.n3 + 1];
         if (var2 != 0) {
            var2 = 1;
            if ((this.t2 & 128) == 128) {
               var2 |= 128;
            }
         }
      }

      return var2;
   }
}
