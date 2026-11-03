package com.aspose.slides;

public interface IViewProperties {
   int getLastView();

   void setLastView(int var1);

   byte getShowComments();

   void setShowComments(byte var1);

   ICommonSlideViewProperties getSlideViewProperties();

   ICommonSlideViewProperties getNotesViewProperties();

   INormalViewProperties getNormalViewProperties();

   float getGridSpacing();

   void setGridSpacing(float var1);
}
