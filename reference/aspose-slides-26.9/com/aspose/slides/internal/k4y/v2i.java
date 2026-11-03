package com.aspose.slides.internal.k4y;

public class v2i extends b3 {
   private boolean n5;
   private boolean l6;
   private boolean k5;
   private boolean u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "autoRecover", "crashSave", "dataExtractLoad", "repairLoad"
   );

   public v2i(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      v2i$1 var2 = new v2i$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public v2i() {
      this.l6();
   }

   private void l6() {
      this.n5 = true;
      this.l6 = false;
      this.k5 = false;
      this.u3 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!this.n5) {
         var2.l6("autoRecover", this.n5 ? "1" : "0");
      }

      if (this.l6) {
         var2.l6("crashSave", this.l6 ? "1" : "0");
      }

      if (this.k5) {
         var2.l6("dataExtractLoad", this.k5 ? "1" : "0");
      }

      if (this.u3) {
         var2.l6("repairLoad", this.u3 ? "1" : "0");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static boolean n5(v2i var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(v2i var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean k5(v2i var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean u3(v2i var0, boolean var1) {
      return var0.u3 = var1;
   }
}
