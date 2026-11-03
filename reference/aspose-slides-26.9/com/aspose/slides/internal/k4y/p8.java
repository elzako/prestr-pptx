package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class p8 extends b3 {
   private List<o4z> n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("property");

   public p8(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      n5(var1, new p8$1(this, var1));
   }

   public p8() {
      this.u3();
   }

   private void u3() {
      this.n5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("", var3, "http://schemas.openxmlformats.org/officeDocument/2006/custom-properties");
      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes") == null) {
         var2.u3("xmlns", "vt", null, "http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes");
      }

      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            o4z var5 = (o4z)var4.next();
            var5.n5("", var2, "property");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final o4z n5() {
      o4z var1 = new o4z();
      this.n5.addItem(var1);
      return var1;
   }

   public final o4z[] l6() {
      return this.n5.toArray(new o4z[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return l6;
   }

   // $VF: synthetic method
   static List n5(p8 var0) {
      return var0.n5;
   }
}
