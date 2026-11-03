package com.aspose.slides;

public interface IParagraphFormatEffectiveData {
   IBulletFormatEffectiveData getBullet();

   short getDepth();

   int getAlignment();

   float getSpaceWithin();

   float getSpaceBefore();

   float getSpaceAfter();

   boolean getEastAsianLineBreak();

   boolean getRightToLeft();

   boolean getLatinLineBreak();

   boolean getHangingPunctuation();

   float getMarginLeft();

   float getMarginRight();

   float getIndent();

   float getDefaultTabSize();

   ITabEffectiveData[] getTabs();

   int getFontAlignment();

   IPortionFormatEffectiveData getDefaultPortionFormat();
}
