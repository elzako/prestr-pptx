package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$KeyCollection$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

final class a8r extends g8<x8m, a8r> {
   byte n5;
   y2[] l6 = null;
   Dictionary<String, Integer> k5;

   a8r() {
      this.n5 = -1;
   }

   public final byte n5() {
      return this.n5;
   }

   public final boolean l6() {
      return this.n5 != 9 && this.n5 != 10 && this.n5 != 11 && this.n5 != 12;
   }

   final void n5(i7b var1) {
      a8r var2 = (a8r)var1;
      this.n5 = var2.n5;
      this.l6 = var2.l6;
   }

   void n5(i7b var1, x8m var2) {
      this.n5(var1);
      this.n5(var2);
   }

   final void n5(x8m var1) {
      if (var1.n5() != -1) {
         this.n5 = var1.n5();
      }

      if (var1.n5() != -1) {
         if (var1.n5 != null) {
            this.l6 = new y2[var1.n5.length];

            for (int var2 = 0; var2 < this.l6.length; var2++) {
               this.l6[var2] = new y2(var1.n5[var2]);
            }
         } else {
            this.l6 = null;
         }
      }
   }

   boolean n5(a8r var1) {
      try {
         if (var1 == null) {
            return false;
         }

         if (com.aspose.slides.ms.System.j8.l6(this, var1)) {
            return true;
         }

         if (!com.aspose.slides.internal.n8e.v4.n5(this.l6, var1.l6)) {
            return false;
         }

         if (this.n5 != var1.n5) {
            return false;
         }

         if (this.k5 == null && var1.k5 != null) {
            return false;
         }

         if (this.k5 == null) {
            return true;
         }

         if (var1.k5 == null) {
            return false;
         }

         if (this.k5.size() != var1.k5.size()) {
            return false;
         }

         Dictionary$KeyCollection$Enumerator var2 = this.k5.getKeys().iterator();

         try {
            while (var2.hasNext()) {
               String var3 = (String)var2.next();
               if (!var1.k5.containsKey(var3) || !this.k5.get_Item(var3).equals(var1.k5.get_Item(var3))) {
                  return false;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }

         Dictionary$KeyCollection$Enumerator var16 = var1.k5.getKeys().iterator();

         try {
            while (true) {
               if (!var16.hasNext()) {
                  break;
               }

               String var4 = (String)var16.next();
               if (!this.k5.containsKey(var4) || var1.k5.get_Item(var4).equals(this.k5.get_Item(var4))) {
                  return false;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var16, IDisposable.class)) {
               var16.dispose();
            }
         }
         return true;
      } catch (RuntimeException var15) {
         return false;
      }
   }

   @Override
   boolean n5(g8 recoveredArg) {
      return this.n5((com.aspose.slides.a8r)recoveredArg);
   }
}
