package com.aspose.slides.internal.k4y;

public class g8h extends b3 {
   private String n5;
   private byte l6;
   private byte k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("table:name", "table:display", "table:show-details");

   public g8h(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      g8h$1 var2 = new g8h$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public g8h() {
      this.l6();
   }

   private void l6() {
      this.l6 = -1;
      this.k5 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("table:name", this.n5);
      if (this.l6 != -1) {
         var2.l6("table:display", this.l6 == 1 ? "true" : "false");
      }

      if (this.k5 != -1) {
         var2.l6("table:show-details", this.k5 == 1 ? "true" : "false");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(g8h var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static byte n5(g8h var0, byte var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static byte l6(g8h var0, byte var1) {
      return var0.k5 = var1;
   }
}
