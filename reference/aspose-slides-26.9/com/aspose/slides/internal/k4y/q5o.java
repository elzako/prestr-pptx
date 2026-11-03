package com.aspose.slides.internal.k4y;

public class q5o extends b3 {
   private String n5;
   private String l6;
   private boolean k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9(
      "table:database-name", "table:sql-statement", "table:parse-sql-statement"
   );

   public q5o(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      q5o$1 var2 = new q5o$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public q5o() {
      this.l6();
   }

   private void l6() {
      this.k5 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("table:database-name", this.n5);
      var2.l6("table:sql-statement", this.l6);
      if (this.k5) {
         var2.l6("table:parse-sql-statement", this.k5 ? "true" : "false");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(q5o var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(q5o var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(q5o var0, boolean var1) {
      return var0.k5 = var1;
   }
}
