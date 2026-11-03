package com.aspose.slides.internal.k4y;

public class m2 extends b3 {
   private byte n5;
   private long l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("track", "time");

   public m2(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      m2$1 var2 = new m2$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public m2() {
      this.u3();
   }

   private void u3() {
      this.l6 = 0L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("track", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      if ((this.l6 & 4294967295L) != 0L) {
         var2.l6("time", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      }

      var2.s7();
   }

   public final byte n5() {
      return this.n5;
   }

   public final void n5(byte var1) {
      this.n5 = var1;
   }

   public final long l6() {
      return this.l6;
   }

   public final void n5(long var1) {
      this.l6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static byte n5(m2 var0, byte var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long n5(m2 var0, long var1) {
      return var0.l6 = var1;
   }
}
