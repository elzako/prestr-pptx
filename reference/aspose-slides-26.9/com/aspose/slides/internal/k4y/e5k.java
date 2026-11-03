package com.aspose.slides.internal.k4y;

public class e5k extends b3 {
   private byte n5;
   private byte l6;
   private byte k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("seriesName", "categoryName", "value");

   public e5k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      e5k$1 var2 = new e5k$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public e5k() {
      this.a6();
   }

   private void a6() {
      this.n5 = -1;
      this.l6 = -1;
      this.k5 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != -1) {
         var2.l6("seriesName", this.n5 == 1 ? "1" : "0");
      }

      if (this.l6 != -1) {
         var2.l6("categoryName", this.l6 == 1 ? "1" : "0");
      }

      if (this.k5 != -1) {
         var2.l6("value", this.k5 == 1 ? "1" : "0");
      }

      var2.s7();
   }

   public final byte n5() {
      return this.n5;
   }

   public final void n5(byte var1) {
      this.n5 = var1;
   }

   public final byte l6() {
      return this.l6;
   }

   public final void l6(byte var1) {
      this.l6 = var1;
   }

   public final byte k5() {
      return this.k5;
   }

   public final void k5(byte var1) {
      this.k5 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u3;
   }

   // $VF: synthetic method
   static byte n5(e5k var0, byte var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static byte l6(e5k var0, byte var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static byte k5(e5k var0, byte var1) {
      return var0.k5 = var1;
   }
}
