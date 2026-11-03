package com.aspose.slides.internal.l7h;

import com.aspose.slides.exceptions.ArgumentNullException;

public abstract class c4 {
   private static Object n5 = new Object();
   private static volatile c4[] l6;

   public abstract j5 n5(String var1);

   public abstract j5 n5(int var1);

   public j5 n5(String var1, q0 var2, t2 var3) {
      j5 var4 = this.n5(var1);
      if (var4 != null) {
         var4 = (j5)this.n5(var1).deepClone();
         var4.n5(var2);
         var4.n5(var3);
      }

      return var4;
   }

   public j5 n5(int var1, q0 var2, t2 var3) {
      j5 var4 = this.n5(var1);
      if (var4 != null) {
         var4 = (j5)this.n5(var1).deepClone();
         var4.n5(var2);
         var4.n5(var3);
      }

      return var4;
   }

   public static void n5(c4 var0) {
      if (var0 == null) {
         throw new ArgumentNullException("provider");
      }

      synchronized (n5) {
         if (l6 == null) {
            l6 = new c4[]{var0};
         } else if (com.aspose.slides.ms.System.u3.n5(l6, var0) < 0) {
            c4[] var2 = new c4[l6.length + 1];
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(l6)), com.aspose.slides.ms.System.u3.n5((Object)(var2)), l6.length);
            var2[var2.length - 1] = var0;
            l6 = var2;
         }
      }
   }

   public static j5 l6(int var0) {
      if (l6 == null) {
         n5(u3.n5());
      }

      c4[] var1 = l6;

      for (c4 var5 : var1) {
         j5 var6 = var5.n5(var0);
         if (var6 != null) {
            return var6;
         }
      }

      return null;
   }

   public static j5 l6(String var0) {
      if (l6 == null) {
         n5(u3.n5());
      }

      c4[] var1 = l6;

      for (c4 var5 : var1) {
         j5 var6 = var5.n5(var0);
         if (var6 != null) {
            return var6;
         }
      }

      return null;
   }

   public static j5 l6(int var0, q0 var1, t2 var2) {
      if (l6 == null) {
         n5(u3.n5());
      }

      c4[] var3 = l6;

      for (c4 var7 : var3) {
         j5 var8 = var7.n5(var0, var1, var2);
         if (var8 != null) {
            return var8;
         }
      }

      return null;
   }

   public static j5 l6(String var0, q0 var1, t2 var2) {
      if (l6 == null) {
         n5(u3.n5());
      }

      c4[] var3 = l6;

      for (c4 var7 : var3) {
         j5 var8 = var7.n5(var0, var1, var2);
         if (var8 != null) {
            return var8;
         }
      }

      return null;
   }
}
