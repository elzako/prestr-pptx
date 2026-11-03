package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class o6x extends x0q {
   public static List<com.aspose.slides.internal.k4y.u3k> n5(com.aspose.slides.ms.System.Xml.c7 var0) {
      List var1 = null;

      while (var0.u9()) {
         if (var0.s7() == 1 && "Signature".equals(var0.n3())) {
            com.aspose.slides.internal.k4y.u3k var2 = new com.aspose.slides.internal.k4y.u3k(var0);
            if (var1 == null) {
               var1 = new List();
            }

            var1.addItem(var2);
         }
      }

      return var1;
   }

   public static void n5(com.aspose.slides.internal.n8e.u4 var0, DigitalSignature var1, com.aspose.slides.internal.c8m.d9 var2) {
      com.aspose.slides.internal.k4y.u3k var3 = new com.aspose.slides.internal.k4y.u3k();
      var0.n5(0);
      u1n.n5(var1, var3, var2);
      var3.n5(null, var0, "Signature");
   }

   final void n5(DigitalSignature var1) {
      this.n5();
      List var2 = n5(this.s7());
      if (var2 != null) {
         List$Enumerator var3 = var2.iterator();

         try {
            while (var3.hasNext()) {
               com.aspose.slides.internal.k4y.u3k var4 = (com.aspose.slides.internal.k4y.u3k)var3.next();
               u1n.n5(var1, var4, this.t9());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }

      this.n3();
   }

   final void l6(DigitalSignature var1) {
      this.y4();
      n5(this.x8(), var1, this.u3().a6());
      this.e2();
   }

   public o6x(com.aspose.slides.internal.c8m.j8 var1, t5w var2) {
      super(var1, var2);
   }

   public o6x(com.aspose.slides.internal.c8m.j8 var1, g6c var2) {
      super(var1, var2);
   }
}
