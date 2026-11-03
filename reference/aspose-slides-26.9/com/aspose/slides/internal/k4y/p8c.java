package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class p8c extends b3 {
   private List<q8l> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("section");

   public p8c(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      n5(var1, new p8c$1(this, var1));
   }

   public p8c() {
      this.u3();
   }

   private void u3() {
      this.n5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("p14", var3, "http://schemas.microsoft.com/office/powerpoint/2010/main");
      if (var2.n5("http://schemas.openxmlformats.org/presentationml/2006/main") == null) {
         var2.u3("xmlns", "p", null, "http://schemas.openxmlformats.org/presentationml/2006/main");
      }

      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            q8l var5 = (q8l)var4.next();
            var5.n5("p14", var2, "section");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final q8l n5() {
      q8l var1 = new q8l();
      this.n5.addItem(var1);
      return var1;
   }

   public final q8l[] l6() {
      return this.n5.toArray(new q8l[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return l6;
   }

   // $VF: synthetic method
   static List n5(p8c var0) {
      return var0.n5;
   }
}
