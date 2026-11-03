package com.aspose.slides.internal.k4y;

public class g7p extends b3 {
   private byte n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("val");

   public g7p(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      g7p$1 var2 = new g7p$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public g7p() {
      this.k5();
   }

   private void k5() {
      this.n5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("val", com.aspose.slides.ms.System.Xml.f4.n5(this.n5));
      }

      var2.s7();
   }

   public final byte n5() {
      return this.n5;
   }

   public final void n5(byte var1) {
      this.n5 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return l6;
   }

   // $VF: synthetic method
   static byte n5(g7p var0, byte var1) {
      return var0.n5 = var1;
   }
}
