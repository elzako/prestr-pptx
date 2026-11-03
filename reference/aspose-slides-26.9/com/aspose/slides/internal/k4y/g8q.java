package com.aspose.slides.internal.k4y;

public class g8q extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("ref", "r:id", "location", "tooltip", "display");

   public g8q(com.aspose.slides.ms.System.Xml.c7 var1) {
      g8q$1 var2 = new g8q$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public g8q() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("ref", this.n5);
      if (this.l6 != null) {
         if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
         }

         var2.l6("r:id", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("location", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("tooltip", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("display", this.a6);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u9;
   }

   // $VF: synthetic method
   static String n5(g8q var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(g8q var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(g8q var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(g8q var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String a6(g8q var0, String var1) {
      return var0.a6 = var1;
   }
}
