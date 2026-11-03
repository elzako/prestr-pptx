package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class x8f extends b3 {
   private int l6;
   private boolean k5;
   private String u3;
   private boolean a6;
   private boolean u9;
   private boolean h0;
   private boolean c8;
   private boolean t2;
   private boolean s7;
   private s4r x8;
   private List<g5s> n3;
   private List<p8x> y4;
   public static final int n5 = e6v.n5("document");
   private static final com.aspose.slides.internal.v6g.u9 e2 = new com.aspose.slides.internal.v6g.u9(
      "text:index-scope",
      "text:relative-tab-stop-position",
      "text:index-name",
      "text:use-index-marks",
      "text:use-graphics",
      "text:use-tables",
      "text:use-floating-frames",
      "text:use-objects",
      "text:copy-outline-levels",
      "index-title-template",
      "user-index-entry-template",
      "index-source-styles"
   );

   public x8f(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      x8f$1 var2 = new x8f$1(this);
      n5(var1, var2);
      n5(var1, new x8f$2(this, var1));
   }

   public x8f() {
      this.l6();
   }

   private void l6() {
      this.l6 = n5;
      this.k5 = true;
      this.a6 = false;
      this.u9 = false;
      this.h0 = false;
      this.c8 = false;
      this.t2 = false;
      this.s7 = false;
      this.n3 = new List<>();
      this.y4 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != n5) {
         var2.l6("text:index-scope", e6v.n5(this.l6));
      }

      if (!this.k5) {
         var2.l6("text:relative-tab-stop-position", this.k5 ? "true" : "false");
      }

      var2.l6("text:index-name", this.u3);
      if (this.a6) {
         var2.l6("text:use-index-marks", this.a6 ? "true" : "false");
      }

      if (this.u9) {
         var2.l6("text:use-graphics", this.u9 ? "true" : "false");
      }

      if (this.h0) {
         var2.l6("text:use-tables", this.h0 ? "true" : "false");
      }

      if (this.c8) {
         var2.l6("text:use-floating-frames", this.c8 ? "true" : "false");
      }

      if (this.t2) {
         var2.l6("text:use-objects", this.t2 ? "true" : "false");
      }

      if (this.s7) {
         var2.l6("text:copy-outline-levels", this.s7 ? "true" : "false");
      }

      if (this.x8 != null) {
         this.x8.n5("text", var2, "index-title-template");
      }

      List$Enumerator var4 = this.n3.iterator();

      try {
         while (var4.hasNext()) {
            g5s var5 = (g5s)var4.next();
            var5.n5("text", var2, "user-index-entry-template");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var14 = this.y4.iterator();

      try {
         while (var14.hasNext()) {
            p8x var6 = (p8x)var14.next();
            var6.n5("text", var2, "index-source-styles");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return e2;
   }

   // $VF: synthetic method
   static int n5(x8f var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(x8f var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String n5(x8f var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean l6(x8f var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean k5(x8f var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean u3(x8f var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static boolean a6(x8f var0, boolean var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean u9(x8f var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static boolean h0(x8f var0, boolean var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static s4r n5(x8f var0, s4r var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static List n5(x8f var0) {
      return var0.n3;
   }

   // $VF: synthetic method
   static List l6(x8f var0) {
      return var0.y4;
   }
}
