package com.aspose.slides.internal.k4y;

public class u1b extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "table:style-name", "table:paragraph-style-name", "text:style-name", "text:paragraph-style-name"
   );

   public u1b(com.aspose.slides.ms.System.Xml.c7 var1) {
      u1b$1 var2 = new u1b$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public u1b() {
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
   static String n5(u1b var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(u1b var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(u1b var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(u1b var0, String var1) {
      return var0.u3 = var1;
   }
}
