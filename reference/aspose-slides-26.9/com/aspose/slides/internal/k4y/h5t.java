package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class h5t extends b3 {
   private boolean n5;
   private g7 l6;
   private g7 k5;
   private y1g u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "shadeToTitle", "noFill", "solidFill", "gradFill", "blipFill", "pattFill", "grpFill", "effectLst", "effectDag", "extLst"
   );

   public h5t(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      h5t$1 var2 = new h5t$1(this);
      n5(var1, var2);
      n5(var1, new h5t$2(this, var1));
   }

   public h5t() {
      this.u9();
   }

   private void u9() {
      this.n5 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5) {
         var2.l6("shadeToTitle", this.n5 ? "1" : "0");
      }

      if (this.l6 != null) {
         switch (a6.n5(this.l6.n5())) {
            case 1:
               ((u4k)this.l6.k5()).n5("a", var2, this.l6.n5());
               break;
            case 2:
               ((e2l)this.l6.k5()).n5("a", var2, this.l6.n5());
               break;
            case 3:
               ((j2p)this.l6.k5()).n5("a", var2, this.l6.n5());
               break;
            case 4:
               ((e3)this.l6.k5()).n5("a", var2, this.l6.n5());
               break;
            case 5:
               ((n9q)this.l6.k5()).n5("a", var2, this.l6.n5());
               break;
            case 6:
               ((r6i)this.l6.k5()).n5("a", var2, this.l6.n5());
         }
      }

      if (this.k5 != null) {
         switch (a6.n5(this.k5.n5())) {
            case 7:
               ((o9b)this.k5.k5()).n5("a", var2, this.k5.n5());
               break;
            case 8:
               ((f8y)this.k5.k5()).n5("a", var2, this.k5.n5());
         }
      }

      if (this.u3 != null) {
         this.u3.n5("p", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(x8 var1) {
      this.u3 = (y1g)var1;
   }

   public final g7 n5(String var1) {
      if (this.k5 != null) {
         throw new Exception("EffectProperties already is initialized.");
      }

      switch (a6.n5(var1)) {
         case 7:
            this.k5 = new g7("effectLst", new o9b());
            break;
         case 8:
            this.k5 = new g7("effectDag", new f8y());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.k5;
   }

   public final g7 l6(String var1) {
      if (this.l6 != null) {
         throw new Exception("FillProperties already is initialized.");
      }

      switch (a6.n5(var1)) {
         case 1:
            this.l6 = new g7("noFill", new u4k());
            break;
         case 2:
            this.l6 = new g7("solidFill", new e2l());
            break;
         case 3:
            this.l6 = new g7("gradFill", new j2p());
            break;
         case 4:
            this.l6 = new g7("blipFill", new e3());
            break;
         case 5:
            this.l6 = new g7("pattFill", new n9q());
            break;
         case 6:
            this.l6 = new g7("grpFill", new r6i());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.l6;
   }

   public final boolean n5() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   public final g7 l6() {
      return this.l6;
   }

   public final g7 k5() {
      return this.k5;
   }

   public final x8 u3() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return a6;
   }

   // $VF: synthetic method
   static boolean n5(h5t var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static g7 n5(h5t var0, g7 var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static g7 l6(h5t var0, g7 var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static y1g n5(h5t var0, y1g var1) {
      return var0.u3 = var1;
   }
}
