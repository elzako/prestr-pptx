package com.aspose.slides.internal.k4y;

public class f7q extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private boolean a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "office:name", "office:dde-application", "office:dde-topic", "office:dde-item", "office:automatic-update"
   );

   public f7q(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      f7q$1 var2 = new f7q$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public f7q() {
      this.l6();
   }

   private void l6() {
      this.a6 = true;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("office:name", this.n5);
      var2.l6("office:dde-application", this.l6);
      var2.l6("office:dde-topic", this.k5);
      var2.l6("office:dde-item", this.u3);
      if (!this.a6) {
         var2.l6("office:automatic-update", this.a6 ? "true" : "false");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u9;
   }

   // $VF: synthetic method
   static String n5(f7q var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(f7q var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(f7q var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(f7q var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean n5(f7q var0, boolean var1) {
      return var0.a6 = var1;
   }
}
