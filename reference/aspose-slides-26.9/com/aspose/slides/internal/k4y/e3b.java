package com.aspose.slides.internal.k4y;

public class e3b extends b3 {
   private boolean n5;
   private c7e l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("isNarration", "cMediaNode");

   public e3b(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      e3b$1 var2 = new e3b$1(this);
      n5(var1, var2);
      n5(var1, new e3b$2(this, var1));
   }

   public e3b() {
      this.u3();
      this.l6 = new c7e();
   }

   private void u3() {
      this.n5 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5) {
         var2.l6("isNarration", this.n5 ? "1" : "0");
      }

      this.l6.n5("p", var2, "cMediaNode");
      var2.s7();
   }

   public final boolean n5() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   public final c7e l6() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static boolean n5(e3b var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static c7e n5(e3b var0, c7e var1) {
      return var0.l6 = var1;
   }
}
