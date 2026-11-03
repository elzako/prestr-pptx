package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public final class EffectStyleCollection extends DomObject<FormatScheme> implements IEffectStyleCollection {
   private i1k l6;
   final com.aspose.slides.internal.v6g.n5<i1k> n5 = new EffectStyleCollection$1(this);
   private final List<IEffectStyle> k5;
   private long u3 = 1L;
   private long a6 = 0L;

   EffectStyleCollection(FormatScheme parentImmediate) {
      super(parentImmediate);
      this.k5 = new List<>();
   }

   @Override
   public final IEffectStyle get_Item(int index) {
      return this.k5.get_Item(index);
   }

   @Override
   public final IGenericEnumerator<IEffectStyle> iterator() {
      return this.k5.iterator();
   }

   @Override
   public final IGenericEnumerator<IEffectStyle> iteratorJava() {
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

   final void n5(EffectStyleCollection var1) {
      this.u3 = this.k5();
      this.u3();
      this.k5.clear();
      IGenericEnumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            EffectStyle var3 = (EffectStyle)var2.next();
            EffectStyle var4 = new EffectStyle(this);
            var4.n5(var3);
            var4.n5.l6(new EffectStyleCollection$2(this));
            this.k5.addItem(var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   final void n5(IEffectStyleCollectionEffectiveData var1) {
      this.u3 = this.k5();
      this.u3();
      this.k5.clear();
      IGenericEnumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            IEffectStyleEffectiveData var3 = (IEffectStyleEffectiveData)var2.next();
            EffectStyle var4 = new EffectStyle(this);
            var4.n5(var3);
            var4.n5.l6(new EffectStyleCollection$3(this));
            this.k5.addItem(var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   final IEffectStyle n5() {
      EffectStyle var1 = new EffectStyle(this);
      var1.n5.l6(new EffectStyleCollection$4(this));
      this.k5.addItem(var1);
      this.u3();
      return var1;
   }

   final void l6() {
      this.u3 = this.k5();
      List$Enumerator var1 = this.k5.iterator();

      try {
         while (var1.hasNext()) {
            EffectStyle var2 = (EffectStyle)var1.next();
            var2.n5.n5(new EffectStyleCollection$5(this));
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
      i1k var1 = this.l6;
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
               EffectStyle var2 = (EffectStyle)var1.next();
               this.a6 = (this.a6 & 4294967295L) + (var2.n5() & 4294967295L) & 4294967295L;
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
   static i1k n5(EffectStyleCollection var0, i1k var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static void l6(EffectStyleCollection var0) {
      var0.a6();
   }
}
