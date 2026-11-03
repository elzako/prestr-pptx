package com.aspose.slides.internal.k4y;

public class o0l extends b3 {
   private String n5;
   private long l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("type", "pri");

   public o0l(com.aspose.slides.ms.System.Xml.c7 var1) {
      o0l$1 var2 = new o0l$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public o0l() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("type", this.n5);
      var2.l6("pri", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(o0l var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long n5(o0l var0, long var1) {
      return var0.l6 = var1;
   }
}
