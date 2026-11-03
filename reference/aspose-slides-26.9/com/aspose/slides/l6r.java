package com.aspose.slides;

class l6r extends a8m<IHyperlink, l6r> {
   public static final l6r n5 = new l6r();

   protected boolean n5(IHyperlink var1, IHyperlink var2) {
      return var1.getActionType() == var2.getActionType()
         && com.aspose.slides.ms.System.d1.a6(((Hyperlink)var1).getExternalUrlOriginal(), ((Hyperlink)var2).getExternalUrlOriginal())
         && com.aspose.slides.ms.System.j8.l6(var1.getTargetSlide(), var2.getTargetSlide())
         && com.aspose.slides.ms.System.d1.a6(var1.getTargetFrame(), var2.getTargetFrame())
         && com.aspose.slides.ms.System.d1.a6(var1.getTooltip(), var2.getTooltip())
         && var1.getHistory() == var2.getHistory()
         && var1.getHighlightClick() == var2.getHighlightClick()
         && var1.getStopSoundOnClick() == var2.getStopSoundOnClick();
   }

   protected int n5(IHyperlink var1) {
      int var2 = -324743029 + com.aspose.slides.ms.System.s3.n5(var1.getActionType());
      var2 = var2 * 486187739 + k5(((Hyperlink)var1).getExternalUrlOriginal());
      var2 = var2 * 486187739 + k5(var1.getTargetSlide());
      var2 = var2 * 486187739 + k5(var1.getTargetFrame());
      var2 = var2 * 486187739 + k5(var1.getTooltip());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.n3.n5(var1.getHistory());
      var2 = var2 * 486187739 + com.aspose.slides.ms.System.n3.n5(var1.getHighlightClick());
      return var2 * 486187739 + com.aspose.slides.ms.System.n3.n5(var1.getStopSoundOnClick());
   }
}
