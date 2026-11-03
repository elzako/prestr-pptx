package com.aspose.slides;

class r7g extends a8m<IGlow, r7g> {
   public static final r7g n5 = new r7g();

   protected boolean n5(IGlow var1, IGlow var2) {
      return com.aspose.slides.internal.n8e.v4.n5(var1.getRadius(), var2.getRadius()) && s5r.n5.equals(var1.getColor(), var2.getColor());
   }

   protected int n5(IGlow var1) {
      int var2 = -324743029 + com.aspose.slides.ms.System.d2.n5(var1.getRadius());
      return var2 * 486187739 + s5r.n5.l6(var1.getColor());
   }
}
