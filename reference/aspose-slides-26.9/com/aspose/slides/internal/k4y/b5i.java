package com.aspose.slides.internal.k4y;

public class b5i extends b3 {
   private int n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "presentation:object", "svg:x", "svg:y", "svg:width", "svg:height"
   );

   public b5i(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      b5i$1 var2 = new b5i$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public b5i() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("presentation:object", w6n.n5(this.n5));
      var2.l6("svg:x", this.l6);
      var2.l6("svg:y", this.k5);
      var2.l6("svg:width", this.u3);
      var2.l6("svg:height", this.a6);
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u9;
   }

   // $VF: synthetic method
   static int n5(b5i var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(b5i var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(b5i var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(b5i var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(b5i var0, String var1) {
      return var0.a6 = var1;
   }
}
