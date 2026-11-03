package com.aspose.slides.internal.k4y;

public class j0b extends b3 {
   private String n5;
   private int l6;
   private String k5;
   private int u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "table:field-name", "table:member-type", "table:member-name", "table:type"
   );

   public j0b(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      j0b$1 var2 = new j0b$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public j0b() {
      this.l6();
   }

   private void l6() {
      this.l6 = 0;
      this.u3 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("table:field-name", this.n5);
      var2.l6("table:member-type", p7n.n5(this.l6));
      if (this.k5 != null) {
         var2.l6("table:member-name", this.k5);
      }

      var2.l6("table:type", f0o.n5(this.u3));
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static String n5(j0b var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int n5(j0b var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(j0b var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int l6(j0b var0, int var1) {
      return var0.u3 = var1;
   }
}
