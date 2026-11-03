package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class r6r extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private List<g7> u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("xml:id", "name", "refId", "trace", "traceView");

   public r6r(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      r6r$1 var2 = new r6r$1(this);
      n5(var1, var2);
      n5(var1, new r6r$2(this, var1));
   }

   public r6r() {
      this.u9();
   }

   private void u9() {
      this.l6 = "stroke";
      this.k5 = "";
      this.u3 = new List<>();
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

      if (!"".equals(this.k5)) {
         var2.l6("refId", this.k5);
      }

      List$Enumerator var4 = this.u3.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (a6.n5(var5.n5())) {
               case 3:
                  ((o3x)var5.k5()).n5("inkml", var2, var5.n5());
                  break;
               case 4:
                  ((l5u)var5.k5()).n5("inkml", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final void n5(g7 var1) {
      this.u3.addItem(var1);
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final String l6() {
      return this.l6;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final String k5() {
      return this.k5;
   }

   public final void k5(String var1) {
      this.k5 = var1;
   }

   public final List<g7> u3() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return a6;
   }

   // $VF: synthetic method
   static String n5(r6r var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(r6r var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(r6r var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static List n5(r6r var0) {
      return var0.u3;
   }
}
