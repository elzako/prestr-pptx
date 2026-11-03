package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

class v9d {
   private final v3q n5;
   private final Shape l6;
   private final h6j k5;

   public v9d(v3q var1, Shape var2, h6j var3) {
      if (var1 == null) {
         throw new ArgumentNullException("parser");
      }

      if (var2 == null) {
         throw new ArgumentNullException("shape");
      }

      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   public final void n5(String var1) {
      if (this.n5.l6.n5 <= 0) {
         this.l6.setRotation((float)n5(com.aspose.slides.ms.System.d2.n5(var1, com.aspose.slides.internal.x7n.l6.k5()) * -1.0));
      }
   }

   public final void n5(String var1, String var2) {
      if (this.n5.l6.n5 <= 0) {
         this.k5.n5().n5("ODP scale transform is not implemented", 3);
      }
   }

   public final void l6(String var1) {
      if (this.n5.l6.n5 <= 0) {
         this.k5.n5().n5("ODP scewX transform is not implemented", 3);
      }
   }

   public final void k5(String var1) {
      if (this.n5.l6.n5 <= 0) {
         this.k5.n5().n5("ODP scewY transform is not implemented", 3);
      }
   }

   public final void l6(String var1, String var2) {
      if (this.n5.l6.n5 <= 0) {
         float var3 = this.l6.getX();
         float var4 = this.l6.getY();
         this.l6.setX(this.l6.getX() + (float)t2f.u9(var1));
         this.l6.setY(this.l6.getY() + (float)t2f.u9(var2));
         if (this.l6.getRotation() != 0.0F && var3 == 0.0F && var4 == 0.0F) {
            this.n5();
         }
      }
   }

   private void n5() {
      com.aspose.slides.internal.o9b.w1 var1 = n5(
            new com.aspose.slides.internal.o9b.w1(this.l6.getFrame().getCenterX(), this.l6.getFrame().getCenterY()),
            new com.aspose.slides.internal.o9b.w1(this.l6.getX(), this.l6.getY()),
            this.l6.getRotation() - 180.0F
         )
         .u3();
      this.l6.setX(var1.l6() - (this.l6.getRotation() == 180.0F ? this.l6.getWidth() / 2.0F : this.l6.getWidth()));
      this.l6.setY(var1.k5() - (this.l6.getRotation() == 180.0F ? this.l6.getHeight() / 2.0F : this.l6.getHeight()));
   }

   private static com.aspose.slides.internal.o9b.w1 n5(com.aspose.slides.internal.o9b.w1 var0, com.aspose.slides.internal.o9b.w1 var1, float var2) {
      float var3 = n5(var2);
      double var4 = com.aspose.slides.ms.System.q1.c8(var3);
      double var6 = com.aspose.slides.ms.System.q1.h0(var3);
      float var8 = var1.l6() - var0.l6();
      float var9 = var1.k5() - var0.k5();
      double var10 = var4 * var8 - var6 * var9;
      double var12 = var6 * var8 + var4 * var9;
      double var14 = var10 + var0.l6();
      double var16 = var12 + var0.k5();
      return new com.aspose.slides.internal.o9b.w1((float)var14, (float)var16);
   }

   private static double n5(double var0) {
      return com.aspose.slides.ms.System.q1.n5((double)(var0 * (180.0 / Math.PI)), 2);
   }

   private static float n5(float var0) {
      return (float) (Math.PI / 180.0) * var0;
   }
}
