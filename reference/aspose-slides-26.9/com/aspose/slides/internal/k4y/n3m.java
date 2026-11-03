package com.aspose.slides.internal.k4y;

public class n3m extends b3 {
   private byte n5;
   private String l6;
   private String k5;
   private u2q u3;
   private k7v a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("transition", "filter", "prLst", "cBhvr", "progress");

   public n3m(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.h0();
      n3m$1 var2 = new n3m$1(this);
      n5(var1, var2);
      n5(var1, new n3m$2(this, var1));
   }

   public n3m() {
      this.h0();
      this.u3 = new u2q();
   }

   private void h0() {
      this.n5 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != -1) {
         var2.l6("transition", i2.n5(this.n5));
      }

      if (this.l6 != null) {
         var2.l6("filter", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("prLst", this.k5);
      }

      this.u3.n5("p", var2, "cBhvr");
      if (this.a6 != null) {
         this.a6.n5("p", var2, "progress");
      }

      var2.s7();
   }

   public final byte n5() {
      return this.n5;
   }

   public final void n5(byte var1) {
      this.n5 = var1;
   }

   public final String l6() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final String k5() {
      return this.k5;
   }

   public final void l6(String var1) {
      this.k5 = var1;
   }

   public final u2q u3() {
      return this.u3;
   }

   public final k7v a6() {
      return this.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return u9;
   }

   // $VF: synthetic method
   static byte n5(n3m var0, byte var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(n3m var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(n3m var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static u2q n5(n3m var0, u2q var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static k7v n5(n3m var0, k7v var1) {
      return var0.a6 = var1;
   }
}
