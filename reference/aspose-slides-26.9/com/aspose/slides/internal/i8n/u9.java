package com.aspose.slides.internal.i8n;

import com.aspose.slides.internal.f4l.g7;
import com.aspose.slides.internal.f4l.j8;
import com.aspose.slides.internal.f4l.n1;
import com.aspose.slides.internal.f4l.s0;
import com.aspose.slides.internal.f4l.v3;
import com.aspose.slides.internal.f4l.v8;
import com.aspose.slides.internal.o9b.a0;

public class u9 {
   public static a0 n5(s0 var0) {
      a0 var1 = new a0();
      v8[] var2 = var0.l6();

      for (v8 var6 : var2) {
         a0 var7 = n5(var6);
         var1.u3(var7);
      }

      return var1;
   }

   private static a0 n5(v8 var0) {
      int var1 = var0.l6();
      n1 var2 = var0.n5();
      switch (var1) {
         case 1:
            return n5((v3)var2);
         case 2:
            return l6((v3)var2);
         case 3:
            return k5((v3)var2);
         case 4:
            return u3((v3)var2);
         case 5:
            return a6((v3)var2);
         case 268435456:
            j8 var3 = (j8)var2;
            return new a0(com.aspose.slides.internal.m0l.l6.n5(var3.n5()));
         case 268435457:
            g7 var4 = (g7)var2;
            return new a0(u3.n5(var4.n5()));
         case 268435458:
            a0 var5 = new a0();
            var5.u3();
            return var5;
         case 268435459:
         default:
            return new a0();
      }
   }

   private static a0 n5(v3 var0) {
      v8 var1 = var0.n5();
      v8 var2 = var0.l6();
      a0 var3 = n5(var1);
      var3.k5(n5(var2));
      return var3;
   }

   private static a0 l6(v3 var0) {
      v8 var1 = var0.n5();
      v8 var2 = var0.l6();
      a0 var3 = n5(var1);
      var3.u3(n5(var2));
      return var3;
   }

   private static a0 k5(v3 var0) {
      v8 var1 = var0.n5();
      v8 var2 = var0.l6();
      a0 var3 = n5(var1);
      var3.a6(n5(var2));
      return var3;
   }

   private static a0 u3(v3 var0) {
      v8 var1 = var0.n5();
      v8 var2 = var0.l6();
      a0 var3 = n5(var1);
      var3.l6(n5(var2));
      return var3;
   }

   private static a0 a6(v3 var0) {
      v8 var1 = var0.n5();
      v8 var2 = var0.l6();
      a0 var3 = n5(var1);
      var3.n5(n5(var2));
      return var3;
   }
}
