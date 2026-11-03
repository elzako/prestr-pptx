package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class b1r extends b3 {
   private double u3;
   private double a6;
   private double u9;
   private double h0;
   private byte c8;
   private byte t2;
   private boolean s7;
   private byte x8;
   private r5w n3;
   private r5w y4;
   private r5w e2;
   private r5w t9;
   private r5w z1;
   private r5w t4;
   private u7 q0;
   private g7 z3;
   private l8r m1;
   public static final byte n5 = k2.n5("horz");
   public static final byte l6 = b1.n5("t");
   public static final byte k5 = v9.n5("clip");
   private static final com.aspose.slides.internal.v6g.u9 k7 = new com.aspose.slides.internal.v6g.u9(
      "marL",
      "marR",
      "marT",
      "marB",
      "vert",
      "anchor",
      "anchorCtr",
      "horzOverflow",
      "lnL",
      "lnR",
      "lnT",
      "lnB",
      "lnTlToBr",
      "lnBlToTr",
      "cell3D",
      "noFill",
      "solidFill",
      "gradFill",
      "blipFill",
      "pattFill",
      "grpFill",
      "extLst"
   );

   public b1r(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.w1();
      b1r$1 var2 = new b1r$1(this);
      n5(var1, var2);
      if (!var1.m1()) {
         String var3 = var1.n3();
         boolean var4 = false;

         while (var4 && !var1.j5() || var1.u9()) {
            if (var1.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var1.n3(), var3)) {
               break;
            }

            var4 = false;
            if (var1.s7() == 1) {
               switch (k7.n5(var1.n3())) {
                  case 8:
                     this.n3 = new r5w(var1);
                     break;
                  case 9:
                     this.y4 = new r5w(var1);
                     break;
                  case 10:
                     this.e2 = new r5w(var1);
                     break;
                  case 11:
                     this.t9 = new r5w(var1);
                     break;
                  case 12:
                     this.z1 = new r5w(var1);
                     break;
                  case 13:
                     this.t4 = new r5w(var1);
                     break;
                  case 14:
                     this.q0 = new u7(var1);
                     var4 = true;
                     break;
                  case 15:
                     this.z3 = new g7("noFill", new u4k(var1));
                     break;
                  case 16:
                     this.z3 = new g7("solidFill", new e2l(var1));
                     break;
                  case 17:
                     this.z3 = new g7("gradFill", new j2p(var1));
                     break;
                  case 18:
                     this.z3 = new g7("blipFill", new e3(var1));
                     break;
                  case 19:
                     this.z3 = new g7("pattFill", new n9q(var1));
                     break;
                  case 20:
                     this.z3 = new g7("grpFill", new r6i(var1));
                     break;
                  case 21:
                     this.m1 = new l8r(var1);
                     break;
                  default:
                     var1.r4();
                     var4 = true;
               }
            }
         }
      }
   }

   public b1r() {
      this.w1();
   }

   private void w1() {
      this.u3 = 7.2;
      this.a6 = 7.2;
      this.u9 = 3.6;
      this.h0 = 3.6;
      this.c8 = n5;
      this.t2 = l6;
      this.s7 = false;
      this.x8 = k5;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.u3 != 7.2) {
         var2.l6("marL", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.u3 * 12700.0), 14)));
      }

      if (this.a6 != 7.2) {
         var2.l6("marR", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.a6 * 12700.0), 14)));
      }

      if (this.u9 != 3.6) {
         var2.l6("marT", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.u9 * 12700.0), 14)));
      }

      if (this.h0 != 3.6) {
         var2.l6("marB", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.h0 * 12700.0), 14)));
      }

      if (this.c8 != n5) {
         var2.l6("vert", k2.n5(this.c8));
      }

      if (this.t2 != l6) {
         var2.l6("anchor", b1.n5(this.t2));
      }

      if (this.s7) {
         var2.l6("anchorCtr", this.s7 ? "1" : "0");
      }

      if (this.x8 != k5) {
         var2.l6("horzOverflow", v9.n5(this.x8));
      }

      if (this.n3 != null) {
         this.n3.n5("a", var2, "lnL");
      }

      if (this.y4 != null) {
         this.y4.n5("a", var2, "lnR");
      }

      if (this.e2 != null) {
         this.e2.n5("a", var2, "lnT");
      }

      if (this.t9 != null) {
         this.t9.n5("a", var2, "lnB");
      }

      if (this.z1 != null) {
         this.z1.n5("a", var2, "lnTlToBr");
      }

      if (this.t4 != null) {
         this.t4.n5("a", var2, "lnBlToTr");
      }

      if (this.q0 != null) {
         this.q0.n5("a", var2, "cell3D");
      }

      if (this.z3 != null) {
         switch (k7.n5(this.z3.n5())) {
            case 15:
               ((u4k)this.z3.k5()).n5("a", var2, this.z3.n5());
               break;
            case 16:
               ((e2l)this.z3.k5()).n5("a", var2, this.z3.n5());
               break;
            case 17:
               ((j2p)this.z3.k5()).n5("a", var2, this.z3.n5());
               break;
            case 18:
               ((e3)this.z3.k5()).n5("a", var2, this.z3.n5());
               break;
            case 19:
               ((n9q)this.z3.k5()).n5("a", var2, this.z3.n5());
               break;
            case 20:
               ((r6i)this.z3.k5()).n5("a", var2, this.z3.n5());
         }
      }

      if (this.m1 != null) {
         this.m1.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final r5w n5() {
      if (this.n3 != null) {
         throw new Exception("Only one <lnL> element can be added.");
      }

      this.n3 = new r5w();
      return this.n3;
   }

   public final r5w l6() {
      if (this.y4 != null) {
         throw new Exception("Only one <lnR> element can be added.");
      }

      this.y4 = new r5w();
      return this.y4;
   }

   public final r5w k5() {
      if (this.e2 != null) {
         throw new Exception("Only one <lnT> element can be added.");
      }

      this.e2 = new r5w();
      return this.e2;
   }

   public final r5w u3() {
      if (this.t9 != null) {
         throw new Exception("Only one <lnB> element can be added.");
      }

      this.t9 = new r5w();
      return this.t9;
   }

   public final r5w a6() {
      if (this.z1 != null) {
         throw new Exception("Only one <lnTlToBr> element can be added.");
      }

      this.z1 = new r5w();
      return this.z1;
   }

   public final r5w u9() {
      if (this.t4 != null) {
         throw new Exception("Only one <lnBlToTr> element can be added.");
      }

      this.t4 = new r5w();
      return this.t4;
   }

   public final void n5(u7 var1) {
      this.q0 = var1;
   }

   public final void n5(x8 var1) {
      this.m1 = (l8r)var1;
   }

   public final g7 n5(String var1) {
      if (this.z3 != null) {
         throw new Exception("FillProperties already is initialized.");
      }

      switch (k7.n5(var1)) {
         case 15:
            this.z3 = new g7("noFill", new u4k());
            break;
         case 16:
            this.z3 = new g7("solidFill", new e2l());
            break;
         case 17:
            this.z3 = new g7("gradFill", new j2p());
            break;
         case 18:
            this.z3 = new g7("blipFill", new e3());
            break;
         case 19:
            this.z3 = new g7("pattFill", new n9q());
            break;
         case 20:
            this.z3 = new g7("grpFill", new r6i());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.z3;
   }

   public final double h0() {
      return this.u3;
   }

   public final void n5(double var1) {
      this.u3 = var1;
   }

   public final double c8() {
      return this.a6;
   }

   public final void l6(double var1) {
      this.a6 = var1;
   }

   public final double t2() {
      return this.u9;
   }

   public final void k5(double var1) {
      this.u9 = var1;
   }

   public final double s7() {
      return this.h0;
   }

   public final void u3(double var1) {
      this.h0 = var1;
   }

   public final byte x8() {
      return this.c8;
   }

   public final void n5(byte var1) {
      this.c8 = var1;
   }

   public final byte n3() {
      return this.t2;
   }

   public final void l6(byte var1) {
      this.t2 = var1;
   }

   public final boolean y4() {
      return this.s7;
   }

   public final void n5(boolean var1) {
      this.s7 = var1;
   }

   public final byte e2() {
      return this.x8;
   }

   public final void k5(byte var1) {
      this.x8 = var1;
   }

   public final r5w t9() {
      return this.n3;
   }

   public final r5w z1() {
      return this.y4;
   }

   public final r5w t4() {
      return this.e2;
   }

   public final r5w q0() {
      return this.t9;
   }

   public final r5w z3() {
      return this.z1;
   }

   public final r5w m1() {
      return this.t4;
   }

   public final u7 k7() {
      return this.q0;
   }

   public final g7 m3() {
      return this.z3;
   }

   public final x8 z8() {
      return this.m1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 j5() {
      return k7;
   }

   // $VF: synthetic method
   static double n5(b1r var0, double var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static double l6(b1r var0, double var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static double k5(b1r var0, double var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static double u3(b1r var0, double var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static byte n5(b1r var0, byte var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static byte l6(b1r var0, byte var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static boolean n5(b1r var0, boolean var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static byte k5(b1r var0, byte var1) {
      return var0.x8 = var1;
   }
}
