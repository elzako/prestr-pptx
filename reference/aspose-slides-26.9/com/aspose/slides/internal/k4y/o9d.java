package com.aspose.slides.internal.k4y;

public class o9d extends b3 {
   private f6p n5;
   private y6e l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("count", "mcJc");

   public o9d(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new o9d$1(this, var1));
   }

   public o9d() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("m", var2, "count");
      }

      if (this.l6 != null) {
         this.l6.n5("m", var2, "mcJc");
      }

      var2.s7();
   }

   public final void n5(f6p var1) {
      this.n5 = var1;
   }

   public final void n5(y6e var1) {
      this.l6 = var1;
   }

   public final f6p n5() {
      return this.n5;
   }

   public final y6e l6() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static f6p n5(o9d var0, f6p var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static y6e n5(o9d var0, y6e var1) {
      return var0.l6 = var1;
   }
}
