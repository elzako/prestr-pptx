package com.aspose.slides.internal.k0r;

import com.aspose.slides.PptReadException;
import com.aspose.slides.exceptions.InvalidOperationException;

public class s2b {
   private int m1 = 0;
   private int k7 = 0;
   protected short n5 = 0;
   protected int l6 = 65535;
   protected short k5 = 0;
   protected m1 u3 = null;
   protected int a6 = 0;
   protected short u9 = 0;
   protected short h0 = 0;
   protected short c8 = 0;
   protected short t2 = 0;
   protected short s7 = 0;
   protected short x8 = 0;
   protected k3h n3 = null;
   protected int y4 = 0;
   protected int e2 = 0;
   protected int t9 = 0;
   protected short z1 = -1;
   protected boolean t4 = false;
   protected g1p q0 = new g1p();
   protected int[] z3 = new int[]{1, 2, 4, 8};

   public final void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.m1 = (int)var1.c4();
      if (this.n5(4193791)) {
         if (this.n5(15)) {
            this.k7 = var1.r4() & 65535;
         }

         if (this.n5(128)) {
            this.n5 = var1.k7();
         }

         if (this.n5(16)) {
            this.l6 = var1.r4();
         }

         if (this.n5(64)) {
            this.k5 = var1.k7();
         }

         if (this.n5(32)) {
            this.u3 = new m1(var1.c4());
         }

         if (this.n5(2048)) {
            int var2 = var1.r4() & 65535;
            if (!com.aspose.slides.ms.System.d5.isDefined(com.aspose.slides.internal.v6g.k5.n5(u4k.class), var2)) {
               throw new PptReadException(
                  "[ms-ppt] 2.9.20 TextPFException contains wrong value in textAlignment field which is not present in 2.13.27 TextAlignmentEnum enumeration."
               );
            }

            this.a6 = var2;
         }

         if (this.n5(4096)) {
            this.u9 = var1.k7();
         }

         if (this.n5(8192)) {
            this.h0 = var1.k7();
         }

         if (this.n5(16384)) {
            this.c8 = var1.k7();
         }

         if (this.n5(256)) {
            this.t2 = var1.k7();
         }

         if (this.n5(1024)) {
            this.s7 = var1.k7();
         }

         if (this.n5(32768)) {
            this.x8 = var1.k7();
         }

         if (this.n5(1048576)) {
            this.n3 = new k3h(var1);
         }

         if (this.n5(65536)) {
            int var3 = var1.r4() & 65535;
            if (!com.aspose.slides.ms.System.d5.isDefined(com.aspose.slides.internal.v6g.k5.n5(x0.class), var3)) {
               throw new PptReadException(
                  "[ms-ppt] 2.9.20 TextPFException contains wrong value in fontAlign field which is not present in 2.13.31 TextFontAlignmentEnum enumeration."
               );
            }

            this.y4 = var3;
         }

         if (this.n5(917504)) {
            this.e2 = var1.r4() & 65535;
         }

         if (this.n5(2097152)) {
            int var4 = var1.r4() & 65535;
            if (!com.aspose.slides.ms.System.d5.isDefined(com.aspose.slides.internal.v6g.k5.n5(g4u.class), var4)) {
               throw new PptReadException(
                  "[ms-ppt] 2.9.20 TextPFException contains wrong value in textDirection field which is not present in 2.13.30 TextDirectionEnum enumeration."
               );
            }

            this.t9 = var4;
         }
      }

      if (this.n5(58720256)) {
         if (this.n5(8388608)) {
            this.z1 = var1.k7();
         }

         if (this.n5(33554432)) {
            this.t4 = var1.k7() != 0;
         }

         if (this.n5(16777216)) {
            this.q0.n5(var1);
         }
      }
   }

   public final void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.m1 & 4294967295L);
      if (this.n5(4193791)) {
         if (this.n5(15)) {
            var1.n5(this.k7 & 65535);
         }

         if (this.n5(128)) {
            var1.n5(this.n5);
         }

         if (this.n5(16)) {
            var1.n5(this.l6);
         }

         if (this.n5(64)) {
            var1.n5(this.k5);
         }

         if (this.n5(32)) {
            var1.n5(this.u3.k5());
         }

         if (this.n5(2048)) {
            var1.n5(this.a6 & 65535);
         }

         if (this.n5(4096)) {
            var1.n5(this.u9);
         }

         if (this.n5(8192)) {
            var1.n5(this.h0);
         }

         if (this.n5(16384)) {
            var1.n5(this.c8);
         }

         if (this.n5(256)) {
            var1.n5(this.t2);
         }

         if (this.n5(1024)) {
            var1.n5(this.s7);
         }

         if (this.n5(32768)) {
            var1.n5(this.x8);
         }

         if (this.n5(1048576)) {
            this.n3.n5(var1);
         }

         if (this.n5(65536)) {
            var1.n5(this.y4 & 65535);
         }

         if (this.n5(917504)) {
            var1.n5(this.e2 & 65535);
         }

         if (this.n5(2097152)) {
            var1.n5(this.t9 & 65535);
         }
      }

      if (this.n5(58720256)) {
         if (this.n5(8388608)) {
            var1.n5(this.z1);
         }

         if (this.n5(33554432)) {
            var1.n5((this.t4 ? 1 : 0) & 65535);
         }

         if (this.n5(16777216)) {
            this.q0.n5(var1);
         }
      }
   }

   public final int z8() {
      int var1 = 4;
      if (this.n5(4193791)) {
         if (this.n5(15)) {
            var1 += 2;
         }

         if (this.n5(128)) {
            var1 += 2;
         }

         if (this.n5(16)) {
            var1 += 2;
         }

         if (this.n5(64)) {
            var1 += 2;
         }

         if (this.n5(32)) {
            var1 += 4;
         }

         if (this.n5(2048)) {
            var1 += 2;
         }

         if (this.n5(4096)) {
            var1 += 2;
         }

         if (this.n5(8192)) {
            var1 += 2;
         }

         if (this.n5(16384)) {
            var1 += 2;
         }

         if (this.n5(256)) {
            var1 += 2;
         }

         if (this.n5(1024)) {
            var1 += 2;
         }

         if (this.n5(32768)) {
            var1 += 2;
         }

         if (this.n5(1048576)) {
            var1 += this.n3.n5();
         }

         if (this.n5(65536)) {
            var1 += 2;
         }

         if (this.n5(917504)) {
            var1 += 2;
         }

         if (this.n5(2097152)) {
            var1 += 2;
         }
      }

      if (this.n5(58720256)) {
         if (this.n5(8388608)) {
            var1 += 2;
         }

         if (this.n5(33554432)) {
            var1 += 2;
         }

         if (this.n5(16777216)) {
            var1 += this.q0.k5();
         }
      }

      return var1;
   }

   public void l6(s2b var1) {
      if (var1 != null) {
         int var2 = var1.m1 ^ var1.m1 & this.m1;
         if ((var2 & 4193791) != 0) {
            if ((var2 & 15) != 0) {
               for (int var6 : this.z3) {
                  if (this.l6(var6) == -1) {
                     this.n5(var6, var1.l6(var6));
                  }
               }
            }

            if ((var2 & 128) != 0) {
               this.n5 = var1.n5;
            }

            if (this.l6(2) != 0 && (var2 & 16) != 0) {
               this.l6 = var1.l6;
            }

            if ((var2 & 64) != 0) {
               this.k5 = var1.k5;
            }

            if ((var2 & 32) != 0) {
               this.u3 = var1.u3;
            }

            if ((var2 & 2048) != 0) {
               this.a6 = var1.a6;
            }

            if ((var2 & 4096) != 0) {
               this.u9 = var1.u9;
            }

            if ((var2 & 8192) != 0) {
               this.h0 = var1.h0;
            }

            if ((var2 & 16384) != 0) {
               this.c8 = var1.c8;
            }

            if ((var2 & 256) != 0) {
               this.t2 = var1.t2;
            }

            if ((var2 & 1024) != 0) {
               this.s7 = var1.s7;
            }

            if ((var2 & 32768) != 0) {
               this.x8 = var1.x8;
            }

            if ((var2 & 1048576) != 0) {
               this.n3 = var1.n3;
            }

            if ((var2 & 65536) != 0) {
               this.y4 = var1.y4;
            }

            if ((var2 & 917504) != 0) {
               this.e2 = var1.e2;
            }

            if ((var2 & 2097152) != 0) {
               this.t9 = var1.t9;
            }
         }

         if ((var2 & 58720256) != 0) {
            if ((var2 & 8388608) != 0) {
               this.z1 = var1.z1;
            }

            if ((var2 & 33554432) != 0) {
               this.t4 = var1.t4;
            }

            if ((var2 & 16777216) != 0) {
               this.q0 = var1.q0;
            }
         }

         this.m1 = this.m1 | var1.m1;
      }
   }

   public void n5(s2b var1) {
      if (var1 != null) {
         int var2 = var1.m1 & this.m1;
         if ((var2 & 4193791) != 0) {
            if ((var2 & 15) != 0) {
               if (this.k7 == var1.k7) {
                  this.n5(15, false);
               } else {
                  for (int var3 = 0; var3 < this.z3.length; var3++) {
                     byte var4 = this.l6(this.z3[var3]);
                     byte var5 = var1.l6(this.z3[var3]);
                     if (var4 != -1 && var4 == var5) {
                        this.n5(this.z3[var3], (byte)-1);
                     }
                  }
               }
            }

            if ((var2 & 128) != 0 && this.n5 == var1.n5) {
               this.n5(128, false);
            }

            if ((var2 & 16) != 0 && this.l6 == var1.l6) {
               this.n5(16, false);
            }

            if ((var2 & 64) != 0 && this.k5 == var1.k5) {
               this.n5(64, false);
            }

            if ((var2 & 32) != 0 && this.u3 == var1.u3) {
               this.n5(32, false);
            }

            if ((var2 & 2048) != 0 && this.a6 == var1.a6) {
               this.n5(2048, false);
            }

            if ((var2 & 4096) != 0 && this.u9 == var1.u9) {
               this.n5(4096, false);
            }

            if ((var2 & 8192) != 0 && this.h0 == var1.h0) {
               this.n5(8192, false);
            }

            if ((var2 & 16384) != 0 && this.c8 == var1.c8) {
               this.n5(16384, false);
            }

            if ((var2 & 256) != 0 && this.t2 == var1.t2) {
               this.n5(256, false);
            }

            if ((var2 & 1024) != 0 && this.s7 == var1.s7) {
               this.n5(1024, false);
            }

            if ((var2 & 32768) != 0 && this.x8 == var1.x8) {
               this.n5(32768, false);
            }

            if ((var2 & 1048576) != 0 && this.n3 == var1.n3) {
               this.n5(1048576, false);
            }

            if ((var2 & 65536) != 0 && this.y4 == var1.y4) {
               this.n5(65536, false);
            }

            if ((var2 & 917504) != 0 && this.e2 == var1.e2) {
               this.n5(917504, false);
            }

            if ((var2 & 2097152) != 0 && this.t9 == var1.t9) {
               this.n5(2097152, false);
            }
         }
      }
   }

   @Override
   public String toString() {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.l6(com.aspose.slides.ms.System.d1.n5("  PFMask: 0x{0:X}, {1}",new Object[]{ this.m1 & 4294967295L, com.aspose.slides.ms.System.s3.n5(m5.class, this.m1)}));
      if (this.n5(4193791)) {
         if (this.n5(15)) {
            var1.l6(com.aspose.slides.ms.System.d1.n5("  Bulletflags   : 0x{0:X}, {1}",new Object[]{ this.k7 & 65535, com.aspose.slides.ms.System.s3.n5(z2.class, this.k7)}));
            if (this.n5(1)) {
               var1.l6(com.aspose.slides.ms.System.d1.n5("  HasBullet     : {0}", new Object[]{this.l6(1) == 1}));
            }

            if (this.n5(2)) {
               var1.l6(com.aspose.slides.ms.System.d1.n5("  BulletHasFont : {0}", new Object[]{this.l6(2) == 1}));
            }

            if (this.n5(4)) {
               var1.l6(com.aspose.slides.ms.System.d1.n5("  BulletHasColor: {0}", new Object[]{this.l6(4) == 1}));
            }

            if (this.n5(8)) {
               var1.l6(com.aspose.slides.ms.System.d1.n5("  BulletHasSize : {0}", new Object[]{this.l6(8) == 1}));
            }
         }

         if (this.n5(128)) {
            var1.l6(com.aspose.slides.ms.System.d1.n5("  BulletChar: {0}", new Object[]{this.n5}));
         }

         if (this.n5(16)) {
            var1.l6(com.aspose.slides.ms.System.d1.n5("  BulletFontRef: {0}", new Object[]{this.l6}));
         }

         if (this.n5(64)) {
            var1.l6(com.aspose.slides.ms.System.d1.n5("  BulletSize: {0}", new Object[]{this.k5}));
         }

         if (this.n5(32)) {
            var1.l6(com.aspose.slides.ms.System.d1.n5("  BulletColor: {0}", new Object[]{this.u3}));
         }

         if (this.n5(2048)) {
            var1.l6(com.aspose.slides.ms.System.d1.n5("  TextAlignment: {0}", new Object[]{com.aspose.slides.ms.System.s3.n5(u4k.class, this.a6)}));
         }

         if (this.n5(4096)) {
            var1.l6(com.aspose.slides.ms.System.d1.n5("  LineSpacing: {0}", new Object[]{this.u9}));
         }

         if (this.n5(8192)) {
            var1.l6(com.aspose.slides.ms.System.d1.n5("  SpaceBefore: {0}", new Object[]{this.h0}));
         }

         if (this.n5(16384)) {
            var1.l6(com.aspose.slides.ms.System.d1.n5("  SpaceAfter: {0}", new Object[]{this.c8}));
         }

         if (this.n5(256)) {
            var1.l6(com.aspose.slides.ms.System.d1.n5("  LeftMargin: {0}", new Object[]{this.t2}));
         }

         if (this.n5(1024)) {
            var1.l6(com.aspose.slides.ms.System.d1.n5("  Indent: {0}", new Object[]{this.s7}));
         }

         if (this.n5(32768)) {
            var1.l6(com.aspose.slides.ms.System.d1.n5("  DefaultTabSize: {0}", new Object[]{this.x8}));
         }

         if (this.n5(1048576)) {
            var1.l6(com.aspose.slides.ms.System.d1.n5("  TabStops: {0}", new Object[]{this.n3}));
         }

         if (this.n5(65536)) {
            var1.l6(com.aspose.slides.ms.System.d1.n5("  FontAlign: {0}", new Object[]{com.aspose.slides.ms.System.s3.n5(x0.class, this.y4)}));
         }

         if (this.n5(917504)) {
            var1.l6(com.aspose.slides.ms.System.d1.n5("  Wrapflags   : 0x{0:X}, {1}",new Object[]{ this.e2 & 65535, com.aspose.slides.ms.System.s3.n5(v5.class, this.e2)}));
            if (this.n5(131072)) {
               var1.l6(com.aspose.slides.ms.System.d1.n5("  CharWrap: {0}", new Object[]{this.k5(1) == 1}));
            }

            if (this.n5(262144)) {
               var1.l6(com.aspose.slides.ms.System.d1.n5("  WordWrap: {0}", new Object[]{this.k5(2) == 1}));
            }

            if (this.n5(524288)) {
               var1.l6(com.aspose.slides.ms.System.d1.n5("  Overfow: {0}", new Object[]{this.k5(4) == 1}));
            }
         }

         if (this.n5(2097152)) {
            var1.n5(com.aspose.slides.ms.System.d1.n5("  TextDirection: {0}", new Object[]{com.aspose.slides.ms.System.s3.n5(g4u.class, this.t9)}));
         }
      }

      if (this.n5(58720256)) {
         if (this.n5(8388608)) {
            var1.l6(com.aspose.slides.ms.System.d1.n5("  BulletBlip: {0}", new Object[]{this.z1}));
         }

         if (this.n5(33554432)) {
            var1.l6(com.aspose.slides.ms.System.d1.n5("  BulletHasScheme: {0}", new Object[]{this.t4}));
         }

         if (this.n5(16777216)) {
            var1.l6(com.aspose.slides.ms.System.d1.n5("  BulletScheme: {0}", new Object[]{this.q0.toString()}));
         }
      }

      return var1.toString();
   }

   final void n5(long var1) {
   }

   public final boolean j5() {
      return this.m1 == 0;
   }

   final boolean k5(s2b var1) {
      if (this.m1 != var1.m1) {
         return false;
      } else if (this.m1 == 0) {
         return true;
      } else if (this.n5(15) && this.k7 != var1.k7) {
         return false;
      } else if (this.n5(128) && this.n5 != var1.n5) {
         return false;
      } else if (this.n5(16) && (this.l6 & 65535) != (var1.l6 & 65535)) {
         return false;
      } else if (this.n5(64) && this.k5 != var1.k5) {
         return false;
      } else if (this.n5(32) && (this.u3.k5() & 4294967295L) != (var1.u3.k5() & 4294967295L)) {
         return false;
      } else if (this.n5(2048) && this.a6 != var1.a6) {
         return false;
      } else if (this.n5(4096) && this.u9 != var1.u9) {
         return false;
      } else if (this.n5(8192) && this.h0 != var1.h0) {
         return false;
      } else if (this.n5(16384) && this.c8 != var1.c8) {
         return false;
      } else if (this.n5(256) && this.t2 != var1.t2) {
         return false;
      } else if (this.n5(1024) && this.s7 != var1.s7) {
         return false;
      } else if (this.n5(32768) && this.x8 != var1.x8) {
         return false;
      } else if (this.n5(1048576) && !this.n3.n5(var1.n3)) {
         return false;
      } else if (this.n5(65536) && this.y4 != var1.y4) {
         return false;
      } else if (this.n5(917504) && this.e2 != var1.e2) {
         return false;
      } else if (this.n5(2097152) && this.t9 != var1.t9) {
         return false;
      } else if (this.n5(8388608) && this.z1 != var1.z1) {
         return false;
      } else {
         return this.n5(33554432) && this.t4 != var1.t4 ? false : !this.n5(16777216) || this.q0.n5(var1.q0);
      }
   }

   public final boolean w1() {
      return this.n5(1082624);
   }

   public final void n5(boolean var1) {
      if (!var1) {
         this.n5(1082624, false);
      }
   }

   protected final boolean n5(int var1) {
      return (this.m1 & var1) != 0;
   }

   protected final void n5(int var1, boolean var2) {
      this.m1 |= var1;
      if (!var2) {
         this.m1 ^= var1;
      }
   }

   protected final byte l6(int var1) {
      if (!this.n5(this.u3(var1))) {
         return -1;
      } else {
         return (byte)((this.k7 & var1) != 0 ? 1 : 0);
      }
   }

   protected final void n5(int var1, byte var2) {
      int var3 = this.u3(var1);
      if (var2 == -1) {
         this.m1 = (this.m1 | var3) ^ var3;
      } else {
         this.m1 |= var3;
         this.k7 |= var1;
         if (var2 == 0) {
            this.k7 ^= var1;
         }
      }
   }

   private int u3(int var1) {
      int var2 = var1 & 15;
      if (var2 == 0) {
         throw new InvalidOperationException();
      } else {
         return var2;
      }
   }

   protected final byte k5(int var1) {
      if (!this.n5(this.a6(var1))) {
         return -1;
      } else {
         return (byte)((this.e2 & var1) != 0 ? 1 : 0);
      }
   }

   protected final void l6(int var1, byte var2) {
      int var3 = this.a6(var1);
      if (var2 == -1) {
         this.m1 = (this.m1 | var3) ^ var3;
      } else {
         this.m1 |= var3;
         this.e2 |= var1;
         if (var2 == 0) {
            this.e2 ^= var1;
         }
      }
   }

   private int a6(int var1) {
      int var2 = (int)((var1 & 4294967295L & 4294967295L) << 17) & 917504;
      if (var2 == 0) {
         throw new InvalidOperationException();
      } else {
         return var2;
      }
   }
}
