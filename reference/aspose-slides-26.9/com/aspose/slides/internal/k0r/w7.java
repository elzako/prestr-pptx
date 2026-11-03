package com.aspose.slides.internal.k0r;

import com.aspose.slides.PptException;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public final class w7 extends r4 {
   private long n5 = 2L;
   private t1 l6 = null;
   private static final int[] k5 = new int[]{
      1000, Integer.MAX_VALUE, 1016, Integer.MAX_VALUE, 1006, Integer.MAX_VALUE, 1008, Integer.MAX_VALUE, 4113, 0, 6002, 1, 4085, 2
   };

   private long z1() {
      return this.n5++;
   }

   public final int l6() {
      int var1 = -1;

      for (int var2 = 0; var2 < this.e2().size() && (this.e2().get_Item(var2).r4() & 65535) != 4085; var2++) {
         if (var2 == 0) {
            var1 = 0;
         }

         var1 += this.e2().get_Item(var2).n5() + 8;
      }

      return var1;
   }

   public final int u3() {
      int var1 = -1;

      for (int var2 = 0; var2 < this.e2().size() && (this.e2().get_Item(var2).r4() & 65535) != 6002; var2++) {
         if (var2 == 0) {
            var1 = 0;
         }

         var1 += this.e2().get_Item(var2).n5() + 8;
      }

      return var1;
   }

   public final long a6() {
      j2 var1 = this.x8();
      return var1.n5(this.e2());
   }

   public final long u9() {
      long var1 = 0L;

      for (int var3 = 0; var3 < this.e2().size(); var3++) {
         if (com.aspose.slides.internal.v6g.k5.l6(this.e2().get_Item(var3), m4.class)) {
            var1 = com.aspose.slides.ms.System.q1.l6(var1, ((m4)this.e2().get_Item(var3)).c8());
         }
      }

      return var1;
   }

   public final e6r n5(long var1) {
      List$Enumerator var3 = this.e2().iterator();

      try {
         while (var3.hasNext()) {
            e6r var4 = (e6r)var3.next();
            m4 var5 = com.aspose.slides.internal.v6g.k5.n5(var4, m4.class);
            if (var5 != null && var5.c8() == var1) {
               return var4;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return null;
   }

   public final u3 l6(long var1) {
      List$Enumerator var3 = this.e2().iterator();

      try {
         while (var3.hasNext()) {
            e6r var4 = (e6r)var3.next();
            m4 var5 = com.aspose.slides.internal.v6g.k5.n5(var4, m4.class);
            if (var5 != null && var5.c8() == var1) {
               u3 var6 = com.aspose.slides.internal.v6g.k5.n5(var4, u3.class);
               if (var6 != null) {
                  return var6;
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return null;
   }

   public final h9 k5(long var1) {
      List$Enumerator var3 = this.e2().iterator();

      try {
         while (var3.hasNext()) {
            e6r var4 = (e6r)var3.next();
            m4 var5 = com.aspose.slides.internal.v6g.k5.n5(var4, m4.class);
            if (var5 != null && var5.c8() == var1) {
               h9 var6 = com.aspose.slides.internal.v6g.k5.n5(var4, h9.class);
               if (var6 != null) {
                  return var6;
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return null;
   }

   public final t1 h0() {
      if (this.l6 != null) {
         return this.l6;
      }

      this.l6 = (t1)this.k5(1000);
      if (this.l6 == null && this.n3()) {
         this.l6 = new t1();
         this.l6.l6(true);
         this.e2().insertItem(0, this.l6);
         this.l6.n5(1L);
         this.l6.l6();
      }

      return this.l6;
   }

   public final List<k2> c8() {
      List var1 = new List();

      for (int var2 = 0; var2 < this.e2().size(); var2++) {
         k2 var3 = com.aspose.slides.internal.v6g.k5.n5(this.e2().get_Item(var2), k2.class);
         if (var3 != null) {
            var1.addItem(var3);
         }
      }

      return var1;
   }

   public final List<u6p> t2() {
      List var1 = new List();

      for (int var2 = 0; var2 < this.e2().size(); var2++) {
         u6p var3 = com.aspose.slides.internal.v6g.k5.n5(this.e2().get_Item(var2), u6p.class);
         if (var3 != null) {
            var1.addItem(var3);
         }
      }

      return var1;
   }

   public final List<h9> s7() {
      List var1 = new List();

      for (int var2 = 0; var2 < this.e2().size(); var2++) {
         h9 var3 = com.aspose.slides.internal.v6g.k5.n5(this.e2().get_Item(var2), h9.class);
         if (var3 != null) {
            var1.addItem(var3);
         }
      }

      return var1;
   }

   public final j2 x8() {
      j2 var1 = null;
      int var2 = 0;

      for (int var3 = 0; var3 < this.e2().size(); var3++) {
         if ((this.e2().get_Item(var3).r4() & 65535) == 6002) {
            var1 = (j2)this.e2().get_Item(var3);
            var2++;
         }
      }

      if (var2 == 0) {
         throw new PptException("Can't open presentation. PersistDirectoryAtom record not found.");
      } else {
         return var1;
      }
   }

   public final c4i t9() {
      for (int var1 = this.e2().size() - 1; var1 >= 0; var1--) {
         if ((this.e2().get_Item(var1).r4() & 65535) == 4085) {
            return (c4i)this.e2().get_Item(var1);
         }
      }

      return null;
   }

   public final long n5(o4 var1) {
      var1.n5(this.z1());
      this.e2().addItem(var1);
      return var1.c8();
   }

   public final long n5(g8 var1) {
      var1.n5(this.z1());
      this.e2().addItem(var1);
      return var1.c8();
   }

   public final w1n n5(k2 var1, long var2) {
      var1.n5(this.z1());
      this.e2().addItem(var1);
      return this.h0().n5(var1, var2);
   }

   public final w1n n5(u6p var1, long var2) {
      var1.n5(this.z1());
      this.e2().addItem(var1);
      return this.h0().n5(var1, var2);
   }

   public final w1n l6(u6p var1, long var2) {
      var1.n5(this.z1());
      this.e2().addItem(var1);
      return this.h0().l6(var1, var2);
   }

   public final w1n l6(o4 var1) {
      var1.n5(this.z1());
      this.e2().addItem(var1);
      return this.h0().n5(var1);
   }

   public final long n5(h9 var1) {
      var1.n5(this.z1());
      this.n5((e6r)var1);
      return var1.c8();
   }

   @Override
   protected int[] k5() {
      return k5;
   }
}
