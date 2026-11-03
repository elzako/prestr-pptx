package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class x2y extends b3 {
   private long n5;
   private g7 l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9(
      "idx", "scrgbClr", "srgbClr", "hslClr", "sysClr", "schemeClr", "prstClr"
   );

   public x2y(com.aspose.slides.ms.System.Xml.c7 var1) {
      x2y$1 var2 = new x2y$1(this);
      n5(var1, var2);
      n5(var1, new x2y$2(this, var1));
   }

   public x2y() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      if (!"a".equals(var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main"))) {
         var2.n5(var1, var3, "http://schemas.openxmlformats.org/drawingml/2006/main");
      } else {
         var2.n5(var1, var3, null);
      }

      var2.l6("idx", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      if (this.l6 != null) {
         switch (k5.n5(this.l6.n5())) {
            case 1:
               ((e4w)this.l6.k5()).n5("a", var2, this.l6.n5());
               break;
            case 2:
               ((e8p)this.l6.k5()).n5("a", var2, this.l6.n5());
               break;
            case 3:
               ((d0p)this.l6.k5()).n5("a", var2, this.l6.n5());
               break;
            case 4:
               ((s0i)this.l6.k5()).n5("a", var2, this.l6.n5());
               break;
            case 5:
               ((q4d)this.l6.k5()).n5("a", var2, this.l6.n5());
               break;
            case 6:
               ((x4a)this.l6.k5()).n5("a", var2, this.l6.n5());
         }
      }

      var2.s7();
   }

   public final g7 n5(String var1) {
      if (this.l6 != null) {
         throw new Exception("Color already is initialized.");
      }

      switch (k5.n5(var1)) {
         case 1:
            this.l6 = new g7("scrgbClr", new e4w());
            break;
         case 2:
            this.l6 = new g7("srgbClr", new e8p());
            break;
         case 3:
            this.l6 = new g7("hslClr", new d0p());
            break;
         case 4:
            this.l6 = new g7("sysClr", new s0i());
            break;
         case 5:
            this.l6 = new g7("schemeClr", new q4d());
            break;
         case 6:
            this.l6 = new g7("prstClr", new x4a());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.l6;
   }

   public final long n5() {
      return this.n5;
   }

   public final void n5(long var1) {
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
   static long n5(x2y var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static g7 n5(x2y var0, g7 var1) {
      return var0.l6 = var1;
   }
}
