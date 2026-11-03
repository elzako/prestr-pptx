package com.aspose.slides.internal.q7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.e5a.y2;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.IDisposable;

public final class l6 implements IDisposable {
   public static final l6 n5 = new l6(com.aspose.slides.internal.q7.u3.n5);
   private final u3 l6;
   private final IGenericDictionary<y2, com.aspose.slides.internal.r3.u9> k5 = new Dictionary<>();
   private final IGenericDictionary<t4, c8> u3 = new Dictionary<>();
   private final IGenericDictionary<t4, c8> a6 = new Dictionary<>();

   public l6() {
      k5 var1 = new k5();
      u9 var2 = new u9(var1, new a6());
      this.l6 = new u3(var1, var2);
   }

   public l6(u3 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("options");
      }

      this.l6 = var1;
   }

   public final c8 n5(byte[] var1) {
      return h0.n5(var1);
   }

   public final c8 n5(y2 var1) {
      return this.n5(var1, false);
   }

   public final c8 n5(y2 var1, boolean var2) {
      if (this.k5.containsKey(var1)) {
         throw new ArgumentException("Already registered", "zipEntry");
      }

      com.aspose.slides.internal.r3.u9 var3 = new com.aspose.slides.internal.r3.u9(var1, this.l6, new l6$1(this));
      this.k5.addItem(var1, var3);
      if (!var2 || this.l6.u9()) {
         var3.a6();
      }

      return var3;
   }

   public final c8 n5(t4 var1) {
      return this.n5(var1, false);
   }

   public final c8 n5(t4 var1, boolean var2) {
      return this.n5(var1, var2, false);
   }

   public final c8 n5(t4 var1, boolean var2, boolean var3) {
      if (!this.u3.containsKey(var1) && !this.a6.containsKey(var1)) {
         c8 var4;
         if (!var1.canSeek()) {
            var4 = new com.aspose.slides.internal.r3.n5(var1, this.l6, new l6$2(this));
            if (!var2 || this.l6.u9()) {
               ((com.aspose.slides.internal.r3.n5)var4).u3();
            }
         } else {
            var4 = new com.aspose.slides.internal.r3.u3(var1);
            if (var2) {
               this.l6.k5().l6("Attempt to lazy load seekable stream");
            }
         }

         if (var3) {
            this.a6.addItem(var1, var4);
         } else {
            this.u3.addItem(var1, var4);
         }

         return var4;
      } else {
         throw new ArgumentException("Already registered", "stream");
      }
   }

   public final void n5(c8 var1) {
      IGenericEnumerator var2 = this.k5.iterator();

      try {
         while (var2.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var2.next();
            if (var1 == var3.getValue()) {
               ((com.aspose.slides.internal.r3.u9)var3.getValue()).dispose();
               this.k5.removeItemByKey((y2)var3.getKey());
               return;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      IGenericEnumerator var19 = this.u3.iterator();

      try {
         while (var19.hasNext()) {
            KeyValuePair var4 = (KeyValuePair)var19.next();
            if (var1 == var4.getValue()) {
               ((c8)var4.getValue()).dispose();
               this.u3.removeItemByKey((t4)var4.getKey());
               return;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var19, IDisposable.class)) {
            var19.dispose();
         }
      }

      IGenericEnumerator var20 = this.a6.iterator();

      try {
         while (var20.hasNext()) {
            KeyValuePair var5 = (KeyValuePair)var20.next();
            if (var1 == var5.getValue()) {
               ((t4)var5.getKey()).dispose();
               ((c8)var5.getValue()).dispose();
               this.a6.removeItemByKey((t4)var5.getKey());
               return;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var20, IDisposable.class)) {
            var20.dispose();
         }
      }
   }

   @Override
   public final void dispose() {
      IGenericEnumerator var1 = this.k5.iterator();

      try {
         while (var1.hasNext()) {
            KeyValuePair var2 = (KeyValuePair)var1.next();
            ((com.aspose.slides.internal.r3.u9)var2.getValue()).dispose();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      IGenericEnumerator var18 = this.u3.iterator();

      try {
         while (var18.hasNext()) {
            KeyValuePair var3 = (KeyValuePair)var18.next();
            ((c8)var3.getValue()).dispose();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var18, IDisposable.class)) {
            var18.dispose();
         }
      }

      IGenericEnumerator var19 = this.a6.iterator();

      try {
         while (var19.hasNext()) {
            KeyValuePair var4 = (KeyValuePair)var19.next();
            ((t4)var4.getKey()).dispose();
            ((c8)var4.getValue()).dispose();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var19, IDisposable.class)) {
            var19.dispose();
         }
      }

      this.l6.n5().dispose();
   }

   public final x8 n5() {
      return this.l6.n5();
   }

   public final void l6() {
      IGenericEnumerator var1 = this.k5.iterator();

      try {
         while (var1.hasNext()) {
            KeyValuePair var2 = (KeyValuePair)var1.next();
            if (((com.aspose.slides.internal.r3.u9)var2.getValue()).u3()) {
               ((com.aspose.slides.internal.r3.u9)var2.getValue()).a6();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   private boolean n5(c8 var1, long var2) {
      long var4 = 0L;
      IGenericEnumerator var6 = this.u3.getValues().iterator();

      try {
         while (var6.hasNext()) {
            c8 var7 = (c8)var6.next();
            var4 += var7.k5();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      IGenericEnumerator var23 = this.a6.getValues().iterator();

      try {
         while (var23.hasNext()) {
            c8 var8 = (c8)var23.next();
            var4 += var8.k5();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var23, IDisposable.class)) {
            var23.dispose();
         }
      }

      IGenericEnumerator var24 = this.k5.getValues().iterator();

      try {
         while (var24.hasNext()) {
            c8 var9 = (c8)var24.next();
            var4 += var9.k5();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var24, IDisposable.class)) {
            var24.dispose();
         }
      }

      return this.l6.a6() >= var4 + var2;
   }

   // $VF: synthetic method
   static boolean n5(l6 var0, c8 var1, long var2) {
      return var0.n5(var1, var2);
   }
}
