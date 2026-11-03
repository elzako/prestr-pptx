package com.aspose.slides;

/** Embedded chart workbook access. Worksheet, row and column indices are zero-based. */
public interface IChartDataWorkbook {
   void calculateFormulas();

   IChartCellCollection getCellCollection(String formula, boolean skipHiddenCells);

   IChartDataCell getCell(String worksheetName, int row, int column);

   IChartDataCell getCell(int worksheetIndex, int row, int column);

   IChartDataCell getCell(int worksheetIndex, String cellName);

   IChartDataCell getCell(int worksheetIndex, String cellName, Object value);

   IChartDataCell getCell(int worksheetIndex, int row, int column, Object value);

   void clear(int worksheetIndex);

   IChartDataWorksheetCollection getWorksheets();
}
