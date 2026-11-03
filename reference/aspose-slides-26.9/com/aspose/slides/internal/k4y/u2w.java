package com.aspose.slides.internal.k4y;

public class u2w extends b3 {
   private boolean n5;
   private boolean l6;
   private o2b k5;
   private o2b u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("fMove", "fResize", "from", "to");

   public u2w(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      u2w$1 var2 = new u2w$1(this);
      n5(var1, var2);
      n5(var1, new u2w$2(this, var1));
   }

   public u2w() {
      this.l6();
      this.k5 = new o2b();
      this.u3 = new o2b();
   }

   private void l6() {
      this.n5 = false;
      this.l6 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5) {
         var2.l6("fMove", this.n5 ? "1" : "0");
      }

      if (this.l6) {
         var2.l6("fResize", this.l6 ? "1" : "0");
      }

      this.k5.n5("a", var2, "from");
      this.u3.n5("a", var2, "to");
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static boolean n5(u2w var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(u2w var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static o2b n5(u2w var0, o2b var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static o2b l6(u2w var0, o2b var1) {
      return var0.u3 = var1;
   }
}
