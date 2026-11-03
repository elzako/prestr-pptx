package com.aspose.slides.internal.g7;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.ms.System.IDisposable;

public class d4n extends n3c {
   private d4n$n5[] n5;
   private SortedList<Integer, Integer> l6 = new SortedList<>();

   public d4n(int var1, int var2, v7u var3) {
      super(var1, var2, var3);
   }

   @Override
   public void n5(f3c var1) {
      var1.y4();
      var1.y4();
      long var2 = var1.y4();
      this.n5 = new d4n$n5[(int)var2];

      for (int var4 = 0; var4 < (var2 & 4294967295L); var4++) {
         long var5 = var1.y4();
         long var7 = var1.y4();
         long var9 = var1.y4();
         this.n5[var4] = new d4n$n5(var5, var7, var9);
      }

      super.n5(var1);
   }

   @Override
   public void n5(int var1, int var2) {
      if (!this.l6.containsKey(var1)) {
         this.l6.addItem(var1, var2);
      }
   }

   private void h0() {
      com.aspose.slides.ms.System.o5 var1 = new com.aspose.slides.ms.System.o5();
      com.aspose.slides.ms.System.o5 var2 = new com.aspose.slides.ms.System.o5();
      com.aspose.slides.ms.System.o5 var3 = new com.aspose.slides.ms.System.o5();
      com.aspose.slides.ms.System.o5 var4 = new com.aspose.slides.ms.System.o5();
      List var5 = this.n5 == null ? new List() : new List<>(com.aspose.slides.ms.System.u3.n5(this.n5));
      IGenericEnumerator var6 = this.l6.iterator();

      try {
         while (var6.hasNext()) {
            KeyValuePair var7 = (KeyValuePair)var6.next();
            long var8 = ((Integer)var7.getKey()).intValue() & 4294967295L;
            long var10 = ((Integer)var7.getValue()).intValue() & 4294967295L;
            if (com.aspose.slides.ms.System.o5.n5(var1, null)) {
               var1 = new com.aspose.slides.ms.System.o5<>(var8);
               var2 = new com.aspose.slides.ms.System.o5<>(var8);
               var3 = new com.aspose.slides.ms.System.o5<>(var10);
               var4 = new com.aspose.slides.ms.System.o5<>(var10);
            } else {
               com.aspose.slides.ms.System.o5 var12 = (var2.l6()
                     ? new com.aspose.slides.ms.System.o5<>(((Long)var2.n5(long.class) & 4294967295L) + 1L)
                     : new com.aspose.slides.ms.System.o5<>())
                  .k5();
               com.aspose.slides.ms.System.o5 var13 = (var4.l6()
                     ? new com.aspose.slides.ms.System.o5<>(((Long)var4.n5(long.class) & 4294967295L) + 1L)
                     : new com.aspose.slides.ms.System.o5<>())
                  .k5();
               if (com.aspose.slides.ms.System.o5.n5(new com.aspose.slides.ms.System.o5<>(var8), var12)
                  && com.aspose.slides.ms.System.o5.n5(new com.aspose.slides.ms.System.o5<>(var10), var13)) {
                  var2 = new com.aspose.slides.ms.System.o5<>(var8);
                  var4 = new com.aspose.slides.ms.System.o5<>(var10);
               } else {
                  var5.addItem(new d4n$n5((Long)var1.n5() & 4294967295L, (Long)var2.n5() & 4294967295L, (Long)var3.n5() & 4294967295L));
                  var1 = new com.aspose.slides.ms.System.o5<>(var8);
                  var2 = new com.aspose.slides.ms.System.o5<>(var8);
                  var3 = new com.aspose.slides.ms.System.o5<>(var10);
                  var4 = new com.aspose.slides.ms.System.o5<>(var10);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      if (com.aspose.slides.ms.System.o5.l6(var1, null)) {
         var5.addItem(new d4n$n5((Long)var1.n5() & 4294967295L, (Long)var2.n5() & 4294967295L, (Long)var3.n5() & 4294967295L));
      }

      this.n5 = (d4n$n5[])var5.toArray(new d4n$n5[0]);
   }

   public final List<Long> l6() {
      List var1 = new List();

      for (d4n$n5 var5 : this.n5) {
         for (long var6 = var5.n5; (var6 & 4294967295L) <= (var5.l6 & 4294967295L); var6++) {
            var1.addItem(var6);
         }
      }

      return var1;
   }

   @Override
   public void n5(byte[][] var1, long[] var2) {
      this.h0();
      com.aspose.slides.internal.z0k.e2 var3 = new com.aspose.slides.internal.z0k.e2();

      try {
         j2p var4 = new j2p(var3, true);

         try {
            var4.n5(12);
            var4.n5(0);
            var4.k5(0L);
            var4.k5(0L);
            var4.k5(this.n5.length & 4294967295L);

            for (d4n$n5 var8 : this.n5) {
               var4.k5(var8.n5);
               var4.k5(var8.l6);
               var4.k5(var8.k5);
            }

            var2[0] = var3.getPosition() & 4294967295L;
            var4.n5(4L);
            var4.k5(var2[0]);
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }

         var3.close();
         var1[0] = var3.toArray();
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   @Override
   public int n5(int var1) {
      for (int var2 = 0; var2 < this.n5.length; var2++) {
         if (var1 >= (this.n5[var2].n5 & 4294967295L) && var1 <= (this.n5[var2].l6 & 4294967295L)) {
            return (int)(((this.n5[var2].k5 & 4294967295L) + var1 & 4294967295L) - (this.n5[var2].n5 & 4294967295L));
         }

         if (var1 < (this.n5[var2].l6 & 4294967295L) && var1 < (this.n5[var2].n5 & 4294967295L)) {
            break;
         }
      }

      return 0;
   }

   public final void n5(SortedList<Long, Long> var1) {
      for (int var2 = 0; var2 < this.n5.length; var2++) {
         var1.addItem(this.n5[var2].n5, this.n5[var2].l6);
      }
   }
}
