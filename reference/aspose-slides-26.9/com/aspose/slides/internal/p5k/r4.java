package com.aspose.slides.internal.p5k;

public class r4 extends d2 {
   private int n5;
   private int l6;

   public r4(l6 var1) {
      super(var1);
   }

   public final void n5() {
      this.u9().n5(false, false);
      this.u9().l6(0, 5, true);
   }

   public final void n5(int var1, int var2) {
      this.u9().n5(false, false);
      this.u9().n5(false, false);
      this.u9().n5(false, false);
      this.u9().n5(false, false);
      this.u9().n5(false, false);
      this.u9().n5(true, false);
      int var3 = com.aspose.slides.internal.p5k.n5.n5(new int[]{var1, var2});
      this.u9().l6(var3, 5, false);
      this.u9().n5(var1, var3, false);
      this.u9().n5(var2, var3, false);
      this.n5 = var1;
      this.l6 = var2;
   }

   public final void l6() {
      this.u9().n5(false, false);
      this.u9().n5(false, false);
      this.u9().n5(true, false);
      this.u9().n5(false, false);
      this.u9().n5(false, false);
      this.u9().n5(false, false);
      this.u9().l6(1, 1, false);
   }

   public final void k5() {
      this.u9().n5(false, false);
      this.u9().n5(false, false);
      this.u9().n5(false, false);
      this.u9().n5(false, false);
      this.u9().n5(true, false);
      this.u9().n5(false, false);
      this.u9().l6(1, 1, false);
   }

   public final void n5(int var1, int var2, int var3, int var4) {
      this.u9().n5(true, false);
      this.u9().n5(false, false);
      int var5 = com.aspose.slides.internal.p5k.n5.n5(new int[]{var1, var2, var3, var4});
      this.u9().l6(var5 - 2, 4, false);
      this.u9().n5(var1, var5, false);
      this.u9().n5(var2, var5, false);
      this.u9().n5(var3, var5, false);
      this.u9().n5(var4, var5, false);
      this.n5 += var1 + var3;
      this.l6 += var2 + var4;
   }

   public final void l6(int var1, int var2) {
      if (var1 != 0 || var2 != 0) {
         this.u9().n5(true, false);
         this.u9().n5(true, false);
         int var3 = com.aspose.slides.internal.p5k.n5.n5(new int[]{var1, var2});
         this.u9().l6(var3 - 2, 4, false);
         boolean var4 = var1 != 0 && var2 != 0;
         boolean var5 = var1 == 0;
         this.u9().n5(var4, false);
         if (!var4) {
            this.u9().n5(var5, false);
         }

         if (var1 != 0) {
            this.u9().n5(var1, var3, false);
         }

         if (var2 != 0) {
            this.u9().n5(var2, var3, false);
         }

         this.n5 += var1;
         this.l6 += var2;
      }
   }

   public final int u3() {
      return this.n5;
   }

   public final int a6() {
      return this.l6;
   }
}
