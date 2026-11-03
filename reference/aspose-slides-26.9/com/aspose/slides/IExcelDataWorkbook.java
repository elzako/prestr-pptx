package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

public interface IExcelDataWorkbook {
   List<IExcelDataCell> getCells(String var1, boolean var2);

   IExcelDataCell getCell(int var1, int var2, int var3);

   IExcelDataCell getCell(String var1, int var2, int var3);

   IExcelDataCell getCell(int var1, String var2);

   IExcelDataCell getCell(String var1, String var2);

   Dictionary<Integer, String> getChartsFromWorksheet(String var1);

   List<String> getWorksheetNames();
}
