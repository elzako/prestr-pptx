package com.aspose.slides;

public interface IEffectFactory {
   IGlow createGlow();

   IInnerShadow createInnerShadow();

   IOuterShadow createOuterShadow();

   IPresetShadow createPresetShadow();

   IReflection createReflection();

   ISoftEdge createSoftEdge();

   IImageTransformOperationFactory getImageTransformOperationFactory();
}
