package com.aspose.slides.internal.d0c;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.a3p.y4;
import com.aspose.slides.internal.u2w.a6;
import com.aspose.slides.internal.u2w.c8;
import com.aspose.slides.ms.System.IDisposable;

public class u3 {
   private final Dictionary<Integer, u3$n5> n5 = new Dictionary<>();

   protected final boolean l6(int var1) {
      return this.n5.containsKey(var1);
   }

   protected final a6[] k5(int var1) {
      List var2 = new List();
      Dictionary$ValueCollection$Enumerator var3 = this.n5.getValues().iterator();

      try {
         while (var3.hasNext()) {
            u3$n5 var4 = (u3$n5)var3.next();
            if (var1 == -1 || var4.n5() == var1) {
               var2.addItem(var4.l6());
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      return (a6[])var2.toArray(new a6[0]);
   }

   protected final void n5(int var1, a6[] var2) {
      if (var1 == -1) {
         this.n5.clear();
      }

      if (var2 != null) {
         for (a6 var6 : var2) {
            u3$n5.n5(this.n5, var6, var1);
         }
      }
   }

   protected final c8 u3(int var1) {
      c8 var2 = null;
      a6 var3 = this.a6(var1);
      if (com.aspose.slides.internal.v6g.k5.l6(var3, com.aspose.slides.internal.a3p.c8.class)) {
         com.aspose.slides.internal.a3p.c8 var4 = (com.aspose.slides.internal.a3p.c8)var3;
         if (var4.y4().length > 0) {
            var2 = var4.y4()[0];
         }
      }

      return var2;
   }

   protected final void n5(int var1, c8 var2, int var3) {
      com.aspose.slides.internal.a3p.c8 var4 = new com.aspose.slides.internal.a3p.c8(var1);
      var4.n5(new c8[]{var2});
      u3$n5.n5(this.n5, var4, var3);
   }

   protected final void n5(int var1, String var2, int var3) {
      com.aspose.slides.internal.a3p.n5 var4 = new com.aspose.slides.internal.a3p.n5(var1);
      var4.n5(var2);
      u3$n5.n5(this.n5, var4, var3);
   }

   protected final int n5(int var1, int var2) {
      int var3 = var2;
      a6 var4 = this.a6(var1);
      if (com.aspose.slides.internal.v6g.k5.l6(var4, y4.class)) {
         y4 var5 = (y4)var4;
         if (var5.y4().length > 0) {
            var3 = var5.y4()[0];
         }
      }

      return var3;
   }

   protected final void n5(int var1, int var2, int var3) {
      y4 var4 = new y4(var1);
      var4.n5(new int[]{var2});
      u3$n5.n5(this.n5, var4, var3);
   }

   protected final a6 a6(int var1) {
      a6 var2 = null;
      if (this.n5.containsKey(var1)) {
         var2 = this.n5.get_Item(var1).l6();
      }

      return var2;
   }
}
