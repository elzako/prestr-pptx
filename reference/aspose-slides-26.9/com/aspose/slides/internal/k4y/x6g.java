package com.aspose.slides.internal.k4y;

public class x6g extends b3 {
   private w3g n5;
   private s0m l6;
   private s0m k5;
   private s0m u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("naryPr", "sub", "sup", "e");

   public x6g(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new x6g$1(this, var1));
   }

   public x6g() {
      this.l6 = new s0m();
      this.k5 = new s0m();
      this.u3 = new s0m();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("m", var2, "naryPr");
      }

      this.l6.n5("m", var2, "sub");
      this.k5.n5("m", var2, "sup");
      this.u3.n5("m", var2, "e");
      var2.s7();
   }

   public final void n5(w3g var1) {
      this.n5 = var1;
   }

   public final w3g n5() {
      return this.n5;
   }

   public final s0m l6() {
      return this.l6;
   }

   public final s0m k5() {
      return this.k5;
   }

   public final s0m u3() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return a6;
   }

   // $VF: synthetic method
   static w3g n5(x6g var0, w3g var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static s0m n5(x6g var0, s0m var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static s0m l6(x6g var0, s0m var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static s0m k5(x6g var0, s0m var1) {
      return var0.u3 = var1;
   }
}
