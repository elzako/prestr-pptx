package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public final class FillFormatCollection extends DomObject<FormatScheme> implements IFillFormatCollection {
   private w7e l6;
   final com.aspose.slides.internal.v6g.n5<w7e> n5 = new FillFormatCollection$1(this);
   private final List<IFillFormat> k5;
   private long u3 = 1L;
   private long a6 = 0L;

   FillFormatCollection(FormatScheme parentImmediate) {
      super(parentImmediate);
      this.k5 = new List<>();
   }

   @Override
   public final IFillFormat get_Item(int index) {
      return this.k5.get_Item(index);
   }

   @Override
   public final IGenericEnumerator<IFillFormat> iterator() {
      return this.k5.iterator();
   }

   @Override
   public final IGenericEnumerator<IFillFormat> iteratorJava() {
      return this.k5.iteratorJava();
   }

   @Override
   public final int size() {
      return this.k5.size();
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

   final void n5(FillFormatCollection var1) {
      this.u3 = this.k5();
      this.k5.clear();
      IGenericEnumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            FillFormat var3 = (FillFormat)var2.next();
            FillFormat var4 = new FillFormat(this);
            this.k5.addItem(var4);
            var4.n5((IFillFormat)var3);
            var4.n5.l6(new FillFormatCollection$2(this));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      this.u3();
   }

   final void n5(IFillFormatCollectionEffectiveData var1) {
      this.u3 = this.k5();
      this.k5.clear();
      IGenericEnumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            IFillFormatEffectiveData var3 = (IFillFormatEffectiveData)var2.next();
            FillFormat var4 = new FillFormat(this);
            var4.n5(var3);
            this.k5.addItem(var4);
            var4.n5.l6(new FillFormatCollection$3(this));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      this.u3();
   }

   final IFillFormat n5() {
      FillFormat var1 = new FillFormat(this);
      var1.n5.l6(new FillFormatCollection$4(this));
      this.k5.addItem(var1);
      this.u3();
      return var1;
   }

   final void l6() {
      this.u3 = this.k5();
      List$Enumerator var1 = this.k5.iterator();

      try {
         while (var1.hasNext()) {
            FillFormat var2 = (FillFormat)var1.next();
            var2.n5.n5(new FillFormatCollection$5(this));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      this.u3();
      this.k5.clear();
   }

   private void u3() {
      this.u3++;
      this.a6();
   }

   private void a6() {
      this.a6 = 0L;
      w7e var1 = this.l6;
      if (var1 != null && !this.n5.n5()) {
         var1.n5();
      }
   }

   final long k5() {
      if ((this.a6 & 4294967295L) == 0L) {
         this.a6 = this.u3;
         List$Enumerator var1 = this.k5.iterator();

         try {
            while (var1.hasNext()) {
               FillFormat var2 = (FillFormat)var1.next();
               this.a6 = (this.a6 & 4294967295L) + (var2.getVersion() & 4294967295L) & 4294967295L;
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
               var1.dispose();
            }
         }
      }

      return this.a6;
   }

   // $VF: synthetic method
   static w7e n5(FillFormatCollection var0, w7e var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static void l6(FillFormatCollection var0) {
      var0.a6();
   }
}
