package com.aspose.slides.internal.g7;

public class g5d extends v1 {
   private g3j n5;
   private e0 l6;
   private u4 k5;
   private m1 u3 = new m1();
   private c4i a6;
   private g5 u9;
   private static final b9 h0 = new b9();
   private final k6 c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "hstem",
      "vstem",
      "vmoveto",
      "rlineto",
      "hlineto",
      "vlineto",
      "rrcurveto",
      "closepath",
      "callsubr",
      "return",
      "hsbw",
      "endchar",
      "rmoveto",
      "hmoveto",
      "vhcurveto",
      "hvcurveto",
      "dotsection",
      "vstem3",
      "hstem3",
      "seac",
      "sbw",
      "div",
      "callothersubr",
      "pop",
      "setcurrentpoint"
   );

   public g5d(w0 var1, c4i var2, k6 var3) {
      super(var1);
      this.a6 = var2;
      this.c8 = var3;
      this.u9 = new g5(this.z6());
      this.c4();
   }

   @Override
   public void n5(String var1) {
      switch (t2.n5(var1)) {
         case 0:
            this.t4();
            break;
         case 1:
            this.z3();
            break;
         case 2:
            this.t9();
            break;
         case 3:
            this.s7();
            break;
         case 4:
            this.h0();
            break;
         case 5:
            this.e2();
            break;
         case 6:
            this.n3();
            break;
         case 7:
            this.u9();
            break;
         case 8:
            this.z8();
            break;
         case 9:
            this.w1();
            break;
         case 10:
            this.k5();
            break;
         case 11:
            this.l6();
            break;
         case 12:
            this.x8();
            break;
         case 13:
            this.c8();
            break;
         case 14:
            this.y4();
            break;
         case 15:
            this.t2();
            break;
         case 16:
            this.z1();
            break;
         case 17:
            this.m1();
            break;
         case 18:
            this.q0();
            break;
         case 19:
            this.u3();
            break;
         case 20:
            this.a6();
            break;
         case 21:
            this.k7();
            break;
         case 22:
            this.m3();
            break;
         case 23:
            this.j5();
            break;
         case 24:
            this.r4();
      }
   }

   private void c4() {
      this.n5 = new g3j(this.c8);
      this.l6 = new e0(this);
      this.k5 = new u4();
      if (!this.a6.t9().n5().n5(com.aspose.slides.internal.v6g.k5.n5(f9.class))) {
         f9 var1 = new f9(this.a6.n5().h0().l6(), this.a6.n5().h0().k5(), this.a6.n5().h0().u3(), this.a6.n5().h0().a6());
         this.a6.t9().n5().n5(var1);
      }
   }

   public final k6 n5() {
      return this.c8;
   }

   public final void l6() {
      this.n5.l6();
   }

   public final void k5() {
      if (this.u9.l6()) {
         double var1 = this.z6().u3();
         double var3 = this.z6().u3();
         this.c4();
         this.j9().n5().n5(new g3(var3, 0.0));
         this.n5.n5(var3, 0.0);
         this.n5.l6(var1, 0.0);
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }
   }

   public final void u3() {
      double var1 = this.z6().u3();
      double var3 = this.z6().u3();
      double var5 = this.z6().u3();
      double var7 = this.z6().u3();
      double var9 = this.z6().u3();
      if (!this.a6.l6().containsItem(var1) && !this.a6.l6().containsItem(var3)) {
         this.a6.l6().addItem(var1);
         this.a6.l6().addItem(var3);

         try {
            k3 var11 = new k3(h0.n5(com.aspose.slides.internal.v6g.k5.x8(var1, 14)));
            k6 var12 = this.a6.n5(var11);
            k3 var13 = new k3(h0.n5(com.aspose.slides.internal.v6g.k5.x8(var3, 14)));
            k6 var14 = this.a6.n5(var13);
            double var15 = 0.0;
            double var17 = 0.0;
            if (var14 != null) {
               var15 = this.n5().h0() + var7 - var9;
               var17 = this.n5().c8() + var5;
            }

            if (var12 != null) {
               this.n5.n5(var12.u9(), var15, var17);
            }

            if (var14 != null) {
               this.n5.n5(var14.u9());
            }
         } finally {
            this.a6.l6().removeItem(var1);
            this.a6.l6().removeItem(var3);
         }
      }
   }

   public final void a6() {
      if (this.u9.n5(4)) {
         double var1 = this.z6().u3();
         double var3 = this.z6().u3();
         double var5 = this.z6().u3();
         this.c4();
         this.j9().n5().n5(new g3(this.z6().u3(), var5));
         this.n5.n5(this.z6().u3(), var5);
         this.n5.l6(var3, var1);
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }
   }

   public final void u9() {
      g4 var1 = g0.n5(this);
      this.n5.n5(var1);
   }

   public final void h0() {
      if (this.u9.n5()) {
         double var1 = this.z6().u3();
         t8 var3 = g0.l6(this, var1, 0.0);
         this.n5.n5(var3);
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }
   }

   public final void c8() {
      if (this.u9.n5()) {
         double var1 = this.z6().u3();
         if (!this.l6.n5()) {
            f3 var3 = g0.n5(this, var1, 0.0);
            this.n5.n5(var3);
         } else {
            this.l6.n5(var1, 0.0);
         }
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }
   }

   public final void t2() {
      if (this.u9.n5(4)) {
         double var1 = this.z6().u3();
         double var3 = this.z6().u3();
         double var5 = this.z6().u3();
         double var7 = this.z6().u3();
         h7 var9 = g0.n5(this, var7, 0.0, var5, var3, 0.0, var1);
         this.n5.n5(var9);
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }
   }

   public final void s7() {
      if (this.u9.l6()) {
         double var1 = this.z6().u3();
         double var3 = this.z6().u3();
         t8 var5 = g0.l6(this, var3, var1);
         this.n5.n5(var5);
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }
   }

   public final void x8() {
      if (this.u9.l6()) {
         double var1 = this.z6().u3();
         double var3 = this.z6().u3();
         if (!this.l6.n5()) {
            f3 var5 = g0.n5(this, var3, var1);
            this.n5.n5(var5);
         } else {
            this.l6.n5(var3, var1);
         }
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }
   }

   public final void n3() {
      if (this.u9.n5(6)) {
         double var1 = this.z6().u3();
         double var3 = this.z6().u3();
         double var5 = this.z6().u3();
         double var7 = this.z6().u3();
         double var9 = this.z6().u3();
         double var11 = this.z6().u3();
         h7 var13 = g0.n5(this, var11, var9, var7, var5, var3, var1);
         this.n5.n5(var13);
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }
   }

   public final void y4() {
      if (this.u9.n5(4)) {
         double var1 = this.z6().u3();
         double var3 = this.z6().u3();
         double var5 = this.z6().u3();
         double var7 = this.z6().u3();
         h7 var9 = g0.n5(this, 0.0, var7, var5, var3, var1, 0.0);
         this.n5.n5(var9);
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }
   }

   public final void e2() {
      if (this.u9.n5()) {
         double var1 = this.z6().u3();
         t8 var3 = g0.l6(this, 0.0, var1);
         this.n5.n5(var3);
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }
   }

   public final void t9() {
      if (this.u9.n5()) {
         double var1 = this.z6().u3();
         f3 var3 = g0.n5(this, 0.0, var1);
         this.n5.n5(var3);
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }
   }

   public final void z1() {
   }

   public final void t4() {
      if (this.u9.l6()) {
         double var1 = this.z6().u3();
         double var3 = this.z6().u3();
         this.n5.k5(var3, var1);
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }
   }

   public final void q0() {
      this.z6().u3();
      this.z6().u3();
      this.z6().u3();
      this.z6().u3();
      this.z6().u3();
      this.z6().u3();
   }

   public final void z3() {
      if (this.u9.l6()) {
         double var1 = this.z6().u3();
         double var3 = this.z6().u3();
         this.n5.u3(var3, var1);
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }
   }

   public final void m1() {
      this.z6().u3();
      this.z6().u3();
      this.z6().u3();
      this.z6().u3();
      this.z6().u3();
      this.z6().u3();
   }

   public final void k7() {
      if (this.u9.l6()) {
         double var1 = this.z6().u3();
         double var3 = this.z6().u3();
         double var5 = e2.k5(var3, var1);
         this.z6().n5(var5);
      } else {
         this.e9().n5("PostScript error. Wrong operands for operator (see a stack for operator name).");
      }
   }

   public final void m3() {
      if (this.u9.l6()) {
         double var1 = this.z6().u3();
         int var3 = com.aspose.slides.internal.v6g.k5.u3(var1, 14);
         double var4 = this.z6().u3();
         if (var3 == 3) {
            this.n5.k5();
         } else if (var3 == 1) {
            this.l6.k5();
         } else if (var3 != 2) {
            if (var3 == 0) {
               this.l6.u3();

               for (h7 var9 : this.l6.l6()) {
                  this.n5.n5(var9);
               }
            } else if (var3 == 12 || var3 == 13) {
               int var10 = com.aspose.slides.internal.v6g.k5.u3(var4, 14);

               for (int var11 = 0; var11 < var10; var11++) {
                  this.k5.n5(this.z6().u3());
               }

               if (var3 == 13) {
                  this.k5.k5();
                  this.n5.n5(this.k5.l6(), this.k5.n5());
               }
            }
         }
      }
   }

   public final void z8() {
      double var1 = this.z6().u3();
      int var3 = com.aspose.slides.internal.v6g.k5.u3(var1, 14);
      if (var3 < this.o5().n5.length) {
         try {
            this.u3.n5(this.o5().n5[var3].n5());
            this.l6(this.u3);
         } finally {
            this.u3.n5();
         }
      }
   }

   public final void j5() {
      double var1 = this.z6().u3();
      this.z6().n5(var1);
   }

   public final void w1() {
   }

   public final void r4() {
      this.z6().u3();
      this.z6().u3();
   }

   static {
      h0.n5();
   }
}
