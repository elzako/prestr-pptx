package com.aspose.slides;

public final class AlphaInverse extends ImageTransformOperation implements IAlphaInverse, i4e {
   private ColorFormat l6 = new ColorFormat(this);

   AlphaInverse(r0g parentImmediate) {
      super(parentImmediate);
      this.l6.n5.l6(new AlphaInverse$1(this));
   }

   public final IAlphaInverseEffectiveData getEffective() {
      return this.n5();
   }

   final e5 n5() {
      return e5.n5;
   }

   final ColorFormat l6() {
      return this.l6;
   }

   @Override
   c0v n5(c0v var1, IBaseSlide var2) {
      byte var3 = this.l6.u3().x8();
      byte var4 = this.l6.u3().n3();
      byte var5 = this.l6.u3().y4();

      for (int var6 = 0; var6 < var1.a6().length; var6 += 4) {
         var1.a6()[var6] = var5;
         var1.a6()[var6 + 1] = var4;
         var1.a6()[var6 + 2] = var3;
         var1.a6()[var6 + 3] = (byte)(255 - (var1.a6()[var6 + 3] & 255));
      }

      return var1;
   }

   @Override
   ImageTransformOperation k5() {
      AlphaInverse var1 = new AlphaInverse(null);
      var1.l6 = new ColorFormat(null);
      var1.l6.n5(this.l6);
      var1.l6.n5.l6(new AlphaInverse$2(this, var1));
      return var1;
   }

   @Override
   void n5(r0g var1) {
      super.n5(var1);
      this.l6.n5(this);
      this.h0();
   }

   @Override
   public long getVersion() {
      return (super.getVersion() & 4294967295L) + (this.l6.getVersion() & 4294967295L) & 4294967295L;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      }

      AlphaInverse var2 = com.aspose.slides.internal.v6g.k5.n5(obj, AlphaInverse.class);
      return var2 == null ? false : com.aspose.slides.internal.n8e.v4.n5(this.l6, var2.l6);
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }
}
