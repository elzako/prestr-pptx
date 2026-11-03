package com.aspose.slides.internal.k0r;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;

public class w8d {
   protected int n5 = 0;
   protected int l6 = 0;
   protected int k5 = 65535;
   protected int u3 = 65535;
   protected int a6 = 65535;
   protected int u9 = 65535;
   protected short h0 = 0;
   protected m1 c8;
   protected short t2 = 0;
   protected byte s7 = 0;
   protected int[] x8 = new int[]{1, 2, 4, 16, 32, 128, 512};

   public final void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = (int)var1.c4();
      if (this.n5(15728639)) {
         if (this.n5(65535)) {
            this.l6 = var1.r4() & 65535;
         }

         if (this.n5(65536)) {
            this.k5 = var1.r4();
         }

         if (this.n5(2097152)) {
            this.u3 = var1.r4();
         }

         if (this.n5(4194304)) {
            this.a6 = var1.r4();
         }

         if (this.n5(8388608)) {
            this.u9 = var1.r4();
         }

         if (this.n5(131072)) {
            this.h0 = var1.k7();
         }

         if (this.n5(262144)) {
            this.c8 = new m1(var1.c4());
         }

         if (this.n5(524288)) {
            this.t2 = var1.k7();
         }
      }

      if (this.n5(1048576)) {
         this.s7 = (byte)(var1.c4() & 4294967295L & 15L & 4294967295L);
      }
   }

   public final void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5 & 4294967295L);
      if (this.n5(15728639)) {
         if (this.n5(65535)) {
            var1.n5(this.l6 & 65535);
         }

         if (this.n5(65536)) {
            var1.n5(this.k5);
         }

         if (this.n5(2097152)) {
            var1.n5(this.u3);
         }

         if (this.n5(4194304)) {
            var1.n5(this.a6);
         }

         if (this.n5(8388608)) {
            var1.n5(this.u9);
         }

         if (this.n5(131072)) {
            var1.n5(this.h0);
         }

         if (this.n5(262144)) {
            var1.n5(this.c8.k5());
         }

         if (this.n5(524288)) {
            var1.n5(this.t2);
         }
      }

      if (this.n5(1048576)) {
         var1.n5((long)(this.s7 & 0xFF));
      }
   }

   public final int q0() {
      byte var1 = 4;
      if (this.n5(15728639)) {
         if (this.n5(65535)) {
            var1 += 2;
         }

         if (this.n5(65536)) {
            var1 += 2;
         }

         if (this.n5(2097152)) {
            var1 += 2;
         }

         if (this.n5(4194304)) {
            var1 += 2;
         }

         if (this.n5(8388608)) {
            var1 += 2;
         }

         if (this.n5(131072)) {
            var1 += 2;
         }

         if (this.n5(262144)) {
            var1 += 4;
         }

         if (this.n5(524288)) {
            var1 += 2;
         }
      }

      if (this.n5(1048576)) {
         var1 += 4;
      }

      return var1;
   }

   public final void l6(w8d var1) {
      if (var1 != null) {
         int var2 = var1.n5 ^ var1.n5 & this.n5;
         if ((var2 & 15695543) != 0) {
            if ((var2 & 65535) != 0) {
               for (int var6 : this.x8) {
                  if (this.l6(var6) == -1) {
                     this.n5(var6, var1.l6(var6));
                  }
               }
            }

            if ((var2 & 65536) != 0) {
               this.k5 = var1.k5;
            }

            if ((var2 & 2097152) != 0) {
               this.u3 = var1.u3;
            }

            if ((var2 & 4194304) != 0) {
               this.a6 = var1.a6;
            }

            if ((var2 & 8388608) != 0) {
               this.u9 = var1.u9;
            }

            if ((var2 & 131072) != 0) {
               this.h0 = var1.h0;
            }

            if ((var2 & 262144) != 0) {
               this.c8 = var1.c8.u3();
            }

            if ((var2 & 524288) != 0) {
               this.t2 = var1.t2;
            }
         }

         if ((var2 & 1048576) != 0) {
            this.s7 = var1.s7;
         }

         this.n5 = this.n5 | var1.n5;
      }
   }

   public void n5(w8d var1) {
      if (var1 != null) {
         int var2 = var1.n5 & this.n5;
         if ((var2 & 15695543) != 0) {
            if ((var2 & 32439) != 0) {
               if (this.l6 == var1.l6) {
                  this.n5(32439, false);
               } else {
                  for (int var3 = 0; var3 < this.x8.length; var3++) {
                     byte var4 = this.l6(this.x8[var3]);
                     byte var5 = var1.l6(this.x8[var3]);
                     if (var4 != -1 && var4 == var5) {
                        this.n5(this.x8[var3], (byte)-1);
                     }
                  }
               }
            }

            if ((var2 & 65536) != 0 && this.k5 == var1.k5) {
               this.n5(65536, false);
            }

            if ((var2 & 2097152) != 0 && this.u3 == var1.u3) {
               this.n5(2097152, false);
            }

            if ((var2 & 4194304) != 0 && this.a6 == var1.a6) {
               this.n5(4194304, false);
            }

            if ((var2 & 8388608) != 0 && this.u9 == var1.u9) {
               this.n5(8388608, false);
            }

            if ((var2 & 131072) != 0 && this.h0 == var1.h0) {
               this.n5(131072, false);
            }

            if ((var2 & 262144) != 0 && this.c8.k5() == var1.c8.k5()) {
               this.n5(262144, false);
            }

            if ((var2 & 524288) != 0 && this.t2 == var1.t2) {
               this.n5(524288, false);
            }
         }
      }
   }

   public final void n5(u7f var1) {
      if (var1 == null) {
         throw new ArgumentNullException("textCfException");
      }

      this.a6 = var1.a6;
      this.x8 = var1.x8;
      this.c8 = var1.c8;
      this.k5 = var1.k5;
      this.h0 = var1.h0;
      this.l6 = var1.l6;
      this.n5 = var1.n5;
      this.u3 = var1.u3;
      this.t2 = var1.t2;
      this.u9 = var1.u9;
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.l6(com.aspose.slides.ms.System.d1.n5("  CFMask: 0x{0:X}, {1}", this.n5 & 4294967295L, com.aspose.slides.ms.System.s3.n5(e2.class, this.n5)));
      if (this.n5(15695543)) {
         if (this.n5(32439)) {
            var1.l6(
               com.aspose.slides.ms.System.d1.n5(
                  "  FontStyleMask   : 0x{0:X}, {1}", this.l6 & 4294967295L, com.aspose.slides.ms.System.s3.n5(t9.class, this.l6)
               )
            );
            if (this.n5(1)) {
               var1.l6(com.aspose.slides.ms.System.d1.n5("  Bold     : {0}", new Object[]{this.l6(1) == 1}));
            }

            if (this.n5(2)) {
               var1.l6(com.aspose.slides.ms.System.d1.n5("  Italic   : {0}", new Object[]{this.l6(2) == 1}));
            }

            if (this.n5(4)) {
               var1.l6(com.aspose.slides.ms.System.d1.n5("  Underline: {0}", new Object[]{this.l6(4) == 1}));
            }

            if (this.n5(16)) {
               var1.l6(com.aspose.slides.ms.System.d1.n5("  Shadow   : {0}", new Object[]{this.l6(16) == 1}));
            }

            if (this.n5(32)) {
               var1.l6(com.aspose.slides.ms.System.d1.n5("  Fehint   : {0}", new Object[]{this.l6(32) == 1}));
            }

            if (this.n5(128)) {
               var1.l6(com.aspose.slides.ms.System.d1.n5("  Kumi     : {0}", new Object[]{this.l6(128) == 1}));
            }

            if (this.n5(512)) {
               var1.l6(com.aspose.slides.ms.System.d1.n5("  Emboss   : {0}", new Object[]{this.l6(512) == 1}));
            }

            if (this.n5(15360)) {
               var1.l6(com.aspose.slides.ms.System.d1.n5("  PP9RT    : 0x{0:X}", new Object[]{(this.l6 & 15360 & 4294967295L) >> 10}));
            }
         }

         if (this.n5(65536)) {
            var1.l6(com.aspose.slides.ms.System.d1.n5("  FontRef: {0}", new Object[]{this.k5}));
         }

         if (this.n5(2097152)) {
            var1.l6(com.aspose.slides.ms.System.d1.n5("  OldEaFontRef: {0}", new Object[]{this.u3}));
         }

         if (this.n5(4194304)) {
            var1.l6(com.aspose.slides.ms.System.d1.n5("  AnsiFontRef: {0}", new Object[]{this.a6}));
         }

         if (this.n5(8388608)) {
            var1.l6(com.aspose.slides.ms.System.d1.n5("  SymbolFontRef: {0}", new Object[]{this.u9}));
         }

         if (this.n5(131072)) {
            var1.l6(com.aspose.slides.ms.System.d1.n5("  FontSize: {0}", new Object[]{this.h0}));
         }

         if (this.n5(262144)) {
            var1.l6(com.aspose.slides.ms.System.d1.n5("  Color: {0}", new Object[]{this.c8}));
         }

         if (this.n5(524288)) {
            var1.n5(com.aspose.slides.ms.System.d1.n5("  Position: {0}", new Object[]{this.t2}));
         }
      }

      if (this.n5(1048576)) {
         var1.n5(com.aspose.slides.ms.System.d1.n5("  PP10RunID: {0}", new Object[]{this.s7}));
      }

      return var1.toString();
   }

   public final boolean z3() {
      return this.n5 == 0;
   }

   final boolean k5(w8d var1) {
      if (this.n5 != var1.n5) {
         return false;
      } else if (this.n5 == 0) {
         return true;
      } else if (this.n5(65535) && this.l6 != var1.l6) {
         return false;
      } else if (this.n5(65536) && (this.k5 & 65535) != (var1.k5 & 65535)) {
         return false;
      } else if (this.n5(2097152) && (this.u3 & 65535) != (var1.u3 & 65535)) {
         return false;
      } else if (this.n5(4194304) && (this.a6 & 65535) != (var1.a6 & 65535)) {
         return false;
      } else if (this.n5(8388608) && (this.u9 & 65535) != (var1.u9 & 65535)) {
         return false;
      } else if (this.n5(131072) && this.h0 != var1.h0) {
         return false;
      } else if (this.n5(262144) && (this.c8.k5() & 4294967295L) != (var1.c8.k5() & 4294967295L)) {
         return false;
      } else {
         return this.n5(524288) && this.t2 != var1.t2 ? false : !this.n5(1048576) || (this.s7 & 255) == (var1.s7 & 255);
      }
   }

   protected final boolean n5(int var1) {
      return (this.n5 & var1) != 0;
   }

   protected final void n5(int var1, boolean var2) {
      this.n5 |= var1;
      if (!var2) {
         this.n5 ^= var1;
      }
   }

   protected final byte l6(int var1) {
      if (!this.n5(this.k5(var1))) {
         return -1;
      } else {
         return (byte)((this.l6 & var1) != 0 ? 1 : 0);
      }
   }

   protected final void n5(int var1, byte var2) {
      int var3 = this.k5(var1);
      if (var2 == -1) {
         this.n5 = (this.n5 | var3) ^ var3;
      } else {
         this.n5 |= var3;
         this.l6 |= var1;
         if (var2 == 0) {
            this.l6 ^= var1;
         }
      }
   }

   private int k5(int var1) {
      int var2 = var1 & 32439;
      if (var2 == 0) {
         throw new InvalidOperationException();
      } else {
         return var2;
      }
   }
}
