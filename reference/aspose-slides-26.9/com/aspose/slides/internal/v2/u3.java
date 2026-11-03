package com.aspose.slides.internal.v2;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.n1;
import com.aspose.slides.ms.System.q1;

public class u3 extends s7 implements IDisposable {
   private Dictionary<t9, u9> n5;
   private final Dictionary<t9, Long> l6 = new Dictionary<>();
   private final List<x8> k5 = new List<>();
   private boolean u3;
   private float a6;
   private String u9;
   private k5 h0;
   private boolean c8;

   public final boolean n5() {
      return this.u3;
   }

   private void n5(boolean var1) {
      this.u3 = var1;
   }

   public final float l6() {
      return this.a6;
   }

   private void n5(float var1) {
      this.a6 = var1;
   }

   private void l6(String var1) {
      this.u9 = var1;
   }

   public final k5 k5() {
      return this.h0;
   }

   public final void n5(k5 var1) {
      this.h0 = var1;
   }

   public final boolean u3() {
      return this.c8;
   }

   private void l6(boolean var1) {
      this.c8 = var1;
   }

   public final boolean a6() {
      boolean var1 = false;
      if (this.k5() != null) {
         s7 var2 = this.k5().u9(com.aspose.slides.internal.v2.c8.f8);
         var1 = var2 != null;
      }

      return var1;
   }

   public u3() {
      this.n5 = new Dictionary<>();
   }

   public final void n5(String var1) {
      if (d1.l6(var1, "%PDF-")) {
         int var2 = q1.l6(var1.length(), "%PDF-".length() + 3) - "%PDF-".length();
         String var3 = d1.l6(var1, "%PDF-".length(), var2);
         this.n5(n1.n5(var3, com.aspose.slides.internal.x7n.l6.k5()));
      } else {
         this.n5(true);
         int var4 = q1.l6(var1.length(), "%FDF-".length() + 3) - "%FDF-".length();
         String var5 = d1.l6(var1, "%FDF-".length(), var4);
         this.n5(n1.n5(var5, com.aspose.slides.internal.x7n.l6.k5()));
      }

      this.l6(var1);
   }

   public final void n5(k5 var1, Dictionary<t9, Long> var2) {
      this.n5(var1);
      Dictionary$Enumerator var3 = var2.iterator();

      try {
         while (var3.hasNext()) {
            KeyValuePair var4 = (KeyValuePair)var3.next();
            if (!this.l6.containsKey((t9)var4.getKey())) {
               this.l6.addItem((t9)var4.getKey(), (Long)var4.getValue());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      this.l6(false);
   }

   public final void u9() {
      List$Enumerator var1 = this.n5(com.aspose.slides.internal.v2.c8.i5).iterator();

      try {
         while (var1.hasNext()) {
            u9 var2 = (u9)var1.next();
            x8 var3 = (x8)var2.k5();
            com.aspose.slides.internal.m6.l6 var4 = new com.aspose.slides.internal.m6.l6(var3, this);
            var4.k5();
            List$Enumerator var5 = var4.u3().iterator();

            try {
               while (var5.hasNext()) {
                  u9 var6 = (u9)var5.next();
                  t9 var7 = new t9(var6);
                  if (!this.n5.containsKey(var7)
                     || this.n5.get_Item(var7) == null
                     || this.n5.get_Item(var7).k5() == null
                     || this.l6.containsKey(var7) && this.l6.get_Item(var7) == -var2.n5().k5()) {
                     u9 var8 = this.n5(var7);
                     var8.n5(var6.k5());
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                  var5.dispose();
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   public final List<u9> n5(c8 var1) {
      List var2 = new List();
      Dictionary$ValueCollection$Enumerator var3 = this.n5.getValues().iterator();

      try {
         while (var3.hasNext()) {
            u9 var4 = (u9)var3.next();
            s7 var5 = var4.k5();
            if (com.aspose.slides.internal.v6g.k5.l6(var5, k5.class)) {
               try {
                  k5 var6 = (k5)var5;
                  s7 var7 = var6.n3(com.aspose.slides.internal.v2.c8.g2x);
                  if (var7 != null && com.aspose.slides.internal.v6g.k5.l6(var7, c8.class)) {
                     c8 var8 = (c8)var7;
                     if (var8.equals(var1)) {
                        var2.addItem(var4);
                     }
                  } else if (var7 != null) {
                  }
               } catch (RuntimeException var12) {
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return var2;
   }

   @Override
   public final void dispose() {
      Dictionary$ValueCollection$Enumerator var1 = this.n5.getValues().iterator();

      try {
         while (var1.hasNext()) {
            u9 var2 = (u9)var1.next();
            if (var2.k5() != null && com.aspose.slides.internal.v6g.k5.l6(var2.k5(), x8.class)) {
               ((x8)var2.k5()).dispose();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      this.l6(true);
   }

   public final u9 n5(t9 var1) {
      if (var1 == null) {
         return new u9(null);
      }

      if (this.n5.containsKey(var1)) {
         return this.n5.get_Item(var1);
      }

      u9 var2 = new u9(var1.n5(), var1.l6());
      this.n5.addItem(var1, var2);
      return var2;
   }

   public final List<s7> h0() {
      if (this.n5 == null) {
         this.n5 = new Dictionary<>();
      }

      List var1 = new List(this.n5.getValues().size());
      Dictionary$ValueCollection$Enumerator var2 = this.n5.getValues().iterator();

      try {
         while (var2.hasNext()) {
            u9 var3 = (u9)var2.next();
            var1.addItem(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }
}
