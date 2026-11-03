package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class r5w extends b3 {
   private double n5;
   private byte l6;
   private byte k5;
   private byte u3;
   private g7 a6;
   private g7 u9;
   private g7 h0;
   private v9e c8;
   private v9e t2;
   private l8r s7;
   private static final com.aspose.slides.internal.v6g.u9 x8 = new com.aspose.slides.internal.v6g.u9(
      "w",
      "cap",
      "cmpd",
      "algn",
      "noFill",
      "solidFill",
      "gradFill",
      "pattFill",
      "prstDash",
      "custDash",
      "round",
      "bevel",
      "miter",
      "headEnd",
      "tailEnd",
      "extLst"
   );

   public r5w(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.e2();
      r5w$1 var2 = new r5w$1(this);
      n5(var1, var2);
      n5(var1, new r5w$2(this, var1));
   }

   public r5w() {
      this.e2();
   }

   private void e2() {
      this.n5 = Double.NaN;
      this.l6 = -1;
      this.k5 = -1;
      this.u3 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      if (!"a".equals(var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main"))) {
         var2.n5(var1, var3, "http://schemas.openxmlformats.org/drawingml/2006/main");
      } else {
         var2.n5(var1, var3, null);
      }

      if (!com.aspose.slides.ms.System.d2.k5(this.n5)) {
         var2.l6("w", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u9(com.aspose.slides.ms.System.q1.u3(this.n5 * 12700.0), 14)));
      }

      if (this.l6 != -1) {
         var2.l6("cap", z5.n5(this.l6));
      }

      if (this.k5 != -1) {
         var2.l6("cmpd", r1.n5(this.k5));
      }

      if (this.u3 != -1) {
         var2.l6("algn", q3.n5(this.u3));
      }

      if (this.a6 != null) {
         switch (x8.n5(this.a6.n5())) {
            case 4:
               ((u4k)this.a6.k5()).n5("a", var2, this.a6.n5());
               break;
            case 5:
               ((e2l)this.a6.k5()).n5("a", var2, this.a6.n5());
               break;
            case 6:
               ((j2p)this.a6.k5()).n5("a", var2, this.a6.n5());
               break;
            case 7:
               ((n9q)this.a6.k5()).n5("a", var2, this.a6.n5());
         }
      }

      if (this.u9 != null) {
         switch (x8.n5(this.u9.n5())) {
            case 8:
               ((f3l)this.u9.k5()).n5("a", var2, this.u9.n5());
               break;
            case 9:
               ((e5a)this.u9.k5()).n5("a", var2, this.u9.n5());
         }
      }

      if (this.h0 != null) {
         switch (x8.n5(this.h0.n5())) {
            case 10:
               ((c9b)this.h0.k5()).n5("a", var2, this.h0.n5());
               break;
            case 11:
               ((t9p)this.h0.k5()).n5("a", var2, this.h0.n5());
               break;
            case 12:
               ((w4w)this.h0.k5()).n5("a", var2, this.h0.n5());
         }
      }

      if (this.c8 != null) {
         this.c8.n5("a", var2, "headEnd");
      }

      if (this.t2 != null) {
         this.t2.n5("a", var2, "tailEnd");
      }

      if (this.s7 != null) {
         this.s7.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final v9e n5() {
      if (this.c8 != null) {
         throw new Exception("Only one <headEnd> element can be added.");
      }

      this.c8 = new v9e();
      return this.c8;
   }

   public final v9e l6() {
      if (this.t2 != null) {
         throw new Exception("Only one <tailEnd> element can be added.");
      }

      this.t2 = new v9e();
      return this.t2;
   }

   public final void n5(x8 var1) {
      this.s7 = (l8r)var1;
   }

   public final g7 n5(String var1) {
      if (this.u9 != null) {
         throw new Exception("LineDashProperties already is initialized.");
      }

      switch (x8.n5(var1)) {
         case 8:
            this.u9 = new g7("prstDash", new f3l());
            break;
         case 9:
            this.u9 = new g7("custDash", new e5a());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.u9;
   }

   public final g7 l6(String var1) {
      if (this.a6 != null) {
         throw new Exception("LineFillProperties already is initialized.");
      }

      switch (x8.n5(var1)) {
         case 4:
            this.a6 = new g7("noFill", new u4k());
            break;
         case 5:
            this.a6 = new g7("solidFill", new e2l());
            break;
         case 6:
            this.a6 = new g7("gradFill", new j2p());
            break;
         case 7:
            this.a6 = new g7("pattFill", new n9q());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.a6;
   }

   public final g7 k5(String var1) {
      if (this.h0 != null) {
         throw new Exception("LineJoinProperties already is initialized.");
      }

      switch (x8.n5(var1)) {
         case 10:
            this.h0 = new g7("round", new c9b());
            break;
         case 11:
            this.h0 = new g7("bevel", new t9p());
            break;
         case 12:
            this.h0 = new g7("miter", new w4w());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.h0;
   }

   public final double k5() {
      return this.n5;
   }

   public final void n5(double var1) {
      this.n5 = var1;
   }

   public final byte u3() {
      return this.l6;
   }

   public final void n5(byte var1) {
      this.l6 = var1;
   }

   public final byte a6() {
      return this.k5;
   }

   public final void l6(byte var1) {
      this.k5 = var1;
   }

   public final byte u9() {
      return this.u3;
   }

   public final void k5(byte var1) {
      this.u3 = var1;
   }

   public final g7 h0() {
      return this.a6;
   }

   public final g7 c8() {
      return this.u9;
   }

   public final g7 t2() {
      return this.h0;
   }

   public final v9e s7() {
      return this.c8;
   }

   public final v9e x8() {
      return this.t2;
   }

   public final x8 n3() {
      return this.s7;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 y4() {
      return x8;
   }

   // $VF: synthetic method
   static double n5(r5w var0, double var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static byte n5(r5w var0, byte var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static byte l6(r5w var0, byte var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static byte k5(r5w var0, byte var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static g7 n5(r5w var0, g7 var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static g7 l6(r5w var0, g7 var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static g7 k5(r5w var0, g7 var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static v9e n5(r5w var0, v9e var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static v9e l6(r5w var0, v9e var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static l8r n5(r5w var0, l8r var1) {
      return var0.s7 = var1;
   }
}
