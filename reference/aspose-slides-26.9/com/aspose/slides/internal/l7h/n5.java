package com.aspose.slides.internal.l7h;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public class n5 extends j5 {
   public static final n5$n5 n5 = new n5$n5();

   public n5() {
      super(20127);
   }

   @Override
   public void n5() {
      this.t9 = q0.k5();
      this.z1 = t2.k5();
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
         throw new ArgumentNullException("chars");
      }

      char[] var2 = d1.c8(var1);
      return this.n5(var2, 0, var1.length(), null);
   }

   @Override
   public int n5(String var1, int var2, int var3, byte[] var4, int var5) {
      if (var1 == null || var4 == null) {
         throw new ArgumentNullException(var1 == null ? "chars" : "bytes", "Array cannot be null.");
      }

      if (var2 >= 0 && var3 >= 0) {
         if (var1.length() - var2 < var3) {
            throw new ArgumentOutOfRangeException("chars", "Index and count must refer to a location within the string.");
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
         throw new ArgumentOutOfRangeException(var2 < 0 ? "byteIndex" : "byteCount", "Non-negative number required.");
      }
   }

   @Override
   public int n5(char[] var1, int var2, int var3, k7 var4) {
      char var5 = 0;
      m3 var6 = null;
      int var7 = var2 + var3;
      int var8 = var2;
      z3 var9 = null;
      int[] var10 = new int[1];
      if (var4 != null) {
         var5 = var4.k5;
         var6 = com.aspose.slides.internal.v6g.k5.n5(var4.n5(), m3.class);
         if (var4.k5()) {
            var9 = var4.l6();
            if (var9.k5() > 0 && var4.u3) {
               throw new ArgumentException(
                  o0.n5(
                     "Must complete Convert() operation or call Encoder.Reset() before calling GetBytes() or GetByteCount(). Encoder '{0}' fallback '{1}'.",
                     this.t2(),
                     j8.n5(var4.n5())
                  )
               );
            }

            var9.n5(var8, var7, var4, false);
         }
      } else {
         var6 = com.aspose.slides.internal.v6g.k5.n5(this.x8(), m3.class);
      }

      if (var6 != null && var6.l6() == 1) {
         if (var5 > 0) {
            var3++;
         }

         return var3;
      } else {
         int var11 = 0;
         if (var5 > 0) {
            var9 = var4.l6();
            var9.n5(var8, var7, var4, false);
            var10[0] = var8;
            var9.n5(var5, var1, var10);
            var8 = var10[0];
         }

         char var12;
         while ((var12 = var9 == null ? '\u0000' : var9.u9()) != 0 || var8 < var7) {
            if (var12 == 0) {
               var12 = var1[var8];
               var8++;
            }

            if (var12 > 127) {
               if (var9 == null) {
                  if (var4 == null) {
                     var9 = this.t9.n5();
                  } else {
                     var9 = var4.l6();
                  }

                  var9.n5(var7 - var3, var7, var4, false);
               }

               var10[0] = var8;
               var9.n5(var12, var1, var10);
               var8 = var10[0];
            } else {
               var11++;
            }
         }

         return var11;
      }
   }

   @Override
   public int n5(char[] var1, int var2, int var3, byte[] var4, int var5, int var6, k7 var7) {
      char var8 = 0;
      m3 var9 = null;
      z3 var10 = null;
      int[] var11 = new int[1];
      int var12 = var2 + var3;
      int var13 = var2;
      int var14 = var5;
      if (var7 != null) {
         var8 = var7.k5;
         var9 = com.aspose.slides.internal.v6g.k5.n5(var7.n5(), m3.class);
         if (var7.k5()) {
            var10 = var7.l6();
            if (var10.k5() > 0 && var7.u3) {
               throw new ArgumentException(
                  o0.n5(
                     "Must complete Convert() operation or call Encoder.Reset() before calling GetBytes() or GetByteCount(). Encoder '{0}' fallback '{1}'.",
                     this.t2(),
                     j8.n5(var7.n5())
                  )
               );
            }

            var10.n5(var2, var12, var7, true);
         }
      } else {
         var9 = com.aspose.slides.internal.v6g.k5.n5(this.x8(), m3.class);
      }

      if (var9 != null && var9.l6() == 1) {
         char var15 = var9.a6().charAt(0);
         if (var15 <= 127) {
            if (var8 > 0) {
               if (var6 == 0) {
                  this.n5(var7, true);
               }

               var4[var14++] = (byte)var15;
               var6--;
            }

            if (var6 < var3) {
               this.n5(var7, var6 < 1);
               var12 = var13 + var6;
            }

            while (var13 < var12) {
               char var19 = var1[var13++];
               if (var19 >= 128) {
                  var4[var14++] = (byte)var15;
               } else {
                  var4[var14++] = (byte)var19;
               }
            }

            if (var7 != null) {
               var7.k5 = 0;
               var7.a6 = var13 - var2;
            }

            return var14 - var5;
         }
      }

      int var18 = var14 + var6;
      if (var8 > 0) {
         var10 = var7.l6();
         var10.n5(var2, var12, var7, true);
         var11[0] = var13;
         var10.n5(var8, var1, var11);
         var13 = var11[0];
      }

      char var16;
      while ((var16 = var10 == null ? '\u0000' : var10.u9()) != 0 || var13 < var12) {
         if (var16 == 0) {
            var16 = var1[var13];
            var13++;
         }

         if (var16 > 127) {
            if (var10 == null) {
               if (var7 == null) {
                  var10 = this.t9.n5();
               } else {
                  var10 = var7.l6();
               }

               var10.n5(var12 - var3, var12, var7, true);
            }

            var11[0] = var13;
            var10.n5(var16, var1, var11);
            var13 = var11[0];
         } else {
            if (var14 >= var18) {
               if (var10 != null && var10.u9) {
                  var10.l6();
               } else {
                  var13--;
               }

               this.n5(var7, var14 == var5);
               break;
            }

            var4[var14] = (byte)var16;
            var14++;
         }
      }

      if (var7 != null) {
         if (var10 != null && !var10.a6) {
            var7.k5 = 0;
         }

         var7.a6 = var13 - var2;
      }

      return var14 - var5;
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, x8 var4) {
      n3 var5 = null;
      if (var4 == null) {
         var5 = com.aspose.slides.internal.v6g.k5.n5(this.n3(), n3.class);
      } else {
         var5 = com.aspose.slides.internal.v6g.k5.n5(var4.k5(), n3.class);
      }

      if (var5 != null && var5.l6() == 1) {
         return var3;
      }

      s7 var6 = null;
      int var7 = var3;
      byte[] var8 = new byte[1];
      int var9 = var2 + var3;
      int var10 = var2;

      while (var10 < var9) {
         byte var11 = var1[var10];
         var10++;
         if ((var11 & 255) >= 128) {
            if (var6 == null) {
               if (var4 == null) {
                  var6 = this.n3().n5();
               } else {
                  var6 = var4.u3();
               }

               var6.n5(var9 - var3, 0);
            }

            var8[0] = var11;
            var7 = --var7 + var6.l6(var8, var10);
         }
      }

      return var7;
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, char[] var4, int var5, int var6, x8 var7) {
      int var8 = var2 + var3;
      int var9 = var2;
      int var10 = var5;
      n3 var11 = null;
      int[] var12 = new int[1];
      if (var7 == null) {
         var11 = com.aspose.slides.internal.v6g.k5.n5(this.n3(), n3.class);
      } else {
         var11 = com.aspose.slides.internal.v6g.k5.n5(var7.k5(), n3.class);
      }

      if (var11 != null && var11.l6() == 1) {
         char var19 = var11.a6().charAt(0);
         if (var6 < var3) {
            this.n5(var7, var6 < 1);
            var8 = var9 + var6;
         }

         while (var9 < var8) {
            byte var20 = var1[var9++];
            if ((var20 & 255) >= 128) {
               var4[var10++] = var19;
            } else {
               var4[var10++] = (char)(var20 & 0xFF);
            }
         }

         if (var7 != null) {
            var7.a6 = var9 - var2;
         }

         return var10 - var5;
      } else {
         s7 var13 = null;
         byte[] var14 = new byte[1];
         int var15 = var10 + var6;

         while (var9 < var8) {
            byte var16 = var1[var9];
            var9++;
            if ((var16 & 255) >= 128) {
               if (var13 == null) {
                  if (var7 == null) {
                     var13 = this.n3().n5();
                  } else {
                     var13 = var7.u3();
                  }

                  var13.n5(var8 - var3, var15);
               }

               var14[0] = var16;
               var12[0] = var10;
               boolean var17 = var13.n5(var14, var9, var4, var12);
               var10 = var12[0];
               if (!var17) {
                  var9--;
                  var13.u3();
                  this.n5(var7, var10 == var5);
                  break;
               }
            } else {
               if (var10 >= var15) {
                  var9--;
                  this.n5(var7, var10 == var5);
                  break;
               }

               var4[var10] = (char)(var16 & 0xFF);
               var10++;
            }
         }

         if (var7 != null) {
            var7.a6 = var9 - var2;
         }

         return var10 - var5;
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

   @Override
   public u9 l6() {
      return new x8(this);
   }

   @Override
   public t9 k5() {
      return new k7(this);
   }
}
