package com.aspose.slides.internal.k4y;

public class k6l extends b3 {
   private m6v n5;
   private s0m l6;
   private s0m k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("fPr", "num", "den");

   public k6l(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new k6l$1(this, var1));
   }

   public k6l() {
      this.l6 = new s0m();
      this.k5 = new s0m();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("m", var2, "fPr");
      }

      this.l6.n5("m", var2, "num");
      this.k5.n5("m", var2, "den");
      var2.s7();
   }

   public final void n5(m6v var1) {
      this.n5 = var1;
   }

   public final m6v n5() {
      return this.n5;
   }

   public final s0m l6() {
      return this.l6;
   }

   public final s0m k5() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u3;
   }

   // $VF: synthetic method
   static m6v n5(k6l var0, m6v var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static s0m n5(k6l var0, s0m var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static s0m l6(k6l var0, s0m var1) {
      return var0.k5 = var1;
   }
}
