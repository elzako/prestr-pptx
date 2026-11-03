package com.aspose.slides.internal.k4y;

public class x8c extends b3 {
   private int n5;
   private String l6;
   private boolean k5;
   private l0k u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("type", "val", "gte", "extLst");

   public x8c(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      x8c$1 var2 = new x8c$1(this);
      n5(var1, var2);
      n5(var1, new x8c$2(this, var1));
   }

   public x8c() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
      this.k5 = true;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("type", t4l.n5(this.n5));
      if (this.l6 != null) {
         var2.l6("val", this.l6);
      }

      if (!this.k5) {
         var2.l6("gte", this.k5 ? "1" : "0");
      }

      if (this.u3 != null) {
         this.u3.n5("ssml", var2, "extLst");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static int n5(x8c var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(x8c var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(x8c var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static l0k n5(x8c var0, l0k var1) {
      return var0.u3 = var1;
   }
}
