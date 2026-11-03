package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class i2h extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private boolean a6;
   private boolean u9;
   private boolean h0;
   private long c8;
   private long t2;
   private boolean s7;
   private String x8;
   private String n3;
   private String y4;
   private String e2;
   private int t9;
   private boolean z1;
   private String t4;
   private l7j q0;
   private c6x z3;
   private List<y6x> m1;
   private static final com.aspose.slides.internal.v6g.u9 k7 = new com.aspose.slides.internal.v6g.u9(
      "form:name",
      "form:control-implementation",
      "form:id",
      "xforms:bind",
      "form:disabled",
      "form:dropdown",
      "form:printable",
      "form:size",
      "form:tab-index",
      "form:tab-stop",
      "form:title",
      "form:bound-column",
      "form:data-field",
      "form:list-source",
      "form:list-source-type",
      "form:multiple",
      "form:xforms-list-source",
      "properties",
      "event-listeners",
      "option"
   );

   public i2h(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      i2h$1 var2 = new i2h$1(this);
      n5(var1, var2);
      n5(var1, new i2h$2(this, var1));
   }

   public i2h() {
      this.l6();
   }

   private void l6() {
      this.a6 = false;
      this.u9 = false;
      this.h0 = true;
      this.c8 = 4294967295L;
      this.t2 = 0L;
      this.s7 = true;
      this.t9 = 0;
      this.z1 = false;
      this.m1 = new List<>();
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

      if (this.u9) {
         var2.l6("form:dropdown", this.u9 ? "true" : "false");
      }

      if (!this.h0) {
         var2.l6("form:printable", this.h0 ? "true" : "false");
      }

      if ((this.c8 & 4294967295L) != 4294967295L) {
         var2.l6("form:size", com.aspose.slides.ms.System.Xml.f4.l6(this.c8));
      }

      if ((this.t2 & 4294967295L) != 0L) {
         var2.l6("form:tab-index", com.aspose.slides.ms.System.Xml.f4.l6(this.t2));
      }

      if (!this.s7) {
         var2.l6("form:tab-stop", this.s7 ? "true" : "false");
      }

      if (this.x8 != null) {
         var2.l6("form:title", this.x8);
      }

      if (this.n3 != null) {
         var2.l6("form:bound-column", this.n3);
      }

      if (this.y4 != null) {
         var2.l6("form:data-field", this.y4);
      }

      if (this.e2 != null) {
         var2.l6("form:list-source", this.e2);
      }

      if (this.t9 != 0) {
         var2.l6("form:list-source-type", k2b.n5(this.t9));
      }

      if (this.z1) {
         var2.l6("form:multiple", this.z1 ? "true" : "false");
      }

      if (this.t4 != null) {
         var2.l6("form:xforms-list-source", this.t4);
      }

      if (this.q0 != null) {
         this.q0.n5("form", var2, "properties");
      }

      if (this.z3 != null) {
         this.z3.n5("office", var2, "event-listeners");
      }

      List$Enumerator var4 = this.m1.iterator();

      try {
         while (var4.hasNext()) {
            y6x var5 = (y6x)var4.next();
            var5.n5("form", var2, "option");
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
      return k7;
   }

   // $VF: synthetic method
   static String n5(i2h var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(i2h var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(i2h var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(i2h var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean n5(i2h var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean l6(i2h var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean k5(i2h var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static long n5(i2h var0, long var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static long l6(i2h var0, long var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static boolean u3(i2h var0, boolean var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String a6(i2h var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String u9(i2h var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String h0(i2h var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String c8(i2h var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static int n5(i2h var0, int var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static boolean a6(i2h var0, boolean var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String t2(i2h var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static l7j n5(i2h var0, l7j var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static c6x n5(i2h var0, c6x var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static List n5(i2h var0) {
      return var0.m1;
   }
}
