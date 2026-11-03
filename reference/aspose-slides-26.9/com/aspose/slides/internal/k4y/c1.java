package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class c1 extends b3 {
   private g7 n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9("masterClrMapping", "overrideClrMapping");

   public c1(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new c1$1(this, var1));
   }

   public c1() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         switch (l6.n5(this.n5.n5())) {
            case 0:
               ((z0k)this.n5.k5()).n5("a", var2, this.n5.n5());
               break;
            case 1:
               ((d0)this.n5.k5()).n5("a", var2, this.n5.n5());
         }
      }

      var2.s7();
   }

   public final g7 n5(String var1) {
      if (this.n5 != null) {
         throw new Exception("ColorMappingOverride already is initialized.");
      }

      switch (l6.n5(var1)) {
         case 0:
            this.n5 = new g7("masterClrMapping", new z0k());
            break;
         case 1:
            this.n5 = new g7("overrideClrMapping", new d0());
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
   static g7 n5(c1 var0, g7 var1) {
      return var0.n5 = var1;
   }
}
