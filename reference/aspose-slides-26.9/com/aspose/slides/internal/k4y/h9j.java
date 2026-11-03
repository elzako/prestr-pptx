package com.aspose.slides.internal.k4y;

public class h9j extends b3 {
   private l4x n5;
   private s0m l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("groupChrPr", "e");

   public h9j(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new h9j$1(this, var1));
   }

   public h9j() {
      this.l6 = new s0m();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("m", var2, "groupChrPr");
      }

      this.l6.n5("m", var2, "e");
      var2.s7();
   }

   public final void n5(l4x var1) {
      this.n5 = var1;
   }

   public final l4x n5() {
      return this.n5;
   }

   public final s0m l6() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static l4x n5(h9j var0, l4x var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static s0m n5(h9j var0, s0m var1) {
      return var0.l6 = var1;
   }
}
