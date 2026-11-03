package com.aspose.slides.internal.g7;

class a6 {
   public a6$n5[] n5;
   public short[] l6;
   private int k5;

   public static int n5(int var0) {
      int var1 = 32;

      while (var1 > 1 && (var0 & 1 << var1 - 1) == 0) {
         var1--;
      }

      return var1;
   }

   public a6(int var1) {
      this.k5 = var1;
      int var2 = var1 > 256 && var1 < 512 ? n5(var1 - 257) : 0;
      this.l6 = new short[var1];
      int var3 = 2 * var1;
      this.n5 = (a6$n5[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(a6$n5.class), var3));

      for (int var4 = 0; var4 < var3; var4++) {
         this.n5[var4] = new a6$n5();
      }

      for (int var6 = 2; var6 < var3; var6++) {
         this.n5[var6].n5 = (short)(var6 / 2);
         this.n5[var6].a6 = 1;
      }

      for (int var7 = 1; var7 < var1; var7++) {
         this.n5[var7].l6 = (short)(2 * var7);
         this.n5[var7].k5 = (short)(2 * var7 + 1);
      }

      for (int var8 = 0; var8 < var1; var8++) {
         this.n5[var8].u3 = -1;
         this.n5[var1 + var8].u3 = (short)var8;
         this.n5[var1 + var8].l6 = -1;
         this.n5[var1 + var8].k5 = -1;
         this.l6[var8] = (short)(var1 + var8);
      }

      this.k5(1);
      if (var2 != 0) {
         this.l6(this.l6[256]);
         this.l6(this.l6[257]);

         for (int var9 = 0; var9 < 12; var9++) {
            this.l6(this.l6[var1 - 3]);
         }

         for (int var10 = 0; var10 < 6; var10++) {
            this.l6(this.l6[var1 - 2]);
         }
      } else {
         for (int var11 = 0; var11 < 2; var11++) {
            for (int var5 = 0; var5 < var1; var5++) {
               this.l6(this.l6[var5]);
            }
         }
      }
   }

   public final void l6(int var1) {
      while (var1 != 1) {
         int var2 = this.n5[var1].a6;
         int var3 = var1 - 1;
         if (this.n5[var3].a6 == var2) {
            while (this.n5[--var3].a6 == var2) {
            }

            if (++var3 > 1) {
               this.n5(var1, var3);
               var1 = var3;
            }
         }

         this.n5[var1].a6 = ++var2;
         var1 = this.n5[var1].n5;
      }

      this.n5[var1].a6++;
   }

   private int k5(int var1) {
      if (this.n5[var1].u3 < 0) {
         this.n5[var1].a6 = this.k5(this.n5[var1].l6) + this.k5(this.n5[var1].k5);
      }

      return this.n5[var1].a6;
   }

   private void n5(int var1, int var2) {
      short var3 = this.n5[var1].n5;
      short var4 = this.n5[var2].n5;
      a6$n5 var5 = this.n5[var1].n5();
      this.n5[var2].n5(this.n5[var1]);
      var5.n5(this.n5[var2]);
      this.n5[var1].n5 = var3;
      this.n5[var2].n5 = var4;
      short var6 = this.n5[var1].u3;
      if (var6 < 0) {
         this.n5[this.n5[var1].l6].n5 = (short)var1;
         this.n5[this.n5[var1].k5].n5 = (short)var1;
      } else {
         this.l6[var6] = (short)var1;
      }

      var6 = this.n5[var2].u3;
      if (var6 < 0) {
         this.n5[this.n5[var2].l6].n5 = (short)var2;
         this.n5[this.n5[var2].k5].n5 = (short)var2;
      } else {
         this.l6[var6] = (short)var2;
      }
   }
}
