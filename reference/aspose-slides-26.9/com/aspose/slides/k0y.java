package com.aspose.slides;

class k0y extends a8m<IColorOperation, k0y> {
   public static final k0y n5 = new k0y();

   protected boolean n5(IColorOperation var1, IColorOperation var2) {
      return var1.getOperationType() == var2.getOperationType() && com.aspose.slides.internal.n8e.v4.n5(var1.getParameter(), var2.getParameter());
   }

   protected int n5(IColorOperation var1) {
      int var2 = -324743029 + com.aspose.slides.ms.System.s3.n5(var1.getOperationType());
      return var2 * 486187739 + com.aspose.slides.ms.System.n1.n5(var1.getParameter());
   }
}
