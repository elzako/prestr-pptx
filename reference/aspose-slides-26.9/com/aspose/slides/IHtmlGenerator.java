package com.aspose.slides;

import java.awt.geom.Dimension2D;

public interface IHtmlGenerator {
   void addHtml(String var1);

   void addHtml(char[] var1);

   void addHtml(char[] var1, int var2, int var3);

   void addText(String var1);

   void addText(char[] var1);

   void addText(char[] var1, int var2, int var3);

   void addAttributeValue(String var1);

   void addAttributeValue(char[] var1);

   void addAttributeValue(char[] var1, int var2, int var3);

   Dimension2D getSlideImageSize();

   int getSlideImageSizeUnit();

   String getSlideImageSizeUnitCode();

   int getPreviousSlideIndex();

   int getSlideIndex();

   int getNextSlideIndex();
}
