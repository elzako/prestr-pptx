package com.aspose.slides;

public interface IBulletFormat {
   byte getType();

   void setType(byte var1);

   char getChar();

   void setChar(char var1);

   IFontData getFont();

   void setFont(IFontData var1);

   float getHeight();

   void setHeight(float var1);

   IColorFormat getColor();

   ISlidesPicture getPicture();

   short getNumberedBulletStartWith();

   void setNumberedBulletStartWith(short var1);

   byte getNumberedBulletStyle();

   void setNumberedBulletStyle(byte var1);

   byte isBulletHardColor();

   void setBulletHardColor(byte var1);

   byte isBulletHardFont();

   void setBulletHardFont(byte var1);

   void applyDefaultParagraphIndentsShifts();

   IBulletFormatEffectiveData getEffective();
}
