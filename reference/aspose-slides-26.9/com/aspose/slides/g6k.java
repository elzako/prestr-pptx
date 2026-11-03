package com.aspose.slides;

class g6k {
   public static String n5(ILineFormatEffectiveData var0) {
      return var0.getStyle() != -1 && var0.getFillFormat().getFillType() == 1
         ? com.aspose.slides.ms.System.d1.n5("{0}px {1} {2}",new Object[]{ f7i.n5(var0.getWidth()), n5(var0.getDashStyle()), e2o.n5(((z1a)var0.getFillFormat()).u3().o8())})
         : "";
   }

   public static String n5(byte var0) {
      switch (var0) {
         case 1:
         case 8:
            return "dotted";
         case 2:
         case 3:
         case 7:
            return "dashed";
         case 4:
         case 5:
         case 6:
         default:
            return "solid";
      }
   }
}
