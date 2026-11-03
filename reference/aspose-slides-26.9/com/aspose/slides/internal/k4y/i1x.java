package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class i1x extends b3 {
   private List<w5r> n5;
   private y1g l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("guide", "extLst");

   public i1x(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      n5(var1, new i1x$1(this, var1));
   }

   public i1x() {
      this.k5();
   }

   private void k5() {
      this.n5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("p15", var3, "http://schemas.microsoft.com/office/powerpoint/2012/main");
      if (var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main") == null) {
         var2.u3("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
      }

      if (var2.n5("http://schemas.openxmlformats.org/presentationml/2006/main") == null) {
         var2.u3("xmlns", "p", null, "http://schemas.openxmlformats.org/presentationml/2006/main");
      }

      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            w5r var5 = (w5r)var4.next();
            var5.n5("p15", var2, "guide");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.l6 != null) {
         this.l6.n5("p15", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(w5r var1) {
      this.n5.addItem(var1);
   }

   public final w5r[] n5() {
      return this.n5.toArray(new w5r[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return k5;
   }

   // $VF: synthetic method
   static List n5(i1x var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static y1g n5(i1x var0, y1g var1) {
      return var0.l6 = var1;
   }
}
