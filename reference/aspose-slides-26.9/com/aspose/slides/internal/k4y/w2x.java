package com.aspose.slides.internal.k4y;

public class w2x extends b3 {
   private long n5;
   private String l6;
   private int k5;
   private String u3;
   private String a6;
   private String u9;
   private String h0;
   private boolean c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "id", "divId", "sourceType", "sourceRef", "sourceObject", "destinationFile", "title", "autoRepublish"
   );

   public w2x(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      w2x$1 var2 = new w2x$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public w2x() {
      this.l6();
   }

   private void l6() {
      this.k5 = 0;
      this.c8 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("id", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      var2.l6("divId", this.l6);
      var2.l6("sourceType", z4q.n5(this.k5));
      if (this.u3 != null) {
         var2.l6("sourceRef", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("sourceObject", this.a6);
      }

      var2.l6("destinationFile", this.u9);
      if (this.h0 != null) {
         var2.l6("title", this.h0);
      }

      if (this.c8) {
         var2.l6("autoRepublish", this.c8 ? "1" : "0");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return t2;
   }

   // $VF: synthetic method
   static long n5(w2x var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(w2x var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int n5(w2x var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(w2x var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String k5(w2x var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u3(w2x var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String a6(w2x var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static boolean n5(w2x var0, boolean var1) {
      return var0.c8 = var1;
   }
}
