package com.aspose.slides;

public interface IChartDataCell {
   int getRow();

   int getColumn();

   Object getValue();

   void setValue(Object var1);

   String getFormula();

   void setFormula(String var1);

   String getR1C1Formula();

   void setR1C1Formula(String var1);

   IChartDataWorksheet getChartDataWorksheet();

   boolean isHidden();

   String getCustomNumberFormat();

   void setCustomNumberFormat(String var1);

   byte getPresetNumberFormat();

   void setPresetNumberFormat(byte var1);

   void calculate(boolean var1);
}
