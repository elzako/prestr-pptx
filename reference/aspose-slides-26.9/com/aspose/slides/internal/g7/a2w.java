package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.ms.System.IDisposable;

public class a2w extends k0t {
   private r7n k5 = null;
   private Dictionary<String, r7n> u3 = new Dictionary<>();

   public a2w(long var1, String var3) {
      super(var1, var3);
   }

   public final r7n k5() {
      return this.k5;
   }

   @Override
   public void n5(f3c var1) {
      var1.n5(this.n5 & 4294967295L);
      long var2 = var1.n3() & 65535;
      int var4 = var1.n3();
      if (com.aspose.slides.ms.System.d1.a6(this.l6(), "DFLT") && var2 == 0L) {
         throw new r7c("Incorrect format for default script table");
      }

      Dictionary var5 = n5(var4 & 65535, var1);
      if (var2 != 0L) {
         this.k5 = f1s.n5(new r7n((this.n5 & 4294967295L) + var2, "Default"), var1);
      }

      Dictionary$Enumerator var6 = var5.iterator();

      try {
         while (var6.hasNext()) {
            KeyValuePair var7 = (KeyValuePair)var6.next();
            this.u3.addItem((String)var7.getKey(), f1s.n5(new r7n((this.n5 & 4294967295L) + (Long)var7.getValue(), (String)var7.getKey()), var1));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      if (this.u3.size() != (var4 & 65535)) {
         throw new r7c("incorrect count of language system tables");
      }
   }
}
