package com.aspose.slides.internal.k4y;

class r6o$1 extends b3$k5 {
   // $VF: synthetic field
   final com.aspose.slides.ms.System.Xml.c7 n5;
   // $VF: synthetic field
   final r6o l6;

   r6o$1(r6o var1, com.aspose.slides.ms.System.Xml.c7 var2) {
      this.l6 = var1;
      this.n5 = var2;
   }

   @Override
   public boolean n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      switch (r6o.l6().n5(this.n5.n3())) {
         case 0:
            r6o.n5(this.l6, new g7("lineSketchNone", new d3c(this.n5)));
            break;
         case 1:
            r6o.n5(this.l6, new g7("lineSketchCurved", new d3c(this.n5)));
            break;
         case 2:
            r6o.n5(this.l6, new g7("lineSketchFreehand", new d3c(this.n5)));
            break;
         case 3:
            r6o.n5(this.l6, new g7("lineSketchScribble", new d3c(this.n5)));
            break;
         default:
            return false;
      }

      return true;
   }
}
