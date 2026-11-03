package com.aspose.slides.internal.e1x;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$KeyCollection$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.ms.System.IDisposable;

public class e5 {
   final int n5 = 64;
   private final String l6;
   private final Dictionary<i1, Integer> k5;

   public e5(String var1) {
      this.l6 = var1;
      this.k5 = new Dictionary<>();
   }

   public final int n5() {
      return this.k5.size();
   }

   public final void n5(i1 var1) {
      this.k5.set_Item(var1, var1.c8());
   }

   public final i1 n5(int var1, boolean var2) {
      i1 var3 = null;
      i1[] var4 = new i1[]{var3};
      boolean var5 = this.n5(var1, this.l6, var4);
      var3 = var4[0];
      if (var5) {
         return var3;
      }

      if (var2) {
         return null;
      }

      int var6 = var1 & -5;
      var4[0] = var3;
      boolean var7 = this.n5(var6, var4);
      var3 = var4[0];
      if (var7) {
         return var3;
      }

      var6 = var1 & -9;
      var4[0] = var3;
      boolean var8 = this.n5(var6, var4);
      var3 = var4[0];
      if (var8) {
         return var3;
      }

      var6 = var1 & -3;
      var4[0] = var3;
      boolean var9 = this.n5(var6, var4);
      var3 = var4[0];
      if (var9) {
         return var3;
      }

      var6 = var1 & -2;
      var4[0] = var3;
      boolean var10 = this.n5(var6, var4);
      var3 = var4[0];
      if (var10) {
         return var3;
      }

      byte var26 = 0;
      var4[0] = var3;
      boolean var11 = this.n5(var26, var4);
      var3 = var4[0];
      if (var11) {
         return var3;
      }

      Dictionary$KeyCollection$Enumerator var12 = this.k5.getKeys().iterator();

      try {
         if (var12.hasNext()) {
            return (i1)var12.next();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
            var12.dispose();
         }
      }

      return null;
   }

   private final boolean n5(int var1, i1[] var2) {
      for (KeyValuePair var4 : this.k5) {
         if ((Integer)var4.getValue() == var1) {
            var2[0] = (i1)var4.getKey();
            return true;
         }
      }

      return false;
   }

   private final boolean n5(int var1, String var2, i1[] var3) {
      for (KeyValuePair var5 : this.k5) {
         if ((Integer)var5.getValue() == var1 && ((i1)var5.getKey()).n5().equals(var2)) {
            var3[0] = (i1)var5.getKey();
            return true;
         }
      }

      return false;
   }
}
