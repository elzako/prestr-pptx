package com.aspose.slides.internal.k4y;

public class s1i extends b3 {
   private int n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("w_Val");

   public s1i(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      s1i$1 var2 = new s1i$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public s1i() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("w:val", p6l.n5(this.n5));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return l6;
   }

   // $VF: synthetic method
   static int n5(s1i var0, int var1) {
      return var0.n5 = var1;
   }
}
