package com.aspose.slides.internal.v2;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class k5 extends s7 {
   private final Dictionary<c8, s7> n5;

   public final IGenericEnumerable<c8> n5() {
      return this.n5.getKeys();
   }

   public final int l6() {
      return this.n5.size();
   }

   public k5() {
      this.n5 = new Dictionary<>();
   }

   public k5(k5 var1) {
      this.n5 = new Dictionary<>(var1.n5);
   }

   public static <TValue extends e2> k5 n5(IGenericDictionary<String, TValue> var0) {
      k5 var1 = new k5();
      IGenericEnumerator var2 = var0.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            c8 var4 = c8.n5((String)var3.getKey());
            s7 var5 = ((e2)var3.getValue()).t2();
            var1.l6(var4, var5);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   public final boolean n5(c8 var1) {
      return this.n5.containsKey(var1);
   }

   public final boolean n5(String var1) {
      c8 var2 = c8.n5(var1);
      return this.n5.containsKey(var2);
   }

   public final void n5(c8 var1, s7 var2) {
      this.n5.addItem(var1, var2);
   }

   public final void n5(String var1, s7 var2) {
      c8 var3 = c8.n5(var1);
      this.n5.addItem(var3, var2);
   }

   public final void n5(k5 var1) {
      if (var1 != null) {
         Dictionary$Enumerator var2 = var1.n5.iterator();

         try {
            while (var2.hasNext()) {
               KeyValuePair var3 = (KeyValuePair)var2.next();
               if (!this.n5.containsKey((c8)var3.getKey())) {
                  this.n5.addItem((c8)var3.getKey(), (s7)var3.getValue());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }
   }

   public final void l6(k5 var1) {
      Dictionary$Enumerator var2 = var1.k5().iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            if (!c8.x7i.equals(var3.getKey()) || !this.n5.containsKey(c8.x7i)) {
               this.l6((c8)var3.getKey(), (s7)var3.getValue());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   public final Dictionary<c8, s7> k5() {
      return this.n5;
   }

   public final void l6(c8 var1, s7 var2) {
      if (var2 == null) {
         this.l6(var1);
      } else if (!this.n5.containsKey(var1)) {
         this.n5.addItem(var1, var2);
      }
   }

   public final void n5(c8 var1, e2 var2) {
      s7 var3 = null;
      if (var2 != null) {
         var3 = var2.t2();
      }

      this.l6(var1, var3);
   }

   public final void n5(c8 var1, String var2) {
      c8 var3 = null;
      if (var2 != null) {
         var3 = c8.n5(var2);
      }

      this.l6(var1, var3);
   }

   public final void l6(c8 var1) {
      this.n5.removeItemByKey(var1);
   }

   public final s7 k5(c8 var1) {
      return this.n5(var1) ? this.n5.get_Item(var1) : null;
   }

   public final s7 l6(String var1) {
      if (this.n5(var1)) {
         c8 var2 = c8.n5(var1);
         return this.n5.get_Item(var2);
      } else {
         return null;
      }
   }

   public final String u3(c8 var1) {
      String var2 = null;
      s7 var3 = this.u9(var1);
      if (var3 != null) {
         if (com.aspose.slides.internal.v6g.k5.l6(var3, c8.class)) {
            var2 = ((c8)var3).n5();
         } else if (com.aspose.slides.internal.v6g.k5.l6(var3, y4.class)) {
            var2 = ((y4)var3).l6();
         }
      }

      return var2;
   }

   public final c8 a6(c8 var1) {
      c8 var2 = null;
      s7 var3 = this.u9(var1);
      if (var3 != null && com.aspose.slides.internal.v6g.k5.l6(var3, c8.class)) {
         var2 = com.aspose.slides.internal.v6g.k5.n5(var3, c8.class);
      }

      return var2;
   }

   public final boolean n5(c8 var1, boolean var2) {
      return this.n5(var1, null, var2);
   }

   public final boolean n5(c8 var1, c8 var2, boolean var3) {
      boolean var4 = var3;
      s7 var5 = this.n5(var1, var2);
      if (var5 != null && com.aspose.slides.internal.v6g.k5.l6(var5, l6.class)) {
         var4 = ((l6)var5).k5();
      }

      return var4;
   }

   public s7 u9(c8 var1) {
      s7 var2 = null;
      if (this.n5.containsKey(var1)) {
         var2 = this.n5.get_Item(var1);
         if (com.aspose.slides.internal.v6g.k5.l6(var2, u9.class)) {
            var2 = ((u9)var2).k5();
         }

         if (var2 == s7.c8()) {
            var2 = null;
         }
      }

      return var2;
   }

   public final s7 n5(c8 var1, c8 var2) {
      s7 var3 = this.u9(var1);
      if (var3 == null && var2 != null) {
         var3 = this.u9(var2);
      }

      return var3;
   }

   public final k5 h0(c8 var1) {
      s7 var2 = this.u9(var1);
      return com.aspose.slides.internal.v6g.k5.l6(var2, k5.class) ? (k5)var2 : null;
   }

   public final n5 c8(c8 var1) {
      s7 var2 = this.u9(var1);
      return com.aspose.slides.internal.v6g.k5.l6(var2, n5.class) ? (n5)var2 : null;
   }

   public final int t2(c8 var1) {
      return this.n5(var1, -1);
   }

   public final int n5(c8 var1, int var2) {
      return this.n5(var1, null, var2);
   }

   public final int n5(c8 var1, c8 var2, int var3) {
      int var4 = var3;
      s7 var5 = this.n5(var1, var2);
      if (var5 != null && com.aspose.slides.internal.v6g.k5.l6(var5, t2.class)) {
         var4 = ((t2)var5).k5();
      }

      return var4;
   }

   public final t2 s7(c8 var1) {
      t2 var2 = null;
      s7 var3 = this.u9(var1);
      if (var3 != null && com.aspose.slides.internal.v6g.k5.l6(var3, t2.class)) {
         var2 = (t2)var3;
      }

      return var2;
   }

   public final float x8(c8 var1) {
      return this.n5(var1, -1.0F);
   }

   public final float n5(c8 var1, float var2) {
      float var3 = var2;
      s7 var4 = this.u9(var1);
      if (com.aspose.slides.internal.v6g.k5.l6(var4, t2.class)) {
         var3 = ((t2)var4).u3();
      }

      return var3;
   }

   public s7 n3(c8 var1) {
      s7 var2 = null;
      s7[] var3 = new s7[]{var2};
      boolean var4 = this.n5.tryGetValue(var1, var3);
      var2 = var3[0];
      return var4 ? var2 : null;
   }

   @Override
   public String toString() {
      a5 var1 = new a5();
      Dictionary$Enumerator var2 = this.n5.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            String var4 = d1.n5("{0} {1} ", var3.getKey(), var3.getValue());
            var1.n5(var4);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return d1.n5("<< {0}>>", new Object[]{var1});
   }
}
