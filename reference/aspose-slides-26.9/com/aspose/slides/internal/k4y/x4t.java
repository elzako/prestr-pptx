package com.aspose.slides.internal.k4y;

public class x4t extends b3 {
   private byte n5;
   private byte l6;
   private byte k5;
   private byte u3;
   private byte a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "connectorLines", "meanLine", "meanMarker", "nonoutliers", "outliers"
   );

   public x4t(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.h0();
      x4t$1 var2 = new x4t$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public x4t() {
      this.h0();
   }

   private void h0() {
      this.n5 = -1;
      this.l6 = -1;
      this.k5 = -1;
      this.u3 = -1;
      this.a6 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != -1) {
         var2.l6("connectorLines", this.n5 == 1 ? "1" : "0");
      }

      if (this.l6 != -1) {
         var2.l6("meanLine", this.l6 == 1 ? "1" : "0");
      }

      if (this.k5 != -1) {
         var2.l6("meanMarker", this.k5 == 1 ? "1" : "0");
      }

      if (this.u3 != -1) {
         var2.l6("nonoutliers", this.u3 == 1 ? "1" : "0");
      }

      if (this.a6 != -1) {
         var2.l6("outliers", this.a6 == 1 ? "1" : "0");
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

   public final byte u3() {
      return this.u3;
   }

   public final void u3(byte var1) {
      this.u3 = var1;
   }

   public final byte a6() {
      return this.a6;
   }

   public final void a6(byte var1) {
      this.a6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return u9;
   }

   // $VF: synthetic method
   static byte n5(x4t var0, byte var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static byte l6(x4t var0, byte var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static byte k5(x4t var0, byte var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static byte u3(x4t var0, byte var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static byte a6(x4t var0, byte var1) {
      return var0.a6 = var1;
   }
}
