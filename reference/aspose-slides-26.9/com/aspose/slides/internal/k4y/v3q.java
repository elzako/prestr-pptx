package com.aspose.slides.internal.k4y;

public class v3q extends b3 {
   private boolean n5;
   private String l6;
   private long k5;
   private int u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "table:enabled", "table:data-field", "table:member-count", "table:display-member-mode"
   );

   public v3q(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      v3q$1 var2 = new v3q$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public v3q() {
      this.l6();
   }

   private void l6() {
      this.u3 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("table:enabled", this.n5 ? "true" : "false");
      var2.l6("table:data-field", this.l6);
      var2.l6("table:member-count", com.aspose.slides.ms.System.Xml.f4.l6(this.k5));
      var2.l6("table:display-member-mode", e7c.n5(this.u3));
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static boolean n5(v3q var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(v3q var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static long n5(v3q var0, long var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(v3q var0, int var1) {
      return var0.u3 = var1;
   }
}
