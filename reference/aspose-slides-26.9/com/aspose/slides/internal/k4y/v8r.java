package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class v8r extends b3 {
   private String n5;
   private List<v1o> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("Algorithm", "RelationshipReference");

   public v8r(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      v8r$1 var2 = new v8r$1(this);
      n5(var1, var2);
      n5(var1, new v8r$2(this, var1));
   }

   public v8r() {
      this.a6();
   }

   private void a6() {
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("Algorithm", this.n5);
      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            v1o var5 = (v1o)var4.next();
            var5.n5("", var2, "RelationshipReference");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final v1o n5() {
      v1o var1 = new v1o();
      this.l6.addItem(var1);
      return var1;
   }

   public final String l6() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final v1o[] k5() {
      return this.l6.toArray(new v1o[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(v8r var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(v8r var0) {
      return var0.l6;
   }
}
