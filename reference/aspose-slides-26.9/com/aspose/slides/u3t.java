package com.aspose.slides;

class u3t extends a8m<IEffectFormat, u3t> {
   public static final u3t n5 = new u3t();

   protected boolean n5(IEffectFormat var1, IEffectFormat var2) {
      return var1.isNoEffects() == var2.isNoEffects()
         && q8.n5.equals(var1.getBlurEffect(), var2.getBlurEffect())
         && f1i.n5.equals(var1.getFillOverlayEffect(), var2.getFillOverlayEffect())
         && r7g.n5.equals(var1.getGlowEffect(), var2.getGlowEffect())
         && f2d.n5.equals(var1.getInnerShadowEffect(), var2.getInnerShadowEffect())
         && f2w.n5.equals(var1.getOuterShadowEffect(), var2.getOuterShadowEffect())
         && b2k.n5.equals(var1.getPresetShadowEffect(), var2.getPresetShadowEffect())
         && k4f.n5.equals(var1.getReflectionEffect(), var2.getReflectionEffect())
         && u4o.n5.equals(var1.getSoftEdgeEffect(), var2.getSoftEdgeEffect());
   }

   protected int n5(IEffectFormat var1) {
      int var2 = -324743029 + com.aspose.slides.ms.System.n3.n5(var1.isNoEffects());
      var2 = var2 * 486187739 + q8.n5.l6(var1.getBlurEffect());
      var2 = var2 * 486187739 + f1i.n5.l6(var1.getFillOverlayEffect());
      var2 = var2 * 486187739 + r7g.n5.l6(var1.getGlowEffect());
      var2 = var2 * 486187739 + f2d.n5.l6(var1.getInnerShadowEffect());
      var2 = var2 * 486187739 + f2w.n5.l6(var1.getOuterShadowEffect());
      var2 = var2 * 486187739 + b2k.n5.l6(var1.getPresetShadowEffect());
      var2 = var2 * 486187739 + k4f.n5.l6(var1.getReflectionEffect());
      return var2 * 486187739 + u4o.n5.l6(var1.getSoftEdgeEffect());
   }
}
