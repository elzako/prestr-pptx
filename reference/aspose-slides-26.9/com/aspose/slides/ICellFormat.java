package com.aspose.slides;

public interface ICellFormat {
   IFillFormat getFillFormat();

   ILineFormat getBorderLeft();

   ILineFormat getBorderTop();

   ILineFormat getBorderRight();

   ILineFormat getBorderBottom();

   ILineFormat getBorderDiagonalDown();

   ILineFormat getBorderDiagonalUp();

   float getTransparency();

   void setTransparency(float var1);

   ICellFormatEffectiveData getEffective();
}
