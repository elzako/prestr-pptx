package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class b6w extends b3 {
   private boolean n5;
   private String l6;
   private List<g8a> k5;
   private l0k u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("pivot", "sqref", "cfRule", "extLst");

   public b6w(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      b6w$1 var2 = new b6w$1(this);
      n5(var1, var2);
      n5(var1, new b6w$2(this, var1));
   }

   public b6w() {
      this.l6();
   }

   private void l6() {
      this.n5 = false;
      this.k5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5) {
         var2.l6("pivot", this.n5 ? "1" : "0");
      }

      if (this.l6 != null) {
         var2.l6("sqref", this.l6);
      }

      List$Enumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            g8a var5 = (g8a)var4.next();
            var5.n5("ssml", var2, "cfRule");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.u3 != null) {
         this.u3.n5("ssml", var2, "extLst");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static boolean n5(b6w var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(b6w var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static List n5(b6w var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static l0k n5(b6w var0, l0k var1) {
      return var0.u3 = var1;
   }
}
