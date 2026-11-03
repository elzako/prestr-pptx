package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class v2s extends b3 {
   private g7 n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "noFill", "solidFill", "gradFill", "blipFill", "pattFill", "grpFill"
   );

   public v2s(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new v2s$1(this, var1));
   }

   public v2s() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      if (!"a".equals(var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main"))) {
         var2.n5(var1, var3, "http://schemas.openxmlformats.org/drawingml/2006/main");
      } else {
         var2.n5(var1, var3, null);
      }

      if (this.n5 != null) {
         switch (l6.n5(this.n5.n5())) {
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

      var2.s7();
   }

   public final g7 n5(String var1) {
      if (this.n5 != null) {
         throw new Exception("FillProperties already is initialized.");
      }

      switch (l6.n5(var1)) {
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

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return l6;
   }

   // $VF: synthetic method
   static g7 n5(v2s var0, g7 var1) {
      return var0.n5 = var1;
   }
}
