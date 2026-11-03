package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.internal.n8e.f5$n5;

public abstract class CellCollection implements ICellCollection, r0g {
   private c1 l6 = new c1();
   private final r0g k5;
   static f5$n5 n5 = new CellCollection$1();

   CellCollection(r0g parentImmediate) {
      this.k5 = parentImmediate;
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.k5;
   }

   abstract Table n5();

   @Override
   public final int size() {
      return this.l6();
   }

   @Override
   public final ICell get_Item(int index) {
      if (index >= 0 && index < this.size()) {
         return this.n5(index).a6();
      } else {
         throw new IndexOutOfRangeException(com.aspose.slides.ms.System.d1.n5("value of index = {0} is out of range 0..{1}",new Object[]{ index, this.size()}));
      }
   }

   abstract int l6();

   abstract Cell n5(int var1);

   abstract IGenericEnumerator<ICell> k5();

   abstract IGenericEnumerator<ICell> u3();

   @Override
   public final IGenericEnumerator<ICell> iterator() {
      return this.k5();
   }

   @Override
   public final IGenericEnumerator<ICell> iteratorJava() {
      return this.u3();
   }

   static boolean n5(Object var0, Object var1) {
      return !((Cell)var0).c8();
   }

   @Override
   public final IBaseSlide getSlide() {
      return this.n5().getSlide();
   }

   @Override
   public final IPresentation getPresentation() {
      return this.n5().getPresentation();
   }

   final c1 a6() {
      return this.l6;
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      this.n5(array, index);
   }

   abstract void n5(com.aspose.slides.ms.System.u3 var1, int var2);

   @Override
   public final boolean isSynchronized() {
      return false;
   }

   @Override
   public final Object getSyncRoot() {
      return this;
   }
}
