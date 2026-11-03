package com.aspose.slides;

public final class Duotone extends ImageTransformOperation implements IDuotone, i4e {
   private ColorFormat l6;
   private ColorFormat k5;
   private b5j u3;

   Duotone(r0g parentImmediate) {
      super(parentImmediate);
      this.u3();
   }

   Duotone(ColorFormat color1, ColorFormat color2, r0g parentImmediate) {
      super(parentImmediate);
      this.u3();
      this.l6.n5(color1);
      this.k5.n5(color2);
   }

   private void u3() {
      this.l6 = new ColorFormat(this);
      this.k5 = new ColorFormat(this);
      this.l6.n5.l6(new Duotone$1(this));
      this.k5.n5.l6(new Duotone$2(this));
   }

   @Override
   public final IColorFormat getColor1() {
      return this.l6;
   }

   @Override
   public final IColorFormat getColor2() {
      return this.k5;
   }

   public final IDuotoneEffectiveData getEffective() {
      return this.l6();
   }

   final b5j l6() {
      if (this.u3 == null) {
         this.u3 = new b5j(this);
      }

      this.u3.n5(b5j.class);
      return this.u3;
   }

   @Override
   String n5(IBaseSlide var1, r0s var2) {
      return com.aspose.slides.ms.System.d1.n5(new Object[]{super.n5(var1, var2), this.l6.k5(var1, var2), ' ', this.k5.k5(var1, var2)});
   }

   @Override
   c0v n5(c0v var1, IBaseSlide var2) {
      com.aspose.slides.internal.o9b.c8 var3 = this.l6.k5(var2, null).o8();
      com.aspose.slides.internal.o9b.c8 var4 = this.k5.k5(var2, null).o8();
      int var5 = var3.x8() & 255;
      int var6 = (var4.x8() & 255) - var5;
      int var7 = var3.n3() & 255;
      int var8 = (var4.n3() & 255) - var7;
      int var9 = var3.y4() & 255;
      int var10 = (var4.y4() & 255) - var9;

      for (int var11 = 0; var11 < var1.a6().length; var11 += 4) {
         float var12 = ((var1.a6()[var11 + 2] & 0xFF) * 0.2126F + (var1.a6()[var11 + 1] & 0xFF) * 0.7151F + (var1.a6()[var11] & 0xFF) * 0.0722F) / 255.0F;
         var1.a6()[var11 + 2] = com.aspose.slides.internal.v6g.k5.n5((Object)(var5 + var6 * var12), 13);
         var1.a6()[var11 + 1] = com.aspose.slides.internal.v6g.k5.n5((Object)(var7 + var8 * var12), 13);
         var1.a6()[var11] = com.aspose.slides.internal.v6g.k5.n5((Object)(var9 + var10 * var12), 13);
      }

      return var1;
   }

   @Override
   ImageTransformOperation k5() {
      Duotone var1 = new Duotone(null);
      var1.l6 = new ColorFormat(null);
      var1.l6.n5(this.l6);
      var1.k5 = new ColorFormat(null);
      var1.k5.n5(this.k5);
      return var1;
   }

   @Override
   void n5(r0g var1) {
      super.n5(var1);
      this.l6.n5(this);
      this.k5.n5(this);
      this.h0();
   }

   @Override
   public long getVersion() {
      return ((super.getVersion() & 4294967295L) + (this.l6.getVersion() & 4294967295L) & 4294967295L) + (this.k5.getVersion() & 4294967295L) & 4294967295L;
   }

   @Override
   public boolean equals(Object obj) {
      Duotone var2 = com.aspose.slides.internal.v6g.k5.n5(obj, Duotone.class);
      if (var2 == null) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj)
            ? true
            : com.aspose.slides.internal.n8e.v4.n5(this.l6, var2.l6) && com.aspose.slides.internal.n8e.v4.n5(this.k5, var2.k5);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }
}
