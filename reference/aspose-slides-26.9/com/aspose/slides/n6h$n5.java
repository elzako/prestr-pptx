package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericDictionary;

class n6h$n5 {
   private final IGenericDictionary<String, String>[] n5;

   public n6h$n5(IGenericDictionary<String, String>[] var1) {
      this.n5 = var1;
   }

   public final String n5(String var1) {
      for (int var2 = 0; var2 < this.n5.length; var2++) {
         String var3 = null;
         String[] var4 = new String[]{var3};
         boolean var5 = this.n5[var2].tryGetValue(var1, var4);
         var3 = var4[0];
         if (var5) {
            return var3;
         }
      }

      return null;
   }

   final boolean l6(String var1) {
      for (int var2 = 0; var2 < this.n5.length; var2++) {
         if (this.n5[var2].containsKey(var1)) {
            return true;
         }
      }

      return false;
   }
}
