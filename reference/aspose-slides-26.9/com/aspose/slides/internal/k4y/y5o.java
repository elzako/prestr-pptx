package com.aspose.slides.internal.k4y;

public class y5o extends b3 {
   private String l6;
   private int k5;
   private int u3;
   public static final int n5 = v5w.n5("simple");
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("xlink:href", "xlink:type", "xlink:actuate");

   public y5o(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      y5o$1 var2 = new y5o$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public y5o() {
      this.l6();
   }

   private void l6() {
      this.k5 = n5;
      this.u3 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("xlink:href", this.l6);
      if (this.k5 != n5) {
         var2.l6("xlink:type", v5w.n5(this.k5));
      }

      if (this.u3 != 0) {
         var2.l6("xlink:actuate", p9c.n5(this.u3));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static String n5(y5o var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int n5(y5o var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int l6(y5o var0, int var1) {
      return var0.u3 = var1;
   }
}
