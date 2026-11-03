package com.aspose.slides.internal.b8c;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.ICollection;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

@Deprecated
public final class v2 implements ICollection {
   private Hashtable l6;
   private com.aspose.slides.ms.System.Xml.z9 k5;
   private o2 u3;
   private ReentrantLock a6;
   private int u9 = com.aspose.slides.internal.r5t.z8.n5;
   private boolean h0 = true;
   private b4 c8 = null;
   private com.aspose.slides.ms.System.Xml.o8 t2 = null;
   private b4 s7;
   public final com.aspose.slides.internal.v6g.n5<b4> n5 = new e7(this);

   public v2() {
      this(new com.aspose.slides.ms.System.Xml.j9());
   }

   public v2(com.aspose.slides.ms.System.Xml.z9 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("nametable");
      }

      this.k5 = var1;
      this.l6 = Hashtable.sync(new Hashtable());
      this.t2 = com.aspose.slides.internal.s5g.n5.l6();
      this.h0 = true;
      if (this.h0) {
         this.a6 = new ReentrantLock();
      }
   }

   @Override
   public final int size() {
      return this.l6.size();
   }

   public final com.aspose.slides.ms.System.Xml.z9 n5() {
      return this.k5;
   }

   public final void n5(com.aspose.slides.ms.System.Xml.o8 var1) {
      this.t2 = var1;
   }

   public final a9 n5(String var1) {
      u1 var2 = (u1)this.l6.get_Item(var1 != null ? var1 : com.aspose.slides.ms.System.d1.n5);
      return var2 != null ? var2.l6() : null;
   }

   public final j0 l6() {
      return new j0(this.l6);
   }

   @Override
   public final void copyTo(com.aspose.slides.ms.System.u3 array, int index) {
      if (array == null) {
         throw new ArgumentNullException("array");
      }

      if (index < 0) {
         throw new ArgumentOutOfRangeException("index");
      }

      j0 var3 = this.l6();

      while (var3.hasNext()) {
         if (index == array.a6() && array.isFixedSize()) {
            throw new ArgumentOutOfRangeException("index");
         }

         array.k5(var3.next(), index++);
      }
   }

   @Override
   public final boolean isSynchronized() {
      return true;
   }

   @Override
   public final Object getSyncRoot() {
      return this;
   }

   public final x0 l6(String var1) {
      u1 var2 = (u1)this.l6.get_Item(var1 != null ? var1 : com.aspose.slides.ms.System.d1.n5);
      return var2 != null ? var2.n5() : null;
   }

   public final o2 n5(com.aspose.slides.ms.System.Xml.z9 var1) {
      if (this.k5 != var1) {
         return new o2(var1);
      }

      if (this.u3 == null) {
         this.u3 = new o2(this.k5);
      }

      return this.u3;
   }

   public final a9 n5(String var1, x0 var2, a9 var3, boolean var4) {
      return this.n5(var1, var2, var3, var4, this.t2);
   }

   private a9 n5(String var1, x0 var2, a9 var3, boolean var4, com.aspose.slides.ms.System.Xml.o8 var5) {
      int var6 = 0;
      if (var3 != null) {
         if (var3.w1() == 0 && var4) {
            if (!var3.n5(this, var5, var2, var1, this.c8, this.k5, true)) {
               var6 = 1;
            }

            var1 = var3.a6() == null ? com.aspose.slides.ms.System.d1.n5 : var3.a6();
         }

         var6 += var3.w1();
      } else {
         var6 += var2.z1();
         var1 = this.n5().n5(var1);
      }

      if (var6 == 0) {
         u1 var7 = new u1();
         var7.n5(var1);
         var7.n5(var2);
         var7.n5(var3);
         this.n5(var1, var7);
         return var3;
      } else {
         return null;
      }
   }

   private void n5(String var1, u1 var2) {
      try {
         if (this.h0) {
            this.a6.tryLock(this.u9, TimeUnit.MILLISECONDS);
         }

         if (this.l6.get_Item(var1) != null) {
            this.l6.removeItem(var1);
         }

         this.l6.addItem(var1, var2);
      } catch (InterruptedException var7) {
         var7.printStackTrace();
      } finally {
         if (this.h0) {
            this.a6.unlock();
         }
      }
   }

   public final b4 k5() {
      return this.c8;
   }

   public final void n5(b4 var1) {
      this.c8 = var1;
   }

   // Original IEnumerator forwarding descriptor; javac supplies the Iterator bridge.
   @Override
   public com.aspose.slides.Collections.IEnumerator iterator() {
      return this.l6();
   }





   // $VF: synthetic method
   static b4 n5(v2 var0, b4 var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static b4 n5(v2 var0) {
      return var0.c8;
   }

   // $VF: synthetic method
   static b4 l6(v2 var0, b4 var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static b4 l6(v2 var0) {
      return var0.s7;
   }
}
