package com.aspose.slides;

class q8 extends a8m<IBlur, q8> {
   public static final q8 n5 = new q8();

   protected boolean n5(IBlur var1, IBlur var2) {
      return var1.getGrow() == var2.getGrow() && com.aspose.slides.internal.n8e.v4.n5(var1.getRadius(), var2.getRadius());
   }

   protected int n5(IBlur var1) {
      int var2 = -324743029 + com.aspose.slides.ms.System.n3.n5(var1.getGrow());
      return var2 * 486187739 + com.aspose.slides.ms.System.d2.n5(var1.getRadius());
   }
}
