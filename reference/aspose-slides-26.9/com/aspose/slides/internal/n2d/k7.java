package com.aspose.slides.internal.n2d;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class k7 implements Cloneable {
   private int[] n5 = new int[16];
   private Object[] l6 = new Object[16];
   private int k5;

   public final void n5(int var1, Object var2) {
      int var3 = com.aspose.slides.internal.n2d.n5.n5(this.n5, 0, this.k5, var1);
      if (var3 >= 0) {
         throw new ArgumentException("duplicate");
      }

      this.n5(~var3, var1, var2);
   }

   public final void n5(int var1) {
      if (var1 != this.n5.length) {
         if (var1 < this.k5) {
            throw new ArgumentOutOfRangeException("value");
         }

         if (var1 > 0) {
            int[] var2 = new int[var1];
            Object[] var3 = new Object[var1];
            if (this.k5 > 0) {
               com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var2)), 0, this.k5);
               com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.l6)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var3)), 0, this.k5);
            }

            this.n5 = var2;
            this.l6 = var3;
         } else {
            this.n5 = new int[16];
            this.l6 = new Object[16];
         }
      }
   }

   public final int n5() {
      return this.k5;
   }

   public final boolean l6(int var1) {
      return this.u9(var1) >= 0;
   }

   private void h0(int var1) {
      int var2 = this.n5.length == 0 ? 16 : this.n5.length * 2;
      if (var2 < var1) {
         var2 = var1;
      }

      this.n5(var2);
   }

   public final Object k5(int var1) {
      if (var1 >= 0 && var1 < this.k5) {
         return this.l6[var1];
      } else {
         throw new ArgumentOutOfRangeException("index");
      }
   }

   public final int u3(int var1) {
      if (var1 >= 0 && var1 < this.k5) {
         return this.n5[var1];
      } else {
         throw new ArgumentOutOfRangeException("index");
      }
   }

   public final Object a6(int var1) {
      int var2 = this.u9(var1);
      return var2 >= 0 ? this.l6[var2] : null;
   }

   public final void l6(int var1, Object var2) {
      int var3 = com.aspose.slides.internal.n2d.n5.n5(this.n5, 0, this.k5, var1);
      if (var3 >= 0) {
         this.l6[var3] = var2;
      } else {
         this.n5(~var3, var1, var2);
      }
   }

   public final int u9(int var1) {
      int var2 = com.aspose.slides.internal.n2d.n5.n5(this.n5, 0, this.k5, var1);
      return var2 >= 0 ? var2 : -1;
   }

   public final int n5(Object var1) {
      return com.aspose.slides.ms.System.u3.n5(this.l6, var1, 0, this.k5);
   }

   private void n5(int var1, int var2, Object var3) {
      if (this.k5 == this.n5.length) {
         this.h0(this.k5 + 1);
      }

      if (var1 < this.k5) {
         com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), var1, com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), var1 + 1, this.k5 - var1
         );
         com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5((Object)(this.l6)), var1, com.aspose.slides.ms.System.u3.n5((Object)(this.l6)), var1 + 1, this.k5 - var1
         );
      }

      this.n5[var1] = var2;
      this.l6[var1] = var3;
      this.k5++;
   }
}
