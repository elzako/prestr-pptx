package com.aspose.slides.internal.k4y;

public class l5u extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("xml:id", "traceDataRef", "from", "to");

   public l5u(com.aspose.slides.ms.System.Xml.c7 var1) {
      l5u$1 var2 = new l5u$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public l5u() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("xml:id", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("traceDataRef", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("from", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("to", this.u3);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static String n5(l5u var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(l5u var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(l5u var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(l5u var0, String var1) {
      return var0.u3 = var1;
   }
}
