package com.aspose.slides;

import java.awt.geom.Point2D.Float;

public class ShapeElement implements IShapeElement {
   Shape n5;
   com.aspose.slides.internal.x4g.s7 l6;
   boolean k5;
   int u3;
   byte a6;
   byte u9;
   w7z h0 = null;
   ShapeFrame c8 = new ShapeFrame();

   public final Shape getParentShape() {
      return this.n5;
   }

   public final Float[] getPathPoints() {
      Float[] var1 = new Float[this.n5().length];

      for (int var2 = 0; var2 < this.n5().length; var2++) {
         var1[var2] = com.aspose.slides.internal.o9b.w1.l6(this.n5()[var2]);
      }

      return var1;
   }

   com.aspose.slides.internal.o9b.w1[] n5() {
      return this.l6 != null && this.l6.h0() > 0 ? this.l6.a6() : new com.aspose.slides.internal.o9b.w1[0];
   }

   public final byte[] getPathTypes() {
      return this.l6 != null && this.l6.h0() > 0 ? this.l6.u9() : new byte[0];
   }

   final com.aspose.slides.internal.x4g.s7 l6() {
      return this.l6;
   }

   final int k5() {
      return this.u3;
   }

   public final byte getFillSource() {
      return this.a6;
   }

   public final byte getStrokeSource() {
      return this.u9;
   }

   ShapeElement(Shape shape, com.aspose.slides.internal.x4g.s7 path, int type, boolean invisibleForDecoration, byte fillSource, byte strokeSource, w7z stroke) {
      this.n5 = shape;
      this.l6 = path;
      this.k5 = invisibleForDecoration;
      this.u3 = type;
      this.a6 = fillSource;
      this.u9 = strokeSource;
      if (strokeSource == 2) {
         this.h0 = stroke;
      }
   }
}
