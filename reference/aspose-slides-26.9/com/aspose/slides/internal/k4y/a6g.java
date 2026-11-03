package com.aspose.slides.internal.k4y;

public class a6g extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private u1x a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "table:cell-range", "svg:x", "svg:y", "chart:style-name", "p"
   );

   public a6g(com.aspose.slides.ms.System.Xml.c7 var1) {
      a6g$1 var2 = new a6g$1(this);
      n5(var1, var2);
      n5(var1, new a6g$2(this, var1));
   }

   public a6g() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("table:cell-range", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("svg:x", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("svg:y", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("chart:style-name", this.u3);
      }

      if (this.a6 != null) {
         this.a6.n5("text", var2, "p");
      }

      var2.s7();
   }

   public final String n5() {
      return this.u3;
   }

   public final u1x l6() {
      return this.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return u9;
   }

   // $VF: synthetic method
   static String n5(a6g var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(a6g var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(a6g var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(a6g var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static u1x n5(a6g var0, u1x var1) {
      return var0.a6 = var1;
   }
}
