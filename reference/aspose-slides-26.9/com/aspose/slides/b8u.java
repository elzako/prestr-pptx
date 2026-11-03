package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.ms.System.IDisposable;

class b8u extends l5x {
   final void n5(Presentation var1) {
      this.n5();

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "document-content".equals(this.s7().n3())) {
            com.aspose.slides.internal.k4y.y9t var2 = new com.aspose.slides.internal.k4y.y9t(this.s7());
            var1.e2().n5(var2);
            h6j var3 = new h6j(this.l6(), var2.l6());
            s5b.n5(var1, var2.k5(), var3);
         }
      }

      this.n3();
   }

   final void l6(Presentation var1) {
      this.y4();
      com.aspose.slides.internal.k4y.y9t var2 = new com.aspose.slides.internal.k4y.y9t();
      this.n5(var1, var2);
      var2.n5(null, this.x8(), "document-content");
      this.e2();
   }

   public b8u(com.aspose.slides.internal.c8m.z5 var1, z5q var2) {
      super(var1, var2);
   }

   public b8u(com.aspose.slides.internal.c8m.z5 var1, OdpSerializationContext var2) {
      super(var1, var2);
   }

   private void n5(Presentation var1, com.aspose.slides.internal.k4y.y9t var2) {
      com.aspose.slides.internal.k4y.e1u var3 = var2.n5();
      x0a var4 = new x0a(var3, this.k5(), com.aspose.slides.ms.System.d1.n5);
      com.aspose.slides.internal.k4y.l4i var5 = (com.aspose.slides.internal.k4y.l4i)var2.k5().n5("presentation").l6();
      IGenericEnumerator var6 = var1.getSlides().iterator();

      try {
         while (var6.hasNext()) {
            Slide var7 = (Slide)var6.next();
            var4.l6().n5(var7);
            com.aspose.slides.internal.k4y.i4x var8 = var5.n5();
            c6d.n5(var7, var8, var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }
   }
}
