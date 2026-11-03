package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class o1n extends b3 {
   private int l6;
   private boolean k5;
   private boolean u3;
   private boolean a6;
   private List<x8c> u9;
   public static final int n5 = z6c.n5("3TrafficLights1");
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9("iconSet", "showValue", "percent", "reverse", "cfvo");

   public o1n(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      o1n$1 var2 = new o1n$1(this);
      n5(var1, var2);
      n5(var1, new o1n$2(this, var1));
   }

   public o1n() {
      this.l6();
   }

   private void l6() {
      this.l6 = n5;
      this.k5 = true;
      this.u3 = true;
      this.a6 = false;
      this.u9 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != n5) {
         var2.l6("iconSet", z6c.n5(this.l6));
      }

      if (!this.k5) {
         var2.l6("showValue", this.k5 ? "1" : "0");
      }

      if (!this.u3) {
         var2.l6("percent", this.u3 ? "1" : "0");
      }

      if (this.a6) {
         var2.l6("reverse", this.a6 ? "1" : "0");
      }

      List$Enumerator var4 = this.u9.iterator();

      try {
         while (var4.hasNext()) {
            x8c var5 = (x8c)var4.next();
            var5.n5("ssml", var2, "cfvo");
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
      return h0;
   }

   // $VF: synthetic method
   static int n5(o1n var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(o1n var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(o1n var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean k5(o1n var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static List n5(o1n var0) {
      return var0.u9;
   }
}
