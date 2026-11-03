package com.aspose.slides.internal.k4y;

public class p3x extends b3 {
   private String l6;
   private int k5;
   private String u3;
   private String a6;
   private String u9;
   private boolean h0;
   public static final int n5 = o5f.n5("into-default-style-data-style");
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "office:name", "office:conversion-mode", "office:dde-application", "office:dde-topic", "office:dde-item", "office:automatic-update"
   );

   public p3x(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      p3x$1 var2 = new p3x$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public p3x() {
      this.l6();
   }

   private void l6() {
      this.k5 = n5;
      this.h0 = true;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != null) {
         var2.l6("office:name", this.l6);
      }

      if (this.k5 != n5) {
         var2.l6("office:conversion-mode", o5f.n5(this.k5));
      }

      var2.l6("office:dde-application", this.u3);
      var2.l6("office:dde-topic", this.a6);
      var2.l6("office:dde-item", this.u9);
      if (!this.h0) {
         var2.l6("office:automatic-update", this.h0 ? "true" : "false");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return c8;
   }

   // $VF: synthetic method
   static String n5(p3x var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int n5(p3x var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(p3x var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String k5(p3x var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String u3(p3x var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean n5(p3x var0, boolean var1) {
      return var0.h0 = var1;
   }
}
