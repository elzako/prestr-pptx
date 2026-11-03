package com.aspose.slides.internal.k4y;

public class n1e extends b3 {
   private int l6;
   private boolean k5;
   public static final int n5 = k3.n5("in");
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("dir", "hasBounce");

   public n1e(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      n1e$1 var2 = new n1e$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public n1e() {
      this.u3();
   }

   private void u3() {
      this.l6 = n5;
      this.k5 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != n5) {
         var2.l6("dir", k3.n5(this.l6));
      }

      if (this.k5) {
         var2.l6("hasBounce", this.k5 ? "1" : "0");
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

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return u3;
   }

   // $VF: synthetic method
   static int n5(n1e var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(n1e var0, boolean var1) {
      return var0.k5 = var1;
   }
}
