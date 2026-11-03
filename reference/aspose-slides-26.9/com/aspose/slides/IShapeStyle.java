package com.aspose.slides;

public interface IShapeStyle {
   IColorFormat getLineColor();

   int getLineStyleIndex();

   void setLineStyleIndex(int var1);

   IColorFormat getFillColor();

   short getFillStyleIndex();

   void setFillStyleIndex(short var1);

   IColorFormat getEffectColor();

   long getEffectStyleIndex();

   void setEffectStyleIndex(long var1);

   IColorFormat getFontColor();

   byte getFontCollectionIndex();

   void setFontCollectionIndex(byte var1);
}
