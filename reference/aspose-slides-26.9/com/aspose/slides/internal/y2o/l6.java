package com.aspose.slides.internal.y2o;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.j3b.c8;
import com.aspose.slides.internal.y5s.j5;
import com.aspose.slides.internal.y5s.z3;

public class l6 implements c8 {
   private final c8 n5;
   private final int l6;
   private final int k5;
   private final int u3;
   private final int a6;

   public l6(c8 var1, int var2, int var3, int var4, int var5) {
      this.n5 = var1;
      this.a6 = var2;
      this.l6 = var3;
      this.k5 = var4;
      this.u3 = var5;
   }

   @Override
   public void n5(j5 var1, byte[] var2, z3 var3, z3 var4) {
      if (this.l6 != var1.u9()) {
         byte[] var5 = this.u3(var2, 0);
         this.n5.n5(new j5(0, 0, this.a6, 1), var5, var3.u3(), var4.u3());

         for (int var6 = 1; var6 < var1.u9(); var6++) {
            var5 = this.k5(var2, var6);
            this.n5.n5(new j5(0, var6, this.a6, 1), var5, var3.u3(), var4.u3());
         }
      } else {
         for (int var8 = 0; var8 < var1.u9(); var8++) {
            byte[] var9 = this.k5(var2, var8);
            this.n5.n5(new j5(0, var8, this.a6, 1), var9, var3.u3(), var4.u3());
         }
      }
   }

   private byte[] n5(byte[] var1, int var2) {
      byte[][] var3 = new byte[][]{this.u3(var1, var2), this.u9(var1, var2), this.h0(var1, var2), this.l6(var1, var2), null};
      var3[3] = this.a6(var1, var2);
      int var4 = 0;
      int var5 = 0;

      for (int var6 = 1; var6 < var3[0].length; var6++) {
         var4 += var3[0][var6] & 255;
      }

      for (int var9 = 1; var9 < 4; var9++) {
         int var7 = 0;

         for (int var8 = 1; var8 < var3[var9].length; var8++) {
            var7 += var3[var9][var8] & 255;
         }

         if (var7 < var4) {
            var4 = var7;
            var5 = var9;
         }
      }

      return var3[var5];
   }

   private byte[] l6(byte[] var1, int var2) {
      int var3 = this.a6;
      int var4 = this.k5;
      byte[] var5 = new byte[var3 + 1];
      var5[0] = 3;
      if (var2 == 0) {
         System.arraycopy(var1, 0, var5, 1, var4);

         for (int var6 = var4; var6 < var3; var6++) {
            var5[var6 + 1] = (byte)((var1[var6] & 255) - (var1[var6 - var4] & 255) / 2);
         }
      } else {
         for (int var7 = 0; var7 < var4; var7++) {
            var5[var7 + 1] = (byte)((var1[var3 * var2 + var7] & 255) - (var1[var3 * (var2 - 1) + var7] & 255) / 2);
         }

         for (int var8 = var4; var8 < var3; var8++) {
            var5[var8 + 1] = (byte)((var1[var3 * var2 + var8] & 255) - ((var1[var3 * var2 + var8 - var4] & 255) + (var1[var3 * (var2 - 1) + var8] & 255)) / 2);
         }
      }

      return var5;
   }

   private byte[] k5(byte[] var1, int var2) {
      switch (this.u3) {
         case 0:
            return this.u3(var1, var2);
         case 1:
            return this.u9(var1, var2);
         case 2:
            return this.h0(var1, var2);
         case 3:
            return this.l6(var1, var2);
         case 4:
            return this.a6(var1, var2);
         case 5:
            return this.n5(var1, var2);
         default:
            throw new ArgumentOutOfRangeException();
      }
   }

   private byte[] u3(byte[] var1, int var2) {
      int var3 = this.a6;
      byte[] var4 = new byte[var3 + 1];
      System.arraycopy(var1, var3 * var2, var4, 1, var3);
      var4[0] = 0;
      return var4;
   }

   private byte[] a6(byte[] var1, int var2) {
      int var3 = this.a6;
      int var4 = this.k5;
      byte[] var5 = new byte[var3 + 1];
      var5[0] = 4;
      if (var2 == 0) {
         for (int var6 = 0; var6 < var4; var6++) {
            var5[var6 + 1] = (byte)((var1[var6] & 255) - (com.aspose.slides.internal.y2o.n5.n5((byte)0, (byte)0, (byte)0) & 255));
         }

         for (int var10 = var4; var10 < var3; var10++) {
            byte var7 = var1[var2 * var3 + var10 - var4];
            var5[var10 + 1] = (byte)((var1[var10] & 255) - (com.aspose.slides.internal.y2o.n5.n5(var7, (byte)0, (byte)0) & 255));
         }
      } else {
         for (int var11 = 0; var11 < var4; var11++) {
            byte var13 = var1[(var2 - 1) * var3 + var11];
            var5[var11 + 1] = (byte)((var1[var3 * var2 + var11] & 255) - (com.aspose.slides.internal.y2o.n5.n5((byte)0, var13, (byte)0) & 255));
         }

         for (int var12 = var4; var12 < var3; var12++) {
            byte var14 = var1[var2 * var3 + var12 - var4];
            byte var8 = var1[(var2 - 1) * var3 + var12];
            byte var9 = var1[(var2 - 1) * var3 + var12 - var4];
            var5[var12 + 1] = (byte)((var1[var2 * var3 + var12] & 255) - (com.aspose.slides.internal.y2o.n5.n5(var14, var8, var9) & 255));
         }
      }

      return var5;
   }

   private byte[] u9(byte[] var1, int var2) {
      int var3 = this.a6;
      int var4 = this.k5;
      byte[] var5 = new byte[var3 + 1];
      if (var4 >= 0) {
         System.arraycopy(var1, var3 * var2 + 0, var5, 1, var4);
      }

      for (int var6 = var4; var6 < var3; var6++) {
         var5[var6 + 1] = (byte)((var1[var3 * var2 + var6] & 255) - (var1[var3 * var2 + var6 - var4] & 255));
      }

      var5[0] = 1;
      return var5;
   }

   private byte[] h0(byte[] var1, int var2) {
      int var3 = this.a6;
      byte[] var4 = new byte[var3 + 1];
      var4[0] = 2;
      if (var2 != 0) {
         for (int var5 = 0; var5 < var3; var5++) {
            var4[var5 + 1] = (byte)((var1[var5 + var3 * var2] & 255) - (var1[var5 + var3 * (var2 - 1)] & 255));
         }
      } else {
         System.arraycopy(var1, var3 * var2, var4, 1, var3);
      }

      return var4;
   }
}
