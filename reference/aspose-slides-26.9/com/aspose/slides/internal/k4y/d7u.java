package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class d7u extends b3 {
   private boolean n5;
   private boolean l6;
   private boolean k5;
   private boolean u3;
   private boolean a6;
   private boolean u9;
   private boolean h0;
   private g7 c8;
   private g7 t2;
   private g7 s7;
   private l8r x8;
   private static final com.aspose.slides.internal.v6g.u9 n3 = new com.aspose.slides.internal.v6g.u9(
      "rtl",
      "firstRow",
      "firstCol",
      "lastRow",
      "lastCol",
      "bandRow",
      "bandCol",
      "noFill",
      "solidFill",
      "gradFill",
      "blipFill",
      "pattFill",
      "grpFill",
      "effectLst",
      "effectDag",
      "tableStyle",
      "tableStyleId",
      "extLst"
   );

   public d7u(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.y4();
      d7u$1 var2 = new d7u$1(this);
      n5(var1, var2);
      n5(var1, new d7u$2(this, var1));
   }

   public d7u() {
      this.y4();
   }

   private void y4() {
      this.n5 = false;
      this.l6 = false;
      this.k5 = false;
      this.u3 = false;
      this.a6 = false;
      this.u9 = false;
      this.h0 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5) {
         var2.l6("rtl", this.n5 ? "1" : "0");
      }

      if (this.l6) {
         var2.l6("firstRow", this.l6 ? "1" : "0");
      }

      if (this.k5) {
         var2.l6("firstCol", this.k5 ? "1" : "0");
      }

      if (this.u3) {
         var2.l6("lastRow", this.u3 ? "1" : "0");
      }

      if (this.a6) {
         var2.l6("lastCol", this.a6 ? "1" : "0");
      }

      if (this.u9) {
         var2.l6("bandRow", this.u9 ? "1" : "0");
      }

      if (this.h0) {
         var2.l6("bandCol", this.h0 ? "1" : "0");
      }

      if (this.c8 != null) {
         switch (n3.n5(this.c8.n5())) {
            case 7:
               ((u4k)this.c8.k5()).n5("a", var2, this.c8.n5());
               break;
            case 8:
               ((e2l)this.c8.k5()).n5("a", var2, this.c8.n5());
               break;
            case 9:
               ((j2p)this.c8.k5()).n5("a", var2, this.c8.n5());
               break;
            case 10:
               ((e3)this.c8.k5()).n5("a", var2, this.c8.n5());
               break;
            case 11:
               ((n9q)this.c8.k5()).n5("a", var2, this.c8.n5());
               break;
            case 12:
               ((r6i)this.c8.k5()).n5("a", var2, this.c8.n5());
         }
      }

      if (this.t2 != null) {
         switch (n3.n5(this.t2.n5())) {
            case 13:
               ((o9b)this.t2.k5()).n5("a", var2, this.t2.n5());
               break;
            case 14:
               ((f8y)this.t2.k5()).n5("a", var2, this.t2.n5());
         }
      }

      if (this.s7 != null) {
         switch (n3.n5(this.s7.n5())) {
            case 15:
               ((a1k)this.s7.k5()).n5("a", var2, this.s7.n5());
               break;
            case 16:
               this.n5(
                  "a",
                  var2,
                  "tableStyleId",
                  com.aspose.slides.ms.System.d1.n5(new String[]{
                     "{",
                     com.aspose.slides.ms.System.d1.t2(
                        com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(this.s7.k5(), com.aspose.slides.ms.System.o0.class).k5())
                     ),
                     "}"
                  }),
                  false
               );
         }
      }

      if (this.x8 != null) {
         this.x8.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(x8 var1) {
      this.x8 = (l8r)var1;
   }

   public final g7 n5(String var1) {
      if (this.t2 != null) {
         throw new Exception("EffectProperties already is initialized.");
      }

      switch (n3.n5(var1)) {
         case 13:
            this.t2 = new g7("effectLst", new o9b());
            break;
         case 14:
            this.t2 = new g7("effectDag", new f8y());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.t2;
   }

   public final g7 l6(String var1) {
      if (this.c8 != null) {
         throw new Exception("FillProperties already is initialized.");
      }

      switch (n3.n5(var1)) {
         case 7:
            this.c8 = new g7("noFill", new u4k());
            break;
         case 8:
            this.c8 = new g7("solidFill", new e2l());
            break;
         case 9:
            this.c8 = new g7("gradFill", new j2p());
            break;
         case 10:
            this.c8 = new g7("blipFill", new e3());
            break;
         case 11:
            this.c8 = new g7("pattFill", new n9q());
            break;
         case 12:
            this.c8 = new g7("grpFill", new r6i());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.c8;
   }

   public final g7 k5(String var1) {
      if (this.s7 != null) {
         throw new Exception("TableStyle already is initialized.");
      }

      switch (n3.n5(var1)) {
         case 15:
            this.s7 = new g7("tableStyle", new a1k());
            break;
         case 16:
            this.s7 = new g7("tableStyleId", new com.aspose.slides.ms.System.o0());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.s7;
   }

   public final boolean n5() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   public final boolean l6() {
      return this.l6;
   }

   public final void l6(boolean var1) {
      this.l6 = var1;
   }

   public final boolean k5() {
      return this.k5;
   }

   public final void k5(boolean var1) {
      this.k5 = var1;
   }

   public final boolean u3() {
      return this.u3;
   }

   public final void u3(boolean var1) {
      this.u3 = var1;
   }

   public final boolean a6() {
      return this.a6;
   }

   public final void a6(boolean var1) {
      this.a6 = var1;
   }

   public final boolean u9() {
      return this.u9;
   }

   public final void u9(boolean var1) {
      this.u9 = var1;
   }

   public final boolean h0() {
      return this.h0;
   }

   public final void h0(boolean var1) {
      this.h0 = var1;
   }

   public final g7 c8() {
      return this.c8;
   }

   public final g7 t2() {
      return this.t2;
   }

   public final g7 s7() {
      return this.s7;
   }

   public final void n5(g7 var1) {
      this.s7 = var1;
   }

   public final x8 x8() {
      return this.x8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n3() {
      return n3;
   }

   // $VF: synthetic method
   static boolean n5(d7u var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(d7u var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean k5(d7u var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean u3(d7u var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean a6(d7u var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean u9(d7u var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean h0(d7u var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static g7 n5(d7u var0, g7 var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static g7 l6(d7u var0, g7 var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static g7 k5(d7u var0, g7 var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static l8r n5(d7u var0, l8r var1) {
      return var0.x8 = var1;
   }
}
