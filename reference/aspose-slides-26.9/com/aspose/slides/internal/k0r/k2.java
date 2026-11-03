package com.aspose.slides.internal.k0r;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.ms.System.IDisposable;

public class k2 extends o8 {
   private static final int[] n5 = new int[]{
      1007,
      Integer.MAX_VALUE,
      2032,
      6,
      4003,
      Integer.MAX_VALUE,
      1059,
      Integer.MAX_VALUE,
      1017,
      0,
      4057,
      Integer.MAX_VALUE,
      1059,
      Integer.MAX_VALUE,
      1036,
      Integer.MAX_VALUE,
      2032,
      1,
      4026,
      3,
      5000,
      Integer.MAX_VALUE,
      1038,
      Integer.MAX_VALUE,
      1039,
      Integer.MAX_VALUE,
      1054,
      Integer.MAX_VALUE,
      1053,
      Integer.MAX_VALUE,
      1052,
      Integer.MAX_VALUE,
      11021,
      Integer.MAX_VALUE,
      11019,
      Integer.MAX_VALUE,
      4026,
      2
   };
   private SortedList<Integer, e5a> l6 = null;

   public k2() {
      this.w1().n5(1016);
   }

   public final o6t n5(int var1) {
      for (int var2 = 0; var2 < this.e2().size(); var2++) {
         o6t var3 = com.aspose.slides.internal.v6g.k5.n5(this.e2().get_Item(var2), o6t.class);
         if (var3 != null && var3.w1().k5() == (short)var1) {
            return (o6t)var3.d2();
         }
      }

      return null;
   }

   public final j8m u3(int var1) {
      l7h var2 = this.a6();
      if (var2 != null) {
         m2 var3 = var2.l6();
         if (var3 != null) {
            List$Enumerator var4 = var3.e2().iterator();

            try {
               while (var4.hasNext()) {
                  e6r var5 = (e6r)var4.next();
                  if ((var5.r4() & 65535) == 4013 && var5.w1().k5() == var1) {
                     return (j8m)var5;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
                  var4.dispose();
               }
            }
         }
      }

      return null;
   }

   @Override
   protected int[] k5() {
      return n5;
   }

   public final String t2() {
      z1 var1 = this.n5((short)2);
      return var1 != null ? var1.l6() : "";
   }

   public final void n5(String var1) {
      this.n5((short)2, var1);
   }

   public final k7[] s7() {
      List var1 = new List();

      for (int var2 = 0; var2 < this.e2().size(); var2++) {
         k7 var3 = com.aspose.slides.internal.v6g.k5.n5(this.e2().get_Item(var2), k7.class);
         if (var3 != null && var3.w1().k5() == 6) {
            var1.addItem(var3);
         }
      }

      return (k7[])var1.toArray(new k7[0]);
   }

   public final o6t[] x8() {
      List var1 = new List();

      for (int var2 = 0; var2 < this.e2().size(); var2++) {
         o6t var3 = com.aspose.slides.internal.v6g.k5.n5(this.e2().get_Item(var2), o6t.class);
         if (var3 != null) {
            var1.addItem(var3);
         }
      }

      return (o6t[])var1.toArray(new o6t[0]);
   }

   public final v7u t9() {
      return (v7u)this.k5(1059);
   }

   public final SortedList<Integer, e5a> z1() {
      if (this.l6 == null) {
         for (int var1 = 0; var1 < this.e2().size(); var1++) {
            e5a var2 = com.aspose.slides.internal.v6g.k5.n5(this.e2().get_Item(var1), e5a.class);
            if (var2 != null) {
               if (this.l6 == null) {
                  this.l6 = new SortedList<>();
               }

               this.l6.addItem(Integer.valueOf(var2.y2()), var2);
            }
         }
      }

      return this.l6;
   }
}
