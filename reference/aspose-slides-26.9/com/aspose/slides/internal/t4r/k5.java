package com.aspose.slides.internal.t4r;

import com.aspose.slides.Collections.Generic.KeyValuePair;

public class k5<TKey, TValue extends l6> extends n5<TKey, TValue> {
   private final long l6;

   public k5(Class<TKey> var1, Class<TValue> var2, long var3) {
      super(var1, var2, Integer.MAX_VALUE);
      this.l6 = var3;
   }

   @Override
   protected void u3() {
      while (this.l6 < this.u9() && this.n5.size() > 1) {
         this.a6();
      }
   }

   public final long u9() {
      long var1 = 0L;

      for (Object recoveredElement$var4$519 : this.n5) {
         KeyValuePair var4 = (KeyValuePair)recoveredElement$var4$519;
         var1 += ((l6)((n5$l6)var4.getValue()).l6()).getWeight();
      }

      return var1;
   }
}
