package com.aspose.slides.internal.d2n;

public final class k5 {
   u3 n5;
   String l6;
   String k5;
   String u3;
   int a6;
   int u9;
   int h0;
   int c8;
   int t2;
   byte[] s7;

   private String n5(byte[] var1, int var2, int var3) {
      char[] var4 = new char[var3];
      int var5 = 0;

      while (var5 < var3) {
         var4[var5] = com.aspose.slides.internal.l1b.k5.y4(var1, var2);
         var5++;
         var2 += 2;
      }

      var5 = 0;

      while (var5 < var3 && var4[var5] != 0) {
         var5++;
      }

      if (var5 < var3) {
         char[] var6 = new char[var5];
         System.arraycopy(var4, 0, var6, 0, var5);
         var4 = var6;
      }

      return new String(var4);
   }

   public int n5(byte[] var1, int var2) {
      int var3 = var2;
      this.n5 = new u3();
      var2 += this.n5.n5(var1, var2);
      this.s7 = new byte[10];
      if (var1.length - var3 <= 320) {
         this.l6 = this.n5(var1, var2, 64);
         var2 += 128;
         this.k5 = this.n5(var1, var2, 32);
         var2 += 64;
         this.a6 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
         var2 += 4;
         this.u9 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
         var2 += 4;
         this.h0 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
         var2 += 8;
         this.c8 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
         var2 += 4;
         this.t2 = com.aspose.slides.internal.l1b.k5.u3(var1, var2);
         var2 += 4;

         for (int var4 = 0; var4 < 10; var4++) {
            this.s7[var4] = var1[var2++];
         }

         var2 += 2;
      } else {
         this.l6 = this.n5(var1, var2, 64);
         var2 += 128;
         this.k5 = this.n5(var1, var2, 32);
         var2 += 64;
         this.u3 = this.n5(var1, var2, 32);
         var2 += 64;
      }

      return var2 - var3;
   }
}
