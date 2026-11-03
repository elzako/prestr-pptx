package com.aspose.slides;

class b2t extends a8m<ISketchFormat, b2t> {
   public static final b2t n5 = new b2t();

   protected boolean n5(ISketchFormat var1, ISketchFormat var2) {
      return var1.getSketchType() == var2.getSketchType()
         && ((SketchFormat)var1).u3() == ((SketchFormat)var2).u3()
         && ((SketchFormat)var1).a6().x8() == ((SketchFormat)var2).a6().x8();
   }

   protected int n5(ISketchFormat var1) {
      int var2 = -324743029 + com.aspose.slides.ms.System.s3.n5(var1.getSketchType());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.l4.n5(((SketchFormat)var1).u3());
      return var2 * 486187739 + com.aspose.slides.ms.System.s3.n5(((SketchFormat)var1).a6().x8());
   }
}
