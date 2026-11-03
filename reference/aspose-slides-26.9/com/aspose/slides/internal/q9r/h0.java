package com.aspose.slides.internal.q9r;

import com.aspose.slides.Collections.DictionaryEntry;
import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.Collections.IDictionaryEnumerator;
import com.aspose.slides.Collections.IEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

public class h0 {
   private final Hashtable n5 = new Hashtable();
   private final Hashtable l6 = new Hashtable();
   private final Hashtable k5 = new Hashtable();
   private final Hashtable u3 = new Hashtable();

   public final void n5(int var1, int var2, String var3) {
      if (com.aspose.slides.internal.z5z.u9.n5(var3)) {
         Hashtable var4 = this.u3(var1);
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
      Hashtable var2 = this.u3(var1);
      if (var2 == null) {
         return null;
      }

      if (var2.size() <= 0) {
         return null;
      }

      String var3 = (String)var2.get_Item(1033);
      if (var3 == null) {
         var3 = (String)n5(var2);
      }

      return var3;
   }

   public final String n5(int var1, int var2) {
      Hashtable var3 = this.u3(var1);
      if (var3 == null) {
         return null;
      } else {
         return var3.size() <= 0 ? null : com.aspose.slides.internal.v6g.k5.n5(var3.get_Item(var2), String.class);
      }
   }

   public final String[] k5(int var1) {
      Hashtable var2 = this.u3(var1);
      if (var2 == null) {
         return null;
      }

      String[] var3 = new String[var2.size()];
      int var4 = 0;
      IEnumerator var5 = var2.getValues().iterator();

      try {
         while (var5.hasNext()) {
            String var6 = (String)var5.next();
            var3[var4] = var6;
            var4++;
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            ((IDisposable)var5).dispose();
         }
      }

      return var3;
   }

   public final m3[] n5() {
      Hashtable var1 = this.u3(4);
      Hashtable var2 = this.u3(1);
      if (var1.size() != 0 && var2.size() != 0) {
         m3[] var3 = new m3[var1.size()];
         int var4 = 0;
         IDictionaryEnumerator var5 = var1.iterator();

         try {
            while (var5.hasNext()) {
               DictionaryEntry var6 = (DictionaryEntry)var5.next();
               String var7 = (String)var2.get_Item(var6.getKey());
               if (var7 == null) {
                  var7 = (String)var2.get_Item(1033);
               }

               if (var7 == null) {
                  var7 = (String)n5(var2);
               }

               var3[var4++] = new m3(var7, (String)var6.getValue());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
               ((IDisposable)var5).dispose();
            }
         }

         return var3;
      } else {
         return null;
      }
   }

   private Hashtable u3(int var1) {
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

   private static Object n5(Hashtable var0) {
      IEnumerator var1 = var0.getValues().iterator();

      try {
         if (var1.hasNext()) {
            return var1.next();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            ((IDisposable)var1).dispose();
         }
      }

      return null;
   }
}
