package com.aspose.slides.internal.w3;

import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.e5;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.n3;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.v6g.c8;
import com.aspose.slides.ms.System.d1;

public class a6 {
   private final com.aspose.slides.internal.o9b.l6 n5 = new com.aspose.slides.internal.o9b.l6(1, 1);
   private static final c8<a6> l6 = new c8<>(null);

   private a6() {
   }

   public static a6 n5() {
      if (l6.get() == null) {
         l6.set(new a6());
      }

      return l6.get();
   }

   public final f2 n5(String var1, String var2, float var3, int var4) {
      com.aspose.slides.internal.w3.n5.n5(var1, "word");
      com.aspose.slides.internal.w3.n5.n5(var2, "fontFamily");
      f2 var5 = new f2();
      z1 var6 = z1.n5(this.n5);

      try {
         n3 var7 = n3.n5(var2, var3, var4);

         try {
            var6.n5(var1, var7).l6(var5);
            if (!d1.n5(d1.l6(var1))) {
               n5(var6, var1, var7).l6(var5);
            }

            float var8 = u3.l6(var5.l6());
            float var9 = u3.l6(var5.k5());
            var5 = new f2(var8, var9);
         } finally {
            if (var7 != null) {
               var7.dispose();
            }
         }
      } finally {
         if (var6 != null) {
            var6.dispose();
         }
      }

      return var5;
   }

   public final f2 n5(String var1, float var2, int var3) {
      com.aspose.slides.internal.w3.n5.n5(var1, "familyName");
      f2 var4 = new f2();
      z1 var5 = z1.n5(this.n5);

      try {
         n3 var6 = n3.n5(var1, var2, var3);

         try {
            var5.n5("QWERTYUIOPASDFGHJKLZXCVBNM ", var6).l6(var4);
         } finally {
            if (var6 != null) {
               var6.dispose();
            }
         }
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }

      float var15 = u3.l6(var4.l6() / "QWERTYUIOPASDFGHJKLZXCVBNM ".length());
      float var7 = u3.l6(var4.k5());
      return new f2(var15, var7);
   }

   private static f2 n5(z1 var0, String var1, n3 var2) {
      e5 var3 = new e5(e5.t2());
      y1 var4 = new y1(0.0F, 0.0F, 1000.0F, 1000.0F);
      com.aspose.slides.internal.o9b.u9[] var5 = new com.aspose.slides.internal.o9b.u9[]{new com.aspose.slides.internal.o9b.u9(0, var1.length())};
      var3.n5(var5);
      a0[] var6 = var0.n5(var1, var2, var4.y4(), var3);
      y1 var7 = var6[0].n5(var0).y4();
      float var8 = var7.x8();
      float var9 = var7.s7();
      return new f2(var9 - var8, var7.k5() - var7.n3());
   }
}
