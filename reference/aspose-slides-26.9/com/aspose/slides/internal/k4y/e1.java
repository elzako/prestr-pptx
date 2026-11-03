package com.aspose.slides.internal.k4y;

public class e1 extends b3 {
   private m2 n5;
   private m2 l6;
   private l8r k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("st", "end", "extLst");

   public e1(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new e1$1(this, var1));
   }

   public e1() {
      this.n5 = new m2();
      this.l6 = new m2();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("a", var2, "st");
      this.l6.n5("a", var2, "end");
      if (this.k5 != null) {
         this.k5.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final m2 n5() {
      return this.n5;
   }

   public final m2 l6() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return u3;
   }

   // $VF: synthetic method
   static m2 n5(e1 var0, m2 var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static m2 l6(e1 var0, m2 var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static l8r n5(e1 var0, l8r var1) {
      return var0.k5 = var1;
   }
}
