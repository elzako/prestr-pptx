package com.aspose.slides.internal.k4y;

public class q6a extends b3 {
   private long n5;
   private String l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("spid", "bmkName");

   public q6a(com.aspose.slides.ms.System.Xml.c7 var1) {
      q6a$1 var2 = new q6a$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public q6a() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("spid", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      var2.l6("bmkName", this.l6);
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static long n5(q6a var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(q6a var0, String var1) {
      return var0.l6 = var1;
   }
}
