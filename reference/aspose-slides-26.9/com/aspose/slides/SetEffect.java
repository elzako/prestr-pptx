package com.aspose.slides;

public class SetEffect extends Behavior implements ISetEffect {
   Object a6;

   @Override
   public final Object getTo() {
      return this.a6;
   }

   @Override
   public final void setTo(Object value) {
      this.n5(value);
      this.a6 = value;
   }

   final boolean n5(Object var1) {
      if (!com.aspose.slides.internal.v6g.k5.l6(var1, String.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var1, ColorFormat.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var1, Float.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var1, Integer.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var1, Long.class)
         && !com.aspose.slides.internal.v6g.k5.l6(var1, Boolean.class)) {
         throw new PptxException("invalid property value type");
      } else {
         return true;
      }
   }
}
