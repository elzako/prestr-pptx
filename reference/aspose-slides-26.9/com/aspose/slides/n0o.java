package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

final class n0o extends g8<LineFormatCollection, n0o> implements ILineFormatCollectionEffectiveData {
   private final List<ILineFormatEffectiveData> n5 = new List<>();

   n0o() {
   }

   n0o(LineFormatCollection var1) {
      if (var1 != null && var1.size() > 0) {
         for (int var2 = 0; var2 < var1.size(); var2++) {
            t8r var3 = new t8r((LineFormat)null);
            var3.t9.n5 = 1;
            var3.t9.a6().n5(com.aspose.slides.internal.o9b.c8.m3().o8());
            var3.t9.h0().l6.n5(com.aspose.slides.internal.o9b.c8.m3().o8());
            var3.t9.h0().k5.n5(com.aspose.slides.internal.o9b.c8.w4().o8());
            var3.k5 = null;
            var3.u3 = 2;
            var3.a6 = 0;
            var3.u9 = 0;
            var3.h0 = 0;
            var3.c8 = 10.0F;
            var3.t2 = 0;
            var3.s7 = 0;
            var3.y4 = 1;
            var3.e2 = 1;
            var3.x8 = 1;
            var3.n3 = 1;
            var3.l6((LineFormat)var1.get_Item(var2));
            this.n5.addItem(var3);
         }
      }
   }

   @Override
   public final ILineFormatEffectiveData get_Item(int index) {
      return this.n5.get_Item(index);
   }

   @Override
   public final IGenericEnumerator<ILineFormatEffectiveData> iterator() {
      return new com.aspose.slides.internal.f3.l6<>(this.n5.iterator().Clone(), new n0o$1(this));
   }

   @Override
   public final IGenericEnumerator<ILineFormatEffectiveData> iteratorJava() {
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
         n0o var2 = (n0o)var1;
         if (this.n5.size() > var2.n5.size()) {
            this.n5.removeRange(var2.n5.size(), this.n5.size() - var2.n5.size());
         }

         for (int var3 = 0; var3 < var2.n5.size(); var3++) {
            if (var3 == this.n5.size()) {
               this.n5.addItem(new t8r((LineFormat)null));
            } else {
               ((t8r)this.n5.get_Item(var3)).u9();
            }

            ((t8r)this.n5.get_Item(var3)).n5((i7b)((t8r)var2.n5.get_Item(var3)));
         }
      }
   }

   void n5(i7b var1, LineFormatCollection var2) {
      this.n5(var1);
      this.n5(var2);
   }

   final void n5(LineFormatCollection var1) {
      if (this.n5.size() > var1.size()) {
         this.n5.removeRange(var1.size(), this.n5.size() - var1.size());
      }

      for (int var2 = 0; var2 < var1.size(); var2++) {
         if (var2 == this.n5.size()) {
            this.n5.addItem(new t8r((LineFormat)null));
         } else {
            ((t8r)this.n5.get_Item(var2)).u9();
         }

         t8r var3 = (t8r)this.n5.get_Item(var2);
         var3.t9.n5 = 1;
         var3.t9.a6().n5(com.aspose.slides.internal.o9b.c8.m3().o8());
         var3.t9.h0().l6.n5(com.aspose.slides.internal.o9b.c8.m3().o8());
         var3.t9.h0().k5.n5(com.aspose.slides.internal.o9b.c8.w4().o8());
         var3.k5 = null;
         var3.u3 = 2;
         var3.a6 = 0;
         var3.u9 = 0;
         var3.h0 = 0;
         var3.c8 = 10.0F;
         var3.t2 = 0;
         var3.s7 = 0;
         var3.y4 = 1;
         var3.e2 = 1;
         var3.x8 = 1;
         var3.n3 = 1;
         var3.l6((LineFormat)var1.get_Item(var2));
      }
   }

   @Override
   void n5(IBaseSlide var1, w6a var2) {
      List$Enumerator var3 = this.n5.iterator();

      try {
         while (var3.hasNext()) {
            t8r var4 = (t8r)var3.next();
            var4.n5(var1, var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   boolean n5(n0o var1) {
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
      return this.n5((com.aspose.slides.n0o)recoveredArg);
   }
}
