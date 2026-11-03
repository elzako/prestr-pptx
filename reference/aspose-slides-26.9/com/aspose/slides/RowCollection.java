package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;

public final class RowCollection extends DomObject<Table> implements IRowCollection {
   private final List<IRow> u3 = new List<>();
   private boolean a6 = true;
   boolean n5 = true;
   double l6 = 0.0;
   final ColumnCollection k5 = new ColumnCollection(this);

   RowCollection(Table parentImmediate) {
      super(parentImmediate);
   }

   final Table n5() {
      return this.u9;
   }

   final double l6() {
      this.u9();
      return this.l6;
   }

   @Override
   public final int size() {
      return this.u3.size();
   }

   @Override
   public final IRow get_Item(int index) {
      if (index >= 0 && index <= this.size() - 1) {
         return (Row)this.u3.get_Item(index);
      } else {
         throw new IndexOutOfRangeException(com.aspose.slides.ms.System.d1.n5("value of index = {0} is out of range 0..{1}",new Object[]{ index, this.size() - 1}));
      }
   }

   final Row n5(int var1) {
      return (Row)this.u3.get_Item(var1);
   }

   final Row n5(double var1) {
      return this.n5(-1, var1);
   }

   final Row n5(int var1, double var2) {
      Row var4 = new Row(this, var2);
      if (var1 >= 0 && var1 < this.size()) {
         this.u3.insertItem(var1, var4);
         this.a6 = false;
      } else {
         var4.l6 = this.u3.size();
         this.u3.addItem(var4);
      }

      this.n5 = false;
      var4.l6(this.k5.size());
      return var4;
   }

   @Override
   public final IRow[] addClone(IRow templ, boolean withAttachedRows) {
      int var3 = this.size();
      return this.insertClone(var3, templ, withAttachedRows);
   }

   @Override
   public final IRow[] insertClone(int index, IRow templ, boolean withAttachedRows) {
      Row var4 = (Row)templ;
      Table var5 = var4.n5();
      if (this.n5() != var5) {
         throw new PptxEditException("Clonning rows between different tables isn't supported.");
      }

      if (index >= 0 && index <= this.size()) {
         if (this.n5(index, true)) {
            throw new PptxEditException("Can't insert rows: target index breaks merged cells.");
         }

         Row[] var6;
         if (withAttachedRows) {
            var6 = var4.u9().l6(var4.h0());
         } else {
            if (this.l6(var4.h0(), true)) {
               throw new PptxEditException("Some of row's cells lay outside row.");
            }

            var6 = new Row[]{var4};
         }

         IRow[] var7 = new IRow[var6.length];
         int var8 = var6.length;

         while (var8 > 0) {
            var4 = var6[--var8];
            Row var9 = this.n5(index, var4.getMinimalHeight());
            var7[var8] = var9;
            var9.setMinimalHeight(var4.getMinimalHeight());
            int var10 = this.k5.size();

            while (var10 > 0) {
               Cell var11 = var4.n5(--var10);
               Cell var12 = var9.n5(var10);
               var12.l6 = var11.l6;
               var12.n5 = var11.n5;
               if (var12.h0()) {
                  var9.l6 = index;
                  this.a6 = true;
                  var12.l6(false);
               }

               var12.n5(var11);
            }
         }

         this.a6 = false;
         return var7;
      } else {
         throw new ArgumentOutOfRangeException("index", index, "Wrong index of row");
      }
   }

   final void l6(int var1, double var2) {
      Row var4 = this.n5(var1);
      if (!(var2 <= 0.0) && !(var2 >= var4.getHeight())) {
         Row var5 = this.n5(var1 + 1, var4.getHeight() - var2);
         var4.setMinimalHeight(var2);
         int var6 = this.k5.size();
         int var7 = 0;

         while (var7 < var6) {
            Cell var8 = var4.n5(var7);
            if (var8.c8()) {
               var8 = var8.a6();
            }

            var8.n5++;

            for (int var9 = var8.getColSpan(); var9 > 0; var7++) {
               var9--;
               var5.n5(var7).k5 = var8;
            }
         }
      } else {
         throw new ArgumentOutOfRangeException("Splitting height must be in greater than 0 and less than row's minimal height");
      }
   }

   final void k5() {
      this.l6(0, this.size());
      this.a6 = true;
      this.n5 = true;
      this.l6 = 0.0;
   }

   @Override
   public final void removeAt(int firstRowIndex, boolean withAttachedRows) {
      int var3 = this.size();
      if (withAttachedRows) {
         com.aspose.slides.internal.o9b.p8 var4 = this.k5(firstRowIndex).u3();
         this.l6(var4.l6(), var4.k5());
      } else {
         int var8 = this.k5.size();
         Row var5 = this.n5(firstRowIndex);

         for (int var6 = 0; var6 < var8; var6++) {
            ICell var7 = var5.get_Item(var6);
            if (var7.getRowSpan() > 1) {
               throw new PptxEditException("Some of row's cells lay outside row.");
            }
         }

         this.l6(firstRowIndex, 1);
      }

      if (var3 != this.size() && this.size() > 0) {
         this.k5.a6();
      }
   }

   private void l6(int var1, int var2) {
      if (var2 != 0) {
         if (var1 + var2 < this.size()) {
            this.a6 = false;
         }

         this.n5 = false;
         int var3 = var1;
         int var4 = this.k5.size();

         for (int var5 = 0; var5 < var2; var5++) {
            Row var6 = this.n5(var3++);
            var6.l6(0, var4);
         }

         if (var1 == 0 && var2 == this.size()) {
            this.u3.clear();
         } else {
            this.u3.removeRange(var1, var2);
         }
      }
   }

   final void u3() {
      this.n5(0, this.size());
   }

   final void n5(int var1, int var2) {
      boolean var3 = this.n5;
      int var4 = var1 + var2;
      int var5 = this.k5.size();

      while (var4 > var1) {
         Row var6 = this.n5(--var4);
         boolean var7 = true;

         for (int var8 = 0; var8 < var5; var8++) {
            if (!var6.n5(var8).c8()) {
               var7 = false;
               break;
            }
         }

         if (var7) {
            if (var4 > 0) {
               Row var10 = this.n5(var4 - 1);
               var10.setMinimalHeight(var10.getMinimalHeight() + var6.getMinimalHeight());
            }

            int var11 = 0;

            while (var11 < var5) {
               Cell var9 = var6.n5(var11).a6();
               var9.n5--;
               var11 += var9.getColSpan();
            }

            this.l6(var4, 1);
         }
      }

      this.n5 = var3;
   }

   private com.aspose.slides.internal.o9b.p8 k5(int var1) {
      int var2 = this.k5.size();
      int var3 = var1;
      Row var4 = this.n5(var3);
      int var5 = 0;
      if (var1 > 0) {
         while (var5 < var2) {
            Cell var6 = var4.n5(var5).a6();
            if (var6.getFirstRowIndex() < var3) {
               var3 = var6.getFirstRowIndex();
               var4 = this.n5(var3);
               var5 = 0;
            }

            var5 += var6.getColSpan();
         }
      }

      int var10 = var1 + 1;
      if (var10 < this.size()) {
         var4 = this.n5(var1);
         var5 = 0;

         while (var5 < var2) {
            Cell var7 = var4.n5(var5).a6();
            if (var7.getFirstRowIndex() + var7.getRowSpan() > var10) {
               var10 = var7.getFirstRowIndex() + var7.getRowSpan();
               var4 = this.n5(var10 - 1);
               var5 = 0;
            }

            var5 += var7.getColSpan();
         }
      }

      return new com.aspose.slides.internal.o9b.p8(var3, var10 - var3);
   }

   final Row[] l6(int var1) {
      com.aspose.slides.internal.o9b.p8 var2 = this.k5(var1).u3();
      Row[] var3 = new Row[var2.k5()];

      for (int var4 = 0; var4 < var3.length; var4++) {
         var3[var4] = this.n5(var2.l6() + var4);
      }

      return var3;
   }

   final void a6() {
      if (!this.a6) {
         int var1 = 0;

         while (var1 < this.size()) {
            this.n5(var1).l6 = var1++;
         }

         this.a6 = true;
      }
   }

   final void u9() {
      if (!this.n5) {
         this.n5().e5().k5();
         double var1 = 0.0;

         for (int var3 = 0; var3 < this.size(); var3++) {
            Row var4 = this.n5(var3);
            var4.l6 = var3;
            var4.k5 = var1;
            var1 += var4.getHeight();
         }

         this.l6 = var1;
         this.n5 = true;
         this.a6 = true;
      }
   }

   final boolean n5(int var1, boolean var2) {
      if (var1 >= 1 && var1 != this.size()) {
         int var3 = this.k5.size();
         Row var4 = this.n5(var1);
         int var5 = 0;

         while (var5 < var3) {
            Cell var6 = var4.n5(var5);
            if (var6.c8()) {
               var6 = var6.a6();
            }

            int var7 = var6.getFirstRowIndex();
            if (var7 < var1) {
               if (var2) {
                  return true;
               }

               var6.l6(var1 - var7);
            }

            var5 += var6.getColSpan();
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

      int var3 = this.k5.size();
      Row var4 = this.n5(var1);
      int var5 = 0;

      while (var5 < var3) {
         Cell var6 = var4.n5(var5);
         if (var6.c8()) {
            var6 = var6.a6();
            int var7 = var6.getFirstRowIndex();
            if (var7 < var1) {
               if (var2) {
                  return true;
               }

               var6 = var6.l6(var1 - var7);
            }
         }

         if (var6.getRowSpan() > 1) {
            if (var2) {
               return true;
            }

            var6.l6(1);
         }

         var5 += var6.getColSpan();
      }

      return false;
   }

   @Override
   public final IGenericEnumerator<IRow> iterator() {
      return this.u3.iterator();
   }

   @Override
   public final IGenericEnumerator<IRow> iteratorJava() {
      return this.u3.iteratorJava();
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      this.u3.copyTo(array, index);
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
