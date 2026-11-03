package com.aspose.slides.internal.r4;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.e1x.a0;
import com.aspose.slides.internal.e1x.b3;
import com.aspose.slides.internal.e1x.i1;
import com.aspose.slides.internal.o8m.l4;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class z1 implements IDisposable {
   private static final com.aspose.slides.internal.v6g.c8<z1> n5 = new com.aspose.slides.internal.v6g.c8<>(null);
   private Dictionary<String, List<z1$n5>> l6 = new Dictionary<>();

   public static z1 n5() {
      if (n5.get() == null) {
         n5.set(new z1());
      }

      return n5.get();
   }

   public static z1 n5(boolean[] var0) {
      var0[0] = true;
      if (n5.get() == null) {
         n5.set(new z1());
         var0[0] = false;
      }

      return n5.get();
   }

   private z1() {
   }

   public final void n5(String var1, String var2, int var3, byte[] var4) {
      this.n5(var1, var2, var3, n5(var1, var4));
   }

   private static byte[] n5(i1 var0) {
      com.aspose.slides.internal.z0k.t4 var1 = var0.y1().l6();

      try {
         l4 var2 = l4.a6();

         try {
            return var2.n5(var1);
         } finally {
            if (var2 != null) {
               var2.dispose();
            }
         }
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   public final void n5(String var1, String var2, int var3, i1 var4) {
      var1 = d1.n5(var1, com.aspose.slides.internal.x7n.l6.k5());
      List var5 = this.l6.containsKey(var1) ? this.l6.get_Item(var1) : null;
      if (var5 == null) {
         List var9 = new List();
         var9.addItem(new z1$n5(var4, var3, var2));
         this.l6.set_Item(var1, var9);
      } else {
         int var6 = n5(var5, var2, var3);
         byte[] var7 = n5(var4);
         if (var6 == -1 || !((z1$n5)var5.get_Item(var6)).n5(var7)) {
            var5.addItem(new z1$n5(var4, var3, var2, var7));
         }
      }
   }

   public final void l6(String var1, String var2, int var3, byte[] var4) {
      var1 = d1.n5(var1, com.aspose.slides.internal.x7n.l6.k5());
      i1 var5 = n5(var1, var4);
      z1$n5 var6 = new z1$n5(var5, var3, var2);
      List var7 = this.l6.containsKey(var1) ? this.l6.get_Item(var1) : null;
      if (var7 == null) {
         List var10 = new List();
         var10.addItem(var6);
         this.l6.set_Item(var1, var10);
      } else {
         int var8 = n5(var7, var2, var3);
         if (var8 != -1) {
            var7.set_Item(var8, var6);
         }

         var7.addItem(var6);
      }
   }

   private static i1 n5(String var0, byte[] var1) {
      a0 var2 = new a0(var1);
      b3 var3 = new b3();
      return var3.n5(var2, var0);
   }

   private static int n5(List<z1$n5> var0, String var1, int var2) {
      for (int var3 = 0; var3 < var0.size(); var3++) {
         z1$n5 var4 = (z1$n5)var0.get_Item(var3);
         if (d1.a6(var4.k5(), var1) && var4.l6() == var2) {
            return var3;
         }
      }

      return -1;
   }

   public final i1 n5(String var1, String var2, int var3) {
      var1 = d1.n5(var1, com.aspose.slides.internal.x7n.l6.k5());
      List var4 = this.l6.containsKey(var1) ? this.l6.get_Item(var1) : null;
      if (var4 == null) {
         return null;
      }

      int var5 = n5(var4, var2, var3);
      return var5 != -1 ? ((z1$n5)var4.get_Item(var5)).n5() : null;
   }

   @Override
   public final void dispose() {
      n5.set(null);
   }
}
