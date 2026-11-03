package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

public final class MathMatrix extends MathElementBase implements IMathMatrix, q8r {
   private boolean u3;
   private int a6;
   private long u9;
   private int h0;
   private long c8;
   private int t2;
   private long s7;
   private final List<List<IMathElement>> x8;
   private int[] n3;
   final s7u n5;

   @Override
   public final int getRowCount() {
      return this.x8.size();
   }

   @Override
   public final int getColumnCount() {
      return this.x8.get_Item(0).size();
   }

   @Override
   public final boolean getHidePlaceholders() {
      return this.u3;
   }

   @Override
   public final void setHidePlaceholders(boolean value) {
      this.u3 = value;
   }

   @Override
   public final int getBaseJustification() {
      return this.a6;
   }

   @Override
   public final void setBaseJustification(int value) {
      this.a6 = value;
   }

   @Override
   public final long getMinColumnWidth() {
      return this.u9;
   }

   @Override
   public final void setMinColumnWidth(long value) {
      this.u9 = value;
   }

   @Override
   public final int getColumnGapRule() {
      return this.h0;
   }

   @Override
   public final void setColumnGapRule(int value) {
      this.h0 = value;
   }

   @Override
   public final long getColumnGap() {
      return this.c8;
   }

   @Override
   public final void setColumnGap(long value) {
      this.c8 = value;
   }

   @Override
   public final int getRowGapRule() {
      return this.t2;
   }

   @Override
   public final void setRowGapRule(int value) {
      this.t2 = value;
   }

   @Override
   public final long getRowGap() {
      return this.s7;
   }

   @Override
   public final void setRowGap(long value) {
      this.s7 = value;
   }

   @Override
   public final IMathElement get_Item(int row, int column) {
      return this.x8.get_Item(row).get_Item(column);
   }

   @Override
   public final void set_Item(int row, int column, IMathElement value) {
      this.x8.get_Item(row).set_Item(column, value);
   }

   @Override
   public final s7u getControlCharacterProperties() {
      return this.n5;
   }

   public MathMatrix(int rowCount, int columnCount) {
      if (rowCount < 1) {
         throw new ArgumentOutOfRangeException("rowCount");
      }

      if (columnCount < 1) {
         throw new ArgumentOutOfRangeException("columnCount");
      }

      this.x8 = new List<>(rowCount);

      for (int var3 = 0; var3 < rowCount; var3++) {
         this.x8.addItem(this.n5(columnCount));
      }

      this.setHidePlaceholders(false);
      this.setBaseJustification(2);
      this.setMinColumnWidth(0L);
      this.setColumnGapRule(0);
      this.n3 = new int[columnCount];
      this.setColumnsAlignment(0, this.n3.length & 4294967295L, 2);
      this.n5 = new s7u();
   }

   @Override
   public final int getColumnAlignment(int columnIndex) {
      if (columnIndex < 0) {
         throw new ArgumentOutOfRangeException("columnIndex");
      } else if (columnIndex >= this.getColumnCount()) {
         throw new ArgumentOutOfRangeException("columnIndex");
      } else {
         return this.n3[columnIndex];
      }
   }

   @Override
   public final void setColumnAlignment(int columnIndex, int val) {
      this.setColumnsAlignment(columnIndex, 1L, val);
   }

   @Override
   public final void setColumnsAlignment(int columnIndex, long columnsCount, int val) {
      if (columnIndex >= 0 && columnIndex < this.getColumnCount()) {
         if ((columnsCount & 4294967295L) >= 0L && (columnIndex + (columnsCount & 4294967295L) & 4294967295L) <= this.getColumnCount()) {
            long var5 = columnIndex + (columnsCount & 4294967295L) & 4294967295L;

            for (int var7 = columnIndex; var7 < var5; var7++) {
               this.n3[var7] = val;
            }
         } else {
            throw new ArgumentOutOfRangeException("columnsCount");
         }
      } else {
         throw new ArgumentOutOfRangeException("columnIndex");
      }
   }

   @Override
   public final void insertRowBefore(int rowIndex) {
      this.x8.insertItem(rowIndex, this.n5(this.getColumnCount()));
   }

   @Override
   public final void insertRowAfter(int rowIndex) {
      this.insertRowBefore(rowIndex + 1);
   }

   @Override
   public final void deleteRow(int rowIndex) {
      if (this.getRowCount() == 1) {
         throw new InvalidOperationException("It is not allowed to delete the last existing row in the matrix");
      }

      this.x8.removeAt(rowIndex);
   }

   @Override
   public final void insertColumnBefore(int columnIndex) {
      List$Enumerator var2 = this.x8.iterator();

      try {
         while (var2.hasNext()) {
            List var3 = (List)var2.next();
            var3.insertItem(columnIndex, null);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   public final void insertColumnAfter(int columnIndex) {
      this.insertColumnBefore(columnIndex + 1);
   }

   @Override
   public final void deleteColumn(int columnIndex) {
      if (this.getColumnCount() == 1) {
         throw new InvalidOperationException("It is not allowed to delete the last existing column in the matrix");
      }

      List$Enumerator var2 = this.x8.iterator();

      try {
         while (var2.hasNext()) {
            List var3 = (List)var2.next();
            var3.removeAt(columnIndex);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   public final IMathElement[] getChildren() {
      int var1 = 0;
      List$Enumerator var2 = this.x8.iterator();

      try {
         while (var2.hasNext()) {
            List var3 = (List)var2.next();
            List$Enumerator var4 = var3.iterator();

            try {
               while (var4.hasNext()) {
                  IMathElement var5 = (IMathElement)var4.next();
                  if (var5 != null) {
                     var1++;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      if (var1 == 0) {
         return k5;
      }

      IMathElement[] var31 = new IMathElement[var1];
      var1 = 0;
      List$Enumerator var32 = this.x8.iterator();

      try {
         while (var32.hasNext()) {
            List var33 = (List)var32.next();
            List$Enumerator var6 = var33.iterator();

            try {
               while (var6.hasNext()) {
                  IMathElement var7 = (IMathElement)var6.next();
                  if (var7 != null) {
                     var31[var1++] = var7;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                  var6.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var32, IDisposable.class)) {
            var32.dispose();
         }
      }

      return var31;
   }

   @Override
   void n5(o5r var1) {
      var1.n5(this);
   }

   private List<IMathElement> n5(int var1) {
      List var2 = new List(var1);

      for (int var3 = 0; var3 < var1; var3++) {
         var2.addItem(null);
      }

      return var2;
   }
}
