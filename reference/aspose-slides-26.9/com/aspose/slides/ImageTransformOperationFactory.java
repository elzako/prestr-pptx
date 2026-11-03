package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;

public class ImageTransformOperationFactory implements IImageTransformOperationFactory {
   @Override
   public final IAlphaBiLevel createAlphaBiLevel(float threshold) {
      return new AlphaBiLevel(threshold, null);
   }

   @Override
   public final IAlphaCeiling createAlphCeiling() {
      return new AlphaCeiling(null);
   }

   @Override
   public final IAlphaFloor createAlphaFloor() {
      return new AlphaFloor(null);
   }

   @Override
   public final IAlphaInverse createAlphaInverse() {
      return new AlphaInverse(null);
   }

   @Override
   public final IAlphaModulate createAlphaModulate() {
      return new AlphaModulate(null);
   }

   @Override
   public final IAlphaModulateFixed createAlphaModulateFixed(float amount) {
      return new AlphaModulateFixed(amount, null);
   }

   @Override
   public final IAlphaReplace createAlphaReplace(float alpha) {
      return new AlphaReplace(alpha, null);
   }

   @Override
   public final IBiLevel createBiLevel(float threshold) {
      return new BiLevel(threshold, null);
   }

   @Override
   public final IBlur createBlur(double radius, boolean grow) {
      return new Blur(radius, grow, null);
   }

   @Override
   public final IColorChange createColorChange() {
      return new ColorChange(null);
   }

   @Override
   public final IColorReplace createColorReplace() {
      return new ColorReplace(null);
   }

   @Override
   public final IDuotone createDuotone() {
      return new Duotone(null);
   }

   @Override
   public final IFillOverlay createFillOverlay() {
      return new FillOverlay(null);
   }

   @Override
   public final IGrayScale createGrayScale() {
      return new GrayScale(null);
   }

   @Override
   public final IHSL createHSL(float hue, float saturation, float luminance) {
      return new HSL(hue, saturation, luminance, null);
   }

   @Override
   public final ILuminance createLuminance(float brightness, float contrast) {
      return new Luminance(brightness, contrast, null);
   }

   @Override
   public final ITint createTint(float hue, float amount) {
      return new Tint(hue, amount, null);
   }

   final IImageTransformOperation n5(IEffectEffectiveData var1) {
      IImageTransformOperation var2 = null;
      if (com.aspose.slides.internal.v6g.k5.l6(var1, p8.class)) {
         p8 var3 = (p8)var1;
         var2 = new AlphaBiLevel(var3.getThreshold(), null);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, f2.class)) {
         var2 = new AlphaCeiling(null);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, i1.class)) {
         var2 = new AlphaFloor(null);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, e5.class)) {
         var2 = new AlphaInverse(null);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, o0.class)) {
         o0 var5 = (o0)var1;
         var2 = new AlphaModulateFixed(var5.getAmount(), null);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, z7.class)) {
         z7 var6 = (z7)var1;
         var2 = new AlphaReplace(var6.getAlpha(), null);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, b6.class)) {
         b6 var7 = (b6)var1;
         var2 = new BiLevel(var7.getThreshold(), null);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, r3.class)) {
         r3 var8 = (r3)var1;
         var2 = new Blur(var8.getRadius(), var8.getGrow(), null);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, k5w.class)) {
         k5w var9 = (k5w)var1;
         var2 = new ColorChange(var9.n5.n5, var9.l6.n5, var9.getUseAlpha(), null);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, v7o.class)) {
         v7o var10 = (v7o)var1;
         var2 = new ColorReplace(var10.n5.n5, null);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, b5j.class)) {
         b5j var11 = (b5j)var1;
         var2 = new Duotone(var11.n5.n5, var11.l6.n5, null);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, t7d.class)) {
         var2 = new FillOverlay(null);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, z8t.class)) {
         var2 = new GrayScale(null);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, n0g.class)) {
         n0g var12 = (n0g)var1;
         var2 = new HSL(var12.getHue(), var12.getSaturation(), var12.getLuminance(), null);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, t9v.class)) {
         t9v var13 = (t9v)var1;
         var2 = new Luminance(var13.getBrightness(), var13.getContrast(), null);
      } else {
         if (!com.aspose.slides.internal.v6g.k5.l6(var1, m0r.class)) {
            throw new NotImplementedException(
               com.aspose.slides.ms.System.d1.n5(new String[]{"Creating operation from ", com.aspose.slides.ms.System.j8.n5(var1).s7(), " is not implemented"})
            );
         }

         m0r var14 = (m0r)var1;
         var2 = new Tint(var14.getHue(), var14.getAmount(), null);
      }

      return var2;
   }
}
