package com.aspose.slides.internal.k4y;

public class k4o extends b3 {
   private byte n5;
   private int l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("type", "startAt");

   public k4o(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      k4o$1 var2 = new k4o$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public k4o() {
      this.u3();
   }

   private void u3() {
      this.n5 = 3;
      this.l6 = 1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("type", j1.n5(this.n5));
      if (this.l6 != 1) {
         var2.l6("startAt", com.aspose.slides.ms.System.Xml.f4.n5(this.l6));
      }

      var2.s7();
   }

   public final byte n5() {
      return this.n5;
   }

   public final void n5(byte var1) {
      this.n5 = var1;
   }

   public final int l6() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static byte n5(k4o var0, byte var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int n5(k4o var0, int var1) {
      return var0.l6 = var1;
   }
}
