package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class ExtraColorSchemeCollection implements IExtraColorSchemeCollection, r0g {
   private z7r l6;
   final com.aspose.slides.internal.v6g.n5<z7r> n5 = new ExtraColorSchemeCollection$1(this);
   private final List<IExtraColorScheme> k5 = new List<>();
   private r0g u3;
   private long a6 = 1L;
   private long u9 = 0L;

   ExtraColorSchemeCollection(MasterTheme parentImmediate) {
      this.u3 = parentImmediate;
   }

   @Override
   public final int size() {
      return this.k5.size();
   }

   final IExtraColorScheme n5(IPresentationComponent var1) {
      ExtraColorScheme var2 = new ExtraColorScheme(this);
      var2.n5.l6(new ExtraColorSchemeCollection$2(this));
      this.k5.addItem(var2);
      this.k5();
      return var2;
   }

   final void n5(ExtraColorScheme var1) {
      var1.n5.l6(new ExtraColorSchemeCollection$3(this));
      this.k5.addItem(var1);
      this.k5();
   }

   final void n5() {
      this.a6 = this.l6();
      List$Enumerator var1 = this.k5.iterator();

      try {
         while (var1.hasNext()) {
            ExtraColorScheme var2 = (ExtraColorScheme)var1.next();
            var2.n5.n5(new ExtraColorSchemeCollection$4(this));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      this.k5();
      this.k5.clear();
   }

   @Override
   public final IExtraColorScheme get_Item(int index) {
      return this.k5.get_Item(index);
   }

   @Override
   public final r0g getParent_Immediate() {
      return this.u3;
   }

   private void k5() {
      this.a6++;
      this.u3();
   }

   final long l6() {
      if ((this.u9 & 4294967295L) == 0L) {
         this.u9 = this.a6;
         List$Enumerator var1 = this.k5.iterator();

         try {
            while (var1.hasNext()) {
               ExtraColorScheme var2 = (ExtraColorScheme)var1.next();
               this.u9 = (this.u9 & 4294967295L) + (var2.l6() & 4294967295L) & 4294967295L;
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
               var1.dispose();
            }
         }
      }

      return this.u9;
   }

   @Override
   public final IGenericEnumerator<IExtraColorScheme> iterator() {
      return this.k5.iterator();
   }

   @Override
   public final IGenericEnumerator<IExtraColorScheme> iteratorJava() {
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

   private void u3() {
      this.u9 = 0L;
      z7r var1 = this.l6;
      if (var1 != null && !this.n5.n5()) {
         var1.n5();
      }
   }

   // $VF: synthetic method
   static z7r n5(ExtraColorSchemeCollection var0, z7r var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static void n5(ExtraColorSchemeCollection var0) {
      var0.u3();
   }
}
