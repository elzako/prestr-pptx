package com.aspose.slides;

public final class ColorReplace extends ImageTransformOperation implements IColorReplace, i4e, Cloneable {
   private ColorFormat l6;
   private v7o k5;

   ColorReplace(r0g parentImmediate) {
      super(parentImmediate);
      this.u3();
   }

   ColorReplace(ColorFormat color, r0g parentImmediate) {
      super(parentImmediate);
      this.u3();
      this.l6.n5(color);
   }

   private void u3() {
      this.l6 = new ColorFormat(this);
      this.l6.n5.l6(new ColorReplace$1(this));
   }

   @Override
   public final IColorFormat getColor() {
      return this.l6;
   }

   public final IColorReplaceEffectiveData getEffective() {
      return this.l6();
   }

   final v7o l6() {
      if (this.k5 == null) {
         this.k5 = new v7o(this);
      }

      this.k5.n5(v7o.class);
      return this.k5;
   }

   @Override
   String n5(IBaseSlide var1, r0s var2) {
      return com.aspose.slides.ms.System.d1.n5(new String[]{super.n5(var1, var2), this.l6.k5(var1, var2).toString()});
   }

   @Override
   c0v n5(c0v var1, IBaseSlide var2) {
      com.aspose.slides.internal.o9b.c8 var3 = this.l6.k5(var2, null).o8();
      int var4 = (var3.x8() & 255) << 16 | (var3.n3() & 255) << 8 | var3.y4() & 255;

      for (int var5 = 0; var5 < var1.a6().length; var5 += 4) {
         var1.a6()[var5 + 2] = var3.x8();
         var1.a6()[var5 + 1] = var3.n3();
         var1.a6()[var5] = var3.y4();
      }

      return var1;
   }

   @Override
   ImageTransformOperation k5() {
      ColorReplace var1 = (ColorReplace)this.memberwiseClone();
      var1.l6 = new ColorFormat(null);
      var1.l6.n5(this.l6);
      var1.l6.n5.l6(new ColorReplace$2(this, var1));
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
      ColorReplace var2 = com.aspose.slides.internal.v6g.k5.n5(obj, ColorReplace.class);
      if (var2 == null) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj) ? true : com.aspose.slides.internal.n8e.v4.n5(this.l6, var2.l6);
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }

   @Override
   protected Object memberwiseClone() {
      try {
         ColorReplace var1 = (ColorReplace)super.clone();
         if (this.l6 != null) {
            var1.l6.n5(this.l6);
         }

         return var1;
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }
}
