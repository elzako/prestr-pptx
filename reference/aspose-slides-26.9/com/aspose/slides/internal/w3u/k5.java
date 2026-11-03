package com.aspose.slides.internal.w3u;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.IDisposable;

abstract class k5 {
   private Dictionary<Integer, l6> n5 = new Dictionary<>();
   private int l6;

   public k5() {
   }

   protected final int n5() {
      return this.l6;
   }

   protected final void n5(int var1) {
      this.l6 = var1;
   }

   public static k5 l6(int var0) {
      switch (var0) {
         case 0:
            return null;
         case 1:
            return new u9();
         default:
            throw new ArgumentException("Not supported");
      }
   }

   public static boolean n5(com.aspose.slides.internal.b8u.a6 var0) {
      int var1 = var0.k5().length;
      return var1 >= 2 && var1 <= 256 && (var1 & var1 - 1) == 0;
   }

   public abstract com.aspose.slides.internal.b8u.a6 n5(int[] var1, int var2);

   public void n5(int[] var1) {
      this.n5(var1, true);
   }

   public final int n5(int var1, com.aspose.slides.internal.b8u.a6 var2) {
      int var3 = Integer.MAX_VALUE;
      int var4 = var1;

      for (int var8 : var2.l6()) {
         int var9 = n5(var1, var8, this.n5());
         if (var9 == 0) {
            return var1;
         }

         if (var9 < var3) {
            var3 = var9;
            var4 = var8;
         }
      }

      return var4;
   }

   public final int k5(int var1) {
      return this.n5.containsKey(var1) ? this.n5.get_Item(var1).n5() : var1;
   }

   public final int[] n5(int[] var1, com.aspose.slides.internal.b8u.a6 var2, int var3) {
      this.n5(var1, false);
      Dictionary$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            KeyValuePair var5 = (KeyValuePair)var4.next();
            ((l6)var5.getValue()).n5(this.n5(((l6)var5.getValue()).n5(), var2));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      this.n5(var3);

      for (int var9 = 0; var9 < var1.length; var9++) {
         var1[var9] = this.k5(var1[var9]);
      }

      return var1;
   }

   protected final void n5(int[] var1, boolean var2) {
      if (this.n5.size() == 0 || var2) {
         for (int var3 = 0; var3 < var1.length; var3++) {
            if (!this.n5.containsKey(var1[var3])) {
               this.n5.addItem(var1[var3], new l6(var1[var3]));
            }
         }
      }
   }

   private static int n5(int var0, int var1, int var2) {
      if (var2 == 0) {
         int var3 = ((byte)(var0 >> 24) & 255) - ((byte)(var1 >> 24) & 255);
         int var4 = ((byte)(var0 >> 16 & 0xFF) & 255) - ((byte)(var1 >> 16 & 0xFF) & 255);
         int var5 = ((byte)(var0 >> 8 & 0xFF) & 255) - ((byte)(var1 >> 8 & 0xFF) & 255);
         int var6 = ((byte)(var0 & 0xFF) & 255) - ((byte)(var1 & 0xFF) & 255);
         return var3 * var3 + var4 * var4 + var5 * var5 + var6 * var6;
      } else {
         throw new NotImplementedException();
      }
   }
}
