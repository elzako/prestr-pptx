package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

final class b7i extends g8<FillFormatCollection, b7i> implements IFillFormatCollectionEffectiveData {
   List<IFillFormatEffectiveData> n5;

   b7i() {
      this.n5 = new List<>();
   }

   b7i(FillFormatCollection var1) {
      if (var1 != null && var1.size() > 0) {
         this.n5 = new List<>();

         for (int var2 = 0; var2 < var1.size(); var2++) {
            f6a var3 = new f6a((FillFormat)null);
            var3.k5 = 1;
            var3.u3 = 1;
            var3.t2().n5(com.aspose.slides.internal.o9b.c8.m3().o8());
            var3.x8().l6.n5(com.aspose.slides.internal.o9b.c8.m3().o8());
            var3.x8().k5.n5(com.aspose.slides.internal.o9b.c8.w4().o8());
            var3.s7().a6 = 0;
            f3f var4 = var3.n3();
            var3.k5((FillFormat)var1.get_Item(var2));
            this.n5.addItem(var3);
         }
      } else {
         this.n5 = new List<>();
      }
   }

   @Override
   public final IFillFormatEffectiveData get_Item(int index) {
      return this.n5.get_Item(index);
   }

   @Override
   public final IGenericEnumerator<IFillFormatEffectiveData> iterator() {
      return this.n5.iterator();
   }

   @Override
   public final IGenericEnumerator<IFillFormatEffectiveData> iteratorJava() {
      return this.n5.iteratorJava();
   }

   @Override
   public final int size() {
      return this.n5.size();
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

   final void n5(i7b var1) {
      if (var1 != null) {
         b7i var2 = (b7i)var1;
         if (this.n5.size() > var2.n5.size()) {
            this.n5.removeRange(var2.n5.size(), this.n5.size() - var2.n5.size());
         }

         for (int var3 = 0; var3 < var2.n5.size(); var3++) {
            if (var3 == this.n5.size()) {
               this.n5.addItem(new f6a((FillFormat)null));
            } else {
               ((f6a)this.n5.get_Item(var3)).u9();
            }

            ((f6a)this.n5.get_Item(var3)).n5((i7b)((f6a)var2.n5.get_Item(var3)));
         }
      }
   }

   void n5(i7b var1, FillFormatCollection var2) {
      this.n5(var1);
      this.n5(var2);
   }

   final void n5(FillFormatCollection var1) {
      if (this.n5.size() > var1.size()) {
         this.n5.removeRange(var1.size(), this.n5.size() - var1.size());
      }

      for (int var2 = 0; var2 < var1.size(); var2++) {
         if (var2 == this.n5.size()) {
            this.n5.addItem(new f6a((FillFormat)null));
         } else {
            ((f6a)this.n5.get_Item(var2)).u9();
         }

         f6a var3 = (f6a)this.n5.get_Item(var2);
         var3.k5 = 1;
         var3.u3 = 1;
         var3.t2().n5(com.aspose.slides.internal.o9b.c8.m3().o8());
         var3.x8().l6.n5(com.aspose.slides.internal.o9b.c8.m3().o8());
         var3.x8().k5.n5(com.aspose.slides.internal.o9b.c8.w4().o8());
         var3.s7().a6 = 0;
         f3f var4 = var3.n3();
         var3.k5((FillFormat)var1.get_Item(var2));
      }
   }

   @Override
   void n5(IBaseSlide var1, w6a var2) {
      List$Enumerator var3 = this.n5.iterator();

      try {
         while (var3.hasNext()) {
            f6a var4 = (f6a)var3.next();
            var4.n5(var1, var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   boolean n5(b7i var1) {
      if (var1 == null) {
         return false;
      }

      if (this.n5.size() != var1.n5.size()) {
         return false;
      }

      for (int var2 = this.n5.size(); var2 < this.n5.size(); var2++) {
         if (!this.n5.get_Item(var2).equals(var1.n5.get_Item(var2))) {
            return false;
         }
      }

      return true;
   }

   @Override
   boolean n5(g8 recoveredArg) {
      return this.n5((com.aspose.slides.b7i)recoveredArg);
   }
}
