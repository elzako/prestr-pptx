package com.aspose.slides.internal.k4y;

public class z2v extends b3 {
   private int n5;
   private long l6;
   private long k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("type", "size", "dxfId");

   public z2v(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      z2v$1 var2 = new z2v$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public z2v() {
      this.u3();
   }

   private void u3() {
      this.n5 = 0;
      this.l6 = 1L;
      this.k5 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("type", o9g.n5(this.n5));
      if ((this.l6 & 4294967295L) != 1L) {
         var2.l6("size", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      }

      if ((this.k5 & 4294967295L) != 4294967295L) {
         var2.l6("dxfId", com.aspose.slides.ms.System.Xml.f4.l6(this.k5));
      }

      var2.s7();
   }

   public final int n5() {
      return this.n5;
   }

   public final long l6() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return u3;
   }

   // $VF: synthetic method
   static int n5(z2v var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long n5(z2v var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static long l6(z2v var0, long var1) {
      return var0.k5 = var1;
   }
}
