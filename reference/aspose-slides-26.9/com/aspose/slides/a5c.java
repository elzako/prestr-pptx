package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

final class a5c {
   private final int n5;
   private final List<e4z> l6 = new List<>();

   public a5c() {
      this.n5 = 100;
   }

   public a5c(int var1) {
      this.n5 = var1;
   }

   public final void n5() {
      this.l6.clear();
   }

   public final void n5(e4z var1) {
      this.l6.addItem(var1);
   }

   public final com.aspose.slides.internal.n8e.o5<e4z> l6() {
      return new com.aspose.slides.internal.n8e.o5<>(e4z.class, this.l6);
   }

   public final void k5() {
      if (this.l6.size() > this.n5) {
         this.l6.removeAt(0);
      }
   }
}
