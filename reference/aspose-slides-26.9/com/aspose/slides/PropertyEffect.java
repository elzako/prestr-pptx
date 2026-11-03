package com.aspose.slides;

public class PropertyEffect extends Behavior implements IPropertyEffect {
   String a6;
   String u9;
   String h0;
   PointCollection c8 = new PointCollection();
   int t2 = -1;
   int s7 = -1;

   @Override
   public final String getFrom() {
      return this.a6;
   }

   @Override
   public final void setFrom(String value) {
      this.a6 = value;
   }

   @Override
   public final String getTo() {
      return this.u9;
   }

   @Override
   public final void setTo(String value) {
      this.u9 = value;
   }

   @Override
   public final String getBy() {
      return this.h0;
   }

   @Override
   public final void setBy(String value) {
      this.h0 = value;
   }

   @Override
   public final int getValueType() {
      return this.s7;
   }

   @Override
   public final void setValueType(int value) {
      this.s7 = value;
   }

   @Override
   public final int getCalcMode() {
      return this.t2;
   }

   @Override
   public final void setCalcMode(int value) {
      this.t2 = value;
   }

   @Override
   public final IPointCollection getPoints() {
      return this.c8;
   }

   @Override
   public final void setPoints(IPointCollection value) {
      this.c8 = (PointCollection)value;
   }
}
