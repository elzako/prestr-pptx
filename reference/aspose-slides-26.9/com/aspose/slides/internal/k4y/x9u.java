package com.aspose.slides.internal.k4y;

public class x9u extends b3 {
   private boolean n5;
   private y4k l6;
   private s2b k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("varScale", "scale", "origin");

   public x9u(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      x9u$1 var2 = new x9u$1(this);
      n5(var1, var2);
      n5(var1, new x9u$2(this, var1));
   }

   public x9u() {
      this.a6();
      this.l6 = new y4k();
      this.k5 = new s2b();
   }

   private void a6() {
      this.n5 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5) {
         var2.l6("varScale", this.n5 ? "1" : "0");
      }

      this.l6.n5("p", var2, "scale");
      this.k5.n5("p", var2, "origin");
      var2.s7();
   }

   public final boolean n5() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   public final y4k l6() {
      return this.l6;
   }

   public final s2b k5() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u3;
   }

   // $VF: synthetic method
   static boolean n5(x9u var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static y4k n5(x9u var0, y4k var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static s2b n5(x9u var0, s2b var1) {
      return var0.k5 = var1;
   }
}
