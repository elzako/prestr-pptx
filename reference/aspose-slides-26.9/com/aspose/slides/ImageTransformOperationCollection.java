package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;

public final class ImageTransformOperationCollection extends PVIObject implements IImageTransformOperationCollection {
   private k6o l6;
   final com.aspose.slides.internal.v6g.n5<k6o> n5 = new ImageTransformOperationCollection$1(this);
   private List<IImageTransformOperation> k5;

   ImageTransformOperationCollection(r0g parentImmediate) {
      super(parentImmediate);
   }

   @Override
   void N_() {
      this.k5 = new List<>();
   }

   @Override
   Object M_() {
      return new g4z(this.k5);
   }

   final g4z l6() {
      return (g4z)this.m1();
   }

   @Override
   public long getVersion() {
      return !this.z3() ? 1L : this.l6().l6();
   }

   @Override
   public final IImageTransformOperation get_Item(int index) {
      this.m3();
      return this.k5.get_Item(index);
   }

   @Override
   public final void removeAt(int index) {
      if (this.z3()) {
         this.l6().n5(index);
         this.u3();
      } else {
         throw new ArgumentOutOfRangeException("index");
      }
   }

   @Override
   public final IAlphaBiLevel addAlphaBiLevelEffect(float threshold) {
      this.k7();
      AlphaBiLevel var2 = new AlphaBiLevel(threshold, this);
      this.l6().n5(var2);
      var2.n5.l6(new ImageTransformOperationCollection$12(this));
      this.u3();
      return var2;
   }

   @Override
   public final IAlphaCeiling addAlphaCeilingEffect() {
      this.k7();
      AlphaCeiling var1 = new AlphaCeiling(this);
      this.l6().n5(var1);
      var1.n5.l6(new ImageTransformOperationCollection$16(this));
      this.u3();
      return var1;
   }

   @Override
   public final IAlphaFloor addAlphaFloorEffect() {
      this.k7();
      AlphaFloor var1 = new AlphaFloor(this);
      this.l6().n5(var1);
      var1.n5.l6(new ImageTransformOperationCollection$17(this));
      this.u3();
      return var1;
   }

   @Override
   public final IAlphaInverse addAlphaInverseEffect() {
      this.k7();
      AlphaInverse var1 = new AlphaInverse(this);
      this.l6().n5(var1);
      var1.n5.l6(new ImageTransformOperationCollection$18(this));
      this.u3();
      return var1;
   }

   @Override
   public final IAlphaModulate addAlphaModulateEffect() {
      this.k7();
      AlphaModulate var1 = new AlphaModulate(this);
      this.l6().n5(var1);
      var1.n5.l6(new ImageTransformOperationCollection$19(this));
      this.u3();
      return var1;
   }

   @Override
   public final IAlphaModulateFixed addAlphaModulateFixedEffect(float amount) {
      this.k7();
      AlphaModulateFixed var2 = new AlphaModulateFixed(amount, this);
      this.l6().n5(var2);
      var2.n5.l6(new ImageTransformOperationCollection$20(this));
      this.u3();
      return var2;
   }

   @Override
   public final IAlphaReplace addAlphaReplaceEffect(float alpha) {
      this.k7();
      AlphaReplace var2 = new AlphaReplace(alpha, this);
      this.l6().n5(var2);
      var2.n5.l6(new ImageTransformOperationCollection$21(this));
      this.u3();
      return var2;
   }

   @Override
   public final IBiLevel addBiLevelEffect(float threshold) {
      this.k7();
      BiLevel var2 = new BiLevel(threshold, this);
      this.l6().n5(var2);
      var2.n5.l6(new ImageTransformOperationCollection$22(this));
      this.u3();
      return var2;
   }

   @Override
   public final IBlur addBlurEffect(double radius, boolean grow) {
      this.k7();
      Blur var4 = new Blur(radius, grow, this);
      this.l6().n5(var4);
      var4.n5.l6(new ImageTransformOperationCollection$2(this));
      this.u3();
      return var4;
   }

   @Override
   public final IColorChange addColorChangeEffect() {
      this.k7();
      ColorChange var1 = new ColorChange(this);
      this.l6().n5(var1);
      var1.n5.l6(new ImageTransformOperationCollection$3(this));
      this.u3();
      return var1;
   }

   @Override
   public final IColorReplace addColorReplaceEffect() {
      this.k7();
      ColorReplace var1 = new ColorReplace(this);
      this.l6().n5(var1);
      var1.n5.l6(new ImageTransformOperationCollection$4(this));
      this.u3();
      return var1;
   }

   @Override
   public final IDuotone addDuotoneEffect() {
      this.k7();
      Duotone var1 = new Duotone(this);
      this.l6().n5(var1);
      var1.n5.l6(new ImageTransformOperationCollection$5(this));
      this.u3();
      return var1;
   }

   @Override
   public final IFillOverlay addFillOverlayEffect() {
      this.k7();
      FillOverlay var1 = new FillOverlay(this);
      this.l6().n5(var1);
      var1.n5.l6(new ImageTransformOperationCollection$6(this));
      this.u3();
      return var1;
   }

   @Override
   public final IGrayScale addGrayScaleEffect() {
      this.k7();
      GrayScale var1 = new GrayScale(this);
      this.l6().n5(var1);
      var1.n5.l6(new ImageTransformOperationCollection$7(this));
      this.u3();
      return var1;
   }

   @Override
   public final IHSL addHSLEffect(float hue, float saturation, float luminance) {
      this.k7();
      HSL var4 = new HSL(hue, saturation, luminance, this);
      this.l6().n5(var4);
      var4.n5.l6(new ImageTransformOperationCollection$8(this));
      this.u3();
      return var4;
   }

   @Override
   public final ILuminance addLuminanceEffect(float brightness, float contrast) {
      this.k7();
      Luminance var3 = new Luminance(brightness, contrast, this);
      this.l6().n5(var3);
      var3.n5.l6(new ImageTransformOperationCollection$9(this));
      this.u3();
      return var3;
   }

   @Override
   public final ITint addTintEffect(float hue, float amount) {
      this.k7();
      Tint var3 = new Tint(hue, amount, this);
      this.l6().n5(var3);
      var3.n5.l6(new ImageTransformOperationCollection$10(this));
      this.u3();
      return var3;
   }

   @Override
   public final IBrightnessContrast addBrightnessContrastEffect(float brightness, float contrast) {
      this.k7();
      BrightnessContrast var3 = new BrightnessContrast(brightness, contrast, this);
      this.l6().n5(var3);
      var3.n5.l6(new ImageTransformOperationCollection$11(this));
      this.u3();
      return var3;
   }

   @Override
   public final int size() {
      this.m3();
      return this.k5.size();
   }

   @Override
   public final boolean isReadOnly() {
      this.m3();
      return this.k5.isReadOnly();
   }

   public final void addItem(IImageTransformOperation operation) {
      this.n5(operation);
   }

   final void n5(IImageTransformOperation var1) {
      this.k7();
      ImageTransformOperation var2 = (ImageTransformOperation)var1;
      if (var2.getParent_IPresentationComponent() != null) {
         var2 = var2.k5();
      }

      var2.n5(this);
      var2.n5.l6(new ImageTransformOperationCollection$13(this));
      this.l6().n5(var2);
   }

   @Override
   public final void clear() {
      if (this.z3()) {
         List$Enumerator var1 = this.k5.iterator();

         try {
            while (var1.hasNext()) {
               ImageTransformOperation var2 = (ImageTransformOperation)var1.next();
               var2.n5.n5(new ImageTransformOperationCollection$14(this));
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
               var1.dispose();
            }
         }

         this.l6().n5();
         this.u3();
      }
   }

   public final boolean containsItem(IImageTransformOperation item) {
      return this.l6(item);
   }

   final boolean l6(IImageTransformOperation var1) {
      this.m3();
      return this.k5.containsItem(var1);
   }

   public final void copyToTArray(IImageTransformOperation[] array, int arrayIndex) {
      this.n5(array, arrayIndex);
   }

   final void n5(IImageTransformOperation[] var1, int var2) {
      this.m3();
      this.k5.copyToTArray(var1, var2);
   }

   public final boolean removeItem(IImageTransformOperation item) {
      return this.k5(item);
   }

   final boolean k5(IImageTransformOperation var1) {
      if (this.z3()) {
         ((ImageTransformOperation)var1).n5.n5(new ImageTransformOperationCollection$15(this));
         return this.l6().l6(var1);
      } else {
         return false;
      }
   }

   @Override
   public final IGenericEnumerator<IImageTransformOperation> iterator() {
      this.m3();
      return this.k5.iterator();
   }

   public final IGenericEnumerator<IImageTransformOperation> iteratorJava() {
      this.m3();
      return this.k5.iteratorJava();
   }

   final String n5(IBaseSlide var1, r0s var2) {
      if (!this.z3()) {
         com.aspose.slides.internal.l7h.a5 var9 = new com.aspose.slides.internal.l7h.a5();
         return var9.toString();
      }

      com.aspose.slides.internal.l7h.a5 var3 = new com.aspose.slides.internal.l7h.a5();
      List$Enumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            ImageTransformOperation var5 = (ImageTransformOperation)var4.next();
            var3.n5(var5.n5(var1, var2));
            var3.n5(';');
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      return var3.toString();
   }

   final com.aspose.slides.internal.o9b.t4 n5(IBaseSlide var1, com.aspose.slides.internal.o9b.l6 var2, com.aspose.slides.internal.j9e.x8 var3) {
      if (!this.z3()) {
         c0v var10 = c0v.n5(var2);
         var2.dispose();
         return var10.s7();
      }

      c0v var4 = c0v.n5(var2);
      var2.dispose();
      var4.n5(var3);
      List$Enumerator var5 = this.k5.iterator();

      try {
         while (var5.hasNext()) {
            ImageTransformOperation var6 = (ImageTransformOperation)var5.next();
            var4 = var6.n5(var4, var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      return var4.s7();
   }

   private void u3() {
      k6o var1 = this.l6;
      if (var1 != null && !this.n5.n5()) {
         var1.n5();
      }
   }

   // $VF: synthetic method
   static k6o n5(ImageTransformOperationCollection var0, k6o var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static void n5(ImageTransformOperationCollection var0) {
      var0.u3();
   }
}
