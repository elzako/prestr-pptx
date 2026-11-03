package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public final class ColorOperationCollection implements IColorOperationCollection {
   private t1h l6;
   final com.aspose.slides.internal.v6g.n5<t1h> n5 = new ColorOperationCollection$1(this);
   private final List<IColorOperation> k5 = new List<>();
   private long u3;

   ColorOperationCollection() {
   }

   @Override
   public final int size() {
      return this.k5.size();
   }

   @Override
   public final IColorOperation get_Item(int index) {
      return this.k5.get_Item(index);
   }

   @Override
   public final void set_Item(int index, IColorOperation value) {
      this.k5.set_Item(index, value);
   }

   @Override
   public final IColorOperation add(int operation, float parameter) {
      ColorOperation var3 = new ColorOperation(operation, parameter);
      this.k5.addItem(var3);
      this.l6();
      return var3;
   }

   @Override
   public final IColorOperation add(int operation) {
      return this.add(operation, 0.0F);
   }

   @Override
   public final IColorOperation insert(int position, int operation, float parameter) {
      ColorOperation var4 = new ColorOperation(operation, parameter);
      this.k5.insertItem(position, var4);
      this.l6();
      return var4;
   }

   @Override
   public final IColorOperation insert(int position, int operation) {
      return this.insert(position, operation, 0.0F);
   }

   @Override
   public final void removeAt(int index) {
      this.k5.removeAt(index);
      this.l6();
   }

   @Override
   public final void clear() {
      if (this.k5.size() != 0) {
         this.k5.clear();
         this.l6();
      }
   }

   final void n5(r0s var1) {
      for (int var2 = 0; var2 < this.k5.size(); var2++) {
         ((ColorOperation)this.k5.get_Item(var2)).n5(var1);
      }
   }

   @Override
   public final IGenericEnumerator<IColorOperation> iterator() {
      return this.k5.iterator();
   }

   @Override
   public final IGenericEnumerator<IColorOperation> iteratorJava() {
      return this.k5.iteratorJava();
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      this.k5.copyTo(array, index);
   }

   @Override
   public final boolean isSynchronized() {
      return false;
   }

   @Override
   public final Object getSyncRoot() {
      return this;
   }

   public final Object deepClone() {
      return this.cloneT();
   }

   public final IColorOperationCollection cloneT() {
      ColorOperationCollection var1 = new ColorOperationCollection();
      var1.n5(this, true);
      return var1;
   }

   final void n5(ColorOperationCollection var1, boolean var2) {
      if (this.k5.size() != 0 || var1.k5.size() != 0) {
         this.k5.clear();
         if (var2) {
            List$Enumerator var3 = var1.k5.iterator();

            try {
               while (var3.hasNext()) {
                  ColorOperation var4 = (ColorOperation)var3.next();
                  ColorOperation var5 = new ColorOperation(var4.getOperationType(), var4.getParameter());
                  this.k5.addItem(var5);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
                  var3.dispose();
               }
            }
         } else {
            this.k5.addRange(var1.k5);
         }

         this.l6();
      }
   }

   private void l6() {
      this.u3++;
      t1h var1 = this.l6;
      if (var1 != null && !this.n5.n5()) {
         var1.n5();
      }
   }

   final long n5() {
      return this.u3;
   }

   // $VF: synthetic method
   static t1h n5(ColorOperationCollection var0, t1h var1) {
      return var0.l6 = var1;
   }
}
