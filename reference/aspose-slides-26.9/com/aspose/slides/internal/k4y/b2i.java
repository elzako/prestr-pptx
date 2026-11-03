package com.aspose.slides.internal.k4y;

public class b2i extends b3 {
   private long n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private boolean u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "id", "divId", "sourceObject", "destinationFile", "title", "autoRepublish"
   );

   public b2i(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      b2i$1 var2 = new b2i$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public b2i() {
      this.l6();
   }

   private void l6() {
      this.u9 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("id", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      var2.l6("divId", this.l6);
      if (this.k5 != null) {
         var2.l6("sourceObject", this.k5);
      }

      var2.l6("destinationFile", this.u3);
      if (this.a6 != null) {
         var2.l6("title", this.a6);
      }

      if (this.u9) {
         var2.l6("autoRepublish", this.u9 ? "1" : "0");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return h0;
   }

   // $VF: synthetic method
   static long n5(b2i var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(b2i var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(b2i var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(b2i var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(b2i var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(b2i var0, boolean var1) {
      return var0.u9 = var1;
   }
}
