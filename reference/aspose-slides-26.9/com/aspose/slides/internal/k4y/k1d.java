package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class k1d extends b3 {
   private int n5;
   private g7 l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9(
      "blend", "noFill", "solidFill", "gradFill", "blipFill", "pattFill", "grpFill"
   );

   public k1d(com.aspose.slides.ms.System.Xml.c7 var1) {
      k1d$1 var2 = new k1d$1(this);
      n5(var1, var2);
      n5(var1, new k1d$2(this, var1));
   }

   public k1d() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("blend", h6.n5(this.n5));
      if (this.l6 != null) {
         switch (k5.n5(this.l6.n5())) {
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

      var2.s7();
   }

   public final g7 n5(String var1) {
      if (this.l6 != null) {
         throw new Exception("FillProperties already is initialized.");
      }

      switch (k5.n5(var1)) {
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

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final g7 l6() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static int n5(k1d var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static g7 n5(k1d var0, g7 var1) {
      return var0.l6 = var1;
   }
}
