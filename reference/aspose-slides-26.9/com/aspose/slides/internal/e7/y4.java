package com.aspose.slides.internal.e7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.v2.t9;
import com.aspose.slides.ms.System.IDisposable;

public class y4 {
   private n3 n5;
   private n3 l6;
   private final Dictionary<Long, n3> k5 = new Dictionary<>();

   public final com.aspose.slides.internal.v2.k5 n5() {
      return this.l6 != null ? this.l6.n5() : null;
   }

   public final Dictionary<t9, Long> l6() {
      return this.n5 != null ? this.n5.l6() : new Dictionary<>();
   }

   public final void n5(long var1) {
      if (this.l6 == null) {
         this.l6 = new n3();
         this.l6.n5(new com.aspose.slides.internal.v2.k5());
         n3 var3 = null;
         if (this.k5.containsKey(var1)) {
            var3 = this.k5.get_Item(var1);
         }

         List var4 = new List();
         if (var3 == null) {
            var4.addRange(this.k5.getKeys());
            var4.sort();
         } else {
            var4 = this.n5(var1, var3);
         }

         List$Enumerator var5 = var4.iterator();

         try {
            while (var5.hasNext()) {
               long var6 = com.aspose.slides.internal.v6g.k5.u3(var5.next(), long.class);
               if (this.k5.containsKey(var6)) {
                  var3 = this.k5.get_Item(var6);
                  if (var3.n5() != null) {
                     this.l6.n5().n5(var3.n5());
                  }

                  this.l6.n5(var3);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }
      }
   }

   private List<Long> n5(long var1, n3 var3) {
      List var4 = new List();
      var4.addItem(var1);

      while (var3.n5() != null) {
         long var5 = -1L;
         com.aspose.slides.internal.v2.s7 var7 = var3.n5().k5(com.aspose.slides.internal.v2.c8.x4g);
         if (var7 != null && com.aspose.slides.internal.v6g.k5.l6(var7, com.aspose.slides.internal.v2.t2.class)) {
            com.aspose.slides.internal.v2.t2 var8 = com.aspose.slides.internal.v6g.k5.n5(var7, com.aspose.slides.internal.v2.t2.class);
            var5 = var8.k5();
         }

         if (var5 == -1L || !this.k5.containsKey(var5)) {
            break;
         }

         var3 = this.k5.get_Item(var5);
         var4.addItem(var5);
         if (var4.size() >= this.k5.size()) {
            break;
         }
      }

      var4.reverse();
      return var4;
   }

   public final void n5(com.aspose.slides.internal.v2.k5 var1) {
      if (this.n5 != null) {
         this.n5.n5(var1);
      }
   }

   public final void l6(long var1) {
      this.n5 = new n3();
      this.k5.addItem(var1, this.n5);
   }

   public final void n5(t9 var1, long var2) {
      if (this.n5 != null) {
         this.n5.l6().addItem(var1, var2);
      }
   }
}
