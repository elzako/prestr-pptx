package com.aspose.slides;

public interface IBackground extends IFillParamSource, ISlideComponent {
   byte getType();

   void setType(byte var1);

   IFillFormat getFillFormat();

   IEffectFormat getEffectFormat();

   IColorFormat getStyleColor();

   int getStyleIndex();

   void setStyleIndex(int var1);

   IBackgroundEffectiveData getEffective();
}
