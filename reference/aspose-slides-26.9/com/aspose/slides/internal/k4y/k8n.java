package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class k8n extends b3 {
   private String n5;
   private boolean l6;
   private List<u1x> k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("table:title", "table:display", "p");

   public k8n(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      k8n$1 var2 = new k8n$1(this);
      n5(var1, var2);
      n5(var1, new k8n$2(this, var1));
   }

   public k8n() {
      this.l6();
   }

   private void l6() {
      this.l6 = false;
      this.k5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("table:title", this.n5);
      }

      if (this.l6) {
         var2.l6("table:display", this.l6 ? "true" : "false");
      }

      List$Enumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            u1x var5 = (u1x)var4.next();
            var5.n5("text", var2, "p");
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
   static String n5(k8n var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(k8n var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static List n5(k8n var0) {
      return var0.k5;
   }
}
