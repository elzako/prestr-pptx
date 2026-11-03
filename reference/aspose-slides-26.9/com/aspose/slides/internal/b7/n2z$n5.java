package com.aspose.slides.internal.b7;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

class n2z$n5 {
   private l2p[] n5;
   private int l6;
   private g8v k5;
   private d4 u3 = new d4();
   private double a6;
   private double u9;
   private double h0;

   public final g8v n5() {
      return this.k5;
   }

   public final d4 l6() {
      return this.u3;
   }

   public final int k5() {
      return this.l6;
   }

   public final double u3() {
      return this.a6;
   }

   public final double a6() {
      return this.u9;
   }

   public final double u9() {
      return this.h0;
   }

   public final l2p[] h0() {
      return this.n5;
   }

   public n2z$n5(int var1, l2p[] var2, double var3) {
      this.n5 = var2;
      this.l6 = var1;
      this.h0 = var3;
      this.t2();
   }

   public static n2z$n5 n5(IGenericEnumerable<n2z$n5> var0) {
      List var1 = new List();
      boolean var2 = false;
      byte var3 = 0;
      double var4 = 0.0;
      int var6 = 0;
      IGenericEnumerator var7 = var0.iterator();

      try {
         for (; var7.hasNext(); var6++) {
            n2z$n5 var8 = (n2z$n5)var7.next();
            var1.addRange(com.aspose.slides.ms.System.u3.n5(var8.n5));
            if (var3 != var8.l6) {
               var3 = (byte)(var6 == 0 ? var8.l6 : 0);
            }

            if (var4 < var8.h0) {
               var4 = var8.h0;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
            var7.dispose();
         }
      }

      return new n2z$n5(var3, (l2p[])var1.toArray(new l2p[0]), var4);
   }

   public static List<n2z$n5> l6(IGenericEnumerable<n2z$n5> var0) {
      List var1 = new List();
      IGenericEnumerator var2 = var0.iterator();

      try {
         while (var2.hasNext()) {
            n2z$n5 var3 = (n2z$n5)var2.next();
            var1.addRange(var3.c8());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      return var1;
   }

   public final List<n2z$n5> c8() {
      List var1 = new List();
      if (this.n5.length > 0) {
         List var2 = new List();
         l2p var3 = this.n5[0];
         var2.addItem(var3);

         for (int var4 = 1; var4 < this.n5.length; var4++) {
            l2p var5 = this.n5[var4];
            if (var5.l6().u3() > var3.l6().u3() + var5.n5() / 2.0) {
               if (((l2p)var2.get_Item(var2.size() - 1)).u3().l6().n5() == 0) {
                  var2.removeAt(var2.size() - 1);
               }

               var1.addItem(new n2z$n5(this.l6, (l2p[])var2.toArray(new l2p[0]), this.h0));
               var2 = new List();
            }

            var2.addItem(var5);
            var3 = var5;
         }

         if (var2.size() > 0) {
            var1.addItem(new n2z$n5(this.l6, (l2p[])var2.toArray(new l2p[0]), this.h0));
         }
      }

      return var1;
   }

   public final void n5(k0 var1, double var2) {
      for (l2p var7 : this.n5) {
         var7.n5(var1.u3(), var2);
      }

      this.h0 *= var2;
      this.t2();
   }

   private void t2() {
      this.k5 = new g8v(this.n5);
      this.a6 = 0.0;
      this.u9 = 0.0;
      if (this.n5.length > 0) {
         double var1 = Double.MAX_VALUE;
         double var3 = -Double.MAX_VALUE;
         double var5 = Double.MAX_VALUE;
         double var7 = -Double.MAX_VALUE;

         for (l2p var12 : this.n5) {
            d4 var13 = var12.l6().s7();
            var1 = com.aspose.slides.ms.System.q1.k5(var1, var13.n5());
            var3 = com.aspose.slides.ms.System.q1.l6(var3, var13.k5());
            var5 = com.aspose.slides.ms.System.q1.k5(var5, var13.l6());
            var7 = com.aspose.slides.ms.System.q1.l6(var7, var13.u3());
            this.a6 = this.a6 + var13.h0();
            if (var13.c8() > this.u9) {
               this.u9 = var13.c8();
            }
         }

         this.u3 = new d4(var1, var5, var3, var7);
      } else {
         this.u3 = new d4();
      }
   }
}
