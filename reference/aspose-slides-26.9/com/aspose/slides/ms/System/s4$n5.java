package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.OverflowException;
import java.math.BigInteger;

class s4$n5 {
   private String n5;
   private int l6 = 0;
   private int k5;
   private int u3;

   public s4$n5(String var1) {
      this.n5 = var1;
      this.k5 = this.n5.length();
   }

   public boolean n5() {
      return this.l6 >= this.k5;
   }

   private void l6() {
      while (!this.n5() && t9.h0(this.n5, this.l6)) {
         this.l6++;
      }
   }

   private boolean k5() {
      boolean var1 = false;
      if (!this.n5() && this.n5.charAt(this.l6) == '-') {
         var1 = true;
         this.l6++;
      }

      return var1;
   }

   private int n5(boolean var1) {
      if (var1 && this.n5()) {
         return 0;
      }

      long var2 = 0L;

      int var4;
      for (var4 = 0; !this.n5() && t9.l6(this.n5, this.l6); var4++) {
         var2 = var2 * 10L + this.n5.charAt(this.l6) - 48L;
         if (var2 > 2147483647L) {
            this.n5(2);
            break;
         }

         this.l6++;
      }

      if (!var1 && var4 == 0) {
         this.n5(1);
      }

      return (int)var2;
   }

   private boolean u3() {
      if (this.n5()) {
         return false;
      } else if (this.n5.charAt(this.l6) == '.') {
         this.l6++;
         return true;
      } else {
         return false;
      }
   }

   private void l6(boolean var1) {
      if (!this.n5()) {
         if (this.n5.charAt(this.l6) == ':') {
            this.l6++;
         } else if (!var1) {
            this.n5(1);
         }
      }
   }

   private long a6() {
      long var1 = 1000000L;
      long var3 = 0L;

      boolean var5;
      for (var5 = false; var1 > 0L && !this.n5() && t9.l6(this.n5, this.l6); var5 = true) {
         var3 += (this.n5.charAt(this.l6) - '0') * var1;
         this.l6++;
         var1 /= 10L;
      }

      if (!var5) {
         this.n5(1);
      }

      return var3;
   }

   private void n5(int var1) {
      if (this.u3 == 0) {
         this.u3 = var1;
      }
   }

   private boolean n5(int var1, int var2, int var3, boolean var4) {
      if (this.u3 != 2 && var1 <= 23 && var2 <= 59 && var3 <= 59) {
         if (this.u3 != 1) {
            return true;
         } else if (var4) {
            return false;
         } else {
            throw new FormatException("Invalid format for TimeSpan.Parse.");
         }
      } else if (var4) {
         return false;
      } else {
         throw new OverflowException("Invalid time data.");
      }
   }

   public boolean n5(boolean var1, s4[] var2) {
      int var3 = 0;
      s4.k5.u3(var2[0]);
      this.l6();
      boolean var4 = this.k5();
      int var5 = this.n5(false);
      if (this.u3()) {
         var3 = this.n5(true);
      } else if (!this.n5()) {
         var3 = var5;
         var5 = 0;
      }

      this.l6(false);
      int var6 = this.l6;
      int var7 = this.n5(true);
      int var8 = 0;
      if (var6 < this.l6) {
         this.l6(true);
         var8 = this.n5(true);
      }

      long var9;
      if (this.u3()) {
         var9 = this.a6();
      } else {
         var9 = 0L;
      }

      this.l6();
      if (!this.n5()) {
         this.n5(1);
      }

      if (!this.n5(var3, var7, var8, var1)) {
         return false;
      }

      long var11 = 0L;
      long[] var13 = new long[]{0L};
      boolean var14 = !s4.n5(var5, var3, var7, var8, 0, false, var13);
      var11 = var13[0];
      if (var14) {
         return false;
      }

      BigInteger var15 = BigInteger.valueOf(var9);
      BigInteger var16 = BigInteger.valueOf(var11);
      if (var4) {
         var16 = var16.negate().subtract(var15);
      } else {
         var16 = var16.add(var15);
      }

      if (var16.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0 && var16.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0) {
         var11 = var16.longValue();
         var2[0] = new s4(var11);
         return true;
      } else if (var1) {
         return false;
      } else {
         throw new OverflowException();
      }
   }
}
