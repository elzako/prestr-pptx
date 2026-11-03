package com.aspose.slides.internal.k4y;

public class r3d extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "table:name", "table:cell-range-address", "table:base-cell-address", "table:range-usable-as"
   );

   public r3d(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      r3d$1 var2 = new r3d$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public r3d() {
      this.l6();
   }

   private void l6() {
      this.u3 = "none";
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("table:name", this.n5);
      var2.l6("table:cell-range-address", this.l6);
      if (this.k5 != null) {
         var2.l6("table:base-cell-address", this.k5);
      }

      if (!"none".equals(this.u3)) {
         var2.l6("table:range-usable-as", this.u3);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static String n5(r3d var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(r3d var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(r3d var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(r3d var0, String var1) {
      return var0.u3 = var1;
   }
}
