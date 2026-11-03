package com.aspose.slides.internal.k4y;

public class p6k extends b3 {
   private long n5;
   private long l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("cId", "sldId");

   public p6k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      p6k$1 var2 = new p6k$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public p6k() {
      this.l6();
   }

   private void l6() {
      this.n5 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("pc", var3, "http://schemas.microsoft.com/office/powerpoint/2013/main/command");
      if ((this.n5 & 4294967295L) != 4294967295L) {
         var2.l6("cId", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      }

      var2.l6("sldId", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      var2.s7();
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final void l6(long var1) {
      this.l6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static long n5(p6k var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long l6(p6k var0, long var1) {
      return var0.l6 = var1;
   }
}
