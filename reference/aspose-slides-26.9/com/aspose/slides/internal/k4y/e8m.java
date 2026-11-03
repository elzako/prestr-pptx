package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class e8m extends b3 {
   private String n5;
   private int l6;
   private List<f2o> k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("form:property-name", "office:value-type", "list-value");

   public e8m(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      e8m$1 var2 = new e8m$1(this);
      n5(var1, var2);
      n5(var1, new e8m$2(this, var1));
   }

   public e8m() {
      this.l6();
   }

   private void l6() {
      this.l6 = 0;
      this.k5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("form:property-name", this.n5);
      var2.l6("office:value-type", z6l.n5(this.l6));
      List$Enumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            f2o var5 = (f2o)var4.next();
            var5.n5("", var2, "list-value");
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
      return u3;
   }

   // $VF: synthetic method
   static String n5(e8m var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int n5(e8m var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static List n5(e8m var0) {
      return var0.k5;
   }
}
