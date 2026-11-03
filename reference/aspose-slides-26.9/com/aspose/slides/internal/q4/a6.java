package com.aspose.slides.internal.q4;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.z3;

public class a6 {
   private final int n5;
   private int l6;
   private int k5;
   private final int[] u3 = new int[5003];
   private int a6 = 0;
   private boolean u9 = false;
   private int h0;
   private int c8;
   private int t2 = 0;
   private int s7 = 0;
   private int x8;
   private final int[] n3 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535};
   private final byte[] y4 = new byte[256];

   public a6(int var1) {
      if (var1 < 2) {
         throw new ArgumentOutOfRangeException("bitsCount");
      }

      this.n5 = var1;
   }

   public final void n5(t4 var1, IGenericEnumerable<Byte> var2) {
      IGenericEnumerator var3 = var2.iterator();

      try {
         var3.reset();
         this.n5(var1, var3);
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   public final void n5(t4 var1, IGenericEnumerator<Byte> var2) {
      var1.writeByte(z3.u3(this.n5));
      int var3 = this.n5 + 1;
      this.h0 = var3;
      this.u9 = false;
      this.l6 = var3;
      this.k5 = l6(this.l6);
      int var4 = 1 << var3 - 1;
      this.c8 = var4 + 1;
      this.a6 = var4 + 2;
      this.x8 = 0;
      this.t2 = 0;
      this.s7 = 0;
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.y4)), 0, this.y4.length);
      int var5 = 0;

      for (int var6 = 5003; var6 < 65536; var6 *= 2) {
         var5++;
      }

      var5 = 8 - var5;
      short var7 = 5003;
      this.n5(5003);
      this.n5(var4, var1);
      if (var2.hasNext()) {
         int var8 = (Byte)var2.next() & 255;
         int[] var9 = new int[5003];

         while (var2.hasNext()) {
            int var10 = (Byte)var2.next() & 255;
            int var15 = (var10 << 12) + var8;
            int var11 = var10 << var5 ^ var8;
            if (this.u3[var11] == var15) {
               var8 = var9[var11];
            } else {
               if (this.u3[var11] >= 0) {
                  int var12 = 5003 - var11;
                  if (var11 == 0) {
                     var12 = 1;
                  }

                  boolean var13 = false;

                  do {
                     if ((var11 -= var12) < 0) {
                        var11 += 5003;
                     }

                     if (this.u3[var11] == var15) {
                        var8 = var9[var11];
                        var13 = true;
                        break;
                     }
                  } while (this.u3[var11] >= 0);

                  if (var13) {
                     continue;
                  }
               }

               this.n5(var8, var1);
               var8 = var10;
               if (this.a6 < 4096) {
                  var9[var11] = this.a6++;
                  this.u3[var11] = var15;
               } else {
                  this.n5(5003);
                  this.a6 = var4 + 2;
                  this.u9 = true;
                  this.n5(var4, var1);
               }
            }
         }

         this.n5(var8, var1);
         this.n5(this.c8, var1);
         var1.writeByte((byte)0);
      }
   }

   private void n5(byte var1, t4 var2) {
      this.y4[this.x8++] = var1;
      if (this.x8 >= 254) {
         this.n5(var2);
      }
   }

   private void n5(int var1) {
      for (int var2 = 0; var2 < var1; var2++) {
         this.u3[var2] = -1;
      }
   }

   private void n5(t4 var1) {
      if (this.x8 > 0) {
         var1.writeByte(z3.u3(this.x8));
         var1.write(this.y4, 0, this.x8);
         this.x8 = 0;
      }
   }

   private static int l6(int var0) {
      return (1 << var0) - 1;
   }

   private void n5(int var1, t4 var2) {
      this.t2 = this.t2 & this.n3[this.s7];
      if (this.s7 > 0) {
         this.t2 = this.t2 | var1 << this.s7;
      } else {
         this.t2 = var1;
      }

      for (this.s7 = this.s7 + this.l6; this.s7 >= 8; this.s7 -= 8) {
         this.n5((byte)(this.t2 & 0xFF), var2);
         this.t2 >>= 8;
      }

      if (this.a6 > this.k5 || this.u9) {
         if (this.u9) {
            this.k5 = l6(this.l6 = this.h0);
            this.u9 = false;
         } else {
            this.l6++;
            if (this.l6 == 12) {
               this.k5 = 4096;
            } else {
               this.k5 = l6(this.l6);
            }
         }
      }

      if (var1 == this.c8) {
         while (this.s7 > 0) {
            this.n5((byte)(this.t2 & 0xFF), var2);
            this.t2 >>= 8;
            this.s7 -= 8;
         }

         this.n5(var2);
      }
   }
}
