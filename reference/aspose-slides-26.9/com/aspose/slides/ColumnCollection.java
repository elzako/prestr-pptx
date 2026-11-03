package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.ms.System.IDisposable;

public final class ColumnCollection extends DomObject<RowCollection> implements IColumnCollection {
   private final List<IColumn> n5 = new List<>();
   private boolean l6 = true;
   private boolean k5 = true;
   private double u3 = 0.0;

   ColumnCollection(RowCollection parentImmediate) {
      super(parentImmediate);
   }

   final Table n5() {
      return this.u9.n5();
   }

   final RowCollection l6() {
      return this.u9;
   }

   final double k5() {
      this.h0();
      return this.u3;
   }

   @Override
   public final int size() {
      return this.n5.size();
   }

   @Override
   public final IColumn get_Item(int index) {
      if (index >= 0 && index <= this.size() - 1) {
         return this.n5.get_Item(index);
      } else {
         throw new IndexOutOfRangeException(com.aspose.slides.ms.System.d1.n5("value of index = {0} is out of range 0..{1}",new Object[]{ index, this.size() - 1}));
      }
   }

   final Column n5(int var1) {
      return (Column)this.n5.get_Item(var1);
   }

   final void n5(double var1) {
      this.n5(-1, var1);
   }

   final Column n5(int var1, double var2) {
      Column var4 = new Column(this, var2);
      int var5 = this.u9.size();
      int var6 = -1;
      if (var1 >= 0 && var1 < this.size()) {
         this.n5.insertItem(var1, var4);
         var4.l6 = var1;
         this.l6 = false;
         var6 = var1;
      } else {
         var4.l6 = this.n5.size();
         this.n5.addItem(var4);
      }

      this.k5 = false;

      for (int var7 = 0; var7 < var5; var7++) {
         this.u9.n5(var7).n5(var6, 1);
      }

      return var4;
   }

   @Override
   public final IColumn[] addClone(IColumn templ, boolean withAttachedColumns) {
      int var3 = this.size();
      return this.insertClone(var3, templ, withAttachedColumns);
   }

   @Override
   public final IColumn[] insertClone(int index, IColumn templ, boolean withAttachedColumns) {
      Column var4 = (Column)templ;
      Table var5 = var4.n5();
      if (this.n5() != var5) {
         throw new PptxEditException("Clonning columns between different tables isn't supported.");
      }

      if (index >= 0 && index <= this.size()) {
         if (this.n5(index, true)) {
            throw new PptxEditException("Can't insert columns: target index breaks merged cells.");
         }

         Column[] var6 = new Column[0];
         if (withAttachedColumns) {
            var6 = var4.u9().k5(var4.h0());
         } else {
            if (this.l6(var4.h0(), true)) {
               throw new PptxEditException("Some of row's cells lay outside column.");
            }

            var6 = new Column[]{var4};
         }

         IColumn[] var7 = new IColumn[var6.length];
         int var8 = var6.length;

         while (var8 > 0) {
            var4 = var6[--var8];
            Column var9 = this.n5(index, var4.getWidth());
            this.u9();
            var7[var8] = var9;
            int var10 = this.u9.size();

            while (var10 > 0) {
               Cell var11 = var4.n5(--var10);
               Cell var12 = var9.n5(var10);
               var12.n5(var11);
               var12.l6 = var11.l6;
               var12.n5 = var11.n5;
               if (var12.h0()) {
                  var9.l6 = index;
                  this.l6 = true;
                  var12.l6(false);
               }
            }
         }

         this.l6 = false;
         return var7;
      } else {
         throw new ArgumentOutOfRangeException("index", index, "Wrong index of column");
      }
   }

   final void l6(int var1, double var2) {
      Column var4 = this.n5(var1);
      if (!(var2 <= 0.0) && !(var2 >= var4.getWidth())) {
         Column var5 = this.n5(var1 + 1, var4.getWidth() - var2);
         var4.setWidth(var2);
         int var6 = this.u9.size();
         int var7 = 0;

         while (var7 < var6) {
            Cell var8 = var4.n5(var7);
            if (var8.c8()) {
               var8 = var8.a6();
            }

            var8.l6++;

            for (int var9 = var8.getRowSpan(); var9 > 0; var7++) {
               var9--;
               var5.n5(var7).k5 = var8;
            }
         }
      } else {
         throw new ArgumentOutOfRangeException("Splitting width must be in greater than 0 and less than cell's width");
      }
   }

   final void u3() {
      this.l6(0, this.size());
      this.l6 = true;
      this.k5 = true;
      this.u3 = 0.0;
   }

   @Override
   public final void removeAt(int firstColumnIndex, boolean withAttachedRows) {
      int var3 = this.size();
      if (withAttachedRows) {
         com.aspose.slides.internal.o9b.p8 var4 = this.l6(firstColumnIndex).u3();
         this.l6(var4.l6(), var4.k5());
      } else {
         int var8 = this.u9.size();
         Column var5 = this.n5(firstColumnIndex);

         for (int var6 = 0; var6 < var8; var6++) {
            ICell var7 = var5.get_Item(var6);
            if (var7.getColSpan() > 1) {
               throw new PptxEditException("Some of column's cells lay outside column.");
            }
         }

         this.l6(firstColumnIndex, 1);
      }

      if (var3 != this.size() && this.size() > 0) {
         this.u9.u3();
      }
   }

   private void l6(int var1, int var2) {
      if (var2 != 0) {
         if (var1 + var2 < this.size()) {
            this.l6 = false;
         }

         this.k5 = false;
         int var3 = this.u9.size();

         while (var3 > 0) {
            Row var4 = this.u9.n5(--var3);
            var4.l6(var1, var2);
         }

         if (var1 == 0 && var2 == this.size()) {
            this.n5.clear();
         } else {
            this.n5.removeRange(var1, var2);
         }
      }
   }

   final void a6() {
      this.n5(0, this.size());
   }

   final void n5(int var1, int var2) {
      boolean var3 = this.k5;
      int var4 = var1 + var2;
      int var5 = this.u9.size();

      while (var4 > var1) {
         Column var6 = this.n5(--var4);
         boolean var7 = true;

         for (int var8 = 0; var8 < var5; var8++) {
            if (!var6.n5(var8).c8()) {
               var7 = false;
               break;
            }
         }

         if (var7) {
            if (var4 > 0) {
               Column var10 = this.n5(var4 - 1);
               var10.setWidth(var10.getWidth() + var6.getWidth());
            }

            int var11 = 0;

            while (var11 < var5) {
               Cell var9 = var6.n5(var11).a6();
               var9.l6--;
               var11 += var9.getRowSpan();
            }

            this.l6(var4, 1);
         }
      }

      this.k5 = var3;
   }

   private com.aspose.slides.internal.o9b.p8 l6(int var1) {
      int var2 = this.u9.size();
      int var3 = var1;
      Column var4 = this.n5(var3);
      int var5 = 0;
      if (var1 > 0) {
         while (var5 < var2) {
            Cell var6 = var4.n5(var5);
            if (var6.getFirstColumnIndex() < var3) {
               var3 = var6.getFirstColumnIndex();
               var4 = this.n5(var3);
               var5 = 0;
            }

            var5 += var6.getRowSpan();
         }
      }

      int var10 = var1 + 1;
      if (var10 < this.size()) {
         var4 = this.n5(var1);
         var5 = 0;

         while (var5 < var2) {
            Cell var7 = var4.n5(var5).a6();
            if (var7.getFirstColumnIndex() + var7.getColSpan() > var10) {
               var10 = var7.getFirstColumnIndex() + var7.getColSpan();
               var4 = this.n5(var10 - 1);
               var5 = 0;
            }

            var5 += var7.getRowSpan();
         }
      }

      return new com.aspose.slides.internal.o9b.p8(var3, var10 - var3);
   }

   private Column[] k5(int var1) {
      com.aspose.slides.internal.o9b.p8 var2 = this.l6(var1).u3();
      Column[] var3 = new Column[var2.k5()];

      for (int var4 = 0; var4 < var3.length; var4++) {
         var3[var4] = this.n5(var2.l6() + var4);
      }

      return var3;
   }

   final void u9() {
      if (!this.l6) {
         int var1 = 0;

         while (var1 < this.size()) {
            this.n5(var1).l6 = var1++;
         }

         this.l6 = true;
      }
   }

   final void h0() {
      if (!this.k5) {
         this.u3 = 0.0;

         for (int var1 = 0; var1 < this.size(); var1++) {
            Column var2 = this.n5(var1);
            var2.l6 = var1;
            var2.k5 = this.u3;
            this.u3 = this.u3 + var2.getWidth();
         }

         this.k5 = true;
         this.l6 = true;
      }
   }

   final void c8() {
      this.k5 = false;
   }

   final void t2() {
      List$Enumerator var1 = this.n5.iterator();

      try {
         while (var1.hasNext()) {
            Column var2 = (Column)var1.next();
            var2.u3 = false;
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   final boolean n5(int var1, boolean var2) {
      if (var1 >= 1 && var1 != this.size()) {
         int var3 = this.u9.size();
         Column var4 = this.n5(var1);
         int var5 = 0;

         while (var5 < var3) {
            Cell var6 = var4.n5(var5).a6();
            int var7 = var6.getFirstColumnIndex();
            if (var7 < var1) {
               if (var2) {
                  return true;
               }

               var6.n5(var1 - var7);
            }

            var5 += var6.getRowSpan();
         }

         return false;
      } else {
         return false;
      }
   }

   final boolean l6(int var1, boolean var2) {
      if (var1 == this.size()) {
         return false;
      }

      int var3 = this.u9.size();
      Column var4 = this.n5(var1);
      int var5 = 0;

      while (var5 < var3) {
         Cell var6 = var4.n5(var5);
         if (var6.c8()) {
            var6 = var6.a6();
            int var7 = var6.getFirstColumnIndex();
            if (var7 < var1) {
               if (var2) {
                  return true;
               }

               var6 = var6.n5(var1 - var7);
            }
         }

         if (var6.getColSpan() > 1) {
            if (var2) {
               return true;
            }

            var6.n5(1);
         }

         var5 += var6.getRowSpan();
      }

      return false;
   }

   @Override
   public final IGenericEnumerator<IColumn> iterator() {
      return this.n5.iterator();
   }

   @Override
   public final IGenericEnumerator<IColumn> iteratorJava() {
      return this.n5.iteratorJava();
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      this.n5.copyTo(array, index);
   }

   @Override
   public final boolean isSynchronized() {
      return false;
   }

   @Override
   public final Object getSyncRoot() {
      return this;
   }
}
