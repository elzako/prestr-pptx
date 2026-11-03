package com.aspose.slides.internal.k4y;

public class l6g extends b3 {
   private String n5;
   private int l6;
   private boolean k5;
   private byte u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "table:cell-range-address", "table:direction", "table:contains-error", "table:marked-invalid"
   );

   public l6g(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      l6g$1 var2 = new l6g$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public l6g() {
      this.l6();
   }

   private void l6() {
      this.l6 = 0;
      this.k5 = false;
      this.u3 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("table:cell-range-address", this.n5);
      }

      if (this.l6 != 0) {
         var2.l6("table:direction", c9h.n5(this.l6));
      }

      if (this.k5) {
         var2.l6("table:contains-error", this.k5 ? "true" : "false");
      }

      if (this.u3 != -1) {
         var2.l6("table:marked-invalid", this.u3 == 1 ? "true" : "false");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static String n5(l6g var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int n5(l6g var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(l6g var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static byte n5(l6g var0, byte var1) {
      return var0.u3 = var1;
   }
}
