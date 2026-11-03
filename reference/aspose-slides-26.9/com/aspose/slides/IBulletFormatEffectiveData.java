package com.aspose.slides;

public interface IBulletFormatEffectiveData {
   byte getType();

   char getChar();

   String getActualBulletValue();

   IFontData getFont();

   float getHeight();

   short getNumberedBulletStartWith();

   byte getNumberedBulletStyle();

   boolean isBulletHardColor();

   boolean isBulletHardFont();

   @Deprecated
   IPictureEffectiveData getPicture();

   IFillFormatEffectiveData getFillFormat();
}
