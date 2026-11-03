package com.aspose.slides.internal.k4y;

public class v1l extends b3 {
   private int l6;
   public static final int n5 = g3g.n5("short");
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("number:style");

   public v1l(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      v1l$1 var2 = new v1l$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public v1l() {
      this.l6();
   }

   private void l6() {
      this.l6 = n5;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != n5) {
         var2.l6("number:style", g3g.n5(this.l6));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static int n5(v1l var0, int var1) {
      return var0.l6 = var1;
   }
}
