package com.aspose.slides.internal.x1;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.IDisposable;

public class x8 {
   private l6 n5 = null;
   private e2 l6 = null;
   private t9 k5 = null;
   private s7 u3 = null;
   private List<y4> a6 = null;
   private h0 u9;
   private n3 h0;

   public x8() {
      this.u9 = new h0();
      this.u9.n5(new t2("Root Entry"));
   }

   public x8(t4 var1) {
      this.n5(var1);
   }

   public final void n5(t4 var1) {
      this.u3 = new a6(var1);
      this.n5 = this.u3.n5();
      this.l6 = this.u3.l6();
      this.u9 = new h0();
      long var2 = this.u9.l6(this.u3);
      if (this.n5.h0() > 0L
         && (this.n5.u9() & 4294967295L) != 4294967295L
         && (this.n5.u9() & 4294967295L) != 4294967294L
         && (var2 & 4294967295L) != 4294967294L
         && this.n5.h0() > 0L) {
         this.k5 = new t9(this.n5.l6());
         this.k5.n5(this.n5.u9(), this.l6, this.u3);
         this.n5(var2);
      }

      this.u9.n5(this.u3);
      List var4 = this.u9.n5();

      for (int var5 = 0; var5 < var4.size(); var5++) {
         c8 var6 = (c8)var4.get_Item(var5);
         if (com.aspose.slides.internal.v6g.k5.l6(var6, u9.class)) {
            u9 var7 = (u9)var6;
            if (var7.n3() < this.n5.a6()) {
               var7.n5(var7.u3(), this.k5, this.a6);
            } else {
               var7.n5(var7.u3(), this.l6, this.u3);
            }
         }
      }

      this.u3 = null;
      this.a6 = null;
   }

   private void n5(long var1) {
      u9 var3 = new u9(var1, this.l6, this.u3);
      this.a6 = new List<>();
      int var4 = this.n5.l6();

      for (int var5 = 0; var5 < var3.n5().length; var5 += var4) {
         byte[] var6 = new byte[var4];
         System.arraycopy(var3.n5(), var5, var6, 0, var4);
         y4 var7 = new y4(var6);
         this.a6.addItem(var7);
      }
   }

   public final void l6(t4 var1) {
      this.a6();
      this.u3();
      this.k5();
      this.l6();
      List var2 = this.u9.n5();
      u9 var3 = this.n5(var2);
      u9 var4 = this.u9.l6();
      this.n5(var4);
      this.n5.n5(this.l6.n5(this.n5.n5()));
      this.n5.k5(this.k5.n5(this.n5.n5()));
      this.n5.k5(this.h0.a6() & 4294967295L);
      this.n5.u3(this.h0.n5(this.n5.n5()));
      this.n5.n5(var1);
      SortedList var5 = new SortedList();
      this.n5(var1, var5);
      this.l6(var5);
      this.n5(var5);
      this.l6(var3, var5);
      this.n5(var4, var5);
      this.n5(var2, var5);
      IGenericEnumerator var6 = var5.getValues().iterator();

      try {
         while (var6.hasNext()) {
            y4 var7 = (y4)var6.next();
            var1.write(var7.n5(), 0, var7.n5().length);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }
   }

   private void n5(List<c8> var1, SortedList<Long, y4> var2) {
      for (int var3 = 0; var3 < var1.size(); var3++) {
         if (com.aspose.slides.internal.v6g.k5.l6(var1.get_Item(var3), u9.class)) {
            u9 var4 = (u9)var1.get_Item(var3);
            if (var4.n3() >= this.n5.a6()) {
               List<y4> var5 = var4.n5(this.n5.n5());
               long[] var6 = this.l6.n5(var4.u3());

               for (int var7 = 0; var7 < var5.size(); var7++) {
                  var2.addItem(var6[var7], var5.get_Item(var7));
               }
            }
         }
      }
   }

   private void n5(u9 var1, SortedList<Long, y4> var2) {
      List<y4> var3 = var1.n5(this.n5.n5());
      long[] var4 = this.l6.n5(var1.u3());

      for (int var5 = 0; var5 < var3.size(); var5++) {
         var2.addItem(var4[var5], var3.get_Item(var5));
      }
   }

   private void l6(u9 var1, SortedList<Long, y4> var2) {
      List<y4> var3 = var1.n5(this.n5.n5());
      long[] var4 = this.l6.n5(this.u9.k5().u3());

      for (int var5 = 0; var5 < var3.size(); var5++) {
         var2.addItem(var4[var5], var3.get_Item(var5));
      }
   }

   private void n5(SortedList<Long, y4> var1) {
      List<y4> var2 = this.k5.l6(this.n5.n5());
      long[] var3 = this.l6.n5(this.n5.u9());

      for (int var4 = 0; var4 < var3.length; var4++) {
         var1.addItem(var3[var4], var2.get_Item(var4));
      }
   }

   private void l6(SortedList<Long, y4> var1) {
      long[] var2 = this.h0.u3();
      List<y4> var3 = this.l6.l6(this.n5.n5());

      for (int var4 = 0; var4 < var3.size(); var4++) {
         var1.addItem(var2[var4], var3.get_Item(var4));
      }
   }

   private void n5(t4 var1, SortedList<Long, y4> var2) {
      var1.write(this.h0.u9(), 0, this.h0.u9().length);
      List<y4> var3 = this.h0.l6(this.n5.n5());
      long[] var4 = this.l6.u9();
      if (!var3.isEmpty()) {
         y4 var5 = (y4)var3.get_Item(0);
         var2.addItem(var4[0], var3.get_Item(0));
         int var6 = this.n5.n5();

         for (int var7 = 1; var7 < var3.size(); var7++) {
            var2.addItem(var4[var7], var3.get_Item(var7));
            var5 = (y4)var3.get_Item(var7);
         }

         var5.n5()[var6 - 4] = -2;
         var5.n5()[var6 - 3] = -1;
         var5.n5()[var6 - 2] = -1;
         var5.n5()[var6 - 1] = -1;
      }
   }

   private void n5(u9 var1) {
      long var2 = this.l6.k5(var1.l6(this.n5.n5()));
      this.n5.n5(var2);
      var1.n5(var2);
   }

   private u9 n5(List<c8> var1) {
      List var2 = new List();

      for (int var3 = 0; var3 < var1.size(); var3++) {
         if (com.aspose.slides.internal.v6g.k5.l6(var1.get_Item(var3), u9.class)) {
            u9 var4 = (u9)var1.get_Item(var3);
            if (var4.n3() < this.n5.a6()) {
               var2.addItem(var4);
            }
         }
      }

      u9 var7 = this.n5(var2, this.k5, this.n5);
      long var5 = this.l6.k5(var7.l6(this.n5.n5()));
      this.u9.k5().n5(var5);
      this.u9.k5().u3(var7.n3());
      return var7;
   }

   private void l6() {
      long var1 = this.l6.k5(this.k5.n5(this.n5.n5()));
      this.n5.l6(var1);
   }

   private void k5() {
      List var1 = this.u9.n5();

      for (int var2 = 0; var2 < var1.size(); var2++) {
         if (com.aspose.slides.internal.v6g.k5.l6(var1.get_Item(var2), u9.class)) {
            u9 var3 = (u9)var1.get_Item(var2);
            if (var3.n3() < this.n5.a6()) {
               long var4 = this.k5.k5(var3.l6(this.n5.l6()));
               var3.n5(var4);
            } else {
               long var6 = this.l6.k5(var3.l6(this.n5.n5()));
               var3.n5(var6);
            }
         }
      }
   }

   private void u3() {
      this.l6 = new e2(this.n5.n5());
      this.h0 = new n3(this.n5.n5());
      this.k5 = new t9(this.n5.l6());
      this.l6.n5(this.h0);
      this.h0.n5(this.l6);
   }

   private void a6() {
      this.n5 = new l6();
      this.n5.n5((short)-2);
      this.n5.l6(4096);
      this.n5.l6((short)512);
      this.n5.k5((short)64);
   }

   private u9 n5(List<u9> var1, t9 var2, l6 var3) {
      u9 var4 = new u9();
      SortedList var5 = new SortedList();

      for (int var6 = 0; var6 < var1.size(); var6++) {
         u9 var7 = (u9)var1.get_Item(var6);
         List var8 = var7.n5(var3.l6());
         long[] var9 = var2.n5(var7.u3());

         for (int var10 = 0; var10 < var8.size(); var10++) {
            var5.addItem(var9[var10], var8.get_Item(var10));
         }
      }

      IGenericEnumerator var14 = var5.getValues().iterator();

      try {
         while (var14.hasNext()) {
            y4 var15 = (y4)var14.next();
            var4.n5(var15.n5());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      return var4;
   }

   public final t2 n5() {
      return this.u9.k5();
   }
}
