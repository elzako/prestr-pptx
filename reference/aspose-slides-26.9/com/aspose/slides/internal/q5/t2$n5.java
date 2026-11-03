package com.aspose.slides.internal.q5;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.ms.System.IDisposable;

public class t2$n5 extends com.aspose.slides.internal.l7.u9$n5 {
   private Dictionary<t2$u9, t2$u3> n5;

   public static t2$n5 n5(com.aspose.slides.internal.l7.u3 var0, com.aspose.slides.internal.m9.c8 var1) {
      return new t2$n5(var0, var1);
   }

   protected t2$n5(com.aspose.slides.internal.l7.u3 var1, com.aspose.slides.internal.m9.c8 var2) {
      super(var1, var2);
   }

   @Override
   protected com.aspose.slides.internal.l7.l6 n5(com.aspose.slides.internal.m9.h0 var1) {
      return new t2(this.y4(), var1, null);
   }

   @Override
   protected void n3() {
      this.n5 = null;
      super.n5(false);
   }

   @Override
   public int x8() {
      if (this.n5 != null && this.n5.size() != 0) {
         int var1 = 6 + this.n5.size() * 12;
         Dictionary$Enumerator var2 = this.n5.iterator();

         try {
            while (var2.hasNext()) {
               KeyValuePair var3 = (KeyValuePair)var2.next();
               var1 += ((t2$u3)var3.getValue()).k5().length;
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }

         return var1;
      } else {
         return 0;
      }
   }

   @Override
   public boolean s7() {
      return this.n5 != null && this.n5.size() != 0;
   }

   @Override
   public int n5(com.aspose.slides.internal.m9.c8 var1) {
      int var2 = 6 + this.n5.size() * 12;
      var1.u3(0, 0);
      var1.u3(2, this.n5.size());
      var1.u3(4, var2);
      byte var3 = 6;
      int var4 = 0;
      Dictionary$Enumerator var5 = this.n5.iterator();

      try {
         while (var5.hasNext()) {
            KeyValuePair var6 = (KeyValuePair)var5.next();
            var1.u3(var3 + 0, ((t2$u9)var6.getKey()).n5());
            var1.u3(var3 + 2, ((t2$u9)var6.getKey()).l6());
            var1.u3(var3 + 4, ((t2$u9)var6.getKey()).k5());
            var1.u3(var3 + 6, ((t2$u9)var6.getKey()).u3());
            var1.u3(var3 + 8, ((t2$u3)var6.getValue()).k5().length);
            var1.u3(var3 + 10, var4);
            var3 += 12;
            var4 += var1.n5(var4 + var2, ((t2$u3)var6.getValue()).k5());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      return var4 + var2;
   }
}
