package com.aspose.slides.internal.k4y;

public class g4m extends b3 {
   private int k5;
   private int u3;
   public static final int n5 = k1.n5("l");
   public static final int l6 = m0.n5("diamond");
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("dir", "pattern");

   public g4m(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      g4m$1 var2 = new g4m$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public g4m() {
      this.u3();
   }

   private void u3() {
      this.k5 = n5;
      this.u3 = l6;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.k5 != n5) {
         var2.l6("dir", k1.n5(this.k5));
      }

      if (this.u3 != l6) {
         var2.l6("pattern", m0.n5(this.u3));
      }

      var2.s7();
   }

   public final int n5() {
      return this.k5;
   }

   public final void n5(int var1) {
      this.k5 = var1;
   }

   public final int l6() {
      return this.u3;
   }

   public final void l6(int var1) {
      this.u3 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return a6;
   }

   // $VF: synthetic method
   static int n5(g4m var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int l6(g4m var0, int var1) {
      return var0.u3 = var1;
   }
}
