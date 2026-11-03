package com.aspose.slides;

public interface IImageTransformOperationFactory {
   IAlphaBiLevel createAlphaBiLevel(float var1);

   IAlphaCeiling createAlphCeiling();

   IAlphaFloor createAlphaFloor();

   IAlphaInverse createAlphaInverse();

   IAlphaModulate createAlphaModulate();

   IAlphaModulateFixed createAlphaModulateFixed(float var1);

   IAlphaReplace createAlphaReplace(float var1);

   IBiLevel createBiLevel(float var1);

   IBlur createBlur(double var1, boolean var3);

   IColorChange createColorChange();

   IColorReplace createColorReplace();

   IDuotone createDuotone();

   IFillOverlay createFillOverlay();

   IGrayScale createGrayScale();

   IHSL createHSL(float var1, float var2, float var3);

   ILuminance createLuminance(float var1, float var2);

   ITint createTint(float var1, float var2);
}
