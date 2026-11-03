package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

final class y6s {
   private final List<IGradientStop> n5;
   private long l6;

   y6s(List<IGradientStop> var1) {
      this.n5 = var1;
   }

   public final void n5(int var1) {
      this.l6 = this.k5();
      this.u3();
      this.n5.removeAt(var1);
   }

   public final void n5() {
      this.l6 = this.k5();
      this.u3();
      this.n5.clear();
   }

   final void n5(GradientStop var1) {
      this.n5.addItem(var1);
      this.u3();
   }

   final void n5(int var1, GradientStop var2) {
      this.n5.insertItem(var1, var2);
      this.u3();
   }

   final void l6() {
      this.l6 = this.k5();
      this.n5.clear();
   }

   final long k5() {
      long var1 = this.l6;
      List$Enumerator var3 = this.n5.iterator();

      try {
         while (var3.hasNext()) {
            GradientStop var4 = (GradientStop)var3.next();
            var1 = (var1 & 4294967295L) + (var4.getVersion() & 4294967295L) & 4294967295L;
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var1;
   }

   private void u3() {
      this.l6++;
   }
}
