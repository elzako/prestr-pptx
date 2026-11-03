package com.aspose.slides.internal.k4y;

public class a9g extends b3 {
   private int n5;
   private String l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("w_Type", "w_Val");

   public a9g(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      a9g$1 var2 = new a9g$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public a9g() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("w:type", a3c.n5(this.n5));
      }

      if (this.l6 != null) {
         var2.l6("w:val", this.l6);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static int n5(a9g var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(a9g var0, String var1) {
      return var0.l6 = var1;
   }
}
