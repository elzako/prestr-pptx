package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class u5q extends b3 {
   private String l6;
   private int k5;
   private int u3;
   private List<f5q> a6;
   public static final int n5 = v5w.n5("simple");
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "xlink:href", "xlink:type", "xlink:actuate", "font-face-format"
   );

   public u5q(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      u5q$1 var2 = new u5q$1(this);
      n5(var1, var2);
      n5(var1, new u5q$2(this, var1));
   }

   public u5q() {
      this.l6();
   }

   private void l6() {
      this.k5 = n5;
      this.u3 = 0;
      this.a6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("xlink:href", this.l6);
      if (this.k5 != n5) {
         var2.l6("xlink:type", v5w.n5(this.k5));
      }

      if (this.u3 != 0) {
         var2.l6("xlink:actuate", p9c.n5(this.u3));
      }

      List$Enumerator var4 = this.a6.iterator();

      try {
         while (var4.hasNext()) {
            f5q var5 = (f5q)var4.next();
            var5.n5("svg", var2, "font-face-format");
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
   static String n5(u5q var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int n5(u5q var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int l6(u5q var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static List n5(u5q var0) {
      return var0.a6;
   }
}
