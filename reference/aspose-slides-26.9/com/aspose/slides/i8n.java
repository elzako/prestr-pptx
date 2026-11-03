package com.aspose.slides;

class i8n extends a8m<IColorOperationCollection, i8n> {
   public static final i8n n5 = new i8n();

   protected boolean n5(IColorOperationCollection var1, IColorOperationCollection var2) {
      if (var1.size() != var2.size()) {
         return false;
      }

      for (int var3 = 0; var3 < var1.size(); var3++) {
         IColorOperation var4 = var1.get_Item(var3);
         IColorOperation var5 = var2.get_Item(var3);
         if (!k0y.n5.equals(var4, var5)) {
            return false;
         }
      }

      return true;
   }

   protected int n5(IColorOperationCollection var1) {
      if (var1.size() == 0) {
         return 0;
      }

      int var2 = 17;

      for (int var3 = 0; var3 < var1.size(); var3++) {
         var2 = var2 * 486187739 + k0y.n5.l6(var1.get_Item(var3));
      }

      return var2;
   }
}
