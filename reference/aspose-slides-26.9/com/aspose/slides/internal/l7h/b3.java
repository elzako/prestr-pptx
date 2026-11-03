package com.aspose.slides.internal.l7h;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotSupportedException;
import java.util.concurrent.atomic.AtomicReference;

public class b3 extends l6 {
   private char[] s7;
   private byte[] x8;
   private byte n3;
   private char t4;
   private static AtomicReference<Object> q0 = new AtomicReference<>();

   public b3(int var1) {
      this(var1, var1);
   }

   public b3(int var1, int var2) {
      super(var1, var2);
   }

   @Override
   protected void u3() {
      if (com.aspose.slides.ms.System.x8.u3(this.h0, 42) != 1) {
         throw new NotSupportedException(
            o0.n5(
               "No data is available for encoding {0}. For information on defining a custom encoding, see the documentation for the Encoding.RegisterProvider method.",
               this.t9()
            )
         );
      }

      this.n3 = (byte)com.aspose.slides.ms.System.x8.n5(this.h0, 46);
      this.t4 = com.aspose.slides.ms.System.x8.h0(this.h0, 44);
      int var1 = 65536;
      short var2 = 256;
      char[] var3 = new char[256];
      byte[] var4 = new byte[65536];
      byte[] var5 = new byte[512];
      synchronized (u9) {
         a6.seek(this.c8, 0);
         a6.read(var5, 0, var5.length);
      }

      for (int var9 = 0; var9 < 256; var9++) {
         char var7 = com.aspose.slides.ms.System.x8.h0(var5, var9 * 2);
         if (var7 == 0 && var9 != 0) {
            var3[var9] = '�';
         } else {
            var3[var9] = var7;
            if (var7 != '�') {
               var4[var7] = (byte)var9;
            }
         }
      }

      this.s7 = var3;
      this.x8 = var4;
   }

   private static Object a0() {
      if (q0.get() == null) {
         Object var0 = new Object();
         q0.set(var0);
      }

      return q0.get();
   }

   @Override
   protected void a6() {
      synchronized (a0()) {
         if (this.k5 == null) {
            byte[] var2 = new byte[this.t2 - 512];
            synchronized (u9) {
               a6.seek(this.c8 + 512, 0);
               a6.read(var2, 0, var2.length);
            }

            int var13 = 0;
            char[] var4 = new char[256];
            System.arraycopy(this.s7, 0, var4, 0, 256);

            int var5;
            while (((var5 = com.aspose.slides.ms.System.x8.n5(var2, var13)) & 65535) != 0) {
               var13 += 2;
               var4[var5 & 65535] = com.aspose.slides.ms.System.x8.h0(var2, var13);
               var13 += 2;
            }

            this.u3 = var4;
            var13 += 2;
            int var6 = var13;
            int var7 = 0;
            int var8 = com.aspose.slides.ms.System.x8.n5(var2, var13) & 65535;
            var13 += 2;

            while (var8 < 65536) {
               byte var9 = var2[var13];
               var13++;
               if ((var9 & 255) == 1) {
                  var8 = com.aspose.slides.ms.System.x8.n5(var2, var13) & 65535;
                  var13 += 2;
               } else if ((var9 & 255) < 32 && (var9 & 255) > 0 && (var9 & 255) != 30) {
                  var8 += var9 & 255;
               } else {
                  if ((var9 & 255) > 0) {
                     var7++;
                  }

                  var8++;
               }
            }

            var4 = new char[var7 * 2];
            var13 = var6;
            var8 = com.aspose.slides.ms.System.x8.n5(var2, var13) & 65535;
            var13 += 2;
            var7 = 0;

            while (var8 < 65536) {
               byte var23 = var2[var13];
               var13++;
               if ((var23 & 255) == 1) {
                  var8 = com.aspose.slides.ms.System.x8.n5(var2, var13) & 65535;
                  var13 += 2;
               } else if ((var23 & 255) < 32 && (var23 & 255) > 0 && (var23 & 255) != 30) {
                  var8 += var23 & 255;
               } else {
                  if ((var23 & 255) == 30) {
                     var23 = var2[var13];
                     var13++;
                  }

                  if ((var23 & 255) > 0) {
                     var4[var7++] = (char)var8;
                     var4[var7++] = this.s7[var23 & 0xFF];
                  }

                  var8++;
               }
            }

            this.k5 = var4;
         }
      }
   }

   @Override
   public int n5(char[] var1, int var2, int var3, k7 var4) {
      m3 var5 = null;
      char var6 = 0;
      if (var4 != null) {
         var6 = var4.k5;
         var5 = com.aspose.slides.internal.v6g.k5.n5(var4.n5(), m3.class);
      } else {
         var5 = com.aspose.slides.internal.v6g.k5.n5(this.x8(), m3.class);
      }

      if (var5 != null && var5.l6() == 1) {
         if (var6 > 0) {
            var3++;
         }

         return var3;
      } else {
         z3 var7 = null;
         int var8 = 0;
         int var9 = var2;
         int var10 = var2 + var3;
         if (var6 > 0) {
            var7 = var4.l6();
            var7.n5(var9, var10, var4, false);
            int[] var11 = new int[]{var9};
            var7.n5(var6, var1, var11);
            var9 = var11[0];
         }

         char var15;
         while ((var15 = var7 == null ? '\u0000' : var7.u9()) != 0 || var9 < var10) {
            if (var15 == 0) {
               var15 = var1[var9];
               var9++;
            }

            byte var12 = this.x8[var15];
            if ((var12 & 255) == 0 && var15 != 0) {
               if (var7 == null) {
                  if (var4 == null) {
                     var7 = this.x8().n5();
                  } else {
                     var7 = var4.l6();
                  }

                  var7.n5(var10 - var3, var10, var4, false);
               }

               int[] var13 = new int[]{var9};
               var7.n5(var15, var1, var13);
               var9 = var13[0];
            } else {
               var8++;
            }
         }

         return var8;
      }
   }

   @Override
   public int n5(char[] var1, int var2, int var3, byte[] var4, int var5, int var6, k7 var7) {
      m3 var8 = null;
      char var9 = 0;
      if (var7 != null) {
         var9 = var7.k5;
         var8 = com.aspose.slides.internal.v6g.k5.n5(var7.n5(), m3.class);
      } else {
         var8 = com.aspose.slides.internal.v6g.k5.n5(this.x8(), m3.class);
      }

      int var10 = var5;
      int var11 = var2;
      int var12 = var11 + var3;
      int var13 = var10;
      int var14 = var11;
      if (var8 != null && var8.l6() == 1) {
         byte var15 = this.x8[var8.a6().charAt(0)];
         if ((var15 & 255) != 0) {
            if (var9 > 0) {
               if (var6 == 0) {
                  this.l6(var7, true);
               }

               var4[var10++] = var15;
               var6--;
            }

            if (var6 < var3) {
               this.l6(var7, var6 < 1);
               var12 = var11 + var6;
            }

            for (; var11 < var12; var10++) {
               char var22 = var1[var11];
               var11++;
               byte var24 = this.x8[var22];
               if ((var24 & 255) == 0 && var22 != 0) {
                  var4[var10] = var15;
               } else {
                  var4[var10] = var24;
               }
            }

            if (var7 != null) {
               var7.k5 = 0;
               var7.a6 = var11 - var14;
            }

            return var10 - var13;
         }
      }

      z3 var21 = null;
      int var16 = var10 + var6;
      if (var9 > 0) {
         var21 = var7.l6();
         var21.n5(var11, var12, var7, true);
         int[] var17 = new int[]{var11};
         var21.n5(var9, var1, var17);
         var11 = var17[0];
         if (var21.k5() > var16 - var10) {
            this.l6(var7, true);
         }
      }

      char var23;
      while ((var23 = var21 == null ? '\u0000' : var21.u9()) != 0 || var11 < var12) {
         if (var23 == 0) {
            var23 = var1[var11];
            var11++;
         }

         byte var18 = this.x8[var23];
         if ((var18 & 255) == 0 && var23 != 0) {
            if (var21 == null) {
               if (var7 == null) {
                  var21 = this.x8().n5();
               } else {
                  var21 = var7.l6();
               }

               var21.n5(var12 - var3, var12, var7, true);
            }

            int[] var19 = new int[]{var11};
            var21.n5(var23, var1, var19);
            var11 = var19[0];
            if (var21.k5() > var16 - var10) {
               var11--;
               var21.a6();
               this.l6(var7, var11 == var14);
               break;
            }
         } else {
            if (var10 >= var16) {
               if (var21 == null || !var21.u9) {
                  var11--;
               }

               this.l6(var7, var11 == var14);
               break;
            }

            var4[var10] = var18;
            var10++;
         }
      }

      if (var7 != null) {
         if (var21 != null && !var21.a6) {
            var7.k5 = 0;
         }

         var7.a6 = var11 - var14;
      }

      return var10 - var13;
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, x8 var4) {
      boolean var5 = false;
      n3 var6 = null;
      if (var4 == null) {
         var6 = com.aspose.slides.internal.v6g.k5.n5(this.n3(), n3.class);
         var5 = com.aspose.slides.internal.v6g.k5.l6(this.n3(), s3.class);
      } else {
         var6 = com.aspose.slides.internal.v6g.k5.n5(var4.k5(), n3.class);
         var5 = com.aspose.slides.internal.v6g.k5.l6(var4.k5(), s3.class);
      }

      if (!var5 && (var6 == null || var6.l6() != 1)) {
         s7 var7 = null;
         int var8 = var3;
         byte[] var9 = new byte[1];
         int var10 = var2;
         int var11 = var10 + var3;

         while (var10 < var11) {
            char var12 = this.s7[var1[var10] & 0xFF];
            var10++;
            if (var12 == '�') {
               if (var7 == null) {
                  if (var4 == null) {
                     var7 = this.n3().n5();
                  } else {
                     var7 = var4.u3();
                  }

                  var7.n5(var11 - var3, 0);
               }

               var9[0] = var1[var10 - 1];
               var8 = --var8 + var7.l6(var9, var10);
            }
         }

         return var8;
      } else {
         return var3;
      }
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, char[] var4, int var5, int var6, x8 var7) {
      boolean var8 = false;
      int var9 = var2;
      int var10 = var5;
      int var11 = var9 + var3;
      int var12 = var9;
      int var13 = var10;
      n3 var14 = null;
      if (var7 == null) {
         var14 = com.aspose.slides.internal.v6g.k5.n5(this.n3(), n3.class);
         var8 = com.aspose.slides.internal.v6g.k5.l6(this.n3(), s3.class);
      } else {
         var14 = com.aspose.slides.internal.v6g.k5.n5(var7.k5(), n3.class);
         var8 = com.aspose.slides.internal.v6g.k5.l6(var7.k5(), s3.class);
      }

      if (!var8 && (var14 == null || var14.l6() != 1)) {
         s7 var23 = null;
         byte[] var24 = new byte[1];
         int var17 = var10 + var6;

         while (var9 < var11) {
            char var18 = this.s7[var1[var9] & 0xFF];
            var9++;
            if (var18 == '�') {
               if (var23 == null) {
                  if (var7 == null) {
                     var23 = this.n3().n5();
                  } else {
                     var23 = var7.u3();
                  }
               }

               var24[0] = var1[var9 - 1];
               int[] var19 = new int[]{var10};
               boolean var20 = var23.n5(var24, var9, var4, var19);
               var10 = var19[0];
               if (!var20) {
                  var9--;
                  var23.u3();
                  this.l6(var7, var9 == var12);
                  break;
               }
            } else {
               if (var5 >= var17) {
                  var9--;
                  this.l6(var7, var9 == var12);
                  break;
               }

               var4[var10] = var18;
               var10++;
            }
         }

         if (var7 != null) {
            var7.a6 = var9 - var12;
         }

         return var10 - var13;
      } else {
         char var15;
         if (var14 == null) {
            var15 = '?';
         } else {
            var15 = var14.a6().charAt(0);
         }

         if (var6 < var3) {
            this.l6(var7, var6 < 1);
            var11 = var9 + var6;
         }

         for (; var9 < var11; var10++) {
            char var16;
            if (var8) {
               if (this.u3 == null) {
                  this.a6();
               }

               var16 = this.u3[var1[var9] & 0xFF];
            } else {
               var16 = this.s7[var1[var9] & 0xFF];
            }

            var9++;
            if (var16 == '�') {
               var4[var10] = var15;
            } else {
               var4[var10] = var16;
            }
         }

         if (var7 != null) {
            var7.a6 = var9 - var12;
         }

         return var10 - var13;
      }
   }

   @Override
   public int n5(int var1) {
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("charCount", "Non-negative number required.");
      }

      long var2 = var1 + 1L;
      if (this.x8().l6() > 1) {
         var2 *= this.x8().l6();
      }

      if (var2 > 2147483647L) {
         throw new ArgumentOutOfRangeException("charCount", "Too many characters. The resulting number of bytes is larger than what can be returned as an int.");
      } else {
         return (int)var2;
      }
   }

   @Override
   public int l6(int var1) {
      if (var1 < 0) {
         throw new ArgumentOutOfRangeException("byteCount", "Non-negative number required.");
      }

      long var2 = var1;
      if (this.n3().l6() > 1) {
         var2 *= this.n3().l6();
      }

      if (var2 > 2147483647L) {
         throw new ArgumentOutOfRangeException("byteCount", "Too many bytes. The resulting number of chars is larger than what can be returned as an int.");
      } else {
         return (int)var2;
      }
   }
}
