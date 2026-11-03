package com.aspose.slides;

import java.awt.geom.Rectangle2D.Float;

public class ShapeFrame implements IShapeFrame {
   private float n5;
   private float l6;
   private float k5;
   private float u3;
   private float a6;
   private byte u9;
   private byte h0;

   public ShapeFrame(float x, float y, float width, float height, byte flipH, byte flipV, float rotationAngle) {
      this.n5(x, y, width, height, flipH, flipV, rotationAngle);
   }

   ShapeFrame(double x, double y, double width, double height, byte flipH, byte flipV, float rotationAngle) {
      this.n5((float)x, (float)y, (float)width, (float)height, flipH, flipV, rotationAngle);
   }

   ShapeFrame() {
   }

   @Override
   public final float getX() {
      return this.n5;
   }

   @Override
   public final float getY() {
      return this.l6;
   }

   @Override
   public final float getWidth() {
      return this.k5;
   }

   @Override
   public final float getHeight() {
      return this.u3;
   }

   @Override
   public final float getRotation() {
      return this.a6;
   }

   @Override
   public final float getCenterX() {
      return this.n5 + this.k5 / 2.0F;
   }

   @Override
   public final float getCenterY() {
      return this.l6 + this.u3 / 2.0F;
   }

   @Override
   public final byte getFlipH() {
      return this.u9;
   }

   @Override
   public final byte getFlipV() {
      return this.h0;
   }

   @Override
   public final Float getRectangle() {
      return com.aspose.slides.internal.o9b.y1.u9(this.n5());
   }

   com.aspose.slides.internal.o9b.y1 n5() {
      return new com.aspose.slides.internal.o9b.y1(this.n5, this.l6, this.k5, this.u3);
   }

   public final Object deepClone() {
      return this.cloneT();
   }

   public final IShapeFrame cloneT() {
      return new ShapeFrame(this.n5, this.l6, this.k5, this.u3, this.u9, this.h0, this.a6);
   }

   private void n5(float var1, float var2, float var3, float var4, byte var5, byte var6, float var7) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.a6 = var7;
      this.u9 = var5;
      this.h0 = var6;
   }

   static float n5(double var0) {
      if (var0 < 0.0) {
         var0 += 360.0 + com.aspose.slides.ms.System.q1.k5(-var0 / 360.0) * 360.0;
      }

      var0 %= 360.0;
      return (float)var0;
   }

   @Override
   public int hashCode() {
      return com.aspose.slides.internal.n2d.q0.n5(this.n5, this.l6, this.k5, this.u3, this.a6, this.u9, this.h0);
   }

   @Override
   public boolean equals(Object obj) {
      ShapeFrame var2 = com.aspose.slides.internal.v6g.k5.n5(obj, ShapeFrame.class);
      return var2 != null ? this.equals(var2) : false;
   }

   public final boolean equals(ShapeFrame value) {
      return this.u9 == value.u9
         && this.h0 == value.h0
         && com.aspose.slides.ms.System.q1.n5(this.n5 - value.n5)
               + com.aspose.slides.ms.System.q1.n5(this.l6 - value.l6)
               + com.aspose.slides.ms.System.q1.n5(this.k5 - value.k5)
               + com.aspose.slides.ms.System.q1.n5(this.u3 - value.u3)
               + com.aspose.slides.ms.System.q1.n5(n5(this.a6) - n5(value.a6))
            < 0.001;
   }
}
