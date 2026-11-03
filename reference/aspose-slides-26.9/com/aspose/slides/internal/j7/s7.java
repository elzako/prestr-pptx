package com.aspose.slides.internal.j7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.exceptions.FileNotFoundException;
import com.aspose.slides.internal.e1x.a0;
import com.aspose.slides.internal.n2d.t4;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.e5;

public class s7 implements IDisposable {
   private boolean n5 = false;
   private final Dictionary<String, com.aspose.slides.internal.e5m.l6> l6 = new Dictionary<>();
   private final com.aspose.slides.internal.e5m.l6 k5 = new com.aspose.slides.internal.e5m.l6();
   private final Dictionary<com.aspose.slides.internal.e1x.z1, Integer> u3 = new Dictionary<>();

   @Override
   public final void dispose() {
      this.n5(true);
      e5.n5(this);
   }

   protected void n5(boolean var1) {
      if (!this.n5) {
         Dictionary$ValueCollection$Enumerator var2 = this.l6.getValues().iterator();

         try {
            while (var2.hasNext()) {
               com.aspose.slides.internal.e5m.l6 var3 = (com.aspose.slides.internal.e5m.l6)var2.next();
               var3.dispose();
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }

         this.l6.clear();
         this.u3.clear();
         this.k5.dispose();
         this.n5 = true;
      }
   }

   public final com.aspose.slides.internal.o9b.y4 n5(com.aspose.slides.internal.p1s.l6 var1) {
      this.n5(var1.n5().y1());
      return this.n5(var1.h0(), var1.n5().u9());
   }

   private void n5(com.aspose.slides.internal.e1x.z1 var1) {
      if (!this.u3.containsKey(var1)) {
         com.aspose.slides.internal.e1x.y4 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.e1x.y4.class);
         if (var2 != null) {
            if (!this.l6.containsKey(var2.n5())) {
               com.aspose.slides.internal.e5m.l6 var6 = new com.aspose.slides.internal.e5m.l6();

               try {
                  var6.n5(var2.n5());
                  this.l6.addItem(var2.n5(), var6);
               } catch (FileNotFoundException var5) {
               }
            }
         } else {
            a0 var3 = com.aspose.slides.internal.v6g.k5.n5(var1, a0.class);
            if (var3 != null) {
               this.n5(var3);
            }
         }
      }
   }

   private void n5(a0 var1) {
      byte[] var2 = var1.n5();
      com.aspose.slides.internal.l6j.n5 var3 = com.aspose.slides.internal.l6j.n5.n5(var2);
      this.k5.n5(var3.a6(), var2.length);
      var3.u9();
   }

   private com.aspose.slides.internal.o9b.y4 n5(String var1) {
      Dictionary$ValueCollection$Enumerator var2 = this.l6.getValues().iterator();

      try {
         while (var2.hasNext()) {
            com.aspose.slides.internal.e5m.l6 var3 = (com.aspose.slides.internal.e5m.l6)var2.next();

            for (com.aspose.slides.internal.o9b.y4 var7 : var3.n5()) {
               if (t4.l6(var7.a6(), var1)) {
                  return var7;
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      for (com.aspose.slides.internal.o9b.y4 var15 : this.k5.n5()) {
         if (t4.l6(var15.a6(), var1)) {
            return var15;
         }
      }

      return null;
   }

   private com.aspose.slides.internal.o9b.y4 n5(String var1, String var2) {
      if (!d1.n5(var2) && this.l6.containsKey(var2)) {
         com.aspose.slides.internal.e5m.l6 var3 = this.l6.get_Item(var2);

         for (com.aspose.slides.internal.o9b.y4 var7 : var3.n5()) {
            if (t4.l6(var7.a6(), var1)) {
               return var7;
            }
         }

         return null;
      } else {
         return this.n5(var1);
      }
   }
}
