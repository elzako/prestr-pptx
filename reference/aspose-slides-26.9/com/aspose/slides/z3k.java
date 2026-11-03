package com.aspose.slides;

class z3k extends a8m<IGradientStopCollection, z3k> {
   public static final z3k n5 = new z3k();

   protected boolean n5(IGradientStopCollection var1, IGradientStopCollection var2) {
      if (var1.size() != var2.size()) {
         return false;
      }

      for (int var3 = 0; var3 < var1.size(); var3++) {
         IGradientStop var4 = var1.get_Item(var3);
         IGradientStop var5 = var2.get_Item(var3);
         if (!p1n.n5.equals(var4, var5)) {
            return false;
         }
      }

      return true;
   }

   protected int n5(IGradientStopCollection var1) {
      if (var1.size() == 0) {
         return 0;
      }

      int var2 = 17;

      for (int var3 = 0; var3 < var1.size(); var3++) {
         var2 = var2 * 486187739 + p1n.n5.l6(var1.get_Item(var3));
      }

      return var2;
   }
}
