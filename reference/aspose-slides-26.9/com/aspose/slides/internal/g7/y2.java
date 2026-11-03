package com.aspose.slides.internal.g7;

public class y2 extends v1 {
   private final p6 n5;
   private final m1 l6 = new m1();
   private final v0 k5;
   private final y8 u3;
   private final double[] a6;
   private final double[] u9;
   private com.aspose.slides.ms.System.i9 h0;
   private int c8;
   private final g5 t2;
   private static final b9 s7 = new b9();
   private final k6 x8;
   private static final com.aspose.slides.internal.v6g.u9 n3 = new com.aspose.slides.internal.v6g.u9(
      "hstem",
      "vstem",
      "vmoveto",
      "rlineto",
      "hlineto",
      "vlineto",
      "rrcurveto",
      "callsubr",
      "return",
      "endchar",
      "hstemhm",
      "hintmask",
      "cntrmask",
      "rmoveto",
      "hmoveto",
      "vstemhm",
      "rcurveline",
      "rlinecurve",
      "vvcurveto",
      "hhcurveto",
      "callgsubr",
      "vhcurveto",
      "hvcurveto",
      "and",
      "or",
      "not",
      "abs",
      "add",
      "sub",
      "div",
      "neg",
      "eq",
      "drop",
      "put",
      "get",
      "ifelse",
      "random",
      "mul",
      "sqrt",
      "dup",
      "exch",
      "index",
      "roll",
      "hflex",
      "flex",
      "hflex1",
      "flex1",
      "pickupyourfreakingmask"
   );

   public y2(w0 var1, v0 var2, y8 var3, k6 var4) {
      super(var1);
      this.k5 = var2;
      this.u3 = var3;
      this.x8 = var4;
      this.j9().n5().n5(new g3(0.0, 0.0));
      this.n5 = new p6(var4);
      this.a6 = new double[48];
      this.u9 = new double[32];
      this.c8 = 0;
      this.t2 = new g5(this.z6());
   }

   public final k6 n5() {
      return this.x8;
   }

   @Override
   public void n5(String var1) {
      switch (n3.n5(var1)) {
         case 0:
            this.k7();
            break;
         case 1:
            this.m3();
            break;
         case 2:
            this.u9();
            break;
         case 3:
            this.h0();
            break;
         case 4:
            this.c8();
            break;
         case 5:
            this.t2();
            break;
         case 6:
            this.s7();
            break;
         case 7:
            this.a3();
            break;
         case 8:
            this.x9();
            break;
         case 9:
            this.l6();
            break;
         case 10:
            this.z8();
            break;
         case 11:
            this.w1();
            break;
         case 12:
            this.r4();
            break;
         case 13:
            this.u3();
            break;
         case 14:
            this.a6();
            break;
         case 15:
            this.j5();
            break;
         case 16:
            this.y4();
            break;
         case 17:
            this.e2();
            break;
         case 18:
            this.z1();
            break;
         case 19:
            this.x8();
            break;
         case 20:
            this.p3();
            break;
         case 21:
            this.t9();
            break;
         case 22:
            this.n3();
            break;
         case 23:
            this.t1();
            break;
         case 24:
            this.a5();
            break;
         case 25:
            this.h2();
            break;
         case 26:
            this.y2();
            break;
         case 27:
            this.y1();
            break;
         case 28:
            this.a0();
            break;
         case 29:
            this.d2();
            break;
         case 30:
            this.d5();
            break;
         case 31:
            this.v0();
            break;
         case 32:
            this.i1();
            break;
         case 33:
            this.v4();
            break;
         case 34:
            this.u6();
            break;
         case 35:
            this.f0();
            break;
         case 36:
            this.s3();
            break;
         case 37:
            this.p8();
            break;
         case 38:
            this.f2();
            break;
         case 39:
            this.z7();
            break;
         case 40:
            this.e5();
            break;
         case 41:
            this.b3();
            break;
         case 42:
            this.o0();
            break;
         case 43:
            this.q0();
            break;
         case 44:
            this.t4();
            break;
         case 45:
            this.z3();
            break;
         case 46:
            this.m1();
            break;
         case 47:
            this.c4();
      }
   }

   public final void l6() {
      this.y0();
      if (this.z6().n5() >= 4) {
         this.k5();
      }

      if (this.z6().n5() == 1) {
         this.n5(this.z6().u3());
      }

      this.n5.n5();
   }

   public final void k5() {
      int var1 = com.aspose.slides.internal.v6g.k5.u3(this.z6().u3(), 14);
      int var2 = com.aspose.slides.internal.v6g.k5.u3(this.z6().u3(), 14);
      double var3 = this.z6().u3();
      double var5 = this.z6().u3();
      if (!this.k5.u3().containsItem(var1) && !this.k5.u3().containsItem(var2)) {
         this.k5.u3().addItem(var1);
         this.k5.u3().addItem(var2);

         try {
            k3 var7 = new k3(s7.n5((char)var1));
            k6 var8 = this.k5.n5(var7);
            k3 var9 = new k3(s7.n5((char)var2));
            k6 var10 = this.k5.n5(var9);
            double var11 = 0.0;
            double var13 = 0.0;
            if (var10 != null) {
               var11 = this.n5().h0() + var5;
               var13 = this.n5().c8() + var3;
            }

            if (var8 != null) {
               this.n5.n5(var8.u9(), var11, var13);
            }

            if (var10 != null) {
               this.n5.n5(var10.u9());
            }
         } finally {
            this.k5.u3().removeItem(var1);
            this.k5.u3().removeItem(var2);
         }
      }
   }

   public final void u3() {
      this.y0();
      if (this.t2.l6()) {
         double var1 = this.z6().u3();
         double var3 = this.z6().u3();
         if (this.z6().n5() == 1) {
            this.n5(this.z6().u3());
         }

         f3 var5 = g0.n5(this, var3, var1);
         this.n5.n5(var5);
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }

      this.z6().l6();
   }

   public final void a6() {
      this.y0();
      if (this.t2.n5()) {
         double var1 = this.z6().u3();
         if (this.z6().n5() == 1) {
            this.n5(this.z6().u3());
         }

         f3 var3 = g0.n5(this, var1, 0.0);
         this.n5.n5(var3);
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }

      this.z6().l6();
   }

   private void n5(double var1) {
      double var3 = this.u3.l6().l6 + var1;
      this.n5.n5(var3, 0.0);
   }

   public final void u9() {
      this.y0();
      if (this.t2.n5()) {
         double var1 = this.z6().u3();
         if (this.z6().n5() == 1) {
            this.n5(this.z6().u3());
         }

         f3 var3 = g0.n5(this, 0.0, var1);
         this.n5.n5(var3);
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }

      this.z6().l6();
   }

   public final void h0() {
      this.n5(0);
      this.z6().l6();
   }

   public final void n5(int var1) {
      int var2 = this.j8();
      int var3 = 0;

      while (var3 < var2 - var1) {
         double var4 = this.a6[var3++];
         double var6 = this.a6[var3++];
         t8 var8 = g0.l6(this, var4, var6);
         this.n5.n5(var8);
      }

      if (var1 > 0) {
         for (int var10 = var1; var10 > 0; var10--) {
            if (var2 - var10 >= 0) {
               this.z6().n5(this.a6[var2 - var10]);
            }
         }
      }
   }

   public final void c8() {
      this.l6(true);
      this.z6().l6();
   }

   public final void t2() {
      this.l6(false);
      this.z6().l6();
   }

   private void l6(boolean var1) {
      int var2 = this.j8();
      int var3 = 0;

      while (var3 < var2) {
         double var4 = this.a6[var3++];
         t8 var6;
         if (var1) {
            var6 = g0.l6(this, var4, 0.0);
         } else {
            var6 = g0.l6(this, 0.0, var4);
         }

         this.n5.n5(var6);
         var1 = !var1;
      }
   }

   public final void s7() {
      this.l6(0);
      this.z6().l6();
   }

   public final void l6(int var1) {
      int var2 = this.j8();
      int var3 = 0;

      while (var3 < var2 - var1) {
         double var4 = this.a6[var3++];
         double var6 = this.a6[var3++];
         double var8 = this.a6[var3++];
         double var10 = this.a6[var3++];
         double var12 = this.a6[var3++];
         double var14 = this.a6[var3++];
         h7 var16 = g0.n5(this, var4, var6, var8, var10, var12, var14);
         this.n5.n5(var16);
      }

      if (var1 > 0) {
         for (int var22 = var1; var22 > 0; var22--) {
            if (var2 - var22 >= 0) {
               this.z6().n5(this.a6[var2 - var22]);
            }
         }
      }
   }

   public final void x8() {
      int var1 = this.j8();
      int var2 = 0;

      while (var2 < var1) {
         double var3 = 0.0;
         double var5 = 0.0;
         if (var2 == 0 && var1 % 4 > 0) {
            var3 = this.a6[var2++];
         }

         double var7 = this.a6[var2++];
         double var9 = this.a6[var2++];
         double var11 = this.a6[var2++];
         double var13 = this.a6[var2++];
         h7 var15 = g0.n5(this, var7, var3, var9, var11, var13, var5);
         this.n5.n5(var15);
      }

      this.z6().l6();
   }

   public final void n3() {
      this.n5(true);
      this.z6().l6();
   }

   public final void n5(boolean var1) {
      if (this.z6().n5() == 6) {
         double[] var2 = new double[5];

         for (int var3 = 0; var3 < var2.length; var3++) {
            var2[var3] = this.z6().u3();
         }

         this.z6().u3();

         for (int var18 = 0; var18 < var2.length; var18++) {
            this.z6().n5(var2[var18]);
         }
      }

      int var17 = this.j8();
      int var19 = 0;

      while (var19 < var17) {
         double var4;
         double var6;
         double var8;
         double var10;
         double var12;
         double var14;
         if (var1 ? var19 / 4 % 2 != 0 : var19 / 4 % 2 == 0) {
            var4 = 0.0;
            var6 = 0.0;
            var8 = this.a6[var19++];
            var10 = this.a6[var19++];
            var12 = this.a6[var19++];
            var14 = this.a6[var19++];
            if (var19 == var17 - 1 && var17 % 4 > 0) {
               var6 = this.a6[var19++];
            }
         } else {
            var8 = 0.0;
            var14 = 0.0;
            var4 = this.a6[var19++];
            var10 = this.a6[var19++];
            var12 = this.a6[var19++];
            var6 = this.a6[var19++];
            if (var19 == var17 - 1 && var17 % 4 > 0) {
               var14 = this.a6[var19++];
            }
         }

         h7 var16 = g0.n5(this, var4, var8, var10, var12, var14, var6);
         this.n5.n5(var16);
      }
   }

   public final void y4() {
      this.l6(2);
      this.n5(0);
      this.z6().l6();
   }

   public final void e2() {
      this.n5(6);
      this.l6(0);
      this.z6().l6();
   }

   public final void t9() {
      this.n5(false);
      this.z6().l6();
   }

   public final void z1() {
      int var1 = this.j8();
      int var2 = 0;

      while (var2 < var1) {
         double var3 = 0.0;
         double var5 = 0.0;
         if (var2 == 0 && var1 % 4 > 0) {
            var3 = this.a6[var2++];
         }

         double var7 = this.a6[var2++];
         double var9 = this.a6[var2++];
         double var11 = this.a6[var2++];
         double var13 = this.a6[var2++];
         h7 var15 = g0.n5(this, var3, var7, var9, var11, var5, var13);
         this.n5.n5(var15);
      }

      this.z6().l6();
   }

   public final void t4() {
      if (this.t2.n5(13)) {
         double var1 = this.z6().u3();
         double var3 = this.z6().u3();
         double var5 = this.z6().u3();
         double var7 = this.z6().u3();
         double var9 = this.z6().u3();
         double var11 = this.z6().u3();
         double var13 = this.z6().u3();
         double var15 = this.z6().u3();
         double var17 = this.z6().u3();
         double var19 = this.z6().u3();
         double var21 = this.z6().u3();
         double var23 = this.z6().u3();
         double var25 = this.z6().u3();
         h7 var27 = g0.n5(this, var25, var23, var21, var19, var17, var15);
         this.n5.n5(var27);
         var27 = g0.n5(this, var13, var11, var9, var7, var5, var3);
         this.n5.n5(var27);
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }

      this.z6().l6();
   }

   public final void q0() {
      if (this.t2.n5(7)) {
         double var1 = 0.0;
         double var3 = this.z6().u3();
         double var5 = 0.0;
         double var7 = this.z6().u3();
         double var9 = 0.0;
         double var11 = this.z6().u3();
         double var13 = 0.0;
         double var15 = this.z6().u3();
         double var17 = this.z6().u3();
         double var19 = this.z6().u3();
         double var21 = 0.0;
         double var23 = this.z6().u3();
         h7 var25 = g0.n5(this, var23, var21, var19, var17, var15, var13);
         this.n5.n5(var25);
         var25 = g0.n5(this, var11, var9, var7, var5, var3, var1);
         this.n5.n5(var25);
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }

      this.z6().l6();
   }

   public final void z3() {
      if (this.t2.n5(9)) {
         double var1 = 0.0;
         double var3 = this.z6().u3();
         double var5 = this.z6().u3();
         double var7 = this.z6().u3();
         double var9 = 0.0;
         double var11 = this.z6().u3();
         double var13 = 0.0;
         double var15 = this.z6().u3();
         double var17 = this.z6().u3();
         double var19 = this.z6().u3();
         double var21 = this.z6().u3();
         double var23 = this.z6().u3();
         h7 var25 = g0.n5(this, var23, var21, var19, var17, var15, var13);
         this.n5.n5(var25);
         var25 = g0.n5(this, var11, var9, var7, var5, var3, var1);
         this.n5.n5(var25);
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }

      this.z6().l6();
   }

   public final void m1() {
      double var1 = this.z6().u3();
      if (this.t2.n5(10)) {
         double var3 = 0.0;
         double var5 = 0.0;
         double var7 = this.z6().u3();
         double var9 = this.z6().u3();
         double var11 = this.z6().u3();
         double var13 = this.z6().u3();
         double var15 = this.z6().u3();
         double var17 = this.z6().u3();
         double var19 = this.z6().u3();
         double var21 = this.z6().u3();
         double var23 = this.z6().u3();
         double var25 = this.z6().u3();
         double var27 = var25 + var21 + var17 + var13 + var9;
         double var29 = var23 + var19 + var15 + var11 + var7;
         if (com.aspose.slides.ms.System.q1.n5(var27) > com.aspose.slides.ms.System.q1.n5(var29)) {
            var5 = var1;
         } else {
            var3 = var1;
         }

         h7 var31 = g0.n5(this, var25, var23, var21, var19, var17, var15);
         this.n5.n5(var31);
         var31 = g0.n5(this, var13, var11, var9, var7, var5, var3);
         this.n5.n5(var31);
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }

      this.z6().l6();
   }

   public final void k7() {
      if (this.t2.l6()) {
         double var1 = this.z6().u3();
         double var3 = this.z6().u3();
         double var5 = 0.0;
         double var7 = 0.0;

         while (this.z6().n5() >= 2) {
            var7 = this.z6().u3();
            var5 = this.z6().u3();
         }
      }

      if (this.z6().n5() == 1) {
         this.n5(this.z6().u3());
      }

      this.z6().l6();
   }

   public final void m3() {
      if (this.t2.l6()) {
         double var1 = this.z6().u3();
         double var3 = this.z6().u3();
         double var5 = 0.0;
         double var7 = 0.0;

         while (this.z6().n5() >= 2) {
            var7 = this.z6().u3();
            var5 = this.z6().u3();
         }
      }

      if (this.z6().n5() == 1) {
         this.n5(this.z6().u3());
      }

      this.z6().l6();
   }

   public final void z8() {
      if (this.t2.l6()) {
         double var1 = this.z6().u3();
         double var3 = this.z6().u3();
         double var5 = 0.0;
         double var7 = 0.0;
         this.c8++;

         while (this.z6().n5() >= 2) {
            var5 = this.z6().u3();
            var7 = this.z6().u3();
            this.c8++;
         }
      }

      if (this.z6().n5() == 1) {
         this.n5(this.z6().u3());
      }

      this.z6().l6();
   }

   public final void j5() {
      if (this.t2.l6()) {
         double var1 = this.z6().u3();
         double var3 = this.z6().u3();
         double var5 = 0.0;
         double var7 = 0.0;
         this.c8++;

         while (this.z6().n5() >= 2) {
            var5 = this.z6().u3();
            var7 = this.z6().u3();
            this.c8++;
         }
      }

      if (this.z6().n5() == 1) {
         this.n5(this.z6().u3());
      }

      this.z6().l6();
   }

   public final void w1() {
      while (this.z6().n5() > 1) {
         this.z6().u3();
         this.z6().u3();
         this.c8++;
      }

      if (this.z6().n5() == 1) {
         this.n5(this.z6().u3());
      }

      this.z6().l6();
      this.z6().n5((double)(this.c8 + 7 >> 3));
   }

   public final void r4() {
      while (this.z6().n5() > 1) {
         this.z6().u3();
         this.z6().u3();
         this.c8++;
      }

      if (this.z6().n5() == 1) {
         this.n5(this.z6().u3());
      }

      this.z6().l6();
      this.z6().n5((double)(this.c8 + 7 >> 3));
   }

   public final void c4() {
      this.z6().l6();
   }

   public final void y2() {
      if (this.t2.n5()) {
         double var1 = this.z6().u3();
         this.z6().n5(e2.n5(var1));
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }
   }

   public final void y1() {
      if (this.t2.l6()) {
         double var1 = this.z6().u3();
         double var3 = this.z6().u3();
         double var5 = e2.n5(var3, var1);
         this.z6().n5(var5);
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }
   }

   public final void a0() {
      if (this.t2.l6()) {
         double var1 = this.z6().u3();
         double var3 = this.z6().u3();
         double var5 = e2.l6(var3, var1);
         this.z6().n5(var5);
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }
   }

   public final void d2() {
      if (this.t2.l6()) {
         double var1 = this.z6().u3();
         double var3 = this.z6().u3();
         double var5 = e2.k5(var3, var1);
         this.z6().n5(var5);
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }
   }

   public final void d5() {
      if (this.t2.n5()) {
         double var1 = this.z6().u3();
         double var3 = e2.l6(var1);
         this.z6().n5(var3);
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }
   }

   public final void s3() {
      if (this.h0 == null) {
         this.h0 = new com.aspose.slides.ms.System.i9();
      }

      double var1 = 0.0;

      while (var1 == 0.0) {
         var1 = this.h0.l6();
      }

      this.z6().n5(var1);
   }

   public final void p8() {
      if (this.t2.l6()) {
         double var1 = this.z6().u3();
         double var3 = this.z6().u3();
         double var5 = e2.u3(var3, var1);
         this.z6().n5(var5);
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }
   }

   public final void f2() {
      if (this.t2.n5()) {
         double var1 = this.z6().u3();
         double var3 = e2.k5(var1);
         this.z6().n5(var3);
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }
   }

   public final void i1() {
      this.z6().u3();
   }

   public final void e5() {
      double var1 = this.z6().u3();
      double var3 = this.z6().u3();
      this.z6().n5(var1);
      this.z6().n5(var3);
   }

   public final void b3() {
      long var1 = com.aspose.slides.internal.v6g.k5.u9(this.z6().u3(), 14);
      if (var1 < this.z6().n5()) {
         int var3 = this.j8();
         double var4 = this.a6[(int)(var3 - 1 - var1)];

         for (double var9 : this.a6) {
            this.z6().n5(var9);
         }

         this.z6().n5(var4);
      } else {
         this.z6().n5(0.0);
      }
   }

   public final void o0() {
      long var1 = com.aspose.slides.internal.v6g.k5.u9(this.z6().u3(), 14);
      long var3 = com.aspose.slides.internal.v6g.k5.u9(this.z6().u3(), 14);
      if (var3 > 0L) {
         int var5 = this.j8();
         long var6 = var5 - 1 - var3;

         for (long var8 = 0L; var8 < var6; var8++) {
            this.z6().n5(this.a6[(int)var8]);
         }

         if (var1 < 0L) {
            for (long var10 = var6 + (int)com.aspose.slides.ms.System.q1.n5(var1) + 1L; var10 < var5; var10++) {
               this.z6().n5(this.a6[(int)var10]);
            }

            for (long var11 = var6 + 1L; var11 < var6 + (int)com.aspose.slides.ms.System.q1.n5(var1) + 1L; var11++) {
               this.z6().n5(this.a6[(int)var11]);
            }
         } else {
            for (long var12 = var5 - 1 - var1; var12 < var5; var12++) {
               this.z6().n5(this.a6[(int)var12]);
            }

            for (long var13 = var6 + 1L; var13 < var5 - 1 - var1; var13++) {
               this.z6().n5(this.a6[(int)var13]);
            }
         }
      }
   }

   public final void z7() {
      double var1 = this.z6().u3();
      this.z6().n5(var1);
      this.z6().n5(var1);
   }

   public final void v4() {
      if (this.t2.n5()) {
         int var1 = com.aspose.slides.internal.v6g.k5.u3(this.z6().u3(), 14);
         double var2 = this.z6().u3();
         this.u9[var1] = var2;
      }
   }

   public final void u6() {
      if (this.t2.n5()) {
         int var1 = com.aspose.slides.internal.v6g.k5.u3(this.z6().u3(), 14);
         this.z6().n5(this.u9[var1]);
      }
   }

   public final void t1() {
      if (this.t2.l6()) {
         double var1 = this.z6().u3();
         double var3 = this.z6().u3();
         if (var3 != 0.0 && var1 != 0.0) {
            this.z6().n5(1.0);
         } else {
            this.z6().n5(0.0);
         }
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }
   }

   public final void a5() {
      if (this.t2.l6()) {
         double var1 = this.z6().u3();
         double var3 = this.z6().u3();
         if (var3 == 0.0 && var1 == 0.0) {
            this.z6().n5(0.0);
         } else {
            this.z6().n5(1.0);
         }
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }
   }

   public final void h2() {
      if (this.t2.n5()) {
         double var1 = this.z6().u3();
         if (var1 != 0.0) {
            this.z6().n5(0.0);
         } else {
            this.z6().n5(1.0);
         }
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }
   }

   public final void v0() {
      if (this.t2.l6()) {
         double var1 = this.z6().u3();
         double var3 = this.z6().u3();
         if (var3 == var1) {
            this.z6().n5(1.0);
         } else {
            this.z6().n5(0.0);
         }
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }
   }

   public final void f0() {
      if (this.t2.n5(4)) {
         double var1 = this.z6().u3();
         double var3 = this.z6().u3();
         double var5 = this.z6().u3();
         double var7 = this.z6().u3();
         if (var3 <= var1) {
            this.z6().n5(var7);
         } else {
            this.z6().n5(var5);
         }
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }
   }

   public final void a3() {
      if (this.t2.n5()) {
         int var1 = com.aspose.slides.internal.v6g.k5.u3(this.z6().u3(), 14);
         int var2 = 0;
         int var3 = 0;
         var1 += this.u3.k5().n5();
         if (var1 < this.u3.u3().k5()) {
            try {
               int[] var4 = new int[]{0};
               int[] var5 = new int[]{0};
               this.u3.u3().n5(var1, var4, var5);
               var2 = var4[0];
               var3 = var5[0];
               this.l6.n5(this.u3.u3().u9(), var2, var3);
               this.l6(this.l6);
            } finally {
               this.l6.n5();
            }
         }
      }
   }

   public final void p3() {
      if (this.t2.n5()) {
         int var1 = com.aspose.slides.internal.v6g.k5.u3(this.z6().u3(), 14);
         int var2 = 0;
         int var3 = 0;
         var1 += this.k5.n5().n5().n5();
         if (var1 < this.k5.n5().u9().k5()) {
            try {
               int[] var4 = new int[]{0};
               int[] var5 = new int[]{0};
               this.k5.n5().u9().n5(var1, var4, var5);
               var2 = var4[0];
               var3 = var5[0];
               this.l6.n5(this.k5.n5().u9().u9(), var2, var3);
               this.l6(this.l6);
            } finally {
               this.l6.n5();
            }
         }
      }
   }

   public final void x9() {
   }

   private int j8() {
      int var1 = this.z6().n5();

      while (this.z6().n5() > 0) {
         int var2 = this.z6().n5() - 1;
         this.a6[var2] = this.z6().u3();
      }

      return var1;
   }

   public final void y0() {
      g4 var1 = g0.n5(this);
      if (var1 != null) {
         this.n5.n5(var1);
      }
   }

   static {
      s7.n5();
   }
}
