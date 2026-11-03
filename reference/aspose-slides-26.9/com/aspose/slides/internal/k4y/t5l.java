package com.aspose.slides.internal.k4y;

public class t5l extends b3 {
   private int n5;
   private String l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("xml_Space");

   public t5l(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      t5l$1 var2 = new t5l$1(this);
      n5(var1, var2);
      if (!var1.m1()) {
         var1.u9();
         this.l6 = var1.z1();
      }
   }

   public t5l() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("xml:space", y7.n5(this.n5));
      }

      var2.l6(this.l6);
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static int n5(t5l var0, int var1) {
      return var0.n5 = var1;
   }
}
