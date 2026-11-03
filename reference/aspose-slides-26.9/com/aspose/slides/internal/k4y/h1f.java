package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class h1f extends b3 {
   private String n5;
   private g7 l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("spid", "bg", "subSp", "oleChartEl", "txEl", "graphicEl");

   public h1f(com.aspose.slides.ms.System.Xml.c7 var1) {
      h1f$1 var2 = new h1f$1(this);
      n5(var1, var2);
      n5(var1, new h1f$2(this, var1));
   }

   public h1f() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("spid", this.n5);
      if (this.l6 != null) {
         switch (k5.n5(this.l6.n5())) {
            case 1:
               ((e0j)this.l6.k5()).n5("p", var2, this.l6.n5());
               break;
            case 2:
               ((y7r)this.l6.k5()).n5("p", var2, this.l6.n5());
               break;
            case 3:
               ((v4l)this.l6.k5()).n5("p", var2, this.l6.n5());
               break;
            case 4:
               ((t4n)this.l6.k5()).n5("p", var2, this.l6.n5());
               break;
            case 5:
               ((f3)this.l6.k5()).n5("p", var2, this.l6.n5());
         }
      }

      var2.s7();
   }

   public final g7 n5(String var1) {
      if (this.l6 != null) {
         throw new Exception("TargetShape already is initialized.");
      }

      switch (k5.n5(var1)) {
         case 1:
            this.l6 = new g7("bg", new e0j());
            break;
         case 2:
            this.l6 = new g7("subSp", new y7r());
            break;
         case 3:
            this.l6 = new g7("oleChartEl", new v4l());
            break;
         case 4:
            this.l6 = new g7("txEl", new t4n());
            break;
         case 5:
            this.l6 = new g7("graphicEl", new f3());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.l6;
   }

   public final String n5() {
      return this.n5;
   }

   public final void l6(String var1) {
      this.n5 = var1;
   }

   public final g7 l6() {
      return this.l6;
   }

   public final void n5(g7 var1) {
      this.l6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(h1f var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static g7 n5(h1f var0, g7 var1) {
      return var0.l6 = var1;
   }
}
