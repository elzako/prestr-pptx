package com.aspose.slides.internal.l2;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public abstract class a6 {
   private final t2 n5 = new t2("/");
   private final h0 l6 = new h0();
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("Relationship", "Id", "Type", "Target", "TargetMode");

   public final void n5() {
      IGenericEnumerator var1 = this.l6.iterator();

      try {
         while (var1.hasNext()) {
            u9 var2 = (u9)var1.next();
            if ("rels".equals(var2.l6())) {
               String var3 = d1.n5(d1.n5(var2.n5(), "/_rels", d1.n5), ".rels", d1.n5);
               if ("/".equals(var3)) {
                  n5(var2, this.n5);
               } else {
                  n5(var2, this.l6(var3).u9());
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var1, IDisposable.class)) {
            var1.dispose();
         }
      }
   }

   private static void n5(u9 var0, t2 var1) {
      com.aspose.slides.internal.b8.l6 var2 = new com.aspose.slides.internal.b8.l6(var0.u3());

      while (var2.n5("Relationships")) {
         switch (k5.n5(var2.a6())) {
            case 0:
               String var3 = null;
               String var4 = null;
               String var5 = null;
               boolean var6 = false;

               while (var2.l6()) {
                  switch (k5.n5(var2.a6())) {
                     case 1:
                        var3 = var2.u9();
                        break;
                     case 2:
                        var4 = var2.u9();
                        break;
                     case 3:
                        var5 = var2.u9();
                        break;
                     case 4:
                        var6 = "External".equals(var2.u9());
                  }
               }

               var1.n5(var3, var4, var5, var6);
               break;
            default:
               var2.n5();
         }
      }
   }

   public final h0 l6() {
      return this.l6;
   }

   public final t2 k5() {
      return this.n5;
   }

   public final u9 n5(String var1) {
      return this.l6.n5(var1);
   }

   public final u9 l6(String var1) {
      u9 var2 = this.n5(var1);
      if (var2 == null) {
         throw new InvalidOperationException(d1.n5("Cannot find part '{0}'.", new Object[]{var1}));
      } else {
         return var2;
      }
   }

   public void n5(t4 var1) {
   }

   public static String n5(String var0, String var1) {
      if (!d1.l6(var1, "/")) {
         return var1;
      }

      int var2 = 0;
      int var3 = q1.l6(var0.length(), var1.length());

      for (int var4 = 0; var4 < var3; var4++) {
         if (var0.charAt(var4) == '/') {
            var2 = var4;
         }

         if (var0.charAt(var4) != var1.charAt(var4)) {
            break;
         }
      }

      int var7 = var2 + 1;
      a5 var5 = new a5();

      for (int var6 = var7; var6 < var0.length(); var6++) {
         if (var0.charAt(var6) == '/') {
            var5.n5("../");
         }
      }

      var5.n5(var1, var7, var1.length() - var7);
      return var5.toString();
   }
}
