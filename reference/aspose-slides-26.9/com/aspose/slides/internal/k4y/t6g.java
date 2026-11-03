package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class t6g extends b3 {
   private c3d n5;
   private p6k l6;
   private g7 k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9(
      "docMk", "sldMk", "spMk", "grpSpMk", "graphicFrameMk", "cxnSpMk", "picMk", "inkMk"
   );

   public t6g(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new t6g$1(this, var1));
   }

   public t6g() {
      this.n5 = new c3d();
      this.l6 = new p6k();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("ac", var3, "http://schemas.microsoft.com/office/drawing/2013/main/command");
      if (var2.n5("http://schemas.microsoft.com/office/powerpoint/2013/main/command") == null) {
         var2.u3("xmlns", "pc", null, "http://schemas.microsoft.com/office/powerpoint/2013/main/command");
      }

      this.n5.n5("ac", var2, "docMk");
      this.l6.n5("ac", var2, "sldMk");
      if (this.k5 != null) {
         switch (u3.n5(this.k5.n5())) {
            case 2:
               ((o9n)this.k5.k5()).n5("ac", var2, this.k5.n5());
               break;
            case 3:
               ((o9n)this.k5.k5()).n5("ac", var2, this.k5.n5());
               break;
            case 4:
               ((o9n)this.k5.k5()).n5("ac", var2, this.k5.n5());
               break;
            case 5:
               ((o9n)this.k5.k5()).n5("ac", var2, this.k5.n5());
               break;
            case 6:
               ((o9n)this.k5.k5()).n5("ac", var2, this.k5.n5());
               break;
            case 7:
               ((o9n)this.k5.k5()).n5("ac", var2, this.k5.n5());
         }
      }

      var2.s7();
   }

   public final g7 n5(String var1) {
      if (this.k5 != null) {
         throw new Exception("ShapeMonikerType already is initialized.");
      }

      switch (u3.n5(var1)) {
         case 2:
            this.k5 = new g7("spMk", new o9n());
            break;
         case 3:
            this.k5 = new g7("grpSpMk", new o9n());
            break;
         case 4:
            this.k5 = new g7("graphicFrameMk", new o9n());
            break;
         case 5:
            this.k5 = new g7("cxnSpMk", new o9n());
            break;
         case 6:
            this.k5 = new g7("picMk", new o9n());
            break;
         case 7:
            this.k5 = new g7("inkMk", new o9n());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.k5;
   }

   public final p6k n5() {
      return this.l6;
   }

   public final g7 l6() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return u3;
   }

   // $VF: synthetic method
   static c3d n5(t6g var0, c3d var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static p6k n5(t6g var0, p6k var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static g7 n5(t6g var0, g7 var1) {
      return var0.k5 = var1;
   }
}
