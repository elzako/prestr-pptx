package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

final class g4z {
   private final List<IImageTransformOperation> n5;
   private long l6;

   g4z(List<IImageTransformOperation> var1) {
      this.n5 = var1;
   }

   public final void n5(int var1) {
      this.l6 = this.l6();
      this.k5();
      this.n5.removeAt(var1);
   }

   public final void n5(IImageTransformOperation var1) {
      this.n5.addItem(var1);
      this.k5();
   }

   public final void n5() {
      this.l6 = this.l6();
      this.k5();
      this.n5.clear();
   }

   public final boolean l6(IImageTransformOperation var1) {
      this.l6 = this.l6();
      this.k5();
      return this.n5.removeItem(var1);
   }

   final long l6() {
      long var1 = this.l6;
      List$Enumerator var3 = this.n5.iterator();

      try {
         while (var3.hasNext()) {
            ImageTransformOperation var4 = (ImageTransformOperation)var3.next();
            var1 = (var1 & 4294967295L) + (var4.getVersion() & 4294967295L) & 4294967295L;
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var1;
   }

   private void k5() {
      this.l6++;
   }
}
