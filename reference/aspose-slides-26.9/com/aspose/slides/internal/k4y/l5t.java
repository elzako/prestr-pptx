package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class l5t extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private boolean a6;
   private boolean u9;
   private long h0;
   private boolean c8;
   private String t2;
   private l7j s7;
   private c6x x8;
   private List<j5m> n3;
   private static final com.aspose.slides.internal.v6g.u9 y4 = new com.aspose.slides.internal.v6g.u9(
      "form:name",
      "form:control-implementation",
      "form:id",
      "xforms:bind",
      "form:disabled",
      "form:printable",
      "form:tab-index",
      "form:tab-stop",
      "form:title",
      "properties",
      "event-listeners",
      "column"
   );

   public l5t(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      l5t$1 var2 = new l5t$1(this);
      n5(var1, var2);
      n5(var1, new l5t$2(this, var1));
   }

   public l5t() {
      this.l6();
   }

   private void l6() {
      this.a6 = false;
      this.u9 = true;
      this.h0 = 0L;
      this.c8 = true;
      this.n3 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("form:name", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("form:control-implementation", this.l6);
      }

      var2.l6("form:id", this.k5);
      if (this.u3 != null) {
         var2.l6("xforms:bind", this.u3);
      }

      if (this.a6) {
         var2.l6("form:disabled", this.a6 ? "true" : "false");
      }

      if (!this.u9) {
         var2.l6("form:printable", this.u9 ? "true" : "false");
      }

      if ((this.h0 & 4294967295L) != 0L) {
         var2.l6("form:tab-index", com.aspose.slides.ms.System.Xml.f4.l6(this.h0));
      }

      if (!this.c8) {
         var2.l6("form:tab-stop", this.c8 ? "true" : "false");
      }

      if (this.t2 != null) {
         var2.l6("form:title", this.t2);
      }

      if (this.s7 != null) {
         this.s7.n5("form", var2, "properties");
      }

      if (this.x8 != null) {
         this.x8.n5("office", var2, "event-listeners");
      }

      List$Enumerator var4 = this.n3.iterator();

      try {
         while (var4.hasNext()) {
            j5m var5 = (j5m)var4.next();
            var5.n5("form", var2, "column");
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
      return y4;
   }

   // $VF: synthetic method
   static String n5(l5t var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(l5t var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(l5t var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(l5t var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean n5(l5t var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean l6(l5t var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static long n5(l5t var0, long var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static boolean k5(l5t var0, boolean var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String a6(l5t var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static l7j n5(l5t var0, l7j var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static c6x n5(l5t var0, c6x var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static List n5(l5t var0) {
      return var0.n3;
   }
}
