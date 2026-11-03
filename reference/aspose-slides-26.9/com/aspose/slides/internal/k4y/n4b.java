package com.aspose.slides.internal.k4y;

public class n4b extends b3 {
   private int n5;
   private String l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("entityType", "entityId");

   public n4b(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      n4b$1 var2 = new n4b$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public n4b() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("entityType", u7o.n5(this.n5));
      var2.l6("entityId", this.l6);
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static int n5(n4b var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(n4b var0, String var1) {
      return var0.l6 = var1;
   }
}
