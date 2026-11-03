package com.aspose.slides;

public interface IChartTextFormat {
   IChartTextBlockFormat getTextBlockFormat();

   IChartParagraphFormat getParagraphFormat();

   IChartPortionFormat getPortionFormat();

   void copyTo(ITextFrame var1);

   void copyFrom(ITextFrame var1);
}
