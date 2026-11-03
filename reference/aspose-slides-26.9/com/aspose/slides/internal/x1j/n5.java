package com.aspose.slides.internal.x1j;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.o9b.z1;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.GeneralPath;
import java.util.Arrays;

public class n5 implements Stroke {
   private final float n5;
   private final int l6;
   private final int k5;
   private final int u3;
   private final float a6;
   private float[] u9;
   private final float h0;
   private int c8;
   private z1 t2;
   private AffineTransform s7;
   private AffineTransform x8;
   private final int n3;

   public n5(float var1, int var2, int var3, int var4, float var5, float[] var6, float var7, AffineTransform var8, AffineTransform var9, int var10) {
      this(var1, var2, var3, var4, var5, var6, var7, 0, var8, var9, var10, null);
   }

   public n5(
      float var1,
      int var2,
      int var3,
      int var4,
      float var5,
      float[] var6,
      float var7,
      int var8,
      AffineTransform var9,
      AffineTransform var10,
      int var11,
      z1 var12
   ) {
      if (var1 < 0.0F) {
         throw new ArgumentException("negative width", "width");
      }

      this.n5(var2);
      this.n5(var3);
      this.l6(var8);
      if (var4 == 0) {
         if (var5 < 1.0F) {
            throw new ArgumentException("miter limit < 1", "miterlimit");
         }
      } else if (var4 != 1 && var4 != 2) {
         throw new ArgumentException("illegal line join value");
      }

      if (var6 != null) {
         if (var7 < 0.0F) {
            throw new ArgumentException("negative dash phase");
         }

         boolean var13 = true;

         for (int var14 = 0; var14 < var6.length; var14++) {
            float var15 = var6[var14];
            if (var15 > 0.0) {
               var13 = false;
            } else if (var15 < 0.0) {
               throw new ArgumentException("negative dash length");
            }
         }

         if (var13) {
            throw new ArgumentException("dash lengths all zero");
         }
      }

      this.n5 = var1;
      this.k5 = var2;
      this.u3 = var3;
      this.l6 = var4;
      this.a6 = var5;
      this.c8 = var8;
      this.t2 = var12;
      if (var6 != null) {
         this.u9 = (float[])var6.clone();
      }

      if (var6 == null || var6.length < 2) {
         this.c8 = 0;
      }

      this.h0 = var7;
      this.s7 = var9;
      this.x8 = var10;
      this.n3 = var11;
   }

   public n5() {
      this(1.0F, 2, 2, 0, 10.0F, null, 0.0F, null, null, 0);
   }

   private void n5(int var1) {
      if (var1 != 0 && var1 != 2 && var1 != 1 && var1 != 3 && var1 != 20 && var1 != 19 && var1 != 17 && var1 != 18 && var1 != 16 && var1 != 240 && var1 != 255) {
         throw new ArgumentException("illegal cap value");
      }
   }

   private void l6(int var1) {
      if (var1 != 0 && var1 != 2 && var1 != 3) {
         throw new ArgumentException("illegal dashcap value");
      }
   }

   @Override
   public Shape createStrokedShape(Shape s) {
      if (this.c8 != 0) {
         if (this.u9 == null || this.u9.length < 2) {
            this.c8 = 0;
         } else if (this.t2 != null) {
            float[] var2 = com.aspose.slides.internal.c9b.u3.l6(this.t2.m1());
            if (this.n5 * var2[0] < 2.0F || this.n5 * var2[1] < 2.0F) {
               this.c8 = 0;
            }
         }
      }

      Shape var10 = new c8().n5(s, this.n5(), this.n5, this.k5, this.u3, this.l6, this.a6, this.u9, this.h0, this.c8);
      if (this.u9 != null && this.u9.length > 1 && this.c8 != 0 && var10 instanceof GeneralPath) {
         com.aspose.slides.internal.x4g.s7 var3 = com.aspose.slides.internal.c9b.l6.l6(var10);
         com.aspose.slides.internal.x4g.s7[] var4 = var3.n5(false);
         Area var5 = new Area();

         for (com.aspose.slides.internal.x4g.s7 var9 : var4) {
            var5.add(new Area(com.aspose.slides.internal.c9b.l6.k5(var9.l6())));
         }

         var10 = var5;
      }

      return var10;
   }

   @Override
   public int hashCode() {
      int var1 = Float.floatToIntBits(this.n5);
      var1 = var1 * 31 + this.l6;
      var1 = var1 * 31 + this.k5;
      var1 = var1 * 31 + this.c8;
      var1 = var1 * 31 + Float.floatToIntBits(this.a6);
      if (this.u9 != null) {
         var1 = var1 * 31 + Float.floatToIntBits(this.h0);

         for (int var2 = 0; var2 < this.u9.length; var2++) {
            var1 = var1 * 31 + Float.floatToIntBits(this.u9[var2]);
         }
      }

      return var1;
   }

   @Override
   public boolean equals(Object obj) {
      if (!(obj instanceof n5)) {
         return false;
      }

      n5 var2 = (n5)obj;
      if (this.n5 != var2.n5) {
         return false;
      }

      if (this.l6 != var2.l6) {
         return false;
      }

      if (this.k5 != var2.k5) {
         return false;
      }

      if (this.a6 != var2.a6) {
         return false;
      }

      if (this.c8 != var2.c8) {
         return false;
      }

      if (this.u9 != null) {
         if (this.h0 != var2.h0) {
            return false;
         }

         if (!Arrays.equals(this.u9, var2.u9)) {
            return false;
         }
      } else if (var2.u9 != null) {
         return false;
      }

      return true;
   }

   public AffineTransform n5() {
      return this.s7;
   }
}
