package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

final class d8v extends g8<EffectStyleCollection, d8v> implements IEffectStyleCollectionEffectiveData {
   private final List<IEffectStyleEffectiveData> n5 = new List<>();

   d8v() {
   }

   d8v(EffectStyleCollection var1) {
      if (var1 != null && var1.size() > 0) {
         for (int var2 = 0; var2 < var1.size(); var2++) {
            j7h var3 = new j7h();
            ((h3g)var3.getThreeDFormat()).k5 = 0;
            ((h3g)var3.getThreeDFormat()).a6 = 0;
            var3.n5((EffectStyle)var1.get_Item(var2));
            this.n5.addItem(var3);
         }
      }
   }

   @Override
   public final IEffectStyleEffectiveData get_Item(int index) {
      return this.n5.get_Item(index);
   }

   @Override
   public final IGenericEnumerator<IEffectStyleEffectiveData> iterator() {
      return this.n5.iterator();
   }

   @Override
   public final IGenericEnumerator<IEffectStyleEffectiveData> iteratorJava() {
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
         d8v var2 = (d8v)var1;
         if (this.n5.size() > var2.n5.size()) {
            this.n5.removeRange(var2.n5.size(), this.n5.size() - var2.n5.size());
         }

         for (int var3 = 0; var3 < var2.n5.size(); var3++) {
            if (var3 == this.n5.size()) {
               this.n5.addItem(new j7h());
            } else {
               ((j7h)this.n5.get_Item(var3)).n5();
            }

            ((j7h)this.n5.get_Item(var3)).n5((i7b)((j7h)var2.n5.get_Item(var3)));
         }
      }
   }

   void n5(i7b var1, EffectStyleCollection var2) {
      this.n5(var1);
      this.n5(var2);
   }

   final void n5(EffectStyleCollection var1) {
      if (this.n5.size() > var1.size()) {
         this.n5.removeRange(var1.size(), this.n5.size() - var1.size());
      }

      for (int var2 = 0; var2 < var1.size(); var2++) {
         if (var2 == this.n5.size()) {
            this.n5.addItem(new j7h());
         } else {
            ((j7h)this.n5.get_Item(var2)).n5();
         }

         j7h var3 = (j7h)this.n5.get_Item(var2);
         ((h3g)var3.getThreeDFormat()).k5 = 0;
         ((h3g)var3.getThreeDFormat()).a6 = 0;
         var3.n5((EffectStyle)var1.get_Item(var2));
      }
   }

   @Override
   void n5(IBaseSlide var1, w6a var2) {
      List$Enumerator var3 = this.n5.iterator();

      try {
         while (var3.hasNext()) {
            j7h var4 = (j7h)var3.next();
            var4.n5(var1, var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   boolean n5(d8v var1) {
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
      return this.n5((com.aspose.slides.d8v)recoveredArg);
   }
}
