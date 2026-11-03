package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class s8z extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private boolean u9;
   private long h0;
   private boolean c8;
   private boolean t2;
   private long s7;
   private boolean x8;
   private String n3;
   private String y4;
   private boolean e2;
   private String t9;
   private l7j z1;
   private c6x t4;
   private List<u1x> q0;
   private static final com.aspose.slides.internal.v6g.u9 z3 = new com.aspose.slides.internal.v6g.u9(
      "form:name",
      "form:control-implementation",
      "form:id",
      "xforms:bind",
      "form:current-value",
      "form:disabled",
      "form:max-length",
      "form:printable",
      "form:readonly",
      "form:tab-index",
      "form:tab-stop",
      "form:title",
      "form:value",
      "form:convert-empty-to-null",
      "form:data-field",
      "properties",
      "event-listeners",
      "p"
   );

   public s8z(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      s8z$1 var2 = new s8z$1(this);
      n5(var1, var2);
      n5(var1, new s8z$2(this, var1));
   }

   public s8z() {
      this.l6();
   }

   private void l6() {
      this.u9 = false;
      this.h0 = 4294967295L;
      this.c8 = true;
      this.t2 = false;
      this.s7 = 0L;
      this.x8 = true;
      this.e2 = false;
      this.q0 = new List<>();
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

      if ((this.h0 & 4294967295L) != 4294967295L) {
         var2.l6("form:max-length", com.aspose.slides.ms.System.Xml.f4.l6(this.h0));
      }

      if (!this.c8) {
         var2.l6("form:printable", this.c8 ? "true" : "false");
      }

      if (this.t2) {
         var2.l6("form:readonly", this.t2 ? "true" : "false");
      }

      if ((this.s7 & 4294967295L) != 0L) {
         var2.l6("form:tab-index", com.aspose.slides.ms.System.Xml.f4.l6(this.s7));
      }

      if (!this.x8) {
         var2.l6("form:tab-stop", this.x8 ? "true" : "false");
      }

      if (this.n3 != null) {
         var2.l6("form:title", this.n3);
      }

      var2.l6("form:value", this.y4);
      if (this.e2) {
         var2.l6("form:convert-empty-to-null", this.e2 ? "true" : "false");
      }

      if (this.t9 != null) {
         var2.l6("form:data-field", this.t9);
      }

      if (this.z1 != null) {
         this.z1.n5("form", var2, "properties");
      }

      if (this.t4 != null) {
         this.t4.n5("office", var2, "event-listeners");
      }

      List$Enumerator var4 = this.q0.iterator();

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
      return z3;
   }

   // $VF: synthetic method
   static String n5(s8z var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(s8z var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(s8z var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(s8z var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String a6(s8z var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(s8z var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static long n5(s8z var0, long var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static boolean l6(s8z var0, boolean var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean k5(s8z var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static long l6(s8z var0, long var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static boolean u3(s8z var0, boolean var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String u9(s8z var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String h0(s8z var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static boolean a6(s8z var0, boolean var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String c8(s8z var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static l7j n5(s8z var0, l7j var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static c6x n5(s8z var0, c6x var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static List n5(s8z var0) {
      return var0.q0;
   }
}
