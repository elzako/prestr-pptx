package com.aspose.slides;

public final class HyperlinkManager implements IHyperlinkManager, r0g {
   private IHyperlinkContainer n5;

   @Override
   public final IHyperlink setExternalHyperlinkClick(String url) {
      Hyperlink var2 = new Hyperlink(url);
      this.n5().setHyperlinkClick(var2);
      IParagraph var3 = null;
      IParagraph[] var4 = new IParagraph[]{var3};
      boolean var5 = d0u.n5(IParagraph.class, (r0g)this.n5, var4);
      var3 = var4[0];
      if (var5) {
         ((Paragraph)var3).c8();
      }

      return var2;
   }

   @Override
   public final IHyperlink setInternalHyperlinkClick(ISlide targetSlide) {
      Hyperlink var2 = new Hyperlink(targetSlide);
      this.n5().setHyperlinkClick(var2);
      return var2;
   }

   @Override
   public final void removeHyperlinkClick() {
      this.n5().setHyperlinkClick(null);
   }

   @Override
   public final IHyperlink setExternalHyperlinkMouseOver(String url) {
      Hyperlink var2 = new Hyperlink(url);
      this.n5().setHyperlinkMouseOver(var2);
      return var2;
   }

   @Override
   public final IHyperlink setInternalHyperlinkMouseOver(ISlide targetSlide) {
      Hyperlink var2 = new Hyperlink(targetSlide);
      this.n5().setHyperlinkMouseOver(var2);
      return var2;
   }

   @Override
   public final void removeHyperlinkMouseOver() {
      this.n5().setHyperlinkMouseOver(null);
   }

   @Override
   public final IHyperlink setMacroHyperlinkClick(String macroName) {
      String var2 = com.aspose.slides.ms.System.d1.n5("{0}{1}",new Object[]{ "ppaction://macro?name=", macroName});
      Hyperlink var3 = new Hyperlink(var2);
      var3.n5(var2);
      this.n5().setHyperlinkClick(var3);
      return var3;
   }

   HyperlinkManager(IHyperlinkContainer parentImmediate) {
      this.n5 = parentImmediate;
   }

   @Override
   public final r0g getParent_Immediate() {
      return (r0g)this.n5;
   }

   final IHyperlinkContainer n5() {
      return this.n5;
   }
}
