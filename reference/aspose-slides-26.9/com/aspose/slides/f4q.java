package com.aspose.slides;

class f4q extends a8m<IFillFormat, f4q> {
   public static final f4q n5 = new f4q();

   protected boolean n5(IFillFormat var1, IFillFormat var2) {
      return var1.getFillType() == var2.getFillType()
         && var1.getRotateWithShape() == var2.getRotateWithShape()
         && s5r.n5.equals(var1.getSolidFillColor(), var2.getSolidFillColor())
         && o2i.n5.equals(var1.getGradientFormat(), var2.getGradientFormat())
         && k6b.n5.equals(var1.getPatternFormat(), var2.getPatternFormat())
         && z8r.n5.equals(var1.getPictureFillFormat(), var2.getPictureFillFormat());
   }

   protected int n5(IFillFormat var1) {
      int var2 = -324743029 + com.aspose.slides.ms.System.s3.n5(var1.getFillType());
      var2 = var2 * 486187739 + s5r.n5.l6(var1.getSolidFillColor());
      var2 = var2 * 486187739 + o2i.n5.l6(var1.getGradientFormat());
      var2 = var2 * 486187739 + k6b.n5.l6(var1.getPatternFormat());
      var2 = var2 * 486187739 + z8r.n5.l6(var1.getPictureFillFormat());
      return var2 * 486187739 + com.aspose.slides.ms.System.s3.n5(var1.getRotateWithShape());
   }
}
