package com.aspose.slides.internal.k4y;

public class u5j extends b3 {
   private String l6;
   private String k5;
   private String u3;
   private int a6;
   private boolean u9;
   public static final int n5 = x1k.n5("none");
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "table:function", "table:source-cell-range-addresses", "table:target-cell-address", "table:use-labels", "table:link-to-source-data"
   );

   public u5j(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      u5j$1 var2 = new u5j$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public u5j() {
      this.l6();
   }

   private void l6() {
      this.a6 = n5;
      this.u9 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("table:function", this.l6);
      var2.l6("table:source-cell-range-addresses", this.k5);
      var2.l6("table:target-cell-address", this.u3);
      if (this.a6 != n5) {
         var2.l6("table:use-labels", x1k.n5(this.a6));
      }

      if (this.u9) {
         var2.l6("table:link-to-source-data", this.u9 ? "true" : "false");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return h0;
   }

   // $VF: synthetic method
   static String n5(u5j var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(u5j var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(u5j var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int n5(u5j var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(u5j var0, boolean var1) {
      return var0.u9 = var1;
   }
}
