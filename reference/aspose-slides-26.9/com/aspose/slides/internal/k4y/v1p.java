package com.aspose.slides.internal.k4y;

public class v1p extends b3 {
   private String l6;
   private boolean k5;
   private int u3;
   private String a6;
   private String u9;
   public static final int n5 = z2t.n5("always");
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "draw:name", "draw:protected", "draw:display", "title", "desc"
   );

   public v1p(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      v1p$1 var2 = new v1p$1(this);
      n5(var1, var2);
      n5(var1, new v1p$2(this, var1));
   }

   public v1p() {
      this.u3();
   }

   private void u3() {
      this.k5 = false;
      this.u3 = n5;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != null) {
         var2.l6("draw:name", this.l6);
      }

      if (this.k5) {
         var2.l6("draw:protected", this.k5 ? "true" : "false");
      }

      if (this.u3 != n5) {
         var2.l6("draw:display", z2t.n5(this.u3));
      }

      if (this.a6 != null) {
         this.n5("svg", var2, "title", this.a6, false);
      }

      if (this.u9 != null) {
         this.n5("svg", var2, "desc", this.u9, false);
      }

      var2.s7();
   }

   public final String n5() {
      return this.l6;
   }

   public final int l6() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return h0;
   }

   // $VF: synthetic method
   static String n5(v1p var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(v1p var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(v1p var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String l6(v1p var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String n5(v1p var0) {
      return var0.a6;
   }

   // $VF: synthetic method
   static String k5(v1p var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String l6(v1p var0) {
      return var0.u9;
   }
}
