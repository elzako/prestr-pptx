package com.aspose.slides.internal.k4y;

public class b8u extends b3 {
   private byte n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("val");

   public b8u(com.aspose.slides.ms.System.Xml.c7 var1) {
      b8u$1 var2 = new b8u$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public b8u() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("c14", var3, "http://schemas.microsoft.com/office/drawing/2007/8/2/chart");
      var2.l6("val", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
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
   static byte n5(b8u var0, byte var1) {
      return var0.n5 = var1;
   }
}
