package com.aspose.slides.internal.l7h;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.ms.System.j8;
import java.util.concurrent.atomic.AtomicReference;

public class a6 extends l6 {
   protected char[] s7;
   protected int[] x8;
   private int t4;
   private int q0;
   protected char n3 = 0;
   private static AtomicReference<Object> z3 = new AtomicReference<>();

   public a6(int var1) {
      this(var1, var1);
   }

   public a6(int var1, int var2) {
      super(var1, var2);
   }

   public a6(int var1, int var2, q0 var3, t2 var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   protected void u3() {
      if (com.aspose.slides.ms.System.x8.u3(this.h0, 42) != 2) {
         throw new NotSupportedException(
            o0.n5(
               "No data is available for encoding {0}. For information on defining a custom encoding, see the documentation for the Encoding.RegisterProvider method.",
               this.t9()
            )
         );
      }

      this.t4 = com.aspose.slides.ms.System.x8.n5(this.h0, 46);
      this.n3 = com.aspose.slides.ms.System.x8.h0(this.h0, 44);
      if (com.aspose.slides.internal.v6g.k5.l6(this.n3(), s3.class)) {
         ((s3)this.n3()).k5 = this.n3;
      }

      this.q0 = 1;
      if ((this.t4 & 65535) > 255) {
         this.q0++;
      }

      this.s7 = new char[65536];
      this.x8 = new int[65536];
      byte[] var1 = new byte[this.t2];
      synchronized (u9) {
         a6.seek(this.c8, 0);
         a6.read(var1, 0, this.t2);
      }

      byte var7 = 0;
      int var3 = 0;
      int[] var4 = new int[]{0};

      while (var3 < 65536) {
         char var5 = com.aspose.slides.ms.System.x8.h0(var1, var7);
         var7 += 2;
         if (var5 == 1) {
            var3 = com.aspose.slides.ms.System.x8.h0(var1, var7);
            var7 += 2;
         } else if (var5 < ' ' && var5 > 0) {
            var3 += var5;
         } else {
            if (var5 == '\uffff') {
               var4[0] = var3;
               var5 = (char)var3;
            } else if (var5 == '\ufffe') {
               var4[0] = var3;
            } else {
               if (var5 == '�') {
                  var3++;
                  continue;
               }

               var4[0] = var3;
            }

            if (this.n5(var4)) {
               if (var5 != '\ufffe') {
                  this.x8[var5] = var4[0] & 65535;
               }

               this.s7[var4[0]] = var5;
            }

            var3++;
         }
      }

      this.n5(this.s7);
   }

   protected boolean n5(int[] var1) {
      return true;
   }

   protected void n5(char[] var1) {
   }

   private static Object a0() {
      if (z3.get() == null) {
         Object var0 = new Object();
         z3.set(var0);
      }

      return z3.get();
   }

   @Override
   protected void a6() {
      synchronized (a0()) {
         if (this.k5 == null) {
            byte[] var2 = new byte[this.t2];
            synchronized (u9) {
               a6.seek(this.c8, 0);
               a6.read(var2, 0, this.t2);
            }

            int var16 = 0;
            int var4 = 0;

            while (var4 < 65536) {
               char var5 = com.aspose.slides.ms.System.x8.h0(var2, var16);
               var16 += 2;
               if (var5 == 1) {
                  var4 = com.aspose.slides.ms.System.x8.h0(var2, var16);
                  var16 += 2;
               } else if (var5 < ' ' && var5 > 0) {
                  var4 += var5;
               } else {
                  var4++;
               }
            }

            byte var25 = (byte)var16;
            int var6 = 0;
            var4 = com.aspose.slides.ms.System.x8.h0(var2, var16);
            var16 += 2;

            while (var4 < 65536) {
               char var7 = com.aspose.slides.ms.System.x8.h0(var2, var16);
               var16 += 2;
               if (var7 == 1) {
                  var4 = com.aspose.slides.ms.System.x8.h0(var2, var16);
                  var16 += 2;
               } else if (var7 < ' ' && var7 > 0) {
                  var4 += var7;
               } else {
                  if (var7 != '�') {
                     int[] var8 = new int[]{var4};
                     if (this.n5(var8) && this.s7[var8[0]] != var7) {
                        var6++;
                     }
                  }

                  var4++;
               }
            }

            char[] var31 = new char[var6 * 2];
            var6 = 0;
            int var18 = var25;
            var4 = com.aspose.slides.ms.System.x8.h0(var2, var18);
            var18 += 2;
            boolean var33 = false;

            while (var4 < 65536) {
               char var9 = com.aspose.slides.ms.System.x8.h0(var2, var18);
               var18 += 2;
               if (var9 == 1) {
                  var4 = com.aspose.slides.ms.System.x8.h0(var2, var18);
                  var18 += 2;
               } else if (var9 < ' ' && var9 > 0) {
                  var4 += var9;
               } else {
                  if (var9 != '�') {
                     int[] var10 = new int[]{var4};
                     if (this.n5(var10) && this.s7[var10[0]] != var9) {
                        if (var10[0] != var4) {
                           var33 = true;
                        }

                        var31[var6++] = (char)var10[0];
                        var31[var6++] = var9;
                     }
                  }

                  var4++;
               }
            }

            if (var33) {
               for (int var34 = 0; var34 < var31.length - 2; var34 += 2) {
                  int var36 = var34;
                  char var11 = var31[var34];

                  for (int var12 = var34 + 2; var12 < var31.length; var12 += 2) {
                     if (var11 > var31[var12]) {
                        var11 = var31[var12];
                        var36 = var12;
                     }
                  }

                  if (var36 != var34) {
                     char var41 = var31[var36];
                     var31[var36] = var31[var34];
                     var31[var34] = var41;
                     var41 = var31[var36 + 1];
                     var31[var36 + 1] = var31[var34 + 1];
                     var31[var34 + 1] = var41;
                  }
               }
            }

            this.u3 = var31;
            int var35 = var18;
            var18 += 2;
            int var37 = com.aspose.slides.ms.System.x8.h0(var2, var18);
            var6 = 0;

            while (var37 < 65536) {
               char var39 = com.aspose.slides.ms.System.x8.h0(var2, var18);
               var18 += 2;
               if (var39 == 1) {
                  var37 = com.aspose.slides.ms.System.x8.h0(var2, var18);
                  var18 += 2;
               } else if (var39 < ' ' && var39 > 0) {
                  var37 += var39;
               } else {
                  if (var39 > 0) {
                     var6++;
                  }

                  var37++;
               }
            }

            var31 = new char[var6 * 2];
            var18 = var35;
            var18 += 2;
            var37 = com.aspose.slides.ms.System.x8.h0(var2, var18);
            var6 = 0;

            while (var37 < 65536) {
               char var40 = com.aspose.slides.ms.System.x8.h0(var2, var18);
               var18 += 2;
               if (var40 == 1) {
                  var37 = com.aspose.slides.ms.System.x8.h0(var2, var18);
                  var18 += 2;
               } else if (var40 < ' ' && var40 > 0) {
                  var37 += var40;
               } else {
                  if (var40 > 0) {
                     int[] var43 = new int[]{var40};
                     if (this.n5(var43)) {
                        var31[var6++] = (char)var37;
                        var31[var6++] = this.s7[var43[0]];
                     }
                  }

                  var37++;
               }
            }

            this.k5 = var31;
         }
      }
   }

   @Override
   public int n5(char[] var1, int var2, int var3, k7 var4) {
      char var5 = 0;
      if (var4 != null) {
         var5 = var4.k5;
         if (var4.k5() && var4.l6().k5() > 0) {
            throw new ArgumentException(
               o0.n5(
                  "Must complete Convert() operation or call Encoder.Reset() before calling GetBytes() or GetByteCount(). Encoder '{0}' fallback '{1}'.",
                  this.t2(),
                  j8.n5(var4.n5())
               )
            );
         }
      }

      int var6 = 0;
      int var7 = var2;
      int var8 = var2 + var3;
      z3 var9 = null;
      if (var5 > 0) {
         var9 = var4.l6();
         var9.n5(var7, var8, var4, false);
         int[] var10 = new int[]{var7};
         var9.n5(var5, var1, var10);
         var7 = var10[0];
      }

      char var13;
      while ((var13 = var9 == null ? '\u0000' : var9.u9()) != 0 || var7 < var8) {
         if (var13 == 0) {
            var13 = var1[var7];
            var7++;
         }

         int var11 = this.x8[var13];
         if ((var11 & 65535) == 0 && var13 != 0) {
            if (var9 == null) {
               if (var4 == null) {
                  var9 = this.x8().n5();
               } else {
                  var9 = var4.l6();
               }

               var9.n5(var8 - var3, var8, var4, false);
            }

            int[] var12 = new int[]{var7};
            var9.n5(var13, var1, var12);
            var7 = var12[0];
         } else {
            var6++;
            if ((var11 & 65535) >= 256) {
               var6++;
            }
         }
      }

      return var6;
   }

   @Override
   public int n5(char[] var1, int var2, int var3, byte[] var4, int var5, int var6, k7 var7) {
      z3 var8 = null;
      int var9 = var5;
      int var10 = var2;
      int var11 = var10 + var3;
      int var12 = var9 + var6;
      int var13 = var9;
      int var14 = var10;
      char var15 = '\u0000';
      if (var7 != null) {
         var15 = var7.k5;
         var8 = var7.l6();
         var8.n5(var10, var11, var7, true);
         if (var7.u3 && var8.k5() > 0) {
            throw new ArgumentException(
               o0.n5(
                  "Must complete Convert() operation or call Encoder.Reset() before calling GetBytes() or GetByteCount(). Encoder '{0}' fallback '{1}'.",
                  this.t2(),
                  j8.n5(var7.n5())
               )
            );
         }

         if (var15 > 0) {
            int[] var16 = new int[]{var10};
            var8.n5(var15, var1, var16);
            var10 = var16[0];
         }
      }

      char var20;
      while ((var20 = var8 == null ? '\u0000' : var8.u9()) != 0 || var10 < var11) {
         if (var20 == 0) {
            var20 = var1[var10];
            var10++;
         }

         int var17 = this.x8[var20];
         if ((var17 & 65535) == 0 && var20 != 0) {
            if (var8 == null) {
               var8 = this.x8().n5();
               var8.n5(var11 - var3, var11, var7, true);
            }

            int[] var18 = new int[]{var10};
            var8.n5(var20, var1, var18);
            var10 = var18[0];
         } else {
            if ((var17 & 65535) >= 256) {
               if (var9 + 1 >= var12) {
                  if (var8 != null && var8.u9) {
                     var8.l6();
                  } else {
                     var10--;
                  }

                  this.l6(var7, var10 == var14);
                  break;
               }

               var4[var9] = (byte)((var17 & 65535) >> 8);
               var9++;
            } else if (var9 >= var12) {
               if (var8 != null && var8.u9) {
                  var8.l6();
               } else {
                  var10--;
               }

               this.l6(var7, var10 == var14);
               break;
            }

            var4[var9] = (byte)(var17 & 65535 & 0xFF);
            var9++;
         }
      }

      if (var7 != null) {
         if (var8 != null && !var8.a6) {
            var7.k5 = 0;
         }

         var7.a6 = var10 - var14;
      }

      return var9 - var13;
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, x8 var4) {
      a6$n5 var5 = (a6$n5)var4;
      s7 var6 = null;
      int var7 = var2;
      int var8 = var7 + var3;
      int var9 = var3;
      if (var5 != null && (var5.n5 & 255) > 0) {
         if (var3 == 0) {
            if (!var5.u9()) {
               return 0;
            }

            var6 = var5.u3();
            var6.n5(var7, 0);
            byte[] var19 = new byte[]{var5.n5};
            return var6.l6(var19, var7);
         }

         int var10 = (var5.n5 & 255) << 8;
         var10 |= var1[var7] & 255;
         var7++;
         char var11 = this.s7[var10];
         if (var11 == 0 && var10 != 0) {
            var9--;
            var6 = var5.u3();
            var6.n5(var8 - var3, 0);
            byte[] var12 = new byte[]{(byte)(var10 >> 8), (byte)var10};
            var9 += var6.l6(var12, var7);
         }
      }

      while (var7 < var8) {
         int var17 = var1[var7] & 255;
         var7++;
         char var20 = this.s7[var17];
         if (var20 == '\ufffe') {
            var9--;
            if (var7 < var8) {
               int var18 = var17 << 8;
               var17 = var18 | var1[var7] & 255;
               var7++;
               var20 = this.s7[var17];
            } else {
               if (var5 != null && !var5.u9()) {
                  break;
               }

               var9++;
               var20 = 0;
            }
         }

         if (var20 == 0 && var17 != 0) {
            if (var6 == null) {
               if (var5 == null) {
                  var6 = this.n3().n5();
               } else {
                  var6 = var5.u3();
               }

               var6.n5(var8 - var3, 0);
            }

            var9--;
            byte[] var21 = null;
            if (var17 < 256) {
               var21 = new byte[]{(byte)var17};
            } else {
               var21 = new byte[]{(byte)(var17 >> 8), (byte)var17};
            }

            var9 += var6.l6(var21, var7);
         }
      }

      return var9;
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, char[] var4, int var5, int var6, x8 var7) {
      a6$n5 var8 = (a6$n5)var7;
      int var9 = var2;
      int var10 = var5;
      int var11 = var9 + var3;
      int var12 = var10 + var6;
      int var13 = var9;
      int var14 = var10;
      boolean var15 = false;
      s7 var16 = null;
      if (var8 != null && (var8.n5 & 255) > 0) {
         if (var3 == 0) {
            if (!var8.u9()) {
               return 0;
            }

            var16 = var8.u3();
            var16.n5(var9, var12);
            byte[] var27 = new byte[]{var8.n5};
            int[] var29 = new int[]{var10};
            boolean var32 = var16.n5(var27, var9, var4, var29);
            var10 = var29[0];
            if (!var32) {
               this.l6(var8, true);
            }

            var8.n5 = 0;
            return var10 - var14;
         }

         int var17 = (var8.n5 & 255) << 8;
         var17 |= var1[var9] & 255;
         var9++;
         char var18 = this.s7[var17];
         if (var18 == 0 && var17 != 0) {
            var16 = var8.u3();
            var16.n5(var11 - var3, var12);
            byte[] var19 = new byte[]{(byte)(var17 >> 8), (byte)var17};
            int[] var20 = new int[]{var10};
            boolean var21 = var16.n5(var19, var9, var4, var20);
            var10 = var20[0];
            if (!var21) {
               this.l6(var8, true);
            }
         } else {
            if (var10 >= var12) {
               this.l6(var8, true);
            }

            var4[var10++] = var18;
         }
      }

      while (var9 < var11) {
         int var25 = var1[var9] & 255;
         var9++;
         char var28 = this.s7[var25];
         if (var28 == '\ufffe') {
            if (var9 < var11) {
               int var26 = var25 << 8;
               var25 = var26 | var1[var9] & 255;
               var9++;
               var28 = this.s7[var25];
            } else {
               if (var8 != null && !var8.u9()) {
                  var15 = true;
                  var8.n5 = (byte)var25;
                  break;
               }

               var28 = 0;
            }
         }

         if (var28 == 0 && var25 != 0) {
            if (var16 == null) {
               if (var8 == null) {
                  var16 = this.n3().n5();
               } else {
                  var16 = var8.u3();
               }

               var16.n5(var11 - var3, var12);
            }

            byte[] var30 = null;
            if (var25 < 256) {
               var30 = new byte[]{(byte)var25};
            } else {
               var30 = new byte[]{(byte)(var25 >> 8), (byte)var25};
            }

            int[] var33 = new int[]{var10};
            boolean var34 = var16.n5(var30, var9, var4, var33);
            var10 = var33[0];
            if (!var34) {
               var9 -= var30.length;
               var16.u3();
               this.l6(var8, var9 == var13);
               break;
            }
         } else {
            if (var10 >= var12) {
               var9--;
               if (var25 >= 256) {
                  var9--;
               }

               this.l6(var8, var9 == var13);
               break;
            }

            var4[var10++] = var28;
         }
      }

      if (var8 != null) {
         if (!var15) {
            var8.n5 = 0;
         }

         var8.a6 = var9 - var13;
      }

      return var10 - var14;
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

      var2 *= 2L;
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

      long var2 = var1 + 1L;
      if (this.n3().l6() > 1) {
         var2 *= this.n3().l6();
      }

      if (var2 > 2147483647L) {
         throw new ArgumentOutOfRangeException("byteCount", "Too many bytes. The resulting number of chars is larger than what can be returned as an int.");
      } else {
         return (int)var2;
      }
   }

   @Override
   public u9 l6() {
      return new a6$n5(this);
   }
}
