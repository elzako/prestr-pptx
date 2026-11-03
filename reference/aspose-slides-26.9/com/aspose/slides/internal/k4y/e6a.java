package com.aspose.slides.internal.k4y;

public class e6a extends b3 {
   private g3y n5;
   private g3y l6;
   private g3y k5;
   private g3y u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("l", "t", "r", "b");

   public e6a(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new e6a$1(this, var1));
   }

   public e6a() {
      this.n5 = new g3y();
      this.l6 = new g3y();
      this.k5 = new g3y();
      this.u3 = new g3y();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("a", var2, "l");
      this.l6.n5("a", var2, "t");
      this.k5.n5("a", var2, "r");
      this.u3.n5("a", var2, "b");
      var2.s7();
   }

   public final g3y n5() {
      return this.n5;
   }

   public final g3y l6() {
      return this.l6;
   }

   public final g3y k5() {
      return this.k5;
   }

   public final g3y u3() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return a6;
   }

   // $VF: synthetic method
   static g3y n5(e6a var0, g3y var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static g3y l6(e6a var0, g3y var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static g3y k5(e6a var0, g3y var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static g3y u3(e6a var0, g3y var1) {
      return var0.u3 = var1;
   }
}
