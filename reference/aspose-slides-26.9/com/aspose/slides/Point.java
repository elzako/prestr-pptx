package com.aspose.slides;

public class Point implements IPoint {
   private float n5 = Float.NaN;
   private Object l6;
   private String k5 = "";

   public Point() {
   }

   public Point(float time, Object value, String formula) {
      this.n5 = time;
      this.l6 = value;
      this.k5 = formula;
   }

   @Override
   public final float getTime() {
      return this.n5;
   }

   @Override
   public final void setTime(float value) {
      this.n5 = value;
   }

   @Override
   public final Object getValue() {
      return this.l6;
   }

   @Override
   public final void setValue(Object value) {
      n5(value);
      this.l6 = value;
   }

   @Override
   public final String getFormula() {
      return this.k5;
   }

   @Override
   public final void setFormula(String value) {
      this.k5 = value;
   }

   static boolean n5(Object var0) {
      if (!com.aspose.slides.internal.v6g.k5.l6(var0, Boolean.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var0, ColorFormat.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var0, Float.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var0, Integer.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var0, String.class)) {
         throw new PptxException("Animation.Point, invalid property value type");
      } else {
         return true;
      }
   }
}
