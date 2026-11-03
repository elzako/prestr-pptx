package com.aspose.slides.internal.f5;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.y8.n5$n5;
import com.aspose.slides.ms.System.a5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;

public class d2 implements a5<d2> {
   private static final Dictionary<String, d2> n5 = new Dictionary<>();
   private static final Dictionary<String, d2> l6 = new Dictionary<>();
   private final String k5;
   private final String u3;
   private final boolean a6;
   private final boolean u9;

   private d2(String var1, boolean var2, boolean var3) {
      this.k5 = var1;
      this.u3 = d1.s7(var1);
      this.a6 = var2;
      this.u9 = var3;
   }

   public final boolean n5() {
      return this.a6;
   }

   public final String l6() {
      return this.k5;
   }

   public final String k5() {
      return this.u3;
   }

   public static d2 n5(String var0) {
      com.aspose.slides.internal.w3.n5.n5((Object)var0, "name");
      d2 var1 = null;
      d2[] var2 = new d2[]{var1};
      boolean var3 = n5.tryGetValue(var0, var2);
      var1 = var2[0];
      if (var3) {
         return var1;
      }

      var2[0] = var1;
      boolean var4 = l6.tryGetValue(var0, var2);
      var1 = var2[0];
      if (var4) {
         return var1;
      }

      var0 = d1.a6(d1.l6(var0));
      com.aspose.slides.internal.w3.n5.n5(var0, "name");
      var2[0] = var1;
      boolean var5 = n5.tryGetValue(var0, var2);
      var1 = var2[0];
      if (var5) {
         return var1;
      }

      var2[0] = var1;
      boolean var6 = l6.tryGetValue(var0, var2);
      var1 = var2[0];
      if (var6) {
         return var1;
      }

      synchronized (l6) {
         var2[0] = var1;
         boolean var8 = l6.tryGetValue(var0, var2);
         var1 = var2[0];
         if (var8) {
            return var1;
         }

         var1 = new d2(var0, false, false);
         l6.addItem(var0, var1);
         return var1;
      }
   }

   public final boolean n5(z3 var1) {
      return this.n5(var1.u3());
   }

   public final boolean n5(d2 var1) {
      return j8.l6(this, var1);
   }

   @Override
   public boolean equals(Object obj) {
      return this.n5(com.aspose.slides.internal.v6g.k5.n5(obj, d2.class));
   }

   @Override
   public int hashCode() {
      int var1 = this.k5.hashCode();
      var1 = 31 * var1 + (this.a6 ? 1 : 0);
      return 31 * var1 + (this.u9 ? 1 : 0);
   }

   @Override
   public String toString() {
      return this.k5;
   }

   static {
      for (String var3 : n5$n5.n5) {
         String var4 = d1.a6(d1.l6(var3));
         d2 var5 = new d2(var4, true, true);
         n5.addItem(var5.l6(), var5);
      }
   }
}
