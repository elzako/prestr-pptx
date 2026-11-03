package com.aspose.slides.internal.k4y;

public class o5i extends b3 {
   private String n5;
   private String l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("text:name", "office:value-type");

   public o5i(com.aspose.slides.ms.System.Xml.c7 var1) {
      o5i$1 var2 = new o5i$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public o5i() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("text:name", this.n5);
      var2.l6("office:value-type", this.l6);
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(o5i var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(o5i var0, String var1) {
      return var0.l6 = var1;
   }
}
