package com.aspose.slides.internal.k4y;

public class q4n extends b3 {
   private String n5;
   private int l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("w_Font", "w_Char");

   public q4n(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      q4n$1 var2 = new q4n$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public q4n() {
      this.l6();
   }

   private void l6() {
      this.l6 = 65535;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("w:font", this.n5);
      }

      if ((this.l6 & 65535) != 65535) {
         var2.l6("w:char", com.aspose.slides.ms.System.a3.n5(this.l6 & 65535 & 65535, "X4"));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(q4n var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int n5(q4n var0, int var1) {
      return var0.l6 = var1;
   }
}
