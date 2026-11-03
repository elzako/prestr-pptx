package com.aspose.slides.internal.s6;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.ms.System.IDisposable;

class a6 {
   private s0 n5 = new s0();
   private s0 l6 = new s0();
   private boolean k5;
   private v3 u3 = new v3();
   private SortedList<Long, k5> a6 = new SortedList<>();

   public final void n5(k5 var1) {
      this.a6.set_Item(var1.n5(), var1);
   }

   public final void l6(k5 var1) {
      this.a6.removeItemByKey(var1.n5());
   }

   public final void n5() {
      if (this.a6.size() >= 2) {
         s0 var1 = new s0();
         IGenericEnumerator var2 = this.a6.iterator();

         try {
            while (var2.hasNext()) {
               KeyValuePair var3 = (KeyValuePair)var2.next();
               s0.n5(var1, ((k5)var3.getValue()).k5()).n5(var1);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }

         s0.l6(var1, this.a6.size()).n5(var1);
         boolean var55 = true;
         IGenericEnumerator var4 = this.a6.iterator();

         try {
            while (var4.hasNext()) {
               KeyValuePair var5 = (KeyValuePair)var4.next();
               IGenericEnumerator var6 = this.a6.iterator();

               try {
                  while (var6.hasNext()) {
                     KeyValuePair var7 = (KeyValuePair)var6.next();
                     if (var5.getValue() != var7.getValue() && s0.k5(((k5)var5.getValue()).h0().a6(), ((k5)var7.getValue()).h0().a6()) < 0.0F) {
                        var55 = false;
                        break;
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
                     var6.dispose();
                  }
               }

               if (!var55) {
                  break;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
               var4.dispose();
            }
         }

         if (var55) {
            float var56 = 0.0F;
            IGenericEnumerator var59 = this.a6.iterator();

            try {
               while (var59.hasNext()) {
                  KeyValuePair var61 = (KeyValuePair)var59.next();
                  var56 += ((k5)var61.getValue()).a6() - s0.l6(var1, ((k5)var61.getValue()).l6()).k5();
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var59, IDisposable.class)) {
                  var59.dispose();
               }
            }

            var56 /= this.a6.size();
            if (var56 > 0.0F) {
               s0 var62 = new s0();
               IGenericEnumerator var8 = this.a6.iterator();

               try {
                  while (var8.hasNext()) {
                     KeyValuePair var9 = (KeyValuePair)var8.next();
                     s0.n5(var62, ((k5)var9.getValue()).h0()).n5(var62);
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                     var8.dispose();
                  }
               }

               var62.u3().n5(var62);
               s0.n5(var1, s0.n5(var62, var56)).n5(var1);
            }
         }

         IGenericEnumerator var58 = this.a6.iterator();

         try {
            while (var58.hasNext()) {
               KeyValuePair var60 = (KeyValuePair)var58.next();
               ((k5)var60.getValue()).l6(var1.a6());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var58, IDisposable.class)) {
               var58.dispose();
            }
         }
      }
   }

   public final void n5(s0 var1) {
      IGenericEnumerator var2 = this.a6.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            ((k5)var3.getValue()).l6(var1.a6());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   public final void n5(a6 var1) {
      SortedList var2 = new SortedList<>(var1.a6);
      IGenericEnumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            KeyValuePair var4 = (KeyValuePair)var3.next();
            ((k5)var4.getValue()).n5(this);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   public final k5 l6() {
      return this.a6.size() == 0 ? null : this.a6.getValues().get_Item(this.a6.size() / 2);
   }

   public final boolean k5() {
      return this.a6.size() > 0;
   }

   public final s0 u3() {
      return this.n5.a6();
   }

   public final void l6(s0 var1) {
      this.n5 = var1.a6();
   }

   public final s0 a6() {
      return this.l6.a6();
   }

   public final void k5(s0 var1) {
      this.l6 = var1.a6();
   }

   public final boolean u9() {
      return this.k5;
   }

   public final void n5(boolean var1) {
      this.k5 = var1;
   }

   public final v3 h0() {
      return this.u3.h0();
   }

   public final void n5(v3 var1) {
      this.u3 = var1.h0();
   }
}
