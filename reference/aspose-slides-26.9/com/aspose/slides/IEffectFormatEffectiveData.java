package com.aspose.slides;

public interface IEffectFormatEffectiveData extends IEffectParamSource {
   boolean isNoEffects();

   IBlurEffectiveData getBlurEffect();

   IFillOverlayEffectiveData getFillOverlayEffect();

   IGlowEffectiveData getGlowEffect();

   IInnerShadowEffectiveData getInnerShadowEffect();

   IOuterShadowEffectiveData getOuterShadowEffect();

   IPresetShadowEffectiveData getPresetShadowEffect();

   IReflectionEffectiveData getReflectionEffect();

   ISoftEdgeEffectiveData getSoftEdgeEffect();
}
