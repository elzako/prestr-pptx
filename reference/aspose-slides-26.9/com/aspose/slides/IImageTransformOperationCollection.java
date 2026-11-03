package com.aspose.slides;

public interface IImageTransformOperationCollection extends com.aspose.slides.Collections.Generic.IGenericCollection<IImageTransformOperation> {
   IImageTransformOperation get_Item(int var1);

   void removeAt(int var1);

   IAlphaBiLevel addAlphaBiLevelEffect(float var1);

   IAlphaCeiling addAlphaCeilingEffect();

   IAlphaFloor addAlphaFloorEffect();

   IAlphaInverse addAlphaInverseEffect();

   IAlphaModulate addAlphaModulateEffect();

   IAlphaModulateFixed addAlphaModulateFixedEffect(float var1);

   IAlphaReplace addAlphaReplaceEffect(float var1);

   IBiLevel addBiLevelEffect(float var1);

   IBlur addBlurEffect(double var1, boolean var3);

   IColorChange addColorChangeEffect();

   IColorReplace addColorReplaceEffect();

   IDuotone addDuotoneEffect();

   IFillOverlay addFillOverlayEffect();

   IGrayScale addGrayScaleEffect();

   IHSL addHSLEffect(float var1, float var2, float var3);

   ILuminance addLuminanceEffect(float var1, float var2);

   ITint addTintEffect(float var1, float var2);

   IBrightnessContrast addBrightnessContrastEffect(float var1, float var2);
}
