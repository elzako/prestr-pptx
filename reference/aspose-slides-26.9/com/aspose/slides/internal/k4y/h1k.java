package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class h1k extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private z3s u3;
   private List<g7> a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "xml:id", "lengthUnit", "timeUnit", "definitions", "actionGroup", "action"
   );

   public h1k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      h1k$1 var2 = new h1k$1(this);
      n5(var1, var2);
      n5(var1, new h1k$2(this, var1));
   }

   public h1k() {
      this.u9();
   }

   private void u9() {
      this.a6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("iact", var3, "http://schemas.microsoft.com/office/powerpoint/2014/inkAction");
      if (var2.n5("http://www.w3.org/2003/InkML") == null) {
         var2.u3("xmlns", "inkml", null, "http://www.w3.org/2003/InkML");
      }

      if (this.n5 != null) {
         var2.l6("xml:id", this.n5);
      }

      com.aspose.slides.internal.f8y.n5.n5(this.l6 != null, "Required property \"LengthUnit\" is uninitialized.");
      var2.l6("lengthUnit", this.l6);
      com.aspose.slides.internal.f8y.n5.n5(this.k5 != null, "Required property \"TimeUnit\" is uninitialized.");
      var2.l6("timeUnit", this.k5);
      if (this.u3 != null) {
         this.u3.n5("inkml", var2, "definitions");
      }

      List$Enumerator var4 = this.a6.iterator();

      try {
         while (var4.hasNext()) {
            g7 var5 = (g7)var4.next();
            switch (u9.n5(var5.n5())) {
               case 4:
                  ((r7g)var5.k5()).n5("iact", var2, var5.n5());
                  break;
               case 5:
                  ((b4h)var5.k5()).n5("iact", var2, var5.n5());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final void n5(z3s var1) {
      this.u3 = var1;
   }

   public final void n5(g7 var1) {
      this.a6.addItem(var1);
   }

   public final String n5() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final String l6() {
      return this.k5;
   }

   public final void l6(String var1) {
      this.k5 = var1;
   }

   public final z3s k5() {
      return this.u3;
   }

   public final List<g7> u3() {
      return this.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return u9;
   }

   // $VF: synthetic method
   static String n5(h1k var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(h1k var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(h1k var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static z3s n5(h1k var0, z3s var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static List n5(h1k var0) {
      return var0.a6;
   }
}
