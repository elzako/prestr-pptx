package com.aspose.slides.internal.o8m;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.exceptions.OverflowException;

public class c4 implements i1 {
   private int n5;
   private byte[] l6;
   private int k5;
   private boolean u3;
   private byte[] a6;

   public c4() {
      this(0);
   }

   public c4(int var1) {
      this.n5 = var1;
      this.l6 = new byte[4];
      this.k5 = 0;
      this.u3 = false;
   }

   @Override
   public boolean k5() {
      return false;
   }

   @Override
   public boolean as_() {
      return true;
   }

   @Override
   public int at_() {
      return 1;
   }

   @Override
   public int au_() {
      return 3;
   }

   @Override
   public void dispose() {
      this.n5(true);
      com.aspose.slides.ms.System.e5.n5(this);
   }

   protected void n5(boolean var1) {
      if (!this.u3) {
         if (this.l6 != null) {
            com.aspose.slides.ms.System.u3.n5(this.l6, 0, this.l6.length);
         }

         if (var1) {
            this.l6 = null;
         }

         this.u3 = true;
      }
   }

   private byte n5(byte var1) {
      if ((var1 & 255) >= this.a6.length) {
         throw new FormatException(com.aspose.slides.internal.x8w.z3.n5("Invalid character in a Base-64 string."));
      } else {
         byte var2 = this.a6[var1 & 0xFF];
         if (var2 == -1) {
            throw new FormatException(com.aspose.slides.internal.x8w.z3.n5("Invalid character in a Base-64 string."));
         } else {
            return var2;
         }
      }
   }

   private int n5(byte[] var1, int var2) {
      int var3 = 0;
      if (this.l6[3] == 61) {
         var3++;
      }

      if (this.l6[2] == 61) {
         var3++;
      }

      this.a6 = s7.l6;
      switch (var3) {
         case 0:
            int var12 = this.n5(this.l6[0]) & 255;
            int var14 = this.n5(this.l6[1]) & 255;
            int var15 = this.n5(this.l6[2]) & 255;
            int var7 = this.n5(this.l6[3]) & 255;
            var1[var2++] = (byte)(var12 << 2 | var14 >> 4);
            var1[var2++] = (byte)(var14 << 4 | var15 >> 2);
            var1[var2] = (byte)(var15 << 6 | var7);
            break;
         case 1:
            int var11 = this.n5(this.l6[0]) & 255;
            int var13 = this.n5(this.l6[1]) & 255;
            int var6 = this.n5(this.l6[2]) & 255;
            var1[var2++] = (byte)(var11 << 2 | var13 >> 4);
            var1[var2] = (byte)(var13 << 4 | var6 >> 2);
            break;
         case 2:
            int var4 = this.n5(this.l6[0]) & 255;
            int var5 = this.n5(this.l6[1]) & 255;
            var1[var2] = (byte)(var4 << 2 | var5 >> 4);
      }

      return 3 - var3;
   }

   private void l6(byte[] var1, int var2, int var3) {
      if (var1 == null) {
         throw new ArgumentNullException("inputBuffer");
      }

      if (var2 < 0) {
         throw new ArgumentOutOfRangeException("inputOffset", "< 0");
      }

      if (var3 > var1.length) {
         throw new OutOfMemoryException("inputCount " + com.aspose.slides.internal.x8w.z3.n5("Overflow"));
      }

      if (var2 > var1.length - var3) {
         throw new ArgumentException("inputOffset\r\nParameter name: " + com.aspose.slides.internal.x8w.z3.n5("Overflow"));
      }

      if (var3 < 0) {
         throw new OverflowException("inputCount < 0");
      }
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, byte[] var4, int var5) {
      if (this.u3) {
         throw new ObjectDisposedException("FromBase64Transform");
      }

      this.l6(var1, var2, var3);
      if (var4 != null && var5 >= 0) {
         int var6 = 0;

         while (var3 > 0) {
            if (this.k5 < 4) {
               byte var7 = var1[var2++];
               if (this.n5 == 0) {
                  if (!com.aspose.slides.ms.System.t9.t9((char)(var7 & 0xFF))) {
                     this.l6[this.k5++] = var7;
                  }
               } else {
                  this.l6[this.k5++] = var7;
               }
            }

            if (this.k5 == 4) {
               var6 += this.n5(var4, var5);
               var5 += 3;
               this.k5 = 0;
            }

            var3--;
         }

         return var6;
      } else {
         throw new FormatException("outputBuffer");
      }
   }

   @Override
   public byte[] n5(byte[] var1, int var2, int var3) {
      if (this.u3) {
         throw new ObjectDisposedException("FromBase64Transform");
      }

      this.l6(var1, var2, var3);
      int var4 = 0;
      int var5 = 0;
      if (this.n5 == 0) {
         int var6 = var2;

         for (int var7 = 0; var7 < var3; var7++) {
            if (com.aspose.slides.ms.System.t9.t9((char)(var1[var6] & 0xFF))) {
               var4++;
            }

            var6++;
         }

         if (var4 == var3) {
            return new byte[0];
         }

         var6 = var2 + var3 - 1;
         int var11 = Math.min(2, var3);

         while (var11 > 0) {
            char var8 = (char)(var1[var6--] & 0xFF);
            if (var8 == '=') {
               var5++;
               var11--;
            } else if (!com.aspose.slides.ms.System.t9.t9(var8)) {
               break;
            }
         }
      } else {
         if (var1[var2 + var3 - 1] == 61) {
            var5++;
         }

         if (var1[var2 + var3 - 2] == 61) {
            var5++;
         }
      }

      if (var3 < 4 && var5 < 2) {
         if (this.k5 > 2 && this.l6[3] == 61) {
            var5++;
         }

         if (this.k5 > 1 && this.l6[2] == 61) {
            var5++;
         }
      }

      int var10 = (this.k5 + var3 - var4 >> 2) * 3 - var5;
      if (var10 <= 0) {
         return new byte[0];
      }

      byte[] var12 = new byte[var10];
      this.n5(var1, var2, var3, var12, 0);
      return var12;
   }
}
