package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class k7m extends b3 {
   private String n5;
   private String l6;
   private g7 k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("ax:name", "ax:value", "font", "picture");

   public k7m(com.aspose.slides.ms.System.Xml.c7 var1) {
      k7m$1 var2 = new k7m$1(this);
      n5(var1, var2);
      n5(var1, new k7m$2(this, var1));
   }

   public k7m() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("ax:name", this.n5);
      if (this.l6 != null) {
         var2.l6("ax:value", this.l6);
      }

      if (this.k5 != null) {
         switch (u3.n5(this.k5.n5())) {
            case 2:
               ((v6s)this.k5.k5()).n5("ax", var2, this.k5.n5());
               break;
            case 3:
               ((f2i)this.k5.k5()).n5("ax", var2, this.k5.n5());
         }
      }

      var2.s7();
   }

   public final g7 n5(String var1) {
      if (this.k5 != null) {
         throw new Exception("FontOrPicture already is initialized.");
      }

      switch (u3.n5(var1)) {
         case 2:
            this.k5 = new g7("font", new v6s());
            break;
         case 3:
            this.k5 = new g7("picture", new f2i());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.k5;
   }

   public final String n5() {
      return this.n5;
   }

   public final void l6(String var1) {
      this.n5 = var1;
   }

   public final String l6() {
      return this.l6;
   }

   public final void k5(String var1) {
      this.l6 = var1;
   }

   public final g7 k5() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(k7m var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(k7m var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static g7 n5(k7m var0, g7 var1) {
      return var0.k5 = var1;
   }
}
