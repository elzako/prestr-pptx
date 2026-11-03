package com.aspose.slides.internal.k4y;

public class k4w extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "table:name", "table:source-name", "table:object-name", "table:user-name", "table:password"
   );

   public k4w(com.aspose.slides.ms.System.Xml.c7 var1) {
      k4w$1 var2 = new k4w$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public k4w() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("table:name", this.n5);
      var2.l6("table:source-name", this.l6);
      var2.l6("table:object-name", this.k5);
      if (this.u3 != null) {
         var2.l6("table:user-name", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("table:password", this.a6);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u9;
   }

   // $VF: synthetic method
   static String n5(k4w var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(k4w var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(k4w var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(k4w var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String a6(k4w var0, String var1) {
      return var0.a6 = var1;
   }
}
