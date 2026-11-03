package com.aspose.slides.internal.k4y;

public class f3y extends b3 {
   private int n5;
   private String l6;
   private int k5;
   private int u3;
   private String a6;
   private int u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "w_EdGrp", "w_Ed", "w_ColFirst", "w_ColLast", "w_Id", "w_DisplacedByCustomXml"
   );

   public f3y(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      f3y$1 var2 = new f3y$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public f3y() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
      this.k5 = 0;
      this.u3 = 0;
      this.u9 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("w:edGrp", g8k.n5(this.n5));
      }

      if (this.l6 != null) {
         var2.l6("w:ed", this.l6);
      }

      if (this.k5 != 0) {
         var2.l6("w:colFirst", com.aspose.slides.ms.System.Xml.f4.n5(this.k5));
      }

      if (this.u3 != 0) {
         var2.l6("w:colLast", com.aspose.slides.ms.System.Xml.f4.n5(this.u3));
      }

      var2.l6("w:id", this.a6);
      if (this.u9 != 0) {
         var2.l6("w:displacedByCustomXml", g3z.n5(this.u9));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return h0;
   }

   // $VF: synthetic method
   static int n5(f3y var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(f3y var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int l6(f3y var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int k5(f3y var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String l6(f3y var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int u3(f3y var0, int var1) {
      return var0.u9 = var1;
   }
}
