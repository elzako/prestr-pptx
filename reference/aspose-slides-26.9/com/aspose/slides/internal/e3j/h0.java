package com.aspose.slides.internal.e3j;

import com.aspose.slides.internal.o9b.w1;
import java.awt.geom.AffineTransform;

public class h0 {
   public float n5;
   public float l6;
   public float k5;
   public float u3;

   public static h0 n5(float var0, AffineTransform var1) {
      if (var1 == null) {
         var1 = new AffineTransform();
      }

      return n5(var0, (float)var1.getScaleX(), (float)var1.getShearX(), (float)var1.getShearY(), (float)var1.getScaleY());
   }

   public static h0 n5(float var0, float var1, float var2, float var3, float var4) {
      float var5 = var1 * var1 + var2 * var2;
      float var6 = var1 * var3 + var2 * var4;
      float var7 = var3 * var1 + var4 * var2;
      float var8 = var3 * var3 + var4 * var4;
      float var9 = var5 * var8 - var6 * var7;
      h0 var10 = new h0();
      var10.n5 = var8;
      var10.l6 = -var7 - var6;
      var10.k5 = var5;
      var10.u3 = var0 * var0 * var9;
      return var10;
   }

   public float[] n5(float var1, float var2) {
      if (var1 == 0.0F) {
         float var7 = this.l6 * (float)Math.sqrt(this.u3 / (4.0F * this.n5 * this.k5 * this.k5 - this.l6 * this.l6 * this.k5));
         float var8 = -2.0F * this.k5 * var7 / this.l6;
         return new float[]{var8, var7, -var8, -var7};
      } else {
         float var3 = var2 / var1;
         float var4 = -(2.0F * this.k5 * var3 + this.l6) / (2.0F * this.n5 + this.l6 * var3);
         float var5 = (float)Math.sqrt(this.u3 / (this.n5 * var4 * var4 + this.l6 * var4 + this.k5));
         float var6 = var4 * var5;
         return new float[]{var6, var5, -var6, -var5};
      }
   }

   public w1[] n5(u3 var1) {
      if (var1.l6()) {
         return this.l6(var1);
      }

      if (var1.n5()) {
         return this.k5(var1);
      }

      float var2 = this.n5 * var1.l6 * var1.l6 - this.l6 * var1.n5 * var1.l6 + this.k5 * var1.n5 * var1.n5;
      float var3 = 2.0F * this.n5 * var1.l6 * var1.k5 - this.l6 * var1.n5 * var1.k5;
      float var4 = this.n5 * var1.k5 * var1.k5 - this.u3 * var1.n5 * var1.n5;
      float var5 = var3 * var3 - 4.0F * var2 * var4;
      if (var5 < 0.0F) {
         return null;
      }

      float var6 = (float)Math.sqrt(var5);
      float var7 = (-var3 + var6) / (2.0F * var2);
      float var8 = (-var1.l6 * var7 - var1.k5) / var1.n5;
      float var9 = (-var3 - var6) / (2.0F * var2);
      float var10 = (-var1.l6 * var9 - var1.k5) / var1.n5;
      return new w1[]{new w1(var8, var7), new w1(var10, var9)};
   }

   private w1[] l6(u3 var1) {
      float var2 = -var1.k5 / var1.l6;
      float var3 = this.n5;
      float var4 = this.l6 * var2;
      float var5 = this.k5 * (var2 * var2) - this.u3;
      float var6 = var4 * var4 - 4.0F * var3 * var5;
      if (var6 < 0.0F) {
         return null;
      }

      float var7 = (float)Math.sqrt(var6);
      float var8 = (-var4 + var7) / (2.0F * var3);
      float var9 = (-var4 - var7) / (2.0F * var3);
      return new w1[]{new w1(var8, var2), new w1(var9, var2)};
   }

   private w1[] k5(u3 var1) {
      float var2 = -var1.k5 / var1.n5;
      float var3 = this.k5;
      float var4 = this.l6 * var2;
      float var5 = this.n5 * (var2 * var2) - this.u3;
      float var6 = var4 * var4 - 4.0F * var3 * var5;
      if (var6 < 0.0F) {
         return null;
      }

      float var7 = (float)Math.sqrt(var6);
      float var8 = (-var4 + var7) / (2.0F * var3);
      float var9 = (-var4 - var7) / (2.0F * var3);
      return new w1[]{new w1(var2, var8), new w1(var2, var9)};
   }
}
