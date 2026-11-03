package com.aspose.slides;

public class RotationEffect extends Behavior implements IRotationEffect {
   float a6 = Float.NaN;
   float u9 = Float.NaN;
   float h0 = Float.NaN;

   @Override
   public final float getFrom() {
      return this.a6;
   }

   @Override
   public final void setFrom(float value) {
      this.a6 = value;
   }

   @Override
   public final float getTo() {
      return this.u9;
   }

   @Override
   public final void setTo(float value) {
      this.u9 = value;
   }

   @Override
   public final float getBy() {
      return this.h0;
   }

   @Override
   public final void setBy(float value) {
      this.h0 = value;
   }
}
