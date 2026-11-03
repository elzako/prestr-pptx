package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class w6 extends b3 {
   private g7 n5;
   private g7 l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9(
      "noFill", "solidFill", "gradFill", "blipFill", "pattFill", "grpFill", "effectLst", "effectDag"
   );

   public w6(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new w6$1(this, var1));
   }

   public w6() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         switch (k5.n5(this.n5.n5())) {
            case 0:
               ((u4k)this.n5.k5()).n5("a", var2, this.n5.n5());
               break;
            case 1:
               ((e2l)this.n5.k5()).n5("a", var2, this.n5.n5());
               break;
            case 2:
               ((j2p)this.n5.k5()).n5("a", var2, this.n5.n5());
               break;
            case 3:
               ((e3)this.n5.k5()).n5("a", var2, this.n5.n5());
               break;
            case 4:
               ((n9q)this.n5.k5()).n5("a", var2, this.n5.n5());
               break;
            case 5:
               ((r6i)this.n5.k5()).n5("a", var2, this.n5.n5());
         }
      }

      if (this.l6 != null) {
         switch (k5.n5(this.l6.n5())) {
            case 6:
               ((o9b)this.l6.k5()).n5("a", var2, this.l6.n5());
               break;
            case 7:
               ((f8y)this.l6.k5()).n5("a", var2, this.l6.n5());
         }
      }

      var2.s7();
   }

   public final g7 n5(String var1) {
      if (this.l6 != null) {
         throw new Exception("EffectProperties already is initialized.");
      }

      switch (k5.n5(var1)) {
         case 6:
            this.l6 = new g7("effectLst", new o9b());
            break;
         case 7:
            this.l6 = new g7("effectDag", new f8y());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.l6;
   }

   public final g7 l6(String var1) {
      if (this.n5 != null) {
         throw new Exception("FillProperties already is initialized.");
      }

      switch (k5.n5(var1)) {
         case 0:
            this.n5 = new g7("noFill", new u4k());
            break;
         case 1:
            this.n5 = new g7("solidFill", new e2l());
            break;
         case 2:
            this.n5 = new g7("gradFill", new j2p());
            break;
         case 3:
            this.n5 = new g7("blipFill", new e3());
            break;
         case 4:
            this.n5 = new g7("pattFill", new n9q());
            break;
         case 5:
            this.n5 = new g7("grpFill", new r6i());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.n5;
   }

   public final g7 n5() {
      return this.n5;
   }

   public final g7 l6() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static g7 n5(w6 var0, g7 var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static g7 l6(w6 var0, g7 var1) {
      return var0.l6 = var1;
   }
}
