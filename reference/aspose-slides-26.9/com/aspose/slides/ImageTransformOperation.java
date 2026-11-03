package com.aspose.slides;

public abstract class ImageTransformOperation extends PVIObject implements IImageTransformOperation, Cloneable {
   private p8u l6;
   final com.aspose.slides.internal.v6g.n5<p8u> n5 = new ImageTransformOperation$1(this);
   private long k5;

   ImageTransformOperation(r0g parentImmediate) {
      super(parentImmediate);
      this.k7();
   }

   @Override
   Object M_() {
      return this;
   }

   abstract c0v n5(c0v var1, IBaseSlide var2);

   void n5(r0g var1) {
      this.l6(var1);
      this.h0();
   }

   ImageTransformOperation k5() {
      return (ImageTransformOperation)this.memberwiseClone();
   }

   String n5(IBaseSlide var1, r0s var2) {
      return com.aspose.slides.ms.System.j8.n5(this).s7();
   }

   @Override
   public long getVersion() {
      return this.k5;
   }

   final void h0() {
      this.k5++;
      this.c8();
   }

   final void c8() {
      p8u var1 = this.l6;
      if (var1 != null && !this.n5.n5()) {
         var1.n5();
      }
   }

   protected Object memberwiseClone() {
      try {
         return (ImageTransformOperation)super.clone();
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }

   // $VF: synthetic method
   static p8u n5(ImageTransformOperation var0, p8u var1) {
      return var0.l6 = var1;
   }
}
