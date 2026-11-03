package com.aspose.slides.internal.k4y;

public class v6a extends b3 {
   private int l6;
   private boolean k5;
   private boolean u3;
   private String a6;
   private int u9;
   private s4r h0;
   private x9m c8;
   public static final int n5 = e6v.n5("document");
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "text:index-scope",
      "text:relative-tab-stop-position",
      "text:use-caption",
      "text:caption-sequence-name",
      "text:caption-sequence-format",
      "index-title-template",
      "illustration-index-entry-template"
   );

   public v6a(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      v6a$1 var2 = new v6a$1(this);
      n5(var1, var2);
      n5(var1, new v6a$2(this, var1));
   }

   public v6a() {
      this.l6();
   }

   private void l6() {
      this.l6 = n5;
      this.k5 = true;
      this.u3 = true;
      this.u9 = 0;
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

      if (!this.u3) {
         var2.l6("text:use-caption", this.u3 ? "true" : "false");
      }

      if (this.a6 != null) {
         var2.l6("text:caption-sequence-name", this.a6);
      }

      if (this.u9 != 0) {
         var2.l6("text:caption-sequence-format", p7p.n5(this.u9));
      }

      if (this.h0 != null) {
         this.h0.n5("text", var2, "index-title-template");
      }

      if (this.c8 != null) {
         this.c8.n5("text", var2, "illustration-index-entry-template");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return t2;
   }

   // $VF: synthetic method
   static int n5(v6a var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(v6a var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(v6a var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String n5(v6a var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int l6(v6a var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static s4r n5(v6a var0, s4r var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static x9m n5(v6a var0, x9m var1) {
      return var0.c8 = var1;
   }
}
