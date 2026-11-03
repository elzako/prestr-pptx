package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericList;

public interface IHyperlinkQueries {
   IGenericList<IHyperlinkContainer> getHyperlinkClicks();

   IGenericList<IHyperlinkContainer> getHyperlinkMouseOvers();

   IGenericList<IHyperlinkContainer> getAnyHyperlinks();

   void removeAllHyperlinks();
}
