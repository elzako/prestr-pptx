package com.aspose.slides.internal.k4y;

public class c6v extends b3 {
   private int l6;
   private boolean k5;
   private boolean u3;
   private boolean a6;
   private boolean u9;
   private boolean h0;
   private boolean c8;
   private s4r t2;
   private x9m s7;
   public static final int n5 = e6v.n5("document");
   private static final com.aspose.slides.internal.v6g.u9 x8 = new com.aspose.slides.internal.v6g.u9(
      "text:index-scope",
      "text:relative-tab-stop-position",
      "text:use-spreadsheet-objects",
      "text:use-math-objects",
      "text:use-draw-objects",
      "text:use-chart-objects",
      "text:use-other-objects",
      "index-title-template",
      "object-index-entry-template"
   );

   public c6v(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      c6v$1 var2 = new c6v$1(this);
      n5(var1, var2);
      n5(var1, new c6v$2(this, var1));
   }

   public c6v() {
      this.l6();
   }

   private void l6() {
      this.l6 = n5;
      this.k5 = true;
      this.u3 = false;
      this.a6 = false;
      this.u9 = false;
      this.h0 = false;
      this.c8 = false;
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

      if (this.u3) {
         var2.l6("text:use-spreadsheet-objects", this.u3 ? "true" : "false");
      }

      if (this.a6) {
         var2.l6("text:use-math-objects", this.a6 ? "true" : "false");
      }

      if (this.u9) {
         var2.l6("text:use-draw-objects", this.u9 ? "true" : "false");
      }

      if (this.h0) {
         var2.l6("text:use-chart-objects", this.h0 ? "true" : "false");
      }

      if (this.c8) {
         var2.l6("text:use-other-objects", this.c8 ? "true" : "false");
      }

      if (this.t2 != null) {
         this.t2.n5("text", var2, "index-title-template");
      }

      if (this.s7 != null) {
         this.s7.n5("text", var2, "object-index-entry-template");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return x8;
   }

   // $VF: synthetic method
   static int n5(c6v var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(c6v var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(c6v var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean k5(c6v var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean u3(c6v var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean a6(c6v var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static boolean u9(c6v var0, boolean var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static s4r n5(c6v var0, s4r var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static x9m n5(c6v var0, x9m var1) {
      return var0.s7 = var1;
   }
}
