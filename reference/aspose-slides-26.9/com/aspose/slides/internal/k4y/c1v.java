package com.aspose.slides.internal.k4y;

public class c1v extends b3 {
   private boolean n5;
   private boolean l6;
   private boolean k5;
   private boolean u3;
   private j9y a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("sldNum", "hdr", "ftr", "dt", "extLst");

   public c1v(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.h0();
      c1v$1 var2 = new c1v$1(this);
      n5(var1, var2);
      n5(var1, new c1v$2(this, var1));
   }

   public c1v() {
      this.h0();
   }

   private void h0() {
      this.n5 = true;
      this.l6 = true;
      this.k5 = true;
      this.u3 = true;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!this.n5) {
         var2.l6("sldNum", this.n5 ? "1" : "0");
      }

      if (!this.l6) {
         var2.l6("hdr", this.l6 ? "1" : "0");
      }

      if (!this.k5) {
         var2.l6("ftr", this.k5 ? "1" : "0");
      }

      if (!this.u3) {
         var2.l6("dt", this.u3 ? "1" : "0");
      }

      if (this.a6 != null) {
         this.a6.n5("p", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(x8 var1) {
      this.a6 = (j9y)var1;
   }

   public final boolean n5() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   public final boolean l6() {
      return this.l6;
   }

   public final void l6(boolean var1) {
      this.l6 = var1;
   }

   public final boolean k5() {
      return this.k5;
   }

   public final void k5(boolean var1) {
      this.k5 = var1;
   }

   public final boolean u3() {
      return this.u3;
   }

   public final void u3(boolean var1) {
      this.u3 = var1;
   }

   public final x8 a6() {
      return this.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return u9;
   }

   // $VF: synthetic method
   static boolean n5(c1v var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(c1v var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean k5(c1v var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean u3(c1v var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static j9y n5(c1v var0, j9y var1) {
      return var0.a6 = var1;
   }
}
