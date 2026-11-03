package com.aspose.slides.internal.h3d;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.SerializationException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.y8;

public final class u9 {
   public static Object[] n5(Object var0, com.aspose.slides.internal.p4l.e2[] var1) {
      if (var0 == null) {
         throw new ArgumentNullException("obj");
      }

      if (var1 == null) {
         throw new ArgumentNullException("members");
      }

      int var2 = var1.length;
      Object[] var3 = new Object[var2];

      for (int var4 = 0; var4 < var2; var4++) {
         com.aspose.slides.internal.p4l.e2 var5 = var1[var4];
         if (var5 == null) {
            throw new ArgumentNullException(d1.n5("members[{0}]", new Object[]{var4}));
         }

         if (var5.l6() != 4) {
            throw new SerializationException(d1.n5("members [{0}] is not a field.", new Object[]{var4}));
         }

         com.aspose.slides.internal.p4l.y4 var6 = var5 instanceof com.aspose.slides.internal.p4l.y4 ? (com.aspose.slides.internal.p4l.y4)var5 : null;
         var6.u3().setAccessible(true);
         var3[var4] = var6.n5(var0);
      }

      return var3;
   }

   public static com.aspose.slides.internal.p4l.e2[] n5(y8 var0, s3 var1) {
      if (var0 == null) {
         throw new ArgumentNullException("type");
      }

      ArrayList var2 = new ArrayList();
      y8 var3 = var0;
      String var4 = "";

      while (var3 != null) {
         if (!var3.d5()) {
            String var5 = d1.n5(d1.n5(new String[]{"Type {0} in assembly {1} is not ", "marked as serializable."}),new Object[]{ var3, var3.t4().l6()});
            throw new SerializationException(var5);
         }

         n5(var0, var3, var2);
         var3 = var3.n5();
         if (var3.equals(y8.k5) || var3.equals(y8.u3)) {
            break;
         }
      }

      com.aspose.slides.internal.p4l.e2[] var6 = new com.aspose.slides.internal.p4l.e2[var2.size()];
      var2.copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var6)));
      return var6;
   }

   private static void n5(y8 var0, y8 var1, ArrayList var2) {
      com.aspose.slides.internal.p4l.y4[] var3 = var1.l6(54);

      for (com.aspose.slides.internal.p4l.y4 var7 : var3) {
         if (!var7.c8()) {
            String var8 = "";
            if (!var0.k5(var1) && !var7.h0()) {
               var8 = var1.s7() + "+";
            }

            var2.addItem(new r4((com.aspose.slides.internal.p4l.j5)var7, var8));
         }
      }
   }

   public static Object n5(y8 var0) {
      if (var0 == null) {
         throw new ArgumentNullException("type");
      } else if (var0 == com.aspose.slides.internal.v6g.k5.n5(String.class)) {
         throw new ArgumentException("Uninitialized Strings cannot be created.");
      } else {
         return l6(var0);
      }
   }

   private static Object l6(y8 var0) {
      return com.aspose.slides.ms.System.k5.n5(var0);
   }
}
