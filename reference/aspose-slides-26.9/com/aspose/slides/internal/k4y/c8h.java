package com.aspose.slides.internal.k4y;

public class c8h extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "table:style-name", "table:paragraph-style-name", "text:style-name", "text:paragraph-style-name"
   );

   public c8h(com.aspose.slides.ms.System.Xml.c7 var1) {
      c8h$1 var2 = new c8h$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public c8h() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("table:style-name", this.n5);
      var2.l6("table:paragraph-style-name", this.l6);
      var2.l6("text:style-name", this.k5);
      var2.l6("text:paragraph-style-name", this.u3);
      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final String l6() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return a6;
   }

   // $VF: synthetic method
   static String n5(c8h var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(c8h var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(c8h var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(c8h var0, String var1) {
      return var0.u3 = var1;
   }
}
