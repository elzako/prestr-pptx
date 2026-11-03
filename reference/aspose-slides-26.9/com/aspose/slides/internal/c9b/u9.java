package com.aspose.slides.internal.c9b;

import java.awt.geom.Dimension2D;
import java.io.Serializable;

public class u9 extends Dimension2D implements Serializable {
   public float n5;
   public float l6;

   public u9() {
      this(0.0F, 0.0F);
   }

   public u9(float var1, float var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public double getWidth() {
      return this.n5;
   }

   @Override
   public double getHeight() {
      return this.l6;
   }

   @Override
   public void setSize(double width, double height) {
      this.n5 = (float)width;
      this.l6 = (float)height;
   }

   @Override
   public boolean equals(Object obj) {
      if (!(obj instanceof u9)) {
         return false;
      }

      u9 var2 = (u9)obj;
      return this.n5 == var2.n5 && this.l6 == var2.l6;
   }

   @Override
   public int hashCode() {
      long var1 = Double.doubleToLongBits(this.getWidth());
      var1 ^= Double.doubleToLongBits(this.getHeight()) * 31L;
      return (int)var1 ^ (int)(var1 >> 32);
   }

   @Override
   public String toString() {
      return this.getClass().getName() + "[width=" + this.n5 + ",height=" + this.l6 + "]";
   }
}
