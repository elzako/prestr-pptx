package com.aspose.slides.internal.s5;

import com.aspose.slides.internal.j7.n3;
import com.aspose.slides.internal.j9e.x8;
import com.aspose.slides.internal.o9b.p8;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.o5;

public class s7 {
   public static t4 n5() {
      return n3.n5("/Aspose/Foundation/Resources/NoImage.png");
   }

   public static byte[] l6() {
      t4 var0 = n5();

      try {
         return com.aspose.slides.internal.n2d.t4.l6(var0);
      } finally {
         if (var0 != null) {
            var0.dispose();
         }
      }
   }

   public static com.aspose.slides.internal.o9b.l6 n5(byte[] var0, y1 var1, float var2) {
      com.aspose.slides.internal.y6.l6 var3 = com.aspose.slides.internal.y6.l6.n5(new e2(var0));

      try {
         Object var4 = null;
         com.aspose.slides.internal.o1.u3 var5;
         if (var3.l6() == 1) {
            var5 = new com.aspose.slides.internal.o1.u3(
               com.aspose.slides.internal.o9b.c8.u3.o8(),
               new p8(com.aspose.slides.internal.v6g.k5.u3(var1.s7(), 13), com.aspose.slides.internal.v6g.k5.u3(var1.k5(), 13))
            );
         } else {
            var5 = new com.aspose.slides.internal.o1.u3(com.aspose.slides.internal.o9b.c8.u3.o8());
         }

         var5.n5(new o5<>(0));
         var5.l6(new o5<>(0));
         var5.k5(new o5<>(3));
         var5.u3(new o5<>(0));
         var5.a6(new o5<>(3));
         var5.u9(new o5<>(3));
         var5.h0(new o5<>(4));
         com.aspose.slides.internal.o1.k5 var6 = com.aspose.slides.internal.o1.k5.n5(var3, var5);
         return var6.n5(var1.s7() * var2, var1.k5() * var2);
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }

   public static byte[] l6(byte[] var0, y1 var1, float var2) {
      com.aspose.slides.internal.o9b.l6 var3 = n5(var0, var1.y4(), var2);

      try {
         e2 var4 = new e2();

         try {
            var3.n5(var4, x8.s7());
            return var4.toArray();
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }
   }
}
