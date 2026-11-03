package com.aspose.slides.internal.o9b;

import com.aspose.slides.ms.System.IDisposable;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public abstract class n5 implements IDisposable, Shape {
   private Shape l6;
   protected boolean n5;

   protected n5(Shape var1) {
      this.l6 = var1;
   }

   protected Shape n5() {
      return this.l6;
   }

   public void n5(Shape var1) {
      this.l6 = var1;
      this.n5 = true;
   }

   @Override
   public void dispose() {
      this.n5(true);
   }

   private void n5(boolean var1) {
   }

   @Override
   public Rectangle getBounds() {
      return this.n5().getBounds();
   }

   @Override
   public boolean contains(double arg_0, double arg_1) {
      return this.n5().contains(arg_0, arg_1);
   }

   @Override
   public boolean contains(Point2D arg_0) {
      return this.n5().contains(arg_0);
   }

   @Override
   public boolean contains(double arg_0, double arg_1, double arg_2, double arg_3) {
      return this.n5().contains(arg_0, arg_1, arg_2, arg_3);
   }

   @Override
   public boolean contains(Rectangle2D arg_0) {
      return this.n5().contains(arg_0);
   }

   @Override
   public PathIterator getPathIterator(AffineTransform arg_0) {
      return this.n5().getPathIterator(arg_0);
   }

   @Override
   public PathIterator getPathIterator(AffineTransform arg_0, double arg_1) {
      return this.n5().getPathIterator(arg_0, arg_1);
   }

   @Override
   public Rectangle2D getBounds2D() {
      return this.n5().getBounds2D();
   }

   @Override
   public boolean intersects(double arg_0, double arg_1, double arg_2, double arg_3) {
      return this.n5().intersects(arg_0, arg_1, arg_2, arg_3);
   }

   @Override
   public boolean intersects(Rectangle2D arg_0) {
      return this.n5().intersects(arg_0);
   }
}
