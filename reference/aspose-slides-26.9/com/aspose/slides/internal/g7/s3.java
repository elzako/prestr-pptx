package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.List;

public class s3 extends v1 implements i3 {
   private com.aspose.slides.internal.z0k.e2 n5;
   private List<Integer> l6;
   private boolean k5;
   private boolean u3;
   private v3 a6;
   private a3 u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "version",
      "Notice",
      "FullName",
      "FamilyName",
      "Weight",
      "FontBBox",
      "UniqueID",
      "XUID",
      "charset",
      "Encoding",
      "CharStrings",
      "Private",
      "Copyright",
      "isFixedPitch",
      "ItalicAngle",
      "UnderlinePosition",
      "UnderlineThickness",
      "PaintType",
      "CharstringType",
      "FontMatrix",
      "StrokeWidth",
      "SyntheticBase",
      "PostScript",
      "BaseFontName",
      "BaseFontBlend",
      "ROS",
      "CIDFontVersion",
      "CIDFontRevision",
      "CIDFontType",
      "CIDCount",
      "UIDBase",
      "FDArray",
      "FDSelect",
      "FontName"
   );

   public s3(w0 var1, a3 var2, boolean var3) {
      super(var1);
      this.u9 = var2;
      this.n5 = new com.aspose.slides.internal.z0k.e2();
      this.l6 = new List<>();
      this.u3 = var3;
      this.b3();
   }

   private void b3() {
   }

   @Override
   public void n5(String var1) {
      switch (h0.n5(var1)) {
         case 0:
            this.n5();
            break;
         case 1:
            this.l6();
            break;
         case 2:
            this.k5();
            break;
         case 3:
            this.u3();
            break;
         case 4:
            this.a6();
            break;
         case 5:
            this.u9();
            break;
         case 6:
            this.h0();
            break;
         case 7:
            this.c8();
            break;
         case 8:
            this.t2();
            break;
         case 9:
            this.s7();
            break;
         case 10:
            this.x8();
            break;
         case 11:
            this.n3();
            break;
         case 12:
            this.y4();
            break;
         case 13:
            this.e2();
            break;
         case 14:
            this.t9();
            break;
         case 15:
            this.z1();
            break;
         case 16:
            this.t4();
            break;
         case 17:
            this.q0();
            break;
         case 18:
            this.z3();
            break;
         case 19:
            this.m1();
            break;
         case 20:
            this.k7();
            break;
         case 21:
            this.m3();
            break;
         case 22:
            this.z8();
            break;
         case 23:
            this.j5();
            break;
         case 24:
            this.w1();
            break;
         case 25:
            this.r4();
            break;
         case 26:
            this.c4();
            break;
         case 27:
            this.y2();
            break;
         case 28:
            this.y1();
            break;
         case 29:
            this.a0();
            break;
         case 30:
            this.d2();
            break;
         case 31:
            this.d5();
            break;
         case 32:
            this.s3();
            break;
         case 33:
            this.p8();
      }
   }

   public final void n5() {
      double var1 = this.z6().u3();
      this.u9.l6 = com.aspose.slides.internal.v6g.k5.a6(var1, 14);
   }

   public final void l6() {
      double var1 = this.z6().u3();
      this.u9.k5 = com.aspose.slides.internal.v6g.k5.a6(var1, 14);
   }

   public final void k5() {
      double var1 = this.z6().u3();
      this.u9.a6 = com.aspose.slides.internal.v6g.k5.a6(var1, 14);
   }

   public final void u3() {
      double var1 = this.z6().u3();
      this.u9.u9 = com.aspose.slides.internal.v6g.k5.a6(var1, 14);
   }

   public final void a6() {
      double var1 = this.z6().u3();
      this.u9.h0 = com.aspose.slides.internal.v6g.k5.a6(var1, 14);
   }

   public final void u9() {
      double var1 = this.z6().u3();
      double var3 = this.z6().u3();
      double var5 = this.z6().u3();
      double var7 = this.z6().u3();
      this.u9.t4 = new z9(var7, var5, var3, var1);
   }

   public final void h0() {
      double var1 = this.z6().u3();
      this.u9.z1 = com.aspose.slides.internal.v6g.k5.u9(var1, 14);
   }

   public final void c8() {
      this.u9.z3 = new double[this.z6().n5()];

      for (int var1 = this.u9.z3.length - 1; var1 >= 0; var1--) {
         this.u9.z3[var1] = this.z6().u3();
      }
   }

   public final void t2() {
      double var1 = this.z6().u3();
      this.u9.m1 = com.aspose.slides.internal.v6g.k5.u9(var1, 14);
      if (this.u3) {
         byte[] var3 = f2.n5(com.aspose.slides.internal.v6g.k5.u3(var1, 14) + this.e5().l6);
         this.f2().write(var3, 0, var3.length);
         this.f2().writeByte((byte)15);
         this.n5(true);
      }
   }

   public final void s7() {
      double var1 = this.z6().u3();
      this.u9.k7 = com.aspose.slides.internal.v6g.k5.u9(var1, 14);
      if (this.u3) {
         byte[] var3 = f2.n5(com.aspose.slides.internal.v6g.k5.u3(var1, 14) + this.e5().n5);
         this.f2().write(var3, 0, var3.length);
         this.f2().writeByte((byte)16);
         this.n5(true);
      }
   }

   public final void x8() {
      double var1 = this.z6().u3();
      this.u9.m3 = com.aspose.slides.internal.v6g.k5.u9(var1, 14);
      if (this.u3) {
         byte[] var3 = f2.n5(com.aspose.slides.internal.v6g.k5.u3(var1, 14) + this.e5().u3);
         this.f2().write(var3, 0, var3.length);
         this.f2().writeByte((byte)18);
         this.n5(true);
      }
   }

   public final void n3() {
      double var1 = this.z6().u3();
      double var3 = this.z6().u3();
      this.u9.z8 = com.aspose.slides.internal.v6g.k5.u9(var3, 14);
      this.u9.j5 = com.aspose.slides.internal.v6g.k5.a6(var1, 14) & 4294967295L;
      if (this.u3) {
         byte[] var5 = f2.n5(com.aspose.slides.internal.v6g.k5.u3(var1, 14) + this.e5().u9);
         this.f2().write(var5, 0, var5.length);
         this.f2().writeByte((byte)18);
         this.n5(true);
      }
   }

   public final void y4() {
      double var1 = this.z6().u3();
      this.u9.u3 = com.aspose.slides.internal.v6g.k5.a6(var1, 14);
   }

   public final void e2() {
      double var1 = this.z6().u3();
      this.u9.c8 = com.aspose.slides.ms.System.z3.n5(var1);
   }

   public final void t9() {
      double var1 = this.z6().u3();
      this.u9.t2 = com.aspose.slides.internal.v6g.k5.u9(var1, 14);
   }

   public final void z1() {
      double var1 = this.z6().u3();
      this.u9.s7 = com.aspose.slides.internal.v6g.k5.u9(var1, 14);
   }

   public final void t4() {
      double var1 = this.z6().u3();
      this.u9.x8 = com.aspose.slides.internal.v6g.k5.u9(var1, 14);
   }

   public final void q0() {
      double var1 = this.z6().u3();
      this.u9.n3 = com.aspose.slides.internal.v6g.k5.u3(var1, 14);
   }

   public final void z3() {
      double var1 = this.z6().u3();
      this.u9.y4 = com.aspose.slides.internal.v6g.k5.u3(var1, 14);
   }

   public final void m1() {
      double var1 = this.z6().u3();
      double var3 = this.z6().u3();
      double var5 = this.z6().u3();
      double var7 = this.z6().u3();
      double var9 = this.z6().u3();
      double var11 = this.z6().u3();
      this.u9.e2 = new v2(new double[]{var11, var9, var7, var5, var3, var1});
   }

   public final void k7() {
      double var1 = this.z6().u3();
      this.u9.q0 = com.aspose.slides.internal.v6g.k5.u9(var1, 14);
   }

   public final void m3() {
      double var1 = this.z6().u3();
      this.u9.u3 = com.aspose.slides.internal.v6g.k5.a6(var1, 14);
   }

   public final void z8() {
      double var1 = this.z6().u3();
      this.u9.c4 = com.aspose.slides.internal.v6g.k5.a6(var1, 14);
   }

   public final void j5() {
      double var1 = this.z6().u3();
      this.u9.r4 = com.aspose.slides.internal.v6g.k5.a6(var1, 14);
   }

   public final void w1() {
   }

   public final void r4() {
      double var1 = this.z6().u3();
      double var3 = this.z6().u3();
      double var5 = this.z6().u3();
      this.u9.y2 = com.aspose.slides.internal.v6g.k5.a6(var5, 14);
      this.u9.y1 = com.aspose.slides.internal.v6g.k5.a6(var3, 14);
      this.u9.a0 = com.aspose.slides.internal.v6g.k5.a6(var1, 14) & 4294967295L;
      this.u9.n5 = true;
   }

   public final void c4() {
      double var1 = this.z6().u3();
      this.u9.d2 = com.aspose.slides.internal.v6g.k5.u9(var1, 14);
   }

   public final void y2() {
      double var1 = this.z6().u3();
      this.u9.d5 = com.aspose.slides.internal.v6g.k5.u9(var1, 14);
   }

   public final void y1() {
      double var1 = this.z6().u3();
      this.u9.s3 = com.aspose.slides.internal.v6g.k5.u9(var1, 14);
   }

   public final void a0() {
      double var1 = this.z6().u3();
      this.u9.p8 = com.aspose.slides.internal.v6g.k5.u9(var1, 14);
   }

   public final void d2() {
      double var1 = this.z6().u3();
      this.u9.f2 = com.aspose.slides.internal.v6g.k5.u9(var1, 14);
   }

   public final void d5() {
      double var1 = this.z6().u3();
      this.u9.i1 = com.aspose.slides.internal.v6g.k5.u9(var1, 14);
      if (this.u3) {
         byte[] var3 = f2.n5(com.aspose.slides.internal.v6g.k5.u3(var1, 14) + this.e5().a6);
         this.f2().write(var3, 0, var3.length);
         this.f2().writeByte((byte)12);
         this.f2().writeByte((byte)36);
         this.n5(true);
      }
   }

   public final void s3() {
      double var1 = this.z6().u3();
      this.u9.e5 = com.aspose.slides.internal.v6g.k5.u9(var1, 14);
      if (this.u3) {
         byte[] var3 = f2.n5(com.aspose.slides.internal.v6g.k5.u3(var1, 14) + this.e5().k5);
         this.f2().write(var3, 0, var3.length);
         this.f2().writeByte((byte)12);
         this.f2().writeByte((byte)37);
         this.n5(true);
      }
   }

   public final void p8() {
      double var1 = this.z6().u3();
      this.u9.b3 = com.aspose.slides.internal.v6g.k5.a6(var1, 14);
   }

   @Override
   public final com.aspose.slides.internal.z0k.e2 f2() {
      return this.n5;
   }

   @Override
   public final boolean i1() {
      return this.k5;
   }

   @Override
   public final void n5(boolean var1) {
      this.k5 = var1;
   }

   public final v3 e5() {
      return this.a6;
   }

   public final void n5(v3 var1) {
      this.a6 = var1;
   }
}
