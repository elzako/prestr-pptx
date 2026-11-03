package com.aspose.slides.internal.k4y;

public class e5g extends b3 {
   private boolean n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "draw:recreate-on-edit", "svg:width", "svg:height", "svg:viewBox", "draw:points"
   );

   public e5g(com.aspose.slides.ms.System.Xml.c7 var1) {
      e5g$1 var2 = new e5g$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public e5g() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("draw:recreate-on-edit", this.n5 ? "true" : "false");
      if (this.l6 != null) {
         var2.l6("svg:width", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("svg:height", this.k5);
      }

      var2.l6("svg:viewBox", this.u3);
      var2.l6("draw:points", this.a6);
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u9;
   }

   // $VF: synthetic method
   static boolean n5(e5g var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(e5g var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(e5g var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(e5g var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(e5g var0, String var1) {
      return var0.a6 = var1;
   }
}
