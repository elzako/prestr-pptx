package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class n5u extends b3 {
   private byte n5;
   private b8c l6;
   private g7 k5;
   private g7 u3;
   private h6l a6;
   private l8r u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "bwMode", "xfrm", "noFill", "solidFill", "gradFill", "blipFill", "pattFill", "grpFill", "effectLst", "effectDag", "scene3d", "extLst"
   );

   public n5u(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.c8();
      n5u$1 var2 = new n5u$1(this);
      n5(var1, var2);
      n5(var1, new n5u$2(this, var1));
   }

   public n5u() {
      this.c8();
   }

   private void c8() {
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
         switch (h0.n5(this.k5.n5())) {
            case 2:
               ((u4k)this.k5.k5()).n5("a", var2, this.k5.n5());
               break;
            case 3:
               ((e2l)this.k5.k5()).n5("a", var2, this.k5.n5());
               break;
            case 4:
               ((j2p)this.k5.k5()).n5("a", var2, this.k5.n5());
               break;
            case 5:
               ((e3)this.k5.k5()).n5("a", var2, this.k5.n5());
               break;
            case 6:
               ((n9q)this.k5.k5()).n5("a", var2, this.k5.n5());
               break;
            case 7:
               ((r6i)this.k5.k5()).n5("a", var2, this.k5.n5());
         }
      }

      if (this.u3 != null) {
         switch (h0.n5(this.u3.n5())) {
            case 8:
               ((o9b)this.u3.k5()).n5("a", var2, this.u3.n5());
               break;
            case 9:
               ((f8y)this.u3.k5()).n5("a", var2, this.u3.n5());
         }
      }

      if (this.a6 != null) {
         this.a6.n5("a", var2, "scene3d");
      }

      if (this.u9 != null) {
         this.u9.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final b8c n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <xfrm> element can be added.");
      }

      this.l6 = new b8c();
      return this.l6;
   }

   public final h6l l6() {
      if (this.a6 != null) {
         throw new Exception("Only one <scene3d> element can be added.");
      }

      this.a6 = new h6l();
      return this.a6;
   }

   public final g7 n5(String var1) {
      if (this.u3 != null) {
         throw new Exception("EffectProperties already is initialized.");
      }

      switch (h0.n5(var1)) {
         case 8:
            this.u3 = new g7("effectLst", new o9b());
            break;
         case 9:
            this.u3 = new g7("effectDag", new f8y());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.u3;
   }

   public final g7 l6(String var1) {
      if (this.k5 != null) {
         throw new Exception("FillProperties already is initialized.");
      }

      switch (h0.n5(var1)) {
         case 2:
            this.k5 = new g7("noFill", new u4k());
            break;
         case 3:
            this.k5 = new g7("solidFill", new e2l());
            break;
         case 4:
            this.k5 = new g7("gradFill", new j2p());
            break;
         case 5:
            this.k5 = new g7("blipFill", new e3());
            break;
         case 6:
            this.k5 = new g7("pattFill", new n9q());
            break;
         case 7:
            this.k5 = new g7("grpFill", new r6i());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.k5;
   }

   public final b8c k5() {
      return this.l6;
   }

   public final g7 u3() {
      return this.k5;
   }

   public final g7 a6() {
      return this.u3;
   }

   public final h6l u9() {
      return this.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 h0() {
      return h0;
   }

   // $VF: synthetic method
   static byte n5(n5u var0, byte var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static b8c n5(n5u var0, b8c var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static g7 n5(n5u var0, g7 var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static g7 l6(n5u var0, g7 var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static h6l n5(n5u var0, h6l var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static l8r n5(n5u var0, l8r var1) {
      return var0.u9 = var1;
   }
}
