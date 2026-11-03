package com.aspose.slides.internal.e7;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.v2.e2;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.y8;

public class s7 implements e2 {
   private final com.aspose.slides.internal.v2.x8 n5;

   public s7(com.aspose.slides.internal.v2.x8 var1) {
      this.n5 = var1;
   }

   public static s7 n5(com.aspose.slides.internal.v2.s7 var0) {
      s7 var1 = null;
      if (com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.v2.x8.class)) {
         com.aspose.slides.internal.v2.x8 var2 = com.aspose.slides.internal.v6g.k5.n5(var0, com.aspose.slides.internal.v2.x8.class);
         var1 = new s7(var2);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var0, com.aspose.slides.internal.v2.n5.class) && ((com.aspose.slides.internal.v2.n5)var0).n5() > 0) {
         com.aspose.slides.internal.v2.n5 var5 = com.aspose.slides.internal.v6g.k5.n5(var0, com.aspose.slides.internal.v2.n5.class);
         com.aspose.slides.internal.v2.n3 var6 = new com.aspose.slides.internal.v2.n3(var5);
         var1 = new s7(var6);
      } else if (var0 != null) {
         y8 var4 = j8.n5(var0);
         String var3 = d1.n5("Unknown type is encountered: {0}", new Object[]{var4.q0()});
         throw new IOException(var3);
      }

      return var1;
   }

   @Override
   public final com.aspose.slides.internal.v2.s7 t2() {
      return this.n5;
   }

   public final byte[] n5() {
      com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2();
      t4 var2 = null;

      try {
         var2 = this.n5.u3();
         com.aspose.slides.internal.d4.l6.n5(var2, var1, 4096);
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }

      return com.aspose.slides.internal.d4.l6.n5(var1);
   }

   public final com.aspose.slides.internal.v2.x8 l6() {
      return this.n5;
   }

   public final List<com.aspose.slides.internal.v2.c8> k5() {
      List var1 = new List();
      com.aspose.slides.internal.v2.s7 var2 = this.n5.a6();
      if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.v2.c8.class)) {
         com.aspose.slides.internal.v2.c8 var3 = com.aspose.slides.internal.v6g.k5.n5(var2, com.aspose.slides.internal.v2.c8.class);
         var1 = new com.aspose.slides.internal.e6.n5<>(var3, var3, this.n5, com.aspose.slides.internal.v2.c8.b2);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.v2.n5.class)) {
         com.aspose.slides.internal.v2.n5 var4 = com.aspose.slides.internal.v6g.k5.n5(var2, com.aspose.slides.internal.v2.n5.class);
         var1 = var4.n5(com.aspose.slides.internal.v2.c8.class);
      }

      return var1;
   }
}
