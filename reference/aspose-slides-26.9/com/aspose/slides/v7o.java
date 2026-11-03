package com.aspose.slides;

import java.awt.Color;

final class v7o extends w9s<ColorReplace, v7o> implements IColorReplaceEffectiveData {
   j3z n5;
   static final v7o l6 = u3();

   v7o(ColorReplace var1) {
      super(var1, ColorReplace.class, v7o.class);
   }

   @Override
   public final Color getColor() {
      return com.aspose.slides.internal.o9b.c8.l6(this.l6());
   }

   com.aspose.slides.internal.o9b.c8 l6() {
      return this.n5.n5();
   }

   static v7o u3() {
      v7o var0 = new v7o(null);
      var0.a6().n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      return var0;
   }

   void n5(i7b var1, ColorReplace var2) {
      v7o var3 = (v7o)var1;
      this.a6().n5(var3.a6(), (ColorFormat)var2.getColor());
   }

   @Override
   public void n5(IBaseSlide var1, w6a var2) {
      this.a6().n5(var1, var2);
   }

   boolean n5(v7o var1) {
      if (var1 == null) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, var1) ? true : this.a6().equals(var1.a6());
      }
   }

   final j3z a6() {
      if (this.n5 == null) {
         this.n5 = new j3z();
      }

      return this.n5;
   }

   @Override
   public c0v n5(c0v var1) {
      com.aspose.slides.internal.o9b.c8 var2 = this.l6().o8();

      for (int var3 = 0; var3 < var1.a6().length; var3 += 4) {
         var1.a6()[var3 + 2] = var2.x8();
         var1.a6()[var3 + 1] = var2.n3();
         var1.a6()[var3] = var2.y4();
      }

      return var1;
   }

   @Override
   public String n5() {
      return com.aspose.slides.ms.System.d1.n5(new Object[]{super.n5(), ' ', this.n5 != null ? this.n5.toString() : ""});
   }
}
