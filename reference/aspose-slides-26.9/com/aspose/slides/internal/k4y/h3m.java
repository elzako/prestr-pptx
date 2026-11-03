package com.aspose.slides.internal.k4y;

public class h3m extends b3 {
   private h7z n5;
   private l8r l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("sz", "extLst");

   public h3m(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new h3m$1(this, var1));
   }

   public h3m() {
      this.n5 = new h7z();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("am3d", var2, "sz");
      if (this.l6 != null) {
         this.l6.n5("am3d", var2, "extLst");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static h7z n5(h3m var0, h7z var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static l8r n5(h3m var0, l8r var1) {
      return var0.l6 = var1;
   }
}
