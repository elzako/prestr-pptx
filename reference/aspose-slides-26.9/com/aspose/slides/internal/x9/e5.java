package com.aspose.slides.internal.x9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.p3.h2;
import com.aspose.slides.internal.p3.j8;
import com.aspose.slides.internal.p3.o0;
import com.aspose.slides.internal.p3.t1;
import com.aspose.slides.internal.p3.v4;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class e5 extends y1 {
   private final List<e5$n5> s7;
   private final com.aspose.slides.internal.e5.x8 x8;
   private final com.aspose.slides.internal.v8.u9[] t4;
   private com.aspose.slides.internal.v0.u3 q0 = null;
   private int z3 = 0;
   private int m1;
   private com.aspose.slides.internal.v8.u9 k7;
   private com.aspose.slides.internal.v8.u9 m3;
   private int z8;
   private boolean j5 = false;
   private final int[] w1 = new int[]{0, 0};
   private int r4 = 0;
   private int c4 = 0;
   private int y2 = 0;
   private List<e5$l6> y1 = new List<>();
   public k5 t2 = null;
   private int a0 = 0;
   private int d2 = 0;
   private boolean d5;
   private final j8 s3 = new h2(this, -1);

   public e5(com.aspose.slides.internal.e5.x8 var1) {
      this.x8 = var1;
      this.t4 = new com.aspose.slides.internal.v8.u9[var1.h0() + 1];
      this.s7 = new List<>();
   }

   private o0 u3(int var1) {
      return new o0(0, var1, false, this.s3, true);
   }

   private com.aspose.slides.internal.p3.f2 y1() {
      return new c4(0, null, this.n5(new h2(this, -1)), true);
   }

   @Override
   public void t4() {
      this.x8.o0();
      this.q0 = com.aspose.slides.internal.v0.t2.n5(' ', this.x8, this);
      this.m1 = this.q0.l6(' ');
      this.z8 = this.x8.c4().l6(this.q0);
      com.aspose.slides.internal.v8.c8 var1 = com.aspose.slides.internal.v8.c8.n5(this.x8.a0());
      com.aspose.slides.internal.v8.c8 var2 = com.aspose.slides.internal.v8.c8.n5(this.x8.d5(), var1, this.q0);
      this.m3 = var1.u3();
      this.k7 = com.aspose.slides.internal.v8.u9.n5(this.m1).n5(var2.u3());
      this.d5 = this.x8.y1().t2().a6() == 7;
   }

   @Override
   public void n5(com.aspose.slides.internal.r4.y4<j8> var1, t1 var2) {
      int var3 = 0;
      int var4 = 0;
      int var5 = -1;
      int var6 = 0;
      com.aspose.slides.internal.v8.u9 var7 = com.aspose.slides.internal.v8.u9.n5;
      e5$n5 var8 = null;

      while (var1.l6()) {
         h2 var9 = (h2)var1.k5();
         if (var9 != null && var9.n5() != -1) {
            e5$n5 var10 = this.s7.get_Item(var9.n5());
            if (var8 == null || var10.s7 != var8.s7 || var10.x8 != var8.x8) {
               if (var8 != null) {
                  this.n5(var8, var3, var4, var5, var6, var7, var2);
               }

               var5 = var9.n5();
               var3 = 0;
               var4 = 0;
               var7 = com.aspose.slides.internal.v8.u9.n5;
            }

            var3 += var10.u3;
            var4 += var10.a6;
            var7 = var7.n5(var10.u9);
            var6 = var9.n5();
            var8 = var10;
         }
      }

      if (var8 != null) {
         this.n5(var8, var3, var4, var5, var6, var7, var2);
      }
   }

   private void n5(e5$n5 var1, int var2, int var3, int var4, int var5, com.aspose.slides.internal.v8.u9 var6, t1 var7) {
      int var8 = var1.n5();
      if (var1.a6 == var8 && !var1.h0 && var7.k5()) {
         var6 = var6.l6(this.m3);
         var3--;
      }

      for (int var9 = var1.n5; var9 < var1.l6; var9++) {
         com.aspose.slides.internal.v8.u9 var10 = this.t4[var9 + 1];
         if (var10 != null && var10.c8()) {
            var3++;
         }
      }

      if (var7.k5() && var1.h0) {
         var6 = var6.l6(this.z8);
      }

      double var11 = var7.z8();
      int var13;
      if (var11 > 0.0) {
         var13 = com.aspose.slides.internal.v6g.k5.u3(var6.a6() * var11, 14);
      } else {
         var13 = com.aspose.slides.internal.v6g.k5.u3(var6.u3() * var11, 14);
      }

      int var14 = this.m3.l6();
      if (var11 > 0.0) {
         var14 += com.aspose.slides.internal.v6g.k5.u3(this.m3.a6() * var11, 14);
      } else {
         var14 += com.aspose.slides.internal.v6g.k5.u3(this.m3.u3() * var11, 14);
      }

      int var15 = (var14 - this.m3.l6()) * var3;
      int var16 = this.k7.l6();
      if (var2 > 0) {
         var16 += (var13 - var15) / var2;
      }

      var15 += (var16 - this.k7.l6()) * var2;
      if (var15 != var13) {
         var15 = var13;
      }

      com.aspose.slides.internal.d2.t9 var17 = new e5$k5(var6, var15, var7, var4, var5, var7.k5(), var1.s7, this).n5();
      var17.s7(var14);
      var17.t2(var16 - this.m1 - 2 * var17.k7());
      if (var7.z8() != 0.0) {
         var17.x8(this.k7.l6() - this.m1 - 2 * var17.k7());
      }

      this.u3.l6(var17);
   }

   private void n5(e5$n5 var1) {
      this.n5(this.s7.size(), var1);
   }

   private void n5(int var1, e5$n5 var2) {
      this.s7.insertItem(var1, var2);
   }

   private void a6(int var1) {
      this.s7.removeAt(var1);
   }

   public final e5$n5 k5(int var1) {
      return this.s7.get_Item(var1);
   }

   private void n5(int var1, int var2) {
      if (this.t4[var1] == null) {
         this.t4[var1] = com.aspose.slides.internal.v8.u9.n5(var2);
      } else {
         this.t4[var1] = this.t4[var1].l6(var2);
      }
   }

   private static boolean n5(char var0) {
      return var0 == ' ' || com.aspose.slides.internal.v3.l6.a6(var0) || com.aspose.slides.internal.v3.l6.u3(var0);
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(t1 var1, int var2) {
      this.a0 = var1.w1();
      this.d2 = var1.r4();
      this.t2 = var1.j5();
      List var3 = new List();
      v4 var4 = new com.aspose.slides.internal.p3.d5();
      e5$n5 var5 = null;
      e5$n5 var6 = null;
      var3.addItem(var4);
      com.aspose.slides.internal.v4.h0 var7 = com.aspose.slides.internal.v6g.k5.n5(this.h0().y4(), com.aspose.slides.internal.v4.h0.class);
      int var8 = 97;
      if (var7 != null) {
         var8 = var7.g7();
      }

      com.aspose.slides.internal.s0.n5 var9 = new com.aspose.slides.internal.s0.n5();
      this.c4 = this.z3;
      boolean var10 = false;
      boolean var11 = false;
      char var12 = 0;
      int var13 = -1;
      int var14 = -1;

      while (this.z3 < this.x8.h0()) {
         var12 = this.x8.u3(this.z3);
         var13 = this.x8.l6(this.z3);
         boolean var15 = false;
         byte var16 = this.d5 ? 4 : var9.n5(var12);
         switch (var16) {
            case 0:
            case 1:
            case 2:
               var15 = true;
            case 3:
            case 4:
            case 5:
         }

         if (var8 == 217) {
            var15 = true;
         }

         if (var10) {
            if (var15 || n5(var12) || com.aspose.slides.internal.v3.l6.c8(var12) || var14 != -1 && var13 != var14) {
               var6 = this.n5(var2, var4, var6, var12, var15, true, var14);
            }
         } else if (var11) {
            if (var12 != ' ' || var15) {
               var6 = this.n5(var2, var4, var15, var14);
            }
         } else {
            if (var5 != null) {
               var6 = var5;
               this.n5(var2, var4, var5, var12 == ' ' || var15);
               var5 = null;
            }

            if (var16 == 5) {
               var4 = this.n5(var3, var4);
            }
         }

         if ((var12 != ' ' || this.x8.d2() != 108) && var12 != 160) {
            if (com.aspose.slides.internal.v3.l6.u3(var12) || com.aspose.slides.internal.v3.l6.k5(var12)) {
               com.aspose.slides.internal.v0.u3 var17 = com.aspose.slides.internal.v0.t2.n5(var12, this.x8, this);
               com.aspose.slides.internal.v8.u9 var18 = com.aspose.slides.internal.v8.u9.n5(var17.l6(var12));
               var5 = new e5$n5(this.z3, this.z3 + 1, 0, 0, var18, false, true, var15, var17, var13, (int[][])null, this);
               this.c4 = this.z3 + 1;
            } else if (com.aspose.slides.internal.v3.l6.c8(var12)) {
               this.c4 = this.z3 + 1;
            }
         } else {
            var5 = new e5$n5(this.z3, this.z3 + 1, 1, 0, this.k7, false, true, var15, this.q0, var13, (int[][])null, this);
            this.c4 = this.z3 + 1;
         }

         var10 = !n5(var12) && !com.aspose.slides.internal.v3.l6.c8(var12);
         var11 = var12 == ' ' && this.x8.d2() != 108;
         var14 = var13;
         this.z3++;
      }

      if (var10) {
         this.n5(var2, var4, var6, var12, false, false, var14);
      } else if (var11) {
         this.n5(var2, var4, !this.d5, var14);
      } else if (var5 != null) {
         this.n5(var2, var4, var5, var12 == 8203);
      } else if (com.aspose.slides.internal.v3.l6.c8(var12)) {
         this.n5(var3, var4);
      }

      if (com.aspose.slides.internal.v3.t2.<List>n5(var3).size() == 0) {
         com.aspose.slides.internal.v3.t2.l6(var3);
      }

      this.k5(true);
      return var3.size() == 0 ? null : var3;
   }

   private v4 n5(List<com.aspose.slides.internal.r4.u9> var1, v4 var2) {
      if (this.d2 != 0) {
         var2.addItem(new com.aspose.slides.internal.p3.e5(this.d2, 0, 0, this.s3, true));
      }

      var2.h0();
      var2 = new com.aspose.slides.internal.p3.d5();
      var1.addItem(var2);
      return var2;
   }

   private void n5(int var1, v4 var2, e5$n5 var3, boolean var4) {
      this.n5(var3);
      var3.t2 = var4;
      this.n5(var2, var1, var3, this.s7.size() - 1);
   }

   private e5$n5 n5(int var1, v4 var2, boolean var3, int var4) {
      e5$n5 var5 = new e5$n5(this.c4, this.z3, this.z3 - this.c4, 0, this.k7.a6(this.z3 - this.c4), false, true, var3, this.q0, var4, (int[][])null, this);
      this.n5(var5);
      this.n5(var2, var1, var5, this.s7.size() - 1);
      this.c4 = this.z3;
      return var5;
   }

   private e5$n5 n5(int var1, com.aspose.slides.internal.v0.u3 var2, e5$n5 var3, char var4, boolean var5, int var6) {
      int var7 = this.c4;
      byte var8 = 0;
      String var9 = this.x8.b3();
      String var10 = this.x8.e5();
      com.aspose.slides.internal.r4.a6 var11 = this.x8.n5(var7, var1);
      if (var9 == null || d1.a6(var9, "auto")) {
         var9 = com.aspose.slides.internal.p8.l6.s3(com.aspose.slides.internal.p8.l6.n5(var11));
      }

      if (var10 == null || d1.a6(var10, "none")) {
         var10 = "dflt";
      }

      com.aspose.slides.internal.r4.a6 var12 = var2.n5(var11, var9, var10);
      int[][] var13;
      if (var2.n5()) {
         var13 = var2.l6(var12, var9, var10);
      } else if (var2.n3()) {
         var13 = this.n5(var12, var2);
      } else {
         var13 = (int[][])null;
      }

      var12 = var2.n5(var12, var13, var9, var10);
      if (!com.aspose.slides.internal.v3.l6.n5(var12, var11)) {
         this.x8.n5(var7, var1, var12);
      }

      com.aspose.slides.internal.v8.u9 var14 = com.aspose.slides.internal.v8.u9.n5;
      int var15 = 0;

      for (int var16 = var12.h0(); var15 < var16; var15++) {
         char var17 = var12.u3(var15);
         int var18 = var2.k5(var17);
         if (var18 < 0) {
            var18 = 0;
         }

         if (var13 != null) {
            var18 += var13[var15][2];
         }

         var14 = var14.l6(var18);
      }

      return new e5$n5(var7, var1, 0, var8, var14, var5, false, var4 != 0, var2, var6, var13, this);
   }

   private int[][] n5(com.aspose.slides.internal.r4.a6 var1, com.aspose.slides.internal.v0.u3 var2) {
      int var3 = var1.h0();
      int[] var4 = new int[var3];
      int var5 = 0;
      int var6 = -1;

      while (var5 < var3) {
         char var7 = var1.u3(var5);
         if (var6 >= 0) {
            var4[var5] = var2.n5(var6, var7);
         }

         var6 = var7;
         var5++;
      }

      boolean var8 = false;

      for (int var9 = 0; var9 < var3; var9++) {
         if (var4[var9] != 0) {
            var8 = true;
            break;
         }
      }

      if (!var8) {
         return (int[][])null;
      }

      int[][] var10 = new int[var3][];

      for (int var11 = 0; var11 < var3; var11++) {
         var10[var11] = new int[4];
      }

      for (int var12 = 0; var12 < var3; var12++) {
         if (var12 > 0) {
            var10[var12 - 1][2] = var4[var12];
         }
      }

      return var10;
   }

   private e5$n5 l6(int var1, com.aspose.slides.internal.v0.u3 var2, e5$n5 var3, char var4, boolean var5, int var6) {
      boolean var7 = var2.n3();
      com.aspose.slides.internal.v8.u9 var8 = com.aspose.slides.internal.v8.u9.n5;

      for (int var9 = this.c4; var9 < var1; var9++) {
         char var10 = this.x8.u3(var9);
         int var11 = var2.l6(var10);
         var8 = var8.l6(var11);
         if (var7) {
            int var12 = 0;
            if (var9 > this.c4) {
               char var13 = this.x8.u3(var9 - 1);
               var12 = var2.n5(var13, var10);
            } else if (var3 != null && !var3.c8 && var3.l6 > 0) {
               char var18 = this.x8.u3(var3.l6 - 1);
               var12 = var2.n5(var18, var10);
            }

            if (var12 != 0) {
               this.n5(var9, var12);
               var8 = var8.l6(var12);
            }
         }
      }

      if (var7 && var4 != 0 && !n5(var4) && var1 > 0 && var5) {
         int var15 = var2.n5(this.x8.u3(var1 - 1), var4);
         if (var15 != 0) {
            this.n5(var1, var15);
         }
      }

      int var16 = var1 - this.c4;
      int var17 = 0;
      if (var16 != 0) {
         var17 = var16 - 1;
         if (var4 != 0 && !n5(var4) || var4 == 0) {
            var17++;
         }
      }

      var8 = var8.n5(this.m3.a6(var17));
      return new e5$n5(this.c4, var1, 0, var17, var8, var5, false, var4 != 0, var2, var6, (int[][])null, this);
   }

   private e5$n5 n5(int var1, v4 var2, e5$n5 var3, char var4, boolean var5, boolean var6, int var7) {
      int var8 = this.z3;

      while (var8 > 0 && this.x8.u3(var8 - 1) == 173) {
         var8--;
      }

      boolean var9 = var6 && this.x8.u3(var8) == 173;
      com.aspose.slides.internal.v0.u3 var10 = com.aspose.slides.internal.v0.t2.n5(this.x8, this.c4, var8, this.x8, this);
      e5$n5 var11;
      if (!var10.l6() && !var10.n5()) {
         var11 = this.l6(var8, var10, var3, var5 ? var4 : '\u0000', var9, var7);
      } else {
         var11 = this.n5(var8, var10, var3, var5 ? var4 : '\u0000', var9, var7);
      }

      var3 = var11;
      this.n5(var11);
      this.y2 = this.z3;
      this.l6(var2, var1, var11, this.s7.size() - 1);
      this.c4 = this.z3;
      return var3;
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(List<com.aspose.slides.internal.r4.u9> var1) {
      return this.l6(var1, 0);
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> l6(List<com.aspose.slides.internal.r4.u9> var1, int var2) {
      com.aspose.slides.internal.r4.u3 var3 = new com.aspose.slides.internal.r4.u3(var1);
      com.aspose.slides.internal.p3.i1 var4 = (com.aspose.slides.internal.p3.i1)((com.aspose.slides.internal.r4.u9)var3.k5()).n5();
      j8 var5 = var4.k7();
      h2 var6 = (h2)var5.l6(var2);
      int var7 = var6.n5();
      if (var7 > -1) {
         e5$n5 var8 = this.k5(var7);
         var8.a6++;
         var8.n5(this.m3);
         if (d1.u3("-/", this.x8.u3(this.y2 - 1)) >= 0) {
            var3 = new com.aspose.slides.internal.r4.u3(var1, var1.size());
            var3.l6(new o0(0, 50, true, this.s3, false));
            var3.l6(new com.aspose.slides.internal.p3.e5(this.m3, this.s3, false));
         } else if (this.m3.h0()) {
            try {
               var3.n5(new c4(var8.u9.l6(), this.t2, var5, false));
            } catch (RuntimeException var10) {
               throw var10;
            }
         } else {
            var3.k5();
            var3.k5();
            var3.n5(new com.aspose.slides.internal.p3.e5(this.m3.a6(var8.a6), this.s3, true));
         }
      }

      return var1;
   }

   @Override
   public void n5(j8 var1, q0 var2) {
      e5$n5 var3 = this.k5(((h2)var1).n5() + this.r4);
      int var4 = var3.n5;
      boolean var5 = true;
      com.aspose.slides.internal.v0.u3 var6 = var3.s7;

      while (var4 < var3.l6) {
         com.aspose.slides.internal.v8.u9 var7 = com.aspose.slides.internal.v8.u9.n5;
         int var8 = var4 + var2.n5();
         boolean var9;
         if (var2.l6() && var8 <= var3.l6) {
            var9 = true;
         } else {
            var9 = false;
            var8 = var3.l6;
         }

         var2.n5(var8 - var4);

         for (int var10 = var4; var10 < var8; var10++) {
            char var11 = this.x8.u3(var10);
            var7 = var7.l6(var6.l6(var11));
            if (var10 < var8) {
               com.aspose.slides.internal.v8.u9 var12 = this.t4[var10 + 1];
               if (var10 == var8 - 1 && var9) {
                  var12 = null;
               }

               if (var12 != null) {
                  var7 = var7.n5(var12);
               }
            }
         }

         boolean var14 = var8 == var3.l6 && var3.a6 < var3.n5();
         int var15 = var14 ? var8 - var4 - 1 : var8 - var4;
         var7 = var7.n5(this.m3.a6(var15));
         if (!var5 || var8 != var3.l6 || var9) {
            this.y1.addItem(new e5$l6(new e5$n5(var4, var8, 0, var15, var7, var9, false, false, var6, -1, (int[][])null, this), ((h2)var1).n5() + this.r4));
            var5 = false;
         }

         var4 = var8;
      }

      this.j5 |= !var5;
   }

   @Override
   public boolean l6(List<com.aspose.slides.internal.r4.u9> var1) {
      return this.k5(var1, 0);
   }

   @Override
   public boolean k5(List<com.aspose.slides.internal.r4.u9> var1, int var2) {
      this.k5(false);
      if (var1.size() == 0) {
         return false;
      }

      h2 var3 = null;
      h2 var4 = null;
      com.aspose.slides.internal.r4.u3 var5 = new com.aspose.slides.internal.r4.u3(var1);

      while (var5.l6()) {
         j8 var6 = ((com.aspose.slides.internal.p3.i1)((com.aspose.slides.internal.r4.u9)var5.k5()).n5()).k7();
         var3 = (h2)var6.l6(var2);
         if (var3 != null && var3.n5() != -1) {
            break;
         }
      }

      var5 = new com.aspose.slides.internal.r4.u3(var1, var1.size());

      while (var5.u3()) {
         j8 var13 = ((com.aspose.slides.internal.p3.i1)((com.aspose.slides.internal.r4.u9)var5.a6()).n5()).k7();
         var4 = (h2)var13.l6(var2);
         if (var4 != null && var4.n5() != -1) {
            break;
         }
      }

      this.w1[0] = (var3 != null ? var3.n5() : -1) + this.r4;
      this.w1[1] = (var4 != null ? var4.n5() : -1) + this.r4;
      int var14 = 0;
      int var7 = 0;
      if (this.y1.size() != 0) {
         int var8 = -1;
         com.aspose.slides.internal.r4.u3 var9 = new com.aspose.slides.internal.r4.u3<>(this.y1);

         while (var9.l6()) {
            e5$l6 var10 = (e5$l6)var9.k5();
            int var11;
            if (var10.l6 == var8) {
               var14++;
               var11 = var10.l6 + var14 - var7;
            } else {
               var7++;
               var14++;
               var8 = var10.l6;
               var11 = var10.l6 + var14 - var7;
               this.a6(var11);
            }

            this.n5(var11, var10.n5);
         }

         this.y1.clear();
      }

      this.w1[1] = this.w1[1] + (var14 - var7);
      this.r4 += var14 - var7;
      return this.j5;
   }

   @Override
   public List<com.aspose.slides.internal.r4.u9> n5(List<com.aspose.slides.internal.r4.u9> var1, int var2) {
      if (this.m3()) {
         return null;
      }

      List var3 = new List();

      while (this.w1[0] <= this.w1[1]) {
         e5$n5 var4 = this.k5(this.w1[0]);
         if (var4.u3 == 0) {
            this.l6(var3, var2, var4, this.w1[0]);
         } else {
            this.n5(var3, var2, var4, this.w1[0]);
         }

         this.w1[0]++;
      }

      this.k5(this.w1[0] == this.s7.size() - 1);
      return var3;
   }

   @Override
   public String a6(j8 var1) {
      int var2 = ((h2)var1).n5() + this.r4;
      if (var2 == -1) {
         return d1.n5;
      }

      e5$n5 var3 = this.k5(var2);
      a5 var4 = new a5(var3.n5());

      for (int var5 = var3.n5; var5 < var3.l6; var5++) {
         var4.n5(this.x8.u3(var5));
      }

      return var4.toString();
   }

   private void n5(List<com.aspose.slides.internal.r4.u9> var1, int var2, e5$n5 var3, int var4) {
      h2 var5 = new h2(this, var4);
      if (!var3.t2) {
         if (var2 == 70) {
            var1.addItem(this.y1());
            var1.addItem(this.u3(1000));
            var1.addItem(new com.aspose.slides.internal.p3.e5(var3.u9, var5, false));
         } else {
            var1.addItem(new c4(var3.u9.l6(), this.t2, var5, true));
         }
      } else if (this.x8.u3(var3.n5) == ' ' && this.x8.d2() != 108) {
         var1.addRange(this.n5(var2, var3, var5, var3.u9.l6(), this.s3, 0, false));
      } else {
         var1.addRange(this.n5(var2, var3, this.s3, 0, var5, var3.u9.l6(), true));
      }
   }

   private List<com.aspose.slides.internal.r4.u9> n5(int var1, e5$n5 var2, j8 var3, int var4, j8 var5, int var6, boolean var7) {
      List var8 = new List();
      switch (var1) {
         case 23:
            var8.addItem(new com.aspose.slides.internal.p3.e5(this.d2, 10008, 0, this.s3, false));
            var8.addItem(this.u3(0));
            var8.addItem(new com.aspose.slides.internal.p3.e5(var4 - (this.a0 + this.d2), -20016, 0, var3, false));
            var8.addItem(this.y1());
            var8.addItem(this.u3(1000));
            var8.addItem(new com.aspose.slides.internal.p3.e5(this.a0 + var6, 10008, 0, var5, false));
            break;
         case 39:
         case 135:
            if (!var7 && this.a0 == 0 && this.d2 == 0) {
               com.aspose.slides.internal.p3.e5 var12 = new com.aspose.slides.internal.p3.e5(0, 10008, 0, this.s3, false);
               var8.addItem(var12);
               var8.addItem(this.u3(0));
               var12 = new com.aspose.slides.internal.p3.e5(var2.u9.l6(), -10008, 0, var3, false);
               var8.addItem(var12);
            } else {
               com.aspose.slides.internal.p3.e5 var9 = new com.aspose.slides.internal.p3.e5(this.d2, 10008, 0, this.s3, false);
               var8.addItem(var9);
               var8.addItem(this.u3(0));
               var9 = new com.aspose.slides.internal.p3.e5(var4 - (this.a0 + this.d2), -10008, 0, var3, false);
               var8.addItem(var9);
               var8.addItem(this.y1());
               var8.addItem(this.u3(1000));
               var9 = new com.aspose.slides.internal.p3.e5(this.a0 + var6, 0, 0, var5, false);
               var8.addItem(var9);
            }
            break;
         case 70:
            var8.addRange(this.n5(var2, var3, var4, var5, var6, var7, var2.u9.u3()));
            break;
         default:
            var8.addRange(this.n5(var2, var3, var4, var5, var6, var7, 0));
      }

      return var8;
   }

   private List<com.aspose.slides.internal.r4.u9> n5(e5$n5 var1, j8 var2, int var3, j8 var4, int var5, boolean var6, int var7) {
      int var8 = var1.u9.a6();
      List var9 = new List();
      if (!var6 && this.a0 == 0 && this.d2 == 0) {
         var9.addItem(new com.aspose.slides.internal.p3.e5(var1.u9.l6(), var8, var7, var2, false));
      } else {
         var9.addItem(new com.aspose.slides.internal.p3.e5(this.d2, 0, 0, this.s3, false));
         var9.addItem(this.u3(0));
         var9.addItem(new com.aspose.slides.internal.p3.e5(var3 - (this.a0 + this.d2), var8, var7, var2, false));
         var9.addItem(this.y1());
         var9.addItem(this.u3(1000));
         var9.addItem(new com.aspose.slides.internal.p3.e5(this.a0 + var5, 0, 0, var4, false));
      }

      return var9;
   }

   private void l6(List<com.aspose.slides.internal.r4.u9> var1, int var2, e5$n5 var3, int var4) {
      h2 var5 = new h2(this, var4);
      boolean var6 = var3.t2 && !var3.h0;
      if (this.m3.h0()) {
         var1.addItem(new c4(var6 ? var3.u9.l6() - this.m3.l6() : var3.u9.l6(), this.t2, this.n5(var5), false));
      } else {
         int var7 = var6 ? var3.a6 - 1 : var3.a6;
         var1.addItem(new c4(var3.u9.l6() - var3.a6 * this.m3.l6(), this.t2, this.n5(var5), false));
         var1.addItem(this.u3(1000));
         var1.addItem(new com.aspose.slides.internal.p3.e5(this.m3.a6(var7), this.s3, true));
         var1.addItem(this.y1());
      }

      if (var3.h0) {
         com.aspose.slides.internal.v8.u9 var8 = null;
         if (var3.l6 < this.x8.h0()) {
            var8 = this.t4[var3.l6];
         }

         this.n5(var1, var2, this.z8, var8, var3.t2 && var3.h0);
      } else if (var6) {
         this.n5(var1, var2, 0, this.m3, true);
      }
   }

   private void n5(List<com.aspose.slides.internal.r4.u9> var1, int var2, int var3, com.aspose.slides.internal.v8.u9 var4, boolean var5) {
      if (var4 == null) {
         var4 = com.aspose.slides.internal.v8.u9.n5;
      }

      switch (var2) {
         case 23:
            var1.addItem(this.u3(1000));
            var1.addItem(new com.aspose.slides.internal.p3.e5(this.d2, 10008, 0, this.s3, true));
            var1.addItem(new o0(this.z8, var5 ? 1 : 50, !var5, this.s3, false));
            var1.addItem(new com.aspose.slides.internal.p3.e5(-(this.d2 + this.a0), -20016, 0, this.s3, false));
            var1.addItem(this.y1());
            var1.addItem(this.u3(1000));
            var1.addItem(new com.aspose.slides.internal.p3.e5(this.a0, 10008, 0, this.s3, true));
            break;
         case 39:
         case 135:
            if (this.a0 == 0 && this.d2 == 0) {
               var1.addItem(this.u3(1000));
               var1.addItem(new com.aspose.slides.internal.p3.e5(0, 10008, 0, this.s3, false));
               var1.addItem(new o0(var3, var5 ? 1 : 50, !var5, this.s3, false));
               var1.addItem(new com.aspose.slides.internal.p3.e5(var4.l6(), -10008, 0, this.s3, false));
            } else {
               var1.addItem(this.u3(1000));
               var1.addItem(new com.aspose.slides.internal.p3.e5(this.d2, 10008, 0, this.s3, false));
               var1.addItem(new o0(var3, var5 ? 1 : 50, !var5, this.s3, false));
               var1.addItem(new com.aspose.slides.internal.p3.e5(var4.l6() - (this.a0 + this.d2), -10008, 0, this.s3, false));
               var1.addItem(this.y1());
               var1.addItem(this.u3(1000));
               var1.addItem(new com.aspose.slides.internal.p3.e5(this.a0, 0, 0, this.s3, false));
            }
            break;
         default:
            if (this.a0 == 0 && this.d2 == 0) {
               var1.addItem(new o0(var3, var5 ? 1 : 50, !var5, this.s3, false));
               if (var4.u9()) {
                  var1.addItem(new com.aspose.slides.internal.p3.e5(var4, this.s3, false));
               }
            } else {
               var1.addItem(this.u3(1000));
               var1.addItem(new com.aspose.slides.internal.p3.e5(this.d2, 0, 0, this.s3, false));
               var1.addItem(new o0(var3, var5 ? 1 : 50, !var5, this.s3, false));
               if (var4.u9()) {
                  var1.addItem(new com.aspose.slides.internal.p3.e5(var4.l6() - (this.a0 + this.d2), var4.a6(), var4.u3(), this.s3, false));
               } else {
                  var1.addItem(new com.aspose.slides.internal.p3.e5(-(this.a0 + this.d2), 0, 0, this.s3, false));
               }

               var1.addItem(this.y1());
               var1.addItem(this.u3(1000));
               var1.addItem(new com.aspose.slides.internal.p3.e5(this.a0, 0, 0, this.s3, false));
            }
      }
   }

   @Override
   public String toString() {
      return d1.n5(super.toString(), "{", "chars = '", com.aspose.slides.internal.v3.l6.n5(this.x8.j5().toString()), "'", ", len = ", a3.l6(this.x8.h0()), "}");
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.e5.x8 n5(e5 var0) {
      return var0.x8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v8.u9[] l6(e5 var0) {
      return var0.t4;
   }
}
