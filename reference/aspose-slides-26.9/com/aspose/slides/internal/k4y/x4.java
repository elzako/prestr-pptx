package com.aspose.slides.internal.k4y;

public class x4 extends b3 {
   private boolean n5;
   private z4 l6;
   private z4 k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("useA", "clrFrom", "clrTo");

   public x4(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      x4$1 var2 = new x4$1(this);
      n5(var1, var2);
      n5(var1, new x4$2(this, var1));
   }

   public x4() {
      this.a6();
      this.l6 = new z4();
      this.k5 = new z4();
   }

   private void a6() {
      this.n5 = true;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!this.n5) {
         var2.l6("useA", this.n5 ? "1" : "0");
      }

      this.l6.n5("a", var2, "clrFrom");
      this.k5.n5("a", var2, "clrTo");
      var2.s7();
   }

   public final boolean n5() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   public final z4 l6() {
      return this.l6;
   }

   public final z4 k5() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u3;
   }

   // $VF: synthetic method
   static boolean n5(x4 var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static z4 n5(x4 var0, z4 var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static z4 l6(x4 var0, z4 var1) {
      return var0.k5 = var1;
   }
}
