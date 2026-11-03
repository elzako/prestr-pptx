package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.ms.System.IDisposable;

class x8t extends l3c {
   private boolean k5 = true;
   private com.aspose.slides.ms.System.o5<com.aspose.slides.internal.o9b.y2> u3 = new com.aspose.slides.ms.System.o5<>();
   private SortedList<Integer, Object> a6 = new SortedList<>();
   private SortedList<Integer, Object> u9 = new SortedList<>();
   private int h0 = 0;
   private int c8 = 0;

   public x8t(v5s var1) {
      super(var1);
   }

   final int n5(int var1) {
      if (var1 >= 0 && var1 <= this.h0 - 1) {
         return this.a6.size() == var1 + 1 ? this.a6.getKeys().get_Item(var1) : this.a6.getKeys().get_Item(var1 + 1) - this.a6.getKeys().get_Item(var1);
      } else {
         return -1;
      }
   }

   final int l6(int var1) {
      if (var1 >= 0 && var1 <= this.c8 - 1) {
         return this.u9.size() == var1 + 1 ? this.u9.getKeys().get_Item(var1) : this.u9.getKeys().get_Item(var1 + 1) - this.u9.getKeys().get_Item(var1);
      } else {
         return -1;
      }
   }

   @Override
   void t2() {
      com.aspose.slides.internal.k0r.q5 var1 = this.n3();
      if (var1 != null) {
         if (var1.l6() == null) {
            this.k5 = false;
         }

         if (var1.t2() == null) {
            if (var1.c8() == null) {
               this.k5 = false;
            } else {
               com.aspose.slides.internal.o9b.y2 var2 = var1.c8().u9().n3();
               com.aspose.slides.internal.k0r.t7 var3 = this.e2().k5().t2();
               if (var3 != null) {
                  com.aspose.slides.internal.o9b.y2 var4 = var3.u9().n3();
                  if (var4.t2() <= var2.t2()) {
                     var2.k5(var4.s7());
                  }

                  if (var4.l6() <= var2.l6()) {
                     var2.u3(var4.x8());
                  }
               }

               this.u3 = new com.aspose.slides.ms.System.o5<>(var2.n3());
            }
         } else {
            this.u3 = new com.aspose.slides.ms.System.o5<>(var1.t2().u9().n3());
         }
      } else {
         this.k5 = false;
      }

      if (this.k5) {
         this.c4();
      }
   }

   final com.aspose.slides.internal.o9b.y2 n5(com.aspose.slides.internal.o9b.y2 var1) {
      int var2 = this.a6.indexOfKey(var1.s7());
      int var3 = this.u9.indexOfKey(var1.x8());
      int var4 = 0;
      int var5 = 0;
      int var6 = var1.s7() + var1.t2();
      int var7 = var1.x8() + var1.l6();

      while (this.a6.getKeys().get_Item(var2 + var4) < var6) {
         var4++;
      }

      while (this.u9.getKeys().get_Item(var3 + var5) < var7) {
         var5++;
      }

      return new com.aspose.slides.internal.o9b.y2(var2, var3, var4, var5);
   }

   private void c4() {
      int var1 = Integer.MIN_VALUE;
      int var2 = Integer.MIN_VALUE;
      List$Enumerator var3 = this.u9().iterator();

      try {
         while (var3.hasNext()) {
            v5s var4 = (v5s)var3.next();
            q7n var5 = (q7n)var4.a6();
            com.aspose.slides.internal.k0r.q5 var6 = com.aspose.slides.internal.v6g.k5.n5(var4.k5(), com.aspose.slides.internal.k0r.q5.class);
            if (var6 != null) {
               com.aspose.slides.internal.o9b.y2 var7 = var5.l6().n3();
               if (var4.c8() == 5) {
                  this.a6.set_Item(var7.s7(), null);
                  this.u9.set_Item(var7.x8(), null);
                  if (var7.s7() + var7.t2() > var1) {
                     var1 = var7.s7() + var7.t2();
                  }

                  if (var7.x8() + var7.l6() > var2) {
                     var2 = var7.x8() + var7.l6();
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      if (!this.u3.l6()) {
         this.u3 = new com.aspose.slides.ms.System.o5<>(
            new com.aspose.slides.internal.o9b.y2(
               this.a6.getKeys().get_Item(0), this.u9.getKeys().get_Item(0), var1 - this.a6.getKeys().get_Item(0), var2 - this.u9.getKeys().get_Item(0)
            )
         );
      }

      this.h0 = this.a6.size();
      this.c8 = this.u9.size();
      this.a6.set_Item(var1, null);
      this.u9.set_Item(var2, null);
   }

   final Table c8() {
      return (Table)this.l6;
   }

   final void n5(Table var1) {
      this.x8();
      this.l6 = var1;
   }

   final int j5() {
      return this.h0;
   }

   final int w1() {
      return this.c8;
   }

   final com.aspose.slides.internal.o9b.y2 r4() {
      return this.u3.l6() ? this.u3.n5() : new com.aspose.slides.internal.o9b.y2();
   }
}
