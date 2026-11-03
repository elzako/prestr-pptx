package com.aspose.slides.internal.l7h;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public final class z7 extends j5 {
   public static final z7 n5 = new z7(false, true);
   public static final z7 l6 = new z7(true, true);
   private static final byte[] k5 = new byte[]{0, 0, -2, -1};
   private static final byte[] u3 = new byte[]{-1, -2, 0, 0};
   private boolean a6 = false;
   private boolean u9 = false;
   private boolean h0 = false;

   public z7() {
      this(false, true, false);
   }

   public z7(boolean var1, boolean var2) {
      this(var1, var2, false);
   }

   public z7(boolean var1, boolean var2, boolean var3) {
      super(var1 ? 12001 : 12000);
      this.h0 = var1;
      this.a6 = var2;
      this.u9 = var3;
      if (this.u9) {
         this.n5();
      }
   }

   @Override
   public void n5() {
      if (this.u9) {
         this.t9 = q0.u3();
         this.z1 = t2.u3();
      } else {
         this.t9 = new m3("�");
         this.z1 = new n3("�");
      }
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
      int var5 = var2 + var3;
      int var6 = var2;
      byte var7 = 0;
      char var8 = 0;
      z3 var9 = null;
      int[] var10 = new int[1];
      if (var4 != null) {
         var8 = var4.k5;
         var9 = var4.l6();
         if (var9.k5() > 0) {
            throw new ArgumentException(
               o0.n5(
                  "Must complete Convert() operation or call Encoder.Reset() before calling GetBytes() or GetByteCount(). Encoder '{0}' fallback '{1}'.",
                  this.t2(),
                  j8.n5(var4.n5())
               )
            );
         }
      } else {
         var9 = this.t9.n5();
      }

      var9.n5(var2, var5, var4, false);

      while (true) {
         char var11;
         while ((var11 = var9.u9()) != 0 || var6 < var5) {
            if (var11 == 0) {
               var11 = var1[var6];
               var6++;
            }

            if (var8 != 0) {
               if (com.aspose.slides.ms.System.t9.t2(var11)) {
                  var8 = 0;
                  var7 += 4;
               } else {
                  var10[0] = --var6;
                  var9.n5(var8, var1, var10);
                  var6 = var10[0];
                  var8 = 0;
               }
            } else if (com.aspose.slides.ms.System.t9.a6(var11)) {
               var8 = var11;
            } else if (com.aspose.slides.ms.System.t9.t2(var11)) {
               var10[0] = var6;
               var9.n5(var11, var1, var10);
               var6 = var10[0];
            } else {
               var7 += 4;
            }
         }

         if (var4 != null && !var4.u9() || var8 <= 0) {
            if (var7 < 0) {
               throw new ArgumentOutOfRangeException(
                  "count", "Too many characters. The resulting number of bytes is larger than what can be returned as an int."
               );
            } else {
               return var7;
            }
         }

         var10[0] = var6;
         var9.n5(var8, var1, var10);
         var6 = var10[0];
         var8 = 0;
      }
   }

   @Override
   public int n5(char[] var1, int var2, int var3, byte[] var4, int var5, int var6, k7 var7) {
      int var8 = var2 + var3;
      int var9 = var2;
      int var10 = var5;
      int var11 = var10 + var6;
      char var12 = 0;
      z3 var13 = null;
      int[] var14 = new int[1];
      if (var7 != null) {
         var12 = var7.k5;
         var13 = var7.l6();
         if (var7.u3 && var13.k5() > 0) {
            throw new ArgumentException(
               o0.n5(
                  "Must complete Convert() operation or call Encoder.Reset() before calling GetBytes() or GetByteCount(). Encoder '{0}' fallback '{1}'.",
                  this.t2(),
                  j8.n5(var7.n5())
               )
            );
         }
      } else {
         var13 = this.t9.n5();
      }

      var13.n5(var2, var8, var7, true);

      while (true) {
         char var15;
         while ((var15 = var13.u9()) != 0 || var9 < var8) {
            if (var15 == 0) {
               var15 = var1[var9];
               var9++;
            }

            if (var12 != 0) {
               if (com.aspose.slides.ms.System.t9.t2(var15)) {
                  long var16 = this.n5(var12, var15);
                  var12 = 0;
                  if (var10 + 3 >= var11) {
                     if (var13.u9) {
                        var13.l6();
                        var13.l6();
                     } else {
                        var9 -= 2;
                     }

                     this.n5(var7, var10 == var5);
                     var12 = 0;
                     break;
                  }

                  if (this.h0) {
                     var4[var10++] = 0;
                     var4[var10++] = (byte)((var16 & 4294967295L) >> 16 & 4294967295L);
                     var4[var10++] = (byte)((var16 & 4294967295L) >> 8 & 4294967295L);
                     var4[var10++] = (byte)var16;
                  } else {
                     var4[var10++] = (byte)var16;
                     var4[var10++] = (byte)((var16 & 4294967295L) >> 8 & 4294967295L);
                     var4[var10++] = (byte)((var16 & 4294967295L) >> 16 & 4294967295L);
                     var4[var10++] = 0;
                  }
               } else {
                  var14[0] = --var9;
                  var13.n5(var12, var1, var14);
                  var9 = var14[0];
                  var12 = 0;
               }
            } else if (com.aspose.slides.ms.System.t9.a6(var15)) {
               var12 = var15;
            } else if (com.aspose.slides.ms.System.t9.t2(var15)) {
               var14[0] = var9;
               var13.n5(var15, var1, var14);
               var9 = var14[0];
            } else {
               if (var10 + 3 >= var11) {
                  if (var13.u9) {
                     var13.l6();
                  } else {
                     var9--;
                  }

                  this.n5(var7, var10 == var5);
                  break;
               }

               if (this.h0) {
                  var4[var10++] = 0;
                  var4[var10++] = 0;
                  var4[var10++] = (byte)((var15 & 4294967295L) >> 8 & 4294967295L);
                  var4[var10++] = (byte)var15;
               } else {
                  var4[var10++] = (byte)var15;
                  var4[var10++] = (byte)((var15 & 4294967295L) >> 8 & 4294967295L);
                  var4[var10++] = 0;
                  var4[var10++] = 0;
               }
            }
         }

         if (var7 != null && !var7.u9() || var12 <= 0) {
            if (var7 != null) {
               var7.k5 = var12;
               var7.a6 = var9 - var2;
            }

            return var10 - var5;
         }

         var14[0] = var9;
         var13.n5(var12, var1, var14);
         var9 = var14[0];
         var12 = 0;
      }
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, x8 var4) {
      z7$n5 var5 = (z7$n5)var4;
      int var6 = 0;
      int var7 = var2 + var3;
      int var8 = var2;
      int var9 = 0;
      long var10 = 0L;
      s7 var12 = null;
      if (var5 != null) {
         var9 = var5.u9;
         var10 = var5.n5 & 4294967295L;
         var12 = var5.u3();
      } else {
         var12 = this.z1.n5();
      }

      var12.n5(var2, 0);

      while (var8 < var7 && var6 >= 0) {
         if (this.h0) {
            var10 = (var10 & 4294967295L) << 8 & 4294967295L;
            var10 = (var10 & 4294967295L) + (var1[var8++] & 0xFF) & 4294967295L;
         } else {
            var10 = (var10 & 4294967295L) >> 8 & 4294967295L;
            var10 = (var10 & 4294967295L) + ((var1[var8++] & 255) << 24 & 4294967295L) & 4294967295L;
         }

         if (++var9 >= 4) {
            var9 = 0;
            if ((var10 & 4294967295L) > 1114111L || (var10 & 4294967295L) >= 55296L && (var10 & 4294967295L) <= 57343L) {
               byte[] var13;
               if (this.h0) {
                  var13 = new byte[]{
                     (byte)((var10 & 4294967295L) >> 24 & 4294967295L),
                     (byte)((var10 & 4294967295L) >> 16 & 4294967295L),
                     (byte)((var10 & 4294967295L) >> 8 & 4294967295L),
                     (byte)var10
                  };
               } else {
                  var13 = new byte[]{
                     (byte)var10,
                     (byte)((var10 & 4294967295L) >> 8 & 4294967295L),
                     (byte)((var10 & 4294967295L) >> 16 & 4294967295L),
                     (byte)((var10 & 4294967295L) >> 24 & 4294967295L)
                  };
               }

               var6 += var12.l6(var13, var8);
               var10 = 0L;
            } else {
               if ((var10 & 4294967295L) >= 65536L) {
                  var6++;
               }

               var6++;
               var10 = 0L;
            }
         }
      }

      if (var9 > 0 && (var5 == null || var5.u9())) {
         byte[] var17 = new byte[var9];
         if (this.h0) {
            while (var9 > 0) {
               var17[--var9] = (byte)var10;
               var10 = (var10 & 4294967295L) >> 8 & 4294967295L;
            }
         } else {
            while (var9 > 0) {
               var17[--var9] = (byte)((var10 & 4294967295L) >> 24 & 4294967295L);
               var10 = (var10 & 4294967295L) << 8 & 4294967295L;
            }
         }

         var6 += var12.l6(var17, var8);
      }

      if (var6 < 0) {
         throw new ArgumentOutOfRangeException("count", "Too many characters. The resulting number of bytes is larger than what can be returned as an int.");
      } else {
         return var6;
      }
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, char[] var4, int var5, int var6, x8 var7) {
      z7$n5 var8 = (z7$n5)var7;
      int var9 = var5 + var6;
      int var10 = var5;
      int var11 = var2 + var3;
      int var12 = var2;
      int var13 = 0;
      long var14 = 0L;
      s7 var16 = null;
      int[] var17 = new int[1];
      if (var8 != null) {
         var13 = var8.u9;
         var14 = var8.n5 & 4294967295L;
         var16 = var7.u3();
      } else {
         var16 = this.z1.n5();
      }

      var16.n5(var12, var9);

      while (var12 < var11) {
         if (this.h0) {
            var14 = (var14 & 4294967295L) << 8 & 4294967295L;
            var14 = (var14 & 4294967295L) + (var1[var12++] & 0xFF) & 4294967295L;
         } else {
            var14 = (var14 & 4294967295L) >> 8 & 4294967295L;
            var14 = (var14 & 4294967295L) + ((var1[var12++] & 255) << 24 & 4294967295L) & 4294967295L;
         }

         if (++var13 >= 4) {
            var13 = 0;
            if ((var14 & 4294967295L) > 1114111L || (var14 & 4294967295L) >= 55296L && (var14 & 4294967295L) <= 57343L) {
               byte[] var18;
               if (this.h0) {
                  var18 = new byte[]{
                     (byte)((var14 & 4294967295L) >> 24 & 4294967295L),
                     (byte)((var14 & 4294967295L) >> 16 & 4294967295L),
                     (byte)((var14 & 4294967295L) >> 8 & 4294967295L),
                     (byte)var14
                  };
               } else {
                  var18 = new byte[]{
                     (byte)var14,
                     (byte)((var14 & 4294967295L) >> 8 & 4294967295L),
                     (byte)((var14 & 4294967295L) >> 16 & 4294967295L),
                     (byte)((var14 & 4294967295L) >> 24 & 4294967295L)
                  };
               }

               var17[0] = var10;
               boolean var19 = var16.n5(var18, var12, var4, var17);
               var10 = var17[0];
               if (!var19) {
                  var12 -= 4;
                  var14 = 0L;
                  var16.u3();
                  this.n5(var8, var10 == var5);
                  break;
               }

               var14 = 0L;
            } else {
               if ((var14 & 4294967295L) >= 65536L) {
                  if (var10 >= var9 - 1) {
                     var12 -= 4;
                     var14 = 0L;
                     this.n5(var8, var10 == var5);
                     break;
                  }

                  var4[var10++] = this.n5(var14);
                  var14 = this.l6(var14);
               } else if (var10 >= var9) {
                  var12 -= 4;
                  var14 = 0L;
                  this.n5(var8, var10 == var5);
                  break;
               }

               var4[var10++] = (char)var14;
               var14 = 0L;
            }
         }
      }

      if (var13 > 0 && (var8 == null || var8.u9())) {
         byte[] var24 = new byte[var13];
         int var25 = var13;
         if (this.h0) {
            while (var25 > 0) {
               var24[--var25] = (byte)var14;
               var14 = (var14 & 4294967295L) >> 8 & 4294967295L;
            }
         } else {
            while (var25 > 0) {
               var24[--var25] = (byte)((var14 & 4294967295L) >> 24 & 4294967295L);
               var14 = (var14 & 4294967295L) << 8 & 4294967295L;
            }
         }

         var17[0] = var10;
         boolean var20 = var16.n5(var24, var12, var4, var17);
         var10 = var17[0];
         if (!var20) {
            var16.u3();
            this.n5(var8, var10 == var5);
         } else {
            var13 = 0;
            var14 = 0L;
         }
      }

      if (var8 != null) {
         var8.n5 = (int)var14;
         var8.u9 = var13;
         var8.a6 = var12 - var2;
      }

      return var10 - var5;
   }

   private long n5(char var1, char var2) {
      return ((((var1 & 4294967295L) - 55296L & 4294967295L) * 1024L & 4294967295L) + ((var2 & 4294967295L) - 56320L & 4294967295L) & 4294967295L) + 65536L
         & 4294967295L;
   }

   private char n5(long var1) {
      return (char)((((var1 & 4294967295L) - 65536L & 4294967295L) / 1024L & 4294967295L) + 55296L & 4294967295L);
   }

   private char l6(long var1) {
      return (char)((((var1 & 4294967295L) - 65536L & 4294967295L) % 1024L & 4294967295L) + 56320L & 4294967295L);
   }

   @Override
   public u9 l6() {
      return new z7$n5(this);
   }

   @Override
   public t9 k5() {
      return new k7(this);
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

      var2 *= 4L;
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

      int var2 = var1 / 2 + 2;
      if (this.n3().l6() > 2) {
         var2 *= this.n3().l6();
         var2 /= 2;
      }

      if (var2 > Integer.MAX_VALUE) {
         throw new ArgumentOutOfRangeException("byteCount", "Too many bytes. The resulting number of chars is larger than what can be returned as an int.");
      } else {
         return var2;
      }
   }

   @Override
   public byte[] h0() {
      if (this.a6) {
         return this.h0 ? new byte[]{0, 0, -2, -1} : new byte[]{-1, -2, 0, 0};
      } else {
         return new byte[0];
      }
   }

   @Override
   public byte[] c8() {
      return j8.n5(this) != com.aspose.slides.internal.v6g.k5.n5(z7.class) ? this.h0() : (this.a6 ? (this.h0 ? k5 : u3) : new byte[0]);
   }

   @Override
   public boolean equals(Object value) {
      z7 var2 = com.aspose.slides.internal.v6g.k5.n5(value, z7.class);
      return var2 == null ? false : this.a6 == var2.a6 && this.h0 == var2.h0 && this.x8().equals(var2.x8()) && this.n3().equals(var2.n3());
   }

   @Override
   public int hashCode() {
      return this.x8().hashCode() + this.n3().hashCode() + this.t9() + (this.a6 ? 4 : 0) + (this.h0 ? 8 : 0);
   }
}
