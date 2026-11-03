package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class k5w extends b3 {
   private int k5;
   private int u3;
   private g7 a6;
   private g7 u9;
   private l8r h0;
   public static final int n5 = a1.n5("def");
   public static final int l6 = a1.n5("def");
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "b", "i", "font", "fontRef", "scrgbClr", "srgbClr", "hslClr", "sysClr", "schemeClr", "prstClr", "extLst"
   );

   public k5w(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.h0();
      k5w$1 var2 = new k5w$1(this);
      n5(var1, var2);
      n5(var1, new k5w$2(this, var1));
   }

   public k5w() {
      this.h0();
   }

   private void h0() {
      this.k5 = n5;
      this.u3 = l6;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.k5 != n5) {
         var2.l6("b", a1.n5(this.k5));
      }

      if (this.u3 != l6) {
         var2.l6("i", a1.n5(this.u3));
      }

      if (this.a6 != null) {
         switch (c8.n5(this.a6.n5())) {
            case 2:
               ((p4l)this.a6.k5()).n5("a", var2, this.a6.n5());
               break;
            case 3:
               ((p6t)this.a6.k5()).n5("a", var2, this.a6.n5());
         }
      }

      if (this.u9 != null) {
         switch (c8.n5(this.u9.n5())) {
            case 4:
               ((e4w)this.u9.k5()).n5("a", var2, this.u9.n5());
               break;
            case 5:
               ((e8p)this.u9.k5()).n5("a", var2, this.u9.n5());
               break;
            case 6:
               ((d0p)this.u9.k5()).n5("a", var2, this.u9.n5());
               break;
            case 7:
               ((s0i)this.u9.k5()).n5("a", var2, this.u9.n5());
               break;
            case 8:
               ((q4d)this.u9.k5()).n5("a", var2, this.u9.n5());
               break;
            case 9:
               ((x4a)this.u9.k5()).n5("a", var2, this.u9.n5());
         }
      }

      if (this.h0 != null) {
         this.h0.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(x8 var1) {
      this.h0 = (l8r)var1;
   }

   public final g7 n5(String var1) {
      if (this.u9 != null) {
         throw new Exception("Color already is initialized.");
      }

      switch (c8.n5(var1)) {
         case 4:
            this.u9 = new g7("scrgbClr", new e4w());
            break;
         case 5:
            this.u9 = new g7("srgbClr", new e8p());
            break;
         case 6:
            this.u9 = new g7("hslClr", new d0p());
            break;
         case 7:
            this.u9 = new g7("sysClr", new s0i());
            break;
         case 8:
            this.u9 = new g7("schemeClr", new q4d());
            break;
         case 9:
            this.u9 = new g7("prstClr", new x4a());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.u9;
   }

   public final g7 l6(String var1) {
      if (this.a6 != null) {
         throw new Exception("ThemeableFontStyles already is initialized.");
      }

      switch (c8.n5(var1)) {
         case 2:
            this.a6 = new g7("font", new p4l());
            break;
         case 3:
            this.a6 = new g7("fontRef", new p6t());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.a6;
   }

   public final int n5() {
      return this.k5;
   }

   public final void n5(int var1) {
      this.k5 = var1;
   }

   public final int l6() {
      return this.u3;
   }

   public final void l6(int var1) {
      this.u3 = var1;
   }

   public final g7 k5() {
      return this.a6;
   }

   public final g7 u3() {
      return this.u9;
   }

   public final x8 a6() {
      return this.h0;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return c8;
   }

   // $VF: synthetic method
   static int n5(k5w var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int l6(k5w var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static g7 n5(k5w var0, g7 var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static g7 l6(k5w var0, g7 var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static l8r n5(k5w var0, l8r var1) {
      return var0.h0 = var1;
   }
}
