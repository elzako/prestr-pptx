package com.aspose.slides.internal.k4y;

public class t7b extends b3 {
   private int n5;
   private h6m l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("type", "extLst");

   public t7b(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      t7b$1 var2 = new t7b$1(this);
      n5(var1, var2);
      n5(var1, new t7b$2(this, var1));
   }

   public t7b() {
      this.u3();
   }

   private void u3() {
      this.n5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("type", b4j.n5(this.n5));
      }

      if (this.l6 != null) {
         this.l6.n5("cx", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(h6m var1) {
      this.l6 = var1;
   }

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final h6m l6() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static int n5(t7b var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static h6m n5(t7b var0, h6m var1) {
      return var0.l6 = var1;
   }
}
