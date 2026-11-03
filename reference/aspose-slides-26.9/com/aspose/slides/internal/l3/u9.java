package com.aspose.slides.internal.l3;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.ms.System.q1;

public class u9 {
   private int n5;
   private int l6;
   private byte[] k5;
   private byte[] u3;
   private int a6;
   private int u9;
   private int h0;
   private int c8;
   private int t2;

   public u9(int var1, int var2, int var3, int var4) {
      a6(var2, var4);
      this.a6 = var2;
      this.u9 = var3;
      this.h0 = var4;
      this.c8 = var1;
   }

   public final e2 n5(e2 var1) {
      e2 var2 = new e2(com.aspose.slides.internal.v6g.k5.u3(var1.getLength() + q1.u3((double)var1.getLength() / (this.a6 * this.u9)), 14));
      var1.setPosition(0L);
      var2.setPosition(0L);
      this.l6 = com.aspose.slides.internal.v6g.k5.u3(this.a6 * q1.u3(this.h0 / 8.0), 14);
      this.n5 = this.l6 * this.u9;
      this.k5 = new byte[this.n5];
      this.u3 = new byte[this.n5];

      for (int var3 = 0; var3 < this.l6; var3++) {
         this.u3[var3] = 0;
      }

      byte[] var6 = new byte[this.n5];

      while (var1.getPosition() < var1.getLength()) {
         for (int var4 = 0; var4 < this.n5; var4++) {
            int var5 = var1.readByte();
            if (var5 == -1) {
               break;
            }

            this.k5[var4] = (byte)var5;
         }

         this.t2 = this.c8 == 15 ? this.n5() : this.c8;

         for (int var7 = 0; var7 < this.n5; var7++) {
            var6[var7] = this.n5(this.t2, this.k5[var7] & 255, var7);
         }

         if (this.n5 >= 0) {
            System.arraycopy(this.k5, 0, this.u3, 0, this.n5);
         }

         var2.writeByte(n5(this.t2));
         var2.write(var6, 0, this.n5);
      }

      return var2;
   }

   private static byte n5(int var0) {
      switch (var0) {
         case 10:
            return 0;
         case 11:
            return 1;
         case 12:
            return 2;
         case 13:
            return 3;
         case 14:
            return 4;
         default:
            throw new ArgumentException("Unsupported predictor type");
      }
   }

   private int n5() {
      int var1 = 1;
      double var2 = Double.POSITIVE_INFINITY;
      byte[] var4 = new byte[this.n5];

      for (int var5 = 10; var5 != 15; var5++) {
         if (this.n5 >= 0) {
            System.arraycopy(this.k5, 0, var4, 0, this.n5);
         }

         for (int var6 = 0; var6 < this.n5; var6++) {
            var4[var6] = this.n5(var5, var4[var6] & 255, var6);
         }

         double var7 = 0.0;

         for (int var9 = 0; var9 < this.n5; var9++) {
            var7 += var4[var9] & 0xFF;
         }

         var7 /= this.n5;
         if (var7 < var2) {
            var1 = var5;
            var2 = var7;
         }
      }

      return var1;
   }

   private byte n5(int var1, int var2, int var3) {
      switch (var1) {
         case 1:
            return this.k5(var2, var3);
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         default:
            throw new InvalidOperationException("Please report exception.");
         case 10:
            return (byte)var2;
         case 11:
            return this.n5(var2, var3);
         case 12:
            return this.l6(var2, var3);
         case 13:
            return this.k5(var2, var3);
         case 14:
            return this.u3(var2, var3);
      }
   }

   private byte n5(int var1, int var2) {
      int var3 = var2 - this.l6 >= 0 ? this.k5[var2 - this.l6] & 0xFF : 0;
      return (byte)((var1 - var3) % 256);
   }

   private byte l6(int var1, int var2) {
      int var3 = this.u3[var2] & 255;
      return (byte)((var1 - var3) % 256);
   }

   private byte k5(int var1, int var2) {
      int var3 = var2 - this.l6 >= 0 ? this.k5[var2 - this.l6] & 0xFF : 0;
      var3 = (var3 + (this.u3[var2] & 255)) / 2;
      return com.aspose.slides.internal.v6g.k5.n5((Object)(q1.k5(var1 - var3) % 256.0), 14);
   }

   private byte u3(int var1, int var2) {
      int var3 = var2 - this.l6 >= 0 ? this.k5[var2 - this.l6] & 0xFF : 0;
      int var4 = var2 - this.l6 >= 0 ? this.u3[var2 - this.l6] & 0xFF : 0;
      int var5 = this.u3[var2] & 255;
      return (byte)((var1 - l6(var3, var5, var4)) % 256);
   }

   private static int l6(int var0, int var1, int var2) {
      int var3 = var0 + var1 - var2;
      int var4 = q1.n5(var3 - var0);
      int var5 = q1.n5(var3 - var1);
      int var6 = q1.n5(var3 - var2);
      int var7;
      if (var4 <= var5 && var4 <= var6) {
         var7 = var0;
      } else if (var5 <= var6) {
         var7 = var1;
      } else {
         var7 = var2;
      }

      return var7;
   }

   private static void a6(int var0, int var1) {
      if (var0 <= 4 && var0 >= 1) {
         switch (var1) {
            case 1:
            case 2:
            case 4:
            case 8:
               return;
            case 3:
            case 5:
            case 6:
            case 7:
            default:
               throw new ArgumentException("Invalid bpp.");
         }
      } else {
         throw new ArgumentException("Invalid color.");
      }
   }
}
