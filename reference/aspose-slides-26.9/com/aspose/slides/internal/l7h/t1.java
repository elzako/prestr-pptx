package com.aspose.slides.internal.l7h;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public class t1 extends j5 {
   public static final t1 n5 = new t1(true, true);
   public static final t1 l6 = new t1(false, true);
   private static final byte[] u9 = new byte[]{-2, -1};
   private static final byte[] h0 = new byte[]{-1, -2};
   public boolean k5 = false;
   public boolean u3 = false;
   public boolean a6 = true;

   public t1() {
      this(false, true);
   }

   public t1(boolean var1, boolean var2) {
      this(var1, var2, false);
   }

   public t1(boolean var1, boolean var2, boolean var3) {
      super(var1 ? 1201 : 1200);
      this.k5 = var3;
      this.u3 = var1;
      this.a6 = var2;
      if (this.k5) {
         this.n5();
      }
   }

   @Override
   public void n5() {
      if (this.k5) {
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
      int var5 = var3 << 1;
      if (var5 < 0) {
         throw new ArgumentOutOfRangeException("count", "Too many characters. The resulting number of bytes is larger than what can be returned as an int.");
      }

      int var6 = var2 + var3;
      int var7 = var2;
      char var8 = 0;
      boolean var9 = false;
      int var10 = var6 - 3;
      z3 var11 = null;
      int[] var12 = new int[1];
      if (var4 != null) {
         var8 = var4.k5;
         if (var8 > 0) {
            var5 += 2;
         }

         if (var4.k5()) {
            var11 = var4.l6();
            if (var11.k5() > 0) {
               throw new ArgumentException(
                  o0.n5(
                     "Must complete Convert() operation or call Encoder.Reset() before calling GetBytes() or GetByteCount(). Encoder '{0}' fallback '{1}'.",
                     this.t2(),
                     j8.n5(var4.n5())
                  )
               );
            }

            var11.n5(var2, var6, var4, false);
         }
      }

      while (true) {
         char var13;
         while ((var13 = var11 == null ? '\u0000' : var11.u9()) != 0 || var7 < var6) {
            if (var13 == 0) {
               var13 = var1[var7];
               var7++;
            } else {
               var5 += 2;
            }

            if (var13 >= '\ud800' && var13 <= '\udfff') {
               if (var13 <= '\udbff') {
                  if (var8 > 0) {
                     var7--;
                     var5 -= 2;
                     if (var11 == null) {
                        if (var4 == null) {
                           var11 = this.t9.n5();
                        } else {
                           var11 = var4.l6();
                        }

                        var11.n5(var2, var6, var4, false);
                     }

                     var12[0] = var7;
                     var11.n5(var8, var1, var12);
                     var7 = var12[0];
                     var8 = 0;
                  } else {
                     var8 = var13;
                  }
               } else if (var8 == 0) {
                  var5 -= 2;
                  if (var11 == null) {
                     if (var4 == null) {
                        var11 = this.t9.n5();
                     } else {
                        var11 = var4.l6();
                     }

                     var11.n5(var2, var6, var4, false);
                  }

                  var12[0] = var7;
                  var11.n5(var13, var1, var12);
                  var7 = var12[0];
               } else {
                  var8 = 0;
               }
            } else if (var8 > 0) {
               var7--;
               if (var11 == null) {
                  if (var4 == null) {
                     var11 = this.t9.n5();
                  } else {
                     var11 = var4.l6();
                  }

                  var11.n5(var2, var6, var4, false);
               }

               var12[0] = var7;
               var11.n5(var8, var1, var12);
               var7 = var12[0];
               var5 -= 2;
               var8 = 0;
            }
         }

         if (var8 <= 0) {
            break;
         }

         var5 -= 2;
         if (var4 != null && !var4.u9()) {
            break;
         }

         if (var9) {
            throw new ArgumentException(o0.n5("Recursive fallback not allowed for character \\\\u{0:X4}.", var8), "chars");
         }

         if (var11 == null) {
            if (var4 == null) {
               var11 = this.t9.n5();
            } else {
               var11 = var4.l6();
            }

            var11.n5(var2, var6, var4, false);
         }

         var12[0] = var7;
         var11.n5(var8, var1, var12);
         var7 = var12[0];
         var8 = 0;
         var9 = true;
      }

      return var5;
   }

   @Override
   public int n5(char[] var1, int var2, int var3, byte[] var4, int var5, int var6, k7 var7) {
      char var8 = 0;
      boolean var9 = false;
      int var10 = var5;
      int var11 = var2;
      int var12 = var10 + var6;
      int var13 = var11 + var3;
      int var14 = var10;
      int var15 = var11;
      z3 var16 = null;
      int[] var17 = new int[1];
      if (var7 != null) {
         var8 = var7.k5;
         if (var7.k5()) {
            var16 = var7.l6();
            if (var16.k5() > 0 && var7.u3) {
               throw new ArgumentException(
                  o0.n5(
                     "Must complete Convert() operation or call Encoder.Reset() before calling GetBytes() or GetByteCount(). Encoder '{0}' fallback '{1}'.",
                     this.t2(),
                     j8.n5(var7.n5())
                  )
               );
            }

            var16.n5(var15, var13, var7, false);
         }
      }

      while (true) {
         char var18;
         while ((var18 = var16 == null ? '\u0000' : var16.u9()) != 0 || var11 < var13) {
            if (var18 == 0) {
               var18 = var1[var11];
               var11++;
            }

            if (var18 >= '\ud800' && var18 <= '\udfff') {
               if (var18 <= '\udbff') {
                  if (var8 > 0) {
                     var11--;
                     if (var16 == null) {
                        if (var7 == null) {
                           var16 = this.t9.n5();
                        } else {
                           var16 = var7.l6();
                        }

                        var16.n5(var15, var13, var7, true);
                     }

                     var17[0] = var11;
                     var16.n5(var8, var1, var17);
                     var11 = var17[0];
                     var8 = 0;
                  } else {
                     var8 = var18;
                  }
                  continue;
               }

               if (var8 == 0) {
                  if (var16 == null) {
                     if (var7 == null) {
                        var16 = this.t9.n5();
                     } else {
                        var16 = var7.l6();
                     }

                     var16.n5(var15, var13, var7, true);
                  }

                  var17[0] = var11;
                  var16.n5(var18, var1, var17);
                  var11 = var17[0];
                  continue;
               }

               if (var10 + 3 >= var12) {
                  if (var16 != null && var16.u9) {
                     var16.l6();
                     var16.l6();
                  } else {
                     var11 -= 2;
                  }

                  this.n5(var7, var10 == var14);
                  var8 = 0;
                  break;
               }

               if (this.u3) {
                  var4[var10++] = (byte)(var8 >> '\b');
                  var4[var10++] = (byte)var8;
               } else {
                  var4[var10++] = (byte)var8;
                  var4[var10++] = (byte)(var8 >> '\b');
               }

               var8 = 0;
            } else if (var8 > 0) {
               var11--;
               if (var16 == null) {
                  if (var7 == null) {
                     var16 = this.t9.n5();
                  } else {
                     var16 = var7.l6();
                  }

                  var16.n5(var15, var13, var7, true);
               }

               var17[0] = var11;
               var16.n5(var8, var1, var17);
               var11 = var17[0];
               var8 = 0;
               continue;
            }

            if (var10 + 1 >= var12) {
               if (var16 != null && var16.u9) {
                  var16.l6();
               } else {
                  var11--;
               }

               this.n5(var7, var10 == var14);
               break;
            }

            if (this.u3) {
               var4[var10++] = (byte)(var18 >> '\b');
               var4[var10++] = (byte)var18;
            } else {
               var4[var10++] = (byte)var18;
               var4[var10++] = (byte)(var18 >> '\b');
            }
         }

         if (var8 <= 0 || var7 != null && !var7.u9()) {
            if (var7 != null) {
               var7.k5 = var8;
               var7.a6 = var11 - var15;
            }

            return var10 - var14;
         }

         if (var9) {
            throw new ArgumentException(o0.n5("Recursive fallback not allowed for character \\\\u{0:X4}.", var8), "chars");
         }

         if (var16 == null) {
            if (var7 == null) {
               var16 = this.t9.n5();
            } else {
               var16 = var7.l6();
            }

            var16.n5(var15, var13, var7, true);
         }

         var17[0] = var11;
         var16.n5(var8, var1, var17);
         var11 = var17[0];
         var8 = 0;
         var9 = true;
      }
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, x8 var4) {
      t1$n5 var5 = (t1$n5)var4;
      int var6 = var2;
      int var7 = var6 + var3;
      int var8 = var6;
      int var9 = -1;
      char var10 = 0;
      int var11 = var3 >> 1;
      int var12 = var7 - 7;
      s7 var13 = null;
      if (var5 != null) {
         var9 = var5.n5;
         var10 = var5.u9;
         if (var10 > 0) {
            var11++;
         }

         if (var9 >= 0 && (var3 & 1) == 1) {
            var11++;
         }
      }

      while (var6 < var7) {
         if (var9 < 0) {
            var9 = var1[var6++] & 255;
            if (var6 >= var7) {
               break;
            }
         }

         char var14;
         if (this.u3) {
            var14 = (char)(var9 << 8 | var1[var6++] & 0xFF);
         } else {
            var14 = (char)((var1[var6++] & 255) << 8 | var9);
         }

         var9 = -1;
         if (var14 >= '\ud800' && var14 <= '\udfff') {
            if (var14 <= '\udbff') {
               if (var10 > 0) {
                  var11--;
                  byte[] var24 = null;
                  if (this.u3) {
                     var24 = new byte[]{(byte)(var10 >> '\b'), (byte)var10};
                  } else {
                     var24 = new byte[]{(byte)var10, (byte)(var10 >> '\b')};
                  }

                  if (var13 == null) {
                     if (var5 == null) {
                        var13 = this.z1.n5();
                     } else {
                        var13 = var5.u3();
                     }

                     var13.n5(var8, 0);
                  }

                  var11 += var13.l6(var24, var6);
               }

               var10 = var14;
            } else if (var10 == 0) {
               var11--;
               byte[] var26 = null;
               if (this.u3) {
                  var26 = new byte[]{(byte)(var14 >> '\b'), (byte)var14};
               } else {
                  var26 = new byte[]{(byte)var14, (byte)(var14 >> '\b')};
               }

               if (var13 == null) {
                  if (var5 == null) {
                     var13 = this.z1.n5();
                  } else {
                     var13 = var5.u3();
                  }

                  var13.n5(var8, 0);
               }

               var11 += var13.l6(var26, var6);
            } else {
               var10 = 0;
            }
         } else if (var10 > 0) {
            var11--;
            byte[] var15 = null;
            if (this.u3) {
               var15 = new byte[]{(byte)(var10 >> '\b'), (byte)var10};
            } else {
               var15 = new byte[]{(byte)var10, (byte)(var10 >> '\b')};
            }

            if (var13 == null) {
               if (var5 == null) {
                  var13 = this.z1.n5();
               } else {
                  var13 = var5.u3();
               }

               var13.n5(var8, 0);
            }

            var11 += var13.l6(var15, var6);
            var10 = 0;
         }
      }

      if (var5 == null || var5.u9()) {
         if (var10 > 0) {
            var11--;
            byte[] var21 = null;
            if (this.u3) {
               var21 = new byte[]{(byte)(var10 >> '\b'), (byte)var10};
            } else {
               var21 = new byte[]{(byte)var10, (byte)(var10 >> '\b')};
            }

            if (var13 == null) {
               if (var5 == null) {
                  var13 = this.z1.n5();
               } else {
                  var13 = var5.u3();
               }

               var13.n5(var8, 0);
            }

            var11 += var13.l6(var21, var6);
            var10 = 0;
         }

         if (var9 >= 0) {
            if (var13 == null) {
               if (var5 == null) {
                  var13 = this.z1.n5();
               } else {
                  var13 = var5.u3();
               }

               var13.n5(var8, 0);
            }

            var11 += var13.l6(new byte[]{(byte)var9}, var6);
            byte var16 = -1;
         }
      }

      if (var10 > 0) {
         var11--;
      }

      return var11;
   }

   @Override
   public int n5(byte[] var1, int var2, int var3, char[] var4, int var5, int var6, x8 var7) {
      t1$n5 var8 = (t1$n5)var7;
      int var9 = -1;
      char var10 = 0;
      if (var8 != null) {
         var9 = var8.n5;
         var10 = var8.u9;
      }

      s7 var11 = null;
      int[] var12 = new int[1];
      int var13 = var2;
      int var14 = var5;
      int var15 = var13 + var3;
      int var16 = var14 + var6;
      int var17 = var13;
      int var18 = var14;

      while (var13 < var15) {
         if (var9 < 0) {
            var9 = var1[var13++] & 255;
         } else {
            char var19;
            if (this.u3) {
               var19 = (char)(var9 << 8 | var1[var13++] & 0xFF);
            } else {
               var19 = (char)((var1[var13++] & 255) << 8 | var9);
            }

            var9 = -1;
            if (var19 >= '\ud800' && var19 <= '\udfff') {
               if (var19 <= '\udbff') {
                  if (var10 > 0) {
                     byte[] var30 = null;
                     if (this.u3) {
                        var30 = new byte[]{(byte)(var10 >> '\b'), (byte)var10};
                     } else {
                        var30 = new byte[]{(byte)var10, (byte)(var10 >> '\b')};
                     }

                     if (var11 == null) {
                        if (var8 == null) {
                           var11 = this.z1.n5();
                        } else {
                           var11 = var8.u3();
                        }

                        var11.n5(var17, var16);
                     }

                     var12[0] = var14;
                     boolean var34 = var11.n5(var30, var13, var4, var12);
                     var14 = var12[0];
                     if (!var34) {
                        var13 -= 2;
                        var11.u3();
                        this.n5(var8, var14 == var18);
                        break;
                     }
                  }

                  var10 = var19;
                  continue;
               }

               if (var10 == 0) {
                  byte[] var28 = null;
                  if (this.u3) {
                     var28 = new byte[]{(byte)(var19 >> '\b'), (byte)var19};
                  } else {
                     var28 = new byte[]{(byte)var19, (byte)(var19 >> '\b')};
                  }

                  if (var11 == null) {
                     if (var8 == null) {
                        var11 = this.z1.n5();
                     } else {
                        var11 = var8.u3();
                     }

                     var11.n5(var17, var16);
                  }

                  var12[0] = var14;
                  boolean var33 = var11.n5(var28, var13, var4, var12);
                  var14 = var12[0];
                  if (var33) {
                     continue;
                  }

                  var13 -= 2;
                  var11.u3();
                  this.n5(var8, var14 == var18);
                  break;
               }

               if (var14 >= var16 - 1) {
                  var13 -= 2;
                  this.n5(var8, var14 == var18);
                  break;
               }

               var4[var14++] = var10;
               var10 = 0;
            } else if (var10 > 0) {
               byte[] var20 = null;
               if (this.u3) {
                  var20 = new byte[]{(byte)(var10 >> '\b'), (byte)var10};
               } else {
                  var20 = new byte[]{(byte)var10, (byte)(var10 >> '\b')};
               }

               if (var11 == null) {
                  if (var8 == null) {
                     var11 = this.z1.n5();
                  } else {
                     var11 = var8.u3();
                  }

                  var11.n5(var17, var16);
               }

               var12[0] = var14;
               boolean var21 = var11.n5(var20, var13, var4, var12);
               var14 = var12[0];
               if (!var21) {
                  var13 -= 2;
                  var11.u3();
                  this.n5(var8, var14 == var18);
                  break;
               }

               var10 = 0;
            }

            if (var14 >= var16) {
               var13 -= 2;
               this.n5(var8, var14 == var18);
               break;
            }

            var4[var14++] = var19;
         }
      }

      label163:
      if (var8 == null || var8.u9()) {
         if (var10 > 0) {
            byte[] var24 = null;
            if (this.u3) {
               var24 = new byte[]{(byte)(var10 >> '\b'), (byte)var10};
            } else {
               var24 = new byte[]{(byte)var10, (byte)(var10 >> '\b')};
            }

            if (var11 == null) {
               if (var8 == null) {
                  var11 = this.z1.n5();
               } else {
                  var11 = var8.u3();
               }

               var11.n5(var17, var16);
            }

            var12[0] = var14;
            boolean var32 = var11.n5(var24, var13, var4, var12);
            var14 = var12[0];
            if (!var32) {
               var13 -= 2;
               if (var9 >= 0) {
                  var13--;
               }

               var11.u3();
               this.n5(var8, var14 == var18);
               var13 += 2;
               if (var9 >= 0) {
                  var13++;
               }
               break label163;
            }

            var10 = 0;
         }

         if (var9 >= 0) {
            if (var11 == null) {
               if (var8 == null) {
                  var11 = this.z1.n5();
               } else {
                  var11 = var8.u3();
               }

               var11.n5(var17, var16);
            }

            var12[0] = var14;
            boolean var26 = var11.n5(new byte[]{(byte)var9}, var13, var4, var12);
            var14 = var12[0];
            if (!var26) {
               var13--;
               var11.u3();
               this.n5(var8, var14 == var18);
               var13++;
            } else {
               var9 = -1;
            }
         }
      }

      if (var8 != null) {
         var8.a6 = var13 - var17;
         var8.u9 = var10;
         var8.n5 = var9;
      }

      return var14 - var18;
   }

   @Override
   public t9 k5() {
      return new k7(this);
   }

   @Override
   public u9 l6() {
      return new t1$n5(this);
   }

   @Override
   public byte[] h0() {
      if (this.a6) {
         return this.u3 ? new byte[]{-2, -1} : new byte[]{-1, -2};
      } else {
         return new byte[0];
      }
   }

   @Override
   public byte[] c8() {
      return j8.n5(this) != com.aspose.slides.internal.v6g.k5.n5(t1.class) ? this.h0() : (this.a6 ? (this.u3 ? u9 : h0) : new byte[0]);
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

      var2 <<= 1;
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

      long var2 = (long)(var1 >> 1) + (var1 & 1) + 1L;
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
   public boolean equals(Object value) {
      t1 var2 = com.aspose.slides.internal.v6g.k5.n5(value, t1.class);
      return var2 == null
         ? false
         : this.t9() == var2.t9() && this.a6 == var2.a6 && this.u3 == var2.u3 && this.x8().equals(var2.x8()) && this.n3().equals(var2.n3());
   }

   @Override
   public int hashCode() {
      return this.t9() + this.x8().hashCode() + this.n3().hashCode() + (this.a6 ? 4 : 0) + (this.u3 ? 8 : 0);
   }
}
