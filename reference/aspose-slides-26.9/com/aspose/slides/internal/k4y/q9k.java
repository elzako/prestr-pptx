package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class q9k extends b3 {
   private String n5;
   private String l6;
   private List<b5i> k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("style:name", "style:display-name", "placeholder");

   public q9k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      q9k$1 var2 = new q9k$1(this);
      n5(var1, var2);
      n5(var1, new q9k$2(this, var1));
   }

   public q9k() {
      this.k5();
   }

   private void k5() {
      this.k5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("style:name", this.n5);
      if (this.l6 != null) {
         var2.l6("style:display-name", this.l6);
      }

      List$Enumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            b5i var5 = (b5i)var4.next();
            var5.n5("presentation", var2, "placeholder");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(q9k var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(q9k var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static List n5(q9k var0) {
      return var0.k5;
   }
}
