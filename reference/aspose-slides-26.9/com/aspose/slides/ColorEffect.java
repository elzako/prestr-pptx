package com.aspose.slides;

public class ColorEffect extends Behavior implements IColorEffect {
   ColorFormat a6;
   ColorFormat u9;
   int h0;
   int c8;
   ColorOffset t2 = new ColorOffset();

   public ColorEffect() {
      this.a6 = new ColorFormat(this);
      this.u9 = new ColorFormat(this);
   }

   @Override
   public final IColorFormat getFrom() {
      return this.a6;
   }

   @Override
   public final void setFrom(IColorFormat value) {
      this.a6 = (ColorFormat)value;
   }

   @Override
   public final IColorFormat getTo() {
      return this.u9;
   }

   @Override
   public final void setTo(IColorFormat value) {
      this.u9 = (ColorFormat)value;
   }

   @Override
   public final IColorOffset getBy() {
      return this.t2;
   }

   @Override
   public final void setBy(IColorOffset value) {
      this.t2 = (ColorOffset)value;
   }

   @Override
   public final int getColorSpace() {
      return this.c8;
   }

   @Override
   public final void setColorSpace(int value) {
      this.c8 = value;
   }

   @Override
   public final int getDirection() {
      return this.h0;
   }

   @Override
   public final void setDirection(int value) {
      this.h0 = value;
   }
}
