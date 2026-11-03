package com.aspose.slides.internal.j7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.Dictionary$ValueCollection$Enumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.IDisposable;

public class u9 {
   private static final Dictionary<String, com.aspose.slides.internal.o9b.y4> n5 = new Dictionary<>();

   public static com.aspose.slides.internal.o9b.n3 n5(com.aspose.slides.internal.p1s.l6 var0, s7 var1) {
      if (!com.aspose.slides.internal.e5m.n5.l6().n5(var0)) {
         try {
            com.aspose.slides.internal.o9b.y4 var2 = var1.n5(var0);
            if (var2 != null) {
               return new com.aspose.slides.internal.o9b.n3(var2, var0.c8(), n5(var2, var0.l6()), 3);
            }
         } catch (RuntimeException var3) {
         }
      }

      return n5(var0.h0(), var0.c8(), var0.l6());
   }

   public static com.aspose.slides.internal.o9b.n3 n5(String var0, float var1, int var2) {
      try {
         return new com.aspose.slides.internal.o9b.n3(var0, var1, var2, 3);
      } catch (RuntimeException var6) {
         com.aspose.slides.internal.o9b.y4 var4 = n5(var0);
         int var5 = n5(var4, var2);
         return new com.aspose.slides.internal.o9b.n3(var4.a6(), var1, var5, 3);
      }
   }

   private static com.aspose.slides.internal.o9b.y4 n5(String var0) {
      com.aspose.slides.internal.o9b.y4 var1 = l6(var0);
      if (var1 == null) {
         var1 = l6("Times New Roman");
      }

      if (var1 == null) {
         var1 = n5();
      }

      if (var1 == null) {
         throw new InvalidOperationException("No fonts are installed on the system.");
      } else {
         return var1;
      }
   }

   private static int n5(com.aspose.slides.internal.o9b.y4 var0, int var1) {
      if (var0.c8(var1)) {
         return var1;
      }

      switch (var1) {
         case 1:
         case 2:
            if (var0.c8(3)) {
               return 3;
            }
            break;
         case 3:
            if (var0.c8(2)) {
               return 2;
            }

            if (var0.c8(1)) {
               return 1;
            }
      }

      if (var0.c8(0)) {
         return 0;
      } else if (var0.c8(1)) {
         return 1;
      } else if (var0.c8(2)) {
         return 2;
      } else if (var0.c8(3)) {
         return 3;
      } else {
         throw new InvalidOperationException("No fonts of this family are available.");
      }
   }

   private static com.aspose.slides.internal.o9b.y4 l6(String var0) {
      Object var1 = null;
      com.aspose.slides.internal.o9b.y4[] var2 = new com.aspose.slides.internal.o9b.y4[]{(com.aspose.slides.internal.o9b.y4)var1};
      n5.tryGetValue(var0, var2);
      return var2[0];
   }

   private static com.aspose.slides.internal.o9b.y4 n5() {
      Dictionary$ValueCollection$Enumerator var0 = n5.getValues().iterator();

      try {
         if (var0.hasNext()) {
            return (com.aspose.slides.internal.o9b.y4)var0.next();
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var0, IDisposable.class)) {
            var0.dispose();
         }
      }

      return null;
   }

   static {
      com.aspose.slides.internal.o9b.y4[] var0 = new com.aspose.slides.internal.v7u.l6().n5();

      for (com.aspose.slides.internal.o9b.y4 var4 : var0) {
         n5.set_Item(var4.a6(), var4);
      }
   }
}
