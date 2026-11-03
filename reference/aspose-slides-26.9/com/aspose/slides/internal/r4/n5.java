package com.aspose.slides.internal.r4;

public class n5 implements a6 {
   private int n5 = 0;
   private char[] l6;
   private int k5 = 0;
   private int u3;

   private n5(int var1) {
      this.u3 = this.n5 = var1;
      this.l6 = new char[var1];
      this.k5 = 0;
   }

   public static n5 n5(int var0) {
      return new n5(var0);
   }

   public final int n5() {
      return this.k5;
   }

   public final void l6(int var1) {
      this.k5 = var1;
   }

   public final int l6() {
      return this.n5;
   }

   public final void k5() {
      this.k5 = 0;
   }

   public final void n5(char var1) {
      this.l6[this.k5++] = var1;
   }

   public final void n5(int var1, char var2) {
      this.k5 = var1;
      this.n5(var2);
   }

   public final void n5(char[] var1, int var2, int var3) {
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var1)), var2, com.aspose.slides.ms.System.u3.n5((Object)(this.l6)), this.k5, var3);
      this.k5 += var3;
   }

   public final void n5(n5 var1) {
      int var2 = var1.u9();
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var1.l6)), var1.k5, com.aspose.slides.ms.System.u3.n5((Object)(this.l6)), this.k5, var2);
      var1.k5 = var1.u3 - 1;
      this.k5 += var2;
   }

   public final char u3() {
      return this.l6[this.k5++];
   }

   public final char k5(int var1) {
      this.k5 = var1;
      return this.u3();
   }

   public final void a6() {
      this.k5--;
   }

   public final int u9() {
      return this.u3 - this.n5();
   }

   @Override
   public final int h0() {
      return this.u9();
   }

   @Override
   public final char u3(int var1) {
      this.k5 += var1;
      return this.l6[this.k5];
   }

   public final n5 n5(int var1, int var2) {
      n5 var3 = new n5(this.n5);
      var3.l6 = this.l6;
      var3.k5 = this.n5() + var1;
      var3.u3 = this.n5() + var2;
      return var3;
   }

   public final void a6(int var1) {
      this.u3 = var1;
      if (this.k5 > this.u3) {
         this.k5 = this.u3;
      }
   }

   public final int c8() {
      return this.u3;
   }

   public final void t2() {
      char[] var1 = new char[this.u9()];
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.l6)), this.n5(), com.aspose.slides.ms.System.u3.n5((Object)(var1)), 0, var1.length);
      this.k5--;
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var1)), 0, com.aspose.slides.ms.System.u3.n5((Object)(this.l6)), this.n5(), var1.length);
      this.u3--;
      this.n5--;
   }

   public final boolean s7() {
      return this.u9() > 0;
   }
}
