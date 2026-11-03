package com.aspose.slides.internal.k4y;

public class b1w extends b3 {
   private byte n5;
   private byte l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("locked", "hidden");

   public b1w(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      b1w$1 var2 = new b1w$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public b1w() {
      this.l6();
   }

   private void l6() {
      this.n5 = -1;
      this.l6 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != -1) {
         var2.l6("locked", this.n5 == 1 ? "1" : "0");
      }

      if (this.l6 != -1) {
         var2.l6("hidden", this.l6 == 1 ? "1" : "0");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static byte n5(b1w var0, byte var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static byte l6(b1w var0, byte var1) {
      return var0.l6 = var1;
   }
}
