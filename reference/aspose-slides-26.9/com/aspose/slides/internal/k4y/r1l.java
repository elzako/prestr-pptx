package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class r1l extends b3 {
   private g7 n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "text", "drawing", "presentation", "spreadsheet", "chart", "image"
   );

   public r1l(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new r1l$1(this, var1));
   }

   public r1l() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         switch (l6.n5(this.n5.n5())) {
            case 0:
               ((x2d)this.n5.k5()).n5("office", var2, this.n5.n5());
               break;
            case 1:
               ((k3k)this.n5.k5()).n5("office", var2, this.n5.n5());
               break;
            case 2:
               ((l4i)this.n5.k5()).n5("office", var2, this.n5.n5());
               break;
            case 3:
               ((c2p)this.n5.k5()).n5("office", var2, this.n5.n5());
               break;
            case 4:
               ((a5l)this.n5.k5()).n5("office", var2, this.n5.n5());
               break;
            case 5:
               ((h5z)this.n5.k5()).n5("office", var2, this.n5.n5());
         }
      }

      var2.s7();
   }

   public final g7 n5(String var1) {
      if (this.n5 != null) {
         throw new Exception("Body already is initialized.");
      }

      switch (l6.n5(var1)) {
         case 0:
            this.n5 = new g7("text", new x2d());
            break;
         case 1:
            this.n5 = new g7("drawing", new k3k());
            break;
         case 2:
            this.n5 = new g7("presentation", new l4i());
            break;
         case 3:
            this.n5 = new g7("spreadsheet", new c2p());
            break;
         case 4:
            this.n5 = new g7("chart", new a5l());
            break;
         case 5:
            this.n5 = new g7("image", new h5z());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.n5;
   }

   public final g7 n5() {
      return this.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return l6;
   }

   // $VF: synthetic method
   static g7 n5(r1l var0, g7 var1) {
      return var0.n5 = var1;
   }
}
