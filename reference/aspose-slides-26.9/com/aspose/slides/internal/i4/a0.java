package com.aspose.slides.internal.i4;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;

public class a0 implements o5 {
   private Dictionary<String, y2> n5 = new Dictionary<>(5);

   @Override
   public final y2 n5(String var1, y2 var2) {
      this.n5.set_Item(var1, var2);
      return var2;
   }

   @Override
   public final void n5(String var1) {
      this.n5.removeItemByKey(var1);
   }

   @Override
   public final y2 l6(String var1) {
      Object var2 = null;
      y2[] var3 = new y2[]{(y2)var2};
      this.n5(var1, var3);
      return var3[0];
   }

   @Override
   public final boolean n5(String var1, y2[] var2) {
      var2[0] = null;
      boolean var3 = this.n5.containsKey(var1);
      if (var3) {
         var2[0] = this.n5.get_Item(var1);
      }

      return var3;
   }

   @Override
   public final IGenericEnumerable<y2> n5() {
      return this.n5.getValues();
   }

   @Override
   public final IGenericEnumerator<KeyValuePair<String, y2>> iterator() {
      return this.n5.iterator();
   }
}
