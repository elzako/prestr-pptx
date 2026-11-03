package com.aspose.slides.internal.k4y;

public class s2c extends b3 {
   private String n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("w_Name");

   public s2c(com.aspose.slides.ms.System.Xml.c7 var1) {
      s2c$1 var2 = new s2c$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public s2c() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("w:name", this.n5);
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return l6;
   }

   // $VF: synthetic method
   static String n5(s2c var0, String var1) {
      return var0.n5 = var1;
   }
}
