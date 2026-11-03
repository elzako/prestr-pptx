package com.aspose.slides;

import java.awt.Color;

final class b5j extends w9s<Duotone, b5j> implements IDuotoneEffectiveData {
   j3z n5;
   j3z l6;
   static final b5j k5 = a6();

   b5j(Duotone var1) {
      super(var1, Duotone.class, b5j.class);
   }

   @Override
   public final Color getColor1() {
      return com.aspose.slides.internal.o9b.c8.l6(this.l6());
   }

   com.aspose.slides.internal.o9b.c8 l6() {
      return this.n5.n5();
   }

   @Override
   public final Color getColor2() {
      return com.aspose.slides.internal.o9b.c8.l6(this.u3());
   }

   com.aspose.slides.internal.o9b.c8 u3() {
      return this.l6.n5();
   }

   static b5j a6() {
      b5j var0 = new b5j(null);
      var0.u9().n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      var0.h0().n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      return var0;
   }

   void n5(i7b var1, Duotone var2) {
      b5j var3 = (b5j)var1;
      this.u9().n5(var3.u9(), (ColorFormat)var2.getColor1());
      this.h0().n5(var3.h0(), (ColorFormat)var2.getColor2());
   }

   @Override
   public void n5(IBaseSlide var1, w6a var2) {
      this.u9().n5(var1, var2);
      this.h0().n5(var1, var2);
   }

   boolean n5(b5j var1) {
      if (var1 == null) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, var1) ? true : this.u9().equals(var1.u9()) && this.h0().equals(var1.h0());
      }
   }

   final j3z u9() {
      if (this.n5 == null) {
         this.n5 = new j3z();
      }

      return this.n5;
   }

   final j3z h0() {
      if (this.l6 == null) {
         this.l6 = new j3z();
      }

      return this.l6;
   }

   @Override
   public c0v n5(c0v var1) {
      com.aspose.slides.internal.o9b.c8 var2 = this.l6().o8();
      com.aspose.slides.internal.o9b.c8 var3 = this.u3().o8();
      int var4 = var2.x8() & 255;
      int var5 = (var3.x8() & 255) - var4;
      int var6 = var2.n3() & 255;
      int var7 = (var3.n3() & 255) - var6;
      int var8 = var2.y4() & 255;
      int var9 = (var3.y4() & 255) - var8;

      for (int var10 = 0; var10 < var1.a6().length; var10 += 4) {
         float var11 = ((var1.a6()[var10 + 2] & 0xFF) * 0.2126F + (var1.a6()[var10 + 1] & 0xFF) * 0.7151F + (var1.a6()[var10] & 0xFF) * 0.0722F) / 255.0F;
         var1.a6()[var10 + 2] = com.aspose.slides.internal.v6g.k5.n5((Object)(var4 + var5 * var11), 13);
         var1.a6()[var10 + 1] = com.aspose.slides.internal.v6g.k5.n5((Object)(var6 + var7 * var11), 13);
         var1.a6()[var10] = com.aspose.slides.internal.v6g.k5.n5((Object)(var8 + var9 * var11), 13);
      }

      return var1;
   }

   @Override
   public String n5() {
      return com.aspose.slides.ms.System.d1.n5(new Object[]{super.n5(), ' ', this.n5 != null ? this.n5.toString() : "", ' ', this.l6 != null ? this.l6.toString() : ""});
   }
}
