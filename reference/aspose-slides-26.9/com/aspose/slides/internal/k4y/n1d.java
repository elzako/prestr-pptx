package com.aspose.slides.internal.k4y;

public class n1d extends b3 {
   private String n5;
   private boolean l6;
   private p1n k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("xml:id", "invertible", "mapping");

   public n1d(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      n1d$1 var2 = new n1d$1(this);
      n5(var1, var2);
      n5(var1, new n1d$2(this, var1));
   }

   public n1d() {
      this.l6();
      this.k5 = new p1n();
   }

   private void l6() {
      this.l6 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("xml:id", this.n5);
      }

      if (this.l6) {
         var2.l6("invertible", this.l6 ? "1" : "0");
      }

      this.k5.n5("inkml", var2, "mapping");
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(n1d var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(n1d var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static p1n n5(n1d var0, p1n var1) {
      return var0.k5 = var1;
   }
}
