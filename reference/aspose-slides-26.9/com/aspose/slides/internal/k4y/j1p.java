package com.aspose.slides.internal.k4y;

public class j1p extends b3 {
   private int l6;
   private boolean k5;
   private boolean u3;
   public static final int n5 = k1.n5("l");
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("dir", "isContent", "isInverted");

   public j1p(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      j1p$1 var2 = new j1p$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public j1p() {
      this.a6();
   }

   private void a6() {
      this.l6 = n5;
      this.k5 = false;
      this.u3 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != n5) {
         var2.l6("dir", k1.n5(this.l6));
      }

      if (this.k5) {
         var2.l6("isContent", this.k5 ? "1" : "0");
      }

      if (this.u3) {
         var2.l6("isInverted", this.u3 ? "1" : "0");
      }

      var2.s7();
   }

   public final int n5() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   public final boolean l6() {
      return this.k5;
   }

   public final void n5(boolean var1) {
      this.k5 = var1;
   }

   public final boolean k5() {
      return this.u3;
   }

   public final void l6(boolean var1) {
      this.u3 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return a6;
   }

   // $VF: synthetic method
   static int n5(j1p var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(j1p var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(j1p var0, boolean var1) {
      return var0.u3 = var1;
   }
}
