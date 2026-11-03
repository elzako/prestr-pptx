package com.aspose.slides.internal.k4y;

public class c8j extends b3 {
   private boolean n5;
   private e4z l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("useDef", "dataModel");

   public c8j(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      c8j$1 var2 = new c8j$1(this);
      n5(var1, var2);
      n5(var1, new c8j$2(this, var1));
   }

   public c8j() {
      this.l6();
   }

   private void l6() {
      this.n5 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5) {
         var2.l6("useDef", this.n5 ? "1" : "0");
      }

      if (this.l6 != null) {
         this.l6.n5("dgm", var2, "dataModel");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static boolean n5(c8j var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static e4z n5(c8j var0, e4z var1) {
      return var0.l6 = var1;
   }
}
