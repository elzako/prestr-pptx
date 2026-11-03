package com.aspose.slides;

final class v4m extends l0 implements l8k {
   private final boolean k5;
   private boolean u3 = true;
   private final IColorFormat a6;
   private com.aspose.slides.internal.o9b.c8 u9 = new com.aspose.slides.internal.o9b.c8();
   public final IShape l6;

   public static boolean n5(ColorEffect var0) {
      if (var0.getProperties().size() != 1) {
         return false;
      }

      String var1 = var0.getProperties().get_Item(0).getValue();
      return "style.color".equals(var1) || "stroke.color".equals(var1);
   }

   public v4m(IShape var1, ColorEffect var2) {
      super(var2, var1.getSlide());
      this.l6 = var1;
      String var3 = var2.getProperties().get_Item(0).getValue();
      this.k5 = "stroke.color".equals(var3);
      if (this.k5) {
         this.a6 = this.l6.getLineFormat().getFillFormat().getSolidFillColor();
      } else {
         this.a6 = this.l6.getFillFormat().getSolidFillColor();
      }
   }

   @Override
   public final void n5(float var1) {
      if (this.u3) {
         this.u3 = false;
         if (this.k5) {
            ((z1a)this.l6.getLineFormat().getEffective().getFillFormat()).u3().n5(this.u9);
            this.l6.getLineFormat().getFillFormat().setFillType((byte)1);
         } else {
            ((f6a)this.l6.getFillFormat().getEffective()).h0().n5(this.u9);
            this.l6.getFillFormat().setFillType((byte)1);
         }
      }

      ((ColorFormat)this.a6).n5(n5(this.u9.o8(), this.n5.o8(), var1).o8());
   }

   @Override
   public final void n5() {
      ((ColorFormat)this.a6).n5(this.n5.o8());
   }
}
