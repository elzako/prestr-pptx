package com.aspose.slides.internal.g8v;

import com.aspose.slides.Collections.Specialized.HybridDictionary;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;

public class x9 {
   private static final HybridDictionary c8 = new HybridDictionary();
   private static s3 t2 = new y4();
   private static int s7 = 2;
   private static int x8 = 100000;
   private static int n3 = 0;
   private static boolean y4 = false;
   private static int e2 = 240;
   static boolean n5 = false;
   static boolean l6;
   static com.aspose.slides.internal.f1c.n5 k5;
   static boolean u3;
   static int a6;
   static int u9;
   static com.aspose.slides.internal.v2s.n5 h0 = new com.aspose.slides.internal.v2s.n5(null);
   private static u9 t9;
   private static u9 z1;

   @Deprecated
   public static s3 n5() {
      return t2;
   }

   public static boolean l6() {
      return y4;
   }

   public static int k5() {
      return e2;
   }

   public static com.aspose.slides.internal.f1c.n5 u3() {
      return k5;
   }

   public static f0 n5(com.aspose.slides.ms.System.r8 var0, v4 var1) {
      if (var0 == null) {
         throw new ArgumentNullException("address");
      }

      com.aspose.slides.ms.System.r8 var2 = new com.aspose.slides.ms.System.r8(com.aspose.slides.ms.System.d1.n5(new String[]{var0.t9(), "://", var0.k5()}));
      boolean var3 = false;
      boolean var4 = false;
      if (var1 != null && !var1.l6(var0)) {
         var3 = true;
         boolean var5 = "https".equals(var0.t9());
         var0 = var1.n5(var0);
         if (!"http".equals(var0.t9()) && !var5) {
            throw new NotSupportedException("Proxy scheme not supported.");
         }

         if (var5 && "http".equals(var0.t9())) {
            var4 = true;
         }
      }

      var0 = new com.aspose.slides.ms.System.r8(com.aspose.slides.ms.System.d1.n5(new String[]{var0.t9(), "://", var0.k5()}));
      f0 var13 = null;
      x9$n5 var6 = new x9$n5(var2, var3 ? var0 : null, var4);
      synchronized (c8) {
         var13 = com.aspose.slides.internal.v6g.k5.n5(c8.get_Item(var6), f0.class);
         if (var13 != null) {
            return var13;
         }

         if (n3 > 0 && c8.size() >= n3) {
            throw new InvalidOperationException("maximum number of service points reached");
         }

         String var8 = var0.toString();
         int var9 = com.aspose.slides.internal.v6g.k5.u3(h0.n5(var8), 10);
         var13 = new f0(var0, var9, x8);
         var13.n5(n5);
         var13.l6(l6);
         var13.u3(var3);
         var13.a6(var4);
         var13.n5(u3, a6, u9);
         c8.addItem(var6, var13);
         return var13;
      }
   }

   public static u9 a6() {
      return t9;
   }

   public static u9 u9() {
      return z1;
   }

   static {
      if (h0 != null) {
         s7 = com.aspose.slides.internal.v6g.k5.u3(h0.n5("*"), 10);
      }
   }
}
