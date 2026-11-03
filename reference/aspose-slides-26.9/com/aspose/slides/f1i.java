package com.aspose.slides;

class f1i extends a8m<IFillOverlay, f1i> {
   public static final f1i n5 = new f1i();

   protected boolean n5(IFillOverlay var1, IFillOverlay var2) {
      return var1.getBlend() == var2.getBlend() && f4q.n5.equals(var1.getFillFormat(), var2.getFillFormat());
   }

   protected int n5(IFillOverlay var1) {
      int var2 = -324743029 + com.aspose.slides.ms.System.s3.n5(var1.getBlend());
      return var2 * 486187739 + f4q.n5.l6(var1.getFillFormat());
   }
}
