package com.aspose.slides.internal.l3e;

import com.aspose.slides.Collections.BitArray;
import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.b7s.a5;
import com.aspose.slides.internal.b7s.e9;
import com.aspose.slides.internal.b7s.h2;
import com.aspose.slides.internal.b7s.n3;
import com.aspose.slides.internal.b7s.p3;
import com.aspose.slides.internal.b7s.s7;
import com.aspose.slides.internal.b7s.t4;
import com.aspose.slides.internal.b7s.t9;
import com.aspose.slides.internal.b7s.y0;
import com.aspose.slides.internal.b7s.z6;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.q1;

public class n5 extends l6 {
   private static h0 u3 = com.aspose.slides.internal.l3e.c8.n5().u3();
   private static h0 a6 = com.aspose.slides.internal.l3e.c8.l6().u3();
   private final Dictionary<Long, short[]> u9 = new Dictionary<>();
   private final Dictionary<Long, short[]> h0 = new Dictionary<>();
   private boolean c8 = false;
   private short[][][][] t2;
   private BitArray[][] s7;
   private short[][][][] x8;
   private BitArray[][] n3;
   private com.aspose.slides.internal.j8o.l6 y4;
   private com.aspose.slides.internal.l4w.k5 e2;
   private List<a5> t9 = new List<>();
   private byte[][] z1;
   private int t4;
   private boolean q0 = false;

   public final byte[][] n5() {
      return this.z1;
   }

   public final void n5(byte[][] var1) {
      this.z1 = var1;
   }

   public final com.aspose.slides.internal.j8o.l6 l6() {
      return this.y4;
   }

   public final void n5(com.aspose.slides.internal.j8o.l6 var1) {
      this.y4 = var1;
   }

   public static h0 k5() {
      return u3;
   }

   public static h0 u3() {
      return a6;
   }

   public static com.aspose.slides.internal.b7s.u3[] n5(y0 var0) {
      h2 var1 = new h2(var0);
      List var2 = new List();

      while (var1.u3()) {
         int var3 = 0;
         int[] var4 = new int[]{0};
         var1.n5(var4);
         var3 = var4[0];
         byte var5 = (byte)var3;
         if (var5 == -60) {
            var2.addRange(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.b7s.u3.n5(var1)));
         } else if (var5 != -40) {
            if (var5 == -39) {
               break;
            }

            int var6 = 0;
            int[] var7 = new int[]{0};
            var1.n5(var7);
            var6 = var7[0];
            var1.l6(var6 - 2);
         }
      }

      return (com.aspose.slides.internal.b7s.u3[])var2.toArray(new com.aspose.slides.internal.b7s.u3[0]);
   }

   public static z6[] l6(y0 var0) {
      h2 var1 = new h2(var0);
      List var2 = new List();

      while (var1.u3()) {
         int var3 = 0;
         int[] var4 = new int[]{0};
         var1.n5(var4);
         var3 = var4[0];
         byte var5 = (byte)var3;
         if (var5 == -37) {
            var2.addRange(com.aspose.slides.ms.System.u3.n5(z6.n5(var1)));
         } else if (var5 != -40) {
            if (var5 == -39) {
               break;
            }

            int var6 = 0;
            int[] var7 = new int[]{0};
            var1.n5(var7);
            var6 = var7[0];
            var1.l6(var6 - 2);
         }
      }

      return (z6[])var2.toArray(new z6[0]);
   }

   public final void n5(a5 var1) {
      synchronized (this.t9) {
         if (!this.t9.containsItem(var1)) {
            this.t9.addItem(var1);
         }
      }
   }

   public final void l6(a5 var1) {
      synchronized (this.t9) {
         if (this.t9.containsItem(var1)) {
            this.t9.removeItem(var1);
         }
      }
   }

   public final void n5(h2 var1, y2 var2, int var3, int var4, int var5, boolean var6) {
      if (j8.n5(var1) == com.aspose.slides.internal.v6g.k5.n5(h2.class)) {
         this.c8 = false;
      }

      if (this.k5.a6() != null) {
         if (this.k5.a6().u9() != null) {
            for (com.aspose.slides.internal.b7s.u3 var10 : this.k5.a6().u9()) {
               this.k5.n5().set_Item(var10.n5 & 255, var10);
            }
         }

         if (this.k5.a6().h0() != null) {
            for (z6 var27 : this.k5.a6().h0()) {
               this.k5.x8().set_Item(var27.n5 & 255, var27.k5());
            }
         }
      }

      boolean var18 = false;

      while (!var18) {
         if (this.c8) {
            if (!var6) {
               return;
            }

            for (n3 var31 : this.k5.u3().l6()) {
               var31.s7(0);
            }

            this.l6(var3, var4, var5, var2.n3());
            this.c8 = false;
         } else {
            byte var20 = this.k5.n3().u9();
            int var23 = 0;
            switch (var20) {
               case -64:
               case -63:
                  if (!this.q0) {
                     this.k5.n5(com.aspose.slides.internal.b7s.t4.n5(this.k5.n3(), (byte)-64));
                     this.k5.l6(false);
                  }

                  this.n5(this.k5);
                  break;
               case -62:
                  if (!this.q0) {
                     this.k5.n5(com.aspose.slides.internal.b7s.t4.n5(this.k5.n3(), (byte)-62));
                     this.k5.l6(true);
                  }

                  this.n5(this.k5);
                  break;
               case -61:
               case -59:
               case -58:
               case -57:
               case -56:
               case -55:
               case -54:
               case -53:
               case -52:
               case -51:
               case -50:
               case -49:
               case -34:
               case -33:
               case -32:
               case -31:
               case -30:
               case -29:
               case -28:
               case -27:
               case -26:
               case -25:
               case -24:
               case -23:
               case -22:
               case -21:
               case -20:
               case -19:
               case -18:
               case -17:
               case -16:
               case -15:
               case -14:
               case -13:
               case -12:
               case -11:
               case -10:
               case -9:
               case -8:
               case -7:
               case -6:
               case -5:
               case -4:
               case -3:
               case -2:
               case -1:
               case 0:
               default:
                  int[] var34 = new int[]{0};
                  this.c8().n3().n5(var34);
                  var23 = var34[0];
                  this.c8().n3().l6(var23 - 2);
                  break;
               case -60:
                  com.aspose.slides.internal.b7s.u3[] var30 = com.aspose.slides.internal.b7s.u3.n5(this.k5.n3());

                  for (com.aspose.slides.internal.b7s.u3 var36 : var30) {
                     this.k5.n5().set_Item(var36.n5 & 255, var36);
                  }
               case -48:
               case -47:
               case -46:
               case -45:
               case -44:
               case -43:
               case -42:
               case -41:
               case -40:
               case 1:
                  break;
               case -39:
                  var18 = true;
                  this.n5(var4);
                  break;
               case -38:
                  this.k5.n5(p3.n5(this.k5.n3(), this.k5.u3()));
                  this.c8().n5(this.c8().u9().l6.length < this.c8().u3().l6().length || this.c8().k5());
                  this.a6();
                  this.c8 = true;
                  break;
               case -37:
                  z6[] var12 = z6.n5(this.k5.n3());

                  for (z6 var16 : var12) {
                     this.k5.x8().set_Item(var16.n5 & 255, var16.k5());
                  }
                  break;
               case -36:
                  int[] var11 = new int[]{0};
                  this.c8().n3().n5(var11);
                  var23 = var11[0];
                  this.c8().n3().l6(var23 - 2);
                  break;
               case -35:
                  com.aspose.slides.internal.b7s.k5 var28 = com.aspose.slides.internal.b7s.k5.n5(this.k5.n3());
                  this.k5.u3(var28.n5() & 65535);
            }
         }
      }
   }

   public final void n5(t9 var1) {
      this.l6(var1);
      if (this.c8().u3().a6()) {
         this.n5(new com.aspose.slides.internal.j8o.u9(this.c8()));
      } else {
         this.n5(new com.aspose.slides.internal.v0v.n5(this.c8()));
      }

      this.t2 = new short[10][][][];
      this.s7 = new BitArray[10][];
      this.x8 = new short[10][][][];
      this.n3 = new BitArray[10][];
      this.e2 = new com.aspose.slides.internal.l4w.k5(this.c8());
      if (!this.q0) {
         this.k5.n5(k5().u3());

         for (n3 var5 : this.c8().u3().l6()) {
            this.c8().u3().n5(q1.n5(var5.u3() & 255, this.c8().u3().u3()));
            this.c8().u3().k5(q1.n5(var5.n3() & 255, this.c8().u3().h0()));
         }

         this.t4 = com.aspose.slides.internal.n5p.h0.k5(this.c8().u3().c8() & 65535, 8 * this.c8().u3().u3());

         for (n3 var13 : this.k5.u3().l6()) {
            var13.n5 = com.aspose.slides.internal.n5p.h0.n5((this.c8().u3().c8() & 65535) * (var13.u3() & 255), this.c8().u3().u3() * 8);
            var13.l6(com.aspose.slides.internal.n5p.h0.n5((this.c8().u3().t2() & 65535) * (var13.n3() & 255), this.c8().u3().h0() * 8));
            int var6 = var13.n5 % (var13.n3() & 255);
            if (var6 == 0) {
               var6 = var13.n3() & 255;
            }

            var13.k5(var6);
            var6 = var13.a6() % (var13.n3() & 255);
            if (var6 == 0) {
               var6 = var13.n3() & 255;
            }

            var13.u3(var6);
            var13.c8(com.aspose.slides.internal.n5p.h0.n5((this.c8().u3().c8() & 65535) * (var13.u3() & 255), this.k5.u3().u3()));
            var13.t2(com.aspose.slides.internal.n5p.h0.n5((this.c8().u3().t2() & 65535) * (var13.n3() & 255), this.k5.u3().h0()));
         }

         com.aspose.slides.internal.t7p.t4 var8 = new com.aspose.slides.internal.t7p.t4(this.c8().u3().l6(), this.c8().u3().u3(), this.k5.u3().h0());

         for (n3 var16 : this.c8().u3().l6()) {
            var16.n5(var8.n5(var16));
         }

         this.q0 = true;
      }
   }

   public final void a6() {
      if (this.c8().u9().l6.length == 1) {
         int var1 = this.c8().u9().l6[0];
         int var2 = this.k5(var1);
         n3 var3 = this.c8().u3().l6()[var2];
         var3.h0(1);
         var3.u9(1);
         var3.a6(1);
         this.k5.l6(var3.n5);
         this.c8().u9().n5(new int[]{var2});
         this.c8().u9().a6(1);
      } else {
         this.k5.l6(com.aspose.slides.internal.n5p.h0.n5(this.k5.u3().c8() & 65535, this.k5.u3().u3() * 8));
         this.k5.u9().a6(0);

         for (int var7 = 0; var7 < this.c8().u9().l6.length; var7++) {
            int var8 = this.c8().u9().l6[var7];
            int var9 = this.k5(var8);
            n3 var4 = this.c8().u3().l6()[var9];
            var4.a6((var4.u3() & 255) * (var4.n3() & 255));
            var4.h0(var4.u3() & 255);
            var4.u9(var4.n3() & 255);
            int var5 = var4.c8();

            while (var5-- > 0) {
               int var6 = this.c8().u9().u9();
               this.c8().u9().a6(var6 + 1);
               this.c8().u9().k5()[var6] = var9;
            }
         }
      }

      this.l6().l6();
   }

   public final void u9() {
      this.c8().k5(com.aspose.slides.internal.n5p.h0.n5(this.c8().u3().t2() & 65535, this.c8().u3().h0() * 8));
      if (this.k5.u9().l6.length > 1) {
         this.k5.n5(1);
      } else {
         int var1 = this.k5.u9().k5()[0];
         n3 var2 = this.k5.u3().l6()[var1];
         this.k5.n5(var2.n3() & 255);
      }
   }

   public final void n5(int var1, int var2, int var3, y2 var4) {
      synchronized (this.c8().n3().n5()) {
         this.u9.clear();
         this.h0.clear();

         for (int var6 = 0; var6 < 10; var6++) {
            this.t2[var6] = (short[][][])null;
            this.x8[var6] = (short[][][])null;
         }

         this.c8().n3().h0();
         this.n5(this.c8().n3(), var4.n3(), var1, var2, var3, true);
      }
   }

   public final void n5(int var1, y2 var2) {
      synchronized (this.t9) {
         for (int var4 = 0; var4 < this.t9.size(); var4++) {
            this.t9.get_Item(var4).n5(this, var1, var2.n3());
         }
      }
   }

   public final void n5(int var1) {
      synchronized (this.t9) {
         for (int var3 = 0; var3 < this.t9.size(); var3++) {
            this.t9.get_Item(var3).n5(this, var1);
         }
      }
   }

   private int k5(int var1) {
      int var2 = 0;
      boolean var3 = false;

      for (int var4 = 0; var4 < this.c8().u3().l6().length; var4++) {
         if ((this.c8().u3().l6()[var4].u9() & 255) == var1) {
            var2 = var4;
            var3 = true;
            break;
         }
      }

      if (!var3) {
         throw new com.aspose.slides.internal.z3b.k5(
            d1.n5, new com.aspose.slides.internal.z3b.a6("Corrupted Jpeg scan component id definition. Cannot load image.")
         );
      } else {
         return var2;
      }
   }

   private short[] n5(short[] var1, boolean[] var2) {
      long var3 = e9.n5(var1);
      if (!this.u9.containsKey(var3) && !this.h0.containsKey(var3)) {
         short[] var5 = null;
         short[][] var6 = new short[][]{(short[])var5};
         boolean var7 = !com.aspose.slides.internal.l3e.t2.n5(var1, var6);
         var5 = var6[0];
         if (var7) {
            short[] var11 = var1;
            short[] var8 = com.aspose.slides.internal.l3e.t2.n5(var11);
            this.h0.addItem(var3, var8);
            var2[0] = false;
            return var8;
         } else {
            this.u9.addItem(var3, (short[])var5);
            var2[0] = true;
            return (short[])var5;
         }
      } else if (this.u9.containsKey(var3)) {
         short[] var12 = this.u9.get_Item(var3);
         var2[0] = true;
         return var12;
      } else {
         short[] var9 = this.h0.get_Item(var3);
         var2[0] = false;
         return var9;
      }
   }

   private void l6(int var1, int var2, int var3, y2 var4) {
      if (!this.c8) {
         throw new com.aspose.slides.internal.z3b.k5(d1.n5, new com.aspose.slides.internal.z3b.a6("Cannot consume data. No data to consume."));
      }

      this.u9();
      if (this.k5.u9().l6.length == 1) {
         if (this.c8().u3().a6()) {
            this.u9(var1, var2, var3, var4.n3());
         } else {
            this.a6(var1, var2, var3, var4.n3());
         }
      } else if (this.c8().u3().a6()) {
         this.u3(var1, var2, var3, var4.n3());
      } else {
         this.k5(var1, var2, var3, var4.n3());
      }
   }

   private void k5(int var1, int var2, int var3, y2 var4) {
      n3[] var5 = this.k5.u3().l6();
      int[] var6 = this.k5.u9().l6;
      int var7 = var6.length;
      int[] var8 = new int[var7];
      int[] var9 = new int[var7];
      int[] var10 = new int[var7];
      int var11 = var2 - var1 + 1;
      int var12 = this.k5.c8();
      int var13 = this.k5.y4();
      int var14 = this.k5.t2();

      for (int var15 = 0; var15 < var7; var15++) {
         int var16 = var6[var15];
         int var17 = this.k5(var16);
         var8[var15] = var17;
         n3 var18 = var5[var17];
         var9[var15] = var1 * (var18.n3() & 255);
         var10[var15] = (var2 + 1) * (var18.n3() & 255) - 1;
      }

      short[][] var19 = new short[this.k5.u9().u9()][];

      for (int var20 = 0; var20 < var19.length; var20++) {
         var19[var20] = new short[64];
      }

      int var40 = this.k5.u3().n5() & 255;
      int var21 = -1;

      for (int var22 = 0; var22 < var13; var22++) {
         for (int var23 = 0; var23 < var14; var23++) {
            if (var21 > 0) {
               for (int var24 = 0; var24 < var21; var24++) {
                  var19[var24] = new short[64];
               }
            }

            var21 = this.y4.n5(var19);
            if (var21 == -1) {
               return;
            }

            int var41 = 0;

            for (int var37 = 0; var37 < var7; var37++) {
               int var38 = var8[var37];
               n3 var39 = var5[var38];
               byte[] var25 = this.z1[var38];
               int var26 = var9[var37];
               int var27 = var10[var37];
               int var28 = var39.t2();
               int var29 = var39.s7();
               int var30 = var22 * var12 * var28;
               int var31 = var23 * var29;
               int var32 = var30;

               for (int var33 = 0; var33 < var28; var33++) {
                  int var34 = var31;

                  for (int var35 = 0; var35 < var29; var35++) {
                     if (var32 >= var26 && var32 <= var27) {
                        short[] var36 = var19[var41++];
                        if (var40 == 8) {
                           this.n5(var36, var32, var34, var26, var39, var25);
                        } else {
                           if (var40 != 12) {
                              throw new NotSupportedException("Jpeg DCT supports only 8 or 12 bits per sample.");
                           }

                           this.l6(var36, var32, var34, var26, var39, var25);
                        }

                        var34++;
                     } else {
                        var41++;
                     }
                  }

                  var32++;
               }
            }
         }
      }
   }

   private void u3(int var1, int var2, int var3, y2 var4) {
      int var5 = this.c8().u9().l6.length;
      int[] var6 = new int[var5];
      int[] var7 = new int[var5];
      int[] var8 = new int[var5];
      int[] var9 = new int[var5];
      int[] var10 = new int[var5];
      int[] var11 = new int[var5];
      int[] var12 = new int[var5];
      int var13 = var2 - var1 + 1;
      long var14 = 0L;
      long[] var16 = new long[var13];

      for (int var17 = 0; var17 < var5; var17++) {
         int var18 = this.k5(this.c8().u9().l6[var17]);
         var6[var17] = var18;
         n3 var19 = this.k5.u3().l6()[var18];
         short[][][] var20 = this.t2[var18];
         BitArray[] var21 = this.s7[var18];
         if (var20 == null) {
            short[][][][] var22 = new short[][][][]{var20};
            BitArray[][] var23 = new BitArray[][]{var21};
            com.aspose.slides.internal.b7s.s7.n5((var19.n3() & 255) * var13, (var19.u3() & 255) * this.k5.t2(), var22, var23);
            var20 = var22[0];
            var21 = var23[0];
            this.t2[var18] = var20;
            this.s7[var18] = var21;
         }

         short[][][] var59 = this.x8[var18];
         BitArray[] var64 = this.n3[var18];
         if (var59 == null) {
            short[][][][] var24 = new short[][][][]{var59};
            BitArray[][] var25 = new BitArray[][]{var64};
            com.aspose.slides.internal.b7s.s7.n5((var19.n3() & 255) * (this.k5.y4() - var13), (var19.u3() & 255) * this.k5.t2(), var24, var25);
            var59 = var24[0];
            var64 = var25[0];
            this.x8[var18] = var59;
            this.n3[var18] = var64;
         }

         var14 += (var19.n3() & 255) * (var19.u3() & 255) * this.k5.t2();
         int var68 = var19.n3() & 255;
         var7[var17] = var1 * (var19.n3() & 255);
         var8[var17] = var2 * (var19.n3() & 255) + var68 - 1;
         var10[var17] = var7[var17] > 0 ? var7[var17] - 1 : var7[var17];
         var11[var17] = var8[var17] < var3 * (var19.n3() & 255) + var68 - 1 ? var8[var17] + 1 : var8[var17];
         var12[var17] = var3 * (var19.n3() & 255) + var68 - 1;
      }

      short[][] var51 = new short[this.k5.u9().u9()][];

      for (int var52 = 0; var52 < var51.length; var52++) {
         var51[var52] = new short[64];
      }

      int var53 = this.k5.u3().n5() & 255;
      int var54 = -1;

      for (int var56 = 0; var56 < this.k5.y4(); var56++) {
         for (int var58 = 0; var58 < this.k5.t2(); var58++) {
            if (var54 > 0) {
               for (int var61 = 0; var61 < var54; var61++) {
                  var51[var61] = new short[64];
               }
            }

            int var62 = 0;

            for (int var66 = 0; var66 < var6.length; var66++) {
               int var69 = var6[var66];
               n3 var71 = this.k5.u3().l6()[var69];
               short[][][] var26 = this.t2[var69];
               BitArray[] var27 = this.s7[var69];
               short[][][] var28 = this.x8[var69];
               BitArray[] var29 = this.n3[var69];
               int var30 = var71.t2();
               int var31 = var71.s7();
               int var32 = var7[var66];
               int var33 = var8[var66];
               int var34 = var56 * this.k5.c8() * var30;
               int var35 = var58 * var31;
               int var36 = var34;

               for (int var37 = 0; var37 < var30; var37++) {
                  int var38 = var35;

                  for (int var39 = 0; var39 < var31; var39++) {
                     short[] var40 = var51[var62++];
                     if (var36 >= var32 && var36 <= var33) {
                        short[] var88 = var26[var36 - var32][var38];
                        if (var88 != null) {
                           if (var27[var36 - var32].get_Item(var38)) {
                              com.aspose.slides.internal.l3e.t2.n5(var88, var40);
                           } else {
                              com.aspose.slides.internal.l3e.t2.n5(var88, 64, var40);
                           }
                        }
                     } else {
                        int var41 = var36 <= var10[var66] ? var9[var66] : var11[var66];
                        int var42 = var36 <= var10[var66] ? var36 - var41 : var36 - var41 + var10[var66];
                        short[] var43 = var28[var42][var38];
                        if (var43 != null) {
                           if (var29[var42].get_Item(var38)) {
                              com.aspose.slides.internal.l3e.t2.n5(var43, var40);
                           } else {
                              com.aspose.slides.internal.l3e.t2.n5(var43, 64, var40);
                           }
                        }
                     }

                     var38++;
                  }

                  var36++;
               }
            }

            if (this.y4.n5(var51) == -1) {
               return;
            }

            var54 = var62;
            var62 = 0;

            for (int var67 = 0; var67 < var6.length; var67++) {
               int var70 = var6[var67];
               n3 var72 = this.k5.u3().l6()[var70];
               short[][][] var73 = this.t2[var70];
               BitArray[] var74 = this.s7[var70];
               short[][][] var75 = this.x8[var70];
               BitArray[] var76 = this.n3[var70];
               int var77 = var72.t2();
               int var78 = var72.s7();
               int var79 = var7[var67];
               int var80 = var8[var67];
               int var81 = var56 * this.k5.c8() * var77;
               int var82 = var58 * var78;
               int var83 = var81;

               for (int var84 = 0; var84 < var77; var84++) {
                  int var85 = var82;

                  for (int var86 = 0; var86 < var78; var86++) {
                     short[] var87 = var51[var62++];
                     boolean var89 = false;
                     boolean[] var91 = new boolean[]{false};
                     short[] var92 = this.n5(var87, var91);
                     var89 = var91[0];
                     if (var83 >= var79 && var83 <= var80) {
                        var73[var83 - var79][var85] = var92;
                        var74[var83 - var79].set_Item(var85, var89);
                        int var93 = (var83 - var79) / (var72.n3() & 255);
                        var16[var93]++;
                        if (var16[var93] >= var14) {
                           int var94 = var83 / (var72.n3() & 255);
                           int var46 = 8 * this.c8().u3().h0();
                           int var47 = var4.x8() / var46;
                           int var48 = var94 == var47 ? var4.x8() : var94 * var46;
                           int var49 = var46;
                           if (var94 == var3) {
                              if (var94 == var47) {
                                 var49 = var4.n5() - var4.x8();
                              } else {
                                 var49 = var4.n5() - var94 * var46;
                              }
                           } else if (var94 == var47) {
                              var49 = (var94 + 1) * var46 - var4.x8();
                           }

                           y2 var50 = new y2(var4.s7(), var48, var4.t2(), var49);
                           if (var53 == 8) {
                              this.n5(var7, var94, var50.n3());
                           } else {
                              if (var53 != 12) {
                                 throw new NotSupportedException("Jpeg DCT supports only 8 or 12 bits per sample.");
                              }

                              this.l6(var7, var94, var50.n3());
                           }
                        }

                        var85++;
                     } else {
                        int var44 = var83 <= var10[var67] ? var9[var67] : var11[var67];
                        int var45 = var83 <= var10[var67] ? var83 - var44 : var83 - var44 + var10[var67];
                        var75[var45][var85] = var92;
                        var76[var45].set_Item(var85, var89);
                     }
                  }

                  var83++;
               }
            }
         }
      }
   }

   private void a6(int var1, int var2, int var3, y2 var4) {
      int var5 = this.k5.u9().k5()[0];
      n3[] var6 = this.k5.u3().l6();
      n3 var7 = var6[var5];
      byte[] var8 = this.z1[var5];
      int var9 = var7.n3() & 255;
      int var10 = var1 * (var7.n3() & 255);
      int var11 = var2 * (var7.n3() & 255) + var9 - 1;
      int var12 = this.k5.u3().n5() & 255;
      short[][] var13 = new short[1][];
      int var14 = var7.a6();
      int var15 = var7.n5;

      for (int var16 = 0; var16 < var14; var16++) {
         for (int var17 = 0; var17 < var15; var17++) {
            short[] var18 = new short[64];
            var13[0] = var18;
            this.y4.n5(var13);
            if (var16 >= var10 && var16 <= var11) {
               if (var12 == 8) {
                  this.n5(var18, var16, var17, var10, var7, var8);
               } else {
                  if (var12 != 12) {
                     throw new NotSupportedException("Jpeg DCT supports only 8 or 12 bits per sample.");
                  }

                  this.l6(var18, var16, var17, var10, var7, var8);
               }
            }
         }
      }
   }

   private void u9(int var1, int var2, int var3, y2 var4) {
      int var5 = this.c8().u3().l6().length;
      int[] var6 = new int[var5];
      int[] var7 = new int[var5];
      int var8 = this.k5.u9().k5()[0];
      int var9 = 0;
      n3 var10 = null;

      for (int var11 = 0; var11 < var5; var11++) {
         var6[var11] = var11;
         if (var11 == var8) {
            var9 = var11;
         }

         var10 = this.k5.u3().l6()[var11];
         var7[var11] = var1 * (var10.n3() & 255);
      }

      int var44 = var2 - var1 + 1;
      long[] var12 = new long[var44];
      long[] var13 = new long[var44];
      var10 = this.k5.u3().l6()[var8];

      for (int var14 = var1; var14 <= var2; var14++) {
         var12[var14 - var1] = var14 == var3 ? var10.h0() * var10.n5 : (var10.n3() & 255) * var10.n5;
      }

      short[][][] var45 = this.t2[var8];
      BitArray[] var15 = this.s7[var8];
      if (var45 == null) {
         short[][][][] var16 = new short[][][][]{var45};
         BitArray[][] var17 = new BitArray[][]{var15};
         com.aspose.slides.internal.b7s.s7.n5((var10.n3() & 255) * var44, (var10.u3() & 255) * this.k5.t2(), var16, var17);
         var45 = var16[0];
         var15 = var17[0];
         this.t2[var8] = var45;
         this.s7[var8] = var15;
      }

      short[][][] var46 = this.x8[var8];
      BitArray[] var47 = this.n3[var8];
      if (var46 == null) {
         short[][][][] var18 = new short[][][][]{var46};
         BitArray[][] var19 = new BitArray[][]{var47};
         com.aspose.slides.internal.b7s.s7.n5((var10.n3() & 255) * (var3 + 1 - var44), (var10.u3() & 255) * this.k5.t2(), var18, var19);
         var46 = var18[0];
         var47 = var19[0];
         this.x8[var8] = var46;
         this.n3[var8] = var47;
      }

      int var48 = var10.n3() & 255;
      var7[var9] = var1 * (var10.n3() & 255);
      int var20 = var2 * (var10.n3() & 255) + var48 - 1;
      boolean var49 = false;
      int var21 = var7[var9] > 0 ? var7[var9] - 1 : var7[var9];
      int var22 = var20 < var3 * (var10.n3() & 255) + var48 - 1 ? var20 + 1 : var20;
      int var23 = var3 * (var10.n3() & 255) + var48 - 1;
      int var24 = this.k5.u3().n5() & 255;
      short[][] var25 = new short[1][];

      for (int var26 = 0; var26 < var10.a6(); var26++) {
         for (int var27 = 0; var27 < var10.n5; var27++) {
            short[] var28 = new short[64];
            var25[0] = var28;
            int var29 = var7[var9];
            if (var26 >= var29 && var26 <= var20) {
               short[] var50 = var45[var26 - var7[var9]][var27];
               if (var50 != null) {
                  if (var15[var26 - var7[var9]].get_Item(var27)) {
                     com.aspose.slides.internal.l3e.t2.n5(var50, var28);
                  } else {
                     com.aspose.slides.internal.l3e.t2.n5(var50, 64, var28);
                  }
               }
            } else {
               int var30 = var26 <= var21 ? 0 : var22;
               int var31 = var26 <= var21 ? var26 - var30 : var26 - var30 + var21;
               short[] var32 = var46[var31][var27];
               if (var32 != null) {
                  if (var47[var31].get_Item(var27)) {
                     com.aspose.slides.internal.l3e.t2.n5(var32, var28);
                  } else {
                     com.aspose.slides.internal.l3e.t2.n5(var32, 64, var28);
                  }
               }
            }

            boolean var51 = this.y4.n5(var25) > -1;
            short[] var52 = var25[0];
            boolean var53 = false;
            boolean[] var33 = new boolean[]{false};
            short[] var34 = this.n5(var52, var33);
            var53 = var33[0];
            if (var26 >= var7[var9] && var26 <= var20) {
               var45[var26 - var7[var9]][var27] = var34;
               var15[var26 - var7[var9]].set_Item(var27, var53);
               int var55 = (var26 - var7[var9]) / (var10.n3() & 255);
               var13[var55]++;
               if (var13[var55] >= var12[var55]) {
                  int var56 = var26 / (var10.n3() & 255);
                  int var37 = 8 * this.c8().u3().h0();
                  int var38 = var4.x8() / var37;
                  int var39 = var56 == var38 ? var4.x8() : var56 * var37;
                  int var40 = var37;
                  if (var56 == var3) {
                     if (var56 == var38) {
                        var40 = var4.n5() - var4.x8();
                     } else {
                        var40 = var4.n5() - var56 * var37;
                     }
                  } else if (var56 == var38) {
                     var40 = (var56 + 1) * var37 - var4.x8();
                  }

                  y2 var41 = new y2(var4.s7(), var39, var4.t2(), var40);
                  if (var24 == 8) {
                     this.n5(var7, var56, var41.n3());
                  } else {
                     if (var24 != 12) {
                        throw new NotSupportedException("Jpeg DCT supports only 8 or 12 bits per sample.");
                     }

                     this.l6(var7, var56, var41.n3());
                  }
               }
            } else {
               int var35 = var26 <= var21 ? 0 : var22;
               int var36 = var26 <= var21 ? var26 - var35 : var26 - var35 + var21;
               var46[var36][var27] = var34;
               var47[var36].set_Item(var27, var53);
            }
         }
      }
   }

   private void n5(int[] var1, int var2, y2 var3) {
      h0 var4 = k5().u3();
      int var5 = var4.n5();
      com.aspose.slides.internal.l4w.k5 var6 = this.e2;
      int var7 = this.t4;
      byte[] var8 = var4.l6();

      for (int var9 = 0; var9 < var1.length; var9++) {
         byte[] var10 = this.z1[var9];
         n3 var11 = this.c8().u3().l6()[var9];
         int var12 = var1[var9];
         int var13 = var11.n3() & 255;
         int var14 = var2 * (var11.n3() & 255);
         short[][][] var15 = this.t2[var9];
         BitArray[] var16 = this.s7[var9];

         for (int var17 = 0; var17 < var13; var17++) {
            int var18 = var14 + var17 - var12;
            byte var19 = 0;

            for (int var20 = 0; var20 < var11.n5; var19 += 8) {
               if (var15 != null && var15[var18] != null && var15[var18][var20] != null) {
                  short[] var21 = new short[64];
                  int[] var22 = new int[64];
                  short[] var23 = var15[var18][var20];
                  boolean var24 = var16[var18].get_Item(var20);
                  if (var24) {
                     com.aspose.slides.internal.l3e.t2.n5(var23, var21);
                  } else {
                     com.aspose.slides.internal.l3e.t2.n5(var23, 64, var21);
                  }

                  var6.n5(var21, var11.u9() & 255, var10, var11.e2(), var19, var7, var8, var5, var22);
               } else if (var18 < var11.a6()) {
                  return;
               }

               var20++;
            }

            var11.s7(var11.e2() + 8);
         }
      }

      this.n5(var2, var3.n3());
   }

   private void n5(short[] var1, int var2, int var3, int var4, n3 var5, byte[] var6) {
      h0 var7 = k5().u3();
      int var8 = var7.n5();
      int var9 = var3 * 8;
      int var10 = (var2 - var4) * 8;
      int[] var11 = new int[64];
      byte[] var12 = var7.l6();
      this.e2.n5(var1, var5.u9() & 255, var6, var10, var9, this.t4, var12, var8, var11);
   }

   private void l6(short[] var1, int var2, int var3, int var4, n3 var5, byte[] var6) {
      h0 var7 = u3().u3();
      int var8 = var7.n5();
      int var9 = var3 * 8;
      int var10 = (var2 - var4) * 8;
      int[] var11 = new int[64];
      short[] var12 = var7.k5();
      this.e2.n5(var1, var5.u9() & 255, var6, var10, var9, this.t4, var12, var8, var11);
   }

   private void l6(int[] var1, int var2, y2 var3) {
      h0 var4 = u3().u3();
      int var5 = var4.n5();
      com.aspose.slides.internal.l4w.k5 var6 = this.e2;
      int var7 = this.t4;
      short[] var8 = var4.k5();

      for (int var9 = 0; var9 < var1.length; var9++) {
         byte[] var10 = this.z1[var9];
         n3 var11 = this.c8().u3().l6()[var9];
         int var12 = var1[var9];
         int var13 = var11.n3() & 255;
         int var14 = var2 * (var11.n3() & 255);
         short[][][] var15 = this.t2[var9];
         BitArray[] var16 = this.s7[var9];

         for (int var17 = 0; var17 < var13; var17++) {
            int var18 = var14 + var17 - var12;
            byte var19 = 0;

            for (int var20 = 0; var20 < var11.n5; var19 += 8) {
               if (var15 != null && var15[var18] != null && var15[var18][var20] != null) {
                  short[] var21 = new short[64];
                  int[] var22 = new int[64];
                  short[] var23 = var15[var18][var20];
                  boolean var24 = var16[var18].get_Item(var20);
                  if (var24) {
                     com.aspose.slides.internal.l3e.t2.n5(var23, var21);
                  } else {
                     com.aspose.slides.internal.l3e.t2.n5(var23, 64, var21);
                  }

                  var6.n5(var21, var11.u9() & 255, var10, var11.e2(), var19, var7, var8, var5, var22);
               } else if (var18 < var11.a6()) {
                  return;
               }

               var20++;
            }

            var11.s7(var11.e2() + 8);
         }
      }

      this.n5(var2, var3.n3());
   }
}
