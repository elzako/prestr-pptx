package com.aspose.slides.internal.k4y;

public class h5w extends b3 {
   private u8x n5;
   private String l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("CommitmentTypeId", "AllSignedDataObjects");

   public h5w(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new h5w$1(this, var1));
   }

   public h5w() {
      this.n5 = new u8x();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("xd", var2, "CommitmentTypeId");
      this.n5("xd", var2, "AllSignedDataObjects", this.l6, false);
      var2.s7();
   }

   public final u8x n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return k5;
   }

   // $VF: synthetic method
   static u8x n5(h5w var0, u8x var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(h5w var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String n5(h5w var0) {
      return var0.l6;
   }
}
