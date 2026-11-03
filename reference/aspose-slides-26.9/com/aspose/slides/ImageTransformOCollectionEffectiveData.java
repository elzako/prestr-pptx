package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

public class ImageTransformOCollectionEffectiveData implements IImageTransformOCollectionEffectiveData, i7b {
   private List<IEffectEffectiveData> n5 = new List<>();

   @Override
   public final int size() {
      return this.n5.size();
   }

   @Override
   public final IEffectEffectiveData get_Item(int index) {
      return this.n5.get_Item(index);
   }

   final IEffectEffectiveData n5(ImageTransformOperation var1) {
      IEffectEffectiveData var2 = ((i4e)var1).getEffective();
      this.n5.addItem(var2);
      return var2;
   }

   final IEffectEffectiveData n5(IEffectEffectiveData var1) {
      this.n5.addItem(var1);
      return var1;
   }

   final void n5() {
      this.n5.clear();
   }

   final String l6() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      IGenericEnumerator var2 = this.iterator();

      try {
         while (var2.hasNext()) {
            IEffectEffectiveData var3 = (IEffectEffectiveData)var2.next();
            var1.n5(((t9f)var3).n5());
            var1.n5(';');
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1.toString();
   }

   final com.aspose.slides.internal.o9b.t4 n5(com.aspose.slides.internal.o9b.l6 var1, boolean var2) {
      if (this.size() > 0 || var2) {
         c0v var3 = c0v.n5(var1);
         var1.dispose();
         IGenericEnumerator var4 = this.iterator();

         try {
            while (var4.hasNext()) {
               IEffectEffectiveData var5 = (IEffectEffectiveData)var4.next();
               var3 = ((t9f)var5).n5(var3);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }

         var1 = var3.s7();
      }

      return var1;
   }

   @Override
   public boolean equals(Object obj) {
      ImageTransformOCollectionEffectiveData var2 = com.aspose.slides.internal.v6g.k5.n5(obj, ImageTransformOCollectionEffectiveData.class);
      return var2 == null ? false : this.n5(var2);
   }

   final boolean n5(ImageTransformOCollectionEffectiveData var1) {
      if (var1 == null) {
         return false;
      }

      if (this.n5.size() != var1.n5.size()) {
         return false;
      }

      for (int var2 = 0; var2 < this.n5.size(); var2++) {
         if (!this.n5.get_Item(var2).equals(var1.n5.get_Item(var2))) {
            return false;
         }
      }

      return true;
   }

   @Override
   public int hashCode() {
      return 23454;
   }

   @Override
   public final IGenericEnumerator<IEffectEffectiveData> iterator() {
      return this.n5.iterator();
   }

   @Override
   public final IGenericEnumerator<IEffectEffectiveData> iteratorJava() {
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
