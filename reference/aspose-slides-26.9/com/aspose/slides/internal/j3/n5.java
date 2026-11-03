package com.aspose.slides.internal.j3;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;

public class n5 implements IGenericEnumerable<KeyValuePair<String, Object>>, c8 {
   private n5$n5 n5 = new n5$n5(null);
   private Dictionary<String, Object> l6 = new Dictionary<>();

   public n5() {
      this.n5.l6("error-handler");
      this.n5.l6("format-pretty-print");
      this.n5("format-pretty-print", false);
   }

   public final void n5(String var1, Object var2) {
      if (!this.l6(var1, var2)) {
         throw new l6((byte)9);
      }

      if (this.l6.containsKey(var1)) {
         this.l6.set_Item(var1, var2);
      } else {
         this.l6.addItem(var1, var2);
      }
   }

   @Override
   public final Object n5(String var1) {
      if (!this.n5().n5(var1)) {
         throw new l6((byte)8);
      } else {
         return this.l6.containsKey(var1) ? this.l6.get_Item(var1) : null;
      }
   }

   public final boolean l6(String var1, Object var2) {
      return this.n5().n5(var1);
   }

   public final t9 n5() {
      return this.n5;
   }

   @Override
   public final IGenericEnumerator<KeyValuePair<String, Object>> iterator() {
      return this.l6.iterator();
   }
}
