package com.aspose.slides.internal.k3h;

import com.aspose.slides.internal.l1b.l6;
import com.aspose.slides.internal.l1b.u3;
import java.awt.RenderingHints.Key;
import java.util.Map;

public final class n5 extends Key {
   private String n5;

   public n5(int var1, String var2) {
      super(var1);
      this.n5 = var2;
   }

   @Override
   public boolean isCompatibleValue(Object val) {
      if (this.intKey() != 1 || !(val instanceof Map) && !(val instanceof l6)) {
         return this.intKey() == 1 && val instanceof u3 ? true : this.intKey() == 3 && val instanceof Boolean;
      } else {
         return true;
      }
   }
}
