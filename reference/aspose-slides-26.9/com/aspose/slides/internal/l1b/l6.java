package com.aspose.slides.internal.l1b;

import java.awt.Color;
import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class l6 {
   public static Key n5 = new com.aspose.slides.internal.k3h.n5(1, "");
   /** @deprecated */
   public static Key l6 = n5;
   private HashMap k5;
   private HashMap u3 = null;

   public l6(int var1) {
      this.k5 = new HashMap();
   }

   public l6(Map var1) throws com.aspose.slides.internal.p7x.l6 {
      this(16);
      this.n5(var1);
   }

   public void n5(Map var1) throws com.aspose.slides.internal.p7x.l6 {
      for (Object recoveredElement$var3$627 : var1.entrySet()) {
         Entry var3 = (Entry)recoveredElement$var3$627;
         if (!(var3.getKey() instanceof Color) || !(var3.getValue() instanceof Color)) {
            throw new com.aspose.slides.internal.p7x.l6("colorMap must contain Color to Color entries only.");
         }

         this.n5((Color)var3.getKey(), (Color)var3.getValue());
      }
   }

   public void n5(Color var1, Color var2) throws com.aspose.slides.internal.p7x.l6 {
      if (var1 == null) {
         throw new com.aspose.slides.internal.p7x.l6("key can't be null");
      }

      if (var2 == null) {
         throw new com.aspose.slides.internal.p7x.l6("value can't be null");
      }

      if (var1.equals(var2)) {
         this.k5.remove(var1);
      } else {
         this.k5.put(var1, var2);
      }
   }

   public Color n5(Color var1) {
      Color var2 = (Color)this.k5.get(var1);
      return var2 != null ? var2 : var1;
   }
}
