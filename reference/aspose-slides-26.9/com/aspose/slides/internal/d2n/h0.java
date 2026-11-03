package com.aspose.slides.internal.d2n;

import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;

public final class h0 implements PathIterator {
   private u9 n5;
   private AffineTransform l6;
   private int k5;
   private PathIterator u3;

   public h0(u9 var1, AffineTransform var2) {
      this.n5 = var1;
      this.l6 = var2;
      if (this.k5 < this.n5.l6.length) {
         this.u3 = this.n5.l6[this.k5].getPathIterator(this.l6);
      }
   }

   @Override
   public int getWindingRule() {
      return 1;
   }

   @Override
   public boolean isDone() {
      if (this.k5 >= this.n5.l6.length) {
         return true;
      } else {
         return !this.u3.isDone() ? false : this.k5 + 1 >= this.n5.l6.length;
      }
   }

   @Override
   public void next() {
      if (this.k5 < this.n5.l6.length) {
         this.u3.next();
         if (this.u3.isDone()) {
            this.k5++;
            if (this.k5 < this.n5.l6.length) {
               this.u3 = this.n5.l6[this.k5].getPathIterator(this.l6);
            }
         }
      }
   }

   @Override
   public int currentSegment(float[] coords) {
      return this.u3.currentSegment(coords);
   }

   @Override
   public int currentSegment(double[] coords) {
      return this.u3.currentSegment(coords);
   }
}
