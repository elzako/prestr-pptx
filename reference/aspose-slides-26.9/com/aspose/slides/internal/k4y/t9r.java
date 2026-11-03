package com.aspose.slides.internal.k4y;

public class t9r extends b3 {
   private String n5;
   private int l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("w_Id", "w_DisplacedByCustomXml");

   public t9r(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      t9r$1 var2 = new t9r$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public t9r() {
      this.l6();
   }

   private void l6() {
      this.l6 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("w:id", this.n5);
      if (this.l6 != 0) {
         var2.l6("w:displacedByCustomXml", g3z.n5(this.l6));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(t9r var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int n5(t9r var0, int var1) {
      return var0.l6 = var1;
   }
}
