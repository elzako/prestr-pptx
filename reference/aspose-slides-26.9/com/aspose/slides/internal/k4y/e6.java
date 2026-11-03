package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class e6 extends b3 {
   private String n5;
   private List<m9> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("r:embed", "imgEffect");

   public e6(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      e6$1 var2 = new e6$1(this);
      n5(var1, var2);
      n5(var1, new e6$2(this, var1));
   }

   public e6() {
      this.k5();
   }

   private void k5() {
      this.n5 = "";
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!"".equals(this.n5)) {
         if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
         }

         var2.l6("r:embed", this.n5);
      }

      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            m9 var5 = (m9)var4.next();
            var5.n5("a14", var2, "imgEffect");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final m9[] n5() {
      return this.l6.toArray(new m9[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(e6 var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(e6 var0) {
      return var0.l6;
   }
}
