package com.aspose.slides.internal.v0;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$KeyCollection$Enumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.e1x.i1;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class h0 {
   private Dictionary<String, t4> n5 = null;
   private Dictionary<s7, String> l6 = null;
   private Dictionary<s7, Integer> k5 = null;
   private Dictionary<String, t4> u3 = null;
   private Dictionary<s7, Dictionary<h0$n5, u3>> a6 = null;
   private y4 u9 = null;
   private Dictionary<s7, s7> h0;
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "helvetica", "khmer", "lao", "meiryo", "courier", "segoe", "serif", "sans-serif", "cursive", "fantasy", "monospace"
   );

   public h0() {
      this.l6 = new Dictionary<>();
      this.k5 = new Dictionary<>();
      this.u3 = new Dictionary<>();
      this.n5 = new Dictionary<>();
      this.h0 = new Dictionary<>();
   }

   public final void n5(y4 var1) {
      this.u9 = var1;
   }

   public final boolean n5() {
      this.k5 = null;
      return this.l6.containsKey(com.aspose.slides.internal.v0.u3.n5);
   }

   public final void n5(String var1, String var2, String var3, int var4) {
      this.n5(var1, l6(var2, var3, var4, 97));
      this.n5(var1, l6(var2, var3, var4, 131));
   }

   public final void n5(String var1, s7 var2) {
      this.l6.addItem(var2, var1);
      if (this.k5 != null) {
         int var3 = var2.u3();
         this.k5.addItem(var2, var3);
      }
   }

   public final void n5(String var1, t9 var2) {
      if (com.aspose.slides.internal.v6g.k5.l6(var2, t4.class)) {
         ((t4)var2).n5(this.u9);
      }

      this.u3.addItem(var1, (t4)var2);
   }

   private s7 n5(String var1, String var2, int var3, int var4, boolean var5) {
      s7 var6 = l6(var1, var2, var3, var4);
      s7 var7 = var6;
      String var8 = this.n5(var7);
      if (var8 == null) {
         if (this.h0.containsKey(var7)) {
            return this.h0.get_Item(var7);
         }

         var8 = this.l6(var7);
      }

      if (var8 == null) {
         var7 = this.n5(var1, var2, var3, var4, var6, var5);
      }

      if (var7 != null) {
         if (var7 != var6) {
            if (!this.h0.containsKey(var6)) {
               this.h0.addItem(var6, var7);
            }

            this.n5(var6, var7);
         }

         return var7;
      } else {
         return null;
      }
   }

   private String k5(String var1) {
      String var2 = null;
      var1 = d1.n5(var1, com.aspose.slides.internal.x7n.l6.k5());
      if (d1.l6(var1, "arial")) {
         return null;
      }

      switch (c8.n5(var1)) {
         case 0:
            var2 = "Arial";
            break;
         case 1:
            var2 = "Khmer UI";
            break;
         case 2:
            var2 = "Lao UI";
            break;
         case 3:
            var2 = "Meiryo UI";
            break;
         case 4:
            var2 = "Courier New";
            break;
         case 5:
            var2 = "Segoe UI";
            break;
         default:
            int var3 = d1.k5(var1, ' ');
            if (var3 >= 0) {
               var2 = d1.l6(var1, 0, var3);
            }
      }

      return var2;
   }

   private String u3(String var1) {
      String var2 = null;
      var1 = d1.n5(var1, com.aspose.slides.internal.x7n.l6.k5());
      switch (c8.n5(var1)) {
         case 6:
            var2 = "Times";
            break;
         case 7:
            var2 = "Arial";
            break;
         case 8:
            var2 = "Zapf-Chancery";
            break;
         case 9:
            var2 = "Western";
            break;
         case 10:
            var2 = "Courier";
            break;
         default:
            var2 = var1;
      }

      return var2;
   }

   private String l6(s7 var1) {
      String var2 = var1.n5();
      byte var3 = 0;
      int var4 = var1.k5();
      String var5 = var1.l6();
      if (var4 >= 700) {
         var3 |= 1;
      }

      if ("italic".equals(var5) || "oblique".equals(var5)) {
         var3 |= 2;
      }

      var2 = this.u3(var2);
      i1 var6 = com.aspose.slides.internal.r4.z1.n5().n5(var2, var5, var4);
      com.aspose.slides.internal.p1s.l6 var7;
      if (var6 != null) {
         var7 = new com.aspose.slides.internal.p1s.l6(1.0F, var3, var6);
      } else {
         String var8 = this.k5(var2);
         var7 = com.aspose.slides.internal.e1x.x8.u3().n5(var2, 1.0F, var3, var8);
         if (!com.aspose.slides.internal.t6j.a6.n5(var7.h0(), var2) && (var8 == null || !com.aspose.slides.internal.t6j.a6.n5(var7.h0(), var8))) {
            return null;
         }

         com.aspose.slides.internal.z0k.t4 var9 = var7.n5().y1().l6();
         com.aspose.slides.internal.z0k.n3 var10 = com.aspose.slides.internal.v6g.k5.n5(var9, com.aspose.slides.internal.z0k.n3.class);
         byte[] var11;
         if (var10 != null) {
            var10.seek(0L, 0);
            var11 = com.aspose.slides.internal.n2d.t4.l6(var10);
         } else {
            var11 = ((com.aspose.slides.internal.z0k.e2)var9).toArray();
         }

         try {
            com.aspose.slides.internal.r4.z1.n5().l6(var2, var5, var4, var11);
         } catch (RuntimeException var13) {
         }
      }

      String var15 = d1.n5(new String[]{"F", a3.l6(this.u3.size() + 1)});
      this.n5(var15, new k5(var7, var2));
      this.n5(var15, var1);
      return var15;
   }

   private s7 n5(String var1, String var2, int var3, int var4, s7 var5, boolean var6) {
      String var7 = null;
      if (!d1.a6(var1, var5.n5())) {
         s7 var8 = l6(var1, var2, var3, var4);
         var7 = this.n5(var8);
         if (var7 != null) {
            return var8;
         }
      }

      s7 var9 = this.n5(var1, var2, var3, var4);
      if (var9 != null) {
         var7 = this.n5(var9);
      }

      if (!var6 && var7 == null) {
         return null;
      }

      if (var7 == null && !"normal".equals(var2)) {
         var9 = l6(var1, "normal", var3, var4);
         var7 = this.n5(var9);
      }

      if (var7 == null && !"normal".equals(var2)) {
         var9 = this.n5(var1, "normal", var3, var4);
         if (var9 != null) {
            var7 = this.n5(var9);
         }
      }

      if (var7 == null) {
         return this.n5("any", var2, var3, var4, var5, false);
      }

      if (var9 == null && var7 == null) {
         var9 = com.aspose.slides.internal.v0.u3.n5;
         var7 = this.n5(var9);
      }

      return var7 != null ? var9 : null;
   }

   public final void n5(String var1) {
      this.n5.set_Item(var1, this.u3.get_Item(var1));
   }

   private Dictionary<s7, Dictionary<h0$n5, u3>> u3() {
      if (this.a6 == null) {
         this.a6 = new Dictionary<>();
      }

      return this.a6;
   }

   public final u3 n5(s7 var1, int var2, int var3) {
      Dictionary var4 = null;
      Dictionary[] var5 = new Dictionary[]{var4};
      boolean var6 = !this.u3().tryGetValue(var1, var5);
      var4 = var5[0];
      if (var6) {
         var4 = new Dictionary();
         this.u3().addItem(var1, var4);
      }

      h0$n5 var7 = new h0$n5(var2, var3);
      u3 var8 = null;
      u3[] var9 = new u3[]{var8};
      boolean var10 = !var4.tryGetValue(var7, var9);
      var8 = var9[0];
      if (var10) {
         String var11 = this.n5(var1);
         this.n5(var11);
         t9 var12 = this.l6(var11);
         var8 = new u3(var11, var1, var12, var2, var3);
         var4.addItem(var7, var8);
      }

      return var8;
   }

   public final s7 n5(String var1, String var2, int var3, int var4, int var5) {
      return this.n5(var1, var2, var3, var4, true);
   }

   private List<s7> n5(String[] var1, String var2, int var3, int var4, boolean var5) {
      List var6 = new List();
      Object var7 = null;

      for (int var8 = 0; var8 < var1.length; var8++) {
         var7 = this.n5(var1[var8], var2, var3, var4, var5);
         if (var7 != null) {
            var6.addItem(var7);
         }
      }

      return var6;
   }

   public final s7[] n5(String[] var1, String var2, int var3, int var4) {
      if (var1.length == 0) {
         var1 = new String[]{"Helvetica"};
      }

      List var5 = this.n5(var1, var2, var3, var4, false);
      if (var5.size() == 0) {
         var5 = this.n5(var1, var2, var3, var4, true);
      }

      if (var5.size() == 0) {
         a5 var6 = new a5();
         int var7 = 0;

         for (int var8 = var1.length; var7 < var8; var7++) {
            if (var7 > 0) {
               var6.n5(", ");
            }

            var6.n5(var1[var7]);
         }

         throw new InvalidOperationException(
            d1.n5(new String[]{"fontLookup must return an array with at least one ", "FontTriplet on the last call. Lookup: ", var6.toString()})
         );
      } else {
         return (s7[])var5.toArray(new s7[0]);
      }
   }

   private void n5(s7 var1, s7 var2) {
      if (this.u9 != null) {
         this.u9.n5(this, var1, var2);
      }
   }

   public final s7 n5(String var1, String var2, int var3, int var4) {
      s7 var5 = null;
      String var6 = null;
      int var7 = var3;
      if (var7 >= 400) {
         if (var7 != 400 && var7 != 500) {
            if (var7 > 500) {
               while (var6 == null && var7 < 1000) {
                  var7 += 100;
                  var5 = l6(var1, var2, var7, var4);
                  var6 = this.n5(var5);
               }

               for (int var9 = var3; var6 == null && var9 > 400; var6 = this.n5(var5)) {
                  var9 -= 100;
                  var5 = l6(var1, var2, var9, var4);
               }
            }
         } else {
            var5 = l6(var1, var2, 400, var4);
            var6 = this.n5(var5);
         }
      } else {
         while (var6 == null && var7 > 100) {
            var7 -= 100;
            var5 = l6(var1, var2, var7, var4);
            var6 = this.n5(var5);
         }

         for (int var8 = var3; var6 == null && var8 < 400; var6 = this.n5(var5)) {
            var8 += 100;
            var5 = l6(var1, var2, var8, var4);
         }
      }

      if (var6 == null && var3 != 400) {
         var5 = l6(var1, var2, 400, var4);
         var6 = this.n5(var5);
      }

      return var6 != null ? var5 : null;
   }

   public final String n5(s7 var1) {
      return this.l6.containsKey(var1) ? this.l6.get_Item(var1) : null;
   }

   public static s7 l6(String var0, String var1, int var2, int var3) {
      return new s7(var0, var1, var2, var3);
   }

   public final Dictionary<String, t4> l6() {
      return this.u3;
   }

   public final Dictionary<s7, String> k5() {
      return this.l6;
   }

   public final t9 l6(String var1) {
      Object var2 = null;
      t4[] var3 = new t4[]{(t4)var2};
      this.u3.tryGetValue(var1, var3);
      t4 var4 = var3[0];
      this.n5.set_Item(var1, var4);
      return var4;
   }

   @Override
   public String toString() {
      List var1 = new List();
      Dictionary$KeyCollection$Enumerator var2 = this.l6.getKeys().iterator();

      try {
         while (var2.hasNext()) {
            s7 var3 = (s7)var2.next();
            String var4 = this.n5(var3);
            t9 var5 = this.l6(var4);
            var1.addItem(d1.n5(new String[]{var3.toString(), " -> ", var4, " -> ", var5.l6(), "\n"}));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      var1.sort();
      a5 var14 = new a5();
      List$Enumerator var15 = var1.iterator();

      try {
         while (var15.hasNext()) {
            String var16 = (String)var15.next();
            var14.n5(var16);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var15, IDisposable.class)) {
            var15.dispose();
         }
      }

      return var14.toString();
   }
}
