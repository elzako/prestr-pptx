package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import java.awt.geom.Point2D.Float;

public final class GeometryPath implements IGeometryPath {
   private byte n5 = 1;
   private boolean l6 = true;
   private List<PathSegment> k5;

   public GeometryPath() {
   }

   @Override
   public final IPathSegment[] getPathData() {
      if (this.k5 == null) {
         this.k5 = new List<>();
      }

      return this.k5.toArray(new PathSegment[0]);
   }

   @Override
   public final void removeAt(int index) {
      if (index < this.k5.size() && index >= 0) {
         this.k5.removeAt(index);
      } else {
         throw new InvalidOperationException("Index out of bounds");
      }
   }

   @Override
   public final void lineTo(Float point) {
      this.n5(com.aspose.slides.internal.o9b.w1.n5(point));
   }

   void n5(com.aspose.slides.internal.o9b.w1 var1) {
      this.lineTo(var1.l6(), var1.k5());
   }

   @Override
   public final void lineTo(float x, float y) {
      this.n5((byte)2, new float[]{x, y});
   }

   @Override
   public final void lineTo(Float point, long index) {
      this.n5(com.aspose.slides.internal.o9b.w1.n5(point), index);
   }

   void n5(com.aspose.slides.internal.o9b.w1 var1, long var2) {
      this.lineTo(var1.l6(), var1.k5(), var2);
   }

   @Override
   public final void lineTo(float x, float y, long index) {
      this.n5((byte)2, new float[]{x, y}, index);
   }

   @Override
   public final void cubicBezierTo(Float point1, Float point2, Float point3) {
      this.n5(com.aspose.slides.internal.o9b.w1.n5(point1), com.aspose.slides.internal.o9b.w1.n5(point2), com.aspose.slides.internal.o9b.w1.n5(point3));
   }

   void n5(com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.w1 var2, com.aspose.slides.internal.o9b.w1 var3) {
      this.cubicBezierTo(var1.l6(), var1.k5(), var2.l6(), var2.k5(), var3.l6(), var3.k5());
   }

   @Override
   public final void cubicBezierTo(float x1, float y1, float x2, float y2, float x3, float y3) {
      this.n5((byte)5, new float[]{x1, y1, x2, y2, x3, y3});
   }

   @Override
   public final void cubicBezierTo(Float point1, Float point2, Float point3, long index) {
      this.n5(com.aspose.slides.internal.o9b.w1.n5(point1), com.aspose.slides.internal.o9b.w1.n5(point2), com.aspose.slides.internal.o9b.w1.n5(point3), index);
   }

   void n5(com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.w1 var2, com.aspose.slides.internal.o9b.w1 var3, long var4) {
      this.cubicBezierTo(var1.l6(), var1.k5(), var2.l6(), var2.k5(), var3.l6(), var3.k5(), var4);
   }

   @Override
   public final void cubicBezierTo(float x1, float y1, float x2, float y2, float x3, float y3, long index) {
      this.n5((byte)5, new float[]{x1, y1, x2, y2, x3, y3}, index);
   }

   @Override
   public final void quadraticBezierTo(Float point1, Float point2) {
      this.n5(com.aspose.slides.internal.o9b.w1.n5(point1), com.aspose.slides.internal.o9b.w1.n5(point2));
   }

   void n5(com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.w1 var2) {
      this.quadraticBezierTo(var1.l6(), var1.k5(), var2.l6(), var2.k5());
   }

   @Override
   public final void quadraticBezierTo(float x1, float y1, float x2, float y2) {
      this.n5((byte)4, new float[]{x1, y1, x2, y2});
   }

   @Override
   public final void quadraticBezierTo(Float point1, Float point2, long index) {
      this.n5(com.aspose.slides.internal.o9b.w1.n5(point1), com.aspose.slides.internal.o9b.w1.n5(point2), index);
   }

   void n5(com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.w1 var2, long var3) {
      this.quadraticBezierTo(var1.l6(), var1.k5(), var2.l6(), var2.k5(), var3);
   }

   @Override
   public final void quadraticBezierTo(float x1, float y1, float x2, float y2, long index) {
      this.n5((byte)4, new float[]{x1, y1, x2, y2}, index);
   }

   @Override
   public final void closeFigure() {
      this.n5((byte)0, new float[0]);
   }

   @Override
   public final void moveTo(Float point) {
      this.l6(com.aspose.slides.internal.o9b.w1.n5(point));
   }

   void l6(com.aspose.slides.internal.o9b.w1 var1) {
      this.moveTo(var1.l6(), var1.k5());
   }

   @Override
   public final void moveTo(float x, float y) {
      this.n5((byte)1, new float[]{x, y});
   }

   @Override
   public final void arcTo(float width, float heigth, float startAngle, float sweepAngle) {
      this.n5((byte)3, new float[]{width, heigth, startAngle, sweepAngle});
   }

   @Override
   public final byte getFillMode() {
      return this.n5;
   }

   @Override
   public final void setFillMode(byte value) {
      this.n5 = value;
   }

   @Override
   public final boolean getStroke() {
      return this.l6;
   }

   @Override
   public final void setStroke(boolean value) {
      this.l6 = value;
   }

   GeometryPath(byte fillMode, boolean stroke) {
      this.n5 = fillMode;
      this.l6 = stroke;
   }

   private void n5(float[] var1) {
      for (float var5 : var1) {
         if (com.aspose.slides.ms.System.n1.k5(var5)) {
            throw new ArgumentException("Path data can't be NaN");
         }
      }
   }

   private PathSegment n5(byte var1, float[] var2) {
      this.n5(var2);
      if (this.k5 == null) {
         this.k5 = new List<>();
      }

      PathSegment var3 = new PathSegment(var1, var2);
      this.k5.addItem(var3);
      return var3;
   }

   private PathSegment n5(byte var1, float[] var2, long var3) {
      this.n5(var2);
      if (this.k5 != null && (var3 & 4294967295L) < this.k5.size()) {
         PathSegment var5 = new PathSegment(var1, var2);
         this.k5.insertItem((int)var3, var5);
         return var5;
      } else {
         throw new ArgumentOutOfRangeException("Segment index is out of PathData range");
      }
   }
}
