package com.aspose.slides.internal.e1x;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

public class a5 {
   private final Dictionary<Integer, u6> n5 = new Dictionary<>();
   private u6 l6;
   private boolean k5;

   public a5(boolean var1) {
      this.k5 = var1;
   }

   public final u6 n5(int var1) {
      u6 var2 = null;
      u6[] var3 = new u6[]{var2};
      boolean var4 = this.n5.tryGetValue(var1, var3);
      var2 = var3[0];
      if (var4) {
         return var2;
      }

      if (this.k5) {
         if (com.aspose.slides.internal.c8e.n5.l6(var1)) {
            var3[0] = var2;
            this.n5.tryGetValue(Integer.valueOf(com.aspose.slides.internal.c8e.n5.n5(var1)), var3);
            var2 = var3[0];
         } else {
            var3[0] = var2;
            this.n5.tryGetValue(Integer.valueOf(com.aspose.slides.internal.c8e.n5.k5(var1)), var3);
            var2 = var3[0];
         }

         return var2;
      } else {
         return null;
      }
   }

   public final int n5() {
      return this.n5.size();
   }

   public final void n5(u6 var1) {
      this.n5.set_Item(var1.n5(), var1);
   }

   public final u6 l6() {
      return this.l6;
   }

   public final void l6(u6 var1) {
      this.l6 = var1;
   }

   public final u6 l6(int var1) {
      u6 var2 = this.n5(var1);
      return var2 != null ? var2 : this.k5();
   }

   public final u6 k5(int var1) {
      Dictionary$ValueCollection$Enumerator var2 = this.n5.getValues().iterator();

      try {
         while (var2.hasNext()) {
            u6 var3 = (u6)var2.next();
            if (var3.l6() == var1) {
               return var3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return this.k5();
   }

   public final u6 u3(int var1) {
      Dictionary$ValueCollection$Enumerator var2 = this.n5.getValues().iterator();

      try {
         while (var2.hasNext()) {
            u6 var3 = (u6)var2.next();
            if (var3.l6() == (char)var1) {
               return var3;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return this.k5();
   }

   private u6 k5() {
      u6 var1 = this.l6;
      if (var1 != null) {
         return var1;
      } else {
         var1 = this.n5(32);
         if (var1 != null) {
            return var1;
         } else {
            Dictionary$ValueCollection$Enumerator var2 = this.n5.getValues().iterator();
            var2.hasNext();
            if (var2.next() != null) {
               this.l6 = new u6(50, 0, ((u6)var2.next()).k5(), ((u6)var2.next()).u3());
               return this.l6;
            } else {
               throw new InvalidOperationException("Cannot find a glyph for this character code.");
            }
         }
      }
   }
}
