package com.aspose.slides.internal.k4y;

public class n7e extends b3 {
   private String n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("xlink:href");

   public n7e(com.aspose.slides.ms.System.Xml.c7 var1) {
      n7e$1 var2 = new n7e$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public n7e() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("xlink:href", this.n5);
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return l6;
   }

   // $VF: synthetic method
   static String n5(n7e var0, String var1) {
      return var0.n5 = var1;
   }
}
