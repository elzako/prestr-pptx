package com.aspose.slides.internal.l7h;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public class u6 extends j5 {
   public static final u6$k5 n5 = new u6$k5(true);
   public static final u6 l6 = new u6(false);
   public static final byte[] k5 = new byte[]{-17, -69, -65};
   public boolean u3 = false;
   private boolean a6 = false;

   public u6() {
      this(false);
   }

   public u6(boolean var1) {
      this(var1, false);
   }

   public u6(boolean var1, boolean var2) {
      super(65001);
      this.u3 = var1;
      this.a6 = var2;
      if (this.a6) {
         this.n5();
      }
   }

   @Override
   public void n5() {
      if (this.a6) {
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
      z3 var5 = null;
      int[] var6 = new int[1];
      int var7 = var2;
      int var8 = var7 + var3;
      int var9 = var3;
      int var10 = 0;
      if (var4 != null) {
         u6$l6 var11 = (u6$l6)var4;
         var10 = var11.u9;
         if (var11.k5()) {
            var5 = var11.l6();
            if (var5.k5() > 0) {
               throw new ArgumentException(
                  o0.n5(
                     "Must complete Convert() operation or call Encoder.Reset() before calling GetBytes() or GetByteCount(). Encoder '{0}' fallback '{1}'.",
                     this.t2(),
                     j8.n5(var11.n5())
                  )
               );
            }

            var5.n5(var7, var8, var11, false);
         }
      }

      while (true) {
         while (true) {
            label90:
            if (var7 >= var8) {
               if (var10 == 0) {
                  var10 = var5 != null ? var5.u9() : '\u0000';
                  if (var10 > 0) {
                     var9++;
                     break label90;
                  }
               } else if (var5 != null && var5.u9) {
                  var10 = var5.u9();
                  var9++;
                  if (n5(var10, 56320, 57343)) {
                     var10 = 65533;
                     var9++;
                     break;
                  }

                  if (var10 <= 0) {
                     var9--;
                     return var9;
                  }
                  break label90;
               }

               if (var10 <= 0 || var4 != null && !var4.u9()) {
                  return var9;
               }

               var9++;
               break;
            } else {
               label101: {
                  if (var10 > 0) {
                     char var12 = var1[var7];
                     var9++;
                     if (n5(var12, 56320, 57343)) {
                        var10 = 65533;
                        var7++;
                     }
                     break;
                  }

                  if (var5 != null) {
                     var10 = var5.u9();
                     if (var10 > 0) {
                        var9++;
                        break label101;
                     }
                  }

                  var10 = var1[var7];
                  var7++;
               }
            }

            if (!n5(var10, 55296, 56319)) {
               break;
            }

            var9--;
         }

         if (n5(var10, 55296, 57343)) {
            if (var5 == null) {
               if (var4 == null) {
                  var5 = this.t9.n5();
               } else {
                  var5 = var4.l6();
               }

               var5.n5(var7, var8, var4, false);
            }

            var6[0] = var7;
            var5.n5((char)var10, var1, var6);
            var7 = var6[0];
            var9--;
            var10 = 0;
         } else {
            if (var10 > 127) {
               if (var10 > 2047) {
                  var9++;
               }

               var9++;
            }

            var10 = 0;
         }
      }
   }

   private static boolean n5(int var0, int var1, int var2) {
      return (var0 - var1 & 4294967295L) <= (var2 - var1 & 4294967295L);
   }

   @Override
   public int n5(char[] var1, int var2, int var3, byte[] var4, int var5, int var6, k7 var7) {
      u6$l6 var8 = null;
      z3 var9 = null;
      int[] var10 = new int[1];
      int var11 = var2;
      int var12 = var5;
      int var13 = var11 + var3;
      int var14 = var12 + var6;
      int var15 = 0;
      if (var7 != null) {
         var8 = (u6$l6)var7;
         var15 = var8.u9;
         if (var8.k5()) {
            var9 = var8.l6();
            if (var9.k5() > 0 && var8.u3) {
               throw new ArgumentException(
                  o0.n5(
                     "Must complete Convert() operation or call Encoder.Reset() before calling GetBytes() or GetByteCount(). Encoder '{0}' fallback '{1}'.",
                     this.t2(),
                     j8.n5(var8.n5())
                  )
               );
            }

            var9.n5(var11, var13, var8, true);
         }
      }

      label139:
      while (true) {
         do {
            if (var11 >= var13) {
               if (var15 == 0) {
                  var15 = var9 != null ? var9.u9() : '\u0000';
                  if (var15 > 0) {
                     continue;
                  }
               } else if (var9 != null && var9.u9) {
                  int var18 = var15;
                  var15 = var9.u9();
                  if (n5(var15, 56320, 57343)) {
                     var15 = var15 + (var18 << 10) + -56613888;
                     break;
                  }

                  if (var15 <= 0) {
                     break label139;
                  }
                  continue;
               }

               if (var15 <= 0 || var8 != null && !var8.u9()) {
                  break label139;
               }
               break;
            } else {
               if (var15 > 0) {
                  char var16 = var1[var11];
                  if (n5(var16, 56320, 57343)) {
                     var15 = var16 + (var15 << 10) + -56613888;
                     var11++;
                  }
                  break;
               }

               if (var9 != null) {
                  var15 = var9.u9();
                  if (var15 > 0) {
                     continue;
                  }
               }

               var15 = var1[var11];
               var11++;
            }
         } while (n5(var15, 55296, 56319));

         if (n5(var15, 55296, 57343)) {
            if (var9 == null) {
               if (var7 == null) {
                  var9 = this.t9.n5();
               } else {
                  var9 = var7.l6();
               }

               var9.n5(var11, var13, var7, true);
            }

            var10[0] = var11;
            var9.n5((char)var15, var1, var10);
            var11 = var10[0];
            var15 = 0;
         } else {
            int var19 = 1;
            if (var15 > 127) {
               if (var15 > 2047) {
                  if (var15 > 65535) {
                     var19++;
                  }

                  var19++;
               }

               var19++;
            }

            if (var12 > var14 - var19) {
               if (var9 != null && var9.u9) {
                  var9.l6();
                  if (var15 > 65535) {
                     var9.l6();
                  }
               } else {
                  var11--;
                  if (var15 > 65535) {
                     var11--;
                  }
               }

               this.n5(var8, var12 == var5);
               var15 = 0;
               break;
            }

            if (var15 <= 127) {
               var4[var12] = (byte)var15;
            } else {
               int var17;
               if (var15 <= 2047) {
                  var17 = (byte)(-64 | var15 >> 6) & 255;
               } else {
                  if (var15 <= 65535) {
                     var17 = (byte)(-32 | var15 >> 12) & 255;
                  } else {
                     var4[var12] = (byte)(-16 | var15 >> 18);
                     var12++;
                     var17 = -128 | var15 >> 12 & 63;
                  }

                  var4[var12] = (byte)var17;
                  var12++;
                  var17 = -128 | var15 >> 6 & 63;
               }

               var4[var12] = (byte)var17;
               var4[++var12] = (byte)(-128 | var15 & 63);
            }

            var12++;
            var15 = 0;
         }
      }

      if (var8 != null) {
         var8.u9 = var15;
         var8.a6 = var11 - var2;
      }

      return var12 - var5;
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, x8 var4) {
      int var5 = var2;
      int var6 = var5 + var3;
      int var7 = var3;
      int var8 = 0;
      s7 var9 = null;
      if (var4 != null) {
         u6$n5 var10 = (u6$n5)var4;
         var8 = var10.n5;
         var7 -= var8 >> 30;
      }

      while (var5 < var6) {
         if (var8 == 0) {
            var8 = var1[var5] & 255;
            var5++;
            if (var8 > 127) {
               var7--;
               if ((var8 & 64) == 0) {
                  if (var9 == null) {
                     if (var4 == null) {
                        var9 = this.z1.n5();
                     } else {
                        var9 = var4.u3();
                     }

                     var9.n5(var5, 0);
                  }

                  var7 += this.n5(var5, var8, var9);
                  var8 = 0;
               } else if ((var8 & 32) != 0) {
                  if ((var8 & 16) != 0) {
                     var8 &= 15;
                     if (var8 > 4) {
                        var8 |= 240;
                        if (var9 == null) {
                           if (var4 == null) {
                              var9 = this.z1.n5();
                           } else {
                              var9 = var4.u3();
                           }

                           var9.n5(var5, 0);
                        }

                        var7 += this.n5(var5, var8, var9);
                        var8 = 0;
                     } else {
                        var8 |= 1347226624;
                        var7--;
                     }
                  } else {
                     var8 = var8 & 15 | 1210220544;
                     var7--;
                  }
               } else {
                  var8 &= 31;
                  if (var8 <= 1) {
                     var8 |= 192;
                     if (var9 == null) {
                        if (var4 == null) {
                           var9 = this.z1.n5();
                        } else {
                           var9 = var4.u3();
                        }

                        var9.n5(var5, 0);
                     }

                     var7 += this.n5(var5, var8, var9);
                     var8 = 0;
                  } else {
                     var8 |= 8388608;
                  }
               }
               continue;
            }
         } else {
            int var17 = var1[var5] & 255;
            var5++;
            if ((var17 & -64) != 128) {
               var5--;
               var7 += var8 >> 30;
               if (var9 == null) {
                  if (var4 == null) {
                     var9 = this.z1.n5();
                  } else {
                     var9 = var4.u3();
                  }

                  var9.n5(var5, 0);
               }

               var7 += this.n5(var5, var8, var9);
               var8 = 0;
               continue;
            }

            var8 = var8 << 6 | var17 & 63;
            if ((var8 & 536870912) == 0) {
               if ((var8 & 268435456) != 0) {
                  if ((var8 & 8388608) == 0 && !n5(var8 & 496, 16, 256)) {
                     if (var9 == null) {
                        if (var4 == null) {
                           var9 = this.z1.n5();
                        } else {
                           var9 = var4.u3();
                        }

                        var9.n5(var5, 0);
                     }

                     var7 += this.n5(var5, var8, var9);
                     var8 = 0;
                  }
                  continue;
               }

               if ((var8 & 992) != 0 && (var8 & 992) != 864) {
                  continue;
               }

               if (var9 == null) {
                  if (var4 == null) {
                     var9 = this.z1.n5();
                  } else {
                     var9 = var4.u3();
                  }

                  var9.n5(var5, 0);
               }

               var7 += this.n5(var5, var8, var9);
               var8 = 0;
               continue;
            }

            if ((var8 & 270467072) == 268435456) {
               var7--;
            }
         }

         var8 = 0;
      }

      if (var8 != 0) {
         var7 += var8 >> 30;
         if (var4 == null || var4.u9()) {
            if (var9 == null) {
               if (var4 == null) {
                  var9 = this.z1.n5();
               } else {
                  var9 = var4.u3();
               }

               var9.n5(var5, 0);
            }

            var7 += this.n5(var5, var8, var9);
         }
      }

      return var7;
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, char[] var4, int var5, int var6, x8 var7) {
      int var8 = var2;
      int var9 = var5;
      int var10 = var8 + var3;
      int var11 = var9 + var6;
      int var12 = 0;
      s7 var13 = null;
      int[] var14 = new int[1];
      int[] var15 = new int[1];
      if (var7 != null) {
         u6$n5 var16 = (u6$n5)var7;
         var12 = var16.n5;
      }

      while (var8 < var10) {
         if (var12 == 0) {
            var12 = var1[var8] & 255;
            var8++;
            if (var12 > 127) {
               if ((var12 & 64) == 0) {
                  if (var13 == null) {
                     if (var7 == null) {
                        var13 = this.z1.n5();
                     } else {
                        var13 = var7.u3();
                     }

                     var13.n5(var8, var11);
                  }

                  var14[0] = var8;
                  var15[0] = var9;
                  boolean var26 = this.n5(var14, var12, var13, var4, var15);
                  var8 = var14[0];
                  var9 = var15[0];
                  if (!var26) {
                     var13.u3();
                     this.n5(var7, var9 == var5);
                     var12 = 0;
                     break;
                  }

                  var12 = 0;
                  continue;
               }

               if ((var12 & 32) != 0) {
                  if ((var12 & 16) != 0) {
                     var12 &= 15;
                     if (var12 > 4) {
                        var12 |= 240;
                        if (var13 == null) {
                           if (var7 == null) {
                              var13 = this.z1.n5();
                           } else {
                              var13 = var7.u3();
                           }

                           var13.n5(var8, var11);
                        }

                        var14[0] = var8;
                        var15[0] = var9;
                        boolean var25 = this.n5(var14, var12, var13, var4, var15);
                        var8 = var14[0];
                        var9 = var15[0];
                        if (!var25) {
                           var13.u3();
                           this.n5(var7, var9 == var5);
                           var12 = 0;
                           break;
                        }

                        var12 = 0;
                        continue;
                     }

                     var12 |= 1347226624;
                     continue;
                  }

                  var12 = var12 & 15 | 1210220544;
                  continue;
               }

               var12 &= 31;
               if (var12 <= 1) {
                  var12 |= 192;
                  if (var13 == null) {
                     if (var7 == null) {
                        var13 = this.z1.n5();
                     } else {
                        var13 = var7.u3();
                     }

                     var13.n5(var8, var11);
                  }

                  var14[0] = var8;
                  var15[0] = var9;
                  boolean var24 = this.n5(var14, var12, var13, var4, var15);
                  var8 = var14[0];
                  var9 = var15[0];
                  if (!var24) {
                     var13.u3();
                     this.n5(var7, var9 == var5);
                     var12 = 0;
                     break;
                  }

                  var12 = 0;
                  continue;
               }

               var12 |= 8388608;
               continue;
            }
         } else {
            int var27 = var1[var8] & 255;
            var8++;
            if ((var27 & -64) != 128) {
               var8--;
               if (var13 == null) {
                  if (var7 == null) {
                     var13 = this.z1.n5();
                  } else {
                     var13 = var7.u3();
                  }

                  var13.n5(var8, var11);
               }

               var14[0] = var8;
               var15[0] = var9;
               boolean var31 = this.n5(var14, var12, var13, var4, var15);
               var8 = var14[0];
               var9 = var15[0];
               if (!var31) {
                  var13.u3();
                  this.n5(var7, var9 == var5);
                  var12 = 0;
                  break;
               }

               var12 = 0;
               continue;
            }

            var12 = var12 << 6 | var27 & 63;
            if ((var12 & 536870912) == 0) {
               if ((var12 & 268435456) != 0) {
                  if ((var12 & 8388608) != 0 || n5(var12 & 496, 16, 256)) {
                     continue;
                  }

                  if (var13 == null) {
                     if (var7 == null) {
                        var13 = this.z1.n5();
                     } else {
                        var13 = var7.u3();
                     }

                     var13.n5(var8, var11);
                  }

                  var14[0] = var8;
                  var15[0] = var9;
                  boolean var30 = this.n5(var14, var12, var13, var4, var15);
                  var8 = var14[0];
                  var9 = var15[0];
                  if (!var30) {
                     var13.u3();
                     this.n5(var7, var9 == var5);
                     var12 = 0;
                     break;
                  }

                  var12 = 0;
                  continue;
               }

               if ((var12 & 992) != 0 && (var12 & 992) != 864) {
                  continue;
               }

               if (var13 == null) {
                  if (var7 == null) {
                     var13 = this.z1.n5();
                  } else {
                     var13 = var7.u3();
                  }

                  var13.n5(var8, var11);
               }

               var14[0] = var8;
               var15[0] = var9;
               boolean var17 = this.n5(var14, var12, var13, var4, var15);
               var8 = var14[0];
               var9 = var15[0];
               if (!var17) {
                  var13.u3();
                  this.n5(var7, var9 == var5);
                  var12 = 0;
                  break;
               }

               var12 = 0;
               continue;
            }

            if ((var12 & 270467072) > 268435456 && var9 < var11) {
               var4[var9] = (char)((var12 >> 10 & 2047) + -10304);
               var9++;
               var12 = (var12 & 1023) + 56320;
            }
         }

         if (var9 >= var11) {
            var12 &= 2097151;
            if (var12 > 127) {
               if (var12 > 2047) {
                  if (var12 >= 56320 && var12 <= 57343) {
                     var8--;
                     var9--;
                  } else if (var12 > 65535) {
                     var8--;
                  }

                  var8--;
               }

               var8--;
            }

            var8--;
            this.n5(var7, var9 == var5);
            var12 = 0;
            break;
         }

         var4[var9] = (char)var12;
         var9++;
         var12 = 0;
      }

      if (var12 != 0 && (var7 == null || var7.u9())) {
         if (var13 == null) {
            if (var7 == null) {
               var13 = this.z1.n5();
            } else {
               var13 = var7.u3();
            }

            var13.n5(var8, var11);
         }

         var14[0] = var8;
         var15[0] = var9;
         boolean var28 = this.n5(var14, var12, var13, var4, var15);
         var8 = var14[0];
         var9 = var15[0];
         if (!var28) {
            var13.u3();
            this.n5(var7, var9 == var5);
         }

         var12 = 0;
      }

      if (var7 != null) {
         u6$n5 var29 = (u6$n5)var7;
         var29.n5 = var12;
         var7.a6 = var8 - var2;
      }

      return var9 - var5;
   }

   private boolean n5(int[] var1, int var2, s7 var3, char[] var4, int[] var5) {
      int[] var6 = com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5((Object)(var1)).deepClone(), int[].class);
      byte[] var7 = this.n5(var6, var2);
      if (!var3.n5(var7, var1[0], var4, var5)) {
         var1[0] = var6[0];
         return false;
      } else {
         return true;
      }
   }

   private int n5(int var1, int var2, s7 var3) {
      byte[] var4 = this.n5(new int[]{var1}, var2);
      return var3.l6(var4, var1);
   }

   private byte[] n5(int[] var1, int var2) {
      byte[] var3 = null;
      if (var2 < 256 && var2 >= 0) {
         var1[0]--;
         var3 = new byte[]{(byte)var2};
      } else if ((var2 & 402653184) == 0) {
         var1[0]--;
         var3 = new byte[]{(byte)(var2 & 31 | 192)};
      } else if ((var2 & 268435456) != 0) {
         if ((var2 & 8388608) != 0) {
            var1[0] -= 3;
            var3 = new byte[]{(byte)(var2 >> 12 & 7 | 240), (byte)(var2 >> 6 & 63 | 128), (byte)(var2 & 63 | 128)};
         } else if ((var2 & 131072) != 0) {
            var1[0] -= 2;
            var3 = new byte[]{(byte)(var2 >> 6 & 7 | 240), (byte)(var2 & 63 | 128)};
         } else {
            var1[0]--;
            var3 = new byte[]{(byte)(var2 & 7 | 240)};
         }
      } else if ((var2 & 8388608) != 0) {
         var1[0] -= 2;
         var3 = new byte[]{(byte)(var2 >> 6 & 15 | 224), (byte)(var2 & 63 | 128)};
      } else {
         var1[0]--;
         var3 = new byte[]{(byte)(var2 & 15 | 224)};
      }

      return (byte[])var3;
   }

   @Override
   public u9 l6() {
      return new u6$n5(this);
   }

   @Override
   public t9 k5() {
      return new u6$l6(this);
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

      var2 *= 3L;
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
   public byte[] h0() {
      return this.u3 ? new byte[]{-17, -69, -65} : new byte[0];
   }

   @Override
   public byte[] c8() {
      return j8.n5(this) != com.aspose.slides.internal.v6g.k5.n5(u6.class) ? this.h0() : (this.u3 ? k5 : new byte[0]);
   }

   @Override
   public boolean equals(Object value) {
      u6 var2 = com.aspose.slides.internal.v6g.k5.n5(value, u6.class);
      return var2 == null ? false : this.u3 == var2.u3 && this.x8().equals(var2.x8()) && this.n3().equals(var2.n3());
   }

   @Override
   public int hashCode() {
      return this.x8().hashCode() + this.n3().hashCode() + 65001 + (this.u3 ? 1 : 0);
   }
}
