package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentException;
import java.awt.Color;

public final class DrawingGuide implements IDrawingGuide {
   private byte n5;
   private com.aspose.slides.internal.o9b.c8 l6 = new com.aspose.slides.internal.o9b.c8();
   private float k5;

   @Override
   public final byte getOrientation() {
      return this.n5;
   }

   @Override
   public final void setOrientation(byte value) {
      this.n5 = value;
   }

   @Override
   public final float getPosition() {
      return this.k5;
   }

   @Override
   public final void setPosition(float value) {
      if (com.aspose.slides.ms.System.n1.k5(value)) {
         throw new ArgumentException("The position value must be defined (not a float.NaN).");
      }

      this.k5 = value;
   }

   @Override
   public final Color getColor() {
      return com.aspose.slides.internal.o9b.c8.l6(this.n5());
   }

   com.aspose.slides.internal.o9b.c8 n5() {
      return this.l6.o8();
   }

   @Override
   public final void setColor(Color value) {
      this.n5(com.aspose.slides.internal.o9b.c8.n5(value));
   }

   void n5(com.aspose.slides.internal.o9b.c8 var1) {
      this.l6 = var1.o8();
   }

   DrawingGuide(byte orientation, float position) {
      this.k5 = position;
      this.setOrientation(orientation);
      this.n5(DrawingGuidesCollection.n5.o8());
   }

   DrawingGuide(byte orientation, float position, com.aspose.slides.internal.o9b.c8 color) {
      this.k5 = position;
      this.setOrientation(orientation);
      this.n5(color.o8());
   }
}
