package com.aspose.slides.internal.l7h;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.d1;

public class v4 extends j5 {
   public static final v4 n5 = new v4();
   private byte[] l6;
   private byte[] k5;
   private boolean[] u3;
   private boolean a6;

   public v4() {
      this(false);
   }

   public v4(boolean var1) {
      super(65000);
      this.a6 = var1;
      this.u3();
   }

   private void u3() {
      this.l6 = new byte[64];

      for (int var1 = 0; var1 < 64; var1++) {
         this.l6[var1] = (byte)"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(var1);
      }

      this.k5 = new byte[128];

      for (int var3 = 0; var3 < 128; var3++) {
         this.k5[var3] = -1;
      }

      for (int var4 = 0; var4 < 64; var4++) {
         this.k5[this.l6[var4] & 0xFF] = (byte)var4;
      }

      this.u3 = new boolean[128];
      int var5 = "\t\n\r '(),-./0123456789:?ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".length();

      for (int var2 = 0; var2 < var5; var2++) {
         this.u3["\t\n\r '(),-./0123456789:?ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".charAt(var2)] = true;
      }

      if (this.a6) {
         var5 = "!\"#$%&*;<=>@[]^_`{|}".length();

         for (int var7 = 0; var7 < var5; var7++) {
            this.u3["!\"#$%&*;<=>@[]^_`{|}".charAt(var7)] = true;
         }
      }
   }

   @Override
   public void n5() {
      this.t9 = new m3(d1.n5);
      this.z1 = new v4$l6();
   }

   @Override
   public boolean equals(Object value) {
      v4 var2 = com.aspose.slides.internal.v6g.k5.n5(value, v4.class);
      return var2 == null ? false : this.a6 == var2.a6 && this.x8().equals(var2.x8()) && this.n3().equals(var2.n3());
   }

   @Override
   public int hashCode() {
      return this.t9() + this.x8().hashCode() + this.n3().hashCode();
   }

   @Override
   public int n5(char[] var1, int var2, int var3) {
      if (var1 == null) {
         throw new ArgumentNullException("chars", "Array cannot be null.");
      }

      if (var3 < 0) {
         throw new ArgumentOutOfRangeException("count", "Non-negative number required.");
      }

      if (var2 >= 0 && var3 >= 0) {
         if (var1.length - var2 < var3) {
            throw new ArgumentOutOfRangeException("chars", "Index and count must refer to a location within the buffer.");
         } else {
            return var3 == 0 ? 0 : this.n5(var1, var2, var3, null);
         }
      } else {
         throw new ArgumentOutOfRangeException(var2 < 0 ? "index" : "count", "Non-negative number required.");
      }
   }

   @Override
   public int n5(String var1) {
      if (var1 == null) {
         throw new ArgumentNullException("s");
      }

      char[] var2 = d1.c8(var1);
      return this.n5(var2, 0, var1.length(), null);
   }

   @Override
   public int n5(String var1, int var2, int var3, byte[] var4, int var5) {
      if (var1 == null || var4 == null) {
         throw new ArgumentNullException(var1 == null ? "s" : "bytes", "Array cannot be null.");
      }

      if (var2 >= 0 && var3 >= 0) {
         if (var1.length() - var2 < var3) {
            throw new ArgumentOutOfRangeException("s", "Index and count must refer to a location within the string.");
         } else if (var5 >= 0 && var5 <= var4.length) {
            int var6 = var4.length - var5;
            char[] var7 = d1.c8(var1);
            return this.n5(var7, var2, var3, var4, var5, var6, null);
         } else {
            throw new ArgumentOutOfRangeException("byteIndex", "Index was out of range. Must be non-negative and less than the size of the collection.");
         }
      } else {
         throw new ArgumentOutOfRangeException(var2 < 0 ? "charIndex" : "charCount", "Non-negative number required.");
      }
   }

   @Override
   public int n5(char[] var1, int var2, int var3, byte[] var4, int var5) {
      if (var1 == null || var4 == null) {
         throw new ArgumentNullException(var1 == null ? "chars" : "bytes", "Array cannot be null.");
      }

      if (var2 >= 0 && var3 >= 0) {
         if (var1.length - var2 < var3) {
            throw new ArgumentOutOfRangeException("chars", "Index and count must refer to a location within the buffer.");
         }

         if (var5 < 0 || var5 > var4.length) {
            throw new ArgumentOutOfRangeException("byteIndex", "Index was out of range. Must be non-negative and less than the size of the collection.");
         }

         if (var3 == 0) {
            return 0;
         }

         int var6 = var4.length - var5;
         return this.n5(var1, var2, var3, var4, var5, var6, null);
      } else {
         throw new ArgumentOutOfRangeException(var2 < 0 ? "charIndex" : "charCount", "Non-negative number required.");
      }
   }

   @Override
   public int n5(char[] var1, int var2, int var3, byte[] var4, int var5, int var6) {
      if (var4 == null || var1 == null) {
         throw new ArgumentNullException(var4 == null ? "bytes" : "chars", "Array cannot be null.");
      } else if (var3 >= 0 && var6 >= 0) {
         return this.n5(var1, var2, var3, var4, var5, var6, null);
      } else {
         throw new ArgumentOutOfRangeException(var3 < 0 ? "charCount" : "byteCount", "Non-negative number required.");
      }
   }

   @Override
   public int n5(byte[] var1, int var2, int var3) {
      if (var1 == null) {
         throw new ArgumentNullException("bytes", "Array cannot be null.");
      }

      if (var3 < 0) {
         throw new ArgumentOutOfRangeException("count", "Non-negative number required.");
      }

      if (var2 >= 0 && var3 >= 0) {
         if (var1.length - var2 < var3) {
            throw new ArgumentOutOfRangeException("bytes", "Index and count must refer to a location within the buffer.");
         } else {
            return var3 == 0 ? 0 : this.n5(var1, var2, var3, null);
         }
      } else {
         throw new ArgumentOutOfRangeException(var2 < 0 ? "index" : "count", "Non-negative number required.");
      }
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, char[] var4, int var5) {
      if (var1 == null || var4 == null) {
         throw new ArgumentNullException(var1 == null ? "bytes" : "chars", "Array cannot be null.");
      }

      if (var2 >= 0 && var3 >= 0) {
         if (var1.length - var2 < var3) {
            throw new ArgumentOutOfRangeException("bytes", "Index and count must refer to a location within the buffer.");
         }

         if (var5 < 0 || var5 > var4.length) {
            throw new ArgumentOutOfRangeException("charIndex", "Index was out of range. Must be non-negative and less than the size of the collection.");
         }

         if (var3 == 0) {
            return 0;
         }

         int var6 = var4.length - var5;
         return this.n5(var1, var2, var3, var4, var5, var6, null);
      } else {
         throw new ArgumentOutOfRangeException(var2 < 0 ? "byteIndex" : "byteCount", "Non-negative number required.");
      }
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, char[] var4, int var5, int var6) {
      if (var1 == null || var4 == null) {
         throw new ArgumentNullException(var1 == null ? "bytes" : "chars", "Array cannot be null.");
      } else if (var6 >= 0 && var3 >= 0) {
         return this.n5(var1, var2, var3, var4, var5, var6, null);
      } else {
         throw new ArgumentOutOfRangeException(var6 < 0 ? "charCount" : "byteCount", "Non-negative number required.");
      }
   }

   @Override
   public String l6(byte[] var1, int var2, int var3) {
      if (var1 == null) {
         throw new ArgumentNullException("bytes", "Array cannot be null.");
      }

      if (var2 >= 0 && var3 >= 0) {
         if (var1.length - var2 < var3) {
            throw new ArgumentOutOfRangeException("bytes", "Index and count must refer to a location within the buffer.");
         } else {
            return var3 == 0 ? d1.n5 : this.u3(var1, var2, var3);
         }
      } else {
         throw new ArgumentOutOfRangeException(var2 < 0 ? "index" : "count", "Non-negative number required.");
      }
   }

   @Override
   public int n5(char[] var1, int var2, int var3, k7 var4) {
      return this.n5(var1, var2, var3, null, 0, 0, var4);
   }

   @Override
   public int n5(char[] var1, int var2, int var3, byte[] var4, int var5, int var6, k7 var7) {
      v4$u3 var8 = (v4$u3)var7;
      int var9 = 0;
      int var10 = -1;
      j5$k5 var11 = new j5$k5(this, var8, var4, var5, var6, var1, var2, var3);
      if (var8 != null) {
         var9 = var8.u9;
         var10 = var8.h0;

         while (var10 >= 6) {
            var10 -= 6;
            if (!var11.n5(this.l6[var9 >> var10 & 63])) {
               this.n5(var8, var11.u3() == 0);
            }
         }
      }

      label100:
      while (var11.n5()) {
         char var12 = var11.l6();
         if (var12 < 128 && this.u3[var12]) {
            if (var10 >= 0) {
               if (var10 > 0) {
                  if (!var11.n5(this.l6[var9 << 6 - var10 & 63])) {
                     break;
                  }

                  var10 = 0;
               }

               if (!var11.n5((byte)45)) {
                  break;
               }

               var10 = -1;
            }

            if (!var11.n5((byte)var12)) {
               break;
            }
         } else if (var10 < 0 && var12 == '+') {
            if (!var11.n5((byte)43, (byte)45)) {
               break;
            }
         } else {
            if (var10 < 0) {
               if (!var11.n5((byte)43)) {
                  break;
               }

               var10 = 0;
            }

            var9 = var9 << 16 | var12;
            var10 += 16;

            while (true) {
               if (var10 >= 6) {
                  var10 -= 6;
                  if (var11.n5(this.l6[var9 >> var10 & 63])) {
                     continue;
                  }

                  var10 += 6;
                  var12 = var11.l6();
               }

               if (var10 >= 6) {
                  break label100;
               }
               break;
            }
         }
      }

      if (var10 >= 0 && (var8 == null || var8.u9())) {
         if (var10 > 0 && var11.n5(this.l6[var9 << 6 - var10 & 63])) {
            var10 = 0;
         }

         if (var11.n5((byte)45)) {
            var9 = 0;
            var10 = -1;
         } else {
            var11.l6();
         }
      }

      if (var4 != null && var8 != null) {
         var8.u9 = var9;
         var8.h0 = var10;
         var8.a6 = var11.k5();
      }

      return var11.u3();
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, x8 var4) {
      return this.n5(var1, var2, var3, null, 0, 0, var4);
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, char[] var4, int var5, int var6, x8 var7) {
      v4$n5 var8 = (v4$n5)var7;
      j5$u3 var9 = new j5$u3(this, var8, var4, var5, var6, var1, var2, var3);
      int var10 = 0;
      int var11 = -1;
      boolean var12 = false;
      if (var8 != null) {
         var10 = var8.n5;
         var11 = var8.u9;
         var12 = var8.h0;
      }

      if (var11 >= 16) {
         if (!var9.n5((char)(var10 >> var11 - 16 & 65535))) {
            this.n5(var8, true);
         }

         var11 -= 16;
      }

      while (var9.n5()) {
         byte var13 = var9.l6();
         int var15;
         if (var11 >= 0) {
            byte var14;
            if ((var13 & 255) < 128 && (var14 = this.k5[var13 & 0xFF]) >= 0) {
               var12 = false;
               var10 = var10 << 6 | var14 & 255;
               var11 += 6;
               if (var11 < 16) {
                  continue;
               }

               var15 = var10 >> var11 - 16 & 65535;
               var11 -= 16;
            } else {
               var11 = -1;
               if ((var13 & 255) != 45) {
                  if (!var9.n5(var13)) {
                     break;
                  }
                  continue;
               }

               if (!var12) {
                  continue;
               }

               var15 = 43;
            }
         } else {
            if ((var13 & 255) == 43) {
               var11 = 0;
               var12 = true;
               continue;
            }

            if ((var13 & 255) >= 128) {
               if (!var9.n5(var13)) {
                  break;
               }
               continue;
            }

            var15 = var13 & 255;
         }

         if (var15 >= 0 && !var9.n5((char)var15)) {
            if (var11 >= 0) {
               var9.n5(1);
               var11 += 16;
            }
            break;
         }
      }

      if (var4 != null && var8 != null) {
         if (var8.u9()) {
            var8.n5 = 0;
            var8.u9 = -1;
            var8.h0 = false;
         } else {
            var8.n5 = var10;
            var8.u9 = var11;
            var8.h0 = var12;
         }

         var8.a6 = var9.k5();
      }

      return var9.u3();
   }

   @Override
   public u9 l6() {
      return new v4$n5(this);
   }

   @Override
   public t9 k5() {
      return new v4$u3(this);
   }

   @Override
   public int n5(int var1) {
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("charCount", "Non-negative number required.");
      } else {
         long var2 = var1 * 3L + 2L;
         if (var2 > 2147483647L) {
            throw new ArgumentOutOfRangeException(
               "charCount", "Too many characters. The resulting number of bytes is larger than what can be returned as an int."
            );
         } else {
            return (int)var2;
         }
      }
   }

   @Override
   public int l6(int var1) {
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("byteCount", "Non-negative number required.");
      }

      int var2 = var1;
      if (var2 == 0) {
         var2 = 1;
      }

      return var2;
   }
}
