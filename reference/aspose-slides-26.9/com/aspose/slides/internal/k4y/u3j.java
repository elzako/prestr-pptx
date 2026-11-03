package com.aspose.slides.internal.k4y;

public class u3j extends b3 {
   private int n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("w_Val");

   public u3j(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      u3j$1 var2 = new u3j$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public u3j() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("w:val", n3n.n5(this.n5));
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return l6;
   }

   // $VF: synthetic method
   static int n5(u3j var0, int var1) {
      return var0.n5 = var1;
   }
}
