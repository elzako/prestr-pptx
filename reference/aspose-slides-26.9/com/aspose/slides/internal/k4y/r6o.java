package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class r6o extends b3 {
   private g7 n5;
   private static final com.aspose.slides.internal.v6g.u9 l6 = new com.aspose.slides.internal.v6g.u9(
      "lineSketchNone", "lineSketchCurved", "lineSketchFreehand", "lineSketchScribble"
   );

   public r6o(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new r6o$1(this, var1));
   }

   public r6o() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         switch (l6.n5(this.n5.n5())) {
            case 0:
               ((d3c)this.n5.k5()).n5("ask", var2, this.n5.n5());
               break;
            case 1:
               ((d3c)this.n5.k5()).n5("ask", var2, this.n5.n5());
               break;
            case 2:
               ((d3c)this.n5.k5()).n5("ask", var2, this.n5.n5());
               break;
            case 3:
               ((d3c)this.n5.k5()).n5("ask", var2, this.n5.n5());
         }
      }

      var2.s7();
   }

   public final g7 n5(String var1) {
      if (this.n5 != null) {
         throw new Exception("LineSketchType already is initialized.");
      }

      switch (l6.n5(var1)) {
         case 0:
            this.n5 = new g7("lineSketchNone", new d3c());
            break;
         case 1:
            this.n5 = new g7("lineSketchCurved", new d3c());
            break;
         case 2:
            this.n5 = new g7("lineSketchFreehand", new d3c());
            break;
         case 3:
            this.n5 = new g7("lineSketchScribble", new d3c());
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
   static g7 n5(r6o var0, g7 var1) {
      return var0.n5 = var1;
   }
}
