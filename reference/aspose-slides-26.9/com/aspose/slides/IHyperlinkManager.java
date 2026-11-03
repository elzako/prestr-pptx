package com.aspose.slides;

public interface IHyperlinkManager {
   IHyperlink setExternalHyperlinkClick(String var1);

   IHyperlink setInternalHyperlinkClick(ISlide var1);

   void removeHyperlinkClick();

   IHyperlink setExternalHyperlinkMouseOver(String var1);

   IHyperlink setInternalHyperlinkMouseOver(ISlide var1);

   void removeHyperlinkMouseOver();

   IHyperlink setMacroHyperlinkClick(String var1);
}
