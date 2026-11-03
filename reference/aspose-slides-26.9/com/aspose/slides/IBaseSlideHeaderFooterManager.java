package com.aspose.slides;

public interface IBaseSlideHeaderFooterManager extends IBaseHeaderFooterManager {
   boolean isFooterVisible();

   boolean isSlideNumberVisible();

   boolean isDateTimeVisible();

   void setFooterVisibility(boolean var1);

   void setSlideNumberVisibility(boolean var1);

   void setDateTimeVisibility(boolean var1);

   void setFooterText(String var1);

   void setDateTimeText(String var1);
}
