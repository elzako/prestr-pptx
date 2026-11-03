package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class a8r extends b3 {
   private String n5;
   private String l6;
   private boolean k5;
   private List<g7> u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "style:name", "style:display-name", "text:consecutive-numbering", "list-level-style-number", "list-level-style-bullet", "list-level-style-image"
   );

   public a8r(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      a8r$1 var2 = new a8r$1(this);
      n5(var1, var2);
      n5(var1, new a8r$2(this, var1));
   }

   public a8r() {
      this.u3();
   }

   private void u3() {
      this.k5 = false;
      this.u3 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("style:name", this.n5);
      if (this.l6 != null) {
         var2.l6("style:display-name", this.l6);
      }

      if (this.k5) {
         var2.l6("text:consecutive-numbering", this.k5 ? "true" : "false");
      }

      List$Enumerator var4 = this.u3.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (a6.n5(var5.n5())) {
               case 3:
                  ((x8m)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 4:
                  ((v8w)var5.k5()).n5("text", var2, var5.n5());
                  break;
               case 5:
                  ((b5c)var5.k5()).n5("text", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final g7 n5(String var1) {
      g7 var2;
      switch (a6.n5(var1)) {
         case 3:
            var2 = new g7("list-level-style-number", new x8m());
            break;
         case 4:
            var2 = new g7("list-level-style-bullet", new v8w());
            break;
         case 5:
            var2 = new g7("list-level-style-image", new b5c());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      this.u3.addItem(var2);
      return var2;
   }

   public final String n5() {
      return this.n5;
   }

   public final void l6(String var1) {
      this.n5 = var1;
   }

   public final List<g7> l6() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return a6;
   }

   // $VF: synthetic method
   static String n5(a8r var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(a8r var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(a8r var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static List n5(a8r var0) {
      return var0.u3;
   }
}
