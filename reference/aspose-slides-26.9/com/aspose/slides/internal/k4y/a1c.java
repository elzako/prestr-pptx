package com.aspose.slides.internal.k4y;

public class a1c extends b3 {
   private boolean n5;
   private String l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("array");

   public a1c(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      a1c$1 var2 = new a1c$1(this);
      n5(var1, var2);
      if (!var1.m1()) {
         var1.u9();
         this.l6 = var1.z1();
      }
   }

   public a1c() {
      this.l6();
   }

   private void l6() {
      this.n5 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5) {
         var2.l6("array", this.n5 ? "1" : "0");
      }

      var2.l6(this.l6);
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static boolean n5(a1c var0, boolean var1) {
      return var0.n5 = var1;
   }
}
