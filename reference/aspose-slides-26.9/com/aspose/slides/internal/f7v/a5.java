package com.aspose.slides.internal.f7v;

public class a5 extends p3 {
   private int t2 = 0;
   private int[] s7;

   public a5(com.aspose.slides.internal.c5e.l6 var1) {
      super("PLTE", var1);
   }

   @Override
   public void n5(a6 var1) {
      this.l6(var1.n5 / 3);
      int var2 = 0;
      int var3 = 0;

      while (var2 < this.t2) {
         this.n5(var2, var1.k5[var3++] & 255, var1.k5[var3++] & 255, var1.k5[var3++] & 255);
         var2++;
      }
   }

   public void l6(int var1) {
      this.t2 = var1;
      if (this.t2 >= 1 && this.t2 <= 256) {
         if (this.s7 == null || this.s7.length != this.t2) {
            this.s7 = new int[this.t2];
         }
      } else {
         throw new com.aspose.slides.internal.c5e.e2("invalid pallette - nentries=" + this.t2);
      }
   }

   public int l6() {
      return this.t2;
   }

   public void n5(int var1, int var2, int var3, int var4) {
      this.s7[var1] = var2 << 16 | var3 << 8 | var4;
   }

   public void n5(int var1, int[] var2) {
      this.n5(var1, var2, 0);
   }

   public void n5(int var1, int[] var2, int var3) {
      int var4 = this.s7[var1];
      var2[var3 + 0] = (var4 & 0xFF0000) >> 16;
      var2[var3 + 1] = (var4 & 0xFF00) >> 8;
      var2[var3 + 2] = var4 & 0xFF;
   }

   public byte[][] k5() {
      int[] var1 = new int[3];
      byte[][] var2 = new byte[3][this.t2];
      int var3 = 0;
      boolean var4 = false;

      while (var3 < this.t2) {
         this.n5(var3, var1);
         var2[0][var3] = (byte)var1[0];
         var2[1][var3] = (byte)var1[1];
         var2[2][var3] = (byte)var1[2];
         var3++;
      }

      return var2;
   }
}
