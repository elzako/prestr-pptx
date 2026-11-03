package com.aspose.slides.internal.k4y;

public class w3v extends b3 {
   private c4t n5;
   private s1o l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("cNvPr", "cNvPicPr");

   public w3v(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new w3v$1(this, var1));
   }

   public w3v() {
      this.n5 = new c4t();
      this.l6 = new s1o();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("xdr", var2, "cNvPr");
      this.l6.n5("xdr", var2, "cNvPicPr");
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static c4t n5(w3v var0, c4t var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static s1o n5(w3v var0, s1o var1) {
      return var0.l6 = var1;
   }
}
