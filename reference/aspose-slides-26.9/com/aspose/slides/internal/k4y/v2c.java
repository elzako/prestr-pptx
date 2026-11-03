package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class v2c extends b3 {
   private g7 n5;
   private s0c l6;
   private a9t k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("custUnit", "builtInUnit", "dispUnitsLbl", "extLst");

   public v2c(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new v2c$1(this, var1));
   }

   public v2c() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         switch (u3.n5(this.n5.n5())) {
            case 0:
               ((x8w)this.n5.k5()).n5("c", var2, this.n5.n5());
               break;
            case 1:
               ((l3a)this.n5.k5()).n5("c", var2, this.n5.n5());
         }
      }

      if (this.l6 != null) {
         this.l6.n5("c", var2, "dispUnitsLbl");
      }

      if (this.k5 != null) {
         this.k5.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   public final s0c n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <dispUnitsLbl> element can be added.");
      }

      this.l6 = new s0c();
      return this.l6;
   }

   public final void n5(x8 var1) {
      this.k5 = (a9t)var1;
   }

   public final g7 n5(String var1) {
      if (this.n5 != null) {
         throw new Exception("DisplayUnit already is initialized.");
      }

      switch (u3.n5(var1)) {
         case 0:
            this.n5 = new g7("custUnit", new x8w());
            break;
         case 1:
            this.n5 = new g7("builtInUnit", new l3a());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.n5;
   }

   public final g7 l6() {
      return this.n5;
   }

   public final s0c k5() {
      return this.l6;
   }

   public final x8 u3() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return u3;
   }

   // $VF: synthetic method
   static g7 n5(v2c var0, g7 var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static s0c n5(v2c var0, s0c var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static a9t n5(v2c var0, a9t var1) {
      return var0.k5 = var1;
   }
}
