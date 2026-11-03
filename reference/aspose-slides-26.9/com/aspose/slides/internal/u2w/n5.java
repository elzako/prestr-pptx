package com.aspose.slides.internal.u2w;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.f5;
import com.aspose.slides.internal.r1x.m1;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public abstract class n5 implements m1 {
   private com.aspose.slides.internal.f2i.n5 u9;
   private final int h0;
   private int c8;
   private int t2;
   protected boolean n5;
   protected int l6;
   protected int k5;
   protected long[] u3;
   protected long[] a6;
   private int s7;
   private int x8;
   private int n3;
   private int y4;
   private com.aspose.slides.internal.l0u.n5 e2;
   private com.aspose.slides.internal.l0u.n5 t9;
   private boolean z1;
   private u9 t4;

   protected n5(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3) {
      if (var1 == null) {
         throw new ArgumentNullException("options");
      }

      if (var1.t1() == 0) {
         throw new com.aspose.slides.internal.h6t.u3("The bits per sample are not defined.");
      }

      this.y4 = var1.e2().h0();
      this.s7 = this.y4 >> 16 & 0xFF;
      this.x8 = this.y4 >> 8 & 0xFF;
      this.n3 = this.y4 & 0xFF;
      this.h0 = var1.m3();
      this.u9 = var1;
      this.u3 = var1.x8(273);
      this.a6 = var1.x8(279);

      for (a6 var7 : this.c8().u6()) {
         if (var7.k5() == 324) {
            this.u3 = this.c8().x8(324);
         }

         if (var7.k5() == 325) {
            this.a6 = this.c8().x8(325);
         }

         if (var7.k5() == 322) {
            int[] var8 = com.aspose.slides.internal.v6g.k5.n5(var7.h0(), int[].class);
            if (var8 != null && var8.length > 0) {
               this.l6 = var8[0] & 65535;
            }
         }

         if (var7.k5() == 323) {
            int[] var9 = com.aspose.slides.internal.v6g.k5.n5(var7.h0(), int[].class);
            if (var9 != null && var9.length > 0) {
               this.k5 = var9[0] & 65535;
               this.n5 = true;
            }
         }

         this.c8 = var2;
         this.t2 = var3;
      }
   }

   @Override
   public final com.aspose.slides.internal.l0u.n5 n5() {
      return this.e2;
   }

   @Override
   public final com.aspose.slides.internal.l0u.n5 l6() {
      return this.t9;
   }

   @Override
   public final boolean k5() {
      return this.z1;
   }

   public final u9 u3() {
      return this.t4;
   }

   public final void n5(u9 var1) {
      this.t4 = var1;
   }

   public final boolean a6() {
      return this.u9.y4() && this.u9.w1() && this.u9.j5() == 1;
   }

   public final int u9() {
      return this.c8;
   }

   public final int h0() {
      return this.t2;
   }

   public final com.aspose.slides.internal.f2i.n5 c8() {
      return this.u9;
   }

   public final int t2() {
      return this.h0;
   }

   public final int s7() {
      return n5(this.u9);
   }

   public static int n5(com.aspose.slides.internal.f2i.n5 var0) {
      int var1 = (int)var0.z7();
      long var2 = var0.d2();
      int var4;
      if ((var2 & 4294967295L) > 2147483647L) {
         var4 = Integer.MAX_VALUE;
      } else {
         var4 = (int)var2;
      }

      if (var4 == 0 || var4 > var1) {
         var4 = var1;
      }

      return var4;
   }

   public static int[][] l6(com.aspose.slides.internal.f2i.n5 var0) {
      int[][] var1 = (int[][])null;
      switch (var0.y2()) {
         case 0:
         case 1:
            var1 = u3(var0);
         case 2:
         default:
            break;
         case 3:
            var1 = k5(var0);
      }

      return var1;
   }

   public final com.aspose.slides.internal.h9s.u3 n5(com.aspose.slides.internal.f2i.n5 var1, int[][] var2, y2 var3, boolean var4) {
      com.aspose.slides.internal.h9s.u3 var5 = null;
      switch (var1.y2()) {
         case -1:
            var5 = new n5$z3(var1.t1(), this.c8, this.t2, var3.n3());
            break;
         case 0:
         case 1:
         case 3:
            var5 = this.l6(var1, var2, var3.n3(), var4);
            break;
         case 2:
            if (var4) {
               var5 = this.l6(var1, var3.n3());
            } else {
               var5 = this.n5(var1, var3.n3());
            }
         case 4:
         case 7:
         default:
            break;
         case 5:
            if (var1.c4() == null) {
               var5 = this.k5(var1, var3.n3());
            }
            break;
         case 6:
            var5 = this.a6(var1, var3.n3());
            break;
         case 8:
            var5 = this.u3(var1, var3.n3());
      }

      if (var5 == null) {
         throw new com.aspose.slides.internal.h6t.u3(
            "The specified Tiff file format options are not supported. Cannot create raw data to color data converter."
         );
      } else {
         return var5;
      }
   }

   protected void n5(int[] var1, int var2, int var3) {
      int var4 = var2 + var3;

      for (int var5 = var2; var5 < var4; var5++) {
         int var6 = var1[var5] >> 24 & 0xFF;
         if (var6 == 0) {
            var1[var5] = this.y4;
         } else if (var6 != 255) {
            int var7 = var1[var5] >> 16 & 0xFF;
            int var8 = var1[var5] >> 8 & 0xFF;
            int var9 = var1[var5] & 0xFF;
            var7 = (byte)(var7 * var6 / 255 + this.s7 * (255 - var6) / 255) & 255;
            var8 = (byte)(var8 * var6 / 255 + this.x8 * (255 - var6) / 255) & 255;
            var9 = (byte)(var9 * var6 / 255 + this.n3 * (255 - var6) / 255) & 255;
            boolean var10 = false;
            short var11 = 255;
            if (var7 < 0) {
               var7 = 0;
            } else if (var7 > 255) {
               var7 = 255;
            }

            if (var8 < 0) {
               var8 = 0;
            } else if (var8 > 255) {
               var8 = 255;
            }

            if (var9 < 0) {
               var9 = 0;
            } else if (var9 > 255) {
               var9 = 255;
            }

            var1[var5] = 0xFF000000 | var7 << 16 | var8 << 8 | var9;
         }
      }
   }

   protected void n5(long[] var1, int var2, int var3) {
      boolean var4 = false;
      char var5 = '\uffff';
      int var6 = var2 + var3;
      long var7 = this.s7 << 8 | this.s7;
      long var9 = this.x8 << 8 | this.x8;
      long var11 = this.n3 << 8 | this.n3;
      long var13 = -281474976710656L | var7 << 32 | var9 << 16 | var11;

      for (int var15 = var2; var15 < var6; var15++) {
         long var16 = var1[var15] >> 48 & 65535L;
         if (var16 == 0L) {
            var1[var15] = var13;
         } else if (var16 != 65535L) {
            long var18 = var1[var15] >> 32 & 65535L;
            long var20 = var1[var15] >> 16 & 65535L;
            long var22 = var1[var15] & 65535L;
            var18 = var18 * var16 / 65535L + var7 * (65535L - var16) / 65535L;
            var20 = var20 * var16 / 65535L + var9 * (65535L - var16) / 65535L;
            var22 = var22 * var16 / 65535L + var11 * (65535L - var16) / 65535L;
            if (var18 < 0L) {
               var18 = 0L;
            } else if (var18 > 65535L) {
               var18 = 65535L;
            }

            if (var20 < 0L) {
               var20 = 0L;
            } else if (var20 > 65535L) {
               var20 = 65535L;
            }

            if (var22 < 0L) {
               var22 = 0L;
            } else if (var22 > 65535L) {
               var22 = 65535L;
            }

            var1[var15] = -281474976710656L | var18 << 32 | var20 << 16 | var22;
         }
      }
   }

   public static void n5(byte[] var0, int var1, int var2) {
      while (var2-- > 0) {
         var0[var1] = f5.n5[var0[var1] & 0xFF];
         var1++;
      }
   }

   public static int[][] k5(com.aspose.slides.internal.f2i.n5 var0) {
      int var1 = var0.t1();
      int var2 = 8 / var1;
      int var3 = 256;
      byte var4 = 8;
      if (var1 == 16) {
         var2 = 1;
         var3 = 65536;
         var4 = 16;
      }

      int var5 = com.aspose.slides.internal.v6g.k5.u3(q1.a6(2.0, var1), 14);
      com.aspose.slides.internal.b8u.a6 var6 = var0.k5();
      if (var6 == null) {
         throw new com.aspose.slides.internal.h6t.u3("The color map is not defined in the palettized image.");
      }

      if (var6.n5() != var5) {
         throw new com.aspose.slides.internal.h6t.u3("Color map entries must contain 2**(bits per sample) values.");
      }

      int[] var7 = var6.l6();
      boolean var8 = var1 == 1 || var1 == 2 || var1 == 4 || var1 == 8 || var1 == 16;
      int[][] var9;
      if (var0.o0() != 2 && var8) {
         var9 = new int[var3][];
         int var10 = (1 << var1) - 1;

         for (int var11 = 0; var11 < var3; var11++) {
            var9[var11] = new int[var2];

            for (int var12 = 0; var12 < var2; var12++) {
               int var13 = var11 >> var4 - (var12 + 1) * var1 & var10;
               var9[var11][var12] = var7[var13];
            }
         }
      } else {
         var9 = new int[][]{new int[var5]};
         System.arraycopy(var7, 0, var9[0], 0, var5);
      }

      return var9;
   }

   private static int[][] u3(com.aspose.slides.internal.f2i.n5 var0) {
      int var1 = var0.t1();
      int var2 = com.aspose.slides.internal.v6g.k5.u3(q1.a6(2.0, var1), 14);
      int var3 = 8 / var1;
      double var4 = 1.0;
      int var6 = 256;
      byte var7 = 8;
      int var8 = 255;
      if (var1 == 16) {
         var4 = 257.0;
         var3 = 1;
         var6 = 65536;
         var7 = 16;
         var8 = 65536;
      }

      int[] var9 = new int[var2];
      double var10 = -(255.0 * var4) / (var2 - 1);
      if (var0.y2() == 1) {
         var8 = 0;
         var10 *= -1.0;
      }

      double var12 = var8;

      for (int var14 = 0; var14 < var2; var14++) {
         int var15 = com.aspose.slides.internal.v6g.k5.u3(var12 / var4 + 0.5, 14);
         int var16 = var15 << 8 | var15 << 16 | var15 | 0xFF000000;
         var9[var14] = var16;
         var12 += var10;
      }

      boolean var21 = var1 == 1 || var1 == 2 || var1 == 4 || var1 == 8 || var1 == 16;
      int[][] var20;
      if (var0.o0() != 2 && var21) {
         var20 = new int[var6][];
         int var22 = (1 << var1) - 1;

         for (int var17 = 0; var17 < var6; var17++) {
            var20[var17] = new int[var3];

            for (int var18 = 0; var18 < var3; var18++) {
               int var19 = var17 >> var7 - (var18 + 1) * var1 & var22;
               var20[var17][var18] = var9[var19];
            }
         }
      } else {
         var20 = new int[][]{var9};
      }

      return var20;
   }

   private com.aspose.slides.internal.h9s.u3 l6(com.aspose.slides.internal.f2i.n5 var1, int[][] var2, y2 var3, boolean var4) {
      if (var2 == null) {
         throw new ArgumentNullException("lut");
      }

      com.aspose.slides.internal.h9s.u3 var5 = null;
      int var6 = this.n5 ? this.l6 : this.c8;
      int var7 = this.n5 ? this.k5 : this.h0();
      if (var1.t1() == 16) {
         if (var1.o0() == 2) {
            var5 = new n5$t4(var1.t1(), var6, var7, var2[0], var3.n3());
         } else {
            var5 = new n5$z1(var1.t1(), var6, var7, var2, var3.n3(), var1.q0(), var4);
         }
      } else if (var1.t1() != 1 && var1.t1() != 2 && var1.t1() != 4 && var1.t1() != 8) {
         int[] var8 = var1.k7();
         if (var8.length != 1) {
            throw new com.aspose.slides.internal.h6t.u3(
               d1.n5(new String[]{"The grayscale color converter supports only single channel. Found ", a3.l6(var8.length), " channels instead."})
            );
         }

         var5 = new n5$e2(var1.t1(), var6, var7, var2[0], var3.n3(), this.n5(var1, var8, new double[]{1.0}));
      } else if (var1.o0() == 2) {
         var5 = new n5$q0(var1.t1(), var6, var7, var2[0], var3.n3());
      } else {
         var5 = new n5$t9(var1.t1(), var6, var7, var2, var3.n3());
      }

      return var5;
   }

   private com.aspose.slides.internal.h9s.u3 n5(com.aspose.slides.internal.f2i.n5 var1, y2 var2) {
      n5$y4 var3 = null;
      int[] var4 = var1.k7();
      int var5 = var1.t1();
      int var6 = this.n5 ? this.l6 : this.c8;
      int var7 = this.n5 ? this.k5 : this.h0();
      if (var4.length >= 4) {
         if (var1.j5() == 1) {
            if (var5 >= 32 && var5 % 8 == 0 && (var4[0] & 65535) == 8 && (var4[1] & 65535) == 8 && (var4[2] & 65535) == 8 && (var4[3] & 65535) == 8) {
               if (var1.o0() == 2) {
                  var3 = new n5$i1(var5, var6, var7, var2.n3());
               } else {
                  var3 = new n5$s3(var5, var6, var7, var2.n3());
               }
            } else if (var5 != 64 || (var4[0] & 65535) != 16 || (var4[1] & 65535) != 16 || (var4[2] & 65535) != 16 || (var4[2] & 65535) != 16) {
               var3 = new n5$d5(var5, var6, var7, var2.n3(), this.n5(var1, var4, this.n5(var4)));
            } else if (var1.o0() == 2) {
               var3 = new n5$b3(var5, var6, var7, var2.n3(), this.u9.q0());
            } else {
               var3 = new n5$f2(var5, var6, var7, var2.n3(), this.u9.q0());
            }
         } else if (var1.j5() == 2 || var1.j5() == 0) {
            if (var5 >= 32 && var5 % 8 == 0 && (var4[0] & 65535) == 8 && (var4[1] & 65535) == 8 && (var4[2] & 65535) == 8 && (var4[3] & 65535) == 8) {
               if (var1.o0() == 2) {
                  var3 = new n5$a0(var5, var6, var7, var2.n3());
               } else {
                  var3 = new n5$y2(var5, var6, var7, var2.n3());
               }
            } else if (var5 != 64 || (var4[0] & 65535) != 16 || (var4[1] & 65535) != 16 || (var4[2] & 65535) != 16 || (var4[3] & 65535) != 16) {
               var3 = new n5$c4(var5, var6, var7, var2.n3(), this.n5(var1, var4, this.n5(var4)));
            } else if (var1.o0() == 2) {
               var3 = new n5$z7(var5, var6, var7, var2.n3(), this.u9.q0());
            } else {
               var3 = new n5$o0(var5, var6, var7, var2.n3(), this.u9.q0());
            }
         }
      } else if (var4.length >= 3) {
         if (var5 >= 24 && var5 % 8 == 0 && (var4[0] & 65535) == 8 && (var4[1] & 65535) == 8 && (var4[2] & 65535) == 8) {
            if (var1.o0() == 2) {
               var3 = new n5$j5(var5, var6, var7, var2.n3());
            } else {
               var3 = new n5$k7(var5, var6, var7, var2.n3());
            }
         } else if (var5 != 48 || (var4[0] & 65535) != 16 || (var4[1] & 65535) != 16 || (var4[2] & 65535) != 16) {
            var3 = new n5$m1(var5, var6, var7, var2.n3(), this.n5(var1, var4, this.n5(var4)));
         } else if (var1.o0() == 2) {
            var3 = new n5$w1(var5, var6, var7, var2.n3(), this.u9.q0());
         } else {
            var3 = new n5$m3(var5, var6, var7, var2.n3(), this.u9.q0());
         }
      }

      return var3;
   }

   private com.aspose.slides.internal.h9s.u3 l6(com.aspose.slides.internal.f2i.n5 var1, y2 var2) {
      n5$y4 var3 = null;
      int[] var4 = var1.k7();
      int var5 = var1.t1();
      int var6 = this.n5 ? this.l6 : this.c8;
      int var7 = this.n5 ? this.k5 : this.t2;
      if (var4.length == 4 && (var4[0] & 65535) == 16 && (var4[1] & 65535) == 16 && (var4[2] & 65535) == 16 && (var4[3] & 65535) == 16) {
         if (var1.j5() == 1) {
            if (var1.o0() == 2) {
               var3 = new n5$e5(var5, var6, var7, var2.n3(), this.u9.q0());
            } else {
               var3 = new n5$p8(var5, var6, var7, var2.n3(), this.u9.q0());
            }
         } else if (var1.o0() == 2) {
            var3 = new n5$d2(var5, var6, var7, var2.n3(), this.u9.q0());
         } else {
            var3 = new n5$y1(var5, var6, var7, var2.n3(), this.u9.q0());
         }
      } else if (var4.length == 3 && (var4[0] & 65535) == 16 && (var4[1] & 65535) == 16 && (var4[2] & 65535) == 16) {
         if (var1.o0() == 2) {
            var3 = new n5$r4(var5, var6, var7, var2.n3(), this.u9.q0());
         } else {
            var3 = new n5$z8(var5, var6, var7, var2.n3(), this.u9.q0());
         }
      }

      if (var3 == null) {
         String var8 = "Unsupported bits per sample (";

         for (int var9 = 0; var9 < var4.length; var9++) {
            var8 = d1.l6(var8, var4[var9]);
            if (var9 < var4.length - 1) {
               var8 = d1.n5(var8, ", ");
            }
         }

         var8 = d1.n5(var8, ").");
         throw new com.aspose.slides.internal.h6t.u3(var8);
      } else {
         return var3;
      }
   }

   private com.aspose.slides.internal.h9s.u3 k5(com.aspose.slides.internal.f2i.n5 var1, y2 var2) {
      n5$y4 var3 = null;
      int[] var4 = var1.k7();
      int var5 = this.n5 ? this.l6 : this.c8;
      int var6 = this.n5 ? this.k5 : this.h0();
      if (var1.j5() == 1 && var4.length >= 4) {
         int var8 = var1.t1();
         if (var8 >= 32 && var8 % 8 == 0 && (var4[0] & 65535) == 8 && (var4[1] & 65535) == 8 && (var4[2] & 65535) == 8 && (var4[3] & 65535) == 8) {
            if (var1.o0() == 2) {
               var3 = new n5$h0(var1.m1(), var1.t1(), var5, var6, var2.n3());
            } else {
               var3 = new n5$u9(var1.m1(), var1.t1(), var5, var6, var2.n3());
            }
         }
      } else if (var1.j5() == 0 && var4.length >= 4) {
         int var7 = var1.t1();
         if (var7 < 32 || var7 % 8 != 0 || (var4[0] & 65535) != 8 || (var4[1] & 65535) != 8 || (var4[2] & 65535) != 8 || (var4[3] & 65535) != 8) {
            var3 = new n5$c8(var1.m1(), var1.t1(), this.c8, this.t2, var2.n3(), this.n5(var1, var4, this.n5(var4)));
         } else if (var1.o0() == 2) {
            var3 = new n5$s7(var1.m1(), var1.t1(), var5, var6, var2.n3());
         } else {
            var3 = new n5$t2(var1.m1(), var1.t1(), var5, var6, var2.n3());
         }
      } else if (var1.j5() == 2
         && var4.length > 4
         && (var4[0] & 65535) == 8
         && (var4[1] & 65535) == 8
         && (var4[2] & 65535) == 8
         && (var4[3] & 65535) == 8
         && (var4[4] & 65535) == 8) {
         if (var1.o0() == 2) {
            var3 = new n5$n3(var1.m1(), var1.t1(), var5, var6, var2.n3());
         } else {
            var3 = new n5$x8(var1.m1(), var1.t1(), var5, var6, var2.n3());
         }
      }

      return var3;
   }

   private com.aspose.slides.internal.h9s.u3 u3(com.aspose.slides.internal.f2i.n5 var1, y2 var2) {
      n5$y4 var3 = null;
      int[] var4 = var1.k7();
      int var5 = this.n5 ? this.l6 : this.c8;
      int var6 = this.n5 ? this.k5 : this.h0();
      if (var4.length >= 3 && var1.j5() == 0) {
         int var7 = var1.t1();
         if (var7 < 24 || var7 % 8 != 0 || (var4[0] & 65535) != 8 || (var4[1] & 65535) != 8 || (var4[2] & 65535) != 8) {
            var3 = new n5$k5(var1.t1(), this.c8, this.t2, var2.n3(), this.n5(var1, var4, this.n5(var4)));
         } else if (var1.o0() == 2) {
            var3 = new n5$a6(var1.t1(), var5, var6, var2.n3());
         } else {
            var3 = new n5$u3(var1.t1(), var5, var6, var2.n3());
         }
      }

      return var3;
   }

   private com.aspose.slides.internal.h9s.u3 a6(com.aspose.slides.internal.f2i.n5 var1, y2 var2) {
      com.aspose.slides.internal.d3c.a6 var3 = null;
      int[] var4 = var1.k7();
      int var5 = this.n5 ? this.l6 : this.c8;
      int var6 = this.n5 ? this.k5 : this.h0();
      if (var4.length >= 3 && var1.j5() == 0) {
         int var7 = var1.t1();
         if (var7 < 24 || var7 % 8 != 0 || (var4[0] & 65535) != 8 || (var4[1] & 65535) != 8 || (var4[2] & 65535) != 8) {
            var3 = new n5$v4(var1.t1(), this.c8, this.t2, var2.n3(), var1, this.n5(var1, var4, this.n5(var4)));
         } else if (var1.o0() == 2) {
            var3 = new n5$t1(var1.t1(), var5, var6, var2.n3(), var1);
         } else {
            var3 = new n5$u6(var1.t1(), var5, var6, var2.n3(), var1);
         }
      }

      return var3;
   }

   private double[] n5(int[] var1) {
      double[] var2 = new double[var1.length];
      double var3 = 255.0;

      for (int var5 = 0; var5 < var2.length; var5++) {
         var2[var5] = 255.0 / (q1.a6(2.0, var1[var5] & 65535) - 1.0);
      }

      return var2;
   }

   private com.aspose.slides.internal.h9s.l6 n5(com.aspose.slides.internal.f2i.n5 var1, int[] var2, double[] var3) {
      n5$n5 var4;
      if (var1.o0() == 2) {
         var4 = new n5$l6(var2, var3);
      } else {
         var4 = new n5$n5(var2, var3);
      }

      return var4;
   }
}
