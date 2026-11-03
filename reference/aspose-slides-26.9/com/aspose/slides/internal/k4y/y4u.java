package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class y4u extends b3 {
   private double n5;
   private double l6;
   private int k5;
   private double u3;
   private int a6;
   private double u9;
   private byte h0;
   private byte c8;
   private int t2;
   private byte s7;
   private byte x8;
   private g3j n3;
   private g3j y4;
   private g3j e2;
   private g7 t9;
   private g7 z1;
   private g7 t4;
   private g7 q0;
   private d0c z3;
   private m0l m1;
   private l8r k7;
   private static final com.aspose.slides.internal.v6g.u9 m3 = new com.aspose.slides.internal.v6g.u9(
      "marL",
      "marR",
      "lvl",
      "indent",
      "algn",
      "defTabSz",
      "rtl",
      "eaLnBrk",
      "fontAlgn",
      "latinLnBrk",
      "hangingPunct",
      "lnSpc",
      "spcBef",
      "spcAft",
      "buClrTx",
      "buClr",
      "buSzTx",
      "buSzPct",
      "buSzPts",
      "buFontTx",
      "buFont",
      "buNone",
      "buAutoNum",
      "buChar",
      "buBlip",
      "tabLst",
      "defRPr",
      "extLst"
   );

   public y4u(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.c4();
      y4u$1 var2 = new y4u$1(this);
      n5(var1, var2);
      n5(var1, new y4u$2(this, var1));
   }

   public y4u() {
      this.c4();
   }

   private void c4() {
      this.n5 = Double.NaN;
      this.l6 = Double.NaN;
      this.k5 = -1;
      this.u3 = Double.NaN;
      this.a6 = 0;
      this.u9 = Double.NaN;
      this.h0 = -1;
      this.c8 = -1;
      this.t2 = -1;
      this.s7 = -1;
      this.x8 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!com.aspose.slides.ms.System.d2.k5(this.n5)) {
         var2.l6("marL", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.n5 * 12700.0), 14)));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.l6)) {
         var2.l6("marR", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.l6 * 12700.0), 14)));
      }

      if (this.k5 != -1) {
         var2.l6("lvl", com.aspose.slides.ms.System.Xml.f4.n5(this.k5));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.u3)) {
         var2.l6(
            "indent", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.u3 * 12700.0), 14))
         );
      }

      if (this.a6 != 0) {
         var2.l6("algn", r2q.n5(this.a6));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.u9)) {
         var2.l6(
            "defTabSz", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.u9 * 12700.0), 14))
         );
      }

      if (this.h0 != -1) {
         var2.l6("rtl", this.h0 == 1 ? "1" : "0");
      }

      if (this.c8 != -1) {
         var2.l6("eaLnBrk", this.c8 == 1 ? "1" : "0");
      }

      if (this.t2 != -1) {
         var2.l6("fontAlgn", o7.n5(this.t2));
      }

      if (this.s7 != -1) {
         var2.l6("latinLnBrk", this.s7 == 1 ? "1" : "0");
      }

      if (this.x8 != -1) {
         var2.l6("hangingPunct", this.x8 == 1 ? "1" : "0");
      }

      if (this.n3 != null) {
         this.n3.n5("a", var2, "lnSpc");
      }

      if (this.y4 != null) {
         this.y4.n5("a", var2, "spcBef");
      }

      if (this.e2 != null) {
         this.e2.n5("a", var2, "spcAft");
      }

      if (this.t9 != null) {
         switch (m3.n5(this.t9.n5())) {
            case 14:
               ((s5r)this.t9.k5()).n5("a", var2, this.t9.n5());
               break;
            case 15:
               ((z4)this.t9.k5()).n5("a", var2, this.t9.n5());
         }
      }

      if (this.z1 != null) {
         switch (m3.n5(this.z1.n5())) {
            case 16:
               ((g5d)this.z1.k5()).n5("a", var2, this.z1.n5());
               break;
            case 17:
               ((u0b)this.z1.k5()).n5("a", var2, this.z1.n5());
               break;
            case 18:
               ((c4i)this.z1.k5()).n5("a", var2, this.z1.n5());
         }
      }

      if (this.t4 != null) {
         switch (m3.n5(this.t4.n5())) {
            case 19:
               ((m2n)this.t4.k5()).n5("a", var2, this.t4.n5());
               break;
            case 20:
               ((q5v)this.t4.k5()).n5("a", var2, this.t4.n5());
         }
      }

      if (this.q0 != null) {
         switch (m3.n5(this.q0.n5())) {
            case 21:
               ((v7o)this.q0.k5()).n5("a", var2, this.q0.n5());
               break;
            case 22:
               ((k4o)this.q0.k5()).n5("a", var2, this.q0.n5());
               break;
            case 23:
               ((e2o)this.q0.k5()).n5("a", var2, this.q0.n5());
               break;
            case 24:
               ((v4m)this.q0.k5()).n5("a", var2, this.q0.n5());
         }
      }

      if (this.z3 != null) {
         this.z3.n5("a", var2, "tabLst");
      }

      if (this.m1 != null) {
         this.m1.n5("a", var2, "defRPr");
      }

      if (this.k7 != null) {
         this.k7.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final g3j n5() {
      if (this.n3 != null) {
         throw new Exception("Only one <lnSpc> element can be added.");
      }

      this.n3 = new g3j();
      return this.n3;
   }

   public final g3j l6() {
      if (this.y4 != null) {
         throw new Exception("Only one <spcBef> element can be added.");
      }

      this.y4 = new g3j();
      return this.y4;
   }

   public final g3j k5() {
      if (this.e2 != null) {
         throw new Exception("Only one <spcAft> element can be added.");
      }

      this.e2 = new g3j();
      return this.e2;
   }

   public final d0c u3() {
      if (this.z3 != null) {
         throw new Exception("Only one <tabLst> element can be added.");
      }

      this.z3 = new d0c();
      return this.z3;
   }

   public final m0l a6() {
      if (this.m1 != null) {
         throw new Exception("Only one <defRPr> element can be added.");
      }

      this.m1 = new m0l();
      return this.m1;
   }

   public final g7 n5(String var1) {
      if (this.q0 != null) {
         throw new Exception("TextBullet already is initialized.");
      }

      switch (m3.n5(var1)) {
         case 21:
            this.q0 = new g7("buNone", new v7o());
            break;
         case 22:
            this.q0 = new g7("buAutoNum", new k4o());
            break;
         case 23:
            this.q0 = new g7("buChar", new e2o());
            break;
         case 24:
            this.q0 = new g7("buBlip", new v4m());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.q0;
   }

   public final g7 l6(String var1) {
      if (this.t9 != null) {
         throw new Exception("TextBulletColor already is initialized.");
      }

      switch (m3.n5(var1)) {
         case 14:
            this.t9 = new g7("buClrTx", new s5r());
            break;
         case 15:
            this.t9 = new g7("buClr", new z4());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.t9;
   }

   public final g7 k5(String var1) {
      if (this.z1 != null) {
         throw new Exception("TextBulletSize already is initialized.");
      }

      switch (m3.n5(var1)) {
         case 16:
            this.z1 = new g7("buSzTx", new g5d());
            break;
         case 17:
            this.z1 = new g7("buSzPct", new u0b());
            break;
         case 18:
            this.z1 = new g7("buSzPts", new c4i());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.z1;
   }

   public final g7 u3(String var1) {
      if (this.t4 != null) {
         throw new Exception("TextBulletTypeface already is initialized.");
      }

      switch (m3.n5(var1)) {
         case 19:
            this.t4 = new g7("buFontTx", new m2n());
            break;
         case 20:
            this.t4 = new g7("buFont", new q5v());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.t4;
   }

   public final double u9() {
      return this.n5;
   }

   public final void n5(double var1) {
      this.n5 = var1;
   }

   public final double h0() {
      return this.l6;
   }

   public final void l6(double var1) {
      this.l6 = var1;
   }

   public final int c8() {
      return this.k5;
   }

   public final void n5(int var1) {
      this.k5 = var1;
   }

   public final double t2() {
      return this.u3;
   }

   public final void k5(double var1) {
      this.u3 = var1;
   }

   public final int s7() {
      return this.a6;
   }

   public final void l6(int var1) {
      this.a6 = var1;
   }

   public final double x8() {
      return this.u9;
   }

   public final void u3(double var1) {
      this.u9 = var1;
   }

   public final byte n3() {
      return this.h0;
   }

   public final void n5(byte var1) {
      this.h0 = var1;
   }

   public final byte y4() {
      return this.c8;
   }

   public final void l6(byte var1) {
      this.c8 = var1;
   }

   public final int e2() {
      return this.t2;
   }

   public final void k5(int var1) {
      this.t2 = var1;
   }

   public final byte t9() {
      return this.s7;
   }

   public final void k5(byte var1) {
      this.s7 = var1;
   }

   public final byte z1() {
      return this.x8;
   }

   public final void u3(byte var1) {
      this.x8 = var1;
   }

   public final g3j t4() {
      return this.n3;
   }

   public final g3j q0() {
      return this.y4;
   }

   public final g3j z3() {
      return this.e2;
   }

   public final g7 m1() {
      return this.t9;
   }

   public final g7 k7() {
      return this.z1;
   }

   public final g7 m3() {
      return this.t4;
   }

   public final g7 z8() {
      return this.q0;
   }

   public final d0c j5() {
      return this.z3;
   }

   public final m0l w1() {
      return this.m1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 r4() {
      return m3;
   }

   // $VF: synthetic method
   static double n5(y4u var0, double var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static double l6(y4u var0, double var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int n5(y4u var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static double k5(y4u var0, double var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int l6(y4u var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static double u3(y4u var0, double var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static byte n5(y4u var0, byte var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static byte l6(y4u var0, byte var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static int k5(y4u var0, int var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static byte k5(y4u var0, byte var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static byte u3(y4u var0, byte var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static g3j n5(y4u var0, g3j var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static g3j l6(y4u var0, g3j var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static g3j k5(y4u var0, g3j var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static g7 n5(y4u var0, g7 var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static g7 l6(y4u var0, g7 var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static g7 k5(y4u var0, g7 var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static g7 u3(y4u var0, g7 var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static d0c n5(y4u var0, d0c var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static m0l n5(y4u var0, m0l var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static l8r n5(y4u var0, l8r var1) {
      return var0.k7 = var1;
   }
}
