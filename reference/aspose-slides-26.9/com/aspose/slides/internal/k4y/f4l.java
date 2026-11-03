package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class f4l extends b3 {
   private float n5;
   private byte l6;
   private byte k5;
   private byte u3;
   private byte a6;
   private int u9;
   private double h0;
   private double c8;
   private double t2;
   private double s7;
   private int x8;
   private double n3;
   private byte y4;
   private byte e2;
   private byte t9;
   private byte z1;
   private byte t4;
   private boolean q0;
   private byte z3;
   private c9t m1;
   private g7 k7;
   private h6l m3;
   private g7 z8;
   private l8r j5;
   private static final com.aspose.slides.internal.v6g.u9 w1 = new com.aspose.slides.internal.v6g.u9(
      "rot",
      "spcFirstLastPara",
      "vertOverflow",
      "horzOverflow",
      "vert",
      "wrap",
      "lIns",
      "tIns",
      "rIns",
      "bIns",
      "numCol",
      "spcCol",
      "rtlCol",
      "fromWordArt",
      "anchor",
      "anchorCtr",
      "forceAA",
      "upright",
      "compatLnSpc",
      "prstTxWarp",
      "noAutofit",
      "normAutofit",
      "spAutoFit",
      "scene3d",
      "sp3d",
      "flatTx",
      "extLst"
   );

   public f4l(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.c4();
      f4l$1 var2 = new f4l$1(this);
      n5(var1, var2);
      n5(var1, new f4l$2(this, var1));
   }

   public f4l() {
      this.c4();
   }

   private void c4() {
      this.n5 = Float.NaN;
      this.l6 = -1;
      this.k5 = -1;
      this.u3 = -1;
      this.a6 = -1;
      this.u9 = 0;
      this.h0 = Double.NaN;
      this.c8 = Double.NaN;
      this.t2 = Double.NaN;
      this.s7 = Double.NaN;
      this.x8 = 0;
      this.n3 = Double.NaN;
      this.y4 = -1;
      this.e2 = -1;
      this.t9 = -1;
      this.z1 = -1;
      this.t4 = -1;
      this.q0 = false;
      this.z3 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      if (!"a".equals(var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main"))) {
         var2.n5(var1, var3, "http://schemas.openxmlformats.org/drawingml/2006/main");
      } else {
         var2.n5(var1, var3, null);
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.n5)) {
         var2.l6("rot", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.n5 * 60000.0F), 14)));
      }

      if (this.l6 != -1) {
         var2.l6("spcFirstLastPara", this.l6 == 1 ? "1" : "0");
      }

      if (this.k5 != -1) {
         var2.l6("vertOverflow", f1.n5(this.k5));
      }

      if (this.u3 != -1) {
         var2.l6("horzOverflow", v9.n5(this.u3));
      }

      if (this.a6 != -1) {
         var2.l6("vert", k2.n5(this.a6));
      }

      if (this.u9 != 0) {
         var2.l6("wrap", t3h.n5(this.u9));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.h0)) {
         var2.l6("lIns", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.h0 * 12700.0), 14)));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.c8)) {
         var2.l6("tIns", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.c8 * 12700.0), 14)));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.t2)) {
         var2.l6("rIns", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.t2 * 12700.0), 14)));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.s7)) {
         var2.l6("bIns", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.s7 * 12700.0), 14)));
      }

      if (this.x8 != 0) {
         var2.l6("numCol", com.aspose.slides.ms.System.Xml.f4.n5(this.x8));
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.n3)) {
         var2.l6(
            "spcCol", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.n3 * 12700.0), 14))
         );
      }

      if (this.y4 != -1) {
         var2.l6("rtlCol", this.y4 == 1 ? "1" : "0");
      }

      if (this.e2 != -1) {
         var2.l6("fromWordArt", this.e2 == 1 ? "1" : "0");
      }

      if (this.t9 != -1) {
         var2.l6("anchor", b1.n5(this.t9));
      }

      if (this.z1 != -1) {
         var2.l6("anchorCtr", this.z1 == 1 ? "1" : "0");
      }

      if (this.t4 != -1) {
         var2.l6("forceAA", this.t4 == 1 ? "1" : "0");
      }

      if (this.q0) {
         var2.l6("upright", this.q0 ? "1" : "0");
      }

      if (this.z3 != -1) {
         var2.l6("compatLnSpc", this.z3 == 1 ? "1" : "0");
      }

      if (this.m1 != null) {
         this.m1.n5("a", var2, "prstTxWarp");
      }

      if (this.k7 != null) {
         switch (w1.n5(this.k7.n5())) {
            case 20:
               ((k0y)this.k7.k5()).n5("a", var2, this.k7.n5());
               break;
            case 21:
               ((x5e)this.k7.k5()).n5("a", var2, this.k7.n5());
               break;
            case 22:
               ((f9d)this.k7.k5()).n5("a", var2, this.k7.n5());
         }
      }

      if (this.m3 != null) {
         this.m3.n5("a", var2, "scene3d");
      }

      if (this.z8 != null) {
         switch (w1.n5(this.z8.n5())) {
            case 24:
               ((q9u)this.z8.k5()).n5("a", var2, this.z8.n5());
               break;
            case 25:
               ((p6w)this.z8.k5()).n5("a", var2, this.z8.n5());
         }
      }

      if (this.j5 != null) {
         this.j5.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final c9t n5() {
      if (this.m1 != null) {
         throw new Exception("Only one <prstTxWarp> element can be added.");
      }

      this.m1 = new c9t();
      return this.m1;
   }

   public final void n5(h6l var1) {
      this.m3 = var1;
   }

   public final void n5(x8 var1) {
      this.j5 = (l8r)var1;
   }

   public final g7 n5(String var1) {
      if (this.k7 != null) {
         throw new Exception("TextAutofit already is initialized.");
      }

      switch (w1.n5(var1)) {
         case 20:
            this.k7 = new g7("noAutofit", new k0y());
            break;
         case 21:
            this.k7 = new g7("normAutofit", new x5e());
            break;
         case 22:
            this.k7 = new g7("spAutoFit", new f9d());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.k7;
   }

   public final float l6() {
      return this.n5;
   }

   public final void n5(float var1) {
      this.n5 = var1;
   }

   public final byte k5() {
      return this.l6;
   }

   public final void n5(byte var1) {
      this.l6 = var1;
   }

   public final byte u3() {
      return this.k5;
   }

   public final void l6(byte var1) {
      this.k5 = var1;
   }

   public final byte a6() {
      return this.u3;
   }

   public final void k5(byte var1) {
      this.u3 = var1;
   }

   public final byte u9() {
      return this.a6;
   }

   public final void u3(byte var1) {
      this.a6 = var1;
   }

   public final int h0() {
      return this.u9;
   }

   public final void n5(int var1) {
      this.u9 = var1;
   }

   public final double c8() {
      return this.h0;
   }

   public final void n5(double var1) {
      this.h0 = var1;
   }

   public final double t2() {
      return this.c8;
   }

   public final void l6(double var1) {
      this.c8 = var1;
   }

   public final double s7() {
      return this.t2;
   }

   public final void k5(double var1) {
      this.t2 = var1;
   }

   public final double x8() {
      return this.s7;
   }

   public final void u3(double var1) {
      this.s7 = var1;
   }

   public final int n3() {
      return this.x8;
   }

   public final void l6(int var1) {
      this.x8 = var1;
   }

   public final double y4() {
      return this.n3;
   }

   public final void a6(double var1) {
      this.n3 = var1;
   }

   public final byte e2() {
      return this.y4;
   }

   public final void a6(byte var1) {
      this.y4 = var1;
   }

   public final byte t9() {
      return this.e2;
   }

   public final void u9(byte var1) {
      this.e2 = var1;
   }

   public final byte z1() {
      return this.t9;
   }

   public final void h0(byte var1) {
      this.t9 = var1;
   }

   public final byte t4() {
      return this.z1;
   }

   public final void c8(byte var1) {
      this.z1 = var1;
   }

   public final byte q0() {
      return this.t4;
   }

   public final void t2(byte var1) {
      this.t4 = var1;
   }

   public final boolean z3() {
      return this.q0;
   }

   public final void n5(boolean var1) {
      this.q0 = var1;
   }

   public final byte m1() {
      return this.z3;
   }

   public final void s7(byte var1) {
      this.z3 = var1;
   }

   public final c9t k7() {
      return this.m1;
   }

   public final g7 m3() {
      return this.k7;
   }

   public final h6l z8() {
      return this.m3;
   }

   public final g7 j5() {
      return this.z8;
   }

   public final void n5(g7 var1) {
      this.z8 = var1;
   }

   public final x8 w1() {
      return this.j5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 r4() {
      return w1;
   }

   // $VF: synthetic method
   static float n5(f4l var0, float var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static byte n5(f4l var0, byte var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static byte l6(f4l var0, byte var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static byte k5(f4l var0, byte var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static byte u3(f4l var0, byte var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int n5(f4l var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static double n5(f4l var0, double var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static double l6(f4l var0, double var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static double k5(f4l var0, double var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static double u3(f4l var0, double var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static int l6(f4l var0, int var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static double a6(f4l var0, double var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static byte a6(f4l var0, byte var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static byte u9(f4l var0, byte var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static byte h0(f4l var0, byte var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static byte c8(f4l var0, byte var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static byte t2(f4l var0, byte var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static boolean n5(f4l var0, boolean var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static byte s7(f4l var0, byte var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static c9t n5(f4l var0, c9t var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static g7 n5(f4l var0, g7 var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static h6l n5(f4l var0, h6l var1) {
      return var0.m3 = var1;
   }

   // $VF: synthetic method
   static g7 l6(f4l var0, g7 var1) {
      return var0.z8 = var1;
   }

   // $VF: synthetic method
   static l8r n5(f4l var0, l8r var1) {
      return var0.j5 = var1;
   }
}
