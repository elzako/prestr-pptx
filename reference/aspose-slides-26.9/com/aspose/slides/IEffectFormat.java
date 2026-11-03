package com.aspose.slides;

public interface IEffectFormat extends IEffectParamSource {
   boolean isNoEffects();

   IBlur getBlurEffect();

   void setBlurEffect(IBlur var1);

   IFillOverlay getFillOverlayEffect();

   void setFillOverlayEffect(IFillOverlay var1);

   IGlow getGlowEffect();

   void setGlowEffect(IGlow var1);

   IInnerShadow getInnerShadowEffect();

   void setInnerShadowEffect(IInnerShadow var1);

   IOuterShadow getOuterShadowEffect();

   void setOuterShadowEffect(IOuterShadow var1);

   IPresetShadow getPresetShadowEffect();

   void setPresetShadowEffect(IPresetShadow var1);

   IReflection getReflectionEffect();

   void setReflectionEffect(IReflection var1);

   ISoftEdge getSoftEdgeEffect();

   void setSoftEdgeEffect(ISoftEdge var1);

   void setBlurEffect(double var1, boolean var3);

   void enableFillOverlayEffect();

   void enableGlowEffect();

   void enableInnerShadowEffect();

   void enableOuterShadowEffect();

   void enablePresetShadowEffect();

   void enableReflectionEffect();

   void enableSoftEdgeEffect();

   void disableBlurEffect();

   void disableFillOverlayEffect();

   void disableGlowEffect();

   void disableInnerShadowEffect();

   void disableOuterShadowEffect();

   void disablePresetShadowEffect();

   void disableReflectionEffect();

   void disableSoftEdgeEffect();

   IEffectFormatEffectiveData getEffective();
}
