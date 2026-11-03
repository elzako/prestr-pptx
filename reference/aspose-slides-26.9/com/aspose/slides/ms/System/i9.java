package com.aspose.slides.ms.System;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

@j3
public class i9 {
   private int n5;
   private int l6;
   private int[] k5 = new int[56];

   public i9() {
      this((int)System.currentTimeMillis());
   }

   public i9(int var1) {
      int var2 = 161803398 - Math.abs(var1);
      this.k5[55] = var2;
      int var3 = 1;

      for (int var4 = 1; var4 < 55; var4++) {
         int var5 = 21 * var4 % 55;
         this.k5[var5] = var3;
         var3 = var2 - var3;
         if (var3 < 0) {
            var3 += Integer.MAX_VALUE;
         }

         var2 = this.k5[var5];
      }

      for (int var7 = 1; var7 < 5; var7++) {
         for (int var8 = 1; var8 < 56; var8++) {
            this.k5[var8] = this.k5[var8] - this.k5[1 + (var8 + 30) % 55];
            if (this.k5[var8] < 0) {
               this.k5[var8] = this.k5[var8] + Integer.MAX_VALUE;
            }
         }
      }

      this.n5 = 0;
      this.l6 = 21;
      boolean var6 = true;
   }

   private double u3() {
      int var1 = this.a6();
      if (this.a6() % 2 == 0) {
         var1 = -var1;
      }

      double var2 = var1;
      var2 += 2.147483646E9;
      return var2 / 4.294967293E9;
   }

   private int a6() {
      int var1 = this.n5;
      int var2 = this.l6;
      if (++var1 >= 56) {
         var1 = 1;
      }

      if (++var2 >= 56) {
         var2 = 1;
      }

      int var3 = this.k5[var1] - this.k5[var2];
      if (var3 < 0) {
         var3 += Integer.MAX_VALUE;
      }

      this.k5[var1] = var3;
      this.n5 = var1;
      this.l6 = var2;
      return var3;
   }

   public int n5() {
      return this.a6();
   }

   public int n5(int var1) {
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("maxValue", "Max value is less than min value.");
      } else {
         return (int)(this.k5() * var1);
      }
   }

   public int n5(int var1, int var2) {
      if (var1 > var2) {
         throw new ArgumentOutOfRangeException("minValue", "Min value is greater than max value.");
      }

      long var3 = var2 - var1;
      return var3 <= 2147483647L ? (int)(this.k5() * var3) + var1 : (int)((long)(this.u3() * var3)) + var1;
   }

   public void n5(byte[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("buffer");
      }

      for (int var2 = 0; var2 < var1.length; var2++) {
         var1[var2] = (byte)(this.a6() % 256);
      }
   }

   public double l6() {
      return this.k5();
   }

   protected double k5() {
      return this.a6() * 4.656612875245797E-10;
   }
}
