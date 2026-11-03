package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$Enumerator;
import com.aspose.slides.Collections.Generic.Dictionary$KeyCollection$Enumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;
import java.util.Arrays;
import java.util.List;

public final class FontsLoader implements IFontsLoader {
   private static final Object n5 = new Object();
   private static final List<String> l6 = Arrays.asList(com.aspose.slides.internal.e5m.n5.l6().n5());
   private static final Dictionary<String, com.aspose.slides.Collections.Generic.List<com.aspose.slides.internal.o9b.y4>> k5 = new Dictionary<>();
   private static final Dictionary<byte[], com.aspose.slides.Collections.Generic.List<com.aspose.slides.internal.o9b.y4>> u3 = new Dictionary<>();

   public static void loadExternalFonts(String[] directories) {
      if (directories != null) {
         n5(directories);
      }
   }

   public static void loadExternalFont(byte[] data) {
      if (data != null) {
         if (!"OTTO".equals(com.aspose.slides.internal.l7h.j5.z3().l6(data, 0, 4))) {
            n5(data);
         } else {
            byte[] var1 = com.aspose.slides.internal.c8e.n5.n5(data);
            n5(var1);
         }
      }
   }

   public static String[] getFontFolders() {
      return com.aspose.slides.internal.e1x.x8.u3().n5();
   }

   public static void clearCache() {
      synchronized (n5) {
         com.aspose.slides.internal.e1x.k7.n5();
         com.aspose.slides.internal.b0.l6.n5();
         k5.clear();
         u3.clear();
      }

      com.aspose.slides.internal.e1x.x8.u3().l6();
      s9c.l6();
   }

   private FontsLoader() {
   }

   private static void n5(String[] var0) {
      synchronized (n5) {
         com.aspose.slides.Collections.Generic.List var2 = new com.aspose.slides.Collections.Generic.List();
         List var3 = Arrays.asList(com.aspose.slides.internal.e1x.x8.u3().n5());

         for (String var7 : var0) {
            String var8 = com.aspose.slides.internal.n8e.v4.u3(var7);
            if (com.aspose.slides.internal.z0k.u3.k5(var7) && !l6.contains(var8)) {
               Dictionary var9 = com.aspose.slides.internal.e1x.k7.n5(var8, true);
               Dictionary$KeyCollection$Enumerator var10 = var9.getKeys().iterator();

               try {
                  while (var10.hasNext()) {
                     String var11 = (String)var10.next();
                     if (!k5.containsKey(var11)) {
                        k5.addItem(var11, (com.aspose.slides.Collections.Generic.List<com.aspose.slides.internal.o9b.y4>)var9.get_Item(var11));
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var10, IDisposable.class)) {
                     var10.dispose();
                  }
               }

               if (!var3.contains(var8)) {
                  var2.addItem(var8);
               }
            }
         }

         com.aspose.slides.internal.e1x.x8.u3().n5((String[])var2.toArray(new String[0]), true);
      }

      s9c.l6();
   }

   private static void n5(byte[] var0) {
      synchronized (n5) {
         try {
            com.aspose.slides.Collections.Generic.List var2 = com.aspose.slides.internal.e1x.k7.n5(var0);
            if (var2.size() > 0 && !u3.containsKey(var0)) {
               u3.addItem(var0, var2);
               s9c.n5(var0);
            }
         } catch (Exception var4) {
            com.aspose.slides.internal.n8e.v4.n5(var4);
         }
      }
   }

   static boolean n5(String var0) {
      String var1 = null;
      Object var2 = null;
      String[] var3 = new String[]{var1};
      byte[][] var4 = new byte[][]{(byte[])var2};
      boolean var5 = n5(var0, var3) || n5(var0, var4);
      var1 = var3[0];
      var2 = var4[0];
      return var5;
   }

   static com.aspose.slides.Collections.Generic.List<byte[]> n5() {
      com.aspose.slides.Collections.Generic.List var0 = new com.aspose.slides.Collections.Generic.List(u3.size());
      synchronized (n5) {
         Dictionary$Enumerator var2 = u3.iterator();

         try {
            while (var2.hasNext()) {
               KeyValuePair var3 = (KeyValuePair)var2.next();
               var0.addItem(((byte[])var3.getKey()).clone());
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }

         return var0;
      }
   }

   static boolean n5(String var0, String[] var1, byte[][] var2) {
      var1[0] = null;
      var2[0] = null;
      return n5(var0, var1) || n5(var0, var2);
   }

   static boolean n5(String var0, String[] var1) {
      synchronized (n5) {
         Dictionary$KeyCollection$Enumerator var3 = k5.getKeys().iterator();

         try {
            while (var3.hasNext()) {
               String var4 = (String)var3.next();
               List$Enumerator var5 = k5.get_Item(var4).iterator();

               try {
                  while (var5.hasNext()) {
                     com.aspose.slides.internal.o9b.y4 var6 = (com.aspose.slides.internal.o9b.y4)var5.next();
                     if (com.aspose.slides.ms.System.d1.a6(var6.a6(), var0)) {
                        var1[0] = var4;
                        return true;
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                     var5.dispose();
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }

      var1[0] = null;
      return false;
   }

   static boolean n5(String var0, byte[][] var1) {
      synchronized (n5) {
         Dictionary$KeyCollection$Enumerator var3 = u3.getKeys().iterator();

         try {
            while (var3.hasNext()) {
               byte[] var4 = (byte[])var3.next();
               List$Enumerator var5 = u3.get_Item(var4).iterator();

               try {
                  while (var5.hasNext()) {
                     com.aspose.slides.internal.o9b.y4 var6 = (com.aspose.slides.internal.o9b.y4)var5.next();
                     if (com.aspose.slides.ms.System.d1.a6(var6.a6(), var0)) {
                        var1[0] = var4;
                        return true;
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
                     var5.dispose();
                  }
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }

      var1[0] = null;
      return false;
   }
}
