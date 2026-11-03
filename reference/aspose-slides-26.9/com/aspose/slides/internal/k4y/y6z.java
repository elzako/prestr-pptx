package com.aspose.slides.internal.k4y;

public class y6z extends b3 {
   private String l6;
   private int k5;
   public static final int n5 = v5w.n5("simple");
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("xlink:href", "xlink:type");

   public y6z(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      y6z$1 var2 = new y6z$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public y6z() {
      this.l6();
   }

   private void l6() {
      this.k5 = n5;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("xlink:href", this.l6);
      if (this.k5 != n5) {
         var2.l6("xlink:type", v5w.n5(this.k5));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(y6z var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int n5(y6z var0, int var1) {
      return var0.k5 = var1;
   }
}
