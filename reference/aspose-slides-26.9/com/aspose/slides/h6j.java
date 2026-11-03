package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class h6j extends o9a {
   private final z5q n5;
   private final com.aspose.slides.internal.k4y.e1u l6;
   private m1g k5;
   private final Dictionary<String, Shape> u3 = new Dictionary<>();
   private final Dictionary<String, Paragraph> a6 = new Dictionary<>();

   public h6j(z5q var1, com.aspose.slides.internal.k4y.e1u var2) {
      this.n5 = var1;
      this.l6 = var2;
      this.t2();
   }

   public final z5q n5() {
      return this.n5;
   }

   public final i5s l6() {
      return this.n5.l6();
   }

   public final m1g u9() {
      return this.k5;
   }

   public final void n5(m1g var1) {
      this.k5 = var1;
   }

   public final Dictionary<String, Shape> h0() {
      return this.u3;
   }

   public final Dictionary<String, Paragraph> c8() {
      return this.a6;
   }

   private void t2() {
      List$Enumerator var1 = this.l6.n5().iterator();

      try {
         while (var1.hasNext()) {
            com.aspose.slides.internal.k4y.g7 var2 = (com.aspose.slides.internal.k4y.g7)var1.next();
            t2f.n5(com.aspose.slides.internal.k4y.y2i.class, this.k5(), "style", var2, new h6j$1(this));
            t2f.n5(com.aspose.slides.internal.k4y.a8r.class, this.u3(), "list-style", var2, new h6j$2(this));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }
}
