package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class j9g extends b3 {
   private String n5;
   private String l6;
   private List<u1x> k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("creator", "date", "p");

   public j9g(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      n5(var1, new j9g$1(this, var1));
   }

   public j9g() {
      this.l6();
   }

   private void l6() {
      this.k5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5("dc", var2, "creator", this.n5, false);
      this.n5("dc", var2, "date", this.l6, false);
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
   static String n5(j9g var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(j9g var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static String l6(j9g var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(j9g var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static List k5(j9g var0) {
      return var0.k5;
   }
}
