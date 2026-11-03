package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class m3z extends b3 {
   private int n5;
   private String l6;
   private String k5;
   private a6g u3;
   private u2l a6;
   private List<g1h> u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "chart:dimension", "chart:name", "chart:style-name", "title", "categories", "grid"
   );

   public m3z(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.c8();
      m3z$1 var2 = new m3z$1(this);
      n5(var1, var2);
      n5(var1, new m3z$2(this, var1));
   }

   public m3z() {
      this.c8();
   }

   private void c8() {
      this.n5 = 0;
      this.u9 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("chart:dimension", q1p.n5(this.n5));
      if (this.l6 != null) {
         var2.l6("chart:name", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("chart:style-name", this.k5);
      }

      if (this.u3 != null) {
         this.u3.n5("chart", var2, "title");
      }

      if (this.a6 != null) {
         this.a6.n5("chart", var2, "categories");
      }

      List$Enumerator var4 = this.u9.iterator();

      try {
         while (var4.hasNext()) {
            g1h var5 = (g1h)var4.next();
            var5.n5("chart", var2, "grid");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final int n5() {
      return this.n5;
   }

   public final String l6() {
      return this.l6;
   }

   public final String k5() {
      return this.k5;
   }

   public final a6g u3() {
      return this.u3;
   }

   public final u2l a6() {
      return this.a6;
   }

   public final g1h[] u9() {
      return this.u9.toArray(new g1h[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 h0() {
      return h0;
   }

   // $VF: synthetic method
   static int n5(m3z var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(m3z var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(m3z var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static a6g n5(m3z var0, a6g var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static u2l n5(m3z var0, u2l var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static List n5(m3z var0) {
      return var0.u9;
   }
}
