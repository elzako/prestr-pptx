package com.aspose.slides.internal.k4y;

public class q3d extends b3 {
   private String n5;
   private int l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("table:id", "table:position");

   public q3d(com.aspose.slides.ms.System.Xml.c7 var1) {
      q3d$1 var2 = new q3d$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public q3d() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("table:id", this.n5);
      var2.l6("table:position", com.aspose.slides.ms.System.Xml.f4.n5(this.l6));
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(q3d var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int n5(q3d var0, int var1) {
      return var0.l6 = var1;
   }
}
