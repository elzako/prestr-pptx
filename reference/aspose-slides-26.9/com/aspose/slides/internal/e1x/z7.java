package com.aspose.slides.internal.e1x;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

public class z7 {
   private final Dictionary<Integer, String> n5 = new Dictionary<>();
   private final Dictionary<Integer, String> l6 = new Dictionary<>();
   private final Dictionary<Integer, String> k5 = new Dictionary<>();
   private final Dictionary<Integer, String> u3 = new Dictionary<>();

   public final void n5(int var1, int var2, String var3) {
      if (com.aspose.slides.internal.n2d.t4.l6(var3)) {
         Dictionary var4 = this.a6(var1);
         if (var4 != null) {
            var4.set_Item(var2, var3);
         }
      }
   }

   public final String n5(int var1) {
      String var2 = this.l6(var1);
      if (var2 == null) {
         throw new InvalidOperationException("Requested a name string that is not present in the font.");
      } else {
         return var2;
      }
   }

   public final String l6(int var1) {
      Dictionary var2 = this.a6(var1);
      if (var2 == null) {
         return null;
      }

      if (var2.size() <= 0) {
         return null;
      }

      String var3 = null;
      String[] var4 = new String[]{var3};
      boolean var5 = !var2.tryGetValue(1033, var4);
      var3 = var4[0];
      if (var5) {
         var3 = n5(var2);
      }

      return var3;
   }

   public final String k5(int var1) {
      Dictionary var2 = this.a6(var1);
      if (var2 == null) {
         return null;
      }

      if (var2.size() <= 0) {
         return null;
      }

      String var3 = null;
      String[] var4 = new String[]{var3};
      boolean var5 = !var2.tryGetValue(0, var4);
      var3 = var4[0];
      if (var5) {
         var3 = n5(var2);
      }

      return var3;
   }

   public final String n5(int var1, int var2) {
      Dictionary var3 = this.a6(var1);
      if (var3 == null) {
         return null;
      }

      if (var3.size() <= 0) {
         return null;
      }

      Object var4 = null;
      String[] var5 = new String[]{(String)var4};
      var3.tryGetValue(var2, var5);
      return var5[0];
   }

   public final String[] u3(int var1) {
      Dictionary var2 = this.a6(var1);
      if (var2 == null) {
         return null;
      }

      String[] var3 = new String[var2.size()];
      int var4 = 0;
      Dictionary$ValueCollection$Enumerator var5 = var2.getValues().iterator();

      try {
         while (var5.hasNext()) {
            String var6 = (String)var5.next();
            var3[var4] = var6;
            var4++;
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      return var3;
   }

   public final t4[] n5() {
      Dictionary var1 = this.a6(4);
      Dictionary var2 = this.a6(1);
      if (var1.size() != 0 && var2.size() != 0) {
         t4[] var3 = new t4[var2.size()];
         int var4 = 0;
         Dictionary$Enumerator var5 = var2.iterator();

         try {
            while (var5.hasNext()) {
               KeyValuePair var6 = (KeyValuePair)var5.next();
               String var7 = null;
               String[] var8 = new String[]{var7};
               boolean var9 = !var1.tryGetValue(var6.getKey(), var8);
               var7 = var8[0];
               if (var9) {
                  var7 = (String)var6.getValue();
               }

               var3[var4++] = new t4((String)var6.getValue(), var7);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               var5.dispose();
            }
         }

         return var3;
      } else {
         return null;
      }
   }

   private Dictionary<Integer, String> a6(int var1) {
      switch (var1) {
         case 1:
            return this.n5;
         case 2:
            return this.l6;
         case 3:
         case 5:
         default:
            return null;
         case 4:
            return this.k5;
         case 6:
            return this.u3;
      }
   }

   private static String n5(Dictionary<Integer, String> var0) {
      Dictionary$ValueCollection$Enumerator var1 = var0.getValues().iterator();

      try {
         if (var1.hasNext()) {
            return (String)var1.next();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }

      return null;
   }
}
