package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.ms.System.IDisposable;

class z6l extends l5x {
   private IGenericList<com.aspose.slides.internal.k4y.p4e> n5;

   public final void n5(Presentation var1, boolean var2) {
      this.y4();
      com.aspose.slides.internal.k4y.c4x var3 = new com.aspose.slides.internal.k4y.c4x();
      com.aspose.slides.internal.k4y.p4e var4 = var3.n5();
      var4.l6(var2 ? "application/vnd.oasis.opendocument.presentation-template" : "application/vnd.oasis.opendocument.presentation");
      var4.n5("/");
      if (this.n5 != null) {
         IGenericEnumerator var5 = this.n5.iterator();

         try {
            while (var5.hasNext()) {
               com.aspose.slides.internal.k4y.p4e var6 = (com.aspose.slides.internal.k4y.p4e)var5.next();
               var3.n5(var6);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }
      }

      var3.n5("manifest", this.x8(), "manifest");
      this.e2();
   }

   public final void n5(Presentation var1) {
      this.n5();

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "file-entry".equals(this.s7().n3())) {
            com.aspose.slides.internal.k4y.p4e var2 = new com.aspose.slides.internal.k4y.p4e(this.s7());
            this.n5.addItem(var2);
         }
      }

      this.n3();
   }

   public z6l(com.aspose.slides.internal.c8m.z5 var1, z5q var2, IGenericList<com.aspose.slides.internal.k4y.p4e> var3) {
      super(var1, var2);
      this.n5 = var3;
   }

   public z6l(com.aspose.slides.internal.c8m.z5 var1, OdpSerializationContext var2, IGenericList<com.aspose.slides.internal.k4y.p4e> var3) {
      super(var1, var2);
      this.n5 = var3;
   }
}
