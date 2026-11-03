package com.aspose.slides.internal.a0;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class h0 {
   protected Dictionary<com.aspose.slides.internal.o0.l6, String> u9 = null;
   protected List<com.aspose.slides.internal.o0.n5> h0 = null;

   public Object n5(h0 var1) {
      if (this.u9 != null) {
         var1.u9 = new Dictionary<>(this.u9);
      }

      if (this.h0 != null) {
         var1.h0 = new List<>(this.h0);
      }

      return var1;
   }

   public final void n5(com.aspose.slides.internal.o0.l6 var1, String var2) {
      if (this.u9 == null) {
         this.u9 = new Dictionary<>();
      }

      this.u9.addItem(var1, var2);
   }

   public final void l6(Dictionary<com.aspose.slides.internal.o0.l6, String> var1) {
      if (var1 != null && var1.size() != 0) {
         Dictionary$Enumerator var2 = var1.iterator();

         try {
            while (var2.hasNext()) {
               KeyValuePair var3 = (KeyValuePair)var2.next();
               this.n5((com.aspose.slides.internal.o0.l6)var3.getKey(), (String)var3.getValue());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }
   }

   public final String n5(com.aspose.slides.internal.o0.l6 var1) {
      return this.u9 != null ? this.u9.get_Item(var1) : null;
   }

   public final Dictionary<com.aspose.slides.internal.o0.l6, String> z3() {
      return this.u9 != null ? this.u9 : new Dictionary<>();
   }

   private void n5() {
      if (this.h0 == null) {
         this.h0 = new List<>();
      }
   }

   public final void n5(List<com.aspose.slides.internal.o0.n5> var1) {
      this.n5();
      List$Enumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.o0.n5 var3 = (com.aspose.slides.internal.o0.n5)var2.next();
            this.h0.addItem(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }
}
