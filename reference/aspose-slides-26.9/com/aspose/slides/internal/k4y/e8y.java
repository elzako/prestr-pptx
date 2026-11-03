package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class e8y extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private boolean u9;
   private boolean h0;
   private long c8;
   private boolean t2;
   private boolean s7;
   private long x8;
   private long n3;
   private boolean y4;
   private String e2;
   private String t9;
   private boolean z1;
   private String t4;
   private String q0;
   private int z3;
   private byte m1;
   private l7j k7;
   private c6x m3;
   private List<k0w> z8;
   private static final com.aspose.slides.internal.v6g.u9 j5 = new com.aspose.slides.internal.v6g.u9(
      "form:name",
      "form:control-implementation",
      "form:id",
      "xforms:bind",
      "form:current-value",
      "form:disabled",
      "form:dropdown",
      "form:max-length",
      "form:printable",
      "form:readonly",
      "form:size",
      "form:tab-index",
      "form:tab-stop",
      "form:title",
      "form:value",
      "form:convert-empty-to-null",
      "form:data-field",
      "form:list-source",
      "form:list-source-type",
      "form:auto-complete",
      "properties",
      "event-listeners",
      "item"
   );

   public e8y(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      e8y$1 var2 = new e8y$1(this);
      n5(var1, var2);
      n5(var1, new e8y$2(this, var1));
   }

   public e8y() {
      this.l6();
   }

   private void l6() {
      this.u9 = false;
      this.h0 = false;
      this.c8 = 4294967295L;
      this.t2 = true;
      this.s7 = false;
      this.x8 = 4294967295L;
      this.n3 = 0L;
      this.y4 = true;
      this.z1 = false;
      this.z3 = 0;
      this.m1 = -1;
      this.z8 = new List<>();
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

      var2.l6("form:current-value", this.a6);
      if (this.u9) {
         var2.l6("form:disabled", this.u9 ? "true" : "false");
      }

      if (this.h0) {
         var2.l6("form:dropdown", this.h0 ? "true" : "false");
      }

      if ((this.c8 & 4294967295L) != 4294967295L) {
         var2.l6("form:max-length", com.aspose.slides.ms.System.Xml.f4.l6(this.c8));
      }

      if (!this.t2) {
         var2.l6("form:printable", this.t2 ? "true" : "false");
      }

      if (this.s7) {
         var2.l6("form:readonly", this.s7 ? "true" : "false");
      }

      if ((this.x8 & 4294967295L) != 4294967295L) {
         var2.l6("form:size", com.aspose.slides.ms.System.Xml.f4.l6(this.x8));
      }

      if ((this.n3 & 4294967295L) != 0L) {
         var2.l6("form:tab-index", com.aspose.slides.ms.System.Xml.f4.l6(this.n3));
      }

      if (!this.y4) {
         var2.l6("form:tab-stop", this.y4 ? "true" : "false");
      }

      if (this.e2 != null) {
         var2.l6("form:title", this.e2);
      }

      var2.l6("form:value", this.t9);
      if (this.z1) {
         var2.l6("form:convert-empty-to-null", this.z1 ? "true" : "false");
      }

      if (this.t4 != null) {
         var2.l6("form:data-field", this.t4);
      }

      if (this.q0 != null) {
         var2.l6("form:list-source", this.q0);
      }

      if (this.z3 != 0) {
         var2.l6("form:list-source-type", k2b.n5(this.z3));
      }

      if (this.m1 != -1) {
         var2.l6("form:auto-complete", this.m1 == 1 ? "true" : "false");
      }

      if (this.k7 != null) {
         this.k7.n5("form", var2, "properties");
      }

      if (this.m3 != null) {
         this.m3.n5("office", var2, "event-listeners");
      }

      List$Enumerator var4 = this.z8.iterator();

      try {
         while (var4.hasNext()) {
            k0w var5 = (k0w)var4.next();
            var5.n5("form", var2, "item");
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
      return j5;
   }

   // $VF: synthetic method
   static String n5(e8y var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(e8y var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(e8y var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(e8y var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String a6(e8y var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(e8y var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean l6(e8y var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static long n5(e8y var0, long var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean k5(e8y var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static boolean u3(e8y var0, boolean var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static long l6(e8y var0, long var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static long k5(e8y var0, long var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static boolean a6(e8y var0, boolean var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String u9(e8y var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String h0(e8y var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static boolean u9(e8y var0, boolean var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String c8(e8y var0, String var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static String t2(e8y var0, String var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static int n5(e8y var0, int var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static byte n5(e8y var0, byte var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static l7j n5(e8y var0, l7j var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static c6x n5(e8y var0, c6x var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static List n5(e8y var0) {
      return var0.z8;
   }
}
