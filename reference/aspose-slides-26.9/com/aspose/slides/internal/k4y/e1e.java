package com.aspose.slides.internal.k4y;

public class e1e extends b3 {
   private String n5;
   private String l6;
   private byte k5;
   private String u3;
   private v6a a6;
   private f5d u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "text:style-name", "text:name", "text:protected", "text:protection-key", "illustration-index-source", "index-body"
   );

   public e1e(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      e1e$1 var2 = new e1e$1(this);
      n5(var1, var2);
      n5(var1, new e1e$2(this, var1));
   }

   public e1e() {
      this.l6();
      this.a6 = new v6a();
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

      this.a6.n5("text", var2, "illustration-index-source");
      this.u9.n5("text", var2, "index-body");
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return h0;
   }

   // $VF: synthetic method
   static String n5(e1e var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(e1e var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static byte n5(e1e var0, byte var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(e1e var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static v6a n5(e1e var0, v6a var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static f5d n5(e1e var0, f5d var1) {
      return var0.u9 = var1;
   }
}
