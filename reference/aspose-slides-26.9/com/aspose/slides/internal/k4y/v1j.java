package com.aspose.slides.internal.k4y;

public class v1j extends b3 {
   private int n5;
   private long l6;
   private long k5;
   private v3t u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("wrapText", "distL", "distR", "wrapPolygon");

   public v1j(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      v1j$1 var2 = new v1j$1(this);
      n5(var1, var2);
      n5(var1, new v1j$2(this, var1));
   }

   public v1j() {
      this.l6();
      this.u3 = new v3t();
   }

   private void l6() {
      this.n5 = 0;
      this.l6 = 4294967295L;
      this.k5 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("wrapText", f8u.n5(this.n5));
      if ((this.l6 & 4294967295L) != 4294967295L) {
         var2.l6("distL", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      }

      if ((this.k5 & 4294967295L) != 4294967295L) {
         var2.l6("distR", com.aspose.slides.ms.System.Xml.f4.l6(this.k5));
      }

      this.u3.n5("wp", var2, "wrapPolygon");
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static int n5(v1j var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long n5(v1j var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static long l6(v1j var0, long var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static v3t n5(v1j var0, v3t var1) {
      return var0.u3 = var1;
   }
}
