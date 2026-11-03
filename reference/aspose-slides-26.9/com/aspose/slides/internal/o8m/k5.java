package com.aspose.slides.internal.o8m;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.NotSupportedException;

final class k5 implements i1 {
   private final int n5;
   private final int l6;
   private final boolean k5;
   private final byte[] u3;
   private byte[] a6;
   private byte[] u9;

   @Override
   public final int at_() {
      return com.aspose.slides.internal.o8m.l6.n5() / 8;
   }

   @Override
   public final int au_() {
      return com.aspose.slides.internal.o8m.l6.n5() / 8;
   }

   @Override
   public final boolean k5() {
      return true;
   }

   @Override
   public final boolean as_() {
      return true;
   }

   public k5(byte[] var1, byte[] var2, int var3, int var4, boolean var5) {
      this.u3 = var1;
      this.a6 = var2;
      this.n5 = var3;
      this.l6 = var4;
      this.k5 = var5;
   }

   @Override
   public final void dispose() {
   }

   @Override
   public final int n5(byte[] var1, int var2, int var3, byte[] var4, int var5) {
      this.l6(var1, var2, var3, var4, var5);
      if (this.k5) {
         int var10 = var3;
         System.arraycopy(var1, var2, var4, var5, var10);
         this.l6(var4, var5, var10);
         return var10;
      } else if (this.l6 == 1 || this.l6 == 3) {
         int var9 = var3;
         System.arraycopy(var1, var2, var4, var5, var9);
         this.k5(var4, var5, var9);
         return var9;
      } else if (this.u9 == null) {
         int var8 = var3 - this.at_();
         this.u9 = new byte[this.at_()];
         System.arraycopy(var1, var2, var4, var5, var8);
         System.arraycopy(var1, var2 + var8, this.u9, 0, this.at_());
         this.k5(var4, var5, var8);
         return var8;
      } else {
         System.arraycopy(this.u9, 0, var4, var5, this.at_());
         int var6 = var3 - this.at_();
         System.arraycopy(var1, var2, var4, var5 + this.at_(), var6);
         System.arraycopy(var1, var2 + var6, this.u9, 0, this.at_());
         var6 += this.at_();
         this.k5(var4, var5, var6);
         return var6;
      }
   }

   @Override
   public final byte[] n5(byte[] var1, int var2, int var3) {
      this.u3(var1, var2, var3);
      if (!this.k5) {
         if (this.u9 == null) {
            int var8 = var3;
            byte[] var11 = new byte[var8];
            System.arraycopy(var1, var2, var11, 0, var3);
            this.k5(var11, 0, var8);
            byte[][] var13 = new byte[][]{var11};
            this.n5(var13);
            var11 = var13[0];
            this.a6();
            return var11;
         } else {
            int var7 = this.at_() + var3;
            byte[] var9 = new byte[var7];
            System.arraycopy(this.u9, 0, var9, 0, this.at_());
            System.arraycopy(var1, var2, var9, this.at_(), var3);
            this.k5(var9, 0, var7);
            byte[][] var6 = new byte[][]{var9};
            this.n5(var6);
            var9 = var6[0];
            this.a6();
            return var9;
         }
      } else {
         int var4 = var3 / this.at_() * this.at_();
         if (this.l6 == 3 && var3 % this.at_() != 0 || this.l6 != 3 && this.l6 != 1) {
            var4 += this.at_();
         }

         byte[] var5 = new byte[var4];
         System.arraycopy(var1, var2, var5, 0, var3);
         this.n5(var5, var3);
         this.l6(var5, 0, var4);
         this.a6();
         return var5;
      }
   }

   private void l6(byte[] var1, int var2, int var3) {
      if (var3 != 0) {
         switch (this.n5) {
            case 1:
               this.a6 = com.aspose.slides.internal.o8m.l6.n5(var1, var2, var3, this.u3, this.a6);
               break;
            case 2:
               com.aspose.slides.internal.o8m.l6.n5(var1, var2, var3, this.u3);
               break;
            default:
               throw new NotSupportedException("The specified cipher mode is not supported.");
         }
      }
   }

   private void k5(byte[] var1, int var2, int var3) {
      if (var3 != 0) {
         switch (this.n5) {
            case 1:
               this.a6 = com.aspose.slides.internal.o8m.l6.l6(var1, var2, var3, this.u3, this.a6);
               break;
            case 2:
               com.aspose.slides.internal.o8m.l6.l6(var1, var2, var3, this.u3);
               break;
            default:
               throw new NotSupportedException("The specified cipher mode is not supported.");
         }
      }
   }

   private void n5(byte[] var1, int var2) {
      byte var3 = (byte)(var1.length - var2);
      switch (this.l6) {
         case 1:
            break;
         case 2:
            for (int var8 = var2; var8 < var1.length; var8++) {
               var1[var8] = var3;
            }
            break;
         case 3:
            for (int var7 = var2; var7 < var1.length; var7++) {
               var1[var7] = 0;
            }
            break;
         case 4:
            for (int var6 = var2; var6 < var1.length - 1; var6++) {
               var1[var6] = 0;
            }

            if ((var3 & 255) > 0) {
               var1[var1.length - 1] = var3;
            }
            break;
         case 5:
            if ((var3 & 255) > 1) {
               byte[] var5 = new byte[(var3 & 255) - 1];
               new j9().n5(var5);
               System.arraycopy(var5, 0, var1, var2, var5.length);
            }

            if ((var3 & 255) > 0) {
               var1[var1.length - 1] = var3;
            }
            break;
         default:
            String var4 = com.aspose.slides.ms.System.d1.n5(
               "The padding mode {0} is not supported.", new Object[]{com.aspose.slides.ms.System.s3.n5(h2.class, this.l6)}
            );
            throw new CryptographicException(var4);
      }
   }

   private void n5(byte[][] var1) {
      if (var1[0].length != 0) {
         switch (this.l6) {
            case 2:
            case 4:
            case 5:
               int var2 = var1[0][var1[0].length - 1] & 255;
               byte[] var3 = new byte[var1[0].length - var2];
               System.arraycopy(var1[0], 0, var3, 0, var3.length);
               var1[0] = var3;
            case 1:
            case 3:
               return;
            default:
               String var4 = com.aspose.slides.ms.System.d1.n5(
                  "The padding mode {0} is not supported.", new Object[]{com.aspose.slides.ms.System.s3.n5(h2.class, this.l6)}
               );
               throw new CryptographicException(var4);
         }
      }
   }

   private void a6() {
      this.u9 = null;
   }

   private void l6(byte[] var1, int var2, int var3, byte[] var4, int var5) {
      if (var1 == null) {
         throw new ArgumentNullException("inputBuffer");
      }

      if (var4 == null) {
         throw new ArgumentNullException("outputBuffer");
      }

      if (var2 < 0 || var2 >= var1.length) {
         throw new ArgumentOutOfRangeException("inputOffset");
      }

      if (var3 > 0 && var3 <= var1.length && var3 % this.at_() == 0) {
         if (var3 + var2 > var1.length) {
            throw new ArgumentException("The inputOffset or inputCount or both arguments are out of range.");
         } else if (var5 < 0 || var5 >= var4.length) {
            throw new ArgumentOutOfRangeException("outputOffset");
         }
      } else {
         throw new ArgumentOutOfRangeException("inputCount");
      }
   }

   private void u3(byte[] var1, int var2, int var3) {
      if (var1 == null) {
         throw new ArgumentNullException("inputBuffer");
      }

      if (var2 >= 0 && var2 < var1.length) {
         if (var3 >= 0 && var3 + var2 <= var1.length) {
            if (var3 % this.at_() != 0 && (!this.k5 || this.l6 == 1)) {
               throw new CryptographicException("The input data is not a complete block.");
            }
         } else {
            throw new ArgumentOutOfRangeException("inputCount");
         }
      } else {
         throw new ArgumentOutOfRangeException("inputOffset");
      }
   }
}
