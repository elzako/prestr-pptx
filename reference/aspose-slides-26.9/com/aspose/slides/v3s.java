package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

class v3s {
   private final Dictionary<Object, Integer> n5 = new Dictionary<>();
   private final List<Integer> l6 = new List<>();

   public final int n5(ILinkEmbedController var1, Object var2, byte[] var3, String var4, String var5, String var6, int[] var7) {
      int var8 = 0;
      Integer[] var9 = new Integer[]{var8};
      boolean var10 = this.n5.tryGetValue(var2, var9);
      var8 = var9[0];
      if (var10) {
         var7[0] = this.l6.get_Item(var8 - 1);
         return var8;
      } else {
         var7[0] = var1.getObjectStoringLocation(this.l6.size() + 1, var3, var4, var5, var6);
         this.l6.addItem(var7[0]);
         this.n5.set_Item(var2, this.l6.size());
         return this.l6.size();
      }
   }
}
