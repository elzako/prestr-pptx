package com.aspose.slides.internal.g4;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.d1;

public final class a6 {
   private u9[] n5;
   private int l6;
   private int k5;
   private float u3;

   public final int n5(int var1) {
      u9[] var2 = this.n5;
      int var3 = (var1 & 2147483647) % var2.length;

      for (u9 var4 = var2[var3]; var4 != null; var4 = var4.u3()) {
         if (var4.n5() == var1 && var4.l6() == var1) {
            return var4.k5();
         }
      }

      return 0;
   }

   public final void n5(int var1, int var2) {
      u9[] var3 = this.n5;
      int var4 = (var1 & 2147483647) % var3.length;

      for (u9 var5 = var3[var4]; var5 != null; var5 = var5.u3()) {
         if (var5.n5() == var1 && var5.l6() == var1) {
            var5.k5(var2);
            return;
         }
      }

      if (this.l6 >= this.k5) {
         this.n5();
         this.n5(var1, var2);
      } else {
         u9 var6 = new u9();
         var6.n5(var1);
         var6.l6(var1);
         var6.k5(var2);
         var6.n5(var3[var4]);
         var3[var4] = var6;
         this.l6++;
      }
   }

   public a6(int var1, float var2) {
      if (var1 < 0) {
         String var4 = d1.n5("Illegal capacity '{0}'", new Object[]{var1});
         throw new ArgumentException(var4);
      }

      if (var2 <= 0.0F) {
         String var3 = d1.n5("Illegal load '{0}'", new Object[]{var2});
         throw new ArgumentException(var3);
      }

      this.u3 = var2;
      this.n5 = new u9[var1];
      this.k5 = com.aspose.slides.internal.v6g.k5.u3(var1 * var2, 13);
   }

   public a6() {
      this(101, 0.75F);
   }

   public final boolean l6(int var1) {
      u9[] var2 = this.n5;
      int var3 = (var1 & 2147483647) % var2.length;

      for (u9 var4 = var2[var3]; var4 != null; var4 = var4.u3()) {
         if (var4.n5() == var1 && var4.l6() == var1) {
            return true;
         }
      }

      return false;
   }

   protected final void n5() {
      int var1 = this.n5.length;
      u9[] var2 = this.n5;
      int var3 = var1 * 2 + 1;
      u9[] var4 = new u9[var3];
      this.k5 = com.aspose.slides.internal.v6g.k5.u3(var3 * this.u3, 13);
      this.n5 = var4;
      int var5 = var1;

      while (var5-- > 0) {
         u9 var6 = var2[var5];

         while (var6 != null) {
            u9 var7 = var6;
            var6 = var6.u3();
            int var8 = (var7.n5() & 2147483647) % var3;
            var7.n5(var4[var8]);
            var4[var8] = var7;
         }
      }
   }

   public final int[] l6() {
      int[] var1 = this.k5();
      com.aspose.slides.ms.System.u3.a6(com.aspose.slides.ms.System.u3.n5((Object)(var1)));
      return var1;
   }

   public final int[] k5() {
      int[] var1 = new int[this.l6];
      int var2 = 0;
      int var3 = this.n5.length;
      u9 var4 = null;

      while (true) {
         if (var4 == null) {
            while (var3-- > 0 && (var4 = this.n5[var3]) == null) {
            }
         }

         if (var4 == null) {
            return var1;
         }

         u9 var5 = var4;
         var4 = var5.u3();
         var1[var2++] = var5.l6();
      }
   }
}
