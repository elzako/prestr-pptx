package com.aspose.slides.internal.g6;

public class h0 {
   private final h0$n5[] n5;
   private final short[] l6;
   private final int k5;
   private final int u3;
   private final n5 a6;

   public h0(n5 var1, int var2) {
      this.a6 = var1;
      this.u3 = var2;
      k5(var2 - 1);
      if (var2 > 256 && var2 < 512) {
         this.k5 = k5(var2 - 257);
      } else {
         this.k5 = 0;
      }

      this.l6 = new short[var2];
      int var3 = 2 * var2;
      this.n5 = new h0$n5[var3];

      for (int var4 = 0; var4 < var3; var4++) {
         this.n5[var4] = new h0$n5(null);
      }

      for (int var6 = 2; var6 < var3; var6++) {
         this.n5[var6].n5 = (short)(var6 / 2);
         this.n5[var6].a6 = 1;
      }

      for (int var7 = 1; var7 < var2; var7++) {
         this.n5[var7].l6 = (short)(2 * var7);
         this.n5[var7].k5 = (short)(2 * var7 + 1);
      }

      for (int var8 = 0; var8 < var2; var8++) {
         this.n5[var8].u3 = -1;
         this.n5[var2 + var8].u3 = (short)var8;
         this.n5[var2 + var8].l6 = -1;
         this.n5[var2 + var8].k5 = -1;
         this.l6[var8] = (short)(var2 + var8);
      }

      this.u3(1);
      if (this.k5 != 0) {
         this.a6(this.l6[256]);
         this.a6(this.l6[257]);

         for (int var9 = 0; var9 < 12; var9++) {
            this.a6(this.l6[var2 - 3]);
         }

         for (int var10 = 0; var10 < 6; var10++) {
            this.a6(this.l6[var2 - 2]);
         }
      } else {
         for (int var11 = 0; var11 < 2; var11++) {
            for (int var5 = 0; var5 < var2; var5++) {
               this.a6(this.l6[var5]);
            }
         }
      }
   }

   private int u3(int var1) {
      if (this.n5[var1].u3 < 0) {
         this.n5[var1].a6 = this.u3(this.n5[var1].l6) + this.u3(this.n5[var1].k5);
      }

      return this.n5[var1].a6;
   }

   private void a6(int var1) {
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

   private void n5(int var1, int var2) {
      short var3 = this.n5[var1].n5;
      short var4 = this.n5[var2].n5;
      h0$n5 var5 = this.n5[var1];
      this.n5[var1] = this.n5[var2];
      this.n5[var2] = var5;
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

   public final int n5(int var1) {
      short var2 = this.l6[var1];
      int var3 = 0;

      do {
         var3++;
         var2 = this.n5[var2].n5;
      } while (var2 != 1);

      return var3 << 16;
   }

   public final void l6(int var1) {
      short var2 = this.l6[var1];
      short var3 = var2;
      boolean[] var4 = new boolean[50];
      int var5 = 0;

      do {
         short var6 = this.n5[var2].n5;
         var4[var5++] = this.n5[var6].k5 == var2;
         var2 = var6;
      } while (var2 != 1);

      do {
         this.a6.n5(var4[--var5]);
      } while (var5 > 0);

      this.a6(var3);
   }

   public static int k5(int var0) {
      int var1 = 32;

      while (var1 > 1 && (var0 & 1 << var1 - 1) == 0) {
         var1--;
      }

      return var1;
   }
}
