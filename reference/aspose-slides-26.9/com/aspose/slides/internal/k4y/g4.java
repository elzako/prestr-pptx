package com.aspose.slides.internal.k4y;

public class g4 extends b3 {
   private String n5;
   private boolean l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("bld", "animBg");

   public g4(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      g4$1 var2 = new g4$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public g4() {
      this.l6();
   }

   private void l6() {
      this.n5 = "allAtOnce";
      this.l6 = true;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!"allAtOnce".equals(this.n5)) {
         var2.l6("bld", this.n5);
      }

      if (!this.l6) {
         var2.l6("animBg", this.l6 ? "1" : "0");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(g4 var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(g4 var0, boolean var1) {
      return var0.l6 = var1;
   }
}
