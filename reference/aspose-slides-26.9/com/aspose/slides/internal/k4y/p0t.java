package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class p0t extends b3 {
   private s4r n5;
   private List<p4z> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("index-title-template", "bibliography-entry-template");

   public p0t(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      n5(var1, new p0t$1(this, var1));
   }

   public p0t() {
      this.l6();
   }

   private void l6() {
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("text", var2, "index-title-template");
      }

      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            p4z var5 = (p4z)var4.next();
            var5.n5("text", var2, "bibliography-entry-template");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static s4r n5(p0t var0, s4r var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(p0t var0) {
      return var0.l6;
   }
}
