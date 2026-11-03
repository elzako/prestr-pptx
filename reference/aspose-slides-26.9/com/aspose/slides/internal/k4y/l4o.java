package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class l4o extends b3 {
   private g7 n5;
   private g7 l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("fill", "fillRef", "effect", "effectRef");

   public l4o(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new l4o$1(this, var1));
   }

   public l4o() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         switch (k5.n5(this.n5.n5())) {
            case 0:
               ((v2s)this.n5.k5()).n5("a", var2, this.n5.n5());
               break;
            case 1:
               ((x2y)this.n5.k5()).n5("a", var2, this.n5.n5());
         }
      }

      if (this.l6 != null) {
         switch (k5.n5(this.l6.n5())) {
            case 2:
               ((x4g)this.l6.k5()).n5("a", var2, this.l6.n5());
               break;
            case 3:
               ((x2y)this.l6.k5()).n5("a", var2, this.l6.n5());
         }
      }

      var2.s7();
   }

   public final g7 n5(String var1) {
      if (this.l6 != null) {
         throw new Exception("ThemeableEffectStyle already is initialized.");
      }

      switch (k5.n5(var1)) {
         case 2:
            this.l6 = new g7("effect", new x4g());
            break;
         case 3:
            this.l6 = new g7("effectRef", new x2y());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.l6;
   }

   public final g7 l6(String var1) {
      if (this.n5 != null) {
         throw new Exception("ThemeableFillStyle already is initialized.");
      }

      switch (k5.n5(var1)) {
         case 0:
            this.n5 = new g7("fill", new v2s());
            break;
         case 1:
            this.n5 = new g7("fillRef", new x2y());
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
   static g7 n5(l4o var0, g7 var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static g7 l6(l4o var0, g7 var1) {
      return var0.l6 = var1;
   }
}
