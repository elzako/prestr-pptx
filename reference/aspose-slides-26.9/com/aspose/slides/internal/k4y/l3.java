package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class l3 extends b3 {
   private g7 n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "scrgbClr", "srgbClr", "hslClr", "sysClr", "schemeClr", "prstClr"
   );

   public l3(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new l3$1(this, var1));
   }

   public l3() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         switch (l6.n5(this.n5.n5())) {
            case 0:
               ((e4w)this.n5.k5()).n5("a", var2, this.n5.n5());
               break;
            case 1:
               ((e8p)this.n5.k5()).n5("a", var2, this.n5.n5());
               break;
            case 2:
               ((d0p)this.n5.k5()).n5("a", var2, this.n5.n5());
               break;
            case 3:
               ((s0i)this.n5.k5()).n5("a", var2, this.n5.n5());
               break;
            case 4:
               ((q4d)this.n5.k5()).n5("a", var2, this.n5.n5());
               break;
            case 5:
               ((x4a)this.n5.k5()).n5("a", var2, this.n5.n5());
         }
      }

      var2.s7();
   }

   public final g7 n5(String var1) {
      if (this.n5 != null) {
         throw new Exception("Color already is initialized.");
      }

      switch (l6.n5(var1)) {
         case 0:
            this.n5 = new g7("scrgbClr", new e4w());
            break;
         case 1:
            this.n5 = new g7("srgbClr", new e8p());
            break;
         case 2:
            this.n5 = new g7("hslClr", new d0p());
            break;
         case 3:
            this.n5 = new g7("sysClr", new s0i());
            break;
         case 4:
            this.n5 = new g7("schemeClr", new q4d());
            break;
         case 5:
            this.n5 = new g7("prstClr", new x4a());
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
   static g7 n5(l3 var0, g7 var1) {
      return var0.n5 = var1;
   }
}
