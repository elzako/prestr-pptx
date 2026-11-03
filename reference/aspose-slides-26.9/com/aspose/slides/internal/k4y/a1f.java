package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class a1f extends b3 {
   private String l6;
   private boolean k5;
   private int u3;
   private List<u1x> a6;
   public static final int n5 = t3r.n5("stop");
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("table:title", "table:display", "table:message-type", "p");

   public a1f(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      a1f$1 var2 = new a1f$1(this);
      n5(var1, var2);
      n5(var1, new a1f$2(this, var1));
   }

   public a1f() {
      this.l6();
   }

   private void l6() {
      this.k5 = false;
      this.u3 = n5;
      this.a6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != null) {
         var2.l6("table:title", this.l6);
      }

      if (this.k5) {
         var2.l6("table:display", this.k5 ? "true" : "false");
      }

      if (this.u3 != n5) {
         var2.l6("table:message-type", t3r.n5(this.u3));
      }

      List$Enumerator var4 = this.a6.iterator();

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
      return u9;
   }

   // $VF: synthetic method
   static String n5(a1f var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(a1f var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(a1f var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static List n5(a1f var0) {
      return var0.a6;
   }
}
