package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.FileNotFoundException;
import com.aspose.slides.ms.System.IDisposable;
import java.io.InputStream;

public class ExcelDataWorkbook implements IExcelDataWorkbook {
   private final IChartDataWorkbook n5;

   public ExcelDataWorkbook(String filePath) {
      if (!com.aspose.slides.internal.z0k.u9.k5(filePath)) {
         throw new FileNotFoundException("File not found");
      }

      com.aspose.slides.internal.z0k.n3 var2 = new com.aspose.slides.internal.z0k.n3(filePath, 3);

      try {
         this.n5 = new ChartDataWorkbook(null, var2, com.aspose.slides.internal.q7.l6.n5, InterruptionToken.getNone(), false);
      } finally {
         var2.dispose();
      }
   }

   public ExcelDataWorkbook(InputStream stream) {
      this(com.aspose.slides.internal.z0k.t4.fromJava(stream));
   }

   ExcelDataWorkbook(com.aspose.slides.internal.z0k.t4 stream) {
      if (stream == null) {
         throw new ArgumentNullException("stream", "Stream cannot be null.");
      }

      stream.seek(0L, 0);
      this.n5 = new ChartDataWorkbook(null, stream, com.aspose.slides.internal.q7.l6.n5, InterruptionToken.getNone(), false);
   }

   @Override
   public final List<IExcelDataCell> getCells(String formula, boolean skipHiddenCells) {
      if (com.aspose.slides.ms.System.d1.n5(formula)) {
         throw new ArgumentException("Formula cannot be null, empty, or whitespace.", "formula");
      }

      List var3 = com.aspose.slides.internal.v6g.k5.n5(this.n5, ChartDataWorkbook.class).n5(formula, skipHiddenCells, false);
      List var4 = new List();
      List$Enumerator var5 = var3.iterator();

      try {
         while (var5.hasNext()) {
            ChartDataCell var6 = (ChartDataCell)var5.next();
            var4.addItem(new ExcelDataCell(var6));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      return var4;
   }

   @Override
   public final IExcelDataCell getCell(int worksheetIndex, int row, int column) {
      return new ExcelDataCell(this.n5.getCell(worksheetIndex, row, column));
   }

   @Override
   public final IExcelDataCell getCell(String worksheetName, int row, int column) {
      return new ExcelDataCell(this.n5.getCell(worksheetName, row, column));
   }

   @Override
   public final IExcelDataCell getCell(int worksheetIndex, String cellName) {
      return new ExcelDataCell(this.n5.getCell(worksheetIndex, cellName));
   }

   @Override
   public final IExcelDataCell getCell(String worksheetName, String cellName) {
      return new ExcelDataCell(com.aspose.slides.internal.v6g.k5.n5(this.n5, ChartDataWorkbook.class).n5(worksheetName, cellName));
   }

   @Override
   public final Dictionary<Integer, String> getChartsFromWorksheet(String worksheetName) {
      return ExcelWorkbookImporter.n5(this.n5, worksheetName);
   }

   @Override
   public final List<String> getWorksheetNames() {
      List var1 = new List();
      IGenericEnumerator var2 = this.n5.getWorksheets().iterator();

      try {
         while (var2.hasNext()) {
            IChartDataWorksheet var3 = (IChartDataWorksheet)var2.next();
            var1.addItem(var3.getName());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   final IChartDataWorkbook n5() {
      return this.n5;
   }
}
