package com.aspose.slides;

public interface ISmartArt extends IGraphicalObject {
   ISmartArtNodeCollection getAllNodes();

   ISmartArtNodeCollection getNodes();

   int getLayout();

   void setLayout(int var1);

   int getQuickStyle();

   void setQuickStyle(int var1);

   int getColorStyle();

   void setColorStyle(int var1);

   boolean isReversed();

   void setReversed(boolean var1);
}
