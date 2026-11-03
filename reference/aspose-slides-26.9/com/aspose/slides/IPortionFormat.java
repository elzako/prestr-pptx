package com.aspose.slides;

public interface IPortionFormat extends IBasePortionFormat, IHyperlinkContainer {
   String getBookmarkId();

   void setBookmarkId(String var1);

   boolean getSmartTagClean();

   void setSmartTagClean(boolean var1);

   IPortionFormatEffectiveData getEffective();
}
