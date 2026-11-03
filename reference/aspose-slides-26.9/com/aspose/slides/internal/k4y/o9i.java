package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class o9i extends b3 {
   private a2w n5;
   private g7 l6;
   private u7 k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("tcBdr", "fill", "fillRef", "cell3D");

   public o9i(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new o9i$1(this, var1));
   }

   public o9i() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("a", var2, "tcBdr");
      }

      if (this.l6 != null) {
         switch (u3.n5(this.l6.n5())) {
            case 1:
               ((v2s)this.l6.k5()).n5("a", var2, this.l6.n5());
               break;
            case 2:
               ((x2y)this.l6.k5()).n5("a", var2, this.l6.n5());
         }
      }

      if (this.k5 != null) {
         this.k5.n5("a", var2, "cell3D");
      }

      var2.s7();
   }

   public final a2w n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <tcBdr> element can be added.");
      }

      this.n5 = new a2w();
      return this.n5;
   }

   public final void n5(u7 var1) {
      this.k5 = var1;
   }

   public final g7 n5(String var1) {
      if (this.l6 != null) {
         throw new Exception("ThemeableFillStyle already is initialized.");
      }

      switch (u3.n5(var1)) {
         case 1:
            this.l6 = new g7("fill", new v2s());
            break;
         case 2:
            this.l6 = new g7("fillRef", new x2y());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.l6;
   }

   public final a2w l6() {
      return this.n5;
   }

   public final g7 k5() {
      return this.l6;
   }

   public final u7 u3() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return u3;
   }

   // $VF: synthetic method
   static a2w n5(o9i var0, a2w var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static g7 n5(o9i var0, g7 var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static u7 n5(o9i var0, u7 var1) {
      return var0.k5 = var1;
   }
}
