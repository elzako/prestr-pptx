package com.aspose.slides.internal.l7h;

import com.aspose.slides.exceptions.ArgumentException;

public abstract class s7 {
   public int n5;
   public int l6;

   public abstract boolean n5(byte[] var1, int var2);

   public abstract char n5();

   public abstract int l6();

   public void k5() {
      while (this.n5() != 0) {
      }
   }

   public final void u3() {
      this.n5 = 0;
      this.k5();
   }

   public final void n5(int var1, int var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public boolean n5(byte[] var1, int var2, char[] var3, int[] var4) {
      if (this.n5(var1, var2 - this.n5 - var1.length)) {
         int var5 = var4[0];
         boolean var6 = false;

         char var7;
         while ((var7 = this.n5()) != 0) {
            if (com.aspose.slides.ms.System.t9.y4(var7)) {
               if (com.aspose.slides.ms.System.t9.a6(var7)) {
                  if (var6) {
                     throw new ArgumentException("String contains invalid Unicode code points.");
                  }

                  var6 = true;
               } else {
                  if (!var6) {
                     throw new ArgumentException("String contains invalid Unicode code points.");
                  }

                  var6 = false;
               }
            }

            if (var5 >= this.l6) {
               return false;
            }

            var3[var5++] = var7;
         }

         if (var6) {
            throw new ArgumentException("String contains invalid Unicode code points.");
         }

         var4[0] = var5;
      }

      return true;
   }

   public int l6(byte[] var1, int var2) {
      if (this.n5(var1, var2 - this.n5 - var1.length)) {
         int var3 = 0;
         boolean var4 = false;

         char var5;
         while ((var5 = this.n5()) != 0) {
            if (com.aspose.slides.ms.System.t9.y4(var5)) {
               if (com.aspose.slides.ms.System.t9.a6(var5)) {
                  if (var4) {
                     throw new ArgumentException("String contains invalid Unicode code points.");
                  }

                  var4 = true;
               } else {
                  if (!var4) {
                     throw new ArgumentException("String contains invalid Unicode code points.");
                  }

                  var4 = false;
               }
            }

            var3++;
         }

         if (var4) {
            throw new ArgumentException("String contains invalid Unicode code points.");
         } else {
            return var3;
         }
      } else {
         return 0;
      }
   }

   public final void n5(byte[] var1) {
      a5 var2 = new a5(var1.length * 3);

      int var3;
      for (var3 = 0; var3 < var1.length && var3 < 20; var3++) {
         if (var2.l6() > 0) {
            var2.n5(' ');
         }

         var2.n5(com.aspose.slides.internal.x7n.l6.k5(), "\\x{0:X2}", var1[var3]);
      }

      if (var3 == 20) {
         var2.n5(" ...");
      }

      throw new ArgumentException(o0.n5("Recursive fallback not allowed for bytes {0}.", var2.toString()), "bytesUnknown");
   }
}
