package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class b9y extends b3 {
   private byte n5;
   private e8b l6;
   private g7 k5;
   private g7 u3;
   private r5w a6;
   private g7 u9;
   private h6l h0;
   private q9u c8;
   private l8r t2;
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "bwMode",
      "xfrm",
      "custGeom",
      "prstGeom",
      "noFill",
      "solidFill",
      "gradFill",
      "blipFill",
      "pattFill",
      "grpFill",
      "ln",
      "effectLst",
      "effectDag",
      "scene3d",
      "sp3d",
      "extLst"
   );

   public b9y(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.t9();
      b9y$1 var2 = new b9y$1(this);
      n5(var1, var2);
      n5(var1, new b9y$2(this, var1));
   }

   public b9y() {
      this.t9();
   }

   private void t9() {
      this.n5 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != -1) {
         var2.l6("bwMode", s4.n5(this.n5));
      }

      if (this.l6 != null) {
         this.l6.n5("a", var2, "xfrm");
      }

      if (this.k5 != null) {
         switch (s7.n5(this.k5.n5())) {
            case 2:
               ((u1s)this.k5.k5()).n5("a", var2, this.k5.n5());
               break;
            case 3:
               ((r7n)this.k5.k5()).n5("a", var2, this.k5.n5());
         }
      }

      if (this.u3 != null) {
         switch (s7.n5(this.u3.n5())) {
            case 4:
               ((u4k)this.u3.k5()).n5("a", var2, this.u3.n5());
               break;
            case 5:
               ((e2l)this.u3.k5()).n5("a", var2, this.u3.n5());
               break;
            case 6:
               ((j2p)this.u3.k5()).n5("a", var2, this.u3.n5());
               break;
            case 7:
               ((e3)this.u3.k5()).n5("a", var2, this.u3.n5());
               break;
            case 8:
               ((n9q)this.u3.k5()).n5("a", var2, this.u3.n5());
               break;
            case 9:
               ((r6i)this.u3.k5()).n5("a", var2, this.u3.n5());
         }
      }

      if (this.a6 != null) {
         this.a6.n5("a", var2, "ln");
      }

      if (this.u9 != null) {
         switch (s7.n5(this.u9.n5())) {
            case 11:
               ((o9b)this.u9.k5()).n5("a", var2, this.u9.n5());
               break;
            case 12:
               ((f8y)this.u9.k5()).n5("a", var2, this.u9.n5());
         }
      }

      if (this.h0 != null) {
         this.h0.n5("a", var2, "scene3d");
      }

      if (this.c8 != null) {
         this.c8.n5("a", var2, "sp3d");
      }

      if (this.t2 != null) {
         this.t2.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final e8b n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <xfrm> element can be added.");
      }

      this.l6 = new e8b();
      return this.l6;
   }

   public final r5w l6() {
      if (this.a6 != null) {
         throw new Exception("Only one <ln> element can be added.");
      }

      this.a6 = new r5w();
      return this.a6;
   }

   public final void n5(r5w var1) {
      this.a6 = var1;
   }

   public final h6l k5() {
      if (this.h0 != null) {
         throw new Exception("Only one <scene3d> element can be added.");
      }

      this.h0 = new h6l();
      return this.h0;
   }

   public final void n5(h6l var1) {
      this.h0 = var1;
   }

   public final q9u u3() {
      if (this.c8 != null) {
         throw new Exception("Only one <sp3d> element can be added.");
      }

      this.c8 = new q9u();
      return this.c8;
   }

   public final void n5(q9u var1) {
      this.c8 = var1;
   }

   public final void n5(x8 var1) {
      this.t2 = (l8r)var1;
   }

   public final g7 n5(String var1) {
      if (this.u9 != null) {
         throw new Exception("EffectProperties already is initialized.");
      }

      switch (s7.n5(var1)) {
         case 11:
            this.u9 = new g7("effectLst", new o9b());
            break;
         case 12:
            this.u9 = new g7("effectDag", new f8y());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.u9;
   }

   public final g7 l6(String var1) {
      if (this.u3 != null) {
         throw new Exception("FillProperties already is initialized.");
      }

      switch (s7.n5(var1)) {
         case 4:
            this.u3 = new g7("noFill", new u4k());
            break;
         case 5:
            this.u3 = new g7("solidFill", new e2l());
            break;
         case 6:
            this.u3 = new g7("gradFill", new j2p());
            break;
         case 7:
            this.u3 = new g7("blipFill", new e3());
            break;
         case 8:
            this.u3 = new g7("pattFill", new n9q());
            break;
         case 9:
            this.u3 = new g7("grpFill", new r6i());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.u3;
   }

   public final g7 k5(String var1) {
      if (this.k5 != null) {
         throw new Exception("Geometry already is initialized.");
      }

      switch (s7.n5(var1)) {
         case 2:
            this.k5 = new g7("custGeom", new u1s());
            break;
         case 3:
            this.k5 = new g7("prstGeom", new r7n());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.k5;
   }

   public final byte a6() {
      return this.n5;
   }

   public final void n5(byte var1) {
      this.n5 = var1;
   }

   public final e8b u9() {
      return this.l6;
   }

   public final g7 h0() {
      return this.k5;
   }

   public final void n5(g7 var1) {
      this.k5 = var1;
   }

   public final g7 c8() {
      return this.u3;
   }

   public final void l6(g7 var1) {
      this.u3 = var1;
   }

   public final r5w t2() {
      return this.a6;
   }

   public final g7 s7() {
      return this.u9;
   }

   public final void k5(g7 var1) {
      this.u9 = var1;
   }

   public final h6l x8() {
      return this.h0;
   }

   public final q9u n3() {
      return this.c8;
   }

   public final x8 y4() {
      return this.t2;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 e2() {
      return s7;
   }

   // $VF: synthetic method
   static byte n5(b9y var0, byte var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static e8b n5(b9y var0, e8b var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static g7 n5(b9y var0, g7 var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static g7 l6(b9y var0, g7 var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static r5w n5(b9y var0, r5w var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static g7 k5(b9y var0, g7 var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static h6l n5(b9y var0, h6l var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static q9u n5(b9y var0, q9u var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static l8r n5(b9y var0, l8r var1) {
      return var0.t2 = var1;
   }
}
