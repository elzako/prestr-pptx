package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class d5g extends b3 {
   private List<v7z> n5;
   private l0k l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("c", "extLst");

   public d5g(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      n5(var1, new d5g$1(this, var1));
   }

   public d5g() {
      this.l6();
   }

   private void l6() {
      this.n5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("ssml", var3, "http://schemas.openxmlformats.org/spreadsheetml/2006/main");
      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            v7z var5 = (v7z)var4.next();
            var5.n5("ssml", var2, "c");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.l6 != null) {
         this.l6.n5("ssml", var2, "extLst");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static List n5(d5g var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static l0k n5(d5g var0, l0k var1) {
      return var0.l6 = var1;
   }
}
