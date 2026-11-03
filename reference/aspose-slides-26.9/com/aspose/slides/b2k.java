package com.aspose.slides;

class b2k extends a8m<IPresetShadow, b2k> {
   public static final b2k n5 = new b2k();

   protected boolean n5(IPresetShadow var1, IPresetShadow var2) {
      return com.aspose.slides.internal.n8e.v4.n5(var1.getDirection(), var2.getDirection())
         && com.aspose.slides.internal.n8e.v4.n5(var1.getDistance(), var2.getDistance())
         && var1.getPreset() == var2.getPreset()
         && s5r.n5.equals(var1.getShadowColor(), var2.getShadowColor());
   }

   protected int n5(IPresetShadow var1) {
      int var2 = -324743029 + com.aspose.slides.ms.System.n1.n5(var1.getDirection());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.d2.n5(var1.getDistance());
      var2 = var2 * 486187739 + s5r.n5.l6(var1.getShadowColor());
      return var2 * 486187739 + com.aspose.slides.ms.System.s3.n5(var1.getPreset());
   }
}
