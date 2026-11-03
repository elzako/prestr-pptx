package com.aspose.slides;

class e5k {
   public static void n5(IErrorBarsFormat var0, com.aspose.slides.internal.k4y.y4g var1, t5w var2) {
      var0.setVisible(true);
      if (var1.c8() != null) {
         switch (var1.c8().n5()) {
            case 2:
               var0.setType(1);
               break;
            case 3:
               var0.setType(2);
               break;
            default:
               var0.setType(0);
         }
      }

      if (var1.t2() != null) {
         switch (var1.t2().n5()) {
            case 1:
               var0.setValueType(0);
               break;
            case 2:
            default:
               var0.setValueType(1);
               var0.setValue((float)var1.y4().n5());
               break;
            case 3:
               var0.setValueType(2);
               var0.setValue((float)var1.y4().n5());
               break;
            case 4:
               var0.setValueType(3);
               var0.setValue((float)var1.y4().n5());
               break;
            case 5:
               var0.setValueType(4);
         }
      }

      k5r.n5(var0.getFormat(), var1.e2(), var2);
      if (var1.s7() != null) {
         var0.setEndCap(!var1.s7().n5());
      }

      com.aspose.slides.internal.v6g.k5.n5(var0, ErrorBarsFormat.class).n5().n5(var1.t9());
   }

   public static void n5(IErrorBarsFormat var0, com.aspose.slides.internal.k4y.y4g var1, g6c var2) {
      switch (var0.getType()) {
         case 1:
            var1.c8().n5(2);
            break;
         case 2:
            var1.c8().n5(3);
            break;
         default:
            var1.c8().n5(1);
      }

      switch (var0.getValueType()) {
         case 0:
            var1.t2().n5(1);
            break;
         case 1:
            var1.t2().n5(2);
            var1.a6().n5(var0.getValue());
            break;
         case 2:
            var1.t2().n5(3);
            var1.a6().n5(var0.getValue());
            break;
         case 3:
            var1.t2().n5(4);
            var1.a6().n5(var0.getValue());
            break;
         case 4:
            var1.t2().n5(5);
      }

      var1.l6().n5(!var0.hasEndCap());
      k5r.n5(var0.getFormat(), new e5k$1(var1), var2, null, false);
      var1.n5(com.aspose.slides.internal.v6g.k5.n5(var0, ErrorBarsFormat.class).n5().n5());
   }
}
