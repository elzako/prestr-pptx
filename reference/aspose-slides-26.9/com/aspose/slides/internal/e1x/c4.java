package com.aspose.slides.internal.e1x;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.ms.System.IDisposable;

public class c4 {
   private Dictionary<Long, Dictionary<Integer, com.aspose.slides.internal.o9b.j5>> n5 = new Dictionary<>();
   private Dictionary<Long, Dictionary<Integer, com.aspose.slides.internal.o9b.j5>> l6 = new Dictionary<>();

   public final Dictionary<Long, Dictionary<Integer, com.aspose.slides.internal.o9b.j5>> n5() {
      return this.n5;
   }

   public final void n5(Dictionary<Long, Dictionary<Integer, com.aspose.slides.internal.o9b.j5>> var1) {
      this.n5 = var1;
   }

   public final Dictionary<Long, Dictionary<Integer, com.aspose.slides.internal.o9b.j5>> l6() {
      return this.l6;
   }

   public final void l6(Dictionary<Long, Dictionary<Integer, com.aspose.slides.internal.o9b.j5>> var1) {
      this.l6 = var1;
   }

   public final void n5(c4 var1) {
      if (var1 != null) {
         Dictionary$Enumerator var2 = var1.n5().iterator();

         try {
            while (var2.hasNext()) {
               KeyValuePair var3 = (KeyValuePair)var2.next();
               if (!this.n5().containsKey((Long)var3.getKey())) {
                  this.n5().addItem((Long)var3.getKey(), (Dictionary<Integer, com.aspose.slides.internal.o9b.j5>)var3.getValue());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }

         Dictionary$Enumerator var12 = var1.l6().iterator();

         try {
            while (var12.hasNext()) {
               KeyValuePair var4 = (KeyValuePair)var12.next();
               if (!this.l6().containsKey((Long)var4.getKey())) {
                  this.l6().addItem((Long)var4.getKey(), (Dictionary<Integer, com.aspose.slides.internal.o9b.j5>)var4.getValue());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
               var12.dispose();
            }
         }
      }
   }
}
