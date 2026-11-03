package com.aspose.slides.internal.k4y;

public class q7j extends b3 {
   private String n5;
   private byte l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("r:id", "autoUpdate");

   public q7j(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      q7j$1 var2 = new q7j$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public q7j() {
      this.k5();
   }

   private void k5() {
      this.l6 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      var2.l6("r:id", this.n5);
      if (this.l6 != -1) {
         var2.l6("autoUpdate", this.l6 == 1 ? "1" : "0");
      }

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final void n5(byte var1) {
      this.l6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(q7j var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static byte n5(q7j var0, byte var1) {
      return var0.l6 = var1;
   }
}
