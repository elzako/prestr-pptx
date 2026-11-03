package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class j5m extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private List<g7> a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "form:name",
      "form:control-implementation",
      "form:label",
      "form:text-style-name",
      "text",
      "textarea",
      "formatted-text",
      "number",
      "date",
      "combobox",
      "listbox",
      "checkbox"
   );

   public j5m(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      j5m$1 var2 = new j5m$1(this);
      n5(var1, var2);
      n5(var1, new j5m$2(this, var1));
   }

   public j5m() {
      this.l6();
   }

   private void l6() {
      this.a6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("form:name", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("form:control-implementation", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("form:label", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("form:text-style-name", this.u3);
      }

      List$Enumerator var4 = this.a6.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (u9.n5(var5.n5())) {
               case 4:
                  ((k5l)var5.k5()).n5("form", var2, var5.n5());
                  break;
               case 5:
                  ((s8z)var5.k5()).n5("form", var2, var5.n5());
                  break;
               case 6:
                  ((b4b)var5.k5()).n5("form", var2, var5.n5());
                  break;
               case 7:
                  ((c0u)var5.k5()).n5("form", var2, var5.n5());
                  break;
               case 8:
                  ((f9e)var5.k5()).n5("form", var2, var5.n5());
                  break;
               case 9:
                  ((e8y)var5.k5()).n5("form", var2, var5.n5());
                  break;
               case 10:
                  ((i2h)var5.k5()).n5("form", var2, var5.n5());
                  break;
               case 11:
                  ((l6v)var5.k5()).n5("form", var2, var5.n5());
            }
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
      return u9;
   }

   // $VF: synthetic method
   static String n5(j5m var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(j5m var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(j5m var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(j5m var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static List n5(j5m var0) {
      return var0.a6;
   }
}
