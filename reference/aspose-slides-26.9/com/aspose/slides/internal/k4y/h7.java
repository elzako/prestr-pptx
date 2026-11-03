package com.aspose.slides.internal.k4y;

public class h7 extends b3 {
   private int n5;
   private int l6;
   private byte k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("seriesIdx", "categoryIdx", "bldStep");

   public h7(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      h7$1 var2 = new h7$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public h7() {
      this.l6();
   }

   private void l6() {
      this.n5 = -1;
      this.l6 = -1;
      this.k5 = 5;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != -1) {
         var2.l6("seriesIdx", com.aspose.slides.ms.System.Xml.f4.n5(this.n5));
      }

      if (this.l6 != -1) {
         var2.l6("categoryIdx", com.aspose.slides.ms.System.Xml.f4.n5(this.l6));
      }

      var2.l6("bldStep", i6.n5(this.k5));
      var2.s7();
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final void l6(int var1) {
      this.l6 = var1;
   }

   public final void n5(byte var1) {
      this.k5 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static int n5(h7 var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int l6(h7 var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static byte n5(h7 var0, byte var1) {
      return var0.k5 = var1;
   }
}
