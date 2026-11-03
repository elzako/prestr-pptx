package com.aspose.slides.internal.t6q;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.a5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.p6;

public abstract class u3 implements a5<u3> {
   protected final Dictionary<String, String> n5 = new Dictionary<>(p6.u3());

   protected u3() {
   }

   public void n5(String var1, String var2) {
      if (!this.n5.containsKey(var1)) {
         this.n5.addItem(var1, var2);
      } else {
         this.n5.set_Item(var1, var2);
      }
   }

   public String n5(String var1) {
      return !this.n5.containsKey(var1) ? null : this.n5.get_Item(var1);
   }

   public final boolean n5(u3 var1) {
      if (var1 == null) {
         return false;
      }

      if (j8.l6(this.n5, var1.n5)) {
         return true;
      }

      if (this.n5.size() != var1.n5.size()) {
         return false;
      }

      if (this.n5.size() == 0) {
         return true;
      }

      Dictionary$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            if (!var1.n5.containsKey((String)var3.getKey())) {
               return false;
            }

            String var4 = var1.n5.get_Item((String)var3.getKey());
            if (!d1.u3((String)var3.getValue(), var4, (short)5)) {
               return false;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return true;
   }

   @Override
   public boolean equals(Object other) {
      return other == null ? false : this.n5(com.aspose.slides.internal.v6g.k5.n5(other, u3.class));
   }

   @Override
   public int hashCode() {
      int var1 = 13;
      Dictionary$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            var1 += d1.u9((String)var3.getKey()).hashCode() + d1.u9((String)var3.getValue()).hashCode();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1 + "XmpElementBase".hashCode();
   }
}
