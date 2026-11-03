package com.aspose.slides;

class p1n extends a8m<IGradientStop, p1n> {
   public static final p1n n5 = new p1n();

   protected boolean n5(IGradientStop var1, IGradientStop var2) {
      return com.aspose.slides.internal.n8e.v4.n5(var1.getPosition(), var2.getPosition()) && s5r.n5.equals(var1.getColor(), var2.getColor());
   }

   protected int n5(IGradientStop var1) {
      int var2 = -324743029 + com.aspose.slides.ms.System.n1.n5(var1.getPosition());
      return var2 * 486187739 + s5r.n5.l6(var1.getColor());
   }
}
