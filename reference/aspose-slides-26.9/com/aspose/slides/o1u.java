package com.aspose.slides;

class o1u extends a8m<ILineFillFormat, o1u> {
   public static final o1u n5 = new o1u();

   protected boolean n5(ILineFillFormat var1, ILineFillFormat var2) {
      return var1.getFillType() == var2.getFillType()
         && var1.getRotateWithShape() == var2.getRotateWithShape()
         && s5r.n5.equals(var1.getSolidFillColor(), var2.getSolidFillColor())
         && o2i.n5.equals(var1.getGradientFormat(), var2.getGradientFormat())
         && k6b.n5.equals(var1.getPatternFormat(), var2.getPatternFormat());
   }

   protected int n5(ILineFillFormat var1) {
      int var2 = -324743029 + s5r.n5.l6(var1.getSolidFillColor());
      var2 = var2 * 486187739 + o2i.n5.l6(var1.getGradientFormat());
      var2 = var2 * 486187739 + k6b.n5.l6(var1.getPatternFormat());
      return var2 * 486187739 + com.aspose.slides.ms.System.s3.n5(var1.getRotateWithShape());
   }
}
