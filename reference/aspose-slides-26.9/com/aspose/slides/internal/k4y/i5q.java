package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class i5q extends b3 {
   private String n5;
   private String l6;
   private List<r6r> k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("xml:id", "name", "actionData");

   public i5q(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      i5q$1 var2 = new i5q$1(this);
      n5(var1, var2);
      n5(var1, new i5q$2(this, var1));
   }

   public i5q() {
      this.l6();
   }

   private void l6() {
      this.l6 = "stroke";
      this.k5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("xml:id", this.n5);
      }

      if (!"stroke".equals(this.l6)) {
         var2.l6("name", this.l6);
      }

      List$Enumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            r6r var5 = (r6r)var4.next();
            var5.n5("iact", var2, "actionData");
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
   static String n5(i5q var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(i5q var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static List n5(i5q var0) {
      return var0.k5;
   }
}
