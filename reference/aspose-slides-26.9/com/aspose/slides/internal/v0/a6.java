package com.aspose.slides.internal.v0;

public class a6 implements y4 {
   private com.aspose.slides.internal.i1.u9 n5;
   private e2 l6;

   public a6(com.aspose.slides.internal.i1.u9 var1) {
      this.n5 = var1;
   }

   private e2 n5() {
      if (this.l6 == null) {
         this.l6 = u9.n5(this.n5);
      }

      return this.l6;
   }

   @Override
   public final void n5(Object var1, s7 var2, s7 var3) {
      this.n5().n5(var1, var2, var3);
   }

   @Override
   public final void n5(Object var1, char var2, String var3) {
      this.n5().n5(var1, var2, var3);
   }
}
