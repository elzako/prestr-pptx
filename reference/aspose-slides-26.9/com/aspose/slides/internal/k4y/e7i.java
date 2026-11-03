package com.aspose.slides.internal.k4y;

public class e7i extends b3 {
   private int n5;
   private int l6;
   private int k5;
   private int u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("type", "side", "anchorx", "anchory");

   public e7i(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      e7i$1 var2 = new e7i$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public e7i() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
      this.l6 = 0;
      this.k5 = 0;
      this.u3 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("type", o6p.n5(this.n5));
      }

      if (this.l6 != 0) {
         var2.l6("side", h2u.n5(this.l6));
      }

      if (this.k5 != 0) {
         var2.l6("anchorx", n3h.n5(this.k5));
      }

      if (this.u3 != 0) {
         var2.l6("anchory", m2z.n5(this.u3));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static int n5(e7i var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int l6(e7i var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int k5(e7i var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int u3(e7i var0, int var1) {
      return var0.u3 = var1;
   }
}
