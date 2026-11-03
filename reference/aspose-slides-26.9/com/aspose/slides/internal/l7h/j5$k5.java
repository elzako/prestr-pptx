package com.aspose.slides.internal.l7h;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.ms.System.j8;

public class j5$k5 {
   private byte[] l6;
   private int k5;
   private int u3;
   private int a6;
   private char[] u9;
   private int[] h0 = new int[1];
   private int c8;
   private int t2;
   private int s7 = 0;
   private j5 x8;
   private k7 n3;
   public z3 n5;

   public j5$k5(j5 var1, k7 var2, byte[] var3, int var4, int var5, char[] var6, int var7, int var8) {
      this.x8 = var1;
      this.n3 = var2;
      this.c8 = var7;
      this.u9 = var6;
      this.h0[0] = var7;
      this.t2 = var7 + var8;
      this.l6 = var3;
      this.k5 = var4;
      this.u3 = var4;
      this.a6 = var4 + var5;
      if (this.n3 == null) {
         this.n5 = this.x8.x8().n5();
      } else {
         this.n5 = this.n3.l6();
         if (this.n3.u3 && this.n3.k5() && this.n5.k5() > 0) {
            throw new ArgumentException(
               o0.n5(
                  "Must complete Convert() operation or call Encoder.Reset() before calling GetBytes() or GetByteCount(). Encoder '{0}' fallback '{1}'.",
                  this.n3.a6().t2(),
                  j8.n5(this.n3.n5())
               )
            );
         }
      }

      this.n5.n5(this.h0[0], this.t2, this.n3, this.l6 != null);
   }

   public final boolean n5(byte var1, int var2) {
      if (this.l6 != null) {
         if (this.k5 >= this.a6 - var2) {
            this.n5(true);
            return false;
         }

         this.l6[this.k5++] = var1;
      }

      this.s7++;
      return true;
   }

   public final boolean n5(byte var1) {
      return this.n5(var1, 0);
   }

   public final boolean n5(byte var1, byte var2) {
      return this.n5(var1, var2, 0);
   }

   public final boolean n5(byte var1, byte var2, int var3) {
      return this.n5(var1, 1 + var3) && this.n5(var2, var3);
   }

   public final boolean n5(byte var1, byte var2, byte var3) {
      return this.n5(var1, var2, var3, 0);
   }

   public final boolean n5(byte var1, byte var2, byte var3, int var4) {
      return this.n5(var1, 2 + var4) && this.n5(var2, 1 + var4) && this.n5(var3, var4);
   }

   public final boolean n5(byte var1, byte var2, byte var3, byte var4) {
      return this.n5(var1, 3) && this.n5(var2, 2) && this.n5(var3, 1) && this.n5(var4, 0);
   }

   public final void n5(boolean var1) {
      if (this.n5.u9) {
         this.n5.l6();
      } else if (this.h0[0] > this.c8) {
         this.h0[0]--;
      }

      if (var1) {
         this.x8.n5(this.n3, this.k5 == this.u3);
      }
   }

   public final boolean n5(char var1) {
      return this.n5.n5(var1, this.u9, new int[]{this.h0[0]});
   }

   public final boolean n5() {
      return this.n5.k5() > 0 || this.h0[0] < this.t2;
   }

   public final char l6() {
      char var1 = this.n5.u9();
      if (var1 == 0 && this.h0[0] < this.t2) {
         var1 = this.u9[this.h0[0]++];
      }

      return var1;
   }

   public final int k5() {
      return this.h0[0] - this.c8;
   }

   public final int u3() {
      return this.s7;
   }
}
