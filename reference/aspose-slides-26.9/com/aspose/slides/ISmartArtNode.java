package com.aspose.slides;

public interface ISmartArtNode {
   ISmartArtNodeCollection getChildNodes();

   ISmartArtShapeCollection getShapes();

   ITextFrame getTextFrame();

   boolean isAssistant();

   void setAssistant(boolean var1);

   int getLevel();

   IFillFormat getBulletFillFormat();

   int getPosition();

   void setPosition(int var1);

   boolean isHidden();

   int getOrganizationChartLayout();

   void setOrganizationChartLayout(int var1);

   boolean remove();
}
