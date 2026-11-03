package com.aspose.slides;

class k6b extends a8m<IPatternFormat, k6b> {
   public static final k6b n5 = new k6b();

   protected boolean n5(IPatternFormat var1, IPatternFormat var2) {
      return var1.getPatternStyle() == var2.getPatternStyle()
         && s5r.n5.equals(var1.getForeColor(), var2.getForeColor())
         && s5r.n5.equals(var1.getBackColor(), var2.getBackColor());
   }

   protected int n5(IPatternFormat var1) {
      int var2 = -324743029 + com.aspose.slides.ms.System.s3.n5(var1.getPatternStyle());
      var2 = var2 * 486187739 + s5r.n5.l6(var1.getForeColor());
      return var2 * 486187739 + s5r.n5.l6(var1.getBackColor());
   }
}
