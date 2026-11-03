package com.aspose.slides.internal.e1x;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.FileNotFoundException;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import java.text.Collator;
import java.util.Arrays;
import java.util.Locale;

public class k7 {
   private static final Object n5 = new Object();
   private static final Dictionary<String, com.aspose.slides.internal.e5m.l6> l6 = new Dictionary<>();
   private static com.aspose.slides.internal.e5m.l6 k5 = new com.aspose.slides.internal.e5m.l6();
   private static final Dictionary<String, List<com.aspose.slides.internal.o9b.y4>> u3 = new Dictionary<>();
   private static final Dictionary<String, List<com.aspose.slides.internal.o9b.y4>> a6 = new Dictionary<>();

   public static void n5() {
      synchronized (n5) {
         Dictionary$ValueCollection$Enumerator var1 = l6.getValues().iterator();

         try {
            while (var1.hasNext()) {
               com.aspose.slides.internal.e5m.l6 var2 = (com.aspose.slides.internal.e5m.l6)var1.next();
               var2.dispose();
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
               var1.dispose();
            }
         }

         l6.clear();
         k5.dispose();
         k5 = new com.aspose.slides.internal.e5m.l6();
         u3.clear();
         a6.clear();
      }
   }

   public static List<com.aspose.slides.internal.o9b.y4> n5(byte[] var0) {
      Object var1 = null;
      com.aspose.slides.internal.h3k.h0 var2 = new com.aspose.slides.internal.h3k.h0();

      try {
         var1 = com.aspose.slides.ms.System.z3.n5(var2.l6(var0));
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }

      synchronized (n5) {
         List var4 = null;
         List[] var5 = new List[]{var4};
         boolean var6 = u3.tryGetValue((String)var1, var5);
         var4 = var5[0];
         if (var6) {
            return var4;
         }

         byte[] var7 = new byte[var0.length];
         System.arraycopy(var0, 0, var7, 0, var0.length);
         com.aspose.slides.internal.o9b.y4[] var8 = com.aspose.slides.internal.v6g.k5.k5(
            com.aspose.slides.ms.System.u3.n5((Object)(k5.n5())).deepClone(), com.aspose.slides.internal.o9b.y4[].class
         );
         com.aspose.slides.internal.l6j.n5 var9 = com.aspose.slides.internal.l6j.n5.n5(var7);
         k5.n5(var9.a6(), var7.length);
         var9.u9();
         var4 = n5(var8, k5.n5());
         if (var4.size() > 0) {
            u3.addItem((String)var1, var4);
         }

         return var4;
      }
   }

   public static List<com.aspose.slides.internal.o9b.y4> n5(String var0) {
      String var1 = com.aspose.slides.internal.z0k.z1.k5(var0);
      synchronized (n5) {
         if (a6.containsKey(var1)) {
            return a6.get_Item(var1);
         }

         com.aspose.slides.internal.o9b.y4[] var3 = new com.aspose.slides.internal.o9b.y4[0];
         com.aspose.slides.internal.e5m.l6 var4;
         if (l6.containsKey(var1)) {
            var4 = l6.get_Item(var1);
            var3 = com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5((Object)(var4.n5())).deepClone(), com.aspose.slides.internal.o9b.y4[].class);
         } else {
            var4 = new com.aspose.slides.internal.e5m.l6();
            byte[] var5 = null;

            try {
               com.aspose.slides.internal.z0k.n3 var6 = com.aspose.slides.internal.z0k.u9.u3(var1);

               try {
                  var5 = new byte[(int)var6.getLength()];
                  var6.read(var5, 0, var5.length);
                  var6.close();
               } finally {
                  if (var6 != null) {
                     var6.dispose();
                  }
               }

               if (var5 != null && "OTTO".equals(com.aspose.slides.internal.l7h.j5.z3().l6(var5, 0, 4))) {
                  byte[] var20 = com.aspose.slides.internal.c8e.n5.n5(var5);
                  com.aspose.slides.internal.l6j.n5 var8 = com.aspose.slides.internal.l6j.n5.n5(var20);
                  var4.n5(var8.a6(), var20.length);
                  var8.u9();
                  var4 = n5(var4, l6);
                  l6.addItem(var1, var4);
               } else if (var5 != null) {
                  com.aspose.slides.internal.l6j.n5 var7 = com.aspose.slides.internal.l6j.n5.n5(var5);
                  var4.n5(var7.a6(), var5.length);
                  var7.u9();
                  var4 = n5(var4, l6);
                  l6.addItem(var1, var4);
               }
            } catch (FileNotFoundException var15) {
            } catch (Exception var16) {
            }
         }

         List var19 = n5(var3, var4.n5());
         if (var19.size() > 0) {
            a6.addItem(var1, var19);
         }

         return var19;
      }
   }

   private static com.aspose.slides.internal.e5m.l6 n5(com.aspose.slides.internal.e5m.l6 var0, Dictionary<String, com.aspose.slides.internal.e5m.l6> var1) {
      boolean var2 = false;
      Dictionary$Enumerator var3 = var1.iterator();

      try {
         while (var3.hasNext()) {
            KeyValuePair var4 = (KeyValuePair)var3.next();
            var2 = com.aspose.slides.internal.v7u.k5.n5(var0.l6(), ((com.aspose.slides.internal.e5m.l6)var4.getValue()).l6());
            if (var2) {
               var0.dispose();
               var0 = (com.aspose.slides.internal.e5m.l6)var4.getValue();
               break;
            }
         }
      } catch (Exception var8) {
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }

      return var0;
   }

   public static com.aspose.slides.internal.o9b.y4 n5(i1 var0) {
      if (!d1.n5(var0.u9()) && l6.containsKey(var0.u9())) {
         com.aspose.slides.internal.o9b.y4 var1 = null;

         for (com.aspose.slides.internal.o9b.y4 var5 : l6.get_Item(var0.u9()).n5()) {
            if (var5.c8(var0.c8())) {
               var1 = var5;
               break;
            }
         }

         if (var1 != null && !var0.n5().equals(var1.a6())) {
            for (com.aspose.slides.internal.o9b.y4 var9 : l6.get_Item(var0.u9()).n5()) {
               if (var9.c8(var0.c8()) && var0.n5().equals(var9.a6())) {
                  return var9;
               }
            }
         }

         return var1;
      } else {
         return null;
      }
   }

   public static Dictionary<String, List<com.aspose.slides.internal.o9b.y4>> n5(String var0, boolean var1) {
      Dictionary var2 = new Dictionary();
      n5(var0, var1, var2);
      return var2;
   }

   private static void n5(String var0, boolean var1, Dictionary<String, List<com.aspose.slides.internal.o9b.y4>> var2) {
      String[] var3 = com.aspose.slides.internal.z0k.u3.a6(var0);
      Arrays.sort(var3, Collator.getInstance(Locale.getDefault()));

      for (String var7 : var3) {
         String var8 = com.aspose.slides.internal.z0k.z1.k5(com.aspose.slides.internal.z0k.z1.l6(var0, var7));
         List var9 = n5(var8);
         if (var9 != null && !var2.containsKey(var8)) {
            var2.addItem(var8, var9);
         }
      }

      if (var1) {
         for (String var13 : com.aspose.slides.internal.z0k.u3.u3(var0)) {
            n5(com.aspose.slides.internal.z0k.z1.l6(var0, var13), var1, var2);
         }
      }
   }

   private static List<com.aspose.slides.internal.o9b.y4> n5(com.aspose.slides.internal.o9b.y4[] var0, com.aspose.slides.internal.o9b.y4[] var1) {
      List var2 = new List();
      if (var0.length == var1.length) {
         return var2;
      }

      for (com.aspose.slides.internal.o9b.y4 var6 : var1) {
         if (!n5(var0, var6)) {
            var2.addItem(var6);
         }
      }

      return var2;
   }

   private static boolean n5(com.aspose.slides.internal.o9b.y4[] var0, com.aspose.slides.internal.o9b.y4 var1) {
      for (com.aspose.slides.internal.o9b.y4 var5 : var0) {
         if (var1.equals(var5)) {
            return true;
         }
      }

      return false;
   }
}
