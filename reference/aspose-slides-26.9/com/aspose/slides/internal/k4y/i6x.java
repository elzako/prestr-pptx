package com.aspose.slides.internal.k4y;

public class i6x extends b3 {
   private String n5;
   private String l6;
   private byte k5;
   private String u3;
   private y3y a6;
   private f5d u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "text:style-name", "text:name", "text:protected", "text:protection-key", "table-index-source", "index-body"
   );

   public i6x(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      i6x$1 var2 = new i6x$1(this);
      n5(var1, var2);
      n5(var1, new i6x$2(this, var1));
   }

   public i6x() {
      this.l6();
      this.a6 = new y3y();
      this.u9 = new f5d();
   }

   private void l6() {
      this.k5 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("text:style-name", this.n5);
      }

      var2.l6("text:name", this.l6);
      if (this.k5 != -1) {
         var2.l6("text:protected", this.k5 == 1 ? "true" : "false");
      }

      if (this.u3 != null) {
         var2.l6("text:protection-key", this.u3);
      }

      this.a6.n5("text", var2, "table-index-source");
      this.u9.n5("text", var2, "index-body");
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return h0;
   }

   // $VF: synthetic method
   static String n5(i6x var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(i6x var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static byte n5(i6x var0, byte var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(i6x var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static y3y n5(i6x var0, y3y var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static f5d n5(i6x var0, f5d var1) {
      return var0.u9 = var1;
   }
}
