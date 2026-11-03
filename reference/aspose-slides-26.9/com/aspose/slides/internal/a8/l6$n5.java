package com.aspose.slides.internal.a8;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

class l6$n5 {
   private char n5;
   private int l6;
   private IGenericList<n5> k5;
   private Dictionary<Character, l6$n5> u3;
   private boolean a6;
   private n5 u9;
   private boolean h0;

   public l6$n5(char var1, int var2) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = new List<>();
   }

   public final void n5(n5 var1) {
      this.k5.addItem(var1);
   }

   public final boolean n5() {
      if (!this.h0) {
         this.l6();
      }

      return this.a6;
   }

   public final boolean n5(l6$l6 var1, n5[] var2) {
      if (!this.h0) {
         this.l6();
      }

      if (this.a6) {
         var2[0] = this.u9;
         return true;
      } else {
         var2[0] = null;
         if (!this.u3.containsKey(var1.n5())) {
            return false;
         } else {
            l6$n5 var3 = this.u3.get_Item(var1.n5());
            if (var3.n5()) {
               var2[0] = var3.u9;
               return true;
            } else {
               return !var1.hasNext() ? false : var3.n5(var1, var2);
            }
         }
      }
   }

   private void l6() {
      if (!this.h0) {
         boolean[] var1 = new boolean[]{this.a6};
         n5[] var2 = new n5[]{this.u9};
         this.u3 = n5(this.k5, this.l6 + 1, var1, var2);
         this.a6 = var1[0];
         this.u9 = var2[0];
         this.h0 = true;
      }
   }

   public static Dictionary<Character, l6$n5> n5(IGenericList<n5> var0, int var1, boolean[] var2, n5[] var3) {
      Dictionary var4 = new Dictionary();
      IGenericEnumerator var5 = var0.iterator();

      try {
         while (var5.hasNext()) {
            n5 var6 = (n5)var5.next();
            if (var1 >= var6.n5().length()) {
               var2[0] = true;
               var3[0] = var6;
               return var4;
            }

            char var7 = var6.n5().charAt(var1);
            l6$n5 var8;
            if (!var4.containsKey(var7)) {
               var8 = new l6$n5(var7, var1);
               var4.addItem(var7, var8);
            } else {
               var8 = (l6$n5)var4.get_Item(var7);
            }

            var8.n5(var6);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      var2[0] = false;
      var3[0] = null;
      return var4;
   }
}
