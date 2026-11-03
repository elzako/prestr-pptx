package com.aspose.slides.internal.e1x;

import com.aspose.slides.exceptions.ArgumentNullException;

public class x8 extends e2 {
   private static final x8 n5 = new x8();

   private x8() {
   }

   public final void n5(String[] var1, boolean var2) {
      if (var1 == null) {
         throw new ArgumentNullException("fontsFolders");
      }

      com.aspose.slides.internal.e1x.n5.l6().n5(var2);

      for (String var6 : var1) {
         com.aspose.slides.internal.e1x.n5.l6().n5(var6);
      }
   }

   public final String[] n5() {
      String[] var1 = com.aspose.slides.internal.e1x.n5.l6().a6();
      String[] var2 = f2.n5().a6();
      String[] var3 = new String[var1.length + var2.length];
      com.aspose.slides.ms.System.u3.n5((Object)(var1)).copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var3)), 0);
      com.aspose.slides.ms.System.u3.n5((Object)(var2)).copyTo(com.aspose.slides.ms.System.u3.n5((Object)(var3)), var1.length);
      return var3;
   }

   public final void l6() {
      com.aspose.slides.internal.e1x.n5.l6().n5();
   }

   @Override
   public i1 n5(String var1, int var2) {
      i1 var3 = com.aspose.slides.internal.e1x.n5.l6().n5(var1, var2);
      if (var3 == null) {
         var3 = f2.n5().n5(var1, var2);
      }

      return var3;
   }

   @Override
   public i1 n5(String var1, int var2, String var3) {
      i1 var4 = com.aspose.slides.internal.e1x.n5.l6().n5(var1, var2);
      if (var4 == null) {
         var4 = f2.n5().n5(var1, var2, var3);
      }

      return var4;
   }

   public final i1 k5() {
      return f2.n5().l6();
   }

   public static x8 u3() {
      return n5;
   }
}
